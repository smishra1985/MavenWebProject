node {
   echo 'Hello Sourabh Mishra'
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
   checkout https://github.com/smishra1985/MavenWebProject.git

   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.
   def mvnHome = tool 'localMaven'

   // Mark the code build 'stage'....
   stage 'Build'
   // Run the maven build
   sh "${mvnHome}/bin/mvn clean install"
}
