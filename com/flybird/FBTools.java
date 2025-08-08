package com.flybird;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx_v4.animation.util.b;
import com.taobao.android.weex_framework.util.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.cun;
import tb.drm;
import tb.riy;

/* loaded from: classes4.dex */
public class FBTools {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        int[] iArr = new int[4];
        iArr[3] = 255;
        String[] split = str.substring(str.indexOf(riy.BRACKET_START_STR) + 1, str.indexOf(riy.BRACKET_END_STR)).split(",");
        for (int i = 0; i < split.length; i++) {
            if (i == 3) {
                iArr[i] = (int) (Float.parseFloat(split[i].trim()) * 255.0f);
            } else {
                iArr[i] = Integer.parseInt(split[i].trim());
            }
        }
        return Color.argb(iArr[3], iArr[0], iArr[1], iArr[2]);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!str.startsWith("#")) {
            return str;
        }
        if (str.length() > 9) {
            return str.substring(0, 9);
        }
        if (str.length() == 8) {
            return str.substring(0, 7);
        }
        if (str.length() != 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] cArr = new char[7];
        cArr[0] = charArray[0];
        for (int i = 1; i < charArray.length; i++) {
            int i2 = i << 1;
            cArr[i2 - 1] = charArray[i];
            cArr[i2] = charArray[i];
        }
        return new String(cArr);
    }

    public static Bitmap blur(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("89a27061", new Object[]{bitmap, new Integer(i)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f, 1.0f);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return doBlur(createBitmap, i, true);
    }

    public static int calcScreenHeight(Context context, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebec179d", new Object[]{context, new Integer(i)})).intValue();
        }
        if ((context instanceof Activity) && (((Activity) context).getWindow().getDecorView().getSystemUiVisibility() & 4) != 4) {
            try {
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i2 = context.getResources().getDimensionPixelSize(identifier);
                } else {
                    i2 = ((int) context.getResources().getDisplayMetrics().density) * 24;
                }
            } catch (Throwable th) {
                FBLogger.e("FBTools", th);
            }
        }
        return (i - i2) - getSmartBarHeight(context);
    }

    public static Bitmap doBlur(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("83631d04", new Object[]{bitmap2, new Integer(i2), new Boolean(z)});
        }
        if (!z) {
            bitmap2 = bitmap2.copy(bitmap.getConfig(), true);
        }
        if (i2 <= 0) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 << 8;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, i6, 3);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            Bitmap bitmap3 = bitmap2;
            int i15 = -i2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i2) {
                int i25 = height;
                int i26 = i5;
                int i27 = iArr2[Math.min(i4, Math.max(i15, 0)) + i13];
                int[] iArr9 = iArr8[i15 + i2];
                int i28 = i13;
                iArr9[0] = (i27 >> 16) & 255;
                iArr9[1] = (i27 >> 8) & 255;
                iArr9[2] = i27 & 255;
                int abs = i11 - Math.abs(i15);
                i18 += iArr9[0] * abs;
                i17 += iArr9[1] * abs;
                i16 += iArr9[2] * abs;
                if (i15 > 0) {
                    i24 += iArr9[0];
                    i23 += iArr9[1];
                    i22 += iArr9[2];
                } else {
                    i21 += iArr9[0];
                    i20 += iArr9[1];
                    i19 += iArr9[2];
                }
                i15++;
                height = i25;
                i5 = i26;
                i13 = i28;
            }
            int i29 = height;
            int i30 = i5;
            int i31 = i2;
            int i32 = 0;
            while (i32 < width) {
                iArr3[i13] = iArr7[i18];
                iArr4[i13] = iArr7[i17];
                iArr5[i13] = iArr7[i16];
                int i33 = i18 - i21;
                int i34 = i17 - i20;
                int i35 = i16 - i19;
                int[] iArr10 = iArr8[((i31 - i2) + i6) % i6];
                int i36 = i21 - iArr10[0];
                int i37 = i20 - iArr10[1];
                int i38 = i19 - iArr10[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr6[i32] = Math.min(i32 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i39 = iArr2[i14 + iArr6[i32]];
                iArr10[0] = (i39 >> 16) & 255;
                iArr10[1] = (i39 >> 8) & 255;
                iArr10[2] = i39 & 255;
                int i40 = i24 + iArr10[0];
                int i41 = i23 + iArr10[1];
                int i42 = i22 + iArr10[2];
                i18 = i33 + i40;
                i17 = i34 + i41;
                i16 = i35 + i42;
                i31 = (i31 + 1) % i6;
                int[] iArr11 = iArr8[i31 % i6];
                i21 = i36 + iArr11[0];
                i20 = i37 + iArr11[1];
                i19 = i38 + iArr11[2];
                i24 = i40 - iArr11[0];
                i23 = i41 - iArr11[1];
                i22 = i42 - iArr11[2];
                i13++;
                i32++;
                i4 = i4;
                iArr7 = iArr;
            }
            i14 += width;
            i12++;
            bitmap2 = bitmap3;
            height = i29;
            i5 = i30;
        }
        Bitmap bitmap4 = bitmap2;
        int i43 = height;
        int[] iArr12 = iArr7;
        int i44 = i5;
        int i45 = 0;
        while (i45 < width) {
            int i46 = -i2;
            int i47 = i46 * width;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            while (i46 <= i2) {
                int[] iArr13 = iArr6;
                int max = Math.max(0, i47) + i45;
                int[] iArr14 = iArr8[i46 + i2];
                iArr14[0] = iArr3[max];
                iArr14[1] = iArr4[max];
                iArr14[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i46);
                i50 += iArr3[max] * abs2;
                i49 += iArr4[max] * abs2;
                i48 += iArr5[max] * abs2;
                if (i46 > 0) {
                    i56 += iArr14[0];
                    i55 += iArr14[1];
                    i54 += iArr14[2];
                } else {
                    i53 += iArr14[0];
                    i52 += iArr14[1];
                    i51 += iArr14[2];
                }
                int i57 = i44;
                if (i46 < i57) {
                    i47 += width;
                }
                i46++;
                i44 = i57;
                iArr6 = iArr13;
            }
            int[] iArr15 = iArr6;
            int i58 = i44;
            int i59 = i43;
            int i60 = i49;
            int i61 = i55;
            int i62 = i56;
            int i63 = i45;
            int i64 = i2;
            int i65 = i54;
            int i66 = i53;
            int i67 = i50;
            int i68 = i48;
            int i69 = 0;
            while (i69 < i59) {
                iArr2[i63] = (iArr2[i63] & (-16777216)) | (iArr12[i67] << 16) | (iArr12[i60] << 8) | iArr12[i68];
                int i70 = i67 - i66;
                int i71 = i60 - i52;
                int i72 = i68 - i51;
                int[] iArr16 = iArr8[((i64 - i2) + i6) % i6];
                int i73 = i66 - iArr16[0];
                int i74 = i52 - iArr16[1];
                int i75 = i51 - iArr16[2];
                if (i45 == 0) {
                    iArr15[i69] = Math.min(i69 + i11, i58) * width;
                }
                int i76 = iArr15[i69] + i45;
                iArr16[0] = iArr3[i76];
                iArr16[1] = iArr4[i76];
                iArr16[2] = iArr5[i76];
                int i77 = i62 + iArr16[0];
                int i78 = i61 + iArr16[1];
                int i79 = i65 + iArr16[2];
                i67 = i70 + i77;
                i60 = i71 + i78;
                i68 = i72 + i79;
                i64 = (i64 + 1) % i6;
                int[] iArr17 = iArr8[i64];
                i66 = i73 + iArr17[0];
                i52 = i74 + iArr17[1];
                i51 = i75 + iArr17[2];
                i62 = i77 - iArr17[0];
                i61 = i78 - iArr17[1];
                i65 = i79 - iArr17[2];
                i63 += width;
                i69++;
                i2 = i;
            }
            i45++;
            i2 = i;
            i43 = i59;
            i44 = i58;
            iArr6 = iArr15;
        }
        bitmap4.setPixels(iArr2, 0, width, 0, 0, width, i43);
        return bitmap4;
    }

    public static FBDocument findFbDocFromSysView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBDocument) ipChange.ipc$dispatch("54f91657", new Object[]{view});
        }
        FBView findFbViewFromSysView = findFbViewFromSysView(view);
        if (findFbViewFromSysView != null) {
            return findFbViewFromSysView.getFBDocument();
        }
        return null;
    }

    public static FBView findFbViewFromSysView(View view) {
        if (view == null) {
            return null;
        }
        try {
            Field declaredField = View.class.getDeclaredField("mKeyedTags");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                for (int i = 0; i < sparseArray.size(); i++) {
                    Object valueAt = sparseArray.valueAt(i);
                    if (valueAt instanceof FBView) {
                        return (FBView) valueAt;
                    }
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof FBView) {
                        return (FBView) value;
                    }
                }
            }
        } catch (Throwable th) {
            FBLogger.e("FBTools", "cannot get fbView from sysView", th);
        }
        return null;
    }

    public static ColorStateList genTextSelector(String[] strArr, BirdNestEngine.ThemeColorProvider themeColorProvider, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("a3d031be", new Object[]{strArr, themeColorProvider, new Integer(i), new Boolean(z)});
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        int[][] iArr = (int[][]) Array.newInstance(int.class, 4, 4);
        int[] iArr2 = new int[4];
        int i2 = 0;
        boolean z2 = true;
        while (i2 < strArr.length) {
            String str = strArr[i2];
            if (i2 == 0) {
                int[] iArr3 = new int[1];
                iArr3[0] = 16842910;
                iArr[0] = iArr3;
                iArr2[0] = parseColor(str, themeColorProvider, i, z);
            } else if (i2 == 1) {
                iArr[1] = new int[]{16842910, 16842919};
                iArr2[1] = parseColor(str, themeColorProvider, i, z);
                iArr[2] = new int[]{16842910, 16842908};
                iArr2[2] = parseColor(str, themeColorProvider, i, z);
            } else if (i2 == 2) {
                int[] iArr4 = new int[1];
                iArr4[0] = -16842910;
                iArr[3] = iArr4;
                iArr2[3] = parseColor(str, themeColorProvider, i, z);
            }
            i2++;
            z2 = false;
        }
        if (z2) {
            return null;
        }
        return new ColorStateList(iArr, iArr2);
    }

    public static Drawable generateBackGroundDrawable(float f, int i, float f2, float[] fArr, String[] strArr, float f3, BirdNestEngine.ThemeColorProvider themeColorProvider, int i2, boolean z) {
        int i3 = i;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c331c49", new Object[]{new Float(f), new Integer(i3), new Float(f2), fArr, strArr, new Float(f3), themeColorProvider, new Integer(i2), new Boolean(z)});
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        float f4 = 255.0f;
        int i5 = -1;
        if (strArr != null) {
            if (strArr[1] == null && strArr[2] == null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                if (i3 != -1) {
                    gradientDrawable.setStroke((int) f, i3);
                }
                gradientDrawable.setColor(parseColor(strArr[0], themeColorProvider, i2, z));
                if (f2 > 0.0f) {
                    gradientDrawable.setCornerRadius(f2);
                } else if (fArr != null) {
                    gradientDrawable.setCornerRadii(fArr);
                }
                if (f3 > 0.0f) {
                    gradientDrawable.setAlpha((int) (f3 * 255.0f));
                }
                return gradientDrawable;
            }
            while (i4 < strArr.length) {
                String str = strArr[i4];
                if (!StringUtils.isEmpty(str)) {
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    if (i3 != i5) {
                        gradientDrawable2.setStroke((int) f, i3);
                    }
                    gradientDrawable2.setColor(parseColor(str, themeColorProvider, i2, z));
                    if (f2 > 0.0f) {
                        gradientDrawable2.setCornerRadius(f2);
                    } else if (fArr != null) {
                        gradientDrawable2.setCornerRadii(fArr);
                    }
                    if (f3 > 0.0f) {
                        gradientDrawable2.setAlpha((int) (f3 * f4));
                    }
                    if (i4 == 0) {
                        stateListDrawable.addState(!StringUtils.isEmpty(strArr[1]) ? new int[]{16842910, -16842919} : new int[]{16842910}, gradientDrawable2);
                    } else if (i4 == 1) {
                        stateListDrawable.addState(new int[]{16842910, 16842919}, gradientDrawable2);
                    } else if (i4 == 2) {
                        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
                    }
                }
                i4++;
                f4 = 255.0f;
                i5 = -1;
            }
            return stateListDrawable;
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        if (i3 == -1) {
            i3 = 0;
        }
        if (f > 0.0f) {
            gradientDrawable3.setStroke((int) f, i3);
        }
        gradientDrawable3.setColor(0);
        if (f2 > 0.0f) {
            gradientDrawable3.setCornerRadius(f2);
        } else if (fArr != null) {
            gradientDrawable3.setCornerRadii(fArr);
        }
        if (f3 > 0.0f) {
            gradientDrawable3.setAlpha((int) (255.0f * f3));
        }
        return gradientDrawable3;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        if (BirdNestEngine.useValueCache) {
            return (DisplayMetrics) drm.b("Conf:CtxDisplayMetrics");
        }
        if (context == null) {
            return null;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
                if (displayMetrics.heightPixels * 9 <= (displayMetrics.widthPixels << 4)) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            return displayMetrics;
        } catch (Throwable unused) {
            return context.getResources().getDisplayMetrics();
        }
    }

    @Deprecated
    public static float getDp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29d2a9cf", new Object[]{context})).floatValue();
        }
        if (Platform.g != 2) {
            return context.getResources().getDisplayMetrics().density;
        }
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int getLeftFromRoot(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("503ed775", new Object[]{view})).intValue();
        }
        if (view == null) {
            return 0;
        }
        View view2 = (View) view.getParent();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (view2 != null && ((view2 instanceof FBFrameLayout) || (view2 instanceof FBScrollView) || (view2 instanceof FBHScrollView))) {
            return layoutParams.leftMargin + getLeftFromRoot(view2);
        }
        if (layoutParams != null) {
            return layoutParams.leftMargin;
        }
        return 0;
    }

    public static int getNormalNavigationBarHeight(Context context) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79e9a96b", new Object[]{context})).intValue();
        }
        try {
            Resources resources = context.getResources();
            int identifier2 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier2 > 0 && resources.getBoolean(identifier2) && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
        } catch (Throwable th) {
            FBLogger.d("FBTools", "getNormalNavigationBarHeight() exception:" + th.getMessage());
        }
        return 0;
    }

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue() : calcScreenHeight(context, getDisplayMetrics(context).heightPixels);
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue() : getDisplayMetrics(context).widthPixels;
    }

    public static int getSmartBarHeight(Context context) {
        boolean z;
        boolean equals = Build.MANUFACTURER.equals("Meizu");
        boolean z2 = true;
        boolean z3 = Settings.System.getInt(context.getContentResolver(), "mz_smartbar_auto_hide", 0) == 1;
        if (equals) {
            String str = Build.MODEL;
            if (str == null || !str.startsWith("M1 E")) {
                z2 = false;
            }
            try {
                String str2 = Build.VERSION.INCREMENTAL;
                boolean startsWith = str2.substring(str2.indexOf("OS_") + 3).startsWith("5.");
                String str3 = Build.VERSION.RELEASE;
                z = str3.startsWith("5.") | startsWith | str3.startsWith("6.") | str3.startsWith("7.");
            } catch (Throwable th) {
                FBLogger.e("FBTools", "catch exception ", th);
                z = false;
            }
            if (!z2 && !z3 && !z) {
                try {
                    Class<?> cls = Class.forName("com.android.internal.R$dimen");
                    return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("mz_action_button_min_height").get(cls.newInstance()).toString()));
                } catch (Throwable unused) {
                    return getNormalNavigationBarHeight(context);
                }
            }
        }
        return 0;
    }

    public static int getTopFromRoot(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce33b993", new Object[]{view})).intValue();
        }
        if (view == null) {
            return 0;
        }
        View view2 = (View) view.getParent();
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (view2 != null && ((view2 instanceof FBFrameLayout) || (view2 instanceof FBScrollView) || (view2 instanceof FBHScrollView))) {
            return layoutParams.topMargin + getTopFromRoot(view2);
        }
        if (layoutParams != null) {
            return layoutParams.topMargin;
        }
        return 0;
    }

    public static AnimationSet parseAnimation(Context context, String str) {
        String str2;
        JSONArray jSONArray;
        int i;
        String string;
        String str3 = "x";
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("3eb142f8", new Object[]{context, str});
        }
        if (str == null) {
            return null;
        }
        try {
            AnimationSet animationSet = new AnimationSet(false);
            for (JSONArray jSONArray2 = new JSONArray(str); i2 < jSONArray2.length(); jSONArray2 = jSONArray) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                if (jSONObject != null && (string = jSONObject.getString("type")) != null) {
                    long j = jSONObject.getLong("duration");
                    Object opt = jSONObject.opt("repeatCount");
                    String optString = jSONObject.optString(b.REPEAT_MODE);
                    if ("alpha".equals(string)) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation((float) jSONObject.getDouble("fromValue"), (float) jSONObject.getDouble("toValue"));
                        alphaAnimation.setDuration(j);
                        if (opt != null && (opt instanceof String) && "infinite".equals(opt)) {
                            alphaAnimation.setRepeatCount(-1);
                        } else if (opt != null && (opt instanceof Integer)) {
                            alphaAnimation.setRepeatCount(((Integer) opt).intValue());
                        }
                        if (a.ATOM_EXT_reverse.equals(optString)) {
                            alphaAnimation.setRepeatMode(2);
                        }
                        animationSet.addAnimation(alphaAnimation);
                    } else {
                        if ("translate".equals(string)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("fromValue");
                            JSONObject jSONObject3 = jSONObject.getJSONObject("toValue");
                            if (jSONObject2 != null && jSONObject3 != null) {
                                float dp = FBDocumentAssistor.getDp();
                                jSONArray = jSONArray2;
                                i = i2;
                                str2 = str3;
                                TranslateAnimation translateAnimation = new TranslateAnimation(((float) jSONObject2.getDouble(str3)) * dp, ((float) jSONObject3.getDouble(str3)) * dp, ((float) jSONObject2.getDouble("y")) * dp, ((float) jSONObject3.getDouble("y")) * dp);
                                translateAnimation.setDuration(j);
                                if (opt != null && (opt instanceof String) && "infinite".equals(opt)) {
                                    translateAnimation.setRepeatCount(-1);
                                } else if (opt != null && (opt instanceof Integer)) {
                                    translateAnimation.setRepeatCount(((Integer) opt).intValue());
                                }
                                if (a.ATOM_EXT_reverse.equals(optString)) {
                                    translateAnimation.setRepeatMode(2);
                                }
                                animationSet.addAnimation(translateAnimation);
                            }
                        } else {
                            jSONArray = jSONArray2;
                            i = i2;
                            str2 = str3;
                            if ("scale".equals(string)) {
                                float f = (float) jSONObject.getDouble("fromValue");
                                float f2 = (float) jSONObject.getDouble("toValue");
                                ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
                                scaleAnimation.setDuration(j);
                                if (opt != null && (opt instanceof String) && "infinite".equals(opt)) {
                                    scaleAnimation.setRepeatCount(-1);
                                } else if (opt != null && (opt instanceof Integer)) {
                                    scaleAnimation.setRepeatCount(((Integer) opt).intValue());
                                }
                                if (a.ATOM_EXT_reverse.equals(optString)) {
                                    scaleAnimation.setRepeatMode(2);
                                }
                                animationSet.addAnimation(scaleAnimation);
                                i2 = i + 1;
                                str3 = str2;
                            }
                        }
                        i2 = i + 1;
                        str3 = str2;
                    }
                }
                str2 = str3;
                jSONArray = jSONArray2;
                i = i2;
                i2 = i + 1;
                str3 = str2;
            }
            animationSet.setFillAfter(true);
            return animationSet;
        } catch (Throwable th) {
            FBLogger.e("FBTools", th);
            return null;
        }
    }

    public static int parseColor(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue() : parseColor(str, null, 0);
    }

    public static float parseUnit(String str) {
        String replaceAll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39c4618", new Object[]{str})).floatValue();
        }
        float dp = FBDocumentAssistor.getDp();
        if (str.contains("PX")) {
            dp = 1.0f;
            replaceAll = str.replaceAll("PX", "");
        } else {
            replaceAll = str.replaceAll("px", "");
        }
        return Float.parseFloat(replaceAll) * dp;
    }

    public static String readAssetsFile(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c857d4fe", new Object[]{str, context}) : readAssetsFileWithManager(str, context.getAssets());
    }

    public static String readAssetsFileWithManager(String str, AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("413133f0", new Object[]{str, assetManager});
        }
        InputStream inputStream = null;
        StringBuilder sb = new StringBuilder();
        try {
            inputStream = assetManager.open(str);
        } catch (Throwable th) {
            cun.a("FBTools", "error 1 in reading asset " + str, th);
        }
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            char[] cArr = new char[2048];
            while (true) {
                try {
                    int read = bufferedReader.read(cArr);
                    if (read > 0) {
                        sb.append(cArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        cun.a("FBTools", "error 2 in reading asset " + str, th2);
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            cun.a("FBTools", "error 3 in reading asset " + str, e2);
                        }
                    } finally {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            cun.a("FBTools", "error 3 in reading asset " + str, e3);
                        }
                    }
                }
            }
            try {
                inputStream.close();
            } catch (Throwable th3) {
                cun.a("FBTools", "error 4 in reading asset " + str, th3);
            }
        }
        return sb.toString();
    }

    public static int parseColor(String str, BirdNestEngine.ThemeColorProvider themeColorProvider, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e5e5bd6", new Object[]{str, themeColorProvider, new Integer(i)})).intValue() : parseColor(str, themeColorProvider, i, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #0 {Exception -> 0x0063, blocks: (B:11:0x0035, B:13:0x003b, B:15:0x0043, B:21:0x005e, B:16:0x004c, B:18:0x0054), top: B:25:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int parseColor(java.lang.String r4, com.alipay.birdnest.api.BirdNestEngine.ThemeColorProvider r5, int r6, boolean r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.flybird.FBTools.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r4 = 2
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            r1[r4] = r5
            r4 = 3
            java.lang.Boolean r5 = new java.lang.Boolean
            r5.<init>(r7)
            r1[r4] = r5
            java.lang.String r4 = "9d6dd344"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L2c:
            if (r5 == 0) goto L31
            if (r7 == 0) goto L31
            goto L32
        L31:
            r2 = 0
        L32:
            r7 = -7829368(0xffffffffff888888, float:NaN)
            boolean r0 = android.text.StringUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L59
            java.lang.String r0 = "#"
            boolean r0 = r4.startsWith(r0)     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L4c
            java.lang.String r4 = b(r4)     // Catch: java.lang.Exception -> L63
            int r0 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Exception -> L63
            goto L5c
        L4c:
            java.lang.String r0 = "rgb"
            boolean r0 = r4.startsWith(r0)     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L59
            int r0 = a(r4)     // Catch: java.lang.Exception -> L63
            goto L5c
        L59:
            r0 = -7829368(0xffffffffff888888, float:NaN)
        L5c:
            if (r2 == 0) goto L62
            int r0 = r5.mapHexColor(r0, r6)     // Catch: java.lang.Exception -> L63
        L62:
            return r0
        L63:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "failed to parse "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FBTools"
            tb.cun.a(r5, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBTools.parseColor(java.lang.String, com.alipay.birdnest.api.BirdNestEngine$ThemeColorProvider, int, boolean):int");
    }
}
