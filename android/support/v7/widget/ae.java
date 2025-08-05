package android.support.v7.widget;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.Pools;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ae {

    /* renamed from: a  reason: collision with root package name */
    final ArrayMap<RecyclerView.ViewHolder, a> f1476a = new ArrayMap<>();
    final LongSparseArray<RecyclerView.ViewHolder> b = new LongSparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        static Pools.Pool<a> d = new Pools.SimplePool(20);

        /* renamed from: a  reason: collision with root package name */
        int f1477a;
        RecyclerView.ItemAnimator.ItemHolderInfo b;
        RecyclerView.ItemAnimator.ItemHolderInfo c;

        private a() {
        }

        static a a() {
            a acquire = d.acquire();
            return acquire == null ? new a() : acquire;
        }

        static void a(a aVar) {
            aVar.f1477a = 0;
            aVar.b = null;
            aVar.c = null;
            d.release(aVar);
        }

        static void b() {
            do {
            } while (d.acquire() != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.ViewHolder viewHolder);

        void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void b(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo a(RecyclerView.ViewHolder viewHolder, int i) {
        a valueAt;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int indexOfKey = this.f1476a.indexOfKey(viewHolder);
        if (indexOfKey < 0 || (valueAt = this.f1476a.valueAt(indexOfKey)) == null || (valueAt.f1477a & i) == 0) {
            return null;
        }
        valueAt.f1477a &= ~i;
        if (i == 4) {
            itemHolderInfo = valueAt.b;
        } else if (i != 8) {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        } else {
            itemHolderInfo = valueAt.c;
        }
        if ((valueAt.f1477a & 12) == 0) {
            this.f1476a.removeAt(indexOfKey);
            a.a(valueAt);
        }
        return itemHolderInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.ViewHolder a(long j) {
        return this.b.get(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f1476a.clear();
        this.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j, RecyclerView.ViewHolder viewHolder) {
        this.b.put(j, viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        a aVar = this.f1476a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.f1476a.put(viewHolder, aVar);
        }
        aVar.b = itemHolderInfo;
        aVar.f1477a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2;
        for (int size = this.f1476a.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder keyAt = this.f1476a.keyAt(size);
            a removeAt = this.f1476a.removeAt(size);
            if ((removeAt.f1477a & 3) != 3) {
                if ((removeAt.f1477a & 1) == 0) {
                    if ((removeAt.f1477a & 14) != 14) {
                        if ((removeAt.f1477a & 12) == 12) {
                            bVar.c(keyAt, removeAt.b, removeAt.c);
                        } else if ((removeAt.f1477a & 4) != 0) {
                            itemHolderInfo = removeAt.b;
                            itemHolderInfo2 = null;
                        } else if ((removeAt.f1477a & 8) == 0) {
                        }
                        a.a(removeAt);
                    }
                    bVar.b(keyAt, removeAt.b, removeAt.c);
                    a.a(removeAt);
                } else if (removeAt.b != null) {
                    itemHolderInfo = removeAt.b;
                    itemHolderInfo2 = removeAt.c;
                }
                bVar.a(keyAt, itemHolderInfo, itemHolderInfo2);
                a.a(removeAt);
            }
            bVar.a(keyAt);
            a.a(removeAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f1476a.get(viewHolder);
        return (aVar == null || (aVar.f1477a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.ItemAnimator.ItemHolderInfo b(RecyclerView.ViewHolder viewHolder) {
        return a(viewHolder, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        a aVar = this.f1476a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.f1476a.put(viewHolder, aVar);
        }
        aVar.f1477a |= 2;
        aVar.b = itemHolderInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.ItemAnimator.ItemHolderInfo c(RecyclerView.ViewHolder viewHolder) {
        return a(viewHolder, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        a aVar = this.f1476a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.f1476a.put(viewHolder, aVar);
        }
        aVar.c = itemHolderInfo;
        aVar.f1477a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f1476a.get(viewHolder);
        return (aVar == null || (aVar.f1477a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f1476a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.f1476a.put(viewHolder, aVar);
        }
        aVar.f1477a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f1476a.get(viewHolder);
        if (aVar == null) {
            return;
        }
        aVar.f1477a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(RecyclerView.ViewHolder viewHolder) {
        int size = this.b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (viewHolder == this.b.valueAt(size)) {
                this.b.removeAt(size);
                break;
            } else {
                size--;
            }
        }
        a remove = this.f1476a.remove(viewHolder);
        if (remove != null) {
            a.a(remove);
        }
    }

    public void h(RecyclerView.ViewHolder viewHolder) {
        f(viewHolder);
    }
}
