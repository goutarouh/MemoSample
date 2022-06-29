plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 30
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled  = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget =  "1.8"
    }
}

dependencies {

    implementation(Dependencies.Core.coreKts)
    implementation(Dependencies.AppCompat.appCompat)
    implementation(Dependencies.Material.material)
    testImplementation(Dependencies.Junit.junit)
    androidTestImplementation(Dependencies.Test.Ext.junit)
    androidTestImplementation(Dependencies.Test.Espresso.espressoCore)
}