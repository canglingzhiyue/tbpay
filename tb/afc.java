package tb;

import android.content.Context;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.parse.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.b;
import java.util.ArrayList;
import java.util.List;

@AURAExtensionImpl(code = "lightbuy.impl.nextrpc.attachedData.weex")
/* loaded from: classes5.dex */
public final class afc implements ash {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f25302a;
    private afa b;

    static {
        kge.a(1358849519);
        kge.a(-173619745);
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

    public static /* synthetic */ afa a(afc afcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (afa) ipChange.ipc$dispatch("ffe4a2b0", new Object[]{afcVar}) : afcVar.a();
    }

    public static /* synthetic */ q b(afc afcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("bbc234e4", new Object[]{afcVar}) : afcVar.f25302a;
    }

    @Override // tb.ash
    public boolean a(AURAParseIO aURAParseIO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a88da6", new Object[]{this, aURAParseIO, str})).booleanValue();
        }
        Context e = this.f25302a.e();
        if (!(e instanceof b) || !"weex".equals(((b) e).getRenderContainer())) {
            return false;
        }
        a(aURAParseIO);
        return true;
    }

    private void a(final AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb929d8", new Object[]{this, aURAParseIO});
        } else {
            bbh.a(new Runnable() { // from class: tb.afc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    List<a> data = aURAParseIO.getData();
                    ArrayList arrayList = new ArrayList();
                    for (a aVar : data) {
                        JSONObject a2 = aVar.a();
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    afa a3 = afc.a(afc.this);
                    if (a3 == null) {
                        arc.a().b("LightBuyDataSourceManager is null !!");
                    } else {
                        a3.a(afc.b(afc.this).e(), null, arrayList);
                    }
                }
            });
        }
    }

    private afa a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afa) ipChange.ipc$dispatch("f0247c2", new Object[]{this});
        }
        afa afaVar = this.b;
        if (afaVar != null) {
            return afaVar;
        }
        com.taobao.android.lightbuy.a aVar = (com.taobao.android.lightbuy.a) this.f25302a.a(com.taobao.android.lightbuy.a.KEY_LIGHT_BUY, com.taobao.android.lightbuy.a.class);
        if (aVar == null) {
            return null;
        }
        this.b = aVar.b();
        return this.b;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f25302a = qVar;
        }
    }
}
