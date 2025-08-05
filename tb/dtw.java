package tb;

import android.content.Intent;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

@AURAExtensionImpl(code = "alibuy.impl.event.openurl.native.params.changeAddress")
/* loaded from: classes4.dex */
public final class dtw implements axk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f26977a;

    static {
        kge.a(-727816982);
        kge.a(671382548);
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

    public static /* synthetic */ void a(dtw dtwVar, Intent intent, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ae9119", new Object[]{dtwVar, intent, aURARenderComponent, aURAEventIO});
        } else {
            dtwVar.a(intent, aURARenderComponent, aURAEventIO);
        }
    }

    public static /* synthetic */ void a(dtw dtwVar, UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9734844", new Object[]{dtwVar, uMFLinkageTrigger});
        } else {
            dtwVar.a(uMFLinkageTrigger);
        }
    }

    @Override // tb.axk
    public List<String> a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("24b62e14", new Object[]{this, aURARenderComponent}) : Arrays.asList("address", "townRemind", "newHelpBuyAddressTips", "newHelpBuyAddress", "multiAddressSelectPageItemInfo", "overseaNewDeliveryIdentifyV2");
    }

    @Override // tb.axk
    public b a(final AURARenderComponent aURARenderComponent, final AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("369d9f13", new Object[]{this, aURARenderComponent, aURAEventIO});
        }
        b bVar = new b();
        bVar.a(new b.a() { // from class: tb.dtw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b.a
            public void b(String str, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c1e70430", new Object[]{this, str, intent});
                }
            }

            @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b.a
            public void a(String str, Intent intent) {
                IpChange ipChange2 = $ipChange;
                char c = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
                } else if (intent == null) {
                    arc.a().b("AliBuyOpenUrlNativeParamsChangeAddressExtension", "getCustomParams", "openUrl 返回数据为null");
                } else if (aURARenderComponent == null || aURAEventIO == null) {
                    arc.a().b("AliBuyOpenUrlNativeParamsChangeAddressExtension", "getCustomParams", "renderComponent 或者 eventIO 返回数据为null");
                } else {
                    if (str.hashCode() != -1999289321 || !str.equals("NATIVE")) {
                        c = 65535;
                    }
                    if (c != 0) {
                        return;
                    }
                    arc.a().b("AliBuyOpenUrlNativeParamsChangeAddressExtension", "getCustomParams", "从native页面跳回");
                    dtw.a(dtw.this, intent, aURARenderComponent, aURAEventIO);
                }
            }
        });
        return bVar;
    }

    private void a(AURARenderComponent aURARenderComponent, final AURAEventIO aURAEventIO, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660a3c11", new Object[]{this, aURARenderComponent, aURAEventIO, jSONObject});
        } else {
            this.f26977a.b().a("aura.workflow.adjustRules", duw.a(aURARenderComponent, aURAEventIO, jSONObject), new aqq() { // from class: tb.dtw.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqq, tb.aqs
                public void a(com.alibaba.android.aura.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    }
                }

                @Override // tb.aqq
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    } else {
                        dtw.a(dtw.this, aym.a(aURAEventIO));
                    }
                }
            });
        }
    }

    private void a(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115c7adb", new Object[]{this, uMFLinkageTrigger});
        } else {
            this.f26977a.b().a("aura.workflow.adjust", uMFLinkageTrigger, null);
        }
    }

    private void a(Intent intent, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51dc3e2", new Object[]{this, intent, aURARenderComponent, aURAEventIO});
            return;
        }
        JSONObject a2 = duw.a(intent);
        if (a2 == null) {
            arc.a().b("AliBuyOpenUrlNativeParamsChangeAddressExtension", "handleNativeResult", "从Native返回的数据为null");
        } else {
            a(a2, aURARenderComponent, aURAEventIO);
        }
    }

    private void a(JSONObject jSONObject, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40eef9f", new Object[]{this, jSONObject, aURARenderComponent, aURAEventIO});
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            arc.a().b("AliBuyOpenUrlNativeParamsChangeAddressExtension", "handleNativeResult", "从Native返回的eventFields数据为null");
            return;
        }
        JSONObject jSONObject2 = c.getJSONObject("params");
        if (jSONObject2 == null) {
            arc.a().b("AliBuyOpenUrlNativeParamsChangeAddressExtension", "handleNativeResult", "从Native返回的params数据为null");
            c.put("params", (Object) jSONObject);
        } else {
            jSONObject2.putAll(jSONObject);
        }
        a(aURARenderComponent, aURAEventIO, jSONObject);
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f26977a = qVar;
        }
    }
}
