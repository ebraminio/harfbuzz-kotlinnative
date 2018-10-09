plugins {
    id("org.jetbrains.kotlin.konan").version("0.9.2")
}

konanArtifacts {
    interop("harfbuzz") {
        defFile("harfbuzz.def")
    }

    program("HelloWorld") {
        libraries {
            artifact("harfbuzz")
        }
    }
}