package de.greenrobot.event;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    final Object f24780a;
    final j b;
    final int c;
    volatile boolean d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Object obj, j jVar, int i) {
        this.f24780a = obj;
        this.b = jVar;
        this.c = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f24780a == lVar.f24780a && this.b.equals(lVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f24780a.hashCode() + this.b.d.hashCode();
    }
}
