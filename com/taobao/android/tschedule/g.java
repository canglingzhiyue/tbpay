package com.taobao.android.tschedule;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.aidl.ITScheduleStatus;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.List;
import tb.jkq;
import tb.jmi;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ITScheduleStatus f15663a;

    static {
        kge.a(1696746598);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!jmi.a(e.b())) {
            jkq.a("TS.Status", "not main process, discard reset status");
        } else {
            TScheduleStatusService.a();
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            if (f15663a == null) {
                return TScheduleStatusService.a(str);
            }
            return f15663a.getPageUrl(str);
        } catch (Throwable th) {
            jkq.a("TS.Status", "getPageUrl error", th);
            return null;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            if (f15663a == null) {
                jkq.a("TS.Status", "getPageKeys aidl service is empty");
                return null;
            }
            return f15663a.getPageKeys();
        } catch (Throwable th) {
            jkq.a("TS.Status", "getPageKeys error", th);
            return null;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!jmi.a(e.b())) {
            jkq.a("TS.Status", "not main process, discard updatePageUrl");
        } else {
            TScheduleStatusService.a(str, str2);
        }
    }

    public static List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]);
        }
        try {
            if (f15663a == null) {
                jkq.a("TS.Status", "getChangeFlags aidl service is empty");
                return null;
            }
            String changeFlags = f15663a.getChangeFlags();
            if (!TextUtils.isEmpty(changeFlags)) {
                return JSON.parseArray(changeFlags, String.class);
            }
            return null;
        } catch (Throwable th) {
            jkq.a("TS.Status", "getChangeFlags error", th);
            return null;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        try {
            if (f15663a == null) {
                jkq.a("TS.Status", "finishChange aidl service is empty");
            } else {
                f15663a.finishChange(str);
            }
        } catch (Throwable th) {
            jkq.a("TS.Status", "finishChange error", th);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            try {
                if (f15663a == null) {
                    jkq.a("TS.Status", "addRenderUrl aidl service is empty");
                    TScheduleStatusService.b(str, str2);
                    return;
                }
                f15663a.addRenderUrl(str, str2);
            } catch (Throwable th) {
                jkq.a("TS.Status", "addRenderUrl error", th);
            }
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                if (f15663a == null) {
                    jkq.a("TS.Status", "removeRenderUrlByKey aidl service is empty");
                    TScheduleStatusService.b(str);
                    return;
                }
                f15663a.removeRenderUrlByKey(str);
            } catch (Throwable th) {
                jkq.a("TS.Status", "removeRenderUrlByKey error", th);
            }
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (f15663a == null) {
                jkq.a("TS.Status", "removeRenderUrlByValue aidl service is empty");
                return TScheduleStatusService.c(str);
            }
            return f15663a.removeRenderUrlByValue(str);
        } catch (Throwable th) {
            jkq.a("TS.Status", "removeRenderUrlByValue error", th);
            return null;
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        try {
            if (f15663a == null) {
                jkq.a("TS.Status", "getRenderUrl aidl service is empty");
                return TScheduleStatusService.d(str);
            }
            return f15663a.getRenderUrl(str);
        } catch (Throwable th) {
            jkq.a("TS.Status", "getRenderUrl error", th);
            return null;
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (f15663a == null) {
                jkq.a("TS.Status", "isRenderUrl aidl service is empty");
                return TScheduleStatusService.e(str);
            }
            return f15663a.isRenderUrl(str);
        } catch (Throwable th) {
            jkq.a("TS.Status", "isRenderUrl error", th);
            return false;
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        try {
            if (f15663a == null) {
                jkq.a("TS.Status", "isRenderUrl aidl service is empty");
                return null;
            }
            return f15663a.getRenderUrls();
        } catch (Throwable th) {
            jkq.a("TS.Status", "isRenderUrl error", th);
            return null;
        }
    }

    public static void a(String str, String str2, List<TimeContent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3a26d", new Object[]{str, str2, list});
        } else if (!jmi.a(e.b())) {
            jkq.a("TS.Status", "not main process, discard addConfigUrl");
        } else {
            TScheduleStatusService.a(str, str2, list);
        }
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (f15663a == null) {
                jkq.a("TS.Status", "isConfigrUrl aidl service is empty");
                return false;
            }
            return f15663a.isConfigrUrl(str);
        } catch (Throwable th) {
            jkq.a("TS.Status", "isConfigrUrl error", th);
            return false;
        }
    }
}
