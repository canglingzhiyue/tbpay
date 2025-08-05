package com.vivo.push.b;

/* loaded from: classes9.dex */
public final class u extends v {

    /* renamed from: a  reason: collision with root package name */
    private long f24168a;
    private int b;

    public u() {
        super(20);
        this.f24168a = -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("undo_msg_v1", this.f24168a);
        dVar.a("undo_msg_type_v1", this.b);
    }

    public final long d() {
        return this.f24168a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f24168a = dVar.b("undo_msg_v1", this.f24168a);
        this.b = dVar.b("undo_msg_type_v1", 0);
    }

    public final String e() {
        long j = this.f24168a;
        if (j != -1) {
            return String.valueOf(j);
        }
        return null;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnUndoMsgCommand";
    }
}
