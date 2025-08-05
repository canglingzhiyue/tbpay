package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.uniapp.solution.extension.instance.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.iwk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/page/MTOPPrefetchPageExtension;", "Lcom/taobao/themis/uniapp/solution/extension/page/IMTOPPrefetchPageExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "onRegister", "", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class iwl implements iwk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ITMSPage f29375a;

    static {
        kge.a(-827492689);
        kge.a(-1945556342);
    }

    public iwl(ITMSPage page) {
        q.d(page, "page");
        this.f29375a = page;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            iwk.a.c(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            iwk.a.a(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        iwk.a.a(this, page);
        String a2 = page.c().e().a();
        if (a2 == null) {
            return;
        }
        i iVar = i.INSTANCE;
        String g = page.b().g();
        q.b(g, "page.getInstance().url");
        i.a a3 = iVar.a(g);
        if (a3 == null || q.a((Object) a3.c(), (Object) a2) || (aVar = (a) page.b().b(a.class)) == null) {
            return;
        }
        aVar.a(page);
    }
}
