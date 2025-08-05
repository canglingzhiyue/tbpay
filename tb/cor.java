package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static cop f26358a;

    static {
        kge.a(-943259517);
    }

    public static cos a(String str, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cos) ipChange.ipc$dispatch("cd2fb36e", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        cop copVar = f26358a;
        if (copVar == null) {
            throw new IllegalStateException("ImageAdapter is null");
        }
        return copVar.a(str, i, i2, i3, i4, i5);
    }

    public static void a(cop copVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d4ced4", new Object[]{copVar});
        } else {
            f26358a = copVar;
        }
    }
}
