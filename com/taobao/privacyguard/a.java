package com.taobao.privacyguard;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f18944a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Application f;
    private boolean g;

    static {
        kge.a(2017018329);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ad41af77", new Object[0]);
        }
        if (f18944a == null) {
            synchronized (a.class) {
                if (f18944a == null) {
                    f18944a = new a();
                }
            }
        }
        return f18944a;
    }

    public void a(Application application, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9eeaf2e", new Object[]{this, application, map});
            return;
        }
        this.f = application;
        this.c = map.get("ttid") + "";
        this.b = map.get("appVersion") + "";
        this.d = map.get("dailyAppKey") + "";
        this.e = map.get("packageName") + "";
        if ((this.f.getApplicationInfo().flags & 2) == 0) {
            z = false;
        }
        this.g = z;
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : this.f;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : StringUtils.equals(this.c.split("@")[0], "212200");
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (e()) {
            return false;
        }
        String[] split = this.b.split("\\.");
        if (split.length != 4 || Integer.parseInt(split[3]) >= 700) {
            return false;
        }
        String.format("isGrayPackage: gray scale version %s", this.b);
        return true;
    }
}
