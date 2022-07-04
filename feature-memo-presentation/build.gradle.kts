plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
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

    sourceSets.getByName("main") {
        java.srcDir("src/main/kotlin")
    }
}

dependencies {

    implementation(Dependencies.Core.coreKts)
    implementation(Dependencies.AppCompat.appCompat)
    implementation(Dependencies.Material.material)
    testImplementation(Dependencies.Junit.junit)
    androidTestImplementation(Dependencies.Test.Ext.junit)
    androidTestImplementation(Dependencies.Test.Espresso.espressoCore)

    implementation(Dependencies.Coroutine.coroutineAndroid)
    implementation(Dependencies.Coroutine.coroutineCore)
    
    implementation(Dependencies.Dagger.hiltAndroid)
    kapt(Dependencies.Dagger.hiltAndroidCompiler)

    implementation(project(path = ":feature-memo-repository"))

}