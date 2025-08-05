package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.annotation.AURAInputField;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.overpull.AURAOverPullContainerLayout;
import com.taobao.android.detail.core.standard.widget.overpull.b;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.mainGallery.loadMore.handler")
/* loaded from: classes4.dex */
public final class ekf implements ath {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27359a = "AliSDetailMainGalleryLoadMoreExtension";
    private final String b = "overPullContainerLayout";
    @AURAInputField(message = "请在头图的AURAInstance执行前注册AliSDetailMainGalleryLoadMoreExtension_InputField_overPullContainerLayout", name = "overPullContainerLayout")
    private AURAOverPullContainerLayout c;
    private AURARenderComponent d;

    static {
        kge.a(1184054746);
        kge.a(-450410939);
    }

    @Override // tb.ath
    public void a(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b016bcab", new Object[]{this, view, state});
        }
    }

    @Override // tb.ath
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.ath
    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // tb.ath
    public void b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.atf
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a859cf93", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.atf
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
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

    public static /* synthetic */ void a(ekf ekfVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1302adbf", new Object[]{ekfVar, sVar});
        } else {
            ekfVar.a(sVar);
        }
    }

    public ekf() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.loadmore.AliSDetailMainGalleryLoadMoreExtension");
    }

    @Override // tb.arl
    public void onCreate(final q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.c = (AURAOverPullContainerLayout) fVar.a(this, "overPullContainerLayout", AURAOverPullContainerLayout.class);
        AURAOverPullContainerLayout aURAOverPullContainerLayout = this.c;
        if (aURAOverPullContainerLayout == null) {
            return;
        }
        aURAOverPullContainerLayout.setCallback(new b() { // from class: tb.ekf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.widget.overpull.b
            public boolean b(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8f6b89af", new Object[]{this, view, new Boolean(z)})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.android.detail.core.standard.widget.overpull.b
            public boolean a(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b3b3cae", new Object[]{this, view, new Boolean(z)})).booleanValue();
                }
                if (!z) {
                    ekf.a(ekf.this, qVar.b());
                }
                return false;
            }

            @Override // com.taobao.android.detail.core.standard.widget.overpull.b
            public boolean a(RecyclerView recyclerView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("4660659a", new Object[]{this, recyclerView})).booleanValue();
                }
                int a2 = emj.a(recyclerView, false);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                return (adapter instanceof atq) && a2 + 1 == adapter.getItemCount() - emi.b(a2, ((atq) adapter).a());
            }
        });
    }

    @Override // tb.ath
    public void a(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
        } else {
            this.d = aURAInputData.getData().getRenderTree();
        }
    }

    private void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6ecbcf", new Object[]{this, sVar});
            return;
        }
        AURARenderComponent aURARenderComponent = this.d;
        if (aURARenderComponent == null) {
            arc.a().c("AliSDetailMainGalleryLoadMoreExtension", "dispatchLoadMoreEvent", "mRootRenderComponent is null");
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            arc.a().c("AliSDetailMainGalleryLoadMoreExtension", "dispatchLoadMoreEvent", "componentData is null");
            return;
        }
        Map<String, List<Event>> map = aURARenderComponentData.events;
        if (bau.a(map)) {
            arc.a().c("AliSDetailMainGalleryLoadMoreExtension", "dispatchLoadMoreEvent", "events is empty");
            return;
        }
        List<Event> list = map.get("dragEvent");
        if (list == null) {
            return;
        }
        for (Event event : list) {
            d dVar = new d();
            dVar.a(event.id);
            dVar.b(event.tag);
            dVar.a(event.getFields());
            c.a(sVar, event.type, dVar);
        }
    }
}
