import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

fun accessModuleClassloaderAndCrash(target: Project) {
    println("MyPlugin::apply")

    target.extensions.getByName("kotlin") as KotlinProjectExtension
}