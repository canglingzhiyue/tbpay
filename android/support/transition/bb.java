package android.support.transition;

import android.os.IBinder;

/* loaded from: classes2.dex */
class bb implements bd {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f1292a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bb(IBinder iBinder) {
        this.f1292a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof bb) && ((bb) obj).f1292a.equals(this.f1292a);
    }

    public int hashCode() {
        return this.f1292a.hashCode();
    }
}
