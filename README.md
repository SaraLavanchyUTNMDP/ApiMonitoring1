# Browser and OS's Information Recolection API

## What's this program about?
an API thats recolect the information from wich browser and operative sistem the clients use the aplication that we want to monitor.

## Theoretical Questions
### Maven. 
#### Explain the nexts goals.
 * __mvn clean:__ Clean up target after the build. Deletes the target directory.
 * __mvn compile:__ Compiles Java source files.
 * __mvn package:__ Take the compiled code and package it in its distributable format, such as a JAR.
 * __mvn install:__ Install the package into the local repository, for use as a dependency in other projects locally.

#### Explain the nexts scopes.
Dependency scope is used to limit the transitivity of a dependency, and also to affect the classpath used for various build tasks.

* __compile:__ This is the default scope, used if none is specified. Compile dependencies are available in all classpaths of a project. Furthermore, those dependencies are propagated to dependent projects.
* __provided:__ This is much like compile, but indicates you expect the JDK or a container to provide the dependency at runtime. For example, when building a web application for the Java Enterprise Edition, you would set the dependency on the Servlet API and related Java EE APIs to scope provided because the web container provides those classes. This scope is only available on the compilation and test classpath, and is not transitive.
* __runtime:__ This scope indicates that the dependency is not required for compilation, but is for execution. It is in the runtime and test classpaths, but not the compile classpath.
* __test:__ This scope indicates that the dependency is not required for normal use of the application, and is only available for the test compilation and execution phases. This scope is not transitive.
* __system:__ This scope is similar to provided except that you have to provide the JAR which contains it explicitly. The artifact is always available and is not looked up in a repository.
* __import:__ This scope is only supported on a dependency of type pom in the <dependencyManagement> section. It indicates the dependency to be replaced with the effective list of dependencies in the specified POM's <dependencyManagement> section. Since they are replaced, dependencies with a scope of import do not actually participate in limiting the transitivity of a dependency.

#### Another Questions
1. What's an Arquetype? 
<br /> It's a toolkit of templates and is defined as an original pattern or model from which all other things of the same kind are made.

2. Define the basic structure of a maven's proyect
<br /> ![alt test](https://github.com/SaraLavanchyUTNMDP/ApiMonitoring1/blob/master/Maven-dirctory-structure.png?raw=true "maven basic structure")

3. Diferences of Archetype and Artifact
An archetype is a template that defines how the things of the same type that form part of this pattern will be done. For another way, an artifact is something that can be produced or used by a project at the same time or not. An artifact be related to an especific Archetype.

### Spring.
#### Explain the 4 basic's stereotypes and make a diagram of all of them.(@Component, @Repository, @Service, @Controller)
* __@Component:__ is the main stereotype, indicates that the annotation class is a component(or a bean of spring).
* __@Repository:__ indicates that the class is a DAO(data access objects)
* __@Service:__ indicates that the class is a bean of the bussiness layer.
* __@Controller:__ indicates that the class is a controller.
* __@Diagram:__
<br /> ![alt test](https://github.com/SaraLavanchyUTNMDP/ApiMonitoring1/blob/master/springAnnotationDiagram.png?raw=true "Spring Stereotypes diagram")

### Rest.
#### Explain each verbs.
``` POST: is used to create new resources. In other words, when creating a new resource, POST to the parent and the service takes care of associating the new resource with the parent, assigning an ID (new resource URI), etc.``` 
<br />
<br /> ``` GET: is used to read a representation of a resource. ```
<br />
<br /> ``` PUT:  is most-often utilized for update capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource.```
<br />``` However, PUT can also be used to create a resource in the case where the resource ID is chosen by the client instead of by the server.```
<br />
<br /> ``` PATCH: PATCH is used for modify capabilities. The difference with PUT is that the PATCH request only needs to contain the changes to the resource, not the complete resource.```
<br />
<br /> ``` DELETE:   It is used to delete a resource identified by a URI.```
 
