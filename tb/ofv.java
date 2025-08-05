package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ofv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class f32019a;

    static {
        kge.a(904086492);
        try {
            f32019a = Class.forName("android.text.Layout$Ellipsizer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue();
        }
        Class cls = f32019a;
        return cls != null && cls.isInstance(charSequence);
    }
}
