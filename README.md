これは、Android、デスクトップ、サーバーを対象とした Kotlin マルチプラットフォーム プロジェクトです。

* `/composeApp` Compose Multiplatform アプリケーション全体で共有されるコード用です。
  いくつかのサブフォルダーが含まれています:
    - `commonMain` すべてのターゲットに共通のコードです。
    - その他のフォルダーは、フォルダー名に示されているプラットフォーム専用にコンパイルされる Kotlin コード用です。
      たとえば、Kotlin アプリの iOS 部分に Apple の CoreCrypto を使用する場合は、次のようにします。
      `iosMain` このような呼び出しには適切なフォルダーになります。

* `/server` Ktorサーバーアプリケーション用です。

* `/shared` は、プロジェクト内のすべてのターゲット間で共有されるコード用です。
  最も重要なサブフォルダーは `commonMain` です。 必要に応じて、ここでもプラットフォーム固有のフォルダーにコードを追加できます。

詳しくはこちら [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
