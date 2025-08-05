package com.taobao.android.revisionswitch.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class LocationHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_EDITION_CODE_CHANGED = "EDITON_SWITCHER_EDITTION_CODE_CHANGED";
    public static final String ELDER_HOME = "elderHome";
    public static final int MAINLAND = 0;
    public static final int OLD = 2;
    public static final int OTHER = 3;
    public static final int OVERSEAS = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface LocationFrom {
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        PositionInfo b = com.taobao.android.editionswitcher.b.b(context);
        if (com.taobao.android.editionswitcher.b.d(context)) {
            return 1;
        }
        if ("CN".equalsIgnoreCase(b.editionCode)) {
            return 0;
        }
        return "OLD".equalsIgnoreCase(b.editionCode) ? 2 : 3;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (TBRevisionSwitchManager.f14881a) {
            return com.taobao.android.editionswitcher.b.f(context);
        }
        return "CN".equalsIgnoreCase(com.taobao.android.editionswitcher.b.b(context).editionCode);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : com.taobao.android.editionswitcher.b.d(context);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : "1".equalsIgnoreCase(TBRevisionSwitchManager.i().c("elderHome"));
    }
}
