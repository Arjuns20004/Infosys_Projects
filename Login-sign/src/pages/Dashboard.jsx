import { Card, CardContent, CardDescription, CardHeader, CardTitle } from "@/components/ui/card";
import { Button } from "@/components/ui/button";
import { Link } from "react-router-dom";
import { Shield, FileText, CheckCircle, Settings, ArrowRight } from "lucide-react";
import Layout from "@/components/Layout";

const Dashboard = () => {
  const quickActions = [
    {
      title: "Apply for Policy",
      description: "Submit a new insurance application",
      icon: FileText,
      link: "/apply-policy",
      color: "text-blue-600",
    },
    {
      title: "Check Status",
      description: "View your application status",
      icon: CheckCircle,
      link: "/application-status",
      color: "text-green-600",
    },
    {
      title: "Admin Panel",
      description: "Manage users and policies",
      icon: Settings,
      link: "/admin-dashboard",
      color: "text-purple-600",
    },
  ];

  const stats = [
    { label: "Active Policies", value: "3", change: "+2 this month" },
    { label: "Pending Applications", value: "1", change: "Review in progress" },
    { label: "Total Coverage", value: "$125,000", change: "+$25,000 this year" },
  ];

  return (
    <Layout>
      <div className="space-y-8">
        {/* Welcome Section */}
        <div className="text-center space-y-4">
          <div className="flex justify-center">
            <Shield className="h-16 w-16 text-primary" />
          </div>
          <h1 className="text-4xl font-bold text-foreground">
            Welcome to Your Dashboard
          </h1>
          <p className="text-xl text-muted-foreground max-w-2xl mx-auto">
            Manage your insurance policies, track applications, and access all your coverage information in one place.
          </p>
        </div>

        {/* Stats Cards */}
        <div className="grid md:grid-cols-3 gap-6">
          {stats.map((stat, index) => (
            <Card key={index} className="glass-card">
              <CardContent className="p-6">
                <div className="text-2xl font-bold text-primary mb-1">
                  {stat.value}
                </div>
                <div className="text-sm font-medium text-foreground mb-1">
                  {stat.label}
                </div>
                <div className="text-xs text-muted-foreground">
                  {stat.change}
                </div>
              </CardContent>
            </Card>
          ))}
        </div>

        {/* Quick Actions */}
        <div className="space-y-6">
          <h2 className="text-2xl font-semibold text-foreground">Quick Actions</h2>
          <div className="grid md:grid-cols-3 gap-6">
            {quickActions.map((action, index) => (
              <Card key={index} className="transition-smooth hover:shadow-medium cursor-pointer group">
                <CardHeader>
                  <div className={`${action.color} mb-2`}>
                    <action.icon className="h-8 w-8" />
                  </div>
                  <CardTitle className="text-lg group-hover:text-primary transition-smooth">
                    {action.title}
                  </CardTitle>
                  <CardDescription>
                    {action.description}
                  </CardDescription>
                </CardHeader>
                <CardContent>
                  <Button asChild className="w-full group">
                    <Link to={action.link} className="flex items-center justify-center space-x-2">
                      <span>Get Started</span>
                      <ArrowRight className="h-4 w-4 group-hover:translate-x-1 transition-smooth" />
                    </Link>
                  </Button>
                </CardContent>
              </Card>
            ))}
          </div>
        </div>

        {/* Recent Activity */}
        <Card>
          <CardHeader>
            <CardTitle>Recent Activity</CardTitle>
            <CardDescription>Your latest insurance activities and updates</CardDescription>
          </CardHeader>
          <CardContent>
            <div className="space-y-4">
              <div className="flex items-center space-x-4 p-4 border rounded-lg">
                <CheckCircle className="h-5 w-5 text-green-600" />
                <div className="flex-1">
                  <p className="font-medium">Auto Insurance Application Approved</p>
                  <p className="text-sm text-muted-foreground">Policy #AI-2024-001 - 2 days ago</p>
                </div>
              </div>
              <div className="flex items-center space-x-4 p-4 border rounded-lg">
                <FileText className="h-5 w-5 text-blue-600" />
                <div className="flex-1">
                  <p className="font-medium">Health Insurance Application Submitted</p>
                  <p className="text-sm text-muted-foreground">Application #HI-2024-002 - 1 week ago</p>
                </div>
              </div>
              <div className="flex items-center space-x-4 p-4 border rounded-lg">
                <Shield className="h-5 w-5 text-purple-600" />
                <div className="flex-1">
                  <p className="font-medium">Home Insurance Policy Renewed</p>
                  <p className="text-sm text-muted-foreground">Policy #HO-2023-005 - 2 weeks ago</p>
                </div>
              </div>
            </div>
          </CardContent>
        </Card>
      </div>
    </Layout>
  );
};

export default Dashboard;