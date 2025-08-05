package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.playcontrol.d;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class pqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<d> f32815a;
    private static String b;

    static {
        kge.a(-1341193256);
    }

    public static void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198228ac", new Object[]{str, dVar});
        } else if (str == null || str.equals(b)) {
        } else {
            b = str;
            f32815a = new WeakReference<>(dVar);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (str == null || !str.equals(b)) {
        } else {
            WeakReference<d> weakReference = f32815a;
            if (weakReference != null) {
                weakReference.clear();
                f32815a = null;
            }
            b = null;
        }
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6a7c0de8", new Object[0]);
        }
        WeakReference<d> weakReference = f32815a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
