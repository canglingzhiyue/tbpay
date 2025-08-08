package com.taobao.search.common.jsbridge;

import android.app.Activity;
import android.graphics.Bitmap;
import android.taobao.windvane.cache.a;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import tb.kge;

/* loaded from: classes7.dex */
public class SearchScreenShotBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_NAME = "screenShot";
    public static final String API_NAME = "SearchScreenShot";
    private static final String FILE_NAME = "SearchScreenShot.png";

    static {
        kge.a(899021316);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!StringUtils.equals(ACTION_NAME, str)) {
            return false;
        }
        View decorView = ((Activity) getContext()).getWindow().getDecorView();
        decorView.setDrawingCacheEnabled(true);
        decorView.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(decorView.getDrawingCache());
        try {
            String a2 = a.a().a(true);
            FileOutputStream fileOutputStream = new FileOutputStream(a2 + "/" + FILE_NAME);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            String absolutePath = new File(a2, FILE_NAME).getAbsolutePath();
            r rVar = new r();
            rVar.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, absolutePath);
            wVCallBackContext.success(rVar);
        } catch (Throwable unused) {
            wVCallBackContext.error();
        }
        return true;
    }
}
