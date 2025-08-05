package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.taobao.adapter.extension.weex2.model.a;
import com.alibaba.android.umf.constants.UMFConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.taobao.R;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.render.component.creator.weex2")
/* loaded from: classes2.dex */
public final class bai extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private baf d;
    private aqs e;
    private AURAGlobalData f;
    private bal g = new bal();

    static {
        kge.a(-841562916);
    }

    public static /* synthetic */ Object ipc$super(bai baiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "weex2";
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.e = aqsVar;
        this.f = aURAGlobalData;
        this.g.f25732a = b();
        this.g.b = aqsVar;
        c();
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (!(view instanceof FrameLayout)) {
            this.e.a(new b(1, "DomainTaobaoAdapter", UMFConstants.ErrorCode.WORKFLOW_CONTAIN_NO_EXECUTOR, "view type is not FrameLayout"));
        } else {
            List<bak> b = b().b(bak.class);
            FrameLayout frameLayout = (FrameLayout) view;
            if (a(aURARenderComponent, frameLayout, b)) {
                a("downgrade", "weex2#containerViewError", aURARenderComponent.key);
                return;
            }
            a aVar = null;
            Iterator<bak> it = b.iterator();
            while (it.hasNext() && (aVar = it.next().a(aURARenderComponent, frameLayout, i)) == null) {
            }
            if (aVar.d() != null && aVar.d().size() > 0) {
                a(aURARenderComponent.key, aVar.d());
            }
            if (aVar.e() != null && aVar.e().size() > 0) {
                b(aURARenderComponent.key, aVar.e());
            }
            bag a2 = a(frameLayout, aVar);
            if (a2.e() != 0) {
                return;
            }
            try {
                a2.a(aURARenderComponent);
                if (aVar == null || TextUtils.isEmpty(aVar.a())) {
                    aVar = b(aURARenderComponent);
                }
                if (aVar != null && !TextUtils.isEmpty(aVar.a())) {
                    for (bak bakVar : b) {
                        bakVar.a(a2, aURARenderComponent, frameLayout, i);
                    }
                    a2.a(aVar);
                    return;
                }
                a("AURAWeexComponentRenderModel生成失败", "weex2#containerViewError", aURARenderComponent.key);
                a2.i();
                if (this.d == null) {
                    return;
                }
                this.d.b(a2);
            } catch (Exception e) {
                a(e.getMessage(), "weex2#containerViewError", aURARenderComponent.key);
            }
        }
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
        if (aURARenderComponentContainer == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return aURARenderComponent.key + aURARenderComponentContainer.name + aURARenderComponentContainer.version;
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c();
        baf bafVar = this.d;
        if (bafVar == null) {
            return;
        }
        List<bag> b = bafVar.b();
        if (b.isEmpty()) {
            return;
        }
        for (bag bagVar : b) {
            if (bagVar != null) {
                bagVar.i();
            }
        }
        this.d.a();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d = (baf) this.f.get("auraWeex2InstanceManager", baf.class);
        if (this.d != null) {
            return;
        }
        this.d = new baf();
        this.f.update("auraWeex2InstanceManager", this.d);
    }

    private void a(bag bagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15695d0", new Object[]{this, bagVar});
            return;
        }
        baf bafVar = this.d;
        if (bafVar == null) {
            return;
        }
        bafVar.a(bagVar);
    }

    private bag a(FrameLayout frameLayout, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bag) ipChange.ipc$dispatch("c78f2a5f", new Object[]{this, frameLayout, aVar});
        }
        Object tag = frameLayout.getTag(R.id.aura_render_component_weex2_instance);
        if (tag instanceof bag) {
            return (bag) tag;
        }
        bag bagVar = new bag(frameLayout, this.g, this.c, this.f, this.e, aVar);
        frameLayout.setTag(R.id.aura_render_component_weex2_instance, bagVar);
        a(bagVar);
        Iterator it = b().b(bak.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
        return bagVar;
    }

    private boolean a(AURARenderComponent aURARenderComponent, FrameLayout frameLayout, List<bak> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a268bdcb", new Object[]{this, aURARenderComponent, frameLayout, list})).booleanValue();
        }
        try {
            for (bak bakVar : list) {
                if (bakVar.a(aURARenderComponent)) {
                    Object tag = frameLayout.getTag(R.id.aura_render_component_weex2_instance);
                    if (tag instanceof bag) {
                        frameLayout.setTag(R.id.aura_render_component_weex2_instance, null);
                        frameLayout.removeAllViews();
                        ((bag) tag).i();
                        if (this.d != null) {
                            this.d.b((bag) tag);
                        }
                    }
                    return true;
                }
            }
        } catch (Exception e) {
            a("checkDowngrade|" + e.getMessage(), "weex2#containerViewError", aURARenderComponent.key);
        }
        return false;
    }

    private a b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("28c245ac", new Object[]{this, aURARenderComponent});
        }
        JSONObject jSONObject = null;
        if (aURARenderComponent.data == null || aURARenderComponent.data.fields == null) {
            return null;
        }
        String str = (String) aURARenderComponent.data.fields.get("url");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = aURARenderComponent.data.fields.get("params");
        if (obj instanceof JSONObject) {
            Object obj2 = ((JSONObject) obj).get("bridgeData");
            if (obj2 instanceof JSONObject) {
                jSONObject = (JSONObject) obj2;
            }
        }
        a aVar = new a(str);
        aVar.a(jSONObject);
        return aVar;
    }

    private void a(String str, Map<String, Class<? extends MUSModule>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry<String, Class<? extends MUSModule>> entry : map.entrySet()) {
                MUSEngine.registerModule(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            a(e.getMessage(), "weex2#containerViewError", str);
        }
    }

    private void b(String str, Map<String, Class<? extends WeexPlatformView>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry<String, Class<? extends WeexPlatformView>> entry : map.entrySet()) {
                MUSEngine.registerPlatformView(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            a(e.getMessage(), "weex2#containerViewError", str);
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.e == null) {
            arc.a().c("AURAWeex2ComponentExtension", "reportError", str);
        } else {
            b bVar = new b(1, "Weex2", str2, str);
            if (!TextUtils.isEmpty(str3)) {
                HashMap hashMap = new HashMap();
                hashMap.put("AuraComponentKey", str3);
                bVar.a(hashMap);
            }
            this.e.a(bVar);
        }
    }
}
