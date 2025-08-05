package com.taobao.android.artry.tblife;

import android.app.Application;
import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.android.artry.MetaServerAccsService;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f9084a;
    private static final String b;
    private static String c;

    static {
        kge.a(1219153210);
        b = a.class.getSimpleName();
        c = "metaserver";
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            Context applicationContext = application.getApplicationContext();
            f9084a = applicationContext;
            GlobalClientInfo.getInstance(applicationContext).registerService(c, MetaServerAccsService.class.getName());
            MetaServerAccsService.f9029a = true;
            MetaServerAccsService.a();
            android.taobao.windvane.embed.a.a(WVARCameraView.AR_CAMERA_WV_VIEW_TYPE, (Class<? extends BaseEmbedView>) WVARCameraView.class, true);
        } catch (Throwable th) {
            Log.e(b, "init artry error", th);
        }
    }
}
