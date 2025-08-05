package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.data.PreloadWeexData;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.taobao.R;
import kotlin.Pair;

/* loaded from: classes5.dex */
public class sjs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TABLET_BOTTOM_LABEL_HEIGHT = 114;

    static {
        kge.a(-984245933);
    }

    public static int a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{new Boolean(z)})).intValue() : z ? 0 : 112;
    }

    @Deprecated
    public static int a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fda67", new Object[]{context, new Boolean(z)})).intValue();
        }
        if (!z) {
            return 92;
        }
        if (!sop.a().b().b()) {
            return ohd.b(context, ohd.b(context, 48));
        }
        return 120;
    }

    public static int b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a78a2a8", new Object[]{context, new Boolean(z)})).intValue() : ohd.a(context, a(z));
    }

    @Deprecated
    public static int c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f616ae9", new Object[]{context, new Boolean(z)})).intValue() : ohd.a(context, a(context, z));
    }

    public static int a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fc4078d", new Object[]{fluidContext})).intValue();
        }
        if (obx.g()) {
            Application e = obu.e();
            return ohd.e(e, ohd.e((Context) e, 114));
        }
        boolean isHighActionbar = ((IContainerService) fluidContext.getService(IContainerService.class)).isHighActionbar();
        int oldActionBarHeight = ((IContainerService) fluidContext.getService(IContainerService.class)).getOldActionBarHeight();
        return oldActionBarHeight != 0 ? isHighActionbar ? soi.b(fluidContext) : soi.a(fluidContext) : oldActionBarHeight;
    }

    public static int c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ed73b8f", new Object[]{fluidContext})).intValue();
        }
        if (obx.g()) {
            Application e = obu.e();
            return ohd.e(e, ohd.e((Context) e, 114));
        }
        return a(spj.l(fluidContext));
    }

    public static int b(FluidContext fluidContext) {
        PreloadWeexData preloadWeexData;
        sjq preLoadVideoCommentSizeObject;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f4da18e", new Object[]{fluidContext})).intValue();
        }
        IPreloadService iPreloadService = (IPreloadService) fluidContext.getService(IPreloadService.class);
        if (iPreloadService != null && (preLoadVideoCommentSizeObject = iPreloadService.getPreLoadVideoCommentSizeObject()) != null && preLoadVideoCommentSizeObject.m != null) {
            i = ohd.b(fluidContext.getContext(), preLoadVideoCommentSizeObject.m.f);
        }
        IPreloadWeexService iPreloadWeexService = (IPreloadWeexService) fluidContext.getService(IPreloadWeexService.class);
        if (iPreloadWeexService != null && iPreloadWeexService.getPreloadWeexData() != null && (preloadWeexData = iPreloadWeexService.getPreloadWeexData()) != null) {
            String e = preloadWeexData.e();
            if (TextUtils.equals(e, PreloadWeexData.OUTSIDE_PRELOAD)) {
                i = 120;
            } else if (TextUtils.equals(e, PreloadWeexData.INNER_PRELOAD)) {
                i = 112;
            }
        }
        spz.c("VideoSizeUtil", "weex预创建，getBottomLabelHeightForPreloadWeexInstance:" + i);
        return i;
    }

    public static void a(FluidContext fluidContext, int i, int i2, boolean z, int i3, sjq sjqVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e606d5", new Object[]{fluidContext, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), sjqVar, new Boolean(z2)});
        } else if (obx.g()) {
            b(fluidContext, i, i2, z, i3, sjqVar, z2);
        } else {
            soi.a(fluidContext, i, i2, z, i3, sjqVar, z2);
        }
    }

    public static sjq a(Context context, View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjq) ipChange.ipc$dispatch("1679361a", new Object[]{context, view, new Boolean(z), new Boolean(z2)});
        }
        if (view == null) {
            return null;
        }
        sjq sjqVar = (sjq) view.getTag(R.id.fluid_sdk_tag_videosize_object);
        int a2 = obu.a(context, z);
        int f = ohd.f(context);
        spz.c("VideoSizeUtil", "setTab3QuickRenderPreCreateDWVideoSize:,availableHeight:" + a2 + ",wndWidth:" + f + ",wndHeight:" + a2 + "getRealWidthPixels:" + ohd.f(context) + ",getRealHeightPixels:" + ohd.g(context) + "，isTab3GuideShoppingVersion：" + z2);
        if (sjqVar == null) {
            sjqVar = new sjq(context, f, a2);
        }
        sjp sjpVar = new sjp();
        sjpVar.b = z;
        sjpVar.d = soi.a(z2, f, a2);
        if (sjt.u()) {
            sjpVar.f = b(context, spj.a(context, z));
        } else {
            sjpVar.f = c(context, sjpVar.d);
        }
        if (obx.g()) {
            a(f, a2, sjqVar, sjpVar);
        } else {
            soi.a(f, a2, sjqVar, sjpVar);
        }
        return sjqVar;
    }

    public static DWAspectRatio a(boolean z, sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("4eed2119", new Object[]{new Boolean(z), sjqVar});
        }
        DWAspectRatio dWAspectRatio = DWAspectRatio.DW_CENTER_CROP;
        if (!obx.f() || sjqVar == null) {
            return z ? DWAspectRatio.DW_FIT_CENTER : dWAspectRatio;
        }
        return sjqVar.g == ImageView.ScaleType.CENTER_CROP ? DWAspectRatio.DW_CENTER_CROP : DWAspectRatio.DW_FIT_CENTER;
    }

    public static Pair<sjq, FrameLayout.LayoutParams> a(FluidContext fluidContext, boolean z) {
        sjq sjqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1c34d863", new Object[]{fluidContext, new Boolean(z)});
        }
        boolean a2 = jam.a(z);
        if (!obx.g()) {
            if (!a2) {
                return null;
            }
            sjq sjqVar2 = new sjq(((IContainerService) fluidContext.getService(IContainerService.class)).getWindowWidth(), ((IContainerService) fluidContext.getService(IContainerService.class)).getWindowHeight());
            sjqVar2.g = ImageView.ScaleType.CENTER_CROP;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ohd.f(FluidSDK.getContext()), ohd.g(FluidSDK.getContext()));
            layoutParams.topMargin = -ohd.h(FluidSDK.getContext());
            return new Pair<>(sjqVar2, layoutParams);
        }
        int windowWidth = ((IContainerService) fluidContext.getService(IContainerService.class)).getWindowWidth();
        int windowHeight = ((IContainerService) fluidContext.getService(IContainerService.class)).getWindowHeight();
        if (windowWidth > windowHeight) {
            sjqVar = new sjq(1080, 1920);
        } else {
            sjqVar = new sjq(windowWidth, windowHeight);
        }
        a(fluidContext, windowWidth, windowHeight, false, 0, sjqVar, false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(sjqVar.h, sjqVar.i);
        layoutParams2.topMargin = sjqVar.e;
        return new Pair<>(sjqVar, layoutParams2);
    }

    private static void b(FluidContext fluidContext, int i, int i2, boolean z, int i3, sjq sjqVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba247674", new Object[]{fluidContext, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), sjqVar, new Boolean(z2)});
            return;
        }
        sjp a2 = soi.a(fluidContext, z, i3, z2);
        spz.c("VideoSizeUtil", "全屏页内部画幅计算大屏，wndW：" + i + ",wndH:" + i2 + ",\nIVideoCommentSizeObject:" + sjqVar.toString() + ",\nconfig:" + a2);
        a(i, i2, sjqVar, a2);
    }

    private static void a(int i, int i2, sjq sjqVar, sjp sjpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6c5ed5", new Object[]{new Integer(i), new Integer(i2), sjqVar, sjpVar});
        } else if (sjqVar == null) {
        } else {
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
            spz.c("VideoSizeUtil", "画幅计算内部逻辑大屏，wndW：" + i + ",wndH:" + i2 + ",\nIVideoCommentSizeObject:" + sjqVar + ",\nconfig:" + sjpVar);
            sjqVar.c = i2 - sjpVar.f;
            a(sjqVar);
            spz.c("VideoSizeUtil", "画幅计算内部逻辑计算完成大屏，wndW：" + i + ",wndH:" + i2 + ",\nIVideoCommentSizeObject:" + sjqVar + ",\nconfig:" + sjpVar);
        }
    }

    private static void a(sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fedc579e", new Object[]{sjqVar});
            return;
        }
        sjqVar.g = ImageView.ScaleType.FIT_CENTER;
        float f = sjqVar.d / sjqVar.b;
        float f2 = sjqVar.c / sjqVar.f33635a;
        if (f > f2) {
            sjqVar.h = (int) (sjqVar.b * f2);
            sjqVar.i = sjqVar.c;
            return;
        }
        sjqVar.h = sjqVar.d;
        sjqVar.i = (int) (sjqVar.f33635a * f);
    }
}
