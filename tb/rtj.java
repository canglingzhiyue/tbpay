package tb;

import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.common.b;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class rtj implements b, rth {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f33364a;
    private int d = 1;
    private final Map<String, b.a> b = new HashMap();
    private final Map<Integer, b.InterfaceC1061b> c = new HashMap();

    /* loaded from: classes9.dex */
    private static class a implements b.InterfaceC1061b {

        /* renamed from: a  reason: collision with root package name */
        private final FlutterJNI f33365a;
        private final int b;
        private final AtomicBoolean c = new AtomicBoolean(false);

        static {
            kge.a(750808624);
            kge.a(-462450065);
        }

        a(FlutterJNI flutterJNI, int i) {
            this.f33365a = flutterJNI;
            this.b = i;
        }

        @Override // io.unicorn.plugin.common.b.InterfaceC1061b
        public void a(ByteBuffer byteBuffer) {
            if (!this.c.getAndSet(true)) {
                if (byteBuffer == null) {
                    this.f33365a.invokePlatformMessageEmptyResponseCallback(this.b);
                    return;
                } else {
                    this.f33365a.invokePlatformMessageResponseCallback(this.b, byteBuffer, byteBuffer.position());
                    return;
                }
            }
            throw new IllegalStateException("Reply already submitted");
        }
    }

    static {
        kge.a(-1417812854);
        kge.a(-1510860598);
        kge.a(91722885);
    }

    public rtj(FlutterJNI flutterJNI) {
        this.f33364a = flutterJNI;
    }

    public static void a() {
    }

    @Override // tb.rth
    public void a(int i, byte[] bArr) {
        rtd.a("UnicornMessenger", "Received message reply from Dart.");
        b.InterfaceC1061b remove = this.c.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                rtd.a("UnicornMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(bArr == null ? null : ByteBuffer.wrap(bArr));
            } catch (Exception e) {
                rtd.b("UnicornMessenger", "Uncaught exception in binary message reply handler", e);
            }
        }
    }

    @Override // io.unicorn.plugin.common.b
    public void a(String str, b.a aVar) {
        if (aVar == null) {
            rtd.a("UnicornMessenger", "Removing handler for channel '" + str + "'");
            this.b.remove(str);
            return;
        }
        rtd.a("UnicornMessenger", "Setting handler for channel '" + str + "'");
        this.b.put(str, aVar);
    }

    @Override // io.unicorn.plugin.common.b
    public void a(String str, ByteBuffer byteBuffer, b.InterfaceC1061b interfaceC1061b) {
        int i;
        rtd.a("UnicornMessenger", "Sending message with callback over channel '" + str + "'");
        if (interfaceC1061b != null) {
            i = this.d;
            this.d = i + 1;
            this.c.put(Integer.valueOf(i), interfaceC1061b);
        } else {
            i = 0;
        }
        if (byteBuffer == null) {
            this.f33364a.dispatchEmptyPlatformMessage(str, i);
        } else {
            this.f33364a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
        }
    }

    @Override // tb.rth
    public void a(String str, byte[] bArr, int i) {
        rtd.a("UnicornMessenger", "Received message from Dart over channel '" + str + "'");
        b.a aVar = this.b.get(str);
        if (aVar != null) {
            try {
                rtd.a("UnicornMessenger", "Deferring to registered handler to process message.");
                aVar.a(bArr == null ? null : ByteBuffer.wrap(bArr), new a(this.f33364a, i));
                return;
            } catch (Exception e) {
                rtd.b("UnicornMessenger", "Uncaught exception in binary message listener", e);
            }
        } else {
            rtd.a("UnicornMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f33364a.invokePlatformMessageEmptyResponseCallback(i);
    }
}
