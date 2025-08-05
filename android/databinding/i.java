package android.databinding;

import java.util.Map;

/* loaded from: classes2.dex */
public interface i<K, V> extends Map<K, V> {

    /* loaded from: classes2.dex */
    public static abstract class a<T extends i<K, V>, K, V> {
        public abstract void onMapChanged(T t, K k);
    }

    void addOnMapChangedCallback(a<? extends i<K, V>, K, V> aVar);

    void removeOnMapChangedCallback(a<? extends i<K, V>, K, V> aVar);
}
