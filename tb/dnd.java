package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f26865a;
    public static String b;
    public boolean c;

    static {
        kge.a(-637292022);
        f26865a = "downloading";
        b = "not_found";
    }

    public dnd(boolean z) {
        this.c = z;
    }

    public dnd(boolean z, String str) {
        this.c = z;
    }

    public static dnd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dnd) ipChange.ipc$dispatch("f03c344", new Object[0]) : new dnd(false);
    }

    public static dnd b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dnd) ipChange.ipc$dispatch("16b568a3", new Object[0]) : new dnd(true, "success");
    }

    public static dnd a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dnd) ipChange.ipc$dispatch("7c6e6c3a", new Object[]{str}) : new dnd(false, str);
    }
}
