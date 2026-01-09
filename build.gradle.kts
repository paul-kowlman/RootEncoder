allprojects {
  group = "com.github.paul-kowlman"
}

plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.android.library) apply false
  alias(libs.plugins.jetbrains.kotlin) apply false
  alias(libs.plugins.jetbrains.dokka) apply true
}

dependencies {
  dokka(project(":common"))
  dokka(project(":encoder"))
  dokka(project(":extra-sources"))
  dokka(project(":library"))
  dokka(project(":rtmp"))
  dokka(project(":rtsp"))
  dokka(project(":srt"))
  dokka(project(":udp"))
}

tasks.named<org.jetbrains.dokka.gradle.tasks.DokkaGeneratePublicationTask>("dokkaGeneratePublicationHtml") {
  outputDirectory.set(layout.projectDirectory.dir("docs"))
}