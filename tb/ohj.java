package tb;

import android.content.Context;
import android.graphics.Typeface;
import mtopsdk.common.util.StringUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes8.dex */
public class ohj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Typeface> f32063a;

    static {
        kge.a(-740661219);
        f32063a = new HashMap<>();
    }

    public static Typeface a(Context context, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("5b336dea", new Object[]{context, str, str2, new Boolean(z), new Boolean(z2)});
        }
        int a2 = a(str2);
        if (a2 != 0 || StringUtils.isEmpty(str2) || "normal".equals(str2)) {
            str2 = null;
        }
        if (z2) {
            a2 = 1;
        }
        if (StringUtils.isEmpty(str)) {
            str = str2;
        }
        if (z) {
            str = "uik_iconfont.ttf";
        }
        if (StringUtils.isEmpty(str)) {
            if (a2 == 1) {
                return Typeface.SANS_SERIF;
            }
            return Typeface.create(a(context), a2);
        }
        Typeface typeface = f32063a.get(str);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), str);
            } catch (Exception unused) {
            }
            if (typeface == null) {
                typeface = a(context);
            }
            f32063a.put(str, typeface);
        }
        return Typeface.create(typeface, a2);
    }

    public static int a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        boolean z = false;
        boolean z2 = false;
        for (String str2 : str.toLowerCase().trim().split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
            if ("bold".equals(str2)) {
                z = true;
            } else if ("italic".equals(str2)) {
                z2 = true;
            }
        }
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static Typeface a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("53c5ec56", new Object[]{context});
        }
        Typeface typeface = f32063a.get("default");
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = new TextView(context).getTypeface();
        if (typeface2 == null) {
            typeface2 = Typeface.DEFAULT;
        }
        Typeface typeface3 = typeface2;
        f32063a.put("default", typeface3);
        return typeface3;
    }
}
