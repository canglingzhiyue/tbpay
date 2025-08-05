package com.taobao.uikit.extend.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Dialog.GravityEnum;
import tb.kge;

/* loaded from: classes9.dex */
public class ResourceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.uikit.extend.utils.ResourceUtils$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum = new int[GravityEnum.values().length];

        static {
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-257133968);
    }

    public static int getColor(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae8d22e2", new Object[]{context, new Integer(i)})).intValue();
        }
        if (Build.VERSION.SDK_INT <= 22) {
            return context.getResources().getColor(i);
        }
        return context.getColor(i);
    }

    public static int getDimension(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ff35c4a5", new Object[]{context, new Integer(i)})).intValue() : (int) context.getResources().getDimension(i);
    }

    public static int getDimensionPixelSize(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("185a28c", new Object[]{context, new Integer(i)})).intValue() : context.getResources().getDimensionPixelSize(i);
    }

    public static Drawable getDrawable(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("e90e44e4", new Object[]{context, new Integer(i)}) : ContextCompat.getDrawable(context, i);
    }

    public static float resolveFloat(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d19c31c2", new Object[]{context, new Integer(i)})).floatValue();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{i});
        try {
            return obtainStyledAttributes.getFloat(0, 0.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int adjustAlpha(int i, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("872f7a6", new Object[]{new Integer(i), new Float(f)})).intValue() : Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int resolveColor(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("23bbf88c", new Object[]{context, new Integer(i)})).intValue() : resolveColor(context, i, 0);
    }

    public static int resolveColor(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53c38d7d", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList resolveActionTextColorStateList(Context context, int i, ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("bc34ded9", new Object[]{context, new Integer(i), colorStateList});
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            if (peekValue.type >= 28 && peekValue.type <= 31) {
                return getActionTextStateList(context, peekValue.data);
            }
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList getActionTextColorStateList(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("289ae16d", new Object[]{context, new Integer(i)});
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return getActionTextStateList(context, typedValue.data);
        }
        if (Build.VERSION.SDK_INT <= 22) {
            return context.getResources().getColorStateList(i);
        }
        return context.getColorStateList(i);
    }

    public static String resolveString(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4c94821", new Object[]{context, new Integer(i)});
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (String) typedValue.string;
    }

    private static int gravityEnumToAttrInt(GravityEnum gravityEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bffdca2", new Object[]{gravityEnum})).intValue();
        }
        int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[gravityEnum.ordinal()];
        if (i == 1) {
            return 1;
        }
        return i != 2 ? 0 : 2;
    }

    public static GravityEnum resolveGravityEnum(Context context, int i, GravityEnum gravityEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GravityEnum) ipChange.ipc$dispatch("ba7cd5d1", new Object[]{context, new Integer(i), gravityEnum});
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int i2 = obtainStyledAttributes.getInt(0, gravityEnumToAttrInt(gravityEnum));
            if (i2 == 1) {
                return GravityEnum.CENTER;
            }
            if (i2 == 2) {
                return GravityEnum.END;
            }
            return GravityEnum.START;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable resolveDrawable(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("54198b0e", new Object[]{context, new Integer(i)}) : resolveDrawable(context, i, null);
    }

    private static Drawable resolveDrawable(Context context, int i, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("67d85b6a", new Object[]{context, new Integer(i), drawable});
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 == null && drawable != null) {
                drawable2 = drawable;
            }
            return drawable2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int resolveDimension(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f04db54f", new Object[]{context, new Integer(i)})).intValue() : resolveDimension(context, i, -1);
    }

    private static int resolveDimension(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1969691a", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean resolveBoolean(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67ed64fa", new Object[]{context, new Integer(i), new Boolean(z)})).booleanValue();
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean resolveBoolean(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a88381a2", new Object[]{context, new Integer(i)})).booleanValue() : resolveBoolean(context, i, false);
    }

    public static boolean isColorDark(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("747e151", new Object[]{new Integer(i)})).booleanValue() : 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    public static void setBackgroundCompat(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bc87d", new Object[]{view, drawable});
        } else if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    public static ColorStateList getActionTextStateList(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("555e88bc", new Object[]{context, new Integer(i)});
        }
        int resolveColor = resolveColor(context, 16842806);
        if (i != 0) {
            resolveColor = i;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{adjustAlpha(resolveColor, 0.4f), resolveColor});
    }

    public static int[] getColorArray(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("160840f6", new Object[]{context, new Integer(i)});
        }
        if (i == 0) {
            return null;
        }
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i);
        int[] iArr = new int[obtainTypedArray.length()];
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            iArr[i2] = obtainTypedArray.getColor(i2, 0);
        }
        obtainTypedArray.recycle();
        return iArr;
    }
}
