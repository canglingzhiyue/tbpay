package com.taobao.android.change.app.icon.biz;

import android.app.Application;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.taobao.R;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1809726847);
    }

    public static void a(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e9323d", new Object[]{application, new Boolean(z)});
            return;
        }
        igc.a(application, z, AppIconComponentName.create(application, "AppIcon", "com.taobao.tao.welcome.Welcome"), AppIconComponentName.create(application, "AppIconVIP", "com.taobao.tao.welcome.Alias1Welcome88VIP", R.mipmap.ic_tb_app_88vip));
        try {
            q.a("AlternateIconsBridge", (Class<? extends e>) ChangeAppIconBridge.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
