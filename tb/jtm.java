package tb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.extension.ability.validate.c;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.purchase.theme.a;
import tb.bmq;
import tb.dtg;

@AURAExtensionImpl(code = "tbwaitpay.impl.lifecycle.dxEngine.config")
/* loaded from: classes6.dex */
public final class jtm implements avp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f29758a;

    static {
        kge.a(-1425178021);
        kge.a(-1918346948);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f29758a = qVar;
        }
    }

    @Override // tb.avp
    public DXEngineConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3edbcd12", new Object[]{this});
        }
        String d = this.f29758a.d();
        DXEngineConfig.a d2 = new DXEngineConfig.a(a(d)).b(2).a(d).d(188);
        if (b()) {
            d2.a(true, true);
        }
        return d2.a();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : ((Boolean) bbc.a(this.f29758a.a(), "autoSize", Boolean.class, false)).booleanValue();
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : "tbwaitpay".equalsIgnoreCase(str) ? "purchase" : "tbwaitpayfloat".equalsIgnoreCase(str) ? "confirmOrder" : str;
    }

    @Override // tb.avp
    public void a(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{this, bdVar});
            return;
        }
        c(bdVar);
        d(bdVar);
        e(bdVar);
        b(bdVar);
        bdVar.d().a(new dsz());
        Context e = this.f29758a.e();
        if (e instanceof Activity) {
            bdVar.d().a((Activity) this.f29758a.e());
        } else if (!baw.a()) {
        } else {
            Toast.makeText(e, "AURAInstance 需要传入Activity", 1).show();
        }
    }

    private void b(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290e0723", new Object[]{this, bdVar});
            return;
        }
        bdVar.d().l().a("-8184561642900287420", c.class, "validatesData");
        bdVar.d().l().a("3653929102547346655", dti.class, "sequenceData");
    }

    private void c(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb5daa4", new Object[]{this, bdVar});
            return;
        }
        dtc dtcVar = new dtc(this.f29758a.e());
        dtcVar.a(new a());
        bdVar.a(dtb.PARSER_ID, new dtb(dtcVar));
        bdVar.a(icv.DX_PARSER_ID, new icv());
        bdVar.a(-489609274268614298L, new dsy());
    }

    private void d(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505dae25", new Object[]{this, bdVar});
            return;
        }
        bdVar.a(dtg.DX_WIDGET_ID, new dtg.a());
        bdVar.a(bmq.DX_WIDGET_ID, new bmq.a());
        bdVar.a(icw.ID, new icw());
    }

    private void e(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640581a6", new Object[]{this, bdVar});
        } else {
            bdVar.a(1544903441687469454L, new axe());
        }
    }
}
