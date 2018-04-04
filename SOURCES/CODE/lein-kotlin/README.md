# lein-kotlin

A Leiningen plugin to compile Kotlin code.

## Usage

Add `[lein-kotlin "0.0.2"]` to `:plugins`

Add `[org.jetbrains.kotlin/kotlin-runtime "1.0.1-2"]` to `:dependencies`

Set `:kotlin-source-path`. Example `:kotlin-source-path "src/kotlin"`

Compile Kotlin files with `$ lein kotlin`

To automatically compile Kotlin files add `"kotlin"` to the `:prep-tasks` vector

If you want to use a different kotlin-runtime version, also set `:kotlin-compiler-version`

If you want to use this in the Cursive REPL you need to add 

`:profiles {:repl {:dependencies [[org.jetbrains.kotlin/kotlin-compiler "1.0.1-2"]]}}` 

to the project. This is workaround for a bug, and is being worked on.

## License

Copyright (c) 2016 Mark Reuter

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
