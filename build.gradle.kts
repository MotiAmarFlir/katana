import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    kotlin("jvm") version "1.2.71" apply false
    `maven-publish`
}

allprojects {
    group = "org.rewedigital.katana"
    version = "1.0"

    repositories {
        jcenter()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.6"
    }
}

subprojects {
    apply {
        plugin("org.gradle.maven-publish")
    }

    publishing {
        repositories {
            maven {
                // TODO
            }
        }
    }
}