package com.taobao.android.detail.core.aura.extension.event.openUrl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.aqs;
import tb.axk;
import tb.emu;
import tb.fgl;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.openurl.native.params")
/* loaded from: classes4.dex */
public final class c implements axk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f9394a;

    static {
        kge.a(686874582);
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

    public c() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlNativeParamsExtension");
    }

    @Override // tb.axk
    public List<String> a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("24b62e14", new Object[]{this, aURARenderComponent});
        }
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isEmpty(aURARenderComponent.key)) {
            arrayList.add(aURARenderComponent.key);
        }
        return arrayList;
    }

    @Override // tb.axk
    public com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b a(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b) ipChange.ipc$dispatch("369d9f13", new Object[]{this, aURARenderComponent, aURAEventIO});
        }
        com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b bVar = new com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b();
        HashMap hashMap = new HashMap();
        hashMap.put("currentClickTime", String.valueOf(System.currentTimeMillis()));
        DetailCoreActivity detailCoreActivity = this.f9394a;
        if (detailCoreActivity != null) {
            if (detailCoreActivity.f9411a != null && !StringUtils.isEmpty(this.f9394a.f9411a.f27180a)) {
                hashMap.put("pre_item_id", this.f9394a.f9411a.f27180a);
            }
            if (this.f9394a.C() != null && !StringUtils.isEmpty(this.f9394a.C().i())) {
                String i = this.f9394a.C().i();
                hashMap.put(fgl.TARGETITEMID, i);
                hashMap.put(fgl.ORIGINALITEMID, i);
            }
            if (!StringUtils.isEmpty(this.f9394a.h)) {
                hashMap.put("token", this.f9394a.h);
            }
        }
        bVar.a(hashMap);
        return bVar;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else if (!(qVar.e() instanceof DetailCoreActivity)) {
        } else {
            this.f9394a = (DetailCoreActivity) qVar.e();
        }
    }
}
