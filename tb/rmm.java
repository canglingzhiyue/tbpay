package tb;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.friend.a;

/* loaded from: classes9.dex */
public class rmm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLOR_RESOURCE = "@color/";
    public static final String DIMEN_RESOURCE = "@dimen/";
    public static final String DRAWABLE_RESOURCE = "@drawable/";
    public static final String LAYOUT_RESOURCE = "@layout/";
    public static final String STRING_RESOURCE = "@String/";

    static {
        kge.a(-577306390);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.startsWith("#")) {
            if (rlz.a().e().get(str) == null) {
                rlz.a().e().put(str, Integer.valueOf(Color.parseColor(str)));
            }
            return rlz.a().e().get(str).intValue();
        }
        return g(str);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : TextUtils.isEmpty(str) ? "" : k(str);
    }

    public static CharSequence c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("9ffa5e86", new Object[]{str}) : TextUtils.isEmpty(str) ? "" : l(str);
    }

    public static Drawable d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7064a5a5", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return h(str);
        }
        return null;
    }

    public static float e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb126", new Object[]{str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (str.startsWith(DIMEN_RESOURCE)) {
            return j(str);
        }
        try {
            return rmq.c(Float.parseFloat(str));
        } catch (Throwable unused) {
            return j(str);
        }
    }

    public static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.startsWith(DIMEN_RESOURCE)) {
            return i(str);
        }
        try {
            return rmq.c(Float.parseFloat(str));
        } catch (Throwable unused) {
            return i(str);
        }
    }

    public static int g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0cfe3ab", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.startsWith(COLOR_RESOURCE)) {
            str = str.replace(COLOR_RESOURCE, "");
        }
        try {
            if (rlx.a().d() != null && !TextUtils.isEmpty(rlx.a().b())) {
                int c = c(rlx.a().d(), str, rlx.a().b());
                if (c == 0) {
                    return m(str);
                }
                return rlx.a().d().getColor(c);
            }
            return m(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static int m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6df97b31", new Object[]{str})).intValue();
        }
        if (rlz.a().d().get(str) != null) {
            return rlz.a().d().get(str).intValue();
        }
        try {
            int c = c(rlx.a().e(), str, rlx.a().c());
            if (c != 0) {
                return rlx.a().e().getColor(c);
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static Drawable h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("a4190221", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(DRAWABLE_RESOURCE)) {
            str = str.replace(DRAWABLE_RESOURCE, "");
        }
        try {
            if (rlx.a().d() != null && !TextUtils.isEmpty(rlx.a().b())) {
                int b = b(rlx.a().d(), str, rlx.a().b());
                if (b == 0) {
                    return n(str);
                }
                return rlx.a().d().getDrawable(b);
            }
            return n(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static Drawable n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f1a78cdb", new Object[]{str});
        }
        try {
            int b = b(rlx.a().e(), str, rlx.a().c());
            if (b != 0) {
                return rlx.a().e().getDrawable(b);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4533162d", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.startsWith(DIMEN_RESOURCE)) {
            str = str.replace(DIMEN_RESOURCE, "");
        }
        try {
            if (rlx.a().d() != null && !TextUtils.isEmpty(rlx.a().b())) {
                int d = d(rlx.a().d(), str, rlx.a().b());
                if (d == 0) {
                    return o(str);
                }
                return rlx.a().d().getDimensionPixelSize(d);
            }
            return o(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static int o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25cadb3", new Object[]{str})).intValue();
        }
        try {
            int d = d(rlx.a().e(), str, rlx.a().c());
            if (d != 0) {
                return rlx.a().e().getDimensionPixelSize(d);
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static float j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f64af6b", new Object[]{str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (str.startsWith(DIMEN_RESOURCE)) {
            str = str.replace(DIMEN_RESOURCE, "");
        }
        try {
            if (rlx.a().d() != null && !TextUtils.isEmpty(rlx.a().b())) {
                int d = d(rlx.a().d(), str, rlx.a().b());
                if (d == 0) {
                    return p(str);
                }
                return rlx.a().d().getDimension(d);
            }
            return p(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    private static float p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c8e46f1", new Object[]{str})).floatValue();
        }
        try {
            int d = d(rlx.a().e(), str, rlx.a().c());
            if (d != 0) {
                return rlx.a().e().getDimension(d);
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711ebb64", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(STRING_RESOURCE)) {
            str = str.replace(STRING_RESOURCE, "");
        }
        try {
            if (rlx.a().d() != null && !TextUtils.isEmpty(rlx.a().b())) {
                int a2 = a(rlx.a().d(), str, rlx.a().b());
                if (a2 == 0) {
                    return q(str);
                }
                return rlx.a().d().getString(a2);
            }
            return q(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    private static String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bd2609e", new Object[]{str});
        }
        try {
            int a2 = a(rlx.a().e(), str, rlx.a().c());
            return a2 == 0 ? str : rlx.a().e().getString(a2);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static CharSequence l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("252e591d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(STRING_RESOURCE)) {
            str = str.replace(STRING_RESOURCE, "");
        }
        try {
            if (rlx.a().d() != null && !TextUtils.isEmpty(rlx.a().b())) {
                int a2 = a(rlx.a().d(), str, rlx.a().b());
                if (a2 == 0) {
                    return r(str);
                }
                return rlx.a().d().getText(a2);
            }
            return r(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    private static CharSequence r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("7dfbaad7", new Object[]{str});
        }
        try {
            int a2 = a(rlx.a().e(), str, rlx.a().c());
            return a2 == 0 ? str : rlx.a().e().getText(a2);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    private static int a(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bda56080", new Object[]{resources, str, str2})).intValue();
        }
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String a2 = a(str, "string", str2);
        int a3 = rlx.a().a(a2);
        if (a3 != 0) {
            return a3;
        }
        int identifier = resources.getIdentifier(str, "string", str2);
        rlx.a().a(a2, identifier);
        return identifier;
    }

    private static int b(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ff0155f", new Object[]{resources, str, str2})).intValue();
        }
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String a2 = a(str, a.CONTACTS_INFO_NOT_EMPTY_STATUS, str2);
        int a3 = rlx.a().a(a2);
        if (a3 != 0) {
            return a3;
        }
        int identifier = resources.getIdentifier(str, a.CONTACTS_INFO_NOT_EMPTY_STATUS, str2);
        rlx.a().a(a2, identifier);
        return identifier;
    }

    private static int c(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c23aca3e", new Object[]{resources, str, str2})).intValue();
        }
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String a2 = a(str, "color", str2);
        int a3 = rlx.a().a(a2);
        if (a3 != 0) {
            return a3;
        }
        int identifier = resources.getIdentifier(str, "color", str2);
        rlx.a().a(a2, identifier);
        return identifier;
    }

    private static int d(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44857f1d", new Object[]{resources, str, str2})).intValue();
        }
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String a2 = a(str, "dimen", str2);
        int a3 = rlx.a().a(a2);
        if (a3 != 0) {
            return a3;
        }
        int identifier = resources.getIdentifier(str, "dimen", str2);
        rlx.a().a(a2, identifier);
        return identifier;
    }

    private static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        StringBuffer stringBuffer = new StringBuffer(str3);
        stringBuffer.append(str2);
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
