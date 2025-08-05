package tb;

import android.content.Context;
import com.nirvana.tools.logger.cache.db.DbException;
import com.nirvana.tools.logger.model.ACMLimitConfig;
import com.nirvana.tools.logger.model.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class dap<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    protected dah f26641a;
    protected dao<T> b;
    protected czw<T, ? extends dab<T>> c;
    protected Context e;
    private dar f;
    private boolean g;
    protected int i;
    protected long j;
    private int k;
    protected Map<Class, daq> d = new HashMap();
    private Object h = new Object();

    public dap(Context context, dao<T> daoVar, czw<T, ? extends dab<T>> czwVar, dah dahVar) {
        this.i = 0;
        this.j = 0L;
        this.k = 0;
        this.e = context;
        this.b = daoVar;
        this.c = czwVar;
        this.f26641a = dahVar;
        this.d.put(das.class, das.a(this.e));
        this.i = 20;
        this.j = 100L;
        this.k = 1;
    }

    public void a(long j) {
        this.j = j;
    }

    public void a(ACMLimitConfig aCMLimitConfig) {
        das a2 = das.a(this.e);
        a2.a(aCMLimitConfig);
        this.d.put(das.class, a2);
    }

    protected abstract void a(List<T> list) throws DbException;

    public void a(boolean z) {
        if (this.f == null) {
            this.f = new dar();
        }
        this.f.a(z);
        this.d.put(dar.class, this.f);
    }

    public void b(int i) {
        this.i = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(List<T> list) throws DbException {
        if (list != null && list.size() > 0) {
            int i = 0;
            boolean z = false;
            while (true) {
                if (i > this.k) {
                    break;
                } else if (!e()) {
                    return true;
                } else {
                    das.a(this.e).b();
                    z = this.b.upload(list);
                    if (z) {
                        this.c.c(list);
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                a(list);
                return false;
            }
        }
        return true;
    }

    public void c(int i) {
        this.k = i;
    }

    public void d() {
        synchronized (this.h) {
            if (this.g) {
                return;
            }
            this.g = true;
            this.f26641a.execute(new dag() { // from class: tb.dap.1
                @Override // tb.dag
                public void a() {
                    if (dap.this.c.a()) {
                        dap.this.f26641a.execute(new dag() { // from class: tb.dap.1.1
                            @Override // tb.dag
                            public void a() {
                                List<T> a2;
                                long c = dap.this.c.c();
                                long j = 0;
                                for (int i = 0; dap.this.e() && i < dap.this.j && (a2 = dap.this.c.a(j, c, dap.this.i)) != null && a2.size() > 0; i++) {
                                    try {
                                        dap.this.b(a2);
                                        j = a2.get(a2.size() - 1).b() + 1;
                                    } catch (DbException unused) {
                                    }
                                }
                                dap.this.g = false;
                            }
                        });
                    }
                }
            });
        }
    }

    public void d(int i) {
        List<T> b = i == 1 ? this.c.b() : i == 2 ? this.c.e() : this.c.d();
        if (b == null || b.size() <= 0) {
            return;
        }
        try {
            this.c.c(b);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public boolean e() {
        Map<Class, daq> map = this.d;
        if (map != null && map.size() != 0) {
            for (daq daqVar : this.d.values()) {
                if (!daqVar.a()) {
                    return false;
                }
            }
        }
        return true;
    }
}
