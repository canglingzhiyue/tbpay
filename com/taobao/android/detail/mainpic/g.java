package com.taobao.android.detail.mainpic;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.bridge.NewPicGalleryBridge;
import com.taobao.android.detail.mainpic.f;
import com.taobao.android.detail.mainpic.holder.a;
import com.taobao.android.detail.mainpic.holder.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.avplayer.DWInstance;
import com.uc.webview.export.media.MessageID;
import java.util.List;
import java.util.Map;
import tb.eqb;
import tb.etw;
import tb.ety;
import tb.eua;
import tb.euc;
import tb.euw;

/* loaded from: classes4.dex */
public class g implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f10157a;
    public boolean b;
    public boolean c;
    public f d;
    public c e;
    public e f;
    public d g;
    public eua h;
    public euc i;
    public ety j;
    public h k;
    public com.taobao.android.detail.datasdk.model.datamodel.node.b m;
    public String n;
    private String q;
    private com.taobao.android.detail.datasdk.model.datamodel.node.b r;
    public boolean l = false;
    private boolean o = false;
    private boolean p = false;

    public g(Context context, h hVar) {
        UnifyLog.d("NewMainPicInstance", "NewMainPicInstance create");
        this.f10157a = context;
        this.k = hVar;
        this.d = new f(this);
        this.e = new c(this);
        this.f = new e(this);
        this.g = new d((Activity) context, this);
        NewPicGalleryBridge.init(this);
        euw.a(this);
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        UnifyLog.d("NewMainPicInstance", "init");
        this.d.a(viewGroup);
    }

    public void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c677041", new Object[]{this, bVar, new Integer(i)});
            return;
        }
        this.q = eqb.c(bVar).itemId;
        if (this.m != bVar && !TextUtils.equals(this.n, this.q)) {
            f fVar = this.d;
            if (fVar != null) {
                fVar.a();
            }
            e eVar = this.f;
            if (eVar != null) {
                eVar.a();
            }
        }
        this.r = bVar;
        b(this.f.a(bVar, i));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DWInstance a2 = this.g.a(s());
        if (a2 == null) {
            return;
        }
        a2.pauseVideo();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        UnifyLog.d("NewMainPicInstance", "onDeltaProtocolGenerated isDestroy: " + this.c);
        if (this.c) {
            return;
        }
        this.d.c(jSONObject);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            UnifyLog.d("NewMainPicInstance", "protocol is null, no need refresh");
        } else {
            UnifyLog.d("NewMainPicInstance", "processProtocolRender");
            this.d.c(jSONObject);
            this.e.a(this.d.g());
            if (this.f.n == null) {
                return;
            }
            this.d.c(this.f.n);
        }
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.d.b();
    }

    @Override // com.taobao.android.detail.mainpic.holder.b
    public void H_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802d2a1e", new Object[]{this});
            return;
        }
        UnifyLog.d("NewMainPicInstance", "onItemInvisible");
        if (!this.b) {
            return;
        }
        this.b = false;
        if (this.e.d()) {
            return;
        }
        this.d.c();
    }

    @Override // com.taobao.android.detail.mainpic.holder.b
    public void I_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e202bd", new Object[]{this});
            return;
        }
        UnifyLog.d("NewMainPicInstance", "onItemVisible");
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.e.d()) {
            return;
        }
        this.d.d();
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ad3a564", new Object[]{this}) : this.f10157a;
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        this.l = true;
        this.e.a(iDMComponent);
    }

    public void b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73527f0b", new Object[]{this, iDMComponent});
        } else {
            this.d.a(iDMComponent);
        }
    }

    public void c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f962a", new Object[]{this, iDMComponent});
            return;
        }
        this.l = false;
        this.g.b(iDMComponent);
    }

    public d f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("844d063", new Object[]{this}) : this.g;
    }

    public euc g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (euc) ipChange.ipc$dispatch("3d2e3205", new Object[]{this}) : this.i;
    }

    public void a(euc eucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78d2445", new Object[]{this, eucVar});
        } else {
            this.i = eucVar;
        }
    }

    public eua h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eua) ipChange.ipc$dispatch("44dfd726", new Object[]{this}) : this.h;
    }

    public void a(eua euaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78c3b87", new Object[]{this, euaVar});
        } else {
            this.h = euaVar;
        }
    }

    public static final g a(Context context, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b5c31b35", new Object[]{context, hVar}) : new g(context, hVar);
    }

    public ety i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ety) ipChange.ipc$dispatch("4c917bac", new Object[]{this}) : this.j;
    }

    public void a(ety etyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7890cee", new Object[]{this, etyVar});
        } else {
            this.j = etyVar;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.b;
    }

    public h k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("c765a7e4", new Object[]{this}) : this.k;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.p;
    }

    public com.alibaba.android.ultron.vfw.instance.d m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("23ef4899", new Object[]{this}) : this.e.c();
    }

    public com.alibaba.android.ultron.vfw.instance.d n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("99696eda", new Object[]{this}) : this.d.f();
    }

    public e o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("f9e6538b", new Object[]{this}) : this.f;
    }

    public com.alibaba.android.ultron.event.base.d p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.event.base.d) ipChange.ipc$dispatch("81c65c33", new Object[]{this});
        }
        h hVar = this.k;
        if (hVar == null) {
            return null;
        }
        return hVar.d();
    }

    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.d.h();
    }

    public int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.e.e();
    }

    public IDMComponent s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("511a867e", new Object[]{this}) : this.d.i();
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.l;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.o;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void a(f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5251583f", new Object[]{this, aVar});
        } else {
            this.d.a(aVar);
        }
    }

    public void a(f.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5251cc9e", new Object[]{this, bVar});
        } else {
            this.d.a(bVar);
        }
    }

    public Map<String, String> v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7f0ead72", new Object[]{this}) : this.f.n();
    }

    public long w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27172", new Object[]{this})).longValue() : this.f.b();
    }

    public void a(etw etwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7882430", new Object[]{this, etwVar});
            return;
        }
        f fVar = this.d;
        if (fVar == null) {
            return;
        }
        fVar.a(etwVar);
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        UnifyLog.d("NewMainPicInstance", MessageID.onDestroy);
        this.c = true;
        this.d.e();
        this.e.b();
        this.g.a();
        NewPicGalleryBridge.destroy(this);
        a.b(this.f10157a);
    }

    public String y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c806420", new Object[]{this}) : TextUtils.isEmpty(this.q) ? "" : this.q;
    }

    public List<IDMComponent> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("143f826", new Object[]{this});
        }
        c cVar = this.e;
        if (cVar != null) {
            return cVar.f();
        }
        return null;
    }

    public com.taobao.android.detail.datasdk.model.datamodel.node.b A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.datamodel.node.b) ipChange.ipc$dispatch("4905ad28", new Object[]{this}) : this.r;
    }

    public JSONObject B() {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f4cdae9", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.r;
        if (bVar != null && (a2 = bVar.a()) != null) {
            return a2.getJSONObject("buyInsideData");
        }
        return null;
    }
}
