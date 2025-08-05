package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.r;
import com.taobao.taobao.R;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.boc;
import tb.dlr;
import tb.jaj;

/* loaded from: classes6.dex */
public final class jak<P extends jaj, C extends dlr> implements IAKPopRender<P, C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private C f29429a;
    private Context b;
    private d c;
    private P d;

    static {
        kge.a(52147564);
        kge.a(1155607034);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean a(View contentView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, contentView, new Integer(i)})).booleanValue();
        }
        q.d(contentView, "contentView");
        return false;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void b(String type, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, type, jSONObject});
        } else {
            q.d(type, "type");
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void dW_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b500d3", new Object[]{this});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public /* bridge */ /* synthetic */ void a(dle dleVar, c cVar, View view, com.taobao.android.abilitykit.ability.pop.render.d dVar) {
        a((jak<P, C>) ((dlr) dleVar), (dlr) ((jaj) cVar), view, dVar);
    }

    public void a(C abilityRuntimeContext, P params, View view, com.taobao.android.abilitykit.ability.pop.render.d callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce42e38", new Object[]{this, abilityRuntimeContext, params, view, callback});
            return;
        }
        q.d(abilityRuntimeContext, "abilityRuntimeContext");
        q.d(params, "params");
        q.d(callback, "callback");
        this.d = params;
        this.f29429a = abilityRuntimeContext;
        Context a2 = abilityRuntimeContext.a();
        if (a2 != null) {
            if (dms.b(a2)) {
                params.a().a(new boc.a().a(new DXEngineConfig.a(params.a().b()).a(true, true)).a());
            }
            d ultronInstance = d.a(params.a(), a2);
            this.c = ultronInstance;
            String str = params.g;
            if (str != null) {
                Iterator<T> it = hvd.INSTANCE.a(str).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    q.b(ultronInstance, "ultronInstance");
                    ultronInstance.d().b((String) pair.component1(), (com.alibaba.android.ultron.event.q) pair.component2());
                }
                q.b(ultronInstance, "ultronInstance");
                bob l = ultronInstance.l();
                q.b(l, "ultronInstance.engineManager");
                bd a3 = l.a();
                q.b(a3, "ultronInstance.engineManager.dxEngine");
                DinamicXEngine d = a3.d();
                q.b(d, "ultronInstance.engineManager.dxEngine.engine");
                hvc.a(str, d);
            }
            View inflate = LayoutInflater.from(a2).inflate(R.layout.tak_ultron_pop, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.tak_ultron_pop_body);
            recyclerView.setLayoutManager(new LinearLayoutManager(a2));
            t tVar = t.INSTANCE;
            ultronInstance.a((LinearLayout) inflate.findViewById(R.id.tak_ultron_pop_header), recyclerView, (LinearLayout) inflate.findViewById(R.id.tak_ultron_pop_footer));
            t tVar2 = t.INSTANCE;
            callback.a(inflate);
            ultronInstance.a(params.b(), (d.c) null);
            t tVar3 = t.INSTANCE;
        } else {
            a2 = null;
        }
        this.b = a2;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.d == null || this.c == null) {
        } else {
            if (dms.b(this.b)) {
                d dVar = this.c;
                q.a(dVar);
                bny q = dVar.q();
                q.b(q, "mUltronInstance!!.viewEngine");
                q.f(View.MeasureSpec.makeMeasureSpec(i, 1073741824));
            }
            d dVar2 = this.c;
            q.a(dVar2);
            P p = this.d;
            q.a(p);
            dVar2.a(p.b(), (d.c) null);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(String type, JSONObject jSONObject) {
        DXRuntimeContext h;
        r C;
        DinamicXEngine b;
        dkt l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, type, jSONObject});
            return;
        }
        q.d(type, "type");
        C c = this.f29429a;
        if (!(c instanceof l)) {
            c = null;
        }
        l lVar = (l) c;
        if (lVar == null || (h = lVar.h()) == null || (C = h.C()) == null || (b = C.b()) == null || (l = b.l()) == null) {
            return;
        }
        l.a(type, jSONObject);
    }
}
