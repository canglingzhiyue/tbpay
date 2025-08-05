package com.vivo.push.b;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class m extends s {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f24161a;

    public m() {
        super(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("tags_list", this.f24161a);
    }

    public final ArrayList<String> d() {
        return this.f24161a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f24161a = dVar.c("tags_list");
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnListTagCommand";
    }
}
