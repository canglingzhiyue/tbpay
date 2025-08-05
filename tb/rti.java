package tb;

import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.common.b;
import io.unicorn.plugin.common.k;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class rti implements io.unicorn.plugin.common.b {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f33361a;
    private final rtj b;
    private final io.unicorn.plugin.common.b c;
    private String d;
    private b e;
    private final b.a f = new c(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a implements io.unicorn.plugin.common.b {

        /* renamed from: a  reason: collision with root package name */
        private final rtj f33362a;

        static {
            kge.a(-1885740839);
            kge.a(-1510860598);
        }

        private a(rtj rtjVar) {
            this.f33362a = rtjVar;
        }

        public static void a() {
        }

        @Override // io.unicorn.plugin.common.b
        public void a(String str, b.a aVar) {
            this.f33362a.a(str, aVar);
        }

        @Override // io.unicorn.plugin.common.b
        public void a(String str, ByteBuffer byteBuffer, b.InterfaceC1061b interfaceC1061b) {
            this.f33362a.a(str, byteBuffer, interfaceC1061b);
        }
    }

    /* loaded from: classes9.dex */
    interface b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final rti f33363a;

        static {
            kge.a(-1423292628);
            kge.a(2144227166);
        }

        public c(rti rtiVar) {
            this.f33363a = rtiVar;
        }

        public static void a() {
        }

        @Override // io.unicorn.plugin.common.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC1061b interfaceC1061b) {
            this.f33363a.d = k.INSTANCE.a(byteBuffer);
            if (this.f33363a.e != null) {
                b unused = this.f33363a.e;
                String unused2 = this.f33363a.d;
            }
        }
    }

    static {
        kge.a(519586940);
        kge.a(-1510860598);
    }

    public rti(FlutterJNI flutterJNI) {
        this.f33361a = flutterJNI;
        this.b = new rtj(flutterJNI);
        this.b.a("unicorn/isolate", this.f);
        this.c = new a(this.b);
    }

    public static void d() {
        c.a();
        a.a();
    }

    public void a() {
        rtd.a("ScriptExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f33361a.setPlatformMessageHandler(this.b);
    }

    @Override // io.unicorn.plugin.common.b
    public void a(String str, b.a aVar) {
        this.c.a(str, aVar);
    }

    @Override // io.unicorn.plugin.common.b
    public void a(String str, ByteBuffer byteBuffer, b.InterfaceC1061b interfaceC1061b) {
        this.c.a(str, byteBuffer, interfaceC1061b);
    }

    public void b() {
        rtd.a("ScriptExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f33361a.setPlatformMessageHandler(null);
    }

    public void c() {
        if (this.f33361a.isAttached()) {
            this.f33361a.notifyLowMemoryWarning();
        }
    }
}
