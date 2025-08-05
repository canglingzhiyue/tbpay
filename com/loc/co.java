package com.loc;

/* loaded from: classes4.dex */
public abstract class co {
    co c;

    public co() {
    }

    public co(co coVar) {
        this.c = coVar;
    }

    public void a(int i) {
        co coVar = this.c;
        if (coVar != null) {
            coVar.a(i);
        }
    }

    public void a(boolean z) {
        co coVar = this.c;
        if (coVar != null) {
            coVar.a(z);
        }
    }

    protected abstract boolean a();

    public int b() {
        co coVar = this.c;
        return Math.min(Integer.MAX_VALUE, coVar != null ? coVar.b() : Integer.MAX_VALUE);
    }

    public final boolean c() {
        co coVar = this.c;
        if (!(coVar != null ? coVar.c() : true)) {
            return false;
        }
        return a();
    }
}
