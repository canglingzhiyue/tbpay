package com.taobao.android.layoutmanager.setup;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.secondpage.SecondPageFactory;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.layoutmanager.container.g;
import com.taobao.android.layoutmanager.module.NavigationTabHelper;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.android.layoutmanager.module.WeexModule;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.Map;
import tb.gvw;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogt;
import tb.ohf;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-894504094);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            MUSEngine.registerModule("tnode", WeexModule.class);
        } catch (Exception e) {
            ogg.a("TNode", "MUSEngine.registerModule tnode Exception: " + e.toString());
        }
        ohf.a();
        com.taobao.android.fluid.c.c(ab.a());
        g.a();
        com.taobao.android.layoutmanager.message.a.a();
        NavigationTabHelper.a();
        SecondPageFactory.a(SecondPageFactory.SecondPageType.GG_PROFILE, com.taobao.android.layoutmanager.container.secondpage.biz.ndadapter.a.class);
        oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.setup.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(new d.c() { // from class: com.taobao.android.layoutmanager.setup.b.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.navigation.d
                    public void onTabChanged(int i, String str) {
                        Intent intent;
                        IpChange ipChange3 = $ipChange;
                        boolean z = false;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                            return;
                        }
                        if (i == 1) {
                            ogg.a("TNode", "APMdata  clicktab2, uptimeMillis=" + SystemClock.uptimeMillis());
                            ogt.f32045a = System.currentTimeMillis();
                            ogt.a(ogt.TASK_ICON_CLICK);
                            Map c = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().c();
                            TabBarControllerComponent.f20080a = true;
                            ogt.a(ogt.TASK_ICON_CLICK, new JSONObject(c));
                        } else {
                            TabBarControllerComponent.f20080a = false;
                        }
                        Activity a2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a();
                        if (a2 != null && (intent = a2.getIntent()) != null) {
                            z = intent.getBooleanExtra(com.taobao.tao.navigation.a.EXTRA_KEY_CLICK_TO_TAB_CHANGE, false);
                        }
                        NavigationTabModule.onTabChanged(i);
                        Intent intent2 = new Intent(NotifyRegister.ACTION_GG_TNODE_TAB_SELECT_CHANGED);
                        intent2.putExtra("selectedTabIndex", i);
                        intent2.putExtra("clickTabChange", z);
                        if (oeb.a("syncBroadcast", true)) {
                            LocalBroadcastManager.getInstance(ab.a()).sendBroadcastSync(intent2);
                        } else {
                            LocalBroadcastManager.getInstance(ab.a()).sendBroadcast(intent2);
                        }
                    }
                });
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(new d.a() { // from class: com.taobao.android.layoutmanager.setup.b.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.navigation.e.d
                    public void a() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            NavigationTabModule.onReset();
                        }
                    }
                });
                if (Build.VERSION.SDK_INT < 14) {
                    return;
                }
                ((PanguApplication) ab.a()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.android.layoutmanager.setup.b.1.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("a4658a75", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5e01616c", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                            return;
                        }
                        d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
                        if (b == null || !b.a(activity)) {
                            return;
                        }
                        ogg.a("MainActivity Created send ACTION_CHECK_PRELOAD");
                        LocalBroadcastManager.getInstance(activity).sendBroadcast(new Intent(com.taobao.android.layoutmanager.container.d.ACTION_CHECK_PRELOAD));
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        ab b;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("4148cc84", new Object[]{this, activity});
                            return;
                        }
                        d b2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
                        if (b2 == null || !b2.a(activity)) {
                            return;
                        }
                        FluidSDK.clearPreloadTaskForContext(activity);
                        if (oeb.a("fixTabLeak", true)) {
                            NavigationTabModule.resetTab(null);
                        }
                        if (!oeb.cp() || (b = ab.b(gvw.b())) == null || b.A() == null || b.A().x() != null) {
                            return;
                        }
                        b.y();
                    }
                });
            }
        });
    }
}
