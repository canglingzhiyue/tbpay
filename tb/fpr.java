package tb;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;

/* loaded from: classes5.dex */
public class fpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f28099a;
    private static int b;
    private static float c;

    static {
        kge.a(-425881013);
        f28099a = -1;
        b = -1;
        c = -1.0f;
    }

    public static int a(Context context, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("726afe3a", new Object[]{context, obj, new Integer(i)})).intValue();
        }
        if (obj == null) {
            return i;
        }
        String lowerCase = String.valueOf(obj).toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            if (e.a()) {
                fpa.a(e.TAG, "size属性为空字符串");
            }
            return i;
        }
        try {
            int a2 = a(context);
            float c2 = c(context);
            if (lowerCase.contains("np")) {
                return (int) (Float.valueOf(Float.parseFloat(lowerCase.replace("np", ""))).floatValue() * c2);
            }
            if (lowerCase.contains("ap")) {
                return Math.round(a2 * (Float.valueOf(Float.parseFloat(lowerCase.replace("ap", ""))).floatValue() / 375.0f));
            }
            return Math.round(a2 * (Float.parseFloat(lowerCase) / 375.0f));
        } catch (NumberFormatException unused) {
            if (e.a()) {
                fpa.c(e.TAG, (String) obj, "写法错误，解析出错");
            }
            return i;
        }
    }

    private static float c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb8e", new Object[]{context})).floatValue();
        }
        if (c < 0.0f) {
            c = context.getResources().getDisplayMetrics().density;
        }
        return c;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (f28099a < 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f28099a = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return f28099a;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        if (b < 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            b = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return b;
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f)})).intValue() : (int) (f * context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f28099a = -1;
        c = -1.0f;
        if (e.b() == null) {
            return;
        }
        a(e.b());
        c(e.b());
    }

    public static boolean b() {
        Resources resources;
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Context b2 = e.b();
        return (b2 == null || (resources = b2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null || Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) == a(b2)) ? false : true;
    }
}
