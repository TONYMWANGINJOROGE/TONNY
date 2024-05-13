plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.typhoon"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.typhoon"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
   // android {
//        buildTypes {
////            debug {
////                // Enable custom BuildConfig fields for debug build type
////                buildConfigField("String", "CONSUMER_KEY", "\"${project.findProperty("CONSUMER_KEY") ?: ""}\"")
////                buildConfigField("String", "CONSUMER_SECRET", "\"${project.findProperty("CONSUMER_SECRET") ?: ""}\"")
////            }
//            release {
//                // Enable custom BuildConfig fields for release build type
//                buildConfigField("String", "CONSUMER_KEY", "\"${project.findProperty("CONSUMER_KEY") ?: ""}\"")
//                buildConfigField("String", "CONSUMER_SECRET", "\"${project.findProperty("CONSUMER_SECRET") ?: ""}\"")
//            }
//        }
    //}

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation("androidx.compose.material:material-icons-extended-android:1.6.6")
    implementation ("androidx.compose.material:material-icons-extended-android:1.6.6")
    implementation("androidx.navigation:navigation-compose:2.7.7")
//    implementation("Gradle:androidx.test.espresso:espresso-core:3.5.1@aar")
//    implementation("Gradle:androidx.compose.ui:ui-test-android:1.6.6")
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.database)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.storage)
    implementation(libs.androidx.benchmark.macro)
    implementation(libs.androidx.compose.material)
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//    implementation("com.squareup.okhttp3:okhttp:4.9.1")
    // implementation(libs.androidx.material3.desktop)
    //implementation(libs.androidx.material3.android)
    // implementation(libs.androidx.material3.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation("Gradle:androidx.test.espresso:espresso-core")
//    debugImplementation("Gradle:androidx.compose.ui:ui-test-android")
    debugImplementation(libs.androidx.ui.tooling)

    debugImplementation(libs.androidx.ui.test.manifest)
    implementation("io.coil-kt:coil-compose:2.0.0-rc01")
   // implementation("com.google.code.gson:gson:2.8.7")
    //new
//    implementation("androidx.appcompat:appcompat:1.3.1")
//    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("com.android.support.test:runner:1.0.2")
//    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
//
//
//
////stk push
//    implementation("com.jakewharton:butterknife:10.1.0")
//    annotationProcessor("com.jakewharton:butterknife-compiler:10.1.0")
//    implementation("com.jakewharton.timber:timber:4.7.1")
//
//    implementation("com.github.jumadeveloper:networkmanager:0.0.2")
//
//    implementation("cn.pedant.sweetalert:library:1.3")
//
//    implementation("com.squareup.retrofit2:retrofit:2.5.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.5.0")
//
//    implementation("com.squareup.okhttp3:okhttp:3.12.0")
//    implementation("com.squareup.okhttp3:logging-interceptor:3.12.0")
//
//    implementation("com.google.code.gson:gson:2.8.7")
//
//    implementation("com.squareup.okio:okio:2.1.0")
//
//    implementation("javax.annotation:javax.annotation-api:1.3.2")
}





















