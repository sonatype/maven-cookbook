import java.io.{File,  PrintWriter, FileWriter};
import scalax.io.FileExtras;
import scala.collection.mutable.HashSet;

val outputDir = project.getBuild().getOutputDirectory();
val depsFile = new FileExtras( new File( outputDir, "deps.txt" ) );
val pw = depsFile.printWriter;
val depSet = new HashSet[String];
for( d <- project.getDependencies() ) {
  depSet += d.getGroupId + ":" + d.getArtifactId + ":" + d.getVersion;
}
pw.writeLines( depSet.toSeq );

