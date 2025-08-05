package android.support.design.widget;

import android.support.v4.util.Pools;
import android.support.v4.util.SimpleArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
final class f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Pools.Pool<ArrayList<T>> f1210a = new Pools.SimplePool(10);
    private final SimpleArrayMap<T, ArrayList<T>> b = new SimpleArrayMap<>();
    private final ArrayList<T> c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    private void a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1210a.release(arrayList);
    }

    private ArrayList<T> c() {
        ArrayList<T> acquire = this.f1210a.acquire();
        return acquire == null ? new ArrayList<>() : acquire;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.b.valueAt(i);
            if (valueAt != null) {
                a((ArrayList) valueAt);
            }
        }
        this.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(T t, T t2) {
        if (!this.b.containsKey(t) || !this.b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.b.get(t);
        if (arrayList == null) {
            arrayList = c();
            this.b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<T> b() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            a(this.b.keyAt(i), this.c, this.d);
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(T t) {
        return this.b.containsKey(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List c(T t) {
        return this.b.get(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<T> d(T t) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.b.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.keyAt(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(T t) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.b.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
