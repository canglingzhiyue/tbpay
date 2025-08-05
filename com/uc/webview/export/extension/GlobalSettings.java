package com.uc.webview.export.extension;

import com.uc.webview.base.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public class GlobalSettings extends com.uc.webview.base.GlobalSettings {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    @Deprecated
    public static final int BUSINESS_INFO_TYPE_ACCESSIBLE_LIST = 1;
    @Deprecated
    public static final int BUSINESS_INFO_TYPE_CDPARAM = 2;
    public static final int SETTINGS_TYPE_BOOL = 0;
    public static final int SETTINGS_TYPE_FLOAT = 2;
    public static final int SETTINGS_TYPE_INT = 1;
    private static final int SETTINGS_TYPE_LIST = 4;
    public static final int SETTINGS_TYPE_STRING = 3;
    private static final GlobalSettings sInstance = new GlobalSettings();

    /* loaded from: classes9.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final int[][] f23825a = {new int[]{f.c[0][0], f.c[0][1]}, new int[]{f.c[1][0], f.c[1][1]}, new int[]{f.c[2][0], f.c[2][1]}, new int[]{f.c[3][0], f.c[4][1]}, new int[]{f.c[4][0], f.c[4][1]}};
    }

    public static boolean containsKey(int i, String str) {
        int[] iArr = a.f23825a[i];
        int a2 = f.a(str);
        return a2 >= iArr[0] && a2 < iArr[1];
    }

    public static boolean containsKey(String str) {
        return f.a(str) >= 0;
    }

    public static String get(String str, String str2) {
        return get(f.a(str), str2);
    }

    public static boolean getBoolValue(String str) {
        return getBoolValue(f.a(str));
    }

    public static List<String> getCoreCareSettingKeys(int i) {
        int[] iArr = a.f23825a[i];
        int i2 = iArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i3 = iArr[0]; i3 < i2; i3++) {
            arrayList.add(f.f23779a[i3]);
        }
        return arrayList;
    }

    public static float getFloatValue(String str) {
        return getFloatValue(f.a(str));
    }

    public static String[] getInitKeyList() {
        return f.b;
    }

    public static int getIntValue(String str) {
        return getIntValue(f.a(str));
    }

    public static String getStringValue(String str) {
        return getStringValue(f.a(str));
    }

    public static boolean isAccessible(String str, String str2) {
        return isAccessible(f.a(str), str2);
    }

    public static boolean isRunningInWebViewSdk() {
        return getBoolValue(SettingKeys.IsRunningInWebViewSdk);
    }

    public static Set<String> keySet() {
        return f.a();
    }

    public static GlobalSettings set(String str, float f) {
        set(f.a(str), f);
        return sInstance;
    }

    public static GlobalSettings set(String str, int i) {
        set(f.a(str), i);
        return sInstance;
    }

    public static GlobalSettings set(String str, String str2) {
        set(f.a(str), str2);
        return sInstance;
    }

    public static GlobalSettings set(String str, boolean z) {
        set(f.a(str), z);
        return sInstance;
    }

    @Deprecated
    public static void setBoolValue(String str, boolean z) {
        set(f.a(str), z);
    }

    @Deprecated
    public static void setFloatValue(String str, float f) {
        set(f.a(str), f);
    }

    @Deprecated
    public static void setIntValue(String str, int i) {
        set(f.a(str), i);
    }

    @Deprecated
    public static void setStringValue(String str, String str2) {
        set(f.a(str), str2);
    }

    public static void setValue(String str, String str2) {
        setValue(f.a(str), str2);
    }

    public static void setValue(String str, String[] strArr) {
        setValue(f.a(str), strArr);
    }
}
