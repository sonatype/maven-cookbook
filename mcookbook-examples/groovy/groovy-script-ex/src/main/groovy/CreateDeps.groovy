def depFile = new File(project.build.outputDirectory, 
              'deps.txt')

project.dependencies.each() {
  depFile.write("${it.groupId}:${it.artifactId}:${it.version}")
}
