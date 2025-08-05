package tb;

import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class tlk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Object f34190a;
    private static volatile Method b;

    static {
        kge.a(-612873907);
    }

    private static Object a() {
        if (f34190a == null) {
            synchronized (tlk.class) {
                if (f34190a == null) {
                    try {
                        f34190a = Class.forName("libcore.io.Libcore").getField("os").get(null);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return f34190a;
    }

    private static Method b() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("33fb52b5", new Object[0]);
        }
        if (b == null) {
            synchronized (tll.class) {
                if (b == null && (a2 = a()) != null) {
                    try {
                        b = a2.getClass().getMethod("stat", String.class);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return b;
    }

    public static tll a(String str) {
        Method b2;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                StructStat stat = Os.stat(str);
                return new tll(stat.st_dev, stat.st_ino, stat.st_mode, stat.st_nlink, stat.st_uid, stat.st_gid, stat.st_rdev, stat.st_size, stat.st_atime, stat.st_mtime, stat.st_ctime, stat.st_blksize, stat.st_blocks);
            } catch (Exception unused) {
                return null;
            }
        }
        Object a2 = a();
        if (a2 == null || (b2 = b()) == null) {
            return null;
        }
        try {
            Object invoke = b2.invoke(a2, str);
            if (invoke == null) {
                return null;
            }
            return new tll(invoke);
        } catch (Exception unused2) {
            return null;
        }
    }
}
