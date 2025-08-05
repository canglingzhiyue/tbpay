package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class soi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final int BOTTOM_BAR_HEIGHT = 112;
    public static final int DEFAULT_WND_HEIGHT = 1920;
    public static final int DEFAULT_WND_WIDTH = 1080;
    @Deprecated
    public static final int GUIDE_SHOPPING_BOTTOM_BAR_HEIGHT = 120;
    public static final float HIGH_ACTION_BAR_RATIO = 1.9444444f;
    @Deprecated
    public static final int LOW_BOTTOM_BAR_HEIGHT = 92;
    public static final int NEW_VERTICAL_BAR_HEIGHT = 112;
    @Deprecated
    public static final int TB_BOTTOM_BAR_HEIGHT = 48;
    public static final int TOPBAR_HEIGHT = 88;
    public static final int TOPBAR_TOP_Y = 71;

    static {
        kge.a(-777868145);
    }

    public static int a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fc4078d", new Object[]{fluidContext})).intValue();
        }
        return 92;
    }

    public static boolean a(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("270908d0", new Object[]{new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue() : z || ((float) i2) / ((float) i) >= 1.9444444f;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        return 84;
    }

    public static void a(FluidContext fluidContext, int i, int i2, boolean z, int i3, sjq sjqVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e606d5", new Object[]{fluidContext, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), sjqVar, new Boolean(z2)});
            return;
        }
        sjp a2 = a(fluidContext, z, i3, z2);
        spz.c("VideoUtils", "全屏页内部画幅计算，wndW：" + i + ",wndH:" + i2 + ",\nIVideoCommentSizeObject:" + sjqVar.toString() + ",\nconfig:" + a2);
        a(i, i2, sjqVar, a2);
    }

    public static void a(int i, int i2, sjq sjqVar, sjp sjpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6c5ed5", new Object[]{new Integer(i), new Integer(i2), sjqVar, sjpVar});
        } else if (sjqVar == null) {
        } else {
            sjqVar.m = sjpVar;
            int i3 = sjqVar.b;
            int i4 = sjqVar.f33635a;
            if (i3 == 0 || i4 == 0) {
                sjqVar.d = i;
                sjqVar.c = i2;
                return;
            }
            sjqVar.d = i;
            if (sjpVar == null) {
                return;
            }
            spz.c("VideoUtils", "画幅计算内部逻辑，wndW：" + i + ",wndH:" + i2 + ",\nIVideoCommentSizeObject:" + sjqVar + ",\nconfig:" + sjpVar);
            float f = 0.05f;
            if (sjpVar.d) {
                f = 0.065f;
            }
            if (sjpVar.f33634a && i2 > i) {
                float f2 = i3 / i4;
                float f3 = i / (i2 - sjpVar.f);
                if (f3 + f < f2) {
                    if (!sjpVar.b) {
                        sjqVar.c = i2 - sjpVar.f;
                        if (sjpVar.e) {
                            c(sjqVar);
                        } else {
                            b(sjqVar);
                        }
                    } else {
                        sjqVar.c = i2 - sjpVar.f;
                        a(sjpVar, i, i2, sjqVar);
                    }
                } else if (f3 - f <= f2) {
                    sjqVar.c = i2 - sjpVar.f;
                    a(sjqVar);
                } else {
                    sjqVar.c = i2;
                    if (sjpVar.c) {
                        sjqVar.c = i2 - sjpVar.f;
                    }
                    a(sjqVar);
                }
            } else {
                float f4 = i4 / i3;
                int i5 = sjpVar.d ? i2 - sjpVar.f : i2;
                sjqVar.c = i5;
                if (Math.abs((i5 / i) - f4) >= 0.16666667f) {
                    b(sjqVar);
                } else {
                    a(sjqVar);
                }
            }
            spz.c("VideoUtils", "[画幅]计算内部逻辑计算完成，wndW：" + i + ",wndH:" + i2 + ",\nIVideoCommentSizeObject:" + sjqVar + ",\nconfig:" + sjpVar);
        }
    }

    public static void a(sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fedc579e", new Object[]{sjqVar});
            return;
        }
        sjqVar.g = ImageView.ScaleType.CENTER_CROP;
        float f = sjqVar.d / sjqVar.b;
        float f2 = sjqVar.c / sjqVar.f33635a;
        if (f < f2) {
            sjqVar.h = (int) (sjqVar.b * f2);
            sjqVar.i = sjqVar.c;
            return;
        }
        sjqVar.h = sjqVar.d;
        sjqVar.i = (int) (sjqVar.f33635a * f);
    }

    public static void b(sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5f5e1f", new Object[]{sjqVar});
            return;
        }
        sjqVar.g = ImageView.ScaleType.FIT_CENTER;
        spz.c("VideoUtils", "[画幅]计算内部逻辑计算完成，fitCenter start ,IVideoCommentSizeObject:" + sjqVar);
        float f = ((float) sjqVar.d) / ((float) sjqVar.b);
        float f2 = ((float) sjqVar.c) / ((float) sjqVar.f33635a);
        if (f > f2) {
            sjqVar.h = (int) (sjqVar.b * f2);
            sjqVar.i = sjqVar.c;
        } else {
            sjqVar.h = sjqVar.d;
            sjqVar.i = (int) (sjqVar.f33635a * f);
            int i = (sjqVar.c - sjqVar.i) / 2;
            sjqVar.e = i;
            sjqVar.c = sjqVar.i;
            spz.c("VideoUtils", "[画幅] 修改showHeight为视频真实高度 " + sjqVar.c + " showMarginTop=" + i);
        }
        spz.c("VideoUtils", "[画幅]计算内部逻辑计算完成，fitCenter end,IVideoCommentSizeObject:" + sjqVar);
    }

    public static sjp a(FluidContext fluidContext, boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjp) ipChange.ipc$dispatch("80993a22", new Object[]{fluidContext, new Boolean(z), new Integer(i), new Boolean(z2)});
        }
        sjp sjpVar = new sjp();
        sjpVar.f33634a = true;
        sjpVar.b = spj.d(fluidContext);
        sjpVar.c = soq.a(fluidContext);
        FluidInstanceConfig instanceConfig = fluidContext.getInstanceConfig();
        sjpVar.g = instanceConfig.getTopBarHeight();
        sjpVar.h = instanceConfig.getTopBarY();
        sjpVar.d = z;
        sjpVar.e = z2;
        sjpVar.f = i;
        return sjpVar;
    }

    private static void a(sjp sjpVar, int i, int i2, sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380af415", new Object[]{sjpVar, new Integer(i), new Integer(i2), sjqVar});
            return;
        }
        b(sjqVar);
        if (sjpVar == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(sjpVar.g);
        Integer valueOf2 = Integer.valueOf(sjpVar.h);
        Integer valueOf3 = Integer.valueOf(valueOf.intValue() + valueOf2.intValue());
        float a2 = ohd.a(obu.e(), valueOf2.floatValue());
        float f = (i2 - sjqVar.i) / 2.0f;
        if (f > ohd.a(obu.e(), valueOf3.floatValue()) || f < a2) {
            return;
        }
        sjqVar.e = ohd.h(obu.e());
        sjqVar.c = i2 - sjqVar.e;
        a(sjqVar);
    }

    private static void c(sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe264a0", new Object[]{sjqVar});
            return;
        }
        sjqVar.g = ImageView.ScaleType.FIT_CENTER;
        float f = sjqVar.d / sjqVar.b;
        float f2 = sjqVar.c / sjqVar.f33635a;
        if (f > f2) {
            sjqVar.h = (int) (sjqVar.b * f2);
            sjqVar.i = sjqVar.c;
        } else {
            sjqVar.h = sjqVar.d;
            sjqVar.i = (int) (sjqVar.f33635a * f);
        }
        sjqVar.l = sjqVar.i;
        sjqVar.e = (sjqVar.c - sjqVar.i) / 2;
    }

    public static <T> void a(List<WeakReference<T>> list, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeecd4f5", new Object[]{list, t});
            return;
        }
        Iterator<WeakReference<T>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().get() == t) {
                it.remove();
            }
        }
    }

    public static String a(sjq sjqVar, ViewGroup viewGroup) {
        TextureView a2;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8a5c063", new Object[]{sjqVar, viewGroup});
        }
        if (viewGroup == null || (a2 = obv.a(viewGroup)) == null || (bitmap = a2.getBitmap()) == null) {
            return null;
        }
        Component.b bVar = new Component.b();
        bVar.c = bitmap;
        bVar.b = oec.b((View) a2);
        bVar.d = "#000000";
        if (sjqVar != null) {
            bVar.f = sjqVar.g == ImageView.ScaleType.CENTER_CROP ? "cover" : "contain";
        }
        String str = "videobitmap_" + bVar;
        ogu.a(str, bVar);
        return str;
    }

    public static int b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f4da18e", new Object[]{fluidContext})).intValue();
        }
        if (sjv.b(fluidContext)) {
            return 120;
        }
        if (spj.d(fluidContext) && c()) {
            return ohd.b(obu.e(), ohd.b((Context) obu.e(), 48));
        }
        return 112;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableActionBarHeight48Dp", true);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : (int) ((obx.c() / 750.0f) * 0.0f);
    }

    public static int a(FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1a03945", new Object[]{fluidInstance})).intValue() : fluidInstance.getInstanceConfig().getTopBarHeight();
    }

    public static int b(FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e349df64", new Object[]{fluidInstance})).intValue() : fluidInstance.getInstanceConfig().getTopBarY();
    }

    public static int c(FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4f38583", new Object[]{fluidInstance})).intValue() : b(fluidInstance) + a(fluidInstance);
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue();
        }
        odz a2 = ody.a().a(uri.getQueryParameter(FullPage.PRE_PLAYER_MAP_KEY));
        if (a2 == null) {
            return false;
        }
        return a2.p();
    }

    public static Pair<Integer, Integer> b(Uri uri) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bce24f48", new Object[]{uri});
        }
        odz a2 = ody.a().a(uri.getQueryParameter(FullPage.PRE_PLAYER_MAP_KEY));
        if (a2 != null ? a2.p() : false) {
            i = a2.b();
            i2 = a2.a();
        } else {
            try {
                int parseInt = !TextUtils.isEmpty(uri.getQueryParameter("videoHeight")) ? Integer.parseInt(uri.getQueryParameter("videoHeight")) : 0;
                try {
                    if (!TextUtils.isEmpty(uri.getQueryParameter("videoWidth"))) {
                        i2 = Integer.parseInt(uri.getQueryParameter("videoWidth"));
                    }
                } catch (Exception unused) {
                }
                i = parseInt;
            } catch (Exception unused2) {
                i = 0;
            }
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static String c(FluidContext fluidContext) {
        a activeCardMediaSetData;
        a.c a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb45e484", new Object[]{fluidContext}) : (fluidContext == null || (activeCardMediaSetData = ((ICardService) fluidContext.getService(ICardService.class)).getActiveCardMediaSetData()) == null || (a2 = activeCardMediaSetData.a()) == null) ? "" : a2.c;
    }

    private static boolean e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dea6fa2", new Object[]{fluidContext})).booleanValue() : ((IDataService) fluidContext.getService(IDataService.class)).isHasPageErrorShow();
    }

    public static boolean d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e60d5a1", new Object[]{fluidContext})).booleanValue() : skk.c() && e(fluidContext);
    }

    public static FrameLayout.LayoutParams a(Context context, sjq sjqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("d7ed3b47", new Object[]{context, sjqVar, new Boolean(z)});
        }
        if (sjt.u()) {
            z = true;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sjqVar.d, sjqVar.c);
        layoutParams.topMargin = z ? sjqVar.e : ohd.h(context);
        layoutParams.width = sjqVar.d;
        layoutParams.height = sjqVar.c;
        return layoutParams;
    }

    public static void a(snv snvVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ed668", new Object[]{snvVar, map});
        } else if (map != null && snvVar != null) {
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : entrySet) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                }
            }
            String sb2 = sb.toString();
            spz.c("dWInstance", "updatePlayExtParams， finalParam：" + sb2);
            HashMap hashMap = new HashMap(1);
            hashMap.put(obw.KEY_VIDEO_UPDATE_PARAMS, sb2);
            snvVar.a((Map<String, String>) hashMap);
        }
    }
}
