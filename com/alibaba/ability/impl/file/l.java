package com.alibaba.ability.impl.file;

import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Object f1893a;
    private static volatile Method b;

    static {
        kge.a(884301485);
    }

    private static Object a() {
        if (f1893a == null) {
            synchronized (l.class) {
                if (f1893a == null) {
                    try {
                        f1893a = Class.forName("libcore.io.Libcore").getField("os").get(null);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return f1893a;
    }

    private static Method b() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("33fb52b5", new Object[0]);
        }
        if (b == null) {
            synchronized (m.class) {
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

    public static m a(String str) {
        Method b2;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                StructStat stat = Os.stat(str);
                return new m(stat.st_dev, stat.st_ino, stat.st_mode, stat.st_nlink, stat.st_uid, stat.st_gid, stat.st_rdev, stat.st_size, stat.st_atime, stat.st_mtime, stat.st_ctime, stat.st_blksize, stat.st_blocks);
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
            return new m(invoke);
        } catch (Exception unused2) {
            return null;
        }
    }
}
