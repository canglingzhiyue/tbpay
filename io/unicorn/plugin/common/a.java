package io.unicorn.plugin.common;

import android.util.Log;
import io.unicorn.plugin.common.b;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes9.dex */
public final class a<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";

    /* renamed from: a  reason: collision with root package name */
    private final io.unicorn.plugin.common.b f24842a;
    private final String b;
    private final f<T> c;

    /* renamed from: io.unicorn.plugin.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    private static final class C1060a<T> implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final a<T> f24843a;
        private final c<T> b;

        static {
            kge.a(-1903241589);
            kge.a(2144227166);
        }

        private C1060a(a<T> aVar, c<T> cVar) {
            this.f24843a = aVar;
            this.b = cVar;
        }

        public static void a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.unicorn.plugin.common.b.a
        public void a(ByteBuffer byteBuffer, final b.InterfaceC1061b interfaceC1061b) {
            try {
                this.b.a(((a) this.f24843a).c.a(byteBuffer), new d<T>() { // from class: io.unicorn.plugin.common.a.a.1
                    @Override // io.unicorn.plugin.common.a.d
                    public void a(T t) {
                        interfaceC1061b.a(C1060a.this.f24843a.c.a((f) t));
                    }
                });
            } catch (RuntimeException e) {
                Log.e("BasicMessageChannel#" + ((a) this.f24843a).b, "Failed to handle message", e);
                interfaceC1061b.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public final class b implements b.InterfaceC1061b {
        private final d<T> b;

        static {
            kge.a(17891400);
            kge.a(-462450065);
        }

        private b(d<T> dVar) {
            this.b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.unicorn.plugin.common.b.InterfaceC1061b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.b.a(a.this.c.a(byteBuffer));
            } catch (RuntimeException e) {
                Log.e("BasicMessageChannel#" + a.this.b, "Failed to handle message reply", e);
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface c<T> {
        void a(T t, d<T> dVar);
    }

    /* loaded from: classes9.dex */
    public interface d<T> {
        void a(T t);
    }

    static {
        kge.a(-804109438);
    }

    public a(io.unicorn.plugin.common.b bVar, String str, f<T> fVar) {
        this.f24842a = bVar;
        this.b = str;
        this.c = fVar;
    }

    public static void a() {
        C1060a.a();
    }

    public void a(c<T> cVar) {
        io.unicorn.plugin.common.b bVar = this.f24842a;
        String str = this.b;
        C1060a c1060a = null;
        if (cVar != null) {
            c1060a = new C1060a(cVar);
        }
        bVar.a(str, c1060a);
    }

    public void a(T t) {
        a(t, null);
    }

    public void a(T t, d<T> dVar) {
        io.unicorn.plugin.common.b bVar = this.f24842a;
        String str = this.b;
        ByteBuffer a2 = this.c.a((f<T>) t);
        b bVar2 = null;
        if (dVar != null) {
            bVar2 = new b(dVar);
        }
        bVar.a(str, a2, bVar2);
    }
}
