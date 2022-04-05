import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.carnext"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}

dependencies {
    //ここにライブラリやフレームワークの依存関係を追加していく。
    //リスト2.11.1
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
}