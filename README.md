#Spring Boot Book Seller

### Endpoints

#### Sing-up

POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 84

{
    "name" : "kerem",
    "username" : "test",
    "password" : "test"
}

#### Sing-in

POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 61

{
    "username" : "test",
    "password" : "test"
}
