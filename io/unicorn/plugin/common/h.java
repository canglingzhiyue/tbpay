package io.unicorn.plugin.common;

import android.util.Log;
import io.unicorn.plugin.common.b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes9.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final io.unicorn.plugin.common.b f24847a;
    private final String b;
    private final i c;

    /* loaded from: classes9.dex */
    private static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final h f24848a;
        private final c b;

        static {
            kge.a(901773115);
            kge.a(2144227166);
        }

        a(h hVar, c cVar) {
            this.f24848a = hVar;
            this.b = cVar;
        }

        private String a(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        public static void a() {
        }

        @Override // io.unicorn.plugin.common.b.a
        public void a(ByteBuffer byteBuffer, final b.InterfaceC1061b interfaceC1061b) {
            try {
                this.b.a(this.f24848a.c.a(byteBuffer), new d() { // from class: io.unicorn.plugin.common.h.a.1
                    @Override // io.unicorn.plugin.common.h.d
                    public void a() {
                        interfaceC1061b.a(null);
                    }

                    @Override // io.unicorn.plugin.common.h.d
                    public void a(Object obj) {
                        interfaceC1061b.a(a.this.f24848a.c.a(obj));
                    }

                    @Override // io.unicorn.plugin.common.h.d
                    public void a(String str, String str2, Object obj) {
                        interfaceC1061b.a(a.this.f24848a.c.a(str, str2, obj));
                    }
                });
            } catch (RuntimeException e) {
                Log.e("MethodChannel#" + this.f24848a.b, "Failed to handle method call", e);
                interfaceC1061b.a(this.f24848a.c.a("error", e.getMessage(), null, a(e)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static final class b implements b.InterfaceC1061b {

        /* renamed from: a  reason: collision with root package name */
        private final h f24850a;
        private final d b;

        static {
            kge.a(1403042877);
            kge.a(-462450065);
        }

        b(h hVar, d dVar) {
            this.f24850a = hVar;
            this.b = dVar;
        }

        public static void a() {
        }

        @Override // io.unicorn.plugin.common.b.InterfaceC1061b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.b.a();
                    return;
                }
                try {
                    this.b.a(this.f24850a.c.b(byteBuffer));
                } catch (FlutterException e) {
                    this.b.a(e.code, e.getMessage(), e.details);
                }
            } catch (RuntimeException e2) {
                Log.e("MethodChannel#" + this.f24850a.b, "Failed to handle method call result", e2);
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface c {
        void a(g gVar, d dVar);
    }

    /* loaded from: classes9.dex */
    public interface d {
        void a();

        void a(Object obj);

        void a(String str, String str2, Object obj);
    }

    static {
        kge.a(1969478554);
    }

    public h(io.unicorn.plugin.common.b bVar, String str, i iVar) {
        this.f24847a = bVar;
        this.b = str;
        this.c = iVar;
    }

    public static void a() {
        b.a();
        a.a();
    }

    public void a(c cVar) {
        this.f24847a.a(this.b, cVar == null ? null : new a(this, cVar));
    }

    public void a(String str, Object obj) {
        a(str, obj, null);
    }

    public void a(String str, Object obj, d dVar) {
        this.f24847a.a(this.b, this.c.a(new g(str, obj)), dVar == null ? null : new b(this, dVar));
    }
}
