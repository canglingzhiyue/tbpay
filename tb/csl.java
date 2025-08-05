package tb;

import android.view.MotionEvent;
import com.etao.feimagesearch.result.ScrollInterceptView;
import kotlin.t;

/* loaded from: classes3.dex */
public interface csl {
    public static final int AUTO_SCROLL_INTERVAL_DEFAULT = 0;
    public static final int AUTO_SCROLL_INTERVAL_LONG = 2;
    public static final int AUTO_SCROLL_INTERVAL_SHORT = 1;
    public static final a Companion = a.f26489a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static final int AUTO_SCROLL_INTERVAL_DEFAULT = 0;
        public static final int AUTO_SCROLL_INTERVAL_LONG = 2;
        public static final int AUTO_SCROLL_INTERVAL_SHORT = 1;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f26489a;

        static {
            kge.a(-1611449015);
            f26489a = new a();
        }

        private a() {
        }
    }

    int a();

    void a(float f, long j, cso csoVar);

    void a(int i);

    void a(int i, boolean z);

    void a(ScrollInterceptView.a aVar);

    void a(ScrollInterceptView.b bVar);

    void a(ScrollInterceptView scrollInterceptView);

    void a(ruk<t> rukVar);

    void a(ruw<? super Boolean, ? super Boolean, t> ruwVar);

    void a(boolean z);

    boolean a(MotionEvent motionEvent);

    int b();

    void b(int i);

    void b(ruk<t> rukVar);

    boolean b(MotionEvent motionEvent);

    int c();

    void c(int i);

    void d(int i);

    void f(int i);

    boolean f();

    void i(int i);
}
