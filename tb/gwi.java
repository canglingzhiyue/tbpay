package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gwi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_TTID = "hybrid@lightvane_android_1.0.0";
    public static final String DEFAULT_UA = " LightVane/1.0.0";
    public static final String VERSION = "1.0.0";

    /* renamed from: a  reason: collision with root package name */
    public static String f28538a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    public static Application i;

    static {
        kge.a(1572896146);
        f28538a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
    }

    public static boolean a(Application application, mty mtyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d855f9", new Object[]{application, mtyVar})).booleanValue();
        }
        if (mtyVar == null) {
            return false;
        }
        f28538a = TextUtils.isEmpty(mtyVar.f31262a) ? DEFAULT_TTID : mtyVar.f31262a;
        b = mtyVar.b;
        c = mtyVar.c;
        d = mtyVar.d;
        e = mtyVar.e;
        f = mtyVar.f;
        g = mtyVar.g;
        h = mtyVar.h;
        return true;
    }
}
