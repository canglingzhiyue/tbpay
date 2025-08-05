package com.taobao.android.detail.core.standard.mainpic.weex;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.aqs;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.aspect.lifecycle.windvaneApiPluginRegister.config")
/* loaded from: classes4.dex */
public final class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-29494267);
        kge.a(-1746406104);
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
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

    public b() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryWindvaneApiPluginConfigExtension");
    }

    @Override // com.taobao.android.detail.core.standard.mainpic.weex.a
    public Map<String, Class<? extends AbsPicGalleryWindvaneApiPlugin>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PicGalleryLightOffWindvaneApiPlugin.CLAZZ_NAME, PicGalleryLightOffWindvaneApiPlugin.class);
        return hashMap;
    }
}
