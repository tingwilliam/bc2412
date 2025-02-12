#Spring Boot

## Basic Concepts/ Skills
-1. Spring Context _> Store Beans
  - Who create Bean? Befroe server start, " Spring Manager" manages bean cycle.
  - Bean Cycle: @SpringBootApplication -> @ComponentScan, i.e. Find any class contain @Controller, 
  @Service, @ Configuration, @Repository
  - "Spring Manager" creates objects for the above classes, out them into Spring Context (Beans)
-2. Get Beans from Context
  - @Autowired on Class Attribute (Field Injection)
    - " Spring Manager" resolve this dependency by finding an appropriate object fit into the attribute type
  - @Autowired on Constructor (Constructor Injection)
-3. Flow
  - Controller Bean always @Autowired Service Bean
  - Service Bean always @Autowired Repository Bean
  - If "Spring manager" cannot find any dependency, server start will fail.
-4. RESTful API (GET/POST/DELETE/PUT/PATCH)
  - GET: Without create, update or delete on resource
  - POST: Create resource ONLY.
  - DELETE: Delete resource ONLY (by id, or other resource attribute)
  - PUT: Make sure target resource already exists (Find by id). Then replace the resource by the new
  resource directly.
  - PATCH: Make sure target resource already exists (Find by id). Then revise the target object attribute, 
  but not replace the object.

  ## Spring Boot Project Development
- Create project by VSCode. Add dependencies for your scenario.
- After project creation, restart the VSCode.
- Check pom.xml and application.yml
- If you need add/remove dependency, restart VSCode.
- Create controller folder
  - inside the folder, create interface (XXXXOperation.java)
  - create impl folder, create implementation class for the interface.
- When Controller @Autowired Service, remember to use service interface, but not implementation class
- test "mvn clean install"

