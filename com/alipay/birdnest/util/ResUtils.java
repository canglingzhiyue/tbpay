package com.alipay.birdnest.util;

import android.content.Context;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;
import com.taobao.share.ui.engine.friend.a;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class ResUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getAnimId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b52db65c", new Object[]{context, str})).intValue() : getResourceId(context, str, "anim");
    }

    public static String getCashierPackageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff18e655", new Object[0]) : "com.alipay.android.app";
    }

    public static int getColorId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("906c13f6", new Object[]{context, str})).intValue() : getResourceId(context, str, "color");
    }

    public static int getDimenId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1eea41e8", new Object[]{context, str})).intValue() : getResourceId(context, str, "dimen");
    }

    public static int getDrawableId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("409026f", new Object[]{context, str})).intValue() : getResourceId(context, str, a.CONTACTS_INFO_NOT_EMPTY_STATUS);
    }

    public static int getId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("863b256d", new Object[]{context, str})).intValue() : getResourceId(context, str, "id");
    }

    public static int getLayoutId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b4d6be3", new Object[]{context, str})).intValue() : getResourceId(context, str, "layout");
    }

    public static String getPackageName(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b1a51a", new Object[]{context}) : context == null ? AppContextHolder.f7228a.getPackageName() : context.getPackageName();
    }

    public static int getRawId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76a6a751", new Object[]{context, str})).intValue() : getResourceId(context, str, com.taobao.android.weex_framework.util.a.ATOM_raw);
    }

    public static final int[] getResourceDeclareStyleableIntArray(Context context, String str) {
        Field[] fields;
        try {
            for (Field field : Class.forName(getPackageName(context) + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get(null);
                }
            }
        } catch (Throwable th) {
            FBLogger.e("getResourceDeclareStyleableIntArray", th);
        }
        return null;
    }

    public static int getResourceId(Context context, String str, String str2) {
        int i;
        try {
            i = context.getResources().getIdentifier(str, str2, getPackageName(context));
        } catch (Exception e) {
            FBLogger.e("getResourceId 1", e);
            i = -1;
        }
        if (i <= 0) {
            try {
                i = context.getResources().getIdentifier(str, str2, context.getPackageName());
            } catch (Exception e2) {
                FBLogger.e("getResourceId 2", e2);
            }
        }
        if (i <= 0) {
            try {
                Resources resources = context.getResources();
                i = resources.getIdentifier("alipay_msp_" + str, str2, getPackageName(context));
            } catch (Exception e3) {
                FBLogger.e("getResourceId 3", e3);
            }
        }
        if (i <= 0) {
            try {
                String packageName = getPackageName(context);
                i = ((Integer) Class.forName(packageName + ".R$" + str2).getField(str).get(null)).intValue();
                if (i > 0) {
                    return i;
                }
            } catch (Exception e4) {
                FBLogger.e("getResourceId 4", e4);
            }
        }
        return i;
    }

    public static int getStringId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e8c6ddc", new Object[]{context, str})).intValue() : getResourceId(context, str, "string");
    }

    public static int getStyleId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("380a8368", new Object[]{context, str})).intValue() : getResourceId(context, str, "style");
    }

    public static int getStyleableId(Context context, String str) {
        String packageName = getPackageName(context);
        try {
            int resourceId = getResourceId(context, str, "styleable");
            if (resourceId > 0) {
                return resourceId;
            }
            return ((Integer) Class.forName(packageName + ".R$styleable").getField(str).get(null)).intValue();
        } catch (Exception unused) {
            return context.getResources().getIdentifier(str, "styleable", context.getPackageName());
        }
    }

    public static int[] getStyleableIds(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("379b723c", new Object[]{context, str}) : getResourceDeclareStyleableIntArray(context, str);
    }

    public static int getXmlId(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("51f58742", new Object[]{context, str})).intValue() : getResourceId(context, str, "xml");
    }

    public static int getResourceId(Context context, String str, String str2, String str3) {
        try {
            int intValue = ((Integer) Class.forName(str3 + ".R$" + str2).getField(str).get(null)).intValue();
            return intValue > 0 ? intValue : context.getResources().getIdentifier(str, str2, getPackageName(context));
        } catch (Exception unused) {
            return context.getResources().getIdentifier(str, str2, context.getPackageName());
        }
    }
}
