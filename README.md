##OVERVIEW

Hike the Globe! gHikes is an Android application that shows a list of hikes. Select a hike to see the detail view, with information such as elevation change, driving directions, difficulty, and so on.   

##USAGE

You can run this project on an emulator or device from Android Studio. 

##RUNNING REQUIREMENTS

Application will run on Android 6.0 (Marshmallow) and above.

##LICENSE

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

##APP CORE REQUIREMENTS
* Must use at least one image - I changed the icon used to launch the app
* Must use at least two views - 1) list view of hikes, 2) hike detail view
* Must use at least two widgets - TextView and RatingBar
* Must have at least one transition from one screen to another. That is, a single screen app is not acceptable. - transition from list view to hike detail view by clicking on a hike in the list

##WHAT I LEARNED

1. How to use Image Asset Studio (https://developer.android.com/studio/write/image-asset-studio.html) to create a launch icon. 
1. strings.xml allows localization for the app.
1. About the syntax of the id value, in the form "@+id/name": the plus symbol, +, indicates that this is a new resource ID and the aapt tool will create a new resource integer in the R.java class, if it doesn't already exist.
1. aapt - Android Asset Packaging Tool is part of the SDK and build system (http://elinux.org/Android_aapt)
1. assets - the asset folder is present in many examples online, but is not in the project by default - https://stackoverflow.com/questions/18302603/where-do-i-place-the-assets-folder-in-android-studio 
1. About adapters and adapter views - an adapter loads the information to be displayed from a data source, such as an array or database query and creates a view for each item. - https://developer.android.com/reference/android/widget/Adapter.html
1. After using ListView, I found out that RecycleView is actually the recommended "list" component right now, so I would probably use that in the future. 
1. Keyboard shortcut alt-enter to add import to java file
1. Keyboard shortcut option-command-l to automatically fix indentation in Android Studio on a Mac
1. How to load data from a JSON file in Java
1. About Intents (insert joke here: "Do you know what's intense? Camping! (in tents)") - https://developer.android.com/reference/android/content/Intent.html - the "glue between activities"
1. With rating bar, you can't use android:layout_width="fill_parent" or it will ignore android:numStars.
1. When using GridLayout, the colspan is important; otherwise, widgets might be overwritten or off-screen

