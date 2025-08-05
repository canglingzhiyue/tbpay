package android.databinding;

import android.databinding.ObservableList;
import android.databinding.d;
import android.support.v4.util.Pools;

/* loaded from: classes2.dex */
public class e extends d<ObservableList.a, ObservableList, a> {

    /* renamed from: a  reason: collision with root package name */
    private static final Pools.SynchronizedPool<a> f1048a = new Pools.SynchronizedPool<>(10);
    private static final d.a<ObservableList.a, ObservableList, a> b = new d.a<ObservableList.a, ObservableList, a>() { // from class: android.databinding.e.1
        @Override // android.databinding.d.a
        public void a(ObservableList.a aVar, ObservableList observableList, int i, a aVar2) {
            if (i == 1) {
                aVar.onItemRangeChanged(observableList, aVar2.f1049a, aVar2.b);
            } else if (i == 2) {
                aVar.onItemRangeInserted(observableList, aVar2.f1049a, aVar2.b);
            } else if (i == 3) {
                aVar.onItemRangeMoved(observableList, aVar2.f1049a, aVar2.c, aVar2.b);
            } else if (i != 4) {
                aVar.onChanged(observableList);
            } else {
                aVar.onItemRangeRemoved(observableList, aVar2.f1049a, aVar2.b);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1049a;
        public int b;
        public int c;

        a() {
        }
    }

    public e() {
        super(b);
    }

    private static a a(int i, int i2, int i3) {
        a acquire = f1048a.acquire();
        if (acquire == null) {
            acquire = new a();
        }
        acquire.f1049a = i;
        acquire.c = i2;
        acquire.b = i3;
        return acquire;
    }

    public void a(ObservableList observableList, int i, int i2) {
        a(observableList, 1, a(i, 0, i2));
    }

    @Override // android.databinding.d
    public synchronized void a(ObservableList observableList, int i, a aVar) {
        super.a((e) observableList, i, (int) aVar);
        if (aVar != null) {
            f1048a.release(aVar);
        }
    }

    public void b(ObservableList observableList, int i, int i2) {
        a(observableList, 2, a(i, 0, i2));
    }

    public void c(ObservableList observableList, int i, int i2) {
        a(observableList, 4, a(i, 0, i2));
    }
}
