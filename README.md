Babel
=====
Babel is a simple system to manage Localization for a product. Babel allows developers to keep track of all of the different strings that need to be translated for a project.
Once translation is complete, Babel can export the translations as a complete bundle file that's importable into the application.

Concepts
========
Babel centers around a few very simple concepts that are crucial to Localization:

* __Languages/Dialects__ - Languages are the various ways of communicating across the world. You are reading this in the English language. 
    Dialects represent the differences in the same Language (e.g. English in the US compared to English in the UK).
* __Strings__ - Strings are the various blurbs of data in a particular Language that must be translated into another Language.
    Strings can be as small as a character or word or as large a paragraph or page.
* __Translations__ - Translations represent the process of defining a String in a different Language.
    When performing a Translation, there is always a context Language, which is the base language (e.g. translating into Spanish from Enlgish).
* __Projects__ - Projects represent all of the Strings that are specific to a certain system or application.  Projects can be thought of as a set.
    Projects represent the set of all Strings available in the Languages defined for that Project (e.g. a Project may support English, Spanish and Japanese).

Colophon
========
Babel is an application that is designed to simply be dropped into a Servlet container from the bundled WAR file.  Babel uses the following libraries and components:

* Language: __[Java](http://www.oracle.com/technetwork/java/index.html)__
* Build Tool: __[Maven](http://maven.apache.org)__
* ORM: __[Hibernate](http://www.hibernate.org/)__  
* Web Framework: __[Spring Framework](http://projects.spring.io/spring-framework/)__
* DB Migrations: __[Flyway DB](http://flywaydb.org)__
