package tb;

import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import java.util.concurrent.ConcurrentHashMap;
import tb.daz;

/* loaded from: classes4.dex */
public class dba {
    private static volatile dba b;

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, daz> f26655a = new ConcurrentHashMap<>();

    private dba() {
    }

    public static dba a() {
        if (b == null) {
            synchronized (dba.class) {
                if (b == null) {
                    b = new dba();
                }
            }
        }
        return b;
    }

    public <T extends dbb> void a(day<T> dayVar) {
        if (dayVar == null) {
            return;
        }
        daz dazVar = this.f26655a.get(dayVar.getID());
        if (dazVar == null) {
            daz dazVar2 = new daz(dayVar, new daz.a() { // from class: tb.dba.1
                @Override // tb.daz.a
                public final void a(daz dazVar3) {
                    dba.this.f26655a.remove(dazVar3.c.getID());
                }
            });
            dazVar2.a(dayVar);
            this.f26655a.put(dayVar.getID(), dazVar2);
            dazVar2.a();
            return;
        }
        dazVar.a(dayVar);
        if (ExecuteStrategy.USE_NEW != dayVar.getExecuteStrategy()) {
            return;
        }
        if (dazVar.b != null) {
            dazVar.b.a();
            dazVar.b = null;
        }
        dazVar.c = dayVar;
        dazVar.a();
    }
}
