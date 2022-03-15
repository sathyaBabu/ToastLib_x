package com.sathya.toast_lib_x;

import android.content.Context;
import android.widget.Toast;

public class ToastApi {
    public static  void toastApi(Context context, String txt){

        Toast.makeText(context, "toastApi : "+txt, Toast.LENGTH_SHORT).show();

    }
}
