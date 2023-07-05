apply {
    from("$rootDir/base-module.gradle")
    from("$rootDir/namespace-tracker-domain.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
}