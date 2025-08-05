package com.alibaba.analytics.core.sync;

import android.text.TextUtils;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import tb.aob;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class UploadLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f2095a = 3;
    public f b = null;
    public NetworkStatus c = NetworkStatus.ALL;

    /* loaded from: classes.dex */
    public enum NetworkStatus {
        ALL,
        WIFI,
        TWO_GENERATION,
        THRID_GENERATION,
        FOUR_GENERATION,
        NONE
    }

    static {
        kge.a(1479546325);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i <= 0 || i > 10) {
            this.f2095a = 3;
        } else {
            this.f2095a = i;
        }
    }

    public void a(NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e03eca8", new Object[]{this, networkStatus});
        } else {
            this.c = networkStatus;
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617f9241", new Object[]{this, fVar});
        } else {
            this.b = fVar;
        }
    }

    public NetworkStatus a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatus) ipChange.ipc$dispatch("897699a8", new Object[]{this});
        }
        String a2 = NetworkUtil.a();
        if ("2G".equalsIgnoreCase(a2)) {
            return NetworkStatus.TWO_GENERATION;
        }
        if ("3G".equalsIgnoreCase(a2)) {
            return NetworkStatus.THRID_GENERATION;
        }
        if ("4G".equalsIgnoreCase(a2)) {
            return NetworkStatus.FOUR_GENERATION;
        }
        if ("Wi-Fi".equalsIgnoreCase(a2)) {
            return NetworkStatus.WIFI;
        }
        return NetworkStatus.NONE;
    }

    public void a(String str) {
        JSONObject jSONObject;
        Iterator<String> keys;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            apr.c(null, "Config Is Empty");
        } else {
            try {
                com.alibaba.analytics.core.config.g j = aob.a().j();
                if (j == null || (jSONObject = new JSONObject(str).getJSONObject("config")) == null) {
                    return;
                }
                Iterator<String> keys2 = jSONObject.keys();
                if (keys2 == null || !keys2.hasNext()) {
                    apr.d(null, "No Config Update");
                    return;
                }
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    if (!TextUtils.isEmpty(next)) {
                        HashMap hashMap = new HashMap();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null && (keys = jSONObject2.keys()) != null) {
                            while (keys.hasNext()) {
                                String next2 = keys.next();
                                if (jSONObject2.get(next2) == null) {
                                    str2 = null;
                                } else {
                                    str2 = jSONObject2.get(next2) + "";
                                }
                                hashMap.put(next2, str2);
                            }
                        }
                        apr.b("Config Update", "namespace", next, "configs", hashMap);
                        j.a(next, hashMap);
                    }
                }
            } catch (Throwable th) {
                apr.b("", th, new Object[0]);
            }
        }
    }
}
