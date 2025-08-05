package com.alibaba.android.aura;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.kge;

/* loaded from: classes2.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2161a = "AURAUserContext";
    private Context b;
    private String c;
    private String d;
    private final Map<String, Object> e;
    private s f;

    static {
        kge.a(69081750);
    }

    public q(Context context, Map<String, Object> map) {
        this.b = context;
        if (map == null) {
            this.e = new HashMap();
        } else {
            this.e = map;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        b(context);
        this.b = context;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        if (this.b != null) {
            v.a().b(this.b, this.f);
        }
        v.a().a(context, this.f);
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.e;
    }

    public void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6ecbcf", new Object[]{this, sVar});
            return;
        }
        this.f = sVar;
        v.a().a(this.b, this.f);
    }

    public s b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("c46eec34", new Object[]{this}) : this.f;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            arc.a().c("AURAUserContext", "setBizCode", "bizCode为空");
        }
        this.c = str;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String str = this.d;
        return str == null ? "" : str;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : TextUtils.isEmpty(this.c) ? "defaultNone" : this.c;
    }

    public <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        T t = (T) this.e.get(str);
        if (t != null && cls != null && cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        return null;
    }

    public <T> T a(String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("41b809ab", new Object[]{this, str, cls, t});
        }
        T t2 = (T) this.e.get(str);
        return (t2 == null || cls == null || !cls.isAssignableFrom(t2.getClass())) ? t : t2;
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ad3a564", new Object[]{this}) : this.b;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.b != null) {
            v.a().b(this.b, this.f);
        }
        this.b = null;
        this.f = null;
    }
}
