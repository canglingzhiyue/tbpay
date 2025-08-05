package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.trtc.impl.h;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.e;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class qvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Map<String, String> f33069a;
    private static AtomicBoolean b;

    static {
        kge.a(-2089569683);
        f33069a = null;
        b = new AtomicBoolean(false);
    }

    public static synchronized void a() {
        synchronized (qvc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (b.get()) {
            } else {
                if (OrangeConfig.getInstance() == null) {
                    TrtcLog.d("TrtcOrange", "OrangeConfig instance is null.");
                    return;
                }
                b(OrangeConfig.getInstance().getConfigs("artc_sdk"));
                OrangeConfig.getInstance().registerListener(new String[]{"artc_sdk"}, $$Lambda$P_ROItHJzSqra8E4JJVqVycOy8.INSTANCE, true);
                b.set(true);
            }
        }
    }

    public static synchronized void b() {
        synchronized (qvc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            if (OrangeConfig.getInstance() != null) {
                OrangeConfig.getInstance().unregisterListener(new String[]{"artc_sdk"});
            }
            b.set(false);
        }
    }

    public static synchronized void a(String str, Map<String, String> map) {
        synchronized (qvc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{str, map});
                return;
            }
            TrtcLog.d("TrtcOrange", "onConfigUpdate nameSpace: " + str + " ,args: " + map);
            b(OrangeConfig.getInstance().getConfigs("artc_sdk"));
            StringBuilder sb = new StringBuilder();
            sb.append("onConfigUpdate configs: ");
            sb.append(f33069a);
            TrtcLog.d("TrtcOrange", sb.toString());
            if (f33069a != null) {
                a(f33069a);
            }
        }
    }

    private static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        String jSONString = JSON.toJSONString(map);
        if (TextUtils.isEmpty(jSONString)) {
            return;
        }
        try {
            e.a(h.f23132a, "TrtcOrangeConfigs", jSONString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else if (map == null) {
        } else {
            TrtcLog.d("TrtcOrange", "updateCurOrangeConfigs: " + map);
            f33069a = map;
        }
    }

    public static synchronized String c() {
        synchronized (qvc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
            } else if (f33069a == null) {
                return "";
            } else {
                return JSON.toJSONString(f33069a);
            }
        }
    }

    public static boolean a(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : (f33069a == null || (str2 = f33069a.get(str)) == null || str2.length() == 0) ? z : str2.equalsIgnoreCase("true") || str2.equals("1");
    }

    public static String a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : (f33069a == null || (str3 = f33069a.get(str)) == null || str3.length() == 0) ? str2 : str3;
    }

    public static int a(String str, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (f33069a == null || (str2 = f33069a.get(str)) == null) {
            return i;
        }
        if (str2.length() != 0) {
            try {
            } catch (Throwable unused) {
                return i;
            }
        }
        return Integer.parseInt(str2);
    }

    public static float a(String str, float f) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        if (f33069a == null || (str2 = f33069a.get(str)) == null) {
            return f;
        }
        if (str2.length() != 0) {
            try {
            } catch (Throwable unused) {
                return f;
            }
        }
        return Float.parseFloat(str2);
    }
}
