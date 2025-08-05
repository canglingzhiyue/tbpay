package tb;

import android.content.Context;
import com.nirvana.tools.logger.cache.db.DbException;
import com.nirvana.tools.logger.model.ACMLimitConfig;
import com.nirvana.tools.logger.model.b;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class czt {
    public static final int UPLOAD_TYPE_MANUAL = 1;
    public static final int UPLOAD_TYPE_TIMER = 2;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f26625a = new AtomicInteger();
    private czy b;
    private dan c;
    private daf d;

    public czt(Context context, dao<b> daoVar) {
        this(context, daoVar, null);
    }

    public czt(Context context, dao<b> daoVar, String str) {
        String str2;
        dah dahVar = new dah("ACMMonitor" + f26625a.getAndAdd(1));
        if (str == null) {
            str2 = dac.TABLE_NAME_MONITOR;
        } else {
            str2 = str + "_alitx_monitor";
        }
        this.b = new czy(context.getApplicationContext(), dahVar, str2, str);
        this.c = new dan(context.getApplicationContext(), this.b, daoVar, dahVar);
        this.d = new daf(this.c);
    }

    private void b(List<b> list) {
        try {
            this.b.b(list);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public void a() {
        this.d.a();
    }

    public void a(int i) {
        if (i == 1 || i == 2) {
            this.c.a(i);
        }
    }

    public void a(long j) {
        this.c.a(j);
    }

    public void a(ACMLimitConfig aCMLimitConfig) {
        this.d.a(aCMLimitConfig);
    }

    public void a(List<b> list) {
        b(list);
    }

    public void a(boolean z) {
        this.d.a(z);
    }

    public void b() {
        this.c.c();
    }

    public void b(int i) {
        this.c.b(i);
    }

    public void c(int i) {
        this.c.c(i);
    }

    public void d(int i) {
        this.c.d(i);
    }
}
