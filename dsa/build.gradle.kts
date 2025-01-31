plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

application {
    mainClass.set("com.nyinnovations.dsa.PalindromeStringKt")
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    testImplementation(libs.junit)
}