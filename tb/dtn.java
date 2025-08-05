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
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.widget.ak;
import tb.dsu;
import tb.dtc;

@AURAExtensionImpl(code = "alibuy.impl.lifecycle.dxEngine.config")
/* loaded from: classes4.dex */
public final class dtn implements avp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int KEY_MODULE_CODE = 88;

    /* renamed from: a  reason: collision with root package name */
    private q f26968a;
    private dsu b;
    private dtc.a c;

    static {
        kge.a(-1970155952);
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
            this.f26968a = qVar;
        }
    }

    private dtc.a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtc.a) ipChange.ipc$dispatch("212f63cc", new Object[]{this});
        }
        if (this.b == null) {
            this.b = (dsu) this.f26968a.a("aliBuyDXConfig", dsu.class);
            dsu dsuVar = this.b;
            if (dsuVar != null) {
                this.c = dsuVar.a();
            }
        }
        return this.c;
    }

    @Override // tb.avp
    public DXEngineConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3edbcd12", new Object[]{this});
        }
        String d = this.f26968a.d();
        DXEngineConfig.a d2 = new DXEngineConfig.a(d).b(2).a(d).d(88);
        if (b()) {
            d2.a(true, true);
        }
        return d2.a();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : ((Boolean) bbc.a(this.f26968a.a(), "autoSize", Boolean.class, false)).booleanValue();
    }

    @Override // tb.avp
    public void a(final bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{this, bdVar});
            return;
        }
        jdf.b(bdVar);
        jdf.c(bdVar);
        jdf.a(bdVar);
        c(bdVar);
        bdVar.d().a(new dsz());
        Context e = this.f26968a.e();
        if (e instanceof Activity) {
            bdVar.d().a((Activity) this.f26968a.e());
        } else if (baw.a()) {
            Toast.makeText(e, "AURAInstance 需要传入Activity", 1).show();
        }
        dsu dsuVar = this.b;
        if (dsuVar == null) {
            return;
        }
        dsuVar.a(new dsu.a() { // from class: tb.dtn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dsu.a
            public boolean a(long j, fut futVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("926eae2b", new Object[]{this, new Long(j), futVar})).booleanValue() : bdVar.a(j, futVar);
            }

            @Override // tb.dsu.a
            public boolean a(long j, ak akVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("18a2b987", new Object[]{this, new Long(j), akVar})).booleanValue() : bdVar.a(j, akVar);
            }
        });
    }

    private void c(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb5daa4", new Object[]{this, bdVar});
            return;
        }
        dtc dtcVar = new dtc(this.f26968a.e());
        dtcVar.a(c());
        bdVar.a(dtb.PARSER_ID, new dtb(dtcVar));
    }
}
