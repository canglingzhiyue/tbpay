package com.alibaba.android.split.core.install.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, String> f2431a;
    private static Map<Integer, String> b;

    /* renamed from: com.alibaba.android.split.core.install.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0084a {

        /* renamed from: a  reason: collision with root package name */
        public int f2432a;
        public StringBuilder b = new StringBuilder();

        static {
            kge.a(52646768);
        }
    }

    static {
        kge.a(1173005627);
        f2431a = new HashMap();
        b = new HashMap();
        f2431a.put(1, "No error occurred; only some types of update flow are allowed, while others are forbidden.");
        f2431a.put(-2, "An unknown error occurred.");
        f2431a.put(-3, "The API is not available on this device.");
        f2431a.put(-4, "The request that was sent by the app is malformed.");
        f2431a.put(-5, "The install is unavailable to this user or device.");
        f2431a.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        f2431a.put(-7, "The install/update has not been (fully) downloaded yet.");
        f2431a.put(-8, "The install is already in progress and there is no UI flow to resume.");
        f2431a.put(-100, "An internal error happened in the Play Store.");
        b.put(1, "NO_ERROR_PARTIALLY_ALLOWED");
        b.put(-2, "ERROR_UNKNOWN");
        b.put(-3, "ERROR_API_NOT_AVAILABLE");
        b.put(-4, "ERROR_INVALID_REQUEST");
        b.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        b.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        b.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        b.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        b.put(-100, "ERROR_INTERNAL_ERROR");
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (!f2431a.containsKey(Integer.valueOf(i)) || !b.containsKey(Integer.valueOf(i))) {
            return "";
        }
        String str = f2431a.get(Integer.valueOf(i));
        String str2 = b.get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode");
        sb.append("#");
        sb.append(str2);
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
