import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Label } from "@/components/ui/label";
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from "@/components/ui/card";
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from "@/components/ui/select";
import { FileText, ArrowLeft } from "lucide-react";
import { useToast } from "@/hooks/use-toast";
import Layout from "@/components/Layout";

const ApplyPolicy = () => {
  const [formData, setFormData] = useState({
    policyType: "",
    duration: "",
    premiumAmount: "",
  });
  const navigate = useNavigate();
  const { toast } = useToast();

  const policyTypes = [
    { value: "auto", label: "Auto Insurance" },
    { value: "health", label: "Health Insurance" },
    { value: "home", label: "Home Insurance" },
    { value: "life", label: "Life Insurance" },
    { value: "business", label: "Business Insurance" },
  ];

  const durations = [
    { value: "6months", label: "6 Months" },
    { value: "1year", label: "1 Year" },
    { value: "2years", label: "2 Years" },
    { value: "5years", label: "5 Years" },
    { value: "10years", label: "10 Years" },
  ];

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  const handleSelectChange = (name: string, value: string) => {
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    
    if (!formData.policyType || !formData.duration || !formData.premiumAmount) {
      toast({
        variant: "destructive",
        title: "Error",
        description: "Please fill in all fields.",
      });
      return;
    }

    // Simulate application submission
    toast({
      title: "Application Submitted Successfully",
      description: "Your insurance application has been submitted for review. You'll receive an update within 48 hours.",
    });
    
    navigate("/application-status");
  };

  return (
    <Layout>
      <div className="max-w-2xl mx-auto space-y-6">
        <div className="flex items-center space-x-4">
          <Button
            variant="outline"
            size="sm"
            onClick={() => navigate("/dashboard")}
            className="flex items-center space-x-2"
          >
            <ArrowLeft className="h-4 w-4" />
            <span>Back to Dashboard</span>
          </Button>
        </div>

        <Card>
          <CardHeader className="text-center">
            <div className="flex justify-center mb-4">
              <FileText className="h-12 w-12 text-primary" />
            </div>
            <CardTitle className="text-2xl">Apply for Insurance Policy</CardTitle>
            <CardDescription>
              Fill out the form below to submit your insurance application
            </CardDescription>
          </CardHeader>
          <CardContent>
            <form onSubmit={handleSubmit} className="space-y-6">
              <div className="space-y-2">
                <Label htmlFor="policyType">Policy Type</Label>
                <Select onValueChange={(value) => handleSelectChange("policyType", value)}>
                  <SelectTrigger>
                    <SelectValue placeholder="Select a policy type" />
                  </SelectTrigger>
                  <SelectContent>
                    {policyTypes.map((type) => (
                      <SelectItem key={type.value} value={type.value}>
                        {type.label}
                      </SelectItem>
                    ))}
                  </SelectContent>
                </Select>
              </div>

              <div className="space-y-2">
                <Label htmlFor="duration">Policy Duration</Label>
                <Select onValueChange={(value) => handleSelectChange("duration", value)}>
                  <SelectTrigger>
                    <SelectValue placeholder="Select policy duration" />
                  </SelectTrigger>
                  <SelectContent>
                    {durations.map((duration) => (
                      <SelectItem key={duration.value} value={duration.value}>
                        {duration.label}
                      </SelectItem>
                    ))}
                  </SelectContent>
                </Select>
              </div>

              <div className="space-y-2">
                <Label htmlFor="premiumAmount">Premium Amount ($)</Label>
                <Input
                  id="premiumAmount"
                  name="premiumAmount"
                  type="number"
                  value={formData.premiumAmount}
                  onChange={handleInputChange}
                  placeholder="Enter desired premium amount"
                  min="0"
                  step="0.01"
                />
                <p className="text-sm text-muted-foreground">
                  This is your desired premium amount. Final amount will be determined after review.
                </p>
              </div>

              <div className="pt-4">
                <Button type="submit" className="w-full" size="lg">
                  Submit Application
                </Button>
              </div>
            </form>

            <div className="mt-6 p-4 bg-muted/50 rounded-lg">
              <h4 className="font-semibold mb-2">What happens next?</h4>
              <ul className="text-sm text-muted-foreground space-y-1">
                <li>• Your application will be reviewed within 24-48 hours</li>
                <li>• You'll receive an email confirmation shortly</li>
                <li>• Additional documents may be requested if needed</li>
                <li>• Final approval and policy issuance typically takes 3-5 business days</li>
              </ul>
            </div>
          </CardContent>
        </Card>
      </div>
    </Layout>
  );
};

export default ApplyPolicy;