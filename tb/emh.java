package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Map;

/* loaded from: classes4.dex */
public class emh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIDE_INSIDE_ROUND_CORNER_HEIGHT = 3;

    /* renamed from: a  reason: collision with root package name */
    private static int f27427a = 0;
    public static final String sDefaultDimension = "1:1";

    public static /* synthetic */ void a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{view, new Integer(i), new Integer(i2)});
        } else {
            b(view, i, i2);
        }
    }

    static {
        kge.a(1812244832);
        f27427a = 0;
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailMainGalleryDimensionUtil");
    }

    public static String a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e359cb63", new Object[]{aURARenderComponent, str});
        }
        if (aURARenderComponent == null) {
            return str;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return a(aURARenderComponent.parent, str);
        }
        Map<String, Object> map = aURARenderComponentData.fields;
        if (map == null) {
            return a(aURARenderComponent.parent, str);
        }
        String str2 = (String) bbc.a(map, "dimension", String.class, "");
        return TextUtils.isEmpty(str2) ? a(aURARenderComponent.parent, str) : str2;
    }

    public static float b(AURARenderComponent aURARenderComponent, String str) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ff1616c", new Object[]{aURARenderComponent, str})).floatValue();
        }
        String a2 = a(aURARenderComponent, str);
        if (TextUtils.isEmpty(a2)) {
            return 1.0f;
        }
        String[] split = a2.split(":", 2);
        if (split.length < 2) {
            return 1.0f;
        }
        try {
            f = Float.parseFloat(split[0]) / Float.parseFloat(split[1]);
        } catch (Exception e) {
            ard a3 = arc.a();
            a3.c("AliSDetailMainGalleryDimensionUtil", "setViewDimension", "parse dimension exception|" + e.getMessage());
            f = 1.0f;
        }
        if (f > 0.0f) {
            return f;
        }
        ard a4 = arc.a();
        a4.c("AliSDetailMainGalleryDimensionUtil", "setViewDimension", "dimension[" + a2 + "]'ratio < 0, use default 1.0f");
        return 1.0f;
    }

    public static int a(Context context, int i, AURARenderComponent aURARenderComponent, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("efc34d05", new Object[]{context, new Integer(i), aURARenderComponent, str, new Boolean(z)})).intValue() : a(context, i, b(aURARenderComponent, str), z);
    }

    public static int a(Context context, int i, float f, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20c0ea", new Object[]{context, new Integer(i), new Float(f), new Boolean(z)})).intValue();
        }
        if (i <= 0) {
            arc.a().c("AliSDetailMainGalleryDimensionUtil", "getHeightBaseOnWidth", "width is zero");
            return 0;
        }
        if (!z && 1.0f == f) {
            i2 = a(context);
        }
        return ((int) (i / f)) + i2;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : ecr.a() + context.getResources().getDimensionPixelSize(R.dimen.ali_detail_core_action_bar_height);
    }

    public static float a(final View view, AURARenderComponent aURARenderComponent, final boolean z) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89427053", new Object[]{view, aURARenderComponent, new Boolean(z)})).floatValue();
        }
        final float b = b(aURARenderComponent, sDefaultDimension);
        ard a2 = arc.a();
        a2.a("AliSDetailMainGalleryDimensionUtil", "setViewDimensionBaseOnWidth", "dimension=" + b + "|for view=" + view);
        int width = view.getWidth();
        if (width == 0 && (layoutParams = view.getLayoutParams()) != null) {
            width = layoutParams.width;
        }
        if (width == 0) {
            view.post(new Runnable() { // from class: tb.emh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int width2 = view.getWidth();
                    emh.a(view, width2, emh.a(view.getContext(), width2, b, z));
                }
            });
        } else {
            b(view, width, a(view.getContext(), width, b, z));
        }
        return b;
    }

    private static void b(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfe6469", new Object[]{view, new Integer(i), new Integer(i2)});
        } else if (i == 0 || i2 == 0) {
            ard a2 = arc.a();
            a2.a("AliSDetailMainGalleryDimensionUtil", "", "wrong size,width=" + i + "|height=" + i2);
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i, i2);
            } else {
                layoutParams.width = i;
                layoutParams.height = i2;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public static int a(View view) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{view})).intValue();
        }
        int width = view.getWidth();
        if (width == 0 && (layoutParams = view.getLayoutParams()) != null) {
            width = layoutParams.width;
        }
        if (width > 0 || -2 == width) {
            return width;
        }
        if (-1 == width) {
            ViewParent parent = view.getParent();
            return !(parent instanceof View) ? width : a((View) parent);
        }
        return bay.b();
    }

    public static float b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0fef", new Object[]{context})).floatValue() : context.getResources().getDimensionPixelOffset(R.dimen.detail_d16);
    }
}
