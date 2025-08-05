package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes8.dex */
public class tmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f34208a;
    private static Boolean b;
    private static Boolean c;

    static {
        kge.a(-245549751);
        f34208a = null;
        b = null;
        c = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f34208a == null) {
            f34208a = Boolean.valueOf(Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enablePreMediaPlayer", "true")));
        }
        return f34208a.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enablePreCreateRecRoom", "true")));
        }
        return b.booleanValue();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = Boolean.valueOf(Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enablePreCreateJSB", "true")));
        }
        return c.booleanValue();
    }
}
