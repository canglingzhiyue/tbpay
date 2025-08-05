package tb;

import android.content.SharedPreferences;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class bzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static bzt f26213a;

        static {
            kge.a(1190565636);
            f26213a = new bzt();
        }

        public static /* synthetic */ bzt a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bzt) ipChange.ipc$dispatch("f030982", new Object[0]) : f26213a;
        }
    }

    static {
        kge.a(-1598328783);
    }

    public static bzt a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bzt) ipChange.ipc$dispatch("f030982", new Object[0]) : a.a();
    }

    private SharedPreferences c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("d112f1be", new Object[]{this});
        }
        if (PopLayer.getReference() != null && PopLayer.getReference().getApp() != null) {
            return PopLayer.getReference().getApp().getSharedPreferences("sp_poplayer_xxx_yyy_zzz", 0);
        }
        return null;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            SharedPreferences c = c();
            return c == null ? i : c.getInt(str, i);
        } catch (Throwable th) {
            c.a("PopCountManager getPopCountsFor error.", th);
            return i;
        }
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        try {
            SharedPreferences c = c();
            if (c == null) {
                return -1;
            }
            int i = c.getInt(str, 0) + 1;
            c.edit().putInt(str, i).apply();
            return i;
        } catch (Throwable th) {
            c.a("PopCountManager increasePopCountsFor error.", th);
            return -1;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            SharedPreferences c = c();
            if (c == null) {
                return;
            }
            c.edit().putInt(str, -1).apply();
        } catch (Throwable th) {
            c.a("PopCountManager finishPop error.", th);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            SharedPreferences c = c();
            if (c == null) {
                return;
            }
            c.edit().clear().apply();
        } catch (Throwable th) {
            c.a("PopCountManager clearPopCounts error.", th);
        }
    }
}
