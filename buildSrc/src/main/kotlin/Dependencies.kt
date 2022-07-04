/**
 * To define dependencies
 */
object Dependencies {

  object Core {
    val coreKts by lazy { "androidx.core:core-ktx:${Versions.core}" }
  }

  object AppCompat {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
  }

  object Material {
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
  }

  object Lifecycle {
    val lifecycleRuntimeKts by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }
    val lifecycleViewModelKts by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}" }
  }

  object Activity {
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activity}" }
  }

  object Compose {
    val ui by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val material by lazy { "androidx.compose.material:material:${Versions.compose}" }
    val uiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
    val uiTestJunit4 by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    val uiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }
  }

  object Coroutine {
    val coroutineAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}" }
    val coroutineCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineCore}" }
  }

  object Dagger {
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.daggerHilt}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.daggerHilt}" }
  }

  object Junit {
    val junit by lazy { "junit:junit:${Versions.junit}" }
  }

  object Test {
    object Ext {
      val junit by lazy { "androidx.test.ext:junit:${Versions.testExt}" }
    }
    object Espresso {
      val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    }
  }

}