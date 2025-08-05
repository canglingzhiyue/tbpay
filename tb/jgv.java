package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f29545a;

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            i = context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Exception e) {
            jfj.b(e);
        }
        if (i == 0) {
            return null;
        }
        return context.getString(i);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        Boolean bool = f29545a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) == 0) {
                z = false;
            }
            f29545a = Boolean.valueOf(z);
        } catch (Exception unused) {
            f29545a = false;
        }
        return f29545a.booleanValue();
    }
}
