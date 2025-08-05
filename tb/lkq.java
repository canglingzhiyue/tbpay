package tb;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public interface lkq<V extends ViewGroup> {

    /* loaded from: classes.dex */
    public interface a {
        void a(Context context);

        void b();
    }

    void addOnContainerListener(a aVar);

    /* renamed from: createContainer */
    V mo1092createContainer(Context context);

    void destroyContainer();

    void removeOnContainerListener(a aVar);
}
