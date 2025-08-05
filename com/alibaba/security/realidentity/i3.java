package com.alibaba.security.realidentity;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class i3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "0";
    public static final String c = "id_card";
    public static final String d = "skin";
    public static final String e = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1";
    public static final String f = "type";
    public static final String g = "t";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, c> f3444a;

    /* loaded from: classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final i3 f3445a = new i3();

        public static /* synthetic */ i3 a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i3) ipChange.ipc$dispatch("3c85dfae", new Object[0]) : f3445a;
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f3446a;
        public String b;
        public boolean c;
    }

    public static i3 a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i3) ipChange.ipc$dispatch("3c85dfae", new Object[0]) : b.a();
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2}) : a(str, str2);
    }

    public i3() {
        this.f3444a = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Pair<String, String> a(Context context, String str) {
        Pair<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bb36b1f4", new Object[]{this, context, str});
        }
        synchronized (this.f3444a) {
            File file = new File(str);
            a2 = a(context, file);
            String a3 = i.a(file);
            c cVar = new c();
            cVar.b = a3;
            cVar.f3446a = str;
            cVar.c = false;
            this.f3444a.put(a2.first, cVar);
        }
        return a2;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        synchronized (this.f3444a) {
            if (!this.f3444a.containsKey(str)) {
                return null;
            }
            return this.f3444a.get(str).b;
        }
    }

    public Pair<String, String> a(String str, boolean z) {
        Pair<String, String> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ad592aac", new Object[]{this, str, new Boolean(z)});
        }
        synchronized (this.f3444a) {
            c cVar = new c();
            cVar.f3446a = str;
            cVar.c = z;
            this.f3444a.put(str, cVar);
            pair = new Pair<>(str, b("skin", str));
        }
        return pair;
    }

    private Pair<String, String> a(Context context, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("17a1061", new Object[]{this, context, file});
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        String b2 = b(c, valueOf);
        String b3 = i.b(b(c, valueOf));
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return new Pair<>("0", b2);
        }
        File file2 = new File(a2, b3);
        if (file != null && file.exists() && f.a(file, file2)) {
            return new Pair<>(valueOf, b2);
        }
        return new Pair<>("0", b2);
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context}) : f.b(context, "caches", "wvimage");
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Uri.Builder buildUpon = Uri.parse(e).buildUpon();
        buildUpon.appendQueryParameter("type", str);
        buildUpon.appendQueryParameter("t", str2);
        return buildUpon.toString();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        synchronized (this.f3444a) {
            if (!this.f3444a.containsKey(str)) {
                return null;
            }
            return this.f3444a.get(str).f3446a;
        }
    }
}
