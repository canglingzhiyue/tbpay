package tb;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.b;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.d;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.userMotion")
/* loaded from: classes2.dex */
public final class baa implements ate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s f25722a;
    private UserMotionConfig b;
    private JSONObject c;
    private bac d;
    private List<e> e;
    private Map<String, a> f = new HashMap();

    static {
        kge.a(293247127);
        kge.a(1643319480);
    }

    @Override // tb.ate
    public View a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c09f824a", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
        }
        return null;
    }

    @Override // tb.ate
    public void a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2fb4c", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
        }
    }

    @Override // tb.ate
    public boolean a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebad0c8", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.ate
    public void b(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115e7a3", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
            return;
        }
        int a2 = a();
        if (jqm.a()) {
            ard a3 = arc.a();
            a3.a("AURAUserMotionComponentLifeCycleExtension", "onAppear", "componentKey:" + aURARenderComponent.key + ",appearFrom:" + a2);
        }
        if (!TextUtils.isEmpty(aURARenderComponent.key)) {
            a aVar = new a();
            aVar.f25723a = a2;
            this.f.put(aURARenderComponent.key, aVar);
        }
        bad.a(this.f25722a, this.b, aURARenderComponent, this.c, a2);
        a(aURARenderComponent, a2);
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        long j;
        int i2;
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
            return;
        }
        int b = b();
        if (jqm.a()) {
            arc.a().a("AURAUserMotionComponentLifeCycleExtension", "onDisappear", "componentKey:" + aURARenderComponent.key + ",disappearTo:" + b);
        }
        if (TextUtils.isEmpty(aURARenderComponent.key) || (aVar = this.f.get(aURARenderComponent.key)) == null) {
            j = 0;
            i2 = 0;
        } else {
            int i3 = aVar.f25723a;
            j = System.currentTimeMillis() - aVar.b;
            i2 = i3;
        }
        bad.a(this.f25722a, this.b, aURARenderComponent, this.c, i2, b, j);
        b(aURARenderComponent, b);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.b = (UserMotionConfig) aURAGlobalData.get("userMotionConfig", UserMotionConfig.class);
        this.c = (JSONObject) aURAGlobalData.get("userMotionCommonArgs", JSONObject.class);
        this.d = (bac) aURAGlobalData.get("userMotionRecorder", bac.class);
        if (this.d == null) {
            this.d = new bac();
            aURAGlobalData.update("userMotionRecorder", this.d);
        }
        this.e = (List) aURAGlobalData.get("userMotionScrollDistancePeriodCache", List.class);
        if (this.e != null) {
            return;
        }
        this.e = new ArrayList();
        aURAGlobalData.update("userMotionScrollDistancePeriodCache", this.e);
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f25722a = qVar.b();
        }
    }

    private int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        List<e> list = this.e;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        e eVar = this.e.get(this.e.size() - 1);
        if (eVar != null) {
            if (eVar.f2213a > 0) {
                return 5;
            }
            if (eVar.f2213a < 0) {
                return 4;
            }
            if (eVar.b > 0) {
                return 3;
            }
            if (eVar.b < 0) {
                return 2;
            }
        }
        return 1;
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        List<e> list = this.e;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        e eVar = this.e.get(this.e.size() - 1);
        if (eVar != null) {
            if (eVar.f2213a > 0) {
                return 4;
            }
            if (eVar.f2213a < 0) {
                return 5;
            }
            if (eVar.b > 0) {
                return 2;
            }
            if (eVar.b < 0) {
                return 3;
            }
        }
        return 1;
    }

    private void a(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8565c990", new Object[]{this, aURARenderComponent, new Integer(i)});
            return;
        }
        b a2 = b.a(aURARenderComponent, i);
        bac bacVar = this.d;
        if (bacVar == null) {
            return;
        }
        bacVar.a(a2);
    }

    private void b(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b75911", new Object[]{this, aURARenderComponent, new Integer(i)});
            return;
        }
        d a2 = d.a(aURARenderComponent, i);
        bac bacVar = this.d;
        if (bacVar == null) {
            return;
        }
        bacVar.a(a2);
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f25723a;
        public long b;

        static {
            kge.a(-391079401);
        }

        private a() {
            this.f25723a = 0;
            this.b = System.currentTimeMillis();
        }
    }
}
