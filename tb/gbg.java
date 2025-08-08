package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bg;
import com.taobao.android.dinamicx.model.f;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class gbg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_HEIGHT_SPEC;
    public static final String SUFFIX_DXP = "dxp";
    public static final int WIDTH_REFER = 375;

    /* renamed from: a  reason: collision with root package name */
    public static int f28282a;
    private static int b;
    private static float c;
    private static Map<String, Integer> d;
    private static boolean e;
    private static int f;
    private static int g;
    public static String h;

    static {
        kge.a(-2042137170);
        DEFAULT_HEIGHT_SPEC = DXWidgetNode.DXMeasureSpec.a(8388607, 0);
        b = -1;
        c = -1.0f;
        d = new ConcurrentHashMap();
        g = -1;
        h = "enableScreenConfig";
    }

    public static int a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d511020c", new Object[]{context, str, new Integer(i)})).intValue() : a(null, context, str, i);
    }

    public static int a(DinamicXEngine dinamicXEngine, Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32fcedbd", new Object[]{dinamicXEngine, context, str, new Integer(i)})).intValue() : a(dinamicXEngine, context, str, i, true);
    }

    public static int a(DinamicXEngine dinamicXEngine, Context context, String str, int i, boolean z) {
        int b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ca17e3d", new Object[]{dinamicXEngine, context, str, new Integer(i), new Boolean(z)})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            if (DinamicXEngine.j()) {
                fuw.a("DinamicX", "size属性为空字符串");
            }
            return i;
        } else if (d.containsKey(str)) {
            return d.get(str).intValue();
        } else {
            try {
                if (str.contains("np")) {
                    b2 = a(context, Float.valueOf(Float.parseFloat(str.replace("np", ""))).floatValue());
                } else if (str.contains("ap")) {
                    Float valueOf = Float.valueOf(Float.parseFloat(str.replace("ap", "")));
                    if (z && dinamicXEngine != null) {
                        b2 = a(dinamicXEngine, context, valueOf.floatValue());
                    } else {
                        b2 = b(context, valueOf.floatValue());
                    }
                } else {
                    float parseFloat = Float.parseFloat(str);
                    if (z && dinamicXEngine != null) {
                        b2 = a(dinamicXEngine, context, parseFloat);
                    } else {
                        b2 = b(context, parseFloat);
                    }
                }
                i = b2;
                if (f.e()) {
                    d.put(str, Integer.valueOf(i));
                }
            } catch (NumberFormatException unused) {
                if (DinamicXEngine.j()) {
                    fuw.c("DinamicX", str, "写法错误，解析出错");
                }
            }
            return i;
        }
    }

    public static int a(Context context, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f2)})).intValue() : Math.round(f2 * a(context));
    }

    @Deprecated
    public static int b(Context context, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f2)})).intValue() : Math.round(b(context) * (f2 / 375.0f));
    }

    @Deprecated
    public static DinamicXEngine a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("1d5e5e5d", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        DXWidgetNode b2 = gbh.b(view);
        if (!(b2 instanceof DXWidgetNode)) {
            return null;
        }
        return b2.getEngine();
    }

    public static int a(DinamicXEngine dinamicXEngine, Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534b544", new Object[]{dinamicXEngine, context, new Float(f2)})).intValue();
        }
        Context i = context == null ? DinamicXEngine.i() : context;
        if (f.h()) {
            return b(context, f2);
        }
        if (DinamicXEngine.j() && dinamicXEngine == null) {
            fuw.d("DXScreenTool", "ap2px 获取像素单位 engine 为空，请处理");
            throw new RuntimeException("获取像素单位 engine 为空，请处理");
        }
        Context N = dinamicXEngine == null ? null : dinamicXEngine.N();
        if (N == null) {
            N = i;
        }
        return c(dinamicXEngine, N, f2);
    }

    public static int a(Activity activity, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cabaf939", new Object[]{activity, new Float(f2)})).intValue();
        }
        bg f3 = u.f();
        return Math.round(f2 * (f3 == null ? 1.0f : f3.c(activity)) * a((Context) activity));
    }

    public static int b(Activity activity, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb8c0098", new Object[]{activity, new Float(f2)})).intValue();
        }
        bg f3 = u.f();
        return Math.round((f2 / (f3 == null ? 1.0f : f3.c(activity))) / a((Context) activity));
    }

    private static int c(DinamicXEngine dinamicXEngine, Context context, float f2) {
        float f3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c910ac6", new Object[]{dinamicXEngine, context, new Float(f2)})).intValue();
        }
        f a2 = f.a(dinamicXEngine);
        if (a2 != null && a2.d() != null) {
            return a2.d().ap2Px(dinamicXEngine, context, f2);
        }
        boolean a3 = f.a(a2);
        if (a2 != null) {
            i = a2.c();
        }
        if (!a3) {
            float f4 = f2 / 375.0f;
            if (i <= 0) {
                i = d(context);
            }
            return Math.round(i * f4);
        }
        bg f5 = u.f();
        if ((context instanceof Activity) && f5 != null) {
            f3 = f5.c((Activity) context);
        } else if (f.h()) {
            return b(context, f2);
        } else {
            f3 = 1.0f;
        }
        return Math.round(f2 * f3 * a(context));
    }

    public static int b(DinamicXEngine dinamicXEngine, Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38e2e005", new Object[]{dinamicXEngine, context, new Float(f2)})).intValue();
        }
        Activity i = context == null ? DinamicXEngine.i() : context;
        if (DinamicXEngine.j() && dinamicXEngine == null) {
            fuw.d("DXScreenTool", "px2ap 获取像素单位 engine 为空，请处理");
            throw new RuntimeException("获取像素单位 engine 为空，请处理");
        }
        Activity N = dinamicXEngine == null ? null : dinamicXEngine.N();
        if (N != null) {
            i = N;
        }
        if (f.h()) {
            return c(context, f2);
        }
        return d(dinamicXEngine, i, f2);
    }

    private static int d(DinamicXEngine dinamicXEngine, Context context, float f2) {
        float f3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a03f3587", new Object[]{dinamicXEngine, context, new Float(f2)})).intValue();
        }
        f a2 = f.a(dinamicXEngine);
        if (a2 != null && a2.d() != null) {
            return a2.d().px2Ap(dinamicXEngine, context, f2);
        }
        boolean a3 = f.a(a2);
        if (a2 != null) {
            i = a2.c();
        }
        if (!a3) {
            float f4 = f2 * 375.0f;
            if (i <= 0) {
                i = d(context);
            }
            return Math.round(f4 / i);
        }
        bg f5 = u.f();
        if ((context instanceof Activity) && f5 != null) {
            f3 = f5.c((Activity) context);
        } else if (f.h()) {
            return c(context, f2);
        } else {
            f3 = 1.0f;
        }
        return Math.round((f2 / f3) / a(context));
    }

    public static int c(Context context, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f611fd5", new Object[]{context, new Float(f2)})).intValue() : Math.round((f2 * 375.0f) / b(context));
    }

    public static float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a93", new Object[]{context, new Integer(i)})).floatValue() : (i / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static float d(Context context, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6449e813", new Object[]{context, new Float(f2)})).floatValue() : f2 / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static float a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6450", new Object[]{context})).floatValue() : a(context, false);
    }

    public static float a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fda64", new Object[]{context, new Boolean(z)})).floatValue();
        }
        if (c < 0.0f || z) {
            c = context.getResources().getDisplayMetrics().density;
        }
        return c;
    }

    private static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        bg f2 = u.f();
        if ((context instanceof Activity) && f2 != null) {
            return f2.a((Activity) context);
        }
        if (context == null) {
            context = DinamicXEngine.i();
        }
        return b(context, false);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : b(context, false);
    }

    public static int c(Context context) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (context != null && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    public static int b(Context context, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a78a2a8", new Object[]{context, new Boolean(z)})).intValue();
        }
        if (u.f() != null && !f.e()) {
            return u.f().a(context, z);
        }
        if (b < 0 || z) {
            if (context == null || context.getResources() == null) {
                return 0;
            }
            Configuration configuration = context.getResources().getConfiguration();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return 0;
            }
            if (!e || (i = f) == 3) {
                if (configuration != null && configuration.orientation == 1) {
                    b = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
                } else if (configuration != null && configuration.orientation == 2) {
                    b = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
                } else {
                    b = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
            } else if (i == 1) {
                b = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else if (i == 2) {
                b = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        return b;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : a(false);
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        bg f2 = u.f();
        if (f2 != null) {
            return DXWidgetNode.DXMeasureSpec.a(f2.a(activity), 1073741824);
        }
        return a();
    }

    public static int b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366e", new Object[]{activity})).intValue();
        }
        bg f2 = u.f();
        if (f2 != null) {
            return f2.a(activity);
        }
        return b((Context) activity);
    }

    public static int a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{new Boolean(z)})).intValue();
        }
        if ((f28282a == 0 || z) && DinamicXEngine.i() != null) {
            f28282a = DXWidgetNode.DXMeasureSpec.a(b(DinamicXEngine.i()), 1073741824);
        }
        return f28282a;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : DEFAULT_HEIGHT_SPEC;
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            a(z, (Activity) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public static void a(boolean z, Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0eeb1be", new Object[]{new Boolean(z), activity});
            return;
        }
        int i = b;
        Activity activity2 = activity;
        if (DinamicXEngine.i() == null) {
            return;
        }
        if (activity == null) {
            activity2 = DinamicXEngine.i();
        }
        if (f.e() || z) {
            z2 = true;
        }
        if (i == b(activity2, z2) && !z) {
            return;
        }
        a(true);
        a(DinamicXEngine.i(), true);
        d.clear();
        af.clearStaticField();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        bg f2 = u.f();
        return f2 == null || f2.b(DinamicXEngine.i());
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else if (e) {
        } else {
            f = i;
            e = true;
        }
    }
}
