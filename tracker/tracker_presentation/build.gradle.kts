apply {
    from("$rootDir/compose-module.gradle")
    from("$rootDir/namespace-tracker-presentation.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.trackerDomain))

    "implementation"(Coil.coilCompose)
}