package com.alibaba.wireless.aliprivacyext;

import android.app.Activity;
import android.content.Context;
import com.alibaba.security.realidentity.g4;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacy.PrivacyAuthGetParam;
import com.alibaba.wireless.aliprivacy.PrivacyAuthResult;
import com.alibaba.wireless.aliprivacy.PrivacyAuthSetParam;
import com.alibaba.wireless.aliprivacy.PrivacyCode;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cfo;
import tb.cga;
import tb.cgg;
import tb.cgh;
import tb.cgk;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f4236a = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f4237a = new c();
    }

    public static PrivacyCode a(Context context, PrivacyAuthSetParam privacyAuthSetParam) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PrivacyCode) ipChange.ipc$dispatch("6b9b00ec", new Object[]{context, privacyAuthSetParam}) : com.alibaba.wireless.aliprivacy.b.a(context, privacyAuthSetParam, g4.a.f3423a);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4bf61242", new Object[0]) : b.f4237a;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : com.alibaba.wireless.aliprivacy.b.b(context);
    }

    public static List<PrivacyAuthResult> a(Context context, PrivacyAuthGetParam privacyAuthGetParam) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("50ad0dd8", new Object[]{context, privacyAuthGetParam}) : com.alibaba.wireless.aliprivacy.b.a(context, privacyAuthGetParam, g4.a.f3423a);
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        com.alibaba.wireless.aliprivacy.c.a("AliPrivacy", "setPrivacyProfile: " + str + " v: " + str2 + " context: " + context);
        return com.alibaba.wireless.aliprivacyext.recommendation.b.a(context, str, str2);
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        String a2 = com.alibaba.wireless.aliprivacyext.recommendation.b.a(context, str);
        com.alibaba.wireless.aliprivacy.c.a("AliPrivacy", "getPrivacyProfile: " + str + " v: " + a2 + " context: " + context);
        return a2;
    }

    private static synchronized void b(Context context) {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            } else {
                com.alibaba.wireless.aliprivacy.b.a(context, new cgg(), (cfo) null);
            }
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        com.alibaba.wireless.aliprivacyext.recommendation.e a2 = com.alibaba.wireless.aliprivacyext.recommendation.c.a().a(str);
        TrackLog.trackQueryRecommendStatusLog(null, a2.getStatus(), "Native", str, null);
        return a2.getRecommendSwitchBooleanStatus();
    }

    private c() {
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (!f4236a.compareAndSet(false, true)) {
        } else {
            cgh.a(context);
            cgh.a(new cgk(context));
            com.alibaba.wireless.aliprivacyext.recommendation.c.a().a(context, str);
            b(context);
            com.alibaba.wireless.aliprivacyext.plugins.a.a();
        }
    }

    public AuthStatus a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthStatus) ipChange.ipc$dispatch("4abf7852", new Object[]{this, activity, str}) : com.alibaba.wireless.aliprivacy.b.a(activity, new String[]{str});
    }

    public void a(Context context, cga cgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7572c133", new Object[]{this, context, cgaVar});
        } else {
            com.alibaba.wireless.aliprivacy.b.a(context, cgaVar);
        }
    }
}
