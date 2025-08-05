package com.taobao.android.tracker.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jjk;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.tracker.util.g$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15588a = new int[TrackerType.values().length];

        static {
            try {
                f15588a[TrackerType.TrackerType_Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15588a[TrackerType.TrackerType_Exposure.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(476782711);
    }

    public static com.ut.mini.internal.b a(jjk jjkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.ut.mini.internal.b) ipChange.ipc$dispatch("f447c3b2", new Object[]{jjkVar});
        }
        if (jjkVar == null) {
            return null;
        }
        com.ut.mini.internal.b bVar = new com.ut.mini.internal.b();
        bVar.viewId = d.a(jjkVar);
        bVar.block = jjkVar.f;
        return bVar;
    }

    public static boolean a(TrackerType trackerType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e60e018", new Object[]{trackerType, str})).booleanValue();
        }
        int i = AnonymousClass1.f15588a[trackerType.ordinal()];
        if (i == 1) {
            return b(str);
        }
        if (i == 2) {
            return c(str);
        }
        return false;
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : (!TextUtils.isEmpty(str) && str.indexOf("click") == -1 && str.indexOf(e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP) == -1) ? false : true;
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : TextUtils.isEmpty(str) || str.indexOf("exposure") != -1;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 2101;
        }
        return (str.indexOf("click") == -1 || str.indexOf(e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP) == -1) ? (str.indexOf("click") == -1 && str.indexOf(e.INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP) != -1) ? 2001 : 2101 : e.EVENTID_PAG_AND_CLICK;
    }
}
