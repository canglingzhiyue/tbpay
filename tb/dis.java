package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes.dex */
public class dis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f26791a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;
    private static Boolean e;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Boolean bool = f26791a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.falco_full_trace").exists();
        f26791a = new Boolean(exists);
        return exists;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.falco_full_trace_v3").exists();
        b = new Boolean(exists);
        return exists;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.falco_load_visual").exists();
        c = new Boolean(exists);
        return exists;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.trace_falco").exists();
        d = new Boolean(exists);
        return exists;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean exists = new File("/data/local/tmp/.falco_env_enable").exists();
        e = new Boolean(exists);
        return exists;
    }
}
