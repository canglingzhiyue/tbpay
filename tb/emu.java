package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.e;
import com.taobao.android.u;
import java.util.Map;

/* loaded from: classes4.dex */
public class emu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27446a;

    static {
        kge.a(-1037055679);
        f27446a = b();
    }

    public static boolean c() {
        String str = "true";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            AliConfigInterface a2 = e.a();
            if (a2 != null) {
                str = a2.a("android_detail", "disable_pre_init", str);
            }
        } catch (Throwable unused) {
        }
        return Boolean.parseBoolean(str);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f27446a = b();
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        String str = "false";
        try {
            AliConfigInterface a2 = e.a();
            if (a2 != null) {
                str = a2.a("android_detail", "enable_code_track", "true");
            }
        } catch (Throwable unused) {
        }
        return Boolean.parseBoolean(str);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!f27446a) {
        } else {
            try {
                AliUserTrackerInterface a2 = u.a();
                if (a2 == null) {
                    return;
                }
                a2.a("Page_Detail", 2201, "codeTrack", null, null, "className=" + str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (f27446a) {
            try {
                StringBuilder sb = new StringBuilder();
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!StringUtils.isEmpty(key)) {
                            if (StringUtils.isEmpty(value)) {
                                value = "null";
                            }
                            sb.append(",");
                            sb.append(key);
                            sb.append("=");
                            sb.append(value);
                        }
                    }
                }
                AliUserTrackerInterface a2 = u.a();
                if (a2 == null) {
                    return;
                }
                a2.a("Page_Detail", 2201, "codeTrack", null, null, "className=" + str + sb.toString());
            } catch (Throwable unused) {
            }
        }
    }
}
