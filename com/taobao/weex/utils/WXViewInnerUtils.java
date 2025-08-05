package com.taobao.weex.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.flat.widget.Widget;
import com.taobao.weex.ui.flat.widget.WidgetGroup;
import com.taobao.weex.ui.view.border.BorderDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class WXViewInnerUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIMENSION_UNSET = -1;
    @Deprecated
    public static final int OPAQUE = -1;
    @Deprecated
    public static final int TRANSLUCENT = -3;
    @Deprecated
    public static final int TRANSPARENT = -2;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f23541a;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Opacity {
    }

    public static int getOpacityFromColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47f844b", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static int multiplyColorAlpha(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2025c0d9", new Object[]{new Integer(i), new Integer(i2)})).intValue() : i2 == 255 ? i : i2 == 0 ? i & 16777215 : (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    static {
        kge.a(-641507558);
        f23541a = new AtomicInteger(1);
    }

    public static int generateViewId() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ed9c66f", new Object[0])).intValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            do {
                i = f23541a.get();
                i2 = i + 1;
                if (i2 > 16777215) {
                    i2 = 1;
                }
            } while (!f23541a.compareAndSet(i, i2));
            return i;
        }
        return View.generateViewId();
    }

    public static int getWeexHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd9cb882", new Object[]{str})).intValue();
        }
        WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(str);
        if (sDKInstance == null) {
            return -3;
        }
        int P = sDKInstance.P();
        return (P >= 0 || P == -2) ? P : getScreenHeight(sDKInstance, sDKInstance.O());
    }

    public static int getWeexWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cc27cd3", new Object[]{str})).intValue();
        }
        WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(str);
        if (sDKInstance == null) {
            return -3;
        }
        int Q = sDKInstance.Q();
        return (Q >= 0 || Q == -2) ? Q : getScreenWidth(sDKInstance, sDKInstance.O());
    }

    public static int getScreenWidth(WXSDKInstance wXSDKInstance, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("834e1698", new Object[]{wXSDKInstance, context})).intValue();
        }
        if (wXSDKInstance == null) {
            return WXViewUtils.getScreenWidth(context);
        }
        Rect aX = wXSDKInstance.aX();
        if (aX == null) {
            return WXViewUtils.getScreenWidth(context);
        }
        return aX.width();
    }

    public static float getScreenDensity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb371fab", new Object[]{context})).floatValue();
        }
        if (context == null) {
            return 3.0f;
        }
        try {
            return context.getResources().getDisplayMetrics().density;
        } catch (Exception e) {
            WXLogUtils.e("getScreenDensityDpi exception:" + e.getMessage());
            return 3.0f;
        }
    }

    public static void updateApplicationScreen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6f11ee", new Object[]{context});
        } else if (context == null || WXEnvironment.sApplication == null) {
        } else {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            DisplayMetrics displayMetrics2 = WXEnvironment.sApplication.getResources().getDisplayMetrics();
            displayMetrics2.heightPixels = displayMetrics.heightPixels;
            displayMetrics2.widthPixels = displayMetrics.widthPixels;
            displayMetrics2.density = displayMetrics.density;
            displayMetrics2.densityDpi = displayMetrics.densityDpi;
            displayMetrics2.scaledDensity = displayMetrics.scaledDensity;
            displayMetrics2.xdpi = displayMetrics.xdpi;
        }
    }

    public static int getScreenHeight(WXSDKInstance wXSDKInstance, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ac9b0bd", new Object[]{wXSDKInstance, context})).intValue();
        }
        if (wXSDKInstance == null) {
            return WXViewUtils.getScreenHeight(context);
        }
        Rect aX = wXSDKInstance.aX();
        if (aX != null) {
            return aX.height();
        }
        return wXSDKInstance.x() ? WXViewUtils.getFullScreenHeight(context) : WXViewUtils.getScreenHeight(context);
    }

    @Deprecated
    public static float getRealPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a42f8b16", new Object[]{new Float(f)})).floatValue() : getRealPxByWidth(f, 750);
    }

    @Deprecated
    public static float getRealPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c24c8d", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * WXViewUtils.getScreenWidth()) / i;
        double d = screenWidth;
        if (d > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }

    public static float getRealPxByWidth(WXSDKInstance wXSDKInstance, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60a5d507", new Object[]{wXSDKInstance, new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        if (wXSDKInstance != null && wXSDKInstance.aS()) {
            return f * safeGetRadio(wXSDKInstance);
        }
        float screenWidth = (f * getScreenWidth(wXSDKInstance, wXSDKInstance == null ? WXEnvironment.sApplication : wXSDKInstance.O())) / i;
        double d = screenWidth;
        if (d > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }

    @Deprecated
    public static float getRealSubPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e7b328e", new Object[]{new Float(f)})).floatValue() : getRealSubPxByWidth(f, 750);
    }

    @Deprecated
    public static float getRealSubPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70eb9415", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * WXViewUtils.getScreenWidth()) / i;
        if (screenWidth > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return screenWidth;
    }

    public static float getRealSubPxByWidth(WXSDKInstance wXSDKInstance, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7b59c7f", new Object[]{wXSDKInstance, new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        if (wXSDKInstance != null && wXSDKInstance.aS()) {
            return f * safeGetRadio(wXSDKInstance);
        }
        float screenWidth = (f * getScreenWidth(wXSDKInstance, wXSDKInstance == null ? WXEnvironment.sApplication : wXSDKInstance.O())) / i;
        if (screenWidth > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return screenWidth;
    }

    @Deprecated
    public static float getWeexPxByReal(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62085835", new Object[]{new Float(f)})).floatValue() : getWeexPxByReal(f, 750);
    }

    @Deprecated
    public static float getWeexPxByReal(float f, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df03234e", new Object[]{new Float(f), new Integer(i)})).floatValue() : Float.isNaN(f) ? f : (f * i) / WXViewUtils.getScreenWidth();
    }

    @Deprecated
    public static float getRealPxByWidth2(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8dc8daa", new Object[]{new Float(f)})).floatValue() : getRealPxByWidth2(f, 750);
    }

    @Deprecated
    public static int getRealPxByWidth2(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32b59c7c", new Object[]{new Float(f), new Integer(i)})).intValue();
        }
        float screenWidth = (f * WXViewUtils.getScreenWidth()) / i;
        if (screenWidth > 0.005d && screenWidth < 1.0f) {
            return 1;
        }
        return ((int) screenWidth) - 1;
    }

    public static float getScale(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("191cbc63", new Object[]{wXSDKInstance})).floatValue();
        }
        return (getScreenWidth(wXSDKInstance, wXSDKInstance == null ? WXEnvironment.sApplication : wXSDKInstance.O()) / 750.0f) / getScreenDensity(WXEnvironment.sApplication);
    }

    @Deprecated
    public static float getWebPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab7eba0", new Object[]{new Float(f)})).floatValue() : getWebPxByWidth(f, 750);
    }

    @Deprecated
    public static float getWebPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c45fd43", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        double d = f;
        if (d < -1.9999d && d > -2.005d) {
            return Float.NaN;
        }
        float screenWidth = (f * i) / WXViewUtils.getScreenWidth();
        if (screenWidth > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return screenWidth;
    }

    public static float getWebPxByWidth(WXSDKInstance wXSDKInstance, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63f98d91", new Object[]{wXSDKInstance, new Float(f), new Integer(i)})).floatValue();
        }
        double d = f;
        if (d < -1.9999d && d > -2.005d) {
            return Float.NaN;
        }
        if (wXSDKInstance != null && wXSDKInstance.aS()) {
            return f * safeGetRadio(wXSDKInstance);
        }
        float screenWidth = (f * i) / getScreenWidth(wXSDKInstance, wXSDKInstance == null ? WXEnvironment.sApplication : wXSDKInstance.O());
        if (screenWidth > 0.005d && screenWidth < 1.0f) {
            return 1.0f;
        }
        return screenWidth;
    }

    public static float safeGetRadio(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ac67e45", new Object[]{wXSDKInstance})).floatValue();
        }
        if (wXSDKInstance != null) {
            return (wXSDKInstance.aT() * getScreenDensity(wXSDKInstance.O())) / 2.0f;
        }
        return 1.0f;
    }

    public static int dip2px(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        float f2 = 2.0f;
        try {
            f2 = WXEnvironment.getApplication().getResources().getDisplayMetrics().density;
        } catch (Exception e) {
            WXLogUtils.e("[WXViewUtils] dip2px:", e);
        }
        float f3 = (f * f2) + 0.5f;
        if (f3 > 0.0f && f3 < 1.0f) {
            return 1;
        }
        return (int) f3;
    }

    public static boolean onScreenArea(View view) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c7cf97", new Object[]{view})).booleanValue();
        }
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                height = layoutParams.height;
            } else {
                height = view.getHeight();
            }
            if ((iArr[1] > 0 && iArr[1] - WXViewUtils.getScreenHeight(WXEnvironment.sApplication) < 0) || (height + iArr[1] > 0 && iArr[1] <= 0)) {
                return true;
            }
        }
        return false;
    }

    public static void setBackGround(View view, Drawable drawable, WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcbb764", new Object[]{view, drawable, wXComponent});
        } else if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            try {
                view.setBackground(drawable);
            } catch (Exception unused) {
                if (wXComponent == null) {
                    return;
                }
                WXExceptionUtils.commitCriticalExceptionRT(wXComponent.getInstanceId(), WXErrorCode.WX_RENDER_ERR_TEXTURE_SETBACKGROUND, wXComponent.getComponentType() + " setBackGround for android view", WXErrorCode.WX_RENDER_ERR_TEXTURE_SETBACKGROUND.getErrorMsg() + ": TextureView doesn't support displaying a background drawable!", null);
            }
        }
    }

    public static BorderDrawable getBorderDrawable(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderDrawable) ipChange.ipc$dispatch("93756039", new Object[]{view});
        }
        Drawable background = view.getBackground();
        if (background instanceof BorderDrawable) {
            return (BorderDrawable) background;
        }
        if (!(background instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) background;
        if (layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        Drawable drawable = layerDrawable.getDrawable(0);
        if (!(drawable instanceof BorderDrawable)) {
            return null;
        }
        return (BorderDrawable) drawable;
    }

    public static void clipCanvasWithinBorderBox(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd05ac6", new Object[]{view, canvas});
        } else if (!a(canvas) || !a(view)) {
        } else {
            Drawable background = view.getBackground();
            if (!(background instanceof BorderDrawable)) {
                return;
            }
            BorderDrawable borderDrawable = (BorderDrawable) background;
            if (!borderDrawable.isRounded() || !a(view, borderDrawable)) {
                return;
            }
            canvas.clipPath(borderDrawable.getContentPath(new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight())));
        }
    }

    public static void clipCanvasWithinBorderBox(Widget widget, Canvas canvas) {
        BorderDrawable backgroundAndBorder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed3d330", new Object[]{widget, canvas});
        } else if (!a(canvas) || !a((View) null) || (backgroundAndBorder = widget.getBackgroundAndBorder()) == null) {
        } else {
            if (backgroundAndBorder.isRounded() && a(widget, backgroundAndBorder)) {
                canvas.clipPath(backgroundAndBorder.getContentPath(new RectF(0.0f, 0.0f, widget.getBorderBox().width(), widget.getBorderBox().height())));
            } else {
                canvas.clipRect(widget.getBorderBox());
            }
        }
    }

    private static boolean a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3f39201", new Object[]{canvas})).booleanValue() : Build.VERSION.SDK_INT >= 18 || !canvas.isHardwareAccelerated();
    }

    private static boolean a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{view})).booleanValue() : Build.VERSION.SDK_INT != 24;
    }

    private static boolean a(View view, BorderDrawable borderDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b635a6d8", new Object[]{view, borderDrawable})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt.getBackground() instanceof BorderDrawable) && ((BorderDrawable) childAt.getBackground()).hasImage() && Build.VERSION.SDK_INT < 21) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean a(Widget widget, BorderDrawable borderDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23f62742", new Object[]{widget, borderDrawable})).booleanValue();
        }
        if (widget instanceof WidgetGroup) {
            for (Widget widget2 : ((WidgetGroup) widget).getChildren()) {
                if (widget2.getBackgroundAndBorder().hasImage() && Build.VERSION.SDK_INT < 21) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isViewVisible(View view) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5539870c", new Object[]{view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            z = view.isAttachedToWindow();
        } else {
            z = view.getWindowToken() != null;
        }
        if (!z || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background == null) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 19 ? background.getAlpha() > 0 : background instanceof ColorDrawable ? Color.alpha(((ColorDrawable) background).getColor()) > 0 : !(background instanceof BitmapDrawable) || ((BitmapDrawable) background).getPaint().getAlpha() > 0;
    }
}
