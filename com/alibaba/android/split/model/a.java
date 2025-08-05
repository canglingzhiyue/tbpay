package com.alibaba.android.split.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map f2494a;
    private static Map b;

    static {
        kge.a(-1767427662);
        f2494a = new HashMap();
        b = new HashMap();
        f2494a.put(-1, "Too many sessions are running for current app, existing sessions must be resolved first.");
        f2494a.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        f2494a.put(-3, "Request is otherwise invalid.");
        f2494a.put(-4, "Requested session is not found.");
        f2494a.put(-5, "Split Install API is not available.");
        f2494a.put(-6, "Network error: unable to obtain split details.");
        f2494a.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        f2494a.put(-8, "Requested session contains modules from an existing active session and also new");
        f2494a.put(-9, "Service handling split install has died.");
        f2494a.put(-10, "Install failed due to insufficient storage.");
        f2494a.put(-11, "Signature verification error when invoking SplitCompat.");
        f2494a.put(-12, "Error in SplitCompat emulation.");
        f2494a.put(-13, "Error in copying files for SplitCompat.");
        f2494a.put(-100, "Unknown error processing split install.");
        b.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        b.put(-2, "MODULE_UNAVAILABLE");
        b.put(-3, "INVALID_REQUEST");
        b.put(-4, "SESSION_NOT_FOUND");
        b.put(-5, "API_NOT_AVAILABLE");
        b.put(-6, "NETWORK_ERROR");
        b.put(-7, "ACCESS_DENIED");
        b.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        b.put(-9, "SERVICE_DIED");
        b.put(-10, "INSUFFICIENT_STORAGE");
        b.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        b.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        b.put(-13, "SPLITCOMPAT_COPY_ERROR");
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (!f2494a.containsKey(Integer.valueOf(i)) || !b.containsKey(Integer.valueOf(i))) {
            return "";
        }
        String str = (String) f2494a.get(Integer.valueOf(i));
        String str2 = (String) b.get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html");
        sb.append("#");
        sb.append(str2);
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
