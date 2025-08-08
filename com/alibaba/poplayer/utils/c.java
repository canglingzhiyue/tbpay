package com.alibaba.poplayer.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.norm.ILogAdapter;
import com.alibaba.poplayer.norm.ITrackLogAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CATEGORY_CONFIG_CHECK = "configCheck";
    public static final String CATEGORY_CONFIG_UPDATE = "configUpdate";
    public static final String CATEGORY_CONTAINER_LIFE_CYCLE = "containerLifeCycle";
    public static final String CATEGORY_LIFE_CYCLE = "sdkLifeCycle";
    public static final String CATEGORY_OTHER = "other";
    public static final String CATEGORY_PAGE_LIFE_CYCLE = "pageLifeCycle";
    public static final String CATEGORY_TRIGGER_EVENT = "triggerEvent";
    public static final String CATEGORY_WEB_JSBRIDGE = "webJSBridge";
    public static final String CATEGORY_WEEX_JSBRIDGE = "weexJSBridge";

    /* renamed from: a  reason: collision with root package name */
    private static ILogAdapter f3217a;

    static {
        kge.a(-169054120);
        f3217a = null;
    }

    public static void a(ILogAdapter iLogAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ad93ea", new Object[]{iLogAdapter});
        } else {
            f3217a = iLogAdapter;
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            a(true, "Common", str, str2, str3);
        }
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{str, str2, str3});
        } else {
            a(true, "Common", str, str2, str3);
        }
    }

    private static void a(boolean z, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab8b794", new Object[]{new Boolean(z), str, str2, str3, str4});
            return;
        }
        try {
            if (f3217a == null) {
                return;
            }
            if (!(f3217a instanceof ITrackLogAdapter)) {
                f3217a.Logi(str4, new Object[0]);
            } else if (z) {
                ((ITrackLogAdapter) f3217a).LogiImmediate(true, str, str2, str3, str4);
            } else {
                ((ITrackLogAdapter) f3217a).Logi(true, str, str2, str3, str4);
            }
        } catch (Throwable th) {
            a("log.error.e=" + th + th.getMessage());
        }
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        try {
            if (PopLayer.DEBUG && objArr.length != 0) {
                String.format(str, objArr);
            }
            if (f3217a == null) {
                return;
            }
            f3217a.Logi(str, objArr);
        } catch (Throwable th) {
            a("log.error.e=" + th + th.getMessage());
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a("Common", str, str2, str3);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            if (f3217a == null) {
                return;
            }
            if (f3217a instanceof ITrackLogAdapter) {
                ((ITrackLogAdapter) f3217a).Loge(true, str, str2, str3, str4);
            } else {
                f3217a.Loge(str4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            if (PopLayer.DEBUG) {
                Log.e("PopLayer", str);
            }
            if (f3217a == null) {
                return;
            }
            f3217a.Loge(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else {
            a(false, str, th);
        }
    }

    public static void a(boolean z, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d224177f", new Object[]{new Boolean(z), str, th});
        } else if (z) {
            a(TLogTracker.SCENE_EXCEPTION, "", "", str + "\nstack:" + Log.getStackTraceString(th));
        } else {
            a(str + "\nstack:" + Log.getStackTraceString(th));
        }
    }

    public static String d(String str, String str2, String str3) {
        String str4;
        String str5 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc28137", new Object[]{str, str2, str3});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return str5;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[PoplayerSDK_");
            sb.append(str);
            sb.append(riy.ARRAY_END_STR);
            if (StringUtils.isEmpty(str2)) {
                str4 = str5;
            } else {
                str4 = "[popId:" + str2 + riy.ARRAY_END_STR;
            }
            sb.append(str4);
            sb.append(":");
            sb.append(str3);
            return sb.toString();
        } catch (Throwable th) {
            a("generateTrackMsg error", th);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[PoplayerSDK_");
            sb2.append(str);
            sb2.append(riy.ARRAY_END_STR);
            if (!StringUtils.isEmpty(str2)) {
                str5 = "[popId:" + str2 + riy.ARRAY_END_STR;
            }
            sb2.append(str5);
            return sb2.toString();
        }
    }
}
