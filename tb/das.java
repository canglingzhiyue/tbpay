package tb;

import android.content.Context;
import com.nirvana.tools.logger.model.ACMLimitConfig;

/* loaded from: classes4.dex */
public class das implements daq {

    /* renamed from: a  reason: collision with root package name */
    private static volatile das f26645a;
    private ACMLimitConfig b;
    private Context c;

    public das(Context context) {
        this.c = context;
        this.b = daw.a(this.c);
    }

    public static das a(Context context) {
        if (f26645a == null) {
            synchronized (das.class) {
                if (f26645a == null) {
                    f26645a = new das(context);
                }
            }
        }
        return f26645a;
    }

    public synchronized void a(ACMLimitConfig aCMLimitConfig) {
        if (aCMLimitConfig != null) {
            this.b = aCMLimitConfig;
            daw.a(this.c, this.b);
        }
    }

    @Override // tb.daq
    public synchronized boolean a() {
        if (this.b == null || !this.b.isLimited() || this.b.getLimitHours() <= 0) {
            return true;
        }
        return daw.b(this.c, dat.a(this.b.getLimitHours())) < this.b.getLimitCount();
    }

    public synchronized void b() {
        if (this.b != null && this.b.isLimited() && this.b.getLimitHours() > 0) {
            daw.a(this.c, dat.a(this.b.getLimitHours()));
        }
    }
}
