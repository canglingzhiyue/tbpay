package tb;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.accessibility.A11yInitHelper;
import com.taobao.android.task.Coordinator;
import com.taobao.android.tracker.DynamicTrackWeexModule;
import com.taobao.android.tracker.a;
import com.taobao.calendar.receiver.CalendarReceiver;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import tb.bhc;

/* loaded from: classes4.dex */
public class dvt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        Log.e("CapsuleBundle", "initBundle");
        b(application);
        a.a().b();
        try {
            WXSDKEngine.registerModule("dynamicTracker", DynamicTrackWeexModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
        Coordinator.execute(new Runnable() { // from class: tb.dvt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    kff.a().a(application);
                    kff.b();
                    LoginBroadcastHelper.registerLoginReceiver(application, new CalendarReceiver());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
        try {
            A11yInitHelper.init(application);
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("CapsuleBundle", th.getMessage());
        }
        try {
            dcc.a(application);
        } catch (Throwable th2) {
            th2.printStackTrace();
            Log.e("CapsuleBundle", th2.getMessage());
        }
    }

    private static void b(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else {
            h.a(application).a(j.a().a(bhe.a(application, "com.taobao.android.favsdk.favtaobaouse.FavSdkManager").a(new bhc.b<cak>() { // from class: tb.dvt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(cak cakVar, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("35478f09", new Object[]{this, cakVar, bundle});
                    } else {
                        cakVar.init(application, null);
                    }
                }

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    } else {
                        Log.e("CapsuleBundle", "FavSdkManager init failed");
                    }
                }
            }).a()).a());
        }
    }
}
