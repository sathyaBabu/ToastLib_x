# ToastLib_x
ToastApi By Sathya


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  Step 1 : Changes Add just(	maven { url 'https://jitpack.io' } ) this line into settings.gradel under mavenCentral()
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sathyaBabu:ToastLib_x:1.0.1'
	}
