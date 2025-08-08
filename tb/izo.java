package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.android.abilitykit.ability.pop.render.d;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dlr;
import tb.izn;

/* loaded from: classes6.dex */
public class izo<PARAMS extends izn, CONTEXT extends dlr> extends com.taobao.android.abilitykit.ability.pop.render.b<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_STD_DX_POP = "DxStdPop";
    public static final a Companion;
    private DXRootView b;
    private CONTEXT c;
    private int d;
    private int e;
    private d f;
    private jnl g;

    static {
        kge.a(-86700116);
        Companion = new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(izo izoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -994991334) {
            super.a((izo) ((dlr) objArr[0]), (dlr) ((c) objArr[1]), (View) objArr[2], (d) objArr[3]);
            return null;
        } else if (hashCode != 1714797822) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((String) objArr[0], (JSONObject) objArr[1]);
            return null;
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

    public static final /* synthetic */ c a(izo izoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7749bfe1", new Object[]{izoVar}) : izoVar.f8938a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public /* bridge */ /* synthetic */ void a(dle dleVar, c cVar, View view, d dVar) {
        a((izo<PARAMS, CONTEXT>) ((dlr) dleVar), (dlr) ((izn) cVar), view, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.b
    public /* bridge */ /* synthetic */ void a(dlr dlrVar, c cVar, View view, d dVar) {
        a((izo<PARAMS, CONTEXT>) dlrVar, (dlr) ((izn) cVar), view, dVar);
    }

    public final void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else {
            this.b = dXRootView;
        }
    }

    public final d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("36f2425f", new Object[]{this}) : this.f;
    }

    public void a(CONTEXT akCtx, PARAMS params, View view, d callback) {
        alr a2;
        r C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f11c902", new Object[]{this, akCtx, params, view, callback});
            return;
        }
        q.d(akCtx, "akCtx");
        q.d(params, "params");
        q.d(callback, "callback");
        super.a((izo<PARAMS, CONTEXT>) akCtx, (CONTEXT) params, view, callback);
        this.c = akCtx;
        this.f = callback;
        Context a3 = akCtx.a();
        String str = null;
        if (a3 == null) {
            callback.a(new dkv(90001, "DxPopNoAppCtx"), null);
            return;
        }
        DinamicXEngine dinamicXEngine = null;
        if (params.i.c() && (akCtx instanceof l)) {
            DXRuntimeContext h = ((l) akCtx).h();
            dinamicXEngine = (h == null || (C = h.C()) == null) ? null : C.b();
        }
        DinamicXEngine dinamicXEngine2 = dinamicXEngine;
        String bizId = StringUtils.isEmpty(params.d) ? BIZ_STD_DX_POP : params.d;
        dkt e = akCtx.e();
        String str2 = params.g;
        if (str2 != null) {
            str = str2;
        } else if (e != null && (a2 = e.a()) != null) {
            str = a2.e();
        }
        String str3 = str == null ? "AbilityKit" : str;
        jnk jnkVar = params.i;
        q.b(jnkVar, "params.dxConfig");
        q.b(bizId, "bizId");
        jnl jnlVar = new jnl(a3, jnkVar, bizId, str3, dinamicXEngine2, e);
        jnlVar.a(new b(callback, a3));
        hvc.a(izm.NAME_SPACE_MEGA_DESIGN, jnlVar.a());
        t tVar = t.INSTANCE;
        this.g = jnlVar;
    }

    /* loaded from: classes6.dex */
    public static final class b implements jnn {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d b;
        public final /* synthetic */ Context c;

        public b(d dVar, Context context) {
            this.b = dVar;
            this.c = context;
        }

        @Override // tb.jnn
        public void a(String msg, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c703f88f", new Object[]{this, msg, sVar});
                return;
            }
            q.d(msg, "msg");
            d dVar = this.b;
            dVar.a(new dkv(90001, msg + "|DxError=" + sVar), new PopErrorView(this.c, izo.a(izo.this)));
        }

        @Override // tb.jnn
        public void a(DXRootView dxRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc619e9", new Object[]{this, dxRootView});
                return;
            }
            q.d(dxRootView, "dxRootView");
            izo.this.a(dxRootView);
            d a2 = izo.this.a();
            q.a(a2);
            a2.a(dxRootView);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d = i;
        this.e = i2;
        b();
    }

    private final void b() {
        DXRuntimeContext h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g == null || this.b == null || this.c == null || this.f8938a == null || this.b == null || this.d <= 0 || this.e <= 0) {
        } else {
            CONTEXT context = this.c;
            Context a2 = context != null ? context.a() : null;
            if (a2 == null) {
                return;
            }
            DXRenderOptions.a b2 = new DXRenderOptions.a().a(DXWidgetNode.DXMeasureSpec.a(this.d, 1073741824)).b(DXWidgetNode.DXMeasureSpec.a(this.e, 1073741824));
            CONTEXT context2 = this.c;
            if (!(context2 instanceof l)) {
                context2 = null;
            }
            l lVar = (l) context2;
            DXRenderOptions a3 = b2.a((lVar == null || (h = lVar.h()) == null) ? null : h.b()).a();
            jnl jnlVar = this.g;
            q.a(jnlVar);
            DinamicXEngine a4 = jnlVar.a();
            DXRootView dXRootView = this.b;
            q.a(dXRootView);
            DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
            c cVar = this.f8938a;
            q.a(cVar);
            DXResult<DXRootView> a5 = a4.a(a2, dXRootView, dxTemplateItem, cVar.e, -1, a3);
            if (a5 == null || a5.b() || a5.f11780a == null) {
                d dVar = this.f;
                if (dVar == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("DxRenderError|DxError=");
                sb.append(a5 != null ? a5.a() : null);
                dVar.a(new dkv(90001, sb.toString()), null);
                return;
            }
            this.b = a5.f11780a;
            jnl jnlVar2 = this.g;
            q.a(jnlVar2);
            jnlVar2.a().b(a5.f11780a);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        jnl jnlVar = this.g;
        if (jnlVar == null) {
            return;
        }
        jnlVar.a().a(this.b);
        jnlVar.b();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(String type, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, type, jSONObject});
            return;
        }
        q.d(type, "type");
        super.a(type, jSONObject);
        jnl jnlVar = this.g;
        if (jnlVar == null) {
            return;
        }
        q.a(jnlVar);
        jnlVar.a().l().a(type, jSONObject);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(575034356);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
