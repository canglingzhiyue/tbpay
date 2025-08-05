package com.taobao.android.change.app.icon.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconRequest;
import com.taobao.android.change.app.icon.utils.e;
import com.taobao.android.change.app.icon.utils.g;
import com.taobao.application.common.a;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Map;
import tb.igb;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChangeAppIconMgr";

    /* renamed from: a */
    private static volatile b f9319a;
    private volatile HandlerThread b;
    private volatile c c;
    private ChangeAppIconJSModel e;
    private ChangeAppIconJSModel f;
    private final Object d = new Object();
    private final Application g = igc.b();

    static {
        kge.a(-1802986302);
    }

    public static /* synthetic */ void lambda$RSiM_N8zZSkODwvjbc8wOwbtV68(b bVar, int i) {
        bVar.a(i);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("101bf14b", new Object[0]);
        }
        if (f9319a == null) {
            synchronized (b.class) {
                if (f9319a == null) {
                    f9319a = new b();
                }
            }
        }
        return f9319a;
    }

    private b() {
    }

    public void a(ChangeAppIconJSModel changeAppIconJSModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e7bb01", new Object[]{this, changeAppIconJSModel});
        } else {
            a(changeAppIconJSModel, (igb) null);
        }
    }

    private void a(AppIconComponentName appIconComponentName, igb igbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18cc295", new Object[]{this, appIconComponentName, igbVar});
            return;
        }
        AdapterForTLog.loge(TAG, "startCheck:" + this.b);
        synchronized (this.d) {
            if (this.b == null || !this.b.isAlive()) {
                this.b = new HandlerThread("changeIcon");
                this.b.start();
                this.c = new c(this.b.getLooper());
                AdapterForTLog.loge(TAG, "startCheck init:" + this.b);
            }
            this.c.a(appIconComponentName, igbVar, com.taobao.android.change.app.icon.utils.c.a(com.taobao.android.change.app.icon.utils.c.ORANGE_KEY_CHANGE_APP_ICON_CHECK_TOTAL_TIME_MS, 2000L), com.taobao.android.change.app.icon.utils.c.a(com.taobao.android.change.app.icon.utils.c.ORANGE_KEY_CHANGE_APP_ICON_CHECK_INTERVAL_TIME_MS, 300L));
        }
    }

    public synchronized void a(ChangeAppIconJSModel changeAppIconJSModel, igb igbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ce6eed", new Object[]{this, changeAppIconJSModel, igbVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("------change app icon------changeModel:");
        sb.append(changeAppIconJSModel);
        AdapterForTLog.loge(TAG, sb.toString() == null ? "null" : changeAppIconJSModel.toString());
        HashMap hashMap = new HashMap();
        hashMap.put("model", changeAppIconJSModel == null ? "null" : changeAppIconJSModel.toString());
        g.c(g.PAGE_NAME, TAG, "changeAppIcon", "start", hashMap);
        int e = igc.e(this.g);
        this.e = changeAppIconJSModel;
        if (this.e == null) {
            a(igbVar, e);
            return;
        }
        String str = this.e.iconName;
        String str2 = this.e.crash;
        if (changeAppIconJSModel.isBackgroud()) {
            AdapterForTLog.loge(TAG, "change app icon in background:" + str);
            b(changeAppIconJSModel);
            a(igbVar, e);
            return;
        }
        this.e = null;
        this.f = changeAppIconJSModel;
        AppIconComponentName appIconComponentName = igc.c().get(str);
        if (appIconComponentName == null) {
            String str3 = "appIconModel is null,iconName:" + str;
            AdapterForTLog.loge(TAG, str3);
            g.c(g.PAGE_NAME, TAG, "changeAppIcon", str3, hashMap);
            a(igbVar, e);
            return;
        }
        String str4 = appIconComponentName.clzPath;
        if (TextUtils.isEmpty(str4)) {
            String str5 = "expectClzPath is null,iconName:" + str;
            AdapterForTLog.loge(TAG, str5);
            g.c(g.PAGE_NAME, TAG, "changeAppIcon", str5, hashMap);
            a(igbVar, e);
            return;
        }
        igc.c(appIconComponentName);
        AdapterForTLog.loge(TAG, "------start change app icon------iconName:" + str);
        PackageManager packageManager = this.g.getPackageManager();
        ChangeAppIconRequest changeAppIconRequest = new ChangeAppIconRequest(appIconComponentName.iconName, "OPEN", e);
        changeAppIconRequest.setChangeType(changeAppIconJSModel);
        g.c(g.PAGE_NAME, TAG, "changeAppIcon", "open", hashMap);
        com.taobao.android.change.app.icon.utils.b.a(changeAppIconRequest);
        e.a().a(JSON.toJSONString(changeAppIconJSModel));
        ComponentName componentName = new ComponentName(this.g, str4);
        a(appIconComponentName, igbVar);
        AdapterForTLog.loge(TAG, "open clzPath:" + str4);
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        if ("mid".equals(str2)) {
            AdapterForTLog.loge(TAG, "active crash iconName:" + str);
            throw new Error("test mid");
        }
        ChangeAppIconRequest changeAppIconRequest2 = new ChangeAppIconRequest(appIconComponentName.iconName, Constrant.ChangeStatus.CLOSE, e);
        changeAppIconRequest2.setChangeType(changeAppIconJSModel);
        g.c(g.PAGE_NAME, TAG, "changeAppIcon", "close", hashMap);
        com.taobao.android.change.app.icon.utils.b.a(changeAppIconRequest2);
        for (Map.Entry<String, AppIconComponentName> entry : igc.c().entrySet()) {
            AppIconComponentName value = entry.getValue();
            if (str4.equals(value.clzPath)) {
                AdapterForTLog.loge(TAG, "skip close myself expectClzPath:" + value.clzPath);
            } else {
                AdapterForTLog.loge(TAG, "close clzPath:" + value.clzPath);
                packageManager.setComponentEnabledSetting(new ComponentName(this.g, value.clzPath), 2, 1);
            }
        }
        if (TextUtils.equals(changeAppIconJSModel.changeType, Constrant.ChangeType.SILENT)) {
            e.a().a(0L);
            e.a().a(0);
            AdapterForTLog.loge(igc.TAG, "autoRepairMoreAppIconsInBg more enable icon repair，reset autoRepairMoreIconsInBgLastTime");
        }
        if ("end".equals(str2)) {
            AdapterForTLog.loge(TAG, "active crash iconName:" + str);
            throw new Error("test end");
        }
        AdapterForTLog.loge(TAG, "------end change app icon------iconName:" + str);
        g.c(g.PAGE_NAME, TAG, "changeAppIcon", "end", hashMap);
    }

    private void a(igb igbVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bed42f", new Object[]{this, igbVar, new Integer(i)});
        } else if (igbVar == null) {
        } else {
            AdapterForTLog.loge(TAG, "callFailResult dump:" + Log.getStackTraceString(new Throwable()));
            igbVar.a(igb.CC.a(false, false, i));
        }
    }

    private void b(ChangeAppIconJSModel changeAppIconJSModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1155b760", new Object[]{this, changeAppIconJSModel});
            return;
        }
        try {
            AdapterForTLog.loge(TAG, "setChangeAppIconInBackground :" + changeAppIconJSModel);
            this.e = changeAppIconJSModel;
            this.e.changeType = Constrant.ChangeType.NOW;
        } catch (Exception e) {
            e.printStackTrace();
            AdapterForTLog.loge(TAG, "setChangeAppIconInBackground error:", e);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        AdapterForTLog.loge(TAG, "registerApm");
        com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.android.change.app.icon.core.-$$Lambda$b$RSiM_N8zZSkODwvjbc8wOwbtV68
            @Override // com.taobao.application.common.IApmEventListener
            public final void onEvent(int i) {
                b.lambda$RSiM_N8zZSkODwvjbc8wOwbtV68(b.this, i);
            }
        });
    }

    public /* synthetic */ void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!e.a().b().getBoolean(com.taobao.android.change.app.icon.utils.c.ORANGE_KEY_CHANGE_APP_ICON_IN_BG_OPEN, true)) {
        } else {
            if (i != 1 && i != 50) {
                return;
            }
            boolean z = e.a().b().getBoolean(com.taobao.android.change.app.icon.utils.c.ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG, false);
            if (this.e == null && !z) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("registerApm onEvent type:");
            sb.append(i);
            sb.append(" change2DefaultIcon:");
            sb.append(z);
            sb.append(" ChangeAppIconJSModel:");
            ChangeAppIconJSModel changeAppIconJSModel = this.e;
            sb.append(changeAppIconJSModel == null ? "null" : changeAppIconJSModel.toString());
            AdapterForTLog.loge(TAG, sb.toString());
            ChangeAppIconJSModel changeAppIconJSModel2 = this.e;
            if (changeAppIconJSModel2 != null) {
                a(changeAppIconJSModel2);
            } else if (!z) {
            } else {
                e.a().a(com.taobao.android.change.app.icon.utils.c.ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG, false).c();
                igc.a(true);
            }
        }
    }

    public ChangeAppIconJSModel c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChangeAppIconJSModel) ipChange.ipc$dispatch("af408403", new Object[]{this}) : this.f;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this.d) {
            AdapterForTLog.loge(TAG, "destroy:" + this.b);
            if (this.b != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.b.quitSafely();
                } else {
                    this.b.quit();
                }
                this.b = null;
                this.c.removeCallbacksAndMessages(null);
                this.c = null;
            }
        }
    }
}
