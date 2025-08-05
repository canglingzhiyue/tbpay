package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.taobao.adapter.extension.weex2.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

@AURAExtensionImpl(code = "aura.impl.performance.monitor.weex2.render")
/* loaded from: classes2.dex */
public final class baj implements bak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f25731a;

    static {
        kge.a(-1611448187);
        kge.a(-1015441703);
    }

    @Override // tb.bak
    public a a(AURARenderComponent aURARenderComponent, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ca08bbab", new Object[]{this, aURARenderComponent, viewGroup, new Integer(i)});
        }
        return null;
    }

    @Override // tb.bak
    public void a(bag bagVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d948037", new Object[]{this, bagVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.bak
    public void a(bag bagVar, ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965e3663", new Object[]{this, bagVar, viewGroup, view});
        }
    }

    @Override // tb.bak
    public boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        return false;
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

    @Override // tb.bak
    public void a(bag bagVar, AURARenderComponent aURARenderComponent, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54023f99", new Object[]{this, bagVar, aURARenderComponent, viewGroup, new Integer(i)});
            return;
        }
        for (azl azlVar : this.f25731a.b(azl.class)) {
            azlVar.a("aura_weex2_render", "Weex2渲染耗时", asw.RENDER_SERVICE_CODE);
        }
    }

    @Override // tb.bak
    public void a(bag bagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15695d0", new Object[]{this, bagVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("componentKey", bagVar.c() == null ? "" : bagVar.c());
        a k = bagVar.k();
        if (k != null) {
            hashMap.put("loadUrl", k.a());
        }
        for (azl azlVar : this.f25731a.b(azl.class)) {
            azlVar.a("aura_weex2_render", asw.RENDER_SERVICE_CODE, false, hashMap);
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f25731a = fVar;
        }
    }
}
