package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.utils.h;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class kam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29915a;
    private static List<String> b;

    static {
        kge.a(-1715058601);
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f29915a = true;
            OrangeConfig.getInstance().registerListener(new String[]{"aranger"}, new a());
        } catch (Exception unused) {
            f29915a = false;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(h.a(jzv.a(), h.SP_ORI_NAME), h.SP_NAME);
        }
    }

    public static void a(Map<String, ?> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{map, str});
        } else if (!f29915a) {
            kak.b("OrangeAdapter", "no orange sdk", new Object[0]);
        } else if (map == null || map.isEmpty()) {
            kak.b("OrangeAdapter", "oriMap is empty", new Object[0]);
        } else {
            try {
                HashMap hashMap = new HashMap(2);
                hashMap.put("normal_changes_enabled", a(map, "normal_changes_enabled", "true"));
                hashMap.put("hook_services", a(map, "hook_services", "com.taobao.login4android.aidl.LoginService,anetwork.channel.aidl.NetworkService,com.alibaba.android.nextrpc.internal.accs.AccsReceiveService,com.taobao.calendar.bridge.service.CalendarServiceImpl"));
                hashMap.put("provider_retry_times", a(map, "provider_retry_times", "3"));
                h.a(jzv.a(), str, hashMap);
            } catch (Throwable th) {
                kak.a("OrangeAdapter", "saveConfig err", th, new Object[0]);
            }
        }
    }

    private static String a(Map<String, ?> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2}) : map.containsKey(str) ? String.valueOf(map.get(str)) : str2;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            return h.a(jzv.a(), "normal_changes_enabled", true);
        } catch (Throwable th) {
            kak.a("OrangeAdapter", "normalChangesEnabled err", th, new Object[0]);
            return true;
        }
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[0]);
        }
        if (b == null) {
            try {
                b = Arrays.asList(h.a(jzv.a(), "hook_services", "com.taobao.login4android.aidl.LoginService,anetwork.channel.aidl.NetworkService,com.alibaba.android.nextrpc.internal.accs.AccsReceiveService,com.taobao.calendar.bridge.service.CalendarServiceImpl").split(","));
            } catch (Throwable th) {
                kak.a("OrangeAdapter", "normalChangesEnabled err", th, new Object[0]);
                b = Collections.emptyList();
            }
        }
        return b;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(h.a(jzv.a(), "provider_retry_times", "3"));
        } catch (Throwable th) {
            kak.a("OrangeAdapter", "getProviderRetryTimes err", th, new Object[0]);
            return 3;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(508566799);
            kge.a(-498751155);
        }

        @Override // com.taobao.orange.g
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                return;
            }
            try {
                if (!"aranger".equals(str)) {
                    return;
                }
                kak.b("OrangeAdapter", "aranger onConfigUpdate", new Object[0]);
                kam.a(OrangeConfig.getInstance().getConfigs("aranger"), h.SP_ORI_NAME);
            } catch (Throwable th) {
                kak.a("OrangeAdapter", "onConfigUpdate", th, new Object[0]);
            }
        }
    }
}
