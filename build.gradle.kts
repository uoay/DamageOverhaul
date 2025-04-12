plugins {
    id("fabric-loom") version "1.10-SNAPSHOT"
}

version = project.properties["mod_version"].toString()

base {
    archivesName = project.properties["archives_base_name"].toString()
}

repositories {
    maven {
        name = "Terraformers"
        url = uri("https://maven.terraformersmc.com/")
    }
    maven { url = uri("https://maven.shedaniel.me/") }
}

loom {
    splitEnvironmentSourceSets()

    mods {
        create(base.archivesName.get()) {
            sourceSet(sourceSets["main"])
            sourceSet(sourceSets["client"])
        }
    }
}

dependencies {
    minecraft("com.mojang:minecraft:${project.properties["minecraft_version"]}")
    mappings("net.fabricmc:yarn:${project.properties["yarn_mappings"]}:v2")
    modImplementation("net.fabricmc:fabric-loader:${project.properties["loader_version"]}")

    modImplementation("net.fabricmc.fabric-api:fabric-api:${project.properties["fabric_api"]}")
    modApi("com.terraformersmc:modmenu:${project.properties["modmenu"]}")
    modApi("me.shedaniel.cloth:cloth-config-fabric:${project.properties["cloth_config"]}")
}

fabricApi {
    configureDataGeneration {
        client = true
        createSourceSet = true
        modId = "damage_overhaul-datagen"
    }
}

java {
    withSourcesJar()

    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

tasks {
    "sourcesJar" {
        dependsOn("runDatagen")
    }

    processResources {
        inputs.property("version", project.version)

        filesMatching("fabric.mod.json") {
            expand("version" to inputs.properties["version"])
        }
    }

    withType<JavaCompile> {
        options.release.set(21)
    }

    jar {
        from("LICENSE.md", "COPYING", "COPYING.LESSER")
    }
}
