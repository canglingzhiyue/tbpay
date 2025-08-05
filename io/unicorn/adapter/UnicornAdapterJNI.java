package io.unicorn.adapter;

import android.app.Application;
import android.util.Log;
import io.unicorn.embedding.engine.a;
import tb.kge;
import tb.rtc;
import tb.rtg;

/* loaded from: classes9.dex */
public class UnicornAdapterJNI {
    private static final String TAG = "UnicornAdapterJNI";
    private volatile boolean mHasLoaded;
    private a.e mLibraryLoadListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final UnicornAdapterJNI f24792a;

        static {
            kge.a(-928461622);
            f24792a = new UnicornAdapterJNI();
        }
    }

    static {
        kge.a(-1208367026);
    }

    private UnicornAdapterJNI() {
        this.mHasLoaded = false;
        io.unicorn.embedding.engine.a.f24826a = new a.e() { // from class: io.unicorn.adapter.UnicornAdapterJNI.1
            @Override // io.unicorn.embedding.engine.a.e
            public void a() {
                UnicornAdapterJNI.this.mHasLoaded = true;
                if (UnicornAdapterJNI.this.mLibraryLoadListener != null) {
                    UnicornAdapterJNI.this.mLibraryLoadListener.a();
                }
                Log.e(UnicornAdapterJNI.TAG, "unicorn engine on load");
            }
        };
    }

    public static UnicornAdapterJNI instance() {
        return a.f24792a;
    }

    public void init(Application application) {
        try {
            rtc.a().c().a(application.getApplicationContext(), new rtg.b(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void init(Application application, a.e eVar) {
        this.mLibraryLoadListener = eVar;
        init(application);
    }

    public boolean libraryLoaded() {
        return this.mHasLoaded;
    }
}
