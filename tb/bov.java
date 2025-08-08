package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.perf.asynccomponent.PreloadAsyncComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class bov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f26027a = new ArrayList();
    private Set<IDMComponent> b = new LinkedHashSet();
    private boolean c = false;

    static {
        kge.a(753780582);
    }

    public void a(List<IDMComponent> list, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc586fc", new Object[]{this, list, dVar});
            return;
        }
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null && iDMComponent.getEventMap() != null && iDMComponent.getEventMap().get("createItem") != null && !this.f26027a.contains(iDMComponent.getKey())) {
                this.b.add(iDMComponent);
            }
        }
    }

    public void a(IDMComponent iDMComponent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ab0a89", new Object[]{this, iDMComponent, dVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<b> list = iDMComponent.getEventMap().get("createItem");
        if (list == null || this.f26027a.contains(iDMComponent.getKey())) {
            return;
        }
        UnifyLog.a(PreloadAsyncComponent.TAG, "ItemCreateStrategy.buildCreateItemEventAndSend" + iDMComponent.getKey());
        this.f26027a.add(iDMComponent.getKey());
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar != null) {
                String type = bVar.getType();
                if (!StringUtils.isEmpty(type)) {
                    e a2 = dVar.d().a().a(type);
                    a2.a(iDMComponent);
                    a2.e("createItem");
                    a2.a(bVar);
                    dVar.d().a(a2);
                }
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        UnifyLog.a(PreloadAsyncComponent.TAG, "buildCreateItemEventAndSend " + iDMComponent.getKey() + " cost " + currentTimeMillis2);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26c908d", new Object[]{this, dVar});
        } else if (!this.c) {
            if (this.b.isEmpty()) {
                UnifyLog.b(PreloadAsyncComponent.TAG, "lazyLoadAllOnce mLazyCreateComponentList isEmpty");
                return;
            }
            this.c = true;
            UnifyLog.b(PreloadAsyncComponent.TAG, "ItemCreateStrategy", "lazyLoadAllOnce");
            long currentTimeMillis = System.currentTimeMillis();
            for (IDMComponent iDMComponent : this.b) {
                a(iDMComponent, dVar);
            }
            UnifyLog.b(PreloadAsyncComponent.TAG, "lazyLoadAllOnce cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms, count is " + this.b.size());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f26027a.clear();
        }
    }
}
