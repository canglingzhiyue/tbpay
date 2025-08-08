package tb;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class heq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LruCache<String, Object> f28576a;

    static {
        kge.a(1928900726);
        f28576a = new LruCache<>(2);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (StringUtils.isEmpty(str) || obj == null) {
        } else {
            f28576a.put(str, obj);
        }
    }

    public static <T> T a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            return (T) f28576a.get(str);
        }
        return null;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            f28576a.remove(str);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f28576a.evictAll();
        }
    }
}
