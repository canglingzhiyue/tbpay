package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class ala {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ala d;

    /* renamed from: a  reason: collision with root package name */
    public float f25416a;
    public int b;
    public int c;

    public static ala a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ala) ipChange.ipc$dispatch("34c0ff50", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        ala alaVar = d;
        if (alaVar != null) {
            return alaVar;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ala alaVar2 = new ala();
        d = alaVar2;
        alaVar2.f25416a = displayMetrics.density;
        d.c = displayMetrics.heightPixels;
        d.b = displayMetrics.widthPixels;
        return d;
    }
}
