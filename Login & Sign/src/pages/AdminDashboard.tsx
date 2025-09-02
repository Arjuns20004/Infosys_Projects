import { useState } from "react";
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from "@/components/ui/card";
import { Badge } from "@/components/ui/badge";
import { Button } from "@/components/ui/button";
import { Table, TableBody, TableCell, TableHead, TableHeader, TableRow } from "@/components/ui/table";
import { Input } from "@/components/ui/input";
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from "@/components/ui/select";
import { ArrowLeft, Users, FileText, CheckCircle, Search, Filter } from "lucide-react";
import { useNavigate } from "react-router-dom";
import Layout from "@/components/Layout";

const AdminDashboard = () => {
  const navigate = useNavigate();
  const [searchTerm, setSearchTerm] = useState("");
  const [statusFilter, setStatusFilter] = useState("all");

  // Mock data for admin dashboard
  const users = [
    {
      id: 1,
      name: "John Smith",
      email: "john.smith@email.com",
      joinDate: "2023-12-15",
      activePolicies: 2,
      totalPremium: "$4,800",
      status: "active",
      lastApplication: "AI-2024-001",
      applicationStatus: "approved"
    },
    {
      id: 2,
      name: "Sarah Johnson",
      email: "sarah.j@email.com",
      joinDate: "2024-01-08",
      activePolicies: 1,
      totalPremium: "$3,600",
      status: "active",
      lastApplication: "HI-2024-002",
      applicationStatus: "pending"
    },
    {
      id: 3,
      name: "Mike Davis",
      email: "mike.davis@email.com",
      joinDate: "2023-11-20",
      activePolicies: 3,
      totalPremium: "$7,200",
      status: "active",
      lastApplication: "LI-2024-003",
      applicationStatus: "approved"
    },
    {
      id: 4,
      name: "Emily Wilson",
      email: "emily.w@email.com",
      joinDate: "2024-01-12",
      activePolicies: 0,
      totalPremium: "$0",
      status: "inactive",
      lastApplication: "HO-2024-004",
      applicationStatus: "rejected"
    },
    {
      id: 5,
      name: "Robert Brown",
      email: "robert.brown@email.com",
      joinDate: "2023-10-05",
      activePolicies: 1,
      totalPremium: "$2,400",
      status: "active",
      lastApplication: "AI-2024-005",
      applicationStatus: "under_review"
    }
  ];

  const stats = [
    { label: "Total Users", value: "156", change: "+12 this month", icon: Users },
    { label: "Active Policies", value: "342", change: "+28 this month", icon: FileText },
    { label: "Pending Reviews", value: "23", change: "Need attention", icon: CheckCircle },
    { label: "Monthly Premium", value: "$248,600", change: "+15% vs last month", icon: FileText },
  ];

  const getStatusBadge = (status: string) => {
    switch (status) {
      case "approved":
        return <Badge className="bg-green-100 text-green-800">Approved</Badge>;
      case "pending":
        return <Badge className="bg-yellow-100 text-yellow-800">Pending</Badge>;
      case "rejected":
        return <Badge className="bg-red-100 text-red-800">Rejected</Badge>;
      case "under_review":
        return <Badge className="bg-blue-100 text-blue-800">Under Review</Badge>;
      default:
        return <Badge variant="secondary">{status}</Badge>;
    }
  };

  const getUserStatusBadge = (status: string) => {
    return status === "active" ? (
      <Badge className="bg-green-100 text-green-800">Active</Badge>
    ) : (
      <Badge className="bg-gray-100 text-gray-800">Inactive</Badge>
    );
  };

  const filteredUsers = users.filter(user => {
    const matchesSearch = user.name.toLowerCase().includes(searchTerm.toLowerCase()) ||
                         user.email.toLowerCase().includes(searchTerm.toLowerCase());
    const matchesStatus = statusFilter === "all" || user.applicationStatus === statusFilter;
    return matchesSearch && matchesStatus;
  });

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
        </div>

        <div className="text-center space-y-2">
          <h1 className="text-3xl font-bold text-foreground">Admin Dashboard</h1>
          <p className="text-muted-foreground">
            Manage users, policies, and system overview
          </p>
        </div>

        {/* Stats Cards */}
        <div className="grid md:grid-cols-4 gap-6">
          {stats.map((stat, index) => (
            <Card key={index} className="glass-card">
              <CardContent className="p-6">
                <div className="flex items-center justify-between">
                  <div>
                    <div className="text-2xl font-bold text-primary mb-1">
                      {stat.value}
                    </div>
                    <div className="text-sm font-medium text-foreground mb-1">
                      {stat.label}
                    </div>
                    <div className="text-xs text-muted-foreground">
                      {stat.change}
                    </div>
                  </div>
                  <stat.icon className="h-8 w-8 text-muted-foreground" />
                </div>
              </CardContent>
            </Card>
          ))}
        </div>

        {/* Users Management */}
        <Card>
          <CardHeader>
            <CardTitle>User Management</CardTitle>
            <CardDescription>
              View and manage all users and their policy status
            </CardDescription>
          </CardHeader>
          <CardContent>
            {/* Filters */}
            <div className="flex flex-col sm:flex-row gap-4 mb-6">
              <div className="flex-1 relative">
                <Search className="absolute left-3 top-1/2 transform -translate-y-1/2 h-4 w-4 text-muted-foreground" />
                <Input
                  placeholder="Search users by name or email..."
                  value={searchTerm}
                  onChange={(e) => setSearchTerm(e.target.value)}
                  className="pl-10"
                />
              </div>
              <div className="flex items-center space-x-2">
                <Filter className="h-4 w-4 text-muted-foreground" />
                <Select value={statusFilter} onValueChange={setStatusFilter}>
                  <SelectTrigger className="w-[180px]">
                    <SelectValue placeholder="Filter by status" />
                  </SelectTrigger>
                  <SelectContent>
                    <SelectItem value="all">All Status</SelectItem>
                    <SelectItem value="approved">Approved</SelectItem>
                    <SelectItem value="pending">Pending</SelectItem>
                    <SelectItem value="under_review">Under Review</SelectItem>
                    <SelectItem value="rejected">Rejected</SelectItem>
                  </SelectContent>
                </Select>
              </div>
            </div>

            {/* Desktop Table */}
            <div className="hidden lg:block">
              <Table>
                <TableHeader>
                  <TableRow>
                    <TableHead>User</TableHead>
                    <TableHead>Status</TableHead>
                    <TableHead>Join Date</TableHead>
                    <TableHead>Active Policies</TableHead>
                    <TableHead>Total Premium</TableHead>
                    <TableHead>Last Application</TableHead>
                    <TableHead>App Status</TableHead>
                  </TableRow>
                </TableHeader>
                <TableBody>
                  {filteredUsers.map((user) => (
                    <TableRow key={user.id}>
                      <TableCell>
                        <div>
                          <div className="font-medium">{user.name}</div>
                          <div className="text-sm text-muted-foreground">{user.email}</div>
                        </div>
                      </TableCell>
                      <TableCell>
                        {getUserStatusBadge(user.status)}
                      </TableCell>
                      <TableCell>
                        {new Date(user.joinDate).toLocaleDateString()}
                      </TableCell>
                      <TableCell>{user.activePolicies}</TableCell>
                      <TableCell>{user.totalPremium}</TableCell>
                      <TableCell className="font-medium">
                        {user.lastApplication}
                      </TableCell>
                      <TableCell>
                        {getStatusBadge(user.applicationStatus)}
                      </TableCell>
                    </TableRow>
                  ))}
                </TableBody>
              </Table>
            </div>

            {/* Mobile Cards */}
            <div className="lg:hidden space-y-4">
              {filteredUsers.map((user) => (
                <Card key={user.id}>
                  <CardContent className="p-4">
                    <div className="flex justify-between items-start mb-3">
                      <div>
                        <h3 className="font-semibold">{user.name}</h3>
                        <p className="text-sm text-muted-foreground">{user.email}</p>
                      </div>
                      {getUserStatusBadge(user.status)}
                    </div>
                    <div className="grid grid-cols-2 gap-2 text-sm mb-3">
                      <div>
                        <span className="text-muted-foreground">Policies:</span>
                        <br />
                        {user.activePolicies}
                      </div>
                      <div>
                        <span className="text-muted-foreground">Premium:</span>
                        <br />
                        {user.totalPremium}
                      </div>
                      <div>
                        <span className="text-muted-foreground">Last App:</span>
                        <br />
                        {user.lastApplication}
                      </div>
                      <div>
                        <span className="text-muted-foreground">Status:</span>
                        <br />
                        {getStatusBadge(user.applicationStatus)}
                      </div>
                    </div>
                  </CardContent>
                </Card>
              ))}
            </div>

            {filteredUsers.length === 0 && (
              <div className="text-center py-8">
                <p className="text-muted-foreground">No users found matching your criteria.</p>
              </div>
            )}
          </CardContent>
        </Card>
      </div>
    </Layout>
  );
};

export default AdminDashboard;