plugins {
    java
}

group = "io.hexora.plotplus"
version = "1.0.0"

val serverVersion = "2026.02.17-255364b8e"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://maven.hytale.com/release")
    maven("https://maven.hytale.com/pre-release")
    maven("https://repo.codemc.io/repository/creatorfromhell/")
}

dependencies {
    compileOnly("com.hypixel.hytale:Server:$serverVersion")
    compileOnly("io.hexora.plotplus:plotplus:2.0.0-beta.4")
    compileOnly("net.cfh.vault:VaultUnlocked:2.18.3")
    compileOnly("org.jetbrains:annotations:26.0.2")
}

tasks.processResources {
    filesMatching("manifest.json") {
        expand("project" to mapOf("version" to project.version, "serverVersion" to serverVersion))
    }
}

tasks.jar {
    archiveFileName.set("PlotPlus-VaultUnlocked-${project.version}.jar")
}
