package android.databinding;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableField<T> extends c implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField() {
    }

    public ObservableField(T t) {
        this.mValue = t;
    }

    public T get() {
        return this.mValue;
    }

    public void set(T t) {
        if (t != this.mValue) {
            this.mValue = t;
            notifyChange();
        }
    }
}
