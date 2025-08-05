package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bH\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxTemplateManager;", "", "dxEngineRouter", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "(Lcom/taobao/android/dinamicx/DinamicXEngineRouter;)V", "availableTemplateMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "cacheAvailableTemplate", "", "availableTemplateItem", "fetchAvailableTemplate", "dstTemplateItem", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, DXTemplateItem> f34421a;
    private final bd b;

    static {
        kge.a(-705438075);
    }

    public xoc(bd dxEngineRouter) {
        q.c(dxEngineRouter, "dxEngineRouter");
        this.b = dxEngineRouter;
        this.f34421a = new ConcurrentHashMap<>(8);
    }

    public final DXTemplateItem a(DXTemplateItem dstTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("762f314e", new Object[]{this, dstTemplateItem});
        }
        q.c(dstTemplateItem, "dstTemplateItem");
        DXTemplateItem dXTemplateItem = this.f34421a.get(dstTemplateItem.f11925a);
        if (dXTemplateItem != null) {
            return dXTemplateItem;
        }
        DXTemplateItem a2 = this.b.a(dstTemplateItem);
        if (a2 != null) {
            String str = a2.f11925a;
            q.a((Object) str, "availableTemplate.name");
            this.f34421a.put(str, a2);
        }
        return a2;
    }

    public final void b(DXTemplateItem availableTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c5a1d2", new Object[]{this, availableTemplateItem});
            return;
        }
        q.c(availableTemplateItem, "availableTemplateItem");
        String str = availableTemplateItem.f11925a;
        q.a((Object) str, "availableTemplateItem.name");
        this.f34421a.put(str, availableTemplateItem);
    }
}
