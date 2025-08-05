package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.util.HashMap;

/* loaded from: classes.dex */
public class go extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public go(String str) {
        super(str);
        shouldRunImmediately(true);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        new com.taobao.android.autosize.c().a(application, hashMap);
        Resources resources = application.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            Constants.SCREEN_HEIGHT_OFFSET = 96;
        }
        if (resources.getConfiguration().orientation == 2) {
            Constants.half_screen_width = displayMetrics.heightPixels / 2;
            Constants.screen_density = displayMetrics.density;
            Constants.screen_width = displayMetrics.heightPixels;
            Constants.screen_height = displayMetrics.widthPixels - Constants.SCREEN_HEIGHT_OFFSET;
            Constants.screen_widthmul2 = Constants.screen_width << 1;
            return;
        }
        Constants.half_screen_width = displayMetrics.widthPixels / 2;
        Constants.screen_density = displayMetrics.density;
        Constants.screen_width = displayMetrics.widthPixels;
        Constants.screen_height = displayMetrics.heightPixels - Constants.SCREEN_HEIGHT_OFFSET;
        Constants.screen_widthmul2 = Constants.screen_width << 1;
    }
}
