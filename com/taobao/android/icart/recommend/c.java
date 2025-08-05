package com.taobao.android.icart.recommend;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.impl.CartMainRecommend;
import com.taobao.android.icart.recommend.impl.a;
import com.taobao.android.icart.widget.CartRecyclerView;
import tb.bbz;
import tb.bem;
import tb.jnq;
import tb.jqg;
import tb.kge;
import tb.osc;

/* loaded from: classes5.dex */
public final class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f12846a;

    static {
        kge.a(873832483);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474194533) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != -125736071) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((osc) objArr[0]);
            return null;
        }
    }

    public c(CartRecyclerView cartRecyclerView, bbz bbzVar, String str) {
        char c;
        jqg.a("CartRecommendWrapper", "type=", str);
        int hashCode = str.hashCode();
        if (hashCode != -906336856) {
            if (hashCode == 3343801 && str.equals("main")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("search")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            this.f12846a = new a(cartRecyclerView, bbzVar);
        } else if (c == 1) {
            this.f12846a = new CartMainRecommend(cartRecyclerView, bbzVar);
        } else {
            String w = bbzVar.v().w();
            jqg.a("CartRecommendWrapper", "feedFlowType=", w);
            if (QueryParamsManager.CartFeedFlowType.search.equals(w)) {
                this.f12846a = new a(cartRecyclerView, bbzVar);
            } else {
                this.f12846a = new CartMainRecommend(cartRecyclerView, bbzVar);
            }
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f12846a.a();
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(jnq<RecyclerView> jnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb9180b", new Object[]{this, jnqVar});
        } else {
            this.f12846a.a(jnqVar);
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f12846a.b();
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f12846a.c();
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f12846a.d();
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f12846a.a(str);
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.f12846a.e();
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        this.f12846a.a(i);
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f12846a.f();
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f12846a.g();
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        boolean h = this.f12846a.h();
        jqg.b("CartRecommendWrapper", "needLoadRecommend=" + h);
        return h;
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.f12846a.i();
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(osc oscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8816b79", new Object[]{this, oscVar});
            return;
        }
        super.a(oscVar);
        this.f12846a.a(oscVar);
    }

    public static boolean a(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16d5062", new Object[]{bbzVar})).booleanValue();
        }
        if (bbzVar == null) {
            return false;
        }
        return bbzVar.n().a() || bbzVar.n().j() || b(bbzVar) != null;
    }

    public static JSONObject b(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2043c5ff", new Object[]{bbzVar});
        }
        JSONObject i = bem.i(bbzVar.n());
        if (i != null) {
            return i.getJSONObject("customParams");
        }
        return null;
    }
}
