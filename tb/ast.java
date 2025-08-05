package tb;

import android.content.Context;
import android.support.v7.widget.AURAPagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.atp;

/* loaded from: classes2.dex */
public class ast implements atp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f25574a;
    private f b;
    private AURARenderComponent c;
    private AURAGlobalData d;
    private aqs e;

    static {
        kge.a(-2077374420);
        kge.a(2033972343);
    }

    public static /* synthetic */ aqs a(ast astVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqs) ipChange.ipc$dispatch("471a12cd", new Object[]{astVar}) : astVar.e;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c68e2fc", new Object[]{this, fVar});
        } else {
            this.b = fVar;
        }
    }

    public void a(AURARenderComponent aURARenderComponent, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64cf1f3", new Object[]{this, aURARenderComponent, aURAGlobalData});
            return;
        }
        this.c = aURARenderComponent;
        this.d = aURAGlobalData;
    }

    public void a(aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e088a9b5", new Object[]{this, aqsVar});
        } else {
            this.e = aqsVar;
        }
    }

    public View a(Context context, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c6a19650", new Object[]{this, context, recyclerView});
        }
        if (this.f25574a == null) {
            if (recyclerView == null) {
                this.f25574a = a(context);
            } else {
                this.f25574a = recyclerView;
            }
        }
        RecyclerView.LayoutManager layoutManager = this.f25574a.getLayoutManager();
        if (layoutManager instanceof atp) {
            atp atpVar = (atp) layoutManager;
            atpVar.a(this);
            atpVar.a(new a() { // from class: tb.ast.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.ext.vlayout.a
                public void a(RecyclerView.LayoutManager layoutManager2, Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c354798f", new Object[]{this, layoutManager2, exc});
                    } else if (ast.a(ast.this) == null) {
                    } else {
                        b bVar = new b(1, "VirtualLayoutManager", "VirtualLayoutManagerException", exc == null ? "" : exc.getMessage());
                        bVar.a("itemCount", Integer.valueOf(layoutManager2.getItemCount()));
                        bVar.a("childCount", Integer.valueOf(layoutManager2.getChildCount()));
                        ast.a(ast.this).a(bVar);
                    }
                }
            });
        } else if (baw.a()) {
            throw new IllegalArgumentException("RecyclerView的LayoutManager必须设置AURAVlayoutManager类型");
        }
        a(this.f25574a);
        RecyclerView.Adapter adapter = this.f25574a.getAdapter();
        if (adapter instanceof atn) {
            ((atn) adapter).a(this.b);
        }
        return this.f25574a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    public void a(List<AURARenderComponent> list, List<c> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        RecyclerView recyclerView = this.f25574a;
        if (recyclerView == null) {
            return;
        }
        atn atnVar = (atn) recyclerView.getAdapter();
        atnVar.a(list);
        atnVar.b(list2);
        atnVar.notifyDataSetChanged();
    }

    private RecyclerView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3fe22864", new Object[]{this, context});
        }
        atp atpVar = new atp(context);
        atpVar.a(this);
        atn atnVar = new atn(atpVar);
        RecyclerView b = b(context);
        a(b, atpVar);
        if (b.getLayoutParams() == null) {
            b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        b.setItemAnimator(null);
        b.setLayoutManager(atpVar.a(b));
        b.setAdapter(atnVar);
        return b;
    }

    private void a(RecyclerView recyclerView, VirtualLayoutManager virtualLayoutManager) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ec877c", new Object[]{this, recyclerView, virtualLayoutManager});
            return;
        }
        AURARenderComponent aURARenderComponent = this.c;
        if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (map = aURARenderComponentData.fields) == null) {
            return;
        }
        String str = (String) bbc.a(map, "direction", String.class, "");
        if (Constants.Value.HORIZONTAL.equalsIgnoreCase(str)) {
            virtualLayoutManager.setOrientation(0);
            virtualLayoutManager.a(false);
            virtualLayoutManager.b(true);
        } else if ("vertical".equalsIgnoreCase(str)) {
            virtualLayoutManager.setOrientation(1);
            virtualLayoutManager.b(false);
            virtualLayoutManager.a(true);
        }
        if (!"page".equalsIgnoreCase((String) bbc.a(map, "scrollMode", String.class, ""))) {
            return;
        }
        new AURAPagerSnapHelper().attachToRecyclerView(recyclerView);
    }

    private RecyclerView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3133b7e5", new Object[]{this, context});
        }
        f fVar = this.b;
        if (fVar != null) {
            for (atf atfVar : fVar.b(atf.class)) {
                RecyclerView containerView = atfVar.getContainerView(context);
                if (containerView != null) {
                    return containerView;
                }
            }
        }
        return new RecyclerView(context);
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        f fVar = this.b;
        if (fVar == null) {
            return;
        }
        final List b = fVar.b(atg.class);
        if (b.isEmpty()) {
            return;
        }
        b(recyclerView);
        RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: tb.ast.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                for (atg atgVar : b) {
                    atgVar.a(recyclerView2, i, i2);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i);
                for (atg atgVar : b) {
                    atgVar.a(recyclerView2, i);
                }
            }
        };
        recyclerView.addOnScrollListener(onScrollListener);
        a(onScrollListener);
    }

    private void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1012817", new Object[]{this, recyclerView});
            return;
        }
        List<RecyclerView.OnScrollListener> c = c();
        if (c == null) {
            return;
        }
        for (RecyclerView.OnScrollListener onScrollListener : c) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
    }

    private void a(RecyclerView.OnScrollListener onScrollListener) {
        List<RecyclerView.OnScrollListener> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
        } else if (this.d == null || (c = c()) == null || c.contains(onScrollListener)) {
        } else {
            c.add(onScrollListener);
        }
    }

    private List<RecyclerView.OnScrollListener> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData == null) {
            return null;
        }
        List<RecyclerView.OnScrollListener> list = (List) aURAGlobalData.get("renderRecyclerViewScrollListener", List.class);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.d.update("renderRecyclerViewScrollListener", arrayList);
        return arrayList;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.f25574a;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof VirtualLayoutManager)) {
            return;
        }
        ((VirtualLayoutManager) layoutManager).a(new ass(this.b, this.f25574a));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = null;
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.f25574a;
        if (recyclerView == null || !(recyclerView.getAdapter() instanceof atq)) {
            return;
        }
        this.f25574a = null;
    }

    @Override // tb.atp.a
    public void a(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a853929", new Object[]{this, state});
            return;
        }
        f fVar = this.b;
        if (fVar == null || this.f25574a == null) {
            return;
        }
        for (ath athVar : fVar.b(ath.class)) {
            athVar.a(this.f25574a, state);
        }
    }
}
