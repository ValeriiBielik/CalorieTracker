apply {
    from("$rootDir/compose-module.gradle")
    from("$rootDir/namespace-onboarding-presentation.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.onboardingDomain))
}