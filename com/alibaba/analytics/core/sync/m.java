package com.alibaba.analytics.core.sync;

import android.content.Context;
import com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack.UserTrackUFWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.any;
import tb.aob;
import tb.aoi;
import tb.aoj;
import tb.apr;
import tb.kge;
import tb.rqd;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile m f2107a;
    private boolean b = false;
    private boolean c = false;

    static {
        kge.a(550398748);
    }

    private m() {
    }

    public static m a() {
        m mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("165efa1a", new Object[0]);
        }
        if (f2107a == null) {
            synchronized (m.class) {
                if (f2107a == null) {
                    f2107a = new m();
                }
                mVar = f2107a;
            }
            return mVar;
        }
        return f2107a;
    }

    public synchronized void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!rqd.bXmodule) {
        } else {
            if (this.b) {
                return;
            }
            apr.b("UnifiedSecuritySDK2", "initSecurity begin");
            String l = aob.a().l();
            if (l == null || l.isEmpty()) {
                l = any.d().c();
            }
            long currentTimeMillis = System.currentTimeMillis();
            UserTrackUFWrapper.init(context, l);
            apr.b("UnifiedSecuritySDK2", "init cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            this.c = true;
            apr.b("UnifiedSecuritySDK2", "initSecurity End");
            this.b = true;
        }
    }

    public synchronized HashMap<String, String> b() {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        } else if (!this.c) {
            return null;
        } else {
            HashMap<String, String> c = c();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                hashMap = UserTrackUFWrapper.getUFWrapper();
            } catch (Throwable th) {
                apr.b("UnifiedSecuritySDK2", th, "getSecurityFactorsImpl");
                hashMap = null;
            }
            if (hashMap != null && !hashMap.isEmpty()) {
                a(hashMap);
                hashMap.putAll(c);
                apr.b("UnifiedSecuritySDK2", "getSecurityFactorsImpl cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                apr.a("UnifiedSecuritySDK2", (Map<String, String>) hashMap);
                return hashMap;
            }
            return null;
        }
    }

    private void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        if (hashMap == null || hashMap.isEmpty()) {
            hashMap = new HashMap<>();
        }
        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key == null || key.isEmpty() || !key.startsWith("x-")) {
                it.remove();
            }
        }
    }

    private HashMap<String, String> c() {
        aoj b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String l = aob.a().l();
        if (l == null || l.isEmpty()) {
            l = any.d().c();
        }
        hashMap.put(HttpHeaderConstant.X_APPKEY, l);
        String m = aob.a().m();
        if ((m == null || m.isEmpty()) && (b = aoi.b(aob.a().k())) != null) {
            m = b.c();
        }
        hashMap.put(HttpHeaderConstant.X_APP_VER, m);
        hashMap.put(HttpHeaderConstant.X_UTDID, UTDevice.getUtdid(aob.a().k()));
        hashMap.put(HttpHeaderConstant.X_UID, aob.a().u());
        hashMap.put("x-pv", "1");
        hashMap.put(HttpHeaderConstant.X_TTID, aob.a().s());
        return hashMap;
    }
}
