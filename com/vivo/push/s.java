package com.vivo.push;

import android.content.Context;
import tb.riy;

/* loaded from: classes9.dex */
public abstract class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected Context f24241a;
    private int b;
    private v c;

    public s(v vVar) {
        this.b = -1;
        this.c = vVar;
        this.b = vVar.b();
        if (this.b >= 0) {
            this.f24241a = m.a().h();
            return;
        }
        throw new IllegalArgumentException("PushTask need a > 0 task id.");
    }

    public final int a() {
        return this.b;
    }

    protected abstract void a(v vVar);

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f24241a;
        if (context != null && !(this.c instanceof com.vivo.push.b.n)) {
            com.vivo.push.util.u.a(context, "[执行指令]" + this.c);
        }
        a(this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(riy.BLOCK_START_STR);
        v vVar = this.c;
        sb.append(vVar == null ? "[null]" : vVar.toString());
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }
}
