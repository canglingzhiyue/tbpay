package tb;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public interface lks<V extends ViewGroup> extends lkv, lkx, lkz {

    /* loaded from: classes7.dex */
    public interface a<V extends ViewGroup> {
        void a(int i);

        void a(Canvas canvas, V v);
    }

    /* loaded from: classes.dex */
    public interface b {
        void dM_();

        void dT_();
    }

    /* loaded from: classes.dex */
    public interface c<V extends ViewGroup> {
        void a(V v, int i);

        void a(V v, int i, int i2);

        void a(boolean z, boolean z2);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z);
    }

    /* loaded from: classes7.dex */
    public interface e {
        void a();
    }

    void a(View.OnAttachStateChangeListener onAttachStateChangeListener);

    void a(a<V> aVar);

    void a(b bVar);

    void a(c<V> cVar);

    void a(d dVar);

    void a(e eVar);

    void b(View.OnAttachStateChangeListener onAttachStateChangeListener);

    void b(a<V> aVar);

    void b(b bVar);

    void b(c<V> cVar);

    void b(d dVar);

    void b(e eVar);

    void d();
}
