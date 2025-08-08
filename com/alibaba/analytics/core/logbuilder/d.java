package com.alibaba.analytics.core.logbuilder;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class d implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f2084a;
    private Map<String, String> b = Collections.synchronizedMap(new HashMap());

    static {
        kge.a(2080008866);
        kge.a(-2114741388);
    }

    public d() {
        com.alibaba.analytics.core.config.f.a().a("loglevel", this);
        a("loglevel", com.alibaba.analytics.core.config.f.a().a("loglevel"));
    }

    public static synchronized d a() {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("6fb8f847", new Object[0]);
            }
            if (f2084a == null) {
                f2084a = new d();
            }
            return f2084a;
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String b = b(str);
        return !StringUtils.isEmpty(b) ? b : "3";
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.b.get(str);
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.b.clear();
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!StringUtils.isEmpty(optString) && !StringUtils.isEmpty(optString)) {
                    this.b.put(next, optString);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
