package com.taobao.android.opencart;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast;
import com.taobao.android.opencart.broadcast.TBCartWVService;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.g;
import java.util.HashMap;
import java.util.Map;
import tb.hvf;
import tb.hvg;
import tb.hvi;
import tb.omj;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    private static JSONObject f14491a = null;
    public static final String sTabChangedBroadcastAction = "CartTabChangedEventAction";
    public static final String sTabChangedBroadcastExtraIndex = "index";

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            m();
        }
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            l();
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        TBCartWVService.registerPlugin();
        CartRefreshCheckBroadcast.a(application);
        o();
        LoginBroadcastHelper.registerLoginReceiver(application, new BroadcastReceiver() { // from class: com.taobao.android.opencart.InitCart$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null || !TextUtils.equals(intent.getAction(), LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS)) {
                } else {
                    try {
                        CheckHoldManager.a().a(2, null, null, true);
                    } catch (Exception unused) {
                    }
                }
            }
        });
        j();
        a(application);
    }

    private static void o() {
        try {
            final SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("init_cart", 0);
            OrangeConfig.getInstance().registerListener(new String[]{hvi.SPACE_NAME}, new f() { // from class: com.taobao.android.opencart.InitCart$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.f
                public void onConfigUpdate(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                        return;
                    }
                    try {
                        boolean e = hvi.e();
                        hvf.c("InitCart", "onConfigUpdate prefetchCartVEngine=" + e);
                        sharedPreferences.edit().putBoolean("isPrefetchCartVEngine", e).apply();
                    } catch (Throwable th) {
                        hvf.c("InitCart", "sharedPreferences isPrefetchCartVEngine err=" + th.getMessage());
                    }
                }
            });
            if (!sharedPreferences.getBoolean("isPrefetchCartVEngine", true)) {
                hvf.c("InitCart", "don't prefetch cart engine, from sp");
            } else {
                Class.forName("com.taobao.android.icart.engine.CartVEngineFactory").getDeclaredMethod("prefetchCartVEngine", Activity.class).invoke(null, (Activity) TBMainHost.a().getContext());
            }
        } catch (Throwable th) {
            hvf.c("InitCart", "invoke error msg=" + th.getMessage());
        }
    }

    private static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        e.a(new omj() { // from class: com.taobao.android.opencart.InitCart$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.omj
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    handler.post(new Runnable() { // from class: com.taobao.android.opencart.InitCart$3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                d.b();
                            }
                        }
                    });
                }
            }
        });
    }

    private static void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            e.a(new com.taobao.tao.navigation.d() { // from class: com.taobao.android.opencart.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.navigation.d
                public void onTabChanged(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    if (i == 3) {
                        d.a();
                    }
                    try {
                        Intent intent = new Intent();
                        intent.setAction(d.sTabChangedBroadcastAction);
                        intent.putExtra("index", i);
                        LocalBroadcastManager.getInstance(application).sendBroadcast(intent);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
        } else {
            hvg.a("tabbarExpo", n());
        }
    }

    private static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[0]);
        } else {
            hvg.a("tabbarCartClick", n());
        }
    }

    private static Map<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("11bb9f6a", new Object[0]);
        }
        g b = e.b(3);
        String m = b != null ? b.m() : "";
        HashMap hashMap = new HashMap();
        hashMap.put("cartBadge", m);
        hashMap.put("type", a(m));
        JSONObject jSONObject = f14491a;
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, String.valueOf(f14491a.get(str)));
            }
        }
        return hashMap;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(str) ? RequestConfig.CHECKED_COUNT : "text";
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("99+".equals(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
