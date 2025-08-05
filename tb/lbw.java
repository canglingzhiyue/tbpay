package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.arc;

@AURAExtensionImpl(code = "alibuy.impl.nextrpc.protocol.cache")
/* loaded from: classes4.dex */
public final class lbw extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f30463a;

    static {
        kge.a(1438136425);
    }

    public static /* synthetic */ Object ipc$super(lbw lbwVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ q a(lbw lbwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("4e57fda8", new Object[]{lbwVar}) : lbwVar.c();
    }

    public static /* synthetic */ Map b(lbw lbwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5c12302d", new Object[]{lbwVar}) : lbwVar.f30463a;
    }

    @Override // tb.asf, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    @Override // tb.asf, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        }
    }

    @Override // tb.asf, tb.asg
    public void b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d40e4c", new Object[]{this, aURANextRPCEndpoint});
        } else {
            this.f30463a = aURANextRPCEndpoint.getDataParams();
        }
    }

    @Override // tb.asf, tb.asg
    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6572dace", new Object[]{this, aVar});
        } else if (g()) {
        } else {
            bbh.b(new Runnable() { // from class: tb.lbw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bbh.a(new Runnable() { // from class: tb.lbw.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                arc.a().a("开始缓存奥创协议", arc.a.a().a("AURA/performance").b());
                                JSONObject jSONObject = aVar.f().getJSONObject("data");
                                if (jSONObject == null) {
                                    return;
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("data", (Object) jSONObject.getJSONObject("data"));
                                jSONObject2.put("container", (Object) jSONObject.getJSONObject("container"));
                                lbx.a(lbw.a(lbw.this).d(), JSONObject.toJSONString(lbw.b(lbw.this)), jSONObject2.toJSONString());
                            }
                        });
                    }
                }
            });
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : !"1".equals(c().a("itemCount", String.class));
    }
}
