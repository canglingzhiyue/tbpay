package android.databinding;

import android.databinding.g;

/* loaded from: classes2.dex */
public class c implements g {
    private transient j mCallbacks;

    @Override // android.databinding.g
    public synchronized void addOnPropertyChangedCallback(g.a aVar) {
        if (this.mCallbacks == null) {
            this.mCallbacks = new j();
        }
        this.mCallbacks.a((j) aVar);
    }

    public synchronized void notifyChange() {
        if (this.mCallbacks != null) {
            this.mCallbacks.a(this, 0, null);
        }
    }

    public void notifyPropertyChanged(int i) {
        j jVar = this.mCallbacks;
        if (jVar != null) {
            jVar.a(this, i, null);
        }
    }

    @Override // android.databinding.g
    public synchronized void removeOnPropertyChangedCallback(g.a aVar) {
        if (this.mCallbacks != null) {
            this.mCallbacks.b((j) aVar);
        }
    }
}
