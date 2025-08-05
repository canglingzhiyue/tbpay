package tb;

import android.content.Context;
import android.os.RemoteException;
import com.heytap.msp.a;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class cwg {

    /* renamed from: a  reason: collision with root package name */
    public static Context f26565a;
    public static com.heytap.mspsdk.receiver.a b;
    public static AtomicBoolean c;
    public volatile com.heytap.msp.a d = null;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final cwg f26566a;

        static {
            kge.a(1448959540);
            f26566a = new cwg();
        }
    }

    static {
        kge.a(-905753801);
        c = new AtomicBoolean(false);
    }

    public static cwg a() {
        return a.f26566a;
    }

    public synchronized void a(com.heytap.msp.a aVar) {
        if (this.d == null) {
            this.d = aVar;
        }
    }

    public Context b() {
        return f26565a;
    }

    public synchronized boolean c() {
        if (this.d == null || !this.d.asBinder().pingBinder()) {
            return e() != null;
        }
        cwn.b("SdkRunTime", "ping OK");
        return true;
    }

    public synchronized com.heytap.msp.a d() {
        return this.d;
    }

    public final synchronized com.heytap.msp.a e() {
        try {
            com.heytap.msp.a a2 = a.AbstractBinderC0258a.a(new cwf(f26565a, null).b());
            this.d = a2;
            a2.a("getMspCoreBinder", null, null);
            cwn.b("SdkRunTime", "connect success by provider");
            return a2;
        } catch (RemoteException | BridgeDispatchException | BridgeExecuteException | IllegalArgumentException e) {
            e.printStackTrace();
            cwn.a("SdkRunTime", e);
            return null;
        }
    }
}
