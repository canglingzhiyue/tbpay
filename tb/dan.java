package tb;

import android.content.Context;
import com.nirvana.tools.logger.cache.db.DbException;
import com.nirvana.tools.logger.model.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class dan extends dap<b> {
    private czy f;
    private dai g;
    private volatile int h;

    public dan(Context context, czy czyVar, dao<b> daoVar, dah dahVar) {
        super(context, daoVar, czyVar, dahVar);
        this.h = 1;
        this.f = czyVar;
    }

    private void f() {
        this.f26641a.execute(new dag() { // from class: tb.dan.2
            @Override // tb.dag
            public void a() {
                List<b> a2;
                for (int i = 0; dan.this.e() && i < dan.this.j && (a2 = dan.this.f.a(dan.this.i)) != null && a2.size() > 0; i++) {
                    try {
                        dan.this.b(a2);
                    } catch (DbException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        });
    }

    public void a(int i) {
        this.h = i;
    }

    @Override // tb.dap
    protected void a(List<b> list) throws DbException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (b bVar : list) {
            if (bVar.a() == 1 || bVar.e() >= 2) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        this.f.c(arrayList);
        this.f.a(arrayList2);
    }

    public void b() {
        dai daiVar = this.g;
        if (daiVar == null || !daiVar.a()) {
            return;
        }
        this.g.d();
        this.g = null;
    }

    public void c() {
        b();
        f();
    }
}
