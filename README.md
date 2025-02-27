# EventSphere

## 🚀 Project Overview
EventSphere is an event management platform where organizers can create events, manage applications for attendees, speakers, crew and send notifications based on application status.

### **Features**
- ✅ Event Creation & Management
- ✅ Role-based Forms (Attendees, Crew, Speakers, Organizer)
- ✅ Application Review & Approval
- ✅ Email Notifications
- ✅ Secure Access with Role-Based Authentication

---

## 🛠 Installation & Setup

### **Prerequisites**
- Java 17+
- Spring Boot 3+
- PostgreSQL
- Node.js 18+ (for frontend)
- Docker (optional for containerization)

### **Fork & Clone the Repository**
```bash
git clone https://github.com/your-repo/Smart-EventSphere.git
cd Smart-EventSphere
```

### **Backend Setup**
1. **Configure `.env` File** (For sensitive configurations like database and email settings)  
   Create a `.env` file in the backend root directory and add:
   ```ini
   DATABASE_URL=jdbc:postgresql://localhost:5432/eventsphere
   DATABASE_USERNAME=your_username
   DATABASE_PASSWORD=your_password
   ```

2. **Build & Run the Application**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
---

## 🛠 Technologies Used

### **Backend:**
- **Spring Boot 3** - REST API
- **Spring Security** - Authentication & RBAC
- **PostgreSQL** - Database
- **Docker** - Containerization
- **Swagger (SpringDoc OpenAPI)** - API Documentation

### **Frontend:**
- **Angular** - UI Framework
- **MVC** - Architecture
- **TailwindCSS** - Styling

---

## 👥 Contributors & Contact Info
| Name       | Role             | Contact |
|------------|----------------|---------|
| Nitin Batra | Full Stack    | [LinkedIn](https://linkedin.com/in/thisisbatra) |
| Ajay Gour | Backend Lead   | [LinkedIn](https://linkedin.com/in/ajgour) |

For queries, raise an issue in the repo or contact at:
📧 **Email**: batranitin118@gmail.com | ajgour14@gmail.com
