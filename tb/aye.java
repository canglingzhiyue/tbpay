package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.s;
import java.util.Iterator;
import java.util.Map;
import tb.ayc;

@AURAExtensionImpl(code = aye.CODE)
/* loaded from: classes2.dex */
public final class aye extends ata {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.impl.render.creator.freeNode";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, atc> f25686a;
    private bd b;

    static {
        kge.a(-1567935675);
    }

    public static /* synthetic */ Object ipc$super(aye ayeVar, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ q a(aye ayeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("aa0a9214", new Object[]{ayeVar}) : ayeVar.a();
    }

    @Override // tb.ata, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    private void a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed894fe", new Object[]{this, aURAGlobalData});
            return;
        }
        this.b = (bd) aURAGlobalData.get("auraRenderDxEngine", bd.class);
        if (this.b != null) {
            return;
        }
        this.b = new bd(new DXEngineConfig(a().d()));
        this.b.a(38447420286L, new axe());
        this.b.a(7023701163946200378L, new axd());
        aURAGlobalData.update("auraRenderDxEngine", this.b);
    }

    private ayc d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayc) ipChange.ipc$dispatch("26177f70", new Object[]{this});
        }
        a(c());
        if (this.b == null) {
            return null;
        }
        return new ayc(a().e(), this.b.d());
    }

    @Override // tb.ata
    public void a(Map<String, atc> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.f25686a = map;
        e();
    }

    private void e() {
        ayf ayfVar;
        String d;
        AURARenderComponent a2;
        atc atcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Iterator it = b().b(ayf.class).iterator();
        while (it.hasNext() && (d = (ayfVar = (ayf) it.next()).d()) != null && (a2 = a(d)) != null && (atcVar = this.f25686a.get(a2.getContainerType())) != null) {
            a(a2, ayfVar, atcVar);
        }
    }

    private void a(final AURARenderComponent aURARenderComponent, final ayf ayfVar, final atc atcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca79a35", new Object[]{this, aURARenderComponent, ayfVar, atcVar});
        } else if (a.b.f2133a.equals(aURARenderComponent.getContainerType())) {
            final ayc d = d();
            if (d == null) {
                return;
            }
            d.a(new ayc.a() { // from class: tb.aye.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ayc.a
                public void a(DXRootView dXRootView) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
                    } else if (aURARenderComponent.data == null || aURARenderComponent.data.container == null) {
                    } else {
                        FrameLayout frameLayout = new FrameLayout(aye.a(aye.this).e());
                        atcVar.a(aURARenderComponent, dXRootView, 0);
                        frameLayout.addView(dXRootView);
                        ayfVar.a(frameLayout);
                        d.a();
                    }
                }

                @Override // tb.ayc.a
                public void a(String str, s sVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c703f88f", new Object[]{this, str, sVar});
                    } else {
                        d.a();
                    }
                }
            }, asx.a(aURARenderComponent));
        } else {
            AURARenderComponentContainer a2 = a(aURARenderComponent);
            if (a2 == null) {
                return;
            }
            FrameLayout frameLayout = new FrameLayout(a().e());
            View a3 = atcVar.a(frameLayout, a2);
            atcVar.a(aURARenderComponent, a3, 0);
            frameLayout.addView(a3);
            ayfVar.a(frameLayout);
        }
    }

    private AURARenderComponentContainer a(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("44fc6b97", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null) {
            return aURARenderComponentData.container;
        }
        return null;
    }

    private AURARenderComponent a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("cb48fc1d", new Object[]{this, str});
        }
        Map map = (Map) c().get("aura_global_data_free_node", Map.class);
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            RenderComponent renderComponent = (RenderComponent) entry.getValue();
            if (str.equals(entry.getKey())) {
                AURARenderComponent aURARenderComponent = new AURARenderComponent();
                aURARenderComponent.key = renderComponent.getKey();
                aURARenderComponent.data = bst.a(renderComponent);
                return aURARenderComponent;
            }
        }
        return null;
    }
}
