package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.event.userTrack.args")
/* loaded from: classes4.dex */
public final class dxk implements axy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27063a;

    static {
        kge.a(1957767373);
        kge.a(-29106604);
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

    public dxk() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.ut.AliDetailUserTrackArgsExtension");
    }

    @Override // tb.axy
    public Map<String, String> a(aya ayaVar) {
        c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4924304", new Object[]{this, ayaVar});
        }
        HashMap hashMap = new HashMap();
        Context context = this.f27063a;
        if (!(context instanceof DetailCoreActivity) || (C = ((DetailCoreActivity) context).C()) == null) {
            return hashMap;
        }
        String i = C.i();
        if (!TextUtils.isEmpty(i)) {
            hashMap.put("item_id", i);
        }
        String o = C.o();
        if (!TextUtils.isEmpty(o)) {
            hashMap.put("shop_id", o);
        }
        String h = C.h();
        if (!TextUtils.isEmpty(h)) {
            hashMap.put("seller_id", h);
        }
        String str = null;
        try {
            str = epo.g().e();
        } catch (Exception e) {
            arc.a().c("AliDetailUserTrackArgsExtension", "getUserTrackArgs", e.toString());
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("user_id", str);
        }
        Map<String, String> g = C.g();
        if (g != null) {
            hashMap.putAll(g);
        }
        Map<String, String> f = C.f();
        if (f != null) {
            hashMap.putAll(f);
        }
        if (ayaVar != null && ayaVar.f25682a != null && ayaVar.f25682a.data != null) {
            AURARenderComponent aURARenderComponent = ayaVar.f25682a;
            String str2 = "";
            String str3 = aURARenderComponent.key == null ? str2 : aURARenderComponent.key;
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData.type != null) {
                str2 = aURARenderComponentData.type;
            }
            hashMap.put("componentId", str3 + "_" + str2);
        }
        hashMap.put("native_detail_v", "aura");
        return hashMap;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f27063a = qVar.e();
        }
    }
}
