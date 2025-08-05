package com.taobao.global.setting;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.data.e;
import com.taobao.login4android.api.Login;
import tb.ksx;
import tb.ksy;
import tb.ksz;
import tb.kta;
import tb.ktb;
import tb.ktc;
import tb.ktd;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static c g;

    /* renamed from: a  reason: collision with root package name */
    private String f17207a;
    private Context b;
    private ktb c;
    private ksz d;
    private ktc e;
    private kta f;

    private c(Context context, String str) {
        this.b = context;
        this.f17207a = str;
    }

    public static c a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1b6127c6", new Object[]{context}) : a(context, "default");
    }

    public static c a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("dd90c690", new Object[]{context, str});
        }
        if (context == null || str == null) {
            throw new IllegalArgumentException("$TaobaoGlobalSettings.getInstance context and bizCode cannot be empty!");
        }
        if (g == null) {
            synchronized (c.class) {
                if (g == null) {
                    g = new c(context.getApplicationContext(), str);
                }
            }
        } else {
            synchronized (c.class) {
                if (!str.equals(g.f17207a)) {
                    g.e = null;
                    g.d = null;
                    g.e = null;
                    g.f = null;
                }
            }
        }
        c cVar = g;
        cVar.f17207a = str;
        return cVar;
    }

    public ktb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ktb) ipChange.ipc$dispatch("f070825", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new ktd(this.f17207a);
        }
        return this.c;
    }

    public ksz b() {
        ksz kszVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksz) ipChange.ipc$dispatch("16b8acab", new Object[]{this});
        }
        synchronized (c.class) {
            if (this.d == null) {
                this.d = new ksx(this.f17207a, this.b);
            }
            kszVar = this.d;
        }
        return kszVar;
    }

    public kta c() {
        kta ktaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kta) ipChange.ipc$dispatch("1e6a52c4", new Object[]{this});
        }
        synchronized (c.class) {
            if (this.f == null) {
                this.f = new ksy(this.b, this.f17207a);
            }
            ktaVar = this.f;
        }
        return ktaVar;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        e.a().c("Global_User_Profile" + Login.getUserId());
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (c.class) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            g = null;
        }
    }
}
