package tb;

import com.nirvana.tools.logger.cache.db.DbException;
import com.nirvana.tools.logger.model.c;
import java.util.List;
import tb.dab;

/* loaded from: classes4.dex */
public class czw<T extends c, G extends dab<T>> {

    /* renamed from: a  reason: collision with root package name */
    protected G f26628a;
    protected dah b;

    public czw(G g, dah dahVar) {
        this.f26628a = g;
        this.b = dahVar;
    }

    public List<T> a(long j, long j2, int i) {
        return this.f26628a.a(j, j2, i);
    }

    public void a(List<T> list) throws DbException {
        this.f26628a.a(list, System.currentTimeMillis(), 1);
    }

    public boolean a() {
        List<T> a2 = this.f26628a.a(1, 1, null);
        return a2 != null && a2.size() > 0;
    }

    public List<T> b() {
        return this.f26628a.a(-1, 1, null);
    }

    public boolean b(List<T> list) throws DbException {
        return this.f26628a.a(list);
    }

    public long c() {
        return this.f26628a.e();
    }

    public boolean c(List<T> list) throws DbException {
        return this.f26628a.b(list);
    }

    public List<T> d() {
        return this.f26628a.a(-1, -1, null);
    }

    public List<T> e() {
        return this.f26628a.a(-1, 0, null);
    }
}
