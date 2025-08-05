package tb;

import android.content.Context;
import java.io.InputStream;

@Deprecated
/* loaded from: classes4.dex */
public abstract class cwy {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26577a;
    private InputStream b;

    public cwy(Context context) {
        this.f26577a = context;
    }

    public abstract InputStream a(Context context);

    public final void a() {
        cxa.a(this.b);
    }

    public InputStream b() {
        if (this.b == null) {
            this.b = a(this.f26577a);
        }
        return this.b;
    }
}
