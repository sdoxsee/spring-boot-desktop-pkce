# spring-boot-desktop-pkce

## quick start

1. `mvn spring-boot:run`
2. http://localhost:8080 will force redirect to AAD
3. once login is complete, AAD redirects us back to our local web app, we print the token to the console and return an index.html that should auto-close the tab

oauth2 credentials are baked in (no secret because public client)
