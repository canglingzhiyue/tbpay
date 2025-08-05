package io.unicorn.plugin.image;

import io.unicorn.embedding.engine.FlutterJNI;
import tb.kge;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private ExternalAdapterImageProvider f24855a;

    /* renamed from: io.unicorn.plugin.image.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    private static final class C1062a {

        /* renamed from: a  reason: collision with root package name */
        private static final a f24856a;

        static {
            kge.a(-1408592975);
            f24856a = new a();
        }
    }

    static {
        kge.a(-2141465081);
    }

    private a() {
        this.f24855a = null;
    }

    public static a a() {
        return C1062a.f24856a;
    }

    public void a(ExternalAdapterImageProvider externalAdapterImageProvider) {
        if (externalAdapterImageProvider != null) {
            this.f24855a = externalAdapterImageProvider;
            FlutterJNI.nativeInstallFlutterExternalAdapterImageProvider();
        }
    }

    public ExternalAdapterImageProvider b() {
        return this.f24855a;
    }
}
