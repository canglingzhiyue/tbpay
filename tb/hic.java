package tb;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.completeExposure")
/* loaded from: classes2.dex */
public final class hic implements atd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPLETE_KEY = "completeExposure";
    private static final List<String> c;

    /* renamed from: a  reason: collision with root package name */
    private q f28680a;
    private AURAGlobalData b;
    private boolean d;
    private int e;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float f28684a = 0.0f;
        public float b = 1.0f;

        static {
            kge.a(95211659);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface b {
        void a(float f);
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    public static /* synthetic */ int a(hic hicVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec029409", new Object[]{hicVar})).intValue() : hicVar.e;
    }

    public static /* synthetic */ int a(hic hicVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945061a0", new Object[]{hicVar, new Integer(i)})).intValue();
        }
        hicVar.e = i;
        return i;
    }

    public static /* synthetic */ void a(hic hicVar, RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56911295", new Object[]{hicVar, viewHolder, aURARenderComponent, list});
        } else {
            hicVar.c(viewHolder, aURARenderComponent, list);
        }
    }

    public static /* synthetic */ void a(hic hicVar, List list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b1c354", new Object[]{hicVar, list, aURARenderComponent});
        } else {
            hicVar.a(list, aURARenderComponent);
        }
    }

    public static /* synthetic */ boolean a(hic hicVar, RecyclerView.ViewHolder viewHolder, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("deb0104c", new Object[]{hicVar, viewHolder, aVar})).booleanValue() : hicVar.a(viewHolder, aVar);
    }

    public static /* synthetic */ List b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[0]) : c;
    }

    static {
        kge.a(-1370538078);
        kge.a(1021924628);
        c = new ArrayList();
    }

    private Map<String, Boolean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.b;
        if (aURAGlobalData == null) {
            return new HashMap();
        }
        Map<String, Boolean> map = (Map) aURAGlobalData.get(COMPLETE_KEY, Map.class);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        this.b.update(COMPLETE_KEY, hashMap);
        return hashMap;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f28680a = qVar;
        this.d = bar.a("disableCompleteExposure", false);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            c.clear();
        }
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        List<Event> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else if (this.d || (b2 = b(aURARenderComponent)) == null || b2.isEmpty()) {
        } else {
            try {
                if (aURARenderComponent.isAsync()) {
                    if (aURARenderComponent.asyncStatus() == null || !aURARenderComponent.asyncStatus().equals("success")) {
                        return;
                    }
                    a(viewHolder, aURARenderComponent, b2);
                    return;
                }
                a(viewHolder, aURARenderComponent, b2);
            } catch (Exception e) {
                hyw.a("COMPLETE_EXPOSURE_EXCEPTION", e.getMessage());
            }
        }
    }

    private synchronized void a(RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d6fe67", new Object[]{this, viewHolder, aURARenderComponent, list});
        } else if (aURARenderComponent.isInvisible()) {
            ard a2 = arc.a();
            a2.a("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " 不可见");
        } else {
            Map<String, Boolean> a3 = a();
            if (!c.contains(aURARenderComponent.key) && !Boolean.TRUE.equals(a3.get(aURARenderComponent.key))) {
                ard a4 = arc.a();
                a4.a("ExposureCompleteItemEventTrigger", "比例曝光增加 " + aURARenderComponent.key);
                c.add(aURARenderComponent.key);
            }
            if (a(viewHolder, aURARenderComponent)) {
                c(viewHolder, aURARenderComponent, list);
            }
            b(viewHolder, aURARenderComponent, list);
        }
    }

    private void b(final RecyclerView.ViewHolder viewHolder, final AURARenderComponent aURARenderComponent, final List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d8829a8", new Object[]{this, viewHolder, aURARenderComponent, list});
        } else if (c.isEmpty()) {
        } else {
            a(viewHolder, c(aURARenderComponent), new b() { // from class: tb.hic.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.hic.b
                public void a(float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                    } else {
                        hic.a(hic.this, viewHolder, aURARenderComponent, list);
                    }
                }
            });
        }
    }

    private void c(RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73954e9", new Object[]{this, viewHolder, aURARenderComponent, list});
        } else if (viewHolder == null || aURARenderComponent == null) {
            arc.a().a("ExposureCompleteItemEventTrigger", "renderComponent or holder is null");
        } else if (Boolean.TRUE.equals(a().get(aURARenderComponent.key))) {
            a(aURARenderComponent);
        } else {
            a(aURARenderComponent);
            a(aURARenderComponent, list);
        }
    }

    private void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else if (!c.contains(aURARenderComponent.key)) {
        } else {
            c.remove(aURARenderComponent.key);
        }
    }

    private a c(AURARenderComponent aURARenderComponent) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cf069e76", new Object[]{this, aURARenderComponent});
        }
        a aVar = new a();
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null) {
            return aVar;
        }
        Object obj = map.get("exposureOffset");
        Object obj2 = map.get("exposurePercent");
        try {
            if (obj instanceof String) {
                aVar.f28684a = Float.valueOf((String) obj).floatValue();
            }
            if (obj2 instanceof String) {
                aVar.b = Float.valueOf((String) obj2).floatValue();
            }
        } catch (Throwable th) {
            arc.a().a("ExposureCompleteItemEventTrigger", th.getMessage());
        }
        return aVar;
    }

    private List<Event> b(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, List<Event>> map;
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc3207d5", new Object[]{this, aURARenderComponent});
        }
        ArrayList arrayList = new ArrayList();
        return (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (map = aURARenderComponentData.events) == null || map.isEmpty() || (list = map.get("exposureItemComplete")) == null || list.isEmpty()) ? arrayList : list;
    }

    private void a(final RecyclerView.ViewHolder viewHolder, final a aVar, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f4b666", new Object[]{this, viewHolder, aVar, bVar});
            return;
        }
        RecyclerView c2 = c();
        if (c2 == null) {
            arc.a().a("ExposureCompleteItemEventTrigger", "recyclerView is null");
        } else {
            c2.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: tb.hic.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == 806944192) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (hic.b().isEmpty()) {
                        recyclerView.removeOnScrollListener(this);
                    }
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    if (Math.abs(computeVerticalScrollOffset - hic.a(hic.this)) < 10) {
                        return;
                    }
                    hic.a(hic.this, computeVerticalScrollOffset);
                    if (!hic.a(hic.this, viewHolder, aVar)) {
                        return;
                    }
                    bVar.a(aVar.b);
                }
            });
        }
    }

    private boolean a(RecyclerView.ViewHolder viewHolder, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5814f93a", new Object[]{this, viewHolder, aVar})).booleanValue();
        }
        if (viewHolder != null && viewHolder.itemView != null) {
            int height = (int) (viewHolder.itemView.getHeight() * aVar.b);
            Rect rect = new Rect();
            viewHolder.itemView.getGlobalVisibleRect(rect);
            if (rect.top >= 0 && rect.top <= ((bay.c() + bay.e()) - bay.a(aVar.f28684a)) - height) {
                return true;
            }
        }
        return false;
    }

    private boolean a(RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8761d7a", new Object[]{this, viewHolder, aURARenderComponent})).booleanValue() : viewHolder.itemView != null && viewHolder.itemView.getHeight() > 0 && a(viewHolder);
    }

    private boolean a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6090f29", new Object[]{this, viewHolder})).booleanValue();
        }
        if (viewHolder.itemView == null || (c2 = c()) == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = c2.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int adapterPosition = viewHolder.getAdapterPosition();
        return adapterPosition >= findFirstCompletelyVisibleItemPosition && adapterPosition <= findLastCompletelyVisibleItemPosition;
    }

    private RecyclerView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7c027a1a", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.b;
        if (aURAGlobalData != null) {
            return (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
        }
        return null;
    }

    private void a(final AURARenderComponent aURARenderComponent, final List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc9aac4", new Object[]{this, aURARenderComponent, list});
        } else if (aURARenderComponent == null || aURARenderComponent.key == null) {
        } else {
            Map<String, Boolean> a2 = a();
            a2.put(aURARenderComponent.key, true);
            AURAGlobalData aURAGlobalData = this.b;
            if (aURAGlobalData != null) {
                aURAGlobalData.update(COMPLETE_KEY, a2);
            }
            bbh.a(new Runnable() { // from class: tb.hic.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ard a3 = arc.a();
                        a3.a("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " 曝光");
                        hic.a(hic.this, list, aURARenderComponent);
                    } catch (Throwable th) {
                        ard a4 = arc.a();
                        a4.b("checkAndExecuteComponentEvent exception " + th);
                    }
                }
            });
        }
    }

    private void a(List<Event> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e138cc2", new Object[]{this, list, aURARenderComponent});
        } else if (list != null) {
            for (Event event : list) {
                if (event != null) {
                    d dVar = new d();
                    dVar.a(event.getFields());
                    dVar.a(aURARenderComponent);
                    if (event.getTag() != null) {
                        dVar.b(event.getTag());
                    }
                    String type = event.getType();
                    q qVar = this.f28680a;
                    if (qVar != null && type != null) {
                        c.a(qVar.b(), event.getType(), dVar);
                    }
                }
            }
        }
    }
}
