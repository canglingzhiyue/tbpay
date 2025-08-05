package android.databinding;

/* loaded from: classes2.dex */
public interface g {

    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract void onPropertyChanged(g gVar, int i);
    }

    void addOnPropertyChangedCallback(a aVar);

    void removeOnPropertyChangedCallback(a aVar);
}
