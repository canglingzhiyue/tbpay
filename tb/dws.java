package tb;

import android.app.Activity;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.widget.b;
import com.taobao.android.detail.core.aura.widget.c;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bd;
import com.taobao.tao.export.flickbtn.a;
import com.taobao.taolive.dinamicext.dinamicx.m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ady;
import tb.axa;
import tb.ebc;
import tb.ebd;
import tb.ebe;
import tb.ebf;
import tb.ebg;
import tb.ebh;
import tb.ebi;
import tb.ebj;
import tb.ebk;
import tb.ebl;
import tb.hng;
import tb.jwe;

@AURAExtensionImpl(code = "alidetail.impl.lifecycle.dxEngine.config")
/* loaded from: classes4.dex */
public final class dws implements avp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f27044a = new ConcurrentHashMap();
    private q b;

    static {
        kge.a(-1468215128);
        kge.a(-1918346948);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    public dws() {
        emu.a("com.taobao.android.detail.core.aura.extension.dx.AliDetailLifecycleDxEngineConfigExtension");
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.b = qVar;
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Map<String, Integer> map = this.f27044a;
        if (map == null) {
            return;
        }
        map.clear();
    }

    @Override // tb.avp
    public DXEngineConfig a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEngineConfig) ipChange.ipc$dispatch("3edbcd12", new Object[]{this}) : new DXEngineConfig.a(ezh.DINAMIC_BIZ_NAME).b(!ecu.s).a(ecu.t).d(15).a("detail").a(new com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.recycler.a()).a(true, true).a();
    }

    @Override // tb.avp
    public void a(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{this, bdVar});
            return;
        }
        b(bdVar);
        c(bdVar);
        d(bdVar);
        if (this.b == null || !s.a() || !(this.b.e() instanceof Activity) || !eip.E) {
            return;
        }
        bdVar.d().a((Activity) this.b.e());
        bdVar.b().a(iuy.c);
    }

    private void b(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290e0723", new Object[]{this, bdVar});
            return;
        }
        bdVar.a(hng.DETAIL_WIDGET_ID, new hng.a());
        bdVar.a(ebi.f27168a, new ebi.a());
        bdVar.a(ebk.f27171a, new ebk.a());
        bdVar.a(ebe.f27161a, new ebe.a());
        bdVar.a(ebh.f27165a, new ebh.a());
        bdVar.a(ebg.f27163a, new ebg.a());
        bdVar.a(ebd.f27160a, new ebd.a());
        bdVar.a(ebl.f27173a, new ebl.a());
        bdVar.a(m.DXTBLIVEVIEW_TBLIVEVIEW, new m.a());
        bdVar.a(com.taobao.tao.export.flickbtn.a.DXFLICKINGSHAREBUTTON_FLICKINGSHAREBUTTON, new a.C0828a());
        bdVar.a(axa.DXAURAVIDEOVIEW_AURAVIDEOVIEW, new axa.a());
        bdVar.a(ebj.DXXSHADOWTEXTVIEW_XSHADOWTEXTVIEW, new ebj.a());
        bdVar.a(ebf.DXXQINTERACTAVATARANIMATIONVIEW_XQINTERACTAVATARANIMATIONVIEW, new ebf.a());
        bdVar.a(c.DX_WIDGET_ID, new c.b());
        bdVar.a(ebc.VIEW_IDENTITY, new ebc.a());
        bdVar.a(ady.VIEW_IDENTITY, new ady.a());
    }

    private void c(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb5daa4", new Object[]{this, bdVar});
            return;
        }
        bdVar.a(1544903441687469454L, new com.taobao.android.detail.core.aura.widget.a());
        bdVar.a(eba.EVENT_IDENTIFY.longValue(), new eba());
        bdVar.a(ebb.EVENT_IDENTIFY.longValue(), new ebb());
        bdVar.a(b.DX_EVENT_HASH, new b());
        bdVar.a(axb.DX_EVENT_HANDLEAURAVIDEOLIFECYCLE, new axb());
        bdVar.a(dxq.DX_EVENT_HANDLEDETAILBRANDPROMOTIONVIDEOSHOW, new dxq());
        bdVar.a(dxf.DX_EVENT_DETAILSKUSCROLLED, new dxf(this.f27044a));
        bdVar.a(dxe.DX_PARSER_DETAILSKUGETSCROLLED, new dxe(this.f27044a));
        bdVar.a(dxh.DX_PARSER_CANSHOWINSINGLELINE, new dxh());
        bdVar.a(iux.DX_PARSER_BYTELENGTH, new iux());
        bdVar.a(ffy.DX_PARSER_DETAILGETIMAGERADIO, new ffy());
        bdVar.a(-8964819166049023094L, new kqv());
        bdVar.d().a(jwe.TOPICSUBSCRIBE, new jwe.a());
        bdVar.a(gxg.DX_PARSER_ID, new gxg());
    }

    private void d(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505dae25", new Object[]{this, bdVar});
        } else {
            bdVar.a(kpa.DX_PARSER_SCREENINFO, new a());
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends kpa {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(722867975);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -858210922) {
                return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.kpa, tb.fuf, tb.fut
        public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
            }
            if (objArr != null && objArr.length > 0 && dXRuntimeContext != null && "detailContentWidth".equals(objArr[0])) {
                if (gbg.a(dXRuntimeContext.D(), dXRuntimeContext.m(), 375.0f) > iuy.c) {
                    i = gbg.a(dXRuntimeContext.D(), dXRuntimeContext.m(), 16.0f);
                }
                return Integer.valueOf(gbg.b(dXRuntimeContext.D(), dXRuntimeContext.m(), iuy.c + i));
            }
            return super.evalWithArgs(objArr, dXRuntimeContext);
        }
    }
}
