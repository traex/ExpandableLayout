ExpandableLayout
================

![ExpandableLayout](https://github.com/traex/ExpandableLayout/blob/master/header.png)

ExpandableLayout provides an easy way to create a view called header with an expandable view. Both view are external layout to allow a maximum of customization. [You can find a sample](https://github.com/traex/ExpandableLayout/blob/master/sample/) that how to use an ExpandableLayout to your layout.

![ExpandableLayout GIF](https://github.com/traex/ExpandableLayout/blob/master/demo.gif)
 
### Integration
The lib is available on Maven Central, you can find it with [Gradle, please](http://gradleplease.appspot.com/#expandablelayout)

``` xml

dependencies {
    compile 'com.github.traex.expandablelayout:library:1.2.2'
}

``` 

### Usage

#### ExpandableLayout

Declare an ExpandableLayout inside your XML layout file. You also need to other layouts for header and content:

``` xml

  <com.andexert.expandablelayout.library.ExpandableLayout
         android:id="@+id/expandableLayout"
         xmlns:expandable="http://schemas.android.com/apk/res-auto"
         android:layout_width="match_parent"
         android:layout_height="match_parent"
         expandable:headerLayout="@layout/view_header"
         expandable:contentLayout="@layout/view_content"/>
         
```

#### ExpandableLayoutItem && ExpandableLayoutItem

You can use ExapandableLayout in an `ExpandableLayoutListView` with `ExpandableLayoutItem` as row :

ExpandableLayoutItem
``` xml

  <com.andexert.expandablelayout.library.ExpandableLayoutItem
         android:id="@+id/expandableLayout"
         xmlns:expandable="http://schemas.android.com/apk/res-auto"
         android:layout_width="match_parent"
         android:layout_height="match_parent"
         expandable:headerLayout="@layout/view_header"
         expandable:contentLayout="@layout/view_content"/>
         
```

ExpandableLayoutListView
``` xml

  <com.andexert.expandablelayout.library.ExpandableLayoutListView
         android:id="@+id/expandableLayout"
         xmlns:expandable="http://schemas.android.com/apk/res-auto"
         android:layout_width="match_parent"
         android:layout_height="match_parent"/>
         
```
If you want to manage the OnScroll, you have to use `OnExpandableLayoutScrollListener` and don't forget to call super in each method.

You can call dynamically `open`, `close` and `isOpened` from an ExpandableLayout object.

### Customization

You can change duration of the animation:

* app:duration [integer def:200] --> Duration of the animation

### Troubleshooting

If you want to use the `ExpandableLayoutListView` with EditText, you have to set `android:windowSoftInputMode="adjustPan"` to prevent the ListView to redraw itself and close the ExpandableLayoutItem.

### Acknowledgements

Thanks to [Google](http://developer.android.com/reference/android/widget/ExpandableListView.html) for its ExpandableListview :)

### MIT License

```
    The MIT License (MIT)
    
    Copyright (c) 2014 Robin Chutaux
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
```
