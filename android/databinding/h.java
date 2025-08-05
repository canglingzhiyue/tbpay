package android.databinding;

import android.databinding.i;
import android.support.v4.util.ArrayMap;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class h<K, V> extends ArrayMap<K, V> implements i<K, V> {
    private transient f mListeners;

    private void notifyChange(Object obj) {
        f fVar = this.mListeners;
        if (fVar != null) {
            fVar.a(this, 0, obj);
        }
    }

    @Override // android.databinding.i
    public void addOnMapChangedCallback(i.a<? extends i<K, V>, K, V> aVar) {
        if (this.mListeners == null) {
            this.mListeners = new f();
        }
        this.mListeners.a((f) aVar);
    }

    @Override // android.support.v4.util.SimpleArrayMap, java.util.Map
    public void clear() {
        if (!isEmpty()) {
            super.clear();
            notifyChange(null);
        }
    }

    @Override // android.support.v4.util.SimpleArrayMap, java.util.Map
    public V put(K k, V v) {
        super.put(k, v);
        notifyChange(k);
        return v;
    }

    @Override // android.support.v4.util.ArrayMap
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int indexOfKey = indexOfKey(it.next());
            if (indexOfKey >= 0) {
                z = true;
                removeAt(indexOfKey);
            }
        }
        return z;
    }

    @Override // android.support.v4.util.SimpleArrayMap
    public V removeAt(int i) {
        K keyAt = keyAt(i);
        V v = (V) super.removeAt(i);
        if (v != null) {
            notifyChange(keyAt);
        }
        return v;
    }

    @Override // android.databinding.i
    public void removeOnMapChangedCallback(i.a<? extends i<K, V>, K, V> aVar) {
        f fVar = this.mListeners;
        if (fVar != null) {
            fVar.b((f) aVar);
        }
    }

    @Override // android.support.v4.util.ArrayMap
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(keyAt(size))) {
                removeAt(size);
                z = true;
            }
        }
        return z;
    }

    @Override // android.support.v4.util.SimpleArrayMap
    public V setValueAt(int i, V v) {
        K keyAt = keyAt(i);
        V v2 = (V) super.setValueAt(i, v);
        notifyChange(keyAt);
        return v2;
    }
}
