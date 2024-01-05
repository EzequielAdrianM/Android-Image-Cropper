pluginManagement {
  repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
    maven { url = uri("https://jitpack.io") }
  }
}

include(":cropper")
include(":sample")
