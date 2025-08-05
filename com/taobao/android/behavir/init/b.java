package com.taobao.android.behavir.init;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.decision.BHRDecisionEngine;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.bridge.UCPJSBridge;
import com.taobao.android.behavir.util.j;
import com.taobao.android.behavix.BehaviRWVPlugin;
import com.taobao.android.behavix.behavixswitch.j;
import com.taobao.android.behavix.d;
import com.taobao.android.ucp.algo.NativeAlgo;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.android.ucp.track.c;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.android.ucp.util.UCPTrackBroadCastReceiver;
import com.taobao.android.ucp.view.UCPViewManager;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.io.Serializable;
import java.util.HashMap;
import tb.dro;
import tb.ghi;
import tb.ghl;
import tb.ghm;
import tb.ghp;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int[] LISTEN_UT_IDS;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9141a;
    private static BroadcastReceiver b;

    public static /* synthetic */ void a(ghp ghpVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee067653", new Object[]{ghpVar, str});
        } else {
            b(ghpVar, str);
        }
    }

    static {
        kge.a(689664136);
        LISTEN_UT_IDS = new int[]{2201, 2101};
        f9141a = false;
        b = new BroadcastReceiver() { // from class: com.taobao.android.behavir.init.BrDelayInitTask$4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                BHREvent bHREvent = new BHREvent();
                bHREvent.scene = l.getInstance().getCurrentPageName();
                bHREvent.actionType = "internal";
                bHREvent.actionName = "android_walle_Started";
                JSONObject jSONObject = new JSONObject();
                BHREvent e = BHRDecisionEngine.a().e();
                if (e != null) {
                    jSONObject.put("br_scene", (Object) e.scene);
                }
                bHREvent.bizArgKVMapObject = jSONObject;
                BHRDecisionEngine.a().a(bHREvent);
                UtUtils.a("UPP", "walle_start_interval", String.valueOf(System.nanoTime() - d.f9182a), null);
                TLog.loge("", "walle started.");
            }
        };
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f9141a) {
        } else {
            f9141a = true;
            d();
            g();
            f();
            c.a("BXInitStart");
            if (dro.c()) {
                ((UppProtocolImpl) UppProtocolImpl.getInstance()).init();
            }
            com.taobao.android.behavir.config.a.a().b();
            h();
            e();
            NativeAlgo.initializeNativeAlgo();
            try {
                b();
            } catch (Throwable th) {
                TLog.loge("", "registerWalleListener error.", th);
            }
            i();
            c();
            c.a("BXInitEnd");
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!dro.c()) {
        } else {
            try {
                ghm ghmVar = (ghm) ghi.a(ghm.class);
                ghmVar.addChangeVersionListener(a.a());
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
                d.b().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.init.BrDelayInitTask$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else {
                            NativeDelegate.triggerServiceRequest("appVersionChange");
                        }
                    }
                }, intentFilter);
                ghp queryCurrentVersionInfo = ghmVar.queryCurrentVersionInfo();
                if (queryCurrentVersionInfo == null) {
                    return;
                }
                b(queryCurrentVersionInfo, "init");
            } catch (Throwable th) {
                TLog.loge("addEditionManagerListener", th.getMessage());
            }
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (!com.taobao.android.behavix.behavixswitch.a.a("enableUtPlugin", true)) {
        } else {
            com.ut.mini.module.trackerlistener.b.getInstance().registerListener(new j());
        }
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            LocalBroadcastManager.getInstance(d.b()).registerReceiver(new UCPViewManager.PopCenterShowReceiver(), new IntentFilter("popcenter.popShow"));
        }
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            LocalBroadcastManager.getInstance(d.b()).registerReceiver(new UCPTrackBroadCastReceiver(), new IntentFilter("UCPTracker"));
        }
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        try {
            q.a("TBBehaviR", (Class<? extends e>) BehaviRWVPlugin.class, true);
            q.a("UCP", (Class<? extends e>) UCPJSBridge.class);
        } catch (Throwable th) {
            com.taobao.android.behavir.util.d.a("initJSBridge_fail", th);
        }
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        LocalBroadcastManager.getInstance(d.b()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.init.BrDelayInitTask$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra("schemeId");
                String stringExtra2 = intent.getStringExtra("bizId");
                JSONObject jSONObject = (JSONObject) intent.getSerializableExtra("ext");
                if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
                    return;
                }
                BHREvent buildInternalEvent = BHREvent.buildInternalEvent(stringExtra, stringExtra2, String.valueOf(com.taobao.android.ucp.util.b.a()), true);
                JSONObject jSONObject2 = new JSONObject(4);
                jSONObject2.put("source", (Object) "Notification");
                if (jSONObject != null) {
                    jSONObject2.putAll(jSONObject);
                }
                buildInternalEvent.bizArgKVMapObject = jSONObject2;
                BHRDecisionEngine.a().a(buildInternalEvent);
            }
        }, new IntentFilter("UCPTryDecision"));
        LocalBroadcastManager.getInstance(d.b()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.init.BrDelayInitTask$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra("scene");
                String stringExtra2 = intent.getStringExtra("actionName");
                Serializable serializableExtra = intent.getSerializableExtra(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.BIZ_ARGS);
                if (!(serializableExtra instanceof JSONObject)) {
                    return;
                }
                UppProtocolImpl.getInstance().sendUCPEventWithScene(stringExtra, stringExtra2, (JSONObject) serializableExtra);
            }
        }, new IntentFilter("SendEventForUCP"));
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!com.taobao.android.behavix.behavixswitch.a.b(j.b.K_ENABLE_MIDDLEWARE_EVENT, true)) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE");
            d.b().registerReceiver(b, intentFilter);
        }
    }

    private static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        IntentFilter intentFilter = new IntentFilter(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
        intentFilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGOUT);
        d.b().registerReceiver(new LoginBroadcastReceiver(), intentFilter);
    }

    /* loaded from: classes4.dex */
    public static class a implements ghl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f9142a;

        private a() {
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e9d6ab1a", new Object[0]) : f9142a;
        }

        static {
            kge.a(724026885);
            kge.a(308073653);
            f9142a = new a();
        }

        @Override // tb.ghl
        public void a(ghp ghpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea458cc9", new Object[]{this, ghpVar});
                return;
            }
            NativeDelegate.triggerServiceRequest("appVersionChange");
            b.a(ghpVar, "changed");
        }
    }

    private static void b(ghp ghpVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef3e94", new Object[]{ghpVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dataVersion", ghpVar.f28334a);
        hashMap.put("groupCode", ghpVar.b);
        hashMap.put("activeType", ghpVar.d);
        hashMap.put("bizParams", ghpVar.e != null ? ghpVar.e.toJSONString() : "");
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("BehaviX", 19999, "versionCode", ghpVar.c, str, hashMap).build());
    }
}
