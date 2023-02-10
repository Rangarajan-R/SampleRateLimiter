You can start the appication as a spring boot application and it will run on localhost:8080

# There are two APIs added as part of this project

1. localhost:8080/api/users(Get)

    It will display all the users available in the repository
    Rate Limit: Specific config to this api rate limit with limitForPeriod:1 and limitRefreshPeriod:10s 
    
2. localhost:8080/api/user/greet/{name} (Get) --Here name is a path variable
    
    It will greet the user with the  welcome note.
    Rate Limit: It will uses the default api rate limit limitForPeriod:2 and limitRefreshPeriod:10s
    
    Dependency Used: resilience4j-spring-boot2



