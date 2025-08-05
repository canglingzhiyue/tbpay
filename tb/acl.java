package tb;

import java.util.Comparator;

/* loaded from: classes2.dex */
public class acl<T> {
    public static final int INVALID_POSITION = -1;

    /* loaded from: classes2.dex */
    public static abstract class a<T2> implements Comparator<T2>, ack {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public abstract void onChanged(int i, int i2);

        @Override // tb.ack
        public void onChanged(int i, int i2, Object obj) {
            onChanged(i, i2);
        }
    }
}
