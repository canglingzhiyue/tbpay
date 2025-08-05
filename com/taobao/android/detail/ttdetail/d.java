package com.taobao.android.detail.ttdetail;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.a;
import tb.eyx;
import tb.eyz;
import tb.ezh;
import tb.ezl;
import tb.ezr;
import tb.ezv;
import tb.kge;
import tb.odg;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TTDetailContainer";

    /* renamed from: a  reason: collision with root package name */
    public Context f10595a;
    private eyx b;
    private eyz c;
    private ezv d;
    private ezr e;
    private ezl f;
    private a g;
    private ezh h;
    private final boolean i;

    static {
        kge.a(-1736588067);
    }

    public static /* synthetic */ eyz a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyz) ipChange.ipc$dispatch("71bfdeba", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ ezr b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ezr) ipChange.ipc$dispatch("636987a2", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ ezl c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ezl) ipChange.ipc$dispatch("55132d07", new Object[]{dVar}) : dVar.f;
    }

    public static /* synthetic */ a d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("df8e6440", new Object[]{dVar}) : dVar.g;
    }

    public static /* synthetic */ ezv e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ezv) ipChange.ipc$dispatch("38667a7b", new Object[]{dVar}) : dVar.d;
    }

    public static /* synthetic */ ezh f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ezh) ipChange.ipc$dispatch("2a101ee8", new Object[]{dVar}) : dVar.h;
    }

    public d(Context context) {
        this(context, null, null);
    }

    public d(Context context, String str, eyx eyxVar) {
        this.b = new eyx() { // from class: com.taobao.android.detail.ttdetail.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eyx
            public Context g() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6d736e66", new Object[]{this}) : d.this.f10595a;
            }

            @Override // tb.eyx
            public eyz a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (eyz) ipChange.ipc$dispatch("f046398", new Object[]{this}) : d.a(d.this);
            }

            @Override // tb.eyx
            public ezr b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ezr) ipChange.ipc$dispatch("16b60bc0", new Object[]{this}) : d.b(d.this);
            }

            @Override // tb.eyx
            public ezl c() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ezl) ipChange.ipc$dispatch("1e67b065", new Object[]{this}) : d.c(d.this);
            }

            @Override // tb.eyx
            public a d() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("539b70de", new Object[]{this}) : d.d(d.this);
            }

            @Override // tb.eyx
            public ezv e() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ezv) ipChange.ipc$dispatch("2dcafc59", new Object[]{this}) : d.e(d.this);
            }

            @Override // tb.eyx
            public ezh f() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ezh) ipChange.ipc$dispatch("357ca006", new Object[]{this}) : d.f(d.this);
            }
        };
        if (!odg.a()) {
            throw new IllegalStateException("must initialize PlatformEvn first with new PlatformEvn.Initializer().withXXX().initialize()");
        }
        this.i = eyxVar != null;
        if (this.i) {
            this.b = eyxVar;
        }
        this.f10595a = context;
        com.taobao.android.detail.ttdetail.communication.c.a(context);
        a(context, str, this.i);
    }

    private void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
        } else if (z) {
            this.d = this.b.e();
            this.f = this.b.c();
            this.c = this.b.a();
            this.g = this.b.d();
            this.e = this.b.b();
            this.h = this.b.f();
        } else {
            this.d = new ezv(context, this.b, str);
            this.f = new ezl(context, this.b);
            this.c = new eyz(context, this.b);
            this.g = new a(context, this.b);
            this.e = new ezr(context, this.b);
            this.h = new ezh.a(context, this.b, ezh.DINAMIC_BIZ_NAME).a(15).a("detail").a();
        }
    }

    public eyx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("f04635a", new Object[]{this}) : this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.i) {
        } else {
            com.taobao.android.detail.ttdetail.communication.c.b(this.f10595a);
            this.b.h();
        }
    }
}
