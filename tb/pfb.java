package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.dxbottomBar.a;
import com.taobao.taolive.movehighlight.controller.TaoliveHighlightController;
import com.taobao.taolive.movehighlight.utils.k;
import com.taobao.taolive.movehighlight.utils.o;
import java.util.HashMap;
import tb.pfr;

/* loaded from: classes8.dex */
public class pfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static pfb l;

    /* renamed from: a  reason: collision with root package name */
    public pgf f32581a;
    public a b;
    public pfg d;
    public pfr.a g;
    public TaoliveHighlightController.a h;
    public pfi i;
    public pgl j;
    public pfe k;
    public JSONObject m;

    static {
        kge.a(-943779272);
    }

    public static pfb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfb) ipChange.ipc$dispatch("f091972", new Object[0]);
        }
        if (l == null) {
            synchronized (pfb.class) {
                if (l == null) {
                    l = new pfb();
                }
            }
        }
        return l;
    }

    public pgf b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pgf) ipChange.ipc$dispatch("16bac30e", new Object[]{this}) : this.f32581a;
    }

    public void a(pgf pgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98e8729", new Object[]{this, pgfVar});
        } else {
            this.f32581a = pgfVar;
        }
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("86007d82", new Object[]{this}) : this.b;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67151c0", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public pfg e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfg) ipChange.ipc$dispatch("2dcfaf89", new Object[]{this}) : this.d;
    }

    public void a(pfg pfgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f980e407", new Object[]{this, pfgVar});
        } else {
            this.d = pfgVar;
        }
    }

    public pfr.a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfr.a) ipChange.ipc$dispatch("9e4003de", new Object[]{this}) : this.g;
    }

    public void a(pfr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae72453f", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public TaoliveHighlightController.a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoliveHighlightController.a) ipChange.ipc$dispatch("27b92903", new Object[]{this}) : this.h;
    }

    public void a(TaoliveHighlightController.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179caf45", new Object[]{this, aVar});
        } else {
            this.h = aVar;
        }
    }

    public pfi j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfi) ipChange.ipc$dispatch("5447eaa2", new Object[]{this}) : this.i;
    }

    public void a(pfi pfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f981ccc5", new Object[]{this, pfiVar});
        } else {
            this.i = pfiVar;
        }
    }

    public pgl k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pgl) ipChange.ipc$dispatch("5bf9941f", new Object[]{this}) : this.j;
    }

    public void a(pgl pglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9914163", new Object[]{this, pglVar});
        } else {
            this.j = pglVar;
        }
    }

    public pfe l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfe) ipChange.ipc$dispatch("63ab34e4", new Object[]{this}) : this.k;
    }

    public void a(pfe pfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97ffb49", new Object[]{this, pfeVar});
        } else {
            this.k = pfeVar;
        }
    }

    public JSONObject n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("70253515", new Object[]{this}) : this.m;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.m = jSONObject;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        a((pgf) null);
        a((a) null);
        a((pfg) null);
        a((pfr.a) null);
        a((TaoliveHighlightController.a) null);
        a((pfi) null);
        a((pgl) null);
        a((pfe) null);
    }

    public static pfb a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfb) ipChange.ipc$dispatch("83a302dd", new Object[]{aVar});
        }
        if (k.a(aVar)) {
            return k.b(aVar).b();
        }
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            hashMap.put("frameContext", String.valueOf(aVar.hashCode()));
        }
        o.a(aVar, 19999, "highlight_local_adapter_refactor", hashMap);
        return a();
    }
}
