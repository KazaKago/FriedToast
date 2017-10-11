FriedToast
====

[![Download](https://api.bintray.com/packages/kazakago/maven/friedtoast/images/download.svg)](https://bintray.com/kazakago/maven/friedtoast/_latestVersion)
[![Bitrise](https://www.bitrise.io/app/436ed4113cb15072.svg?token=5I58EK088C0wp3UWmf75qA&branch=master)]()
[![license](https://img.shields.io/github/license/kazakago/friedtoast.svg)](LICENSE.md)

A rich Toast library that can display images, titles, and descriptions.

![./Artwork/screenshot.jpg](./Artwork/screenshot.jpg)

## Requirement

- Android 4.0.3 (API 15) or later

## Install

Add the following gradle dependency exchanging x.x.x for the latest release.

```groovy
compile 'com.kazakago.friedtoast:friedtoast:x.x.x'
```

## Usage

The following is a sample to show FriedToast.

### Kotlin

```kotlin
fun showFriedToast(context: Context) {
    FriedToast.create(
            context = this,
            titleText = "Title!",
            descriptionText = "Description!!",
            iconImageResourceId = R.drawable.ic_done_white_80dp)
            .show()
}
```

### Java

```java
void showFriedToast(Context context) {
    FriedToast.Companion.create(context)
            .setTitle("Title!")
            .setDescription("Description!!")
            .setIconImageResource(R.drawable.ic_done_white_80dp)
            .show();
}
```

Refer to the sample module ([Java](https://github.com/KazaKago/FriedToast/tree/master/samplejava) & [Kotlin](https://github.com/KazaKago/FriedToast/tree/master/samplekotlin)) for details.

## Advanced

### Custom View

[WIP]

### Add Property

[WIP]

## License
MIT License

Copyright (c) 2017 KazaKago

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
