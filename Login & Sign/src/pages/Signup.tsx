import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Label } from "@/components/ui/label";
import {
  Card,
  CardContent,
  CardDescription,
  CardHeader,
  CardTitle,
} from "@/components/ui/card";
import { Shield } from "lucide-react";
import { useToast } from "@/hooks/use-toast";
import authBackground from "@/assets/auth-background.jpg";

const Signup = () => {
  const [formData, setFormData] = useState({
    name: "",
    email: "",
    password: "",
    confirmPassword: "",
  });
  const navigate = useNavigate();
  const { toast } = useToast();

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();

    if (
      !formData.name ||
      !formData.email ||
      !formData.password ||
      !formData.confirmPassword
    ) {
      toast({
        variant: "destructive",
        title: "Error",
        description: "Please fill in all fields.",
      });
      return;
    }

    if (formData.password !== formData.confirmPassword) {
      toast({
        variant: "destructive",
        title: "Error",
        description: "Passwords do not match.",
      });
      return;
    }

    if (formData.password.length < 6) {
      toast({
        variant: "destructive",
        title: "Error",
        description: "Password must be at least 6 characters long.",
      });
      return;
    }

    toast({
      title: "Account created successfully",
      description: "Welcome to InsureFlow! Please sign in.",
    });
    navigate("/login");
  };

  return (
    <div
      className="min-h-screen flex items-center justify-center bg-cover bg-center bg-no-repeat relative"
      style={{ backgroundImage: `url(${authBackground})` }}
    >
      {/* Overlay */}
      <div className="absolute inset-0 bg-auth"></div>

      {/* Content */}
      <div className="relative z-10 w-full max-w-md p-6">
        <Card className="glass-card border-0">
          <CardHeader className="text-center">
            <div className="flex justify-center mb-4">
              <Shield className="h-12 w-12 text-primary" />
            </div>
            <CardTitle className="text-2xl font-bold text-black">
              Create Account
            </CardTitle>
            <CardDescription className="text-black/80">
              Join InsureFlow to manage your policies
            </CardDescription>
          </CardHeader>
          <CardContent>
            <form onSubmit={handleSubmit} className="space-y-4">
              <div className="space-y-2">
                <Label htmlFor="name" className="text-black">
                  Full Name
                </Label>
                <Input
                  id="name"
                  name="name"
                  type="text"
                  variant="auth"
                  className="text-black placeholder:text-gray-500"
                  value={formData.name}
                  onChange={handleInputChange}
                  placeholder="Enter your full name"
                />
              </div>
              <div className="space-y-2">
                <Label htmlFor="email" className="text-black">
                  Email
                </Label>
                <Input
                  id="email"
                  name="email"
                  type="email"
                  variant="auth"
                  className="text-black placeholder:text-gray-500"
                  value={formData.email}
                  onChange={handleInputChange}
                  placeholder="Enter your email"
                />
              </div>
              <div className="space-y-2">
                <Label htmlFor="password" className="text-black">
                  Password
                </Label>
                <Input
                  id="password"
                  name="password"
                  type="password"
                  variant="auth"
                  className="text-black placeholder:text-gray-500"
                  value={formData.password}
                  onChange={handleInputChange}
                  placeholder="Create a password"
                />
              </div>
              <div className="space-y-2">
                <Label htmlFor="confirmPassword" className="text-black">
                  Confirm Password
                </Label>
                <Input
                  id="confirmPassword"
                  name="confirmPassword"
                  type="password"
                  variant="auth"
                  className="text-black placeholder:text-gray-500"
                  value={formData.confirmPassword}
                  onChange={handleInputChange}
                  placeholder="Confirm your password"
                />
              </div>
              <Button
                type="submit"
                className="w-full bg-white text-primary hover:bg-white/90 font-semibold"
              >
                Create Account
              </Button>
            </form>
            <div className="mt-6 text-center">
              <p className="text-black/80">
                Already have an account?{" "}
                <Link
                  to="/login"
                  className="text-black font-semibold hover:underline"
                >
                  Sign in
                </Link>
              </p>
            </div>
          </CardContent>
        </Card>
      </div>
    </div>
  );
};

export default Signup;
