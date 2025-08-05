package android.databinding;

import java.util.List;

/* loaded from: classes2.dex */
public interface ObservableList<T> extends List<T> {

    /* loaded from: classes2.dex */
    public static abstract class a<T extends ObservableList> {
        public abstract void onChanged(T t);

        public abstract void onItemRangeChanged(T t, int i, int i2);

        public abstract void onItemRangeInserted(T t, int i, int i2);

        public abstract void onItemRangeMoved(T t, int i, int i2, int i3);

        public abstract void onItemRangeRemoved(T t, int i, int i2);
    }

    void addOnListChangedCallback(a<? extends ObservableList<T>> aVar);

    void removeOnListChangedCallback(a<? extends ObservableList<T>> aVar);
}
