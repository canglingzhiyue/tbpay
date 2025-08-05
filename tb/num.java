package tb;

import android.taobao.safemode.h;
import android.taobao.safemode.k;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class num {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f31775a;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (f31775a == null) {
            k c = h.a().c();
            f31775a = Boolean.valueOf(c != null ? c.f1531a : Boolean.TRUE.booleanValue());
        }
        Boolean bool = f31775a;
        f31775a = Boolean.TRUE;
        return bool.booleanValue();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            f31775a = Boolean.TRUE;
        }
    }
}
