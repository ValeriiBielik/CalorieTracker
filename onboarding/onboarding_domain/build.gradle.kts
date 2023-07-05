apply {
    from("$rootDir/base-module.gradle")
    from("$rootDir/namespace-onboarding-domain.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
}