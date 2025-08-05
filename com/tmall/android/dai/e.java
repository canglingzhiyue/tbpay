package com.tmall.android.dai;

import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.model.a;
import com.tmall.android.dai.model.b;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.rkq;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODEL_STATUS_KEY_LAST_ERROR = "lastErrorMsg";
    public static final String MODEL_STATUS_KEY_LAST_RUN_STATUS = "lastRunStatus";
    public static final String MODEL_STATUS_KEY_LAST_RUN_TIME = "lastRunTime";
    public static final String MODEL_STATUS_KEY_REGISTER = "isRegister";
    public static final String MODEL_STATUS_KEY_TRIGGER = "isTrigger";

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, HashMap> f23674a;

    static {
        kge.a(-396855287);
        f23674a = new ConcurrentHashMap<>();
    }

    public static final synchronized Map<String, Object> a() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            rkq d = rkq.d();
            hashMap.put(Constant.API_PARAMS_KEY_ENABLE, Boolean.valueOf(d.h()));
            hashMap.put("isBaseSoLoaded", Boolean.valueOf(d.c()));
            hashMap.put("isDownloadEnable", true);
            if (com.tmall.android.dai.internal.util.c.a() != null) {
                hashMap.put("deviceLevel", com.tmall.android.dai.internal.util.c.a());
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("EdgeComputingIsEnabled");
            if (configs != null) {
                hashMap.put("orangeConfig", configs);
            }
            Collection<a> a2 = rkq.d().m().a();
            if (a2 != null) {
                for (a aVar : a2) {
                    HashMap hashMap3 = new HashMap();
                    if (aVar.b() != null) {
                        hashMap3.put("name", aVar.b());
                    }
                    if (aVar.d() != null) {
                        hashMap3.put("md5", aVar.d());
                    }
                    b i = aVar.i();
                    if (i != null) {
                        hashMap3.put("lastRunInfo", aVar.j());
                        if (i.i != null) {
                            hashMap3.put("errorMsg", i.i);
                        }
                        if (i.j != null) {
                            hashMap3.put(MODEL_STATUS_KEY_LAST_RUN_TIME, i.j);
                        }
                    }
                    hashMap2.put(aVar.b(), hashMap3);
                }
            }
            hashMap.put("models", hashMap2);
            return hashMap;
        }
    }

    public static HashMap a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str}) : f23674a.get(str);
    }

    public static void a(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{str, new Boolean(z), str2});
            return;
        }
        HashMap hashMap = f23674a.get(str);
        if (hashMap == null) {
            hashMap = new HashMap();
            f23674a.put(str, hashMap);
        }
        hashMap.put(MODEL_STATUS_KEY_REGISTER, Boolean.valueOf(z));
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (f23674a.get(str) == null) {
        } else {
            f23674a.remove(str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = f23674a.get(str);
        if (hashMap == null) {
            return;
        }
        hashMap.put(MODEL_STATUS_KEY_TRIGGER, true);
    }

    public static void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{str, new Integer(i), str2});
            return;
        }
        HashMap hashMap = f23674a.get(str);
        if (hashMap == null) {
            return;
        }
        hashMap.put(MODEL_STATUS_KEY_LAST_RUN_STATUS, Integer.valueOf(i));
        hashMap.put(MODEL_STATUS_KEY_LAST_ERROR, str2);
        hashMap.put(MODEL_STATUS_KEY_LAST_RUN_TIME, new Date().toString());
    }
}
