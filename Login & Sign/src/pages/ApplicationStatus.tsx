import { Card, CardContent, CardDescription, CardHeader, CardTitle } from "@/components/ui/card";
import { Badge } from "@/components/ui/badge";
import { Button } from "@/components/ui/button";
import { Table, TableBody, TableCell, TableHead, TableHeader, TableRow } from "@/components/ui/table";
import { ArrowLeft, CheckCircle, Clock, XCircle, Eye } from "lucide-react";
import { useNavigate } from "react-router-dom";
import Layout from "@/components/Layout";

const ApplicationStatus = () => {
  const navigate = useNavigate();

  // Mock data for applications
  const applications = [
    {
      id: "AI-2024-001",
      policyType: "Auto Insurance",
      submittedDate: "2024-01-15",
      status: "approved",
      premiumAmount: "$1,200",
      duration: "1 Year",
    },
    {
      id: "HI-2024-002",
      policyType: "Health Insurance",
      submittedDate: "2024-01-10",
      status: "pending",
      premiumAmount: "$3,600",
      duration: "1 Year",
    },
    {
      id: "LI-2024-003",
      policyType: "Life Insurance",
      submittedDate: "2024-01-05",
      status: "rejected",
      premiumAmount: "$2,400",
      duration: "5 Years",
    },
    {
      id: "HO-2024-004",
      policyType: "Home Insurance",
      submittedDate: "2024-01-20",
      status: "under_review",
      premiumAmount: "$1,800",
      duration: "1 Year",
    },
  ];

  const getStatusBadge = (status: string) => {
    switch (status) {
      case "approved":
        return (
          <Badge className="bg-green-100 text-green-800 hover:bg-green-100">
            <CheckCircle className="h-3 w-3 mr-1" />
            Approved
          </Badge>
        );
      case "pending":
        return (
          <Badge className="bg-yellow-100 text-yellow-800 hover:bg-yellow-100">
            <Clock className="h-3 w-3 mr-1" />
            Pending
          </Badge>
        );
      case "rejected":
        return (
          <Badge className="bg-red-100 text-red-800 hover:bg-red-100">
            <XCircle className="h-3 w-3 mr-1" />
            Rejected
          </Badge>
        );
      case "under_review":
        return (
          <Badge className="bg-blue-100 text-blue-800 hover:bg-blue-100">
            <Eye className="h-3 w-3 mr-1" />
            Under Review
          </Badge>
        );
      default:
        return <Badge variant="secondary">{status}</Badge>;
    }
  };

  const getStatusDescription = (status: string) => {
    switch (status) {
      case "approved":
        return "Your application has been approved. Policy documents will be sent via email.";
      case "pending":
        return "Your application is being processed. We'll update you within 48 hours.";
      case "rejected":
        return "Application was not approved. Contact support for more information.";
      case "under_review":
        return "Our team is currently reviewing your application and may request additional documents.";
      default:
        return "Status information unavailable.";
    }
  };

  return (
    <Layout>
      <div className="space-y-6">
        <div className="flex items-center justify-between">
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
          <Button onClick={() => navigate("/apply-policy")}>
            Apply for New Policy
          </Button>
        </div>

        <div className="text-center space-y-2">
          <h1 className="text-3xl font-bold text-foreground">Application Status</h1>
          <p className="text-muted-foreground">
            Track the progress of your insurance applications
          </p>
        </div>

        <Card>
          <CardHeader>
            <CardTitle>Your Applications</CardTitle>
            <CardDescription>
              View the status and details of all your submitted insurance applications
            </CardDescription>
          </CardHeader>
          <CardContent>
            <div className="space-y-6">
              {/* Desktop Table View */}
              <div className="hidden md:block">
                <Table>
                  <TableHeader>
                    <TableRow>
                      <TableHead>Application ID</TableHead>
                      <TableHead>Policy Type</TableHead>
                      <TableHead>Submitted Date</TableHead>
                      <TableHead>Status</TableHead>
                      <TableHead>Premium Amount</TableHead>
                      <TableHead>Duration</TableHead>
                    </TableRow>
                  </TableHeader>
                  <TableBody>
                    {applications.map((application) => (
                      <TableRow key={application.id}>
                        <TableCell className="font-medium">
                          {application.id}
                        </TableCell>
                        <TableCell>{application.policyType}</TableCell>
                        <TableCell>
                          {new Date(application.submittedDate).toLocaleDateString()}
                        </TableCell>
                        <TableCell>
                          {getStatusBadge(application.status)}
                        </TableCell>
                        <TableCell>{application.premiumAmount}</TableCell>
                        <TableCell>{application.duration}</TableCell>
                      </TableRow>
                    ))}
                  </TableBody>
                </Table>
              </div>

              {/* Mobile Card View */}
              <div className="md:hidden space-y-4">
                {applications.map((application) => (
                  <Card key={application.id}>
                    <CardContent className="p-4">
                      <div className="flex justify-between items-start mb-3">
                        <div>
                          <h3 className="font-semibold">{application.policyType}</h3>
                          <p className="text-sm text-muted-foreground">
                            ID: {application.id}
                          </p>
                        </div>
                        {getStatusBadge(application.status)}
                      </div>
                      <div className="grid grid-cols-2 gap-2 text-sm">
                        <div>
                          <span className="text-muted-foreground">Submitted:</span>
                          <br />
                          {new Date(application.submittedDate).toLocaleDateString()}
                        </div>
                        <div>
                          <span className="text-muted-foreground">Premium:</span>
                          <br />
                          {application.premiumAmount}
                        </div>
                      </div>
                      <div className="mt-3 p-2 bg-muted/50 rounded text-sm">
                        {getStatusDescription(application.status)}
                      </div>
                    </CardContent>
                  </Card>
                ))}
              </div>
            </div>
          </CardContent>
        </Card>

        {/* Summary Stats */}
        <div className="grid md:grid-cols-4 gap-4">
          <Card>
            <CardContent className="p-4 text-center">
              <div className="text-2xl font-bold text-green-600">
                {applications.filter(app => app.status === 'approved').length}
              </div>
              <div className="text-sm text-muted-foreground">Approved</div>
            </CardContent>
          </Card>
          <Card>
            <CardContent className="p-4 text-center">
              <div className="text-2xl font-bold text-yellow-600">
                {applications.filter(app => app.status === 'pending').length}
              </div>
              <div className="text-sm text-muted-foreground">Pending</div>
            </CardContent>
          </Card>
          <Card>
            <CardContent className="p-4 text-center">
              <div className="text-2xl font-bold text-blue-600">
                {applications.filter(app => app.status === 'under_review').length}
              </div>
              <div className="text-sm text-muted-foreground">Under Review</div>
            </CardContent>
          </Card>
          <Card>
            <CardContent className="p-4 text-center">
              <div className="text-2xl font-bold text-red-600">
                {applications.filter(app => app.status === 'rejected').length}
              </div>
              <div className="text-sm text-muted-foreground">Rejected</div>
            </CardContent>
          </Card>
        </div>
      </div>
    </Layout>
  );
};

export default ApplicationStatus;