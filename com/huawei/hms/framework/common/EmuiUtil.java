package com.huawei.hms.framework.common;

import com.huawei.android.os.BuildEx;

/* loaded from: classes4.dex */
public class EmuiUtil {
    private static final String BUILDEX_NAME = "com.huawei.android.os.BuildEx";
    public static final String BUILDEX_VERSION = "com.huawei.android.os.BuildEx$VERSION";
    private static final int EMUI_3_0 = 7;
    private static final int EMUI_3_1 = 8;
    private static final int EMUI_4_0 = 9;
    private static final int EMUI_4_1 = 10;
    private static final int EMUI_5_0 = 11;
    private static final int EMUI_6_0 = 14;
    private static final int EMUI_8_0_1 = 15;
    private static final int EMUI_9_0 = 17;
    public static final String EMUI_SDK_INT = "EMUI_SDK_INT";
    private static final int EMUI_TYPE_UNKOWN = -1;
    public static final String GET_PRIMARY_COLOR = "getPrimaryColor";
    public static final String GET_SUGGESTION_FOR_GROUND_COLOR_STYLE = "getSuggestionForgroundColorStyle";
    public static final String IMMERSION_STYLE = "com.huawei.android.immersion.ImmersionStyle";
    private static final String TAG = "KPMS_Util_Emui";
    private static final int TYPE_EMUI_30 = 30;
    private static final int TYPE_EMUI_31 = 31;
    private static final int TYPE_EMUI_40 = 40;
    private static final int TYPE_EMUI_41 = 41;
    private static final int TYPE_EMUI_50 = 50;
    private static final int TYPE_EMUI_60 = 60;
    private static final int TYPE_EMUI_801 = 81;
    private static final int TYPE_EMUI_90 = 90;
    private static int emuiType = -1;

    static {
        initEmuiType();
    }

    public static int getEMUIVersionCode() {
        int intValue;
        Object staticFieldObj = ReflectionUtils.getStaticFieldObj(BUILDEX_VERSION, EMUI_SDK_INT);
        if (staticFieldObj != null) {
            try {
                intValue = ((Integer) staticFieldObj).intValue();
            } catch (ClassCastException e) {
                Logger.e(TAG, "getEMUIVersionCode ClassCastException:", e);
            }
            Logger.d(TAG, "the emui version code is::" + intValue);
            return intValue;
        }
        intValue = 0;
        Logger.d(TAG, "the emui version code is::" + intValue);
        return intValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void initEmuiType() {
        /*
            int r0 = getEMUIVersionCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getEmuiType emuiVersionCode="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "KPMS_Util_Emui"
            com.huawei.hms.framework.common.Logger.d(r2, r1)
            r1 = 17
            if (r0 < r1) goto L23
            r0 = 90
        L20:
            com.huawei.hms.framework.common.EmuiUtil.emuiType = r0
            goto L53
        L23:
            r1 = 15
            if (r0 < r1) goto L2a
            r0 = 81
            goto L20
        L2a:
            r1 = 14
            if (r0 < r1) goto L31
            r0 = 60
            goto L20
        L31:
            r1 = 11
            if (r0 < r1) goto L38
            r0 = 50
            goto L20
        L38:
            r1 = 10
            if (r0 < r1) goto L3f
            r0 = 41
            goto L20
        L3f:
            r1 = 9
            if (r0 < r1) goto L46
            r0 = 40
            goto L20
        L46:
            r1 = 8
            if (r0 < r1) goto L4d
            r0 = 31
            goto L20
        L4d:
            r1 = 7
            if (r0 < r1) goto L53
            r0 = 30
            goto L20
        L53:
            int r0 = com.huawei.hms.framework.common.EmuiUtil.emuiType
            r1 = -1
            if (r0 != r1) goto L5d
            java.lang.String r0 = "emuiType is unkown"
            com.huawei.hms.framework.common.Logger.i(r2, r0)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.EmuiUtil.initEmuiType():void");
    }

    public static boolean isEMUI() {
        return -1 != emuiType;
    }

    public static boolean isUpPVersion() {
        String str;
        try {
            if (ReflectionUtils.checkCompatible(BUILDEX_NAME) && ReflectionUtils.checkCompatible(BUILDEX_VERSION)) {
                return BuildEx.VERSION.EMUI_SDK_INT >= 17;
            }
        } catch (NoSuchMethodError unused) {
            str = "no such method for com.huawei.android.os.BuildEx.VERSION";
            Logger.d(TAG, str);
            Logger.d(TAG, "com.huawei.android.os.BuildEx : false");
            return false;
        } catch (Throwable unused2) {
            str = "com.huawei.android.os.BuildEx.VERSION has other exception";
            Logger.d(TAG, str);
            Logger.d(TAG, "com.huawei.android.os.BuildEx : false");
            return false;
        }
        Logger.d(TAG, "com.huawei.android.os.BuildEx : false");
        return false;
    }
}
