package com.alibaba.analytics.core.config;

import android.text.TextUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.StringUtils;
import com.ut.device.UTDevice;
import java.util.Iterator;
import org.json.JSONObject;
import tb.aob;
import tb.apr;
import tb.kge;

/* loaded from: classes2.dex */
public class u implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "fu_hash";

    /* renamed from: a  reason: collision with root package name */
    private static u f2076a;
    private int b = -1;
    private int c;

    static {
        kge.a(-794684265);
        kge.a(-2114741388);
    }

    public u() {
        this.c = 100;
        this.c = Math.abs(StringUtils.hashCode(UTDevice.getUtdid(aob.a().k()))) % 100;
        f.a().a(KEY, this);
        a(KEY, f.a().a(KEY));
    }

    public static synchronized u a() {
        synchronized (u.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u) ipChange.ipc$dispatch("afc32f0b", new Object[0]);
            }
            if (f2076a == null) {
                f2076a = new u();
            }
            return f2076a;
        }
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.b = -1;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            apr.b("UTUploadCycleConfigMgr", "utdidMod", Integer.valueOf(this.c));
            apr.b("UTUploadCycleConfigMgr", "key", str, "value", str2);
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> keys = jSONObject.keys();
            while (true) {
                if (!keys.hasNext()) {
                    break;
                }
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    String[] split = optString.split("_");
                    if (split.length == 2) {
                        int a2 = a(split[0], -1);
                        int a3 = a(split[1], -1);
                        if (a2 >= 0 && a2 <= 100 && a3 >= 0 && a3 <= 100 && this.c >= a2 && this.c < a3) {
                            this.b = a(next, -1);
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            apr.b("UTUploadCycleConfigMgr", "fuCycleTime", Integer.valueOf(this.b));
        } catch (Throwable unused) {
            this.b = -1;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i = this.b;
        if (i > 0 && i <= 300) {
            return i;
        }
        int b = f.a().b("fu");
        if (b <= 0) {
            b = 30;
        }
        apr.b("UTUploadCycleConfigMgr", "getFuCycleTime", Integer.valueOf(b));
        return b;
    }

    private int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
