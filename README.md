order service
port 8082
get / post orders
product id refers to product thats owned by the catalog service
no network calls between the catalog and order service exists yet.
https://github.com/DanielMaku/CICDcatservicelab1.git

https://dbfiddle.uk/uud7mByd

1. because maven is what compiles the java application
2. the container is the real running application created from the image
3. it maps the window port to the container port. expose alone doesnt publish it to windows
4. because localhost refers to the contain order itself.
5. because it uses persistent storage. in h2 the database would lose its data