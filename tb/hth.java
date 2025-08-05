package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.data.e;
import com.taobao.android.meta.logic.a;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.meta.structure.page.f;
import java.util.HashSet;
import kotlin.jvm.internal.q;
import tb.htg;

/* loaded from: classes6.dex */
public abstract class hth<D extends b<C, R>, C extends htg, R extends MetaResult<C>> extends a<D, C, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final HashSet<b<?, ?>> d = new HashSet<>();

    static {
        kge.a(891071420);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(hth hthVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -274184482) {
            super.a((f) objArr[0]);
            return null;
        } else if (hashCode != 1979675630) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((hth) ((b) objArr[0]), (g) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.meta.logic.c
    public boolean a(int i, D initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98ab8bfa", new Object[]{this, new Integer(i), initDataSource})).booleanValue();
        }
        q.c(initDataSource, "initDataSource");
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(b bVar, com.taobao.android.meta.data.a aVar, com.taobao.android.meta.data.a aVar2, e eVar) {
        a((hth<D, C, R>) bVar, (htg) aVar, (htg) aVar2, (e<htg>) eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void b(b bVar, com.taobao.android.meta.data.a aVar, com.taobao.android.meta.data.a aVar2, e eVar) {
        b((hth<D, C, R>) bVar, (htg) aVar, (htg) aVar2, (e<htg>) eVar);
    }

    public final HashSet<b<?, ?>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("be7f2185", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.android.meta.logic.a
    public void a(f<D, C, ? extends hte, R> widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa846de", new Object[]{this, widget});
            return;
        }
        q.c(widget, "widget");
        super.a(widget);
        this.d.add(b());
    }

    @Override // com.taobao.android.meta.logic.a
    public void a(D scopeDataSource, g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ff73ee", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(childPage, "childPage");
        super.a((hth<D, C, R>) scopeDataSource, childPage);
        if (this.d.contains(scopeDataSource)) {
            return;
        }
        b((hth<D, C, R>) scopeDataSource, childPage);
        this.d.add(scopeDataSource);
    }

    public void b(D scopeDataSource, g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfed24d", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(childPage, "childPage");
        scopeDataSource.doNewSearch(null, true, null);
    }

    public void a(D scopeDataSource, C src, C incoming, e<C> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393fdaa5", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(src, "src");
        q.c(incoming, "incoming");
        q.c(config, "config");
        src.a(incoming);
    }

    public void b(D scopeDataSource, C src, C incoming, e<C> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12c4826", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(src, "src");
        q.c(incoming, "incoming");
        q.c(config, "config");
        src.b(incoming);
    }
}
