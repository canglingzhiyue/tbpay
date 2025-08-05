package tb;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.apdid.OneApdidBridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized Map<String, String> a() {
        synchronized (cks.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
            }
            cke.a();
            ckc.a();
            HashMap hashMap = new HashMap();
            hashMap.put("AE1", cke.b());
            StringBuilder sb = new StringBuilder();
            sb.append(cke.c() ? "1" : "0");
            hashMap.put("AE2", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cke.d() ? "1" : "0");
            hashMap.put("AE3", sb2.toString());
            hashMap.put("AE4", cke.e());
            hashMap.put("AE5", cke.f());
            hashMap.put("AE6", cke.g());
            hashMap.put("AE7", cke.h());
            hashMap.put("AE8", cke.i());
            hashMap.put("AE9", cke.j());
            hashMap.put("AE10", cke.k());
            hashMap.put("AE11", cke.l());
            hashMap.put("AE12", cke.m());
            hashMap.put("AE13", cke.n());
            hashMap.put("AE14", cke.o());
            hashMap.put("AE15", cke.a("ro.kernel.qemu", "0"));
            hashMap.put("AE21", ckc.g());
            return hashMap;
        }
    }

    public static synchronized Map<String, String> a(Context context) {
        synchronized (cks.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
            }
            HashMap hashMap = new HashMap();
            try {
                new cko();
                hashMap.put("AE16", "");
                String oneData = OneApdidBridge.getOneData(context);
                if (cjw.a(oneData)) {
                    oneData = "{}";
                }
                hashMap.put("AO1", oneData);
            } catch (Throwable unused) {
            }
            return hashMap;
        }
    }
}
