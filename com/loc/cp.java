package com.loc;

import android.content.Context;

/* loaded from: classes4.dex */
public final class cp extends co {

    /* renamed from: a  reason: collision with root package name */
    private Context f7726a;
    private boolean b;

    public cp(Context context) {
        this.b = false;
        this.f7726a = context;
        this.b = false;
    }

    @Override // com.loc.co
    protected final boolean a() {
        return o.j(this.f7726a) == 1 || this.b;
    }
}
