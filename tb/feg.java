package tb;

import android.content.Context;
import android.os.Build;
import anet.channel.monitor.NetworkSpeed;
import anetwork.channel.monitor.Monitor;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class feg implements ehn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: tb.feg$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27853a = new int[NetworkUtils.MobileNetworkType.values().length];

        static {
            try {
                f27853a[NetworkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27853a[NetworkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27853a[NetworkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_4G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27854a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        static {
            kge.a(166877605);
        }
    }

    static {
        kge.a(1901278412);
        kge.a(358320944);
    }

    public feg() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.depends.DetailDescAppMonitor");
    }

    @Override // tb.ehn
    public void a(Context context, egy egyVar, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af29e7f0", new Object[]{this, context, egyVar, str, hashMap});
        } else if (context == null || egyVar == null) {
        } else {
            AppMonitor.Alarm.commitSuccess("Page_Detail", str, a(a(context, egyVar), hashMap));
        }
    }

    @Override // tb.ehn
    public void a(Context context, egy egyVar, String str, HashMap<String, String> hashMap, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3be504", new Object[]{this, context, egyVar, str, hashMap, str2, str3});
        } else if (context == null || egyVar == null) {
        } else {
            AppMonitor.Alarm.commitFail("Page_Detail", str, a(a(context, egyVar), hashMap), str2, str3);
        }
    }

    private static a a(Context context, egy egyVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("762042e8", new Object[]{context, egyVar});
        }
        a aVar = new a();
        aVar.f27854a = egyVar.c;
        aVar.b = egyVar.f27302a;
        d a2 = c.a();
        if (a2 != null) {
            aVar.c = a2.a("mobileModel", Build.MODEL);
            aVar.d = a2.a("deviceScore", -1) == 2 ? "low" : "high";
        }
        aVar.g = Monitor.getNetSpeed() == NetworkSpeed.Fast ? com.taobao.android.weex_framework.util.a.ATOM_EXT_strong : "weak";
        if (NetworkUtils.c(context) == NetworkUtils.ConnectType.CONNECT_TYPE_WIFI) {
            str = "wifi";
        } else {
            int i = AnonymousClass1.f27853a[NetworkUtils.e(context).ordinal()];
            str = i != 1 ? i != 2 ? i != 3 ? "none" : "4g" : "3g" : "2g";
        }
        aVar.f = str;
        return aVar;
    }

    private static String a(a aVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53109c40", new Object[]{aVar, hashMap});
        }
        HashMap hashMap2 = new HashMap();
        if (aVar != null) {
            hashMap2.put("item_id", aVar.f27854a);
            hashMap2.put("user_id", aVar.b);
            hashMap2.put("device_model", aVar.c);
            hashMap2.put("ha_perf", aVar.d);
            hashMap2.put("ha_health", aVar.e);
            hashMap2.put("network", aVar.f);
            hashMap2.put("netstats", aVar.g);
        }
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        if (hashMap2.isEmpty()) {
            return null;
        }
        return a(hashMap2)[0];
    }

    public static String[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String[] strArr = {""};
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        int i = 0;
        for (Map.Entry<String, String> entry : entrySet) {
            if (i == entrySet.size() - 1) {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue();
            } else {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue() + ",";
            }
            i++;
        }
        return strArr;
    }
}
