package tb;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
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
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.createItem")
/* loaded from: classes2.dex */
public final class awo extends arn implements atd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GLOBAL_DATA_CREATED_ITEMS = "global_data_created_items";
    public static final String TAG = "AURACreateItemEventTriggerExtension";

    /* renamed from: a  reason: collision with root package name */
    private q f25654a;
    private AURAGlobalData b;

    static {
        kge.a(-1241472785);
        kge.a(1021924628);
    }

    public static /* synthetic */ Object ipc$super(awo awoVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1219783041:
                super.onCreate((q) objArr[0], (f) objArr[1]);
                return null;
            case -362309544:
                super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
                return null;
            case 563256106:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    @Override // tb.arn, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f25654a = qVar;
    }

    @Override // tb.arn, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.b = aURAGlobalData;
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        if (!asw.RENDER_SERVICE_CODE.equals(aVar.c())) {
            return;
        }
        this.b.update(GLOBAL_DATA_CREATED_ITEMS, e());
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else if (aURARenderComponent == null) {
        } else {
            a(aURARenderComponent);
        }
    }

    private void a(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
            return;
        }
        String str = aURARenderComponent.key;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<String> e = e();
        if (e == null) {
            arc.a().c(TAG, "createItemIfNeeded", "mItemCreatedKeys创建失败");
        } else if (!e.contains(str) && (aURARenderComponentData = aURARenderComponent.data) != null) {
            Map<String, List<Event>> map = aURARenderComponentData.events;
            if (bau.a(map)) {
                return;
            }
            List<Event> list = map.get("createItem");
            if (bau.a(list)) {
                return;
            }
            for (Event event : list) {
                d dVar = new d();
                dVar.a(event.getFields());
                dVar.a(aURARenderComponent);
                dVar.b(event.getTag());
                c.a(this.f25654a.b(), event.getType(), dVar);
            }
            e.add(aURARenderComponent.key);
        }
    }

    private List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        List<String> list = (List) this.b.get(GLOBAL_DATA_CREATED_ITEMS, List.class);
        return list == null ? new ArrayList() : list;
    }

    @Override // tb.arn, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
