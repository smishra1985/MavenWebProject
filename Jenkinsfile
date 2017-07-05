node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
    git 'https://github.com/smishra1985/MavenWebProject.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      
      check = isUnix();
      
      echo " value of $check";
      
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Results') {
      archive 'target/*.war'
   }
}
