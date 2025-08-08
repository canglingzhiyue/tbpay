package tb;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.GravityCompat;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.HashMap;
import mtopsdk.common.util.SymbolExpUtil;
import tb.ohe;

/* loaded from: classes8.dex */
public final class odx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COLOR_BACKGROUND = 2;
    public static final int COLOR_FOREGROUND = 1;
    public static final int COLOR_TEXT = 0;
    public static final String THEME_AUTO = "auto";
    public static final String THEME_FORCE_DARK = "forcedark";
    public static final int UNDEFINED_COLOR = 1;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Integer> f31964a;

    static {
        kge.a(-748731706);
        f31964a = new HashMap<>();
    }

    public static int a(Context context, int i, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("275d47b2", new Object[]{context, new Integer(i), obj})).intValue() : a(context, i, a(obj));
    }

    public static int a(Context context, int i, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c44c62e8", new Object[]{context, new Integer(i), obj, new Boolean(z)})).intValue() : a(context, i, a(obj), z);
    }

    public static int a(Context context, int i, Object obj, aa.g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15ac7343", new Object[]{context, new Integer(i), obj, gVar, new Boolean(z)})).intValue();
        }
        if (gVar != null && z && gVar.b) {
            if ("auto".equals(gVar.f20302a)) {
                return a(context, i, obj);
            }
            if (THEME_FORCE_DARK.equals(gVar.f20302a)) {
                return a(i, a(obj));
            }
        }
        return a(obj);
    }

    public static int a(Context context, int i, Object obj, aa.g gVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fe2a977", new Object[]{context, new Integer(i), obj, gVar, new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (gVar != null && z && gVar.b) {
            if ("auto".equals(gVar.f20302a)) {
                return a(context, i, obj, z2);
            }
            if (THEME_FORCE_DARK.equals(gVar.f20302a)) {
                return a(i, a(obj));
            }
        }
        return a(obj);
    }

    @Deprecated
    public static int a(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("74de81a0", new Object[]{context, new Integer(i), str})).intValue() : a(context, i, a(str));
    }

    private static int a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c642cb3", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        g x = a.a().x();
        return (x == null || !x.a(context) || !x.b(context)) ? i2 : a(i, i2);
    }

    private static int a(Context context, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("221e07", new Object[]{context, new Integer(i), new Integer(i2), new Boolean(z)})).intValue();
        }
        g x = a.a().x();
        return (x == null || (!x.a(context) && (!z || !x.c(context))) || !x.b(context)) ? i2 : a(i, i2);
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        g x = a.a().x();
        return x != null ? x.a(i, i2) : i2;
    }

    public static int a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{obj})).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof CharSequence)) {
            return 1;
        }
        return a(obj.toString());
    }

    @Deprecated
    public static int a(String str) {
        String str2;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null || str.isEmpty()) {
            return 1;
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_random)) {
            int currentTimeMillis = (int) (System.currentTimeMillis() % 255);
            return Color.argb(255, currentTimeMillis, currentTimeMillis, currentTimeMillis);
        }
        Integer num = f31964a.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = 0;
        if (str.startsWith("rgb(")) {
            String[] split = str.substring(4, str.length() - 1).split(",");
            num2 = Integer.valueOf(Color.rgb(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue()));
        } else if (str.startsWith("rgba(")) {
            String[] split2 = str.substring(5, str.length() - 1).split(",");
            float f2 = 1.0f;
            try {
                f = Float.parseFloat(split2[3].trim());
            } catch (Exception unused) {
                f = 1.0f;
            }
            if (f <= 1.0f) {
                f2 = f;
            }
            num2 = Integer.valueOf(Color.argb((int) (f2 * 255.0f), Integer.valueOf(split2[0].trim()).intValue(), Integer.valueOf(split2[1].trim()).intValue(), Integer.valueOf(split2[2].trim()).intValue()));
        } else {
            try {
                if (str.charAt(0) == '#') {
                    if (str.length() > 7) {
                        str2 = '#' + str.substring(7) + str.substring(1, 7);
                    } else if (str.length() < 7) {
                        if (str.length() == 4) {
                            str2 = "#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3);
                        } else if (str.length() == 5) {
                            str2 = "#" + str.charAt(4) + str.charAt(4) + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3);
                        }
                    }
                    num2 = Integer.valueOf(Color.parseColor(str2));
                }
                num2 = Integer.valueOf(Color.parseColor(str2));
            } catch (IllegalArgumentException unused2) {
                ogg.b("unknown color " + str2);
            }
            str2 = str;
        }
        f31964a.put(str, num2);
        return num2.intValue();
    }

    public static String a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null) {
            return null;
        }
        ohe.a a2 = ohe.a();
        for (int i = 0; i < strArr.length; i++) {
            a2.a(strArr[i]);
            if (i < strArr.length - 1) {
                a2.a("|");
            }
        }
        return a2.toString();
    }

    public static String[] b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c6368814", new Object[]{obj});
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return ((String) obj).split(SymbolExpUtil.SYMBOL_VERTICALBAR);
    }

    public static boolean a(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4420b40c", new Object[]{strArr, strArr2})).booleanValue();
        }
        if (strArr != null && strArr.length == 0) {
            strArr = null;
        }
        if (strArr2 != null && strArr2.length == 0) {
            strArr2 = null;
        }
        if (strArr == strArr2) {
            return true;
        }
        if (strArr != null && strArr2 != null) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (StringUtils.equals(str, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        String[] split = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        if (split == null) {
            return 0;
        }
        int i = 0;
        for (String str2 : split) {
            i |= m(str2.trim());
        }
        return i;
    }

    private static int m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6df97b31", new Object[]{str})).intValue();
        }
        if (str.equals("center")) {
            return 17;
        }
        if (str.equals("center-horizontal")) {
            return 1;
        }
        if (str.equals("center-vertical")) {
            return 16;
        }
        return (!str.equals("left") && str.equals("right")) ? GravityCompat.END : GravityCompat.START;
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue() : ohj.a(str);
    }

    public static String[] d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("52e2b884", new Object[]{str});
        }
        if (str != null) {
            return oec.a(str.replace(riy.BRACKET_END_STR, "").replace(riy.BRACKET_START_STR, ",").replace(" ", ""), ',');
        }
        return null;
    }

    public static StringUtils.TruncateAt e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringUtils.TruncateAt) ipChange.ipc$dispatch("13c5842c", new Object[]{str});
        }
        if (str.equals("start")) {
            return StringUtils.TruncateAt.START;
        }
        if (str.equals("middle")) {
            return StringUtils.TruncateAt.MIDDLE;
        }
        if (str.equals("end")) {
            return StringUtils.TruncateAt.END;
        }
        if (str.equals("marquee")) {
            return StringUtils.TruncateAt.MARQUEE;
        }
        if (!str.equals("clip")) {
            return StringUtils.TruncateAt.END;
        }
        return null;
    }

    public static YogaWrap f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaWrap) ipChange.ipc$dispatch("74d8ccf0", new Object[]{str});
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_wrap)) {
            return YogaWrap.WRAP;
        }
        if (str.equals("nowrap")) {
            return YogaWrap.NO_WRAP;
        }
        return YogaWrap.WRAP;
    }

    public static YogaFlexDirection g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaFlexDirection) ipChange.ipc$dispatch("8041e157", new Object[]{str});
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_row)) {
            return YogaFlexDirection.ROW;
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_column)) {
            return YogaFlexDirection.COLUMN;
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_row_reverse)) {
            return YogaFlexDirection.ROW_REVERSE;
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_column_reverse)) {
            return YogaFlexDirection.COLUMN_REVERSE;
        }
        ogg.b("unknow flexDirection " + str);
        return YogaFlexDirection.COLUMN;
    }

    public static YogaJustify h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaJustify) ipChange.ipc$dispatch("2b0faa8e", new Object[]{str});
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_start)) {
            return YogaJustify.FLEX_START;
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_end)) {
            return YogaJustify.FLEX_END;
        }
        if (str.equals("center")) {
            return YogaJustify.CENTER;
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_space_between)) {
            return YogaJustify.SPACE_BETWEEN;
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_space_around)) {
            return YogaJustify.SPACE_AROUND;
        }
        ogg.b("unknow justifyContent " + str);
        return YogaJustify.FLEX_START;
    }

    public static YogaAlign i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaAlign) ipChange.ipc$dispatch("cb06873a", new Object[]{str});
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_start)) {
            return YogaAlign.FLEX_START;
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_end)) {
            return YogaAlign.FLEX_END;
        }
        if (str.equals("center")) {
            return YogaAlign.CENTER;
        }
        if (str.equals("stretch")) {
            return YogaAlign.STRETCH;
        }
        if (str.equals("auto")) {
            return YogaAlign.AUTO;
        }
        ogg.b("unknow alignItems " + str);
        return YogaAlign.FLEX_START;
    }

    public static YogaPositionType j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaPositionType) ipChange.ipc$dispatch("558ae1d3", new Object[]{str});
        }
        if (str.equals("absolute") || str.equals("fixed")) {
            return YogaPositionType.ABSOLUTE;
        }
        return YogaPositionType.RELATIVE;
    }

    public static int k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d99648af", new Object[]{str})).intValue();
        }
        if (str.equals("center")) {
            return 0;
        }
        if (str.equals("top")) {
            return 1;
        }
        return str.equals("bottom") ? 2 : 0;
    }

    public static YogaDisplay l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaDisplay) ipChange.ipc$dispatch("75b188a0", new Object[]{str});
        }
        if ("none".equals(str)) {
            return YogaDisplay.NONE;
        }
        return YogaDisplay.FLEX;
    }
}
