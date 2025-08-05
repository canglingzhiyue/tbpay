package com.taobao.android.detail2.core.framework.view.feeds;

import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bga;
import tb.fjt;
import tb.fkp;
import tb.fkr;
import tb.fmc;
import tb.fmd;
import tb.kge;
import tb.lnr;

/* loaded from: classes5.dex */
public class a extends com.taobao.android.detail2.core.framework.base.weex.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f11586a;
    private fmd b;
    private com.taobao.android.detail2.core.framework.b c;
    private d d;
    private C0463a e = new C0463a();

    static {
        kge.a(2001578490);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -506296802) {
            super.a((com.taobao.android.detail2.core.framework.base.weex.a) objArr[0], (String) objArr[1], (JSONObject) objArr[2]);
            return null;
        } else if (hashCode != 728353960) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((com.taobao.android.detail2.core.framework.base.weex.a) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ e a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("24a8916a", new Object[]{aVar}) : aVar.f11586a;
    }

    public static /* synthetic */ void a(a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa03c69", new Object[]{aVar, dVar});
        } else {
            aVar.a(dVar);
        }
    }

    public static /* synthetic */ d b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9abeb3aa", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void b(a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74e65ea", new Object[]{aVar, dVar});
        } else {
            aVar.c(dVar);
        }
    }

    public static /* synthetic */ void c(a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc8f6b", new Object[]{aVar, dVar});
        } else {
            aVar.b(dVar);
        }
    }

    public a(fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar, d dVar) {
        this.b = fmdVar;
        this.c = bVar;
        this.d = dVar;
        this.f11586a = f.a(this.b, this.c, this.d);
        this.b.a(this.e);
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.b
    public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d2861e", new Object[]{this, aVar, str, jSONObject});
            return;
        }
        super.a(aVar, str, jSONObject);
        a(aVar);
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.b
    public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b69cca8", new Object[]{this, aVar, jSONObject});
        } else {
            super.a(aVar, jSONObject);
        }
    }

    private void a(com.taobao.android.detail2.core.framework.base.weex.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41e7748", new Object[]{this, aVar});
            return;
        }
        int b = b();
        aVar.a(f().K().b(), b);
        fjt.a(fjt.TAG_RENDER, this.d.F() + "最终设置给weex的高度：" + b);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (f().b(this.d.F(), this.d.E())) {
            return (int) this.f11586a.f();
        }
        return fmc.a(this.c.h().K().a(), f());
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : f().a(this.d.F(), this.d.E());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f11586a.a(this.d.F(), this.d.E());
        a(this.d);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        e eVar = this.f11586a;
        if (eVar == null) {
            return false;
        }
        return eVar.a();
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799501f7", new Object[]{this, dVar});
        } else if (!f().z() || this.f11586a.b(dVar.F(), dVar.E())) {
        } else {
            ViewGroup.LayoutParams layoutParams = dVar.itemView.getLayoutParams();
            layoutParams.height = f().K().a() - 1;
            dVar.itemView.setLayoutParams(layoutParams);
            bga.c.a("newDetail", fkp.TINCT_SCROLL_OPT, fkp.TINCT_SCROLL_OPT_PRERENDER, "default", true);
        }
    }

    private fkr f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("357cdd4c", new Object[]{this}) : this.c.h();
    }

    /* renamed from: com.taobao.android.detail2.core.framework.view.feeds.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0463a implements fmd.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-518570064);
            kge.a(-37335218);
        }

        private C0463a() {
        }

        @Override // tb.fmd.d
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                return;
            }
            a.a(a.this).c();
            a aVar = a.this;
            a.a(aVar, a.b(aVar));
            a aVar2 = a.this;
            a.b(aVar2, a.b(aVar2));
            a aVar3 = a.this;
            a.c(aVar3, a.b(aVar3));
        }
    }

    private void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340aa278", new Object[]{this, dVar});
        } else if (dVar == null || dVar.i == 0) {
        } else {
            dVar.i.a(this.c);
        }
    }

    private void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8042f9", new Object[]{this, dVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.android.detail2.core.framework.data.model.d.KEY_CONTEXT_DATA_HALF_HEIGHT, (Object) Float.valueOf(lnr.c(this.c)));
        jSONObject.put("screenHeight", (Object) Integer.valueOf(fmc.a(this.c.h().K().a(), f())));
        if (dVar == null) {
            return;
        }
        dVar.b("heightChange", jSONObject);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        e eVar = this.f11586a;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.b(this.e);
        }
    }
}
