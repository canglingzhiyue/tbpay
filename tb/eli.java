package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.a;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.maingallery.usertrack.frame.move")
/* loaded from: classes4.dex */
public final class eli implements ekl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f27398a;

    static {
        kge.a(-1032262673);
        kge.a(-1823923563);
    }

    @Override // tb.ekl
    public String F_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec7b57c0", new Object[]{this});
        }
        return null;
    }

    @Override // tb.eki
    public void b(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586e2b4", new Object[]{this, ekkVar});
        }
    }

    @Override // tb.eki
    public void c(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c409e935", new Object[]{this, ekkVar});
        }
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

    public eli() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.usertrack.AliSDetailMainGalleryMoveEventExtension");
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f27398a = qVar;
        }
    }

    @Override // tb.eki
    public void a(ekk ekkVar) {
        s b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
            return;
        }
        q qVar = this.f27398a;
        if (qVar == null || (b = qVar.b()) == null) {
            return;
        }
        Event event = new Event();
        event.type = "userTrack";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventId", (Object) "2101");
        jSONObject.put("page", (Object) "Page_Detail");
        jSONObject.put("arg1", (Object) "Page_Detail_Button-MovePic_industry");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("spm", (Object) "a2141.7631564.detailpic");
        if (ekkVar != null && a(ekkVar.f())) {
            jSONObject2.put("type", (Object) "skupic");
            jSONObject2.put("detailVersion", (Object) "detailV3");
        }
        jSONObject.put("args", (Object) jSONObject2);
        event.setFields(jSONObject);
        a.a(b, event, (AURARenderComponent) null, (Map<String, Object>) null);
    }

    private boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null) {
            return String.valueOf(aURARenderComponent.data.fields.get("code")).startsWith("sku_pic");
        }
        return false;
    }
}
