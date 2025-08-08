package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class asv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final atv b;
    private AURAGlobalData c;
    private f e;

    /* renamed from: a  reason: collision with root package name */
    private final String f25577a = "AURARenderContainerEngine";
    private final ast d = new ast();

    static {
        kge.a(1949167094);
    }

    public static /* synthetic */ void a(asv asvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a635d4", new Object[]{asvVar});
        } else {
            asvVar.d();
        }
    }

    public asv(atv atvVar) {
        this.b = atvVar;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c68e2fc", new Object[]{this, fVar});
            return;
        }
        this.e = fVar;
        this.d.a(fVar);
        this.b.a(fVar);
    }

    public void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa409efd", new Object[]{this, fVar});
            return;
        }
        HashMap hashMap = new HashMap();
        List<atc> b = fVar.b(atc.class);
        if (b.isEmpty()) {
            return;
        }
        for (atc atcVar : b) {
            String a2 = atcVar.a();
            if (StringUtils.isEmpty(a2)) {
                ard a3 = arc.a();
                a3.c("AURARenderContainerEngine", "", "componentType of " + atcVar + " is empty!!!");
            } else {
                hashMap.put(a2, atcVar);
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        for (ata ataVar : fVar.b(ata.class)) {
            ataVar.a(hashMap);
        }
    }

    public void a(AURARenderComponent aURARenderComponent, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4a355e", new Object[]{this, aURARenderComponent, aURAFlowData, aURAGlobalData});
            return;
        }
        ard a2 = arc.a();
        a2.a("AURARenderContainerEngine", "渲染引擎", "根节点组件key：" + aURARenderComponent.key);
        this.c = aURAGlobalData;
        this.d.a(aURARenderComponent, aURAGlobalData);
        this.b.a(aURARenderComponent);
        aURAGlobalData.update("render_view_item_models", this.b.b());
        aURAFlowData.update("AURARenderViewLayoutHelpers", this.b.a());
    }

    public void a(aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e088a9b5", new Object[]{this, aqsVar});
        } else {
            this.d.a(aqsVar);
        }
    }

    public List<AURARenderComponent> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b.b();
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context}) : this.d.a(context, (RecyclerView) this.c.get("render_view", RecyclerView.class));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.a();
        bbh.a(new Runnable() { // from class: tb.asv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    asv.a(asv.this);
                }
            }
        }, 0L);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        List<AURARenderComponent> b = this.b.b();
        List<c> a2 = this.b.a();
        this.d.a(b, a2);
        a(b);
        a(b, a2);
    }

    private void a(List<AURARenderComponent> list, List<c> list2) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
        } else if (baw.a()) {
            StringBuilder sb = new StringBuilder();
            for (c cVar : list2) {
                int f = cVar.f();
                sb.append("\n");
                sb.append("布局类型：");
                sb.append(cVar.getClass().getSimpleName());
                sb.append("|布局数量:");
                sb.append(f);
                sb.append("|包含组件：(");
                int i3 = i2;
                while (true) {
                    i = i2 + f;
                    if (i3 < i && list.size() > i3) {
                        sb.append(list.get(i3).key);
                        sb.append(",");
                        i3++;
                    }
                }
                sb.append(riy.BRACKET_END_STR);
                i2 = i;
            }
            ard a2 = arc.a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("布局信息：[");
            sb.append(riy.ARRAY_END_STR);
            sb2.append(sb.toString());
            a2.a("AURARenderContainerEngine", "渲染引擎", sb2.toString());
        }
    }

    private void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (baw.a()) {
            ard a2 = arc.a();
            a2.a("AURARenderContainerEngine", "渲染引擎", "组件数量：" + list.size());
            StringBuilder sb = new StringBuilder();
            for (AURARenderComponent aURARenderComponent : list) {
                sb.append("\n");
                sb.append("组件key：");
                sb.append(aURARenderComponent.key);
            }
            ard a3 = arc.a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("组件列表：[");
            sb.append(riy.ARRAY_END_STR);
            sb2.append(sb.toString());
            a3.a("AURARenderContainerEngine", "渲染引擎", sb2.toString());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d.b();
        this.b.c();
    }
}
