package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class mpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Float> f31184a = new ConcurrentHashMap();

    public static void a(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba89c4", new Object[]{str, str2, new Float(f)});
            return;
        }
        b(str, f);
        if (str2 != null) {
            str = str + "_" + str2;
        }
        f31184a.put(str, Float.valueOf(f));
    }

    public static void a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123a1ce", new Object[]{str, new Float(f)});
        } else {
            a(str, null, f);
        }
    }

    public static float a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6c", new Object[]{str, str2})).floatValue();
        }
        if (str2 != null) {
            str = str + "_" + str2;
        }
        Float f = f31184a.get(str);
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue() : a(str, (String) null);
    }

    private static void b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d2530ad", new Object[]{str, new Float(f)});
        } else if (StringUtils.isEmpty(str)) {
            throw new IllegalArgumentException("pageName must not null");
        } else {
            if (f <= 1.0f && f >= 0.0f) {
                return;
            }
            throw new IllegalArgumentException("percent must in [0,1]");
        }
    }
}
