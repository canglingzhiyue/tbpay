package com.vivo.push.b;

/* loaded from: classes9.dex */
public class s extends com.vivo.push.v {

    /* renamed from: a  reason: collision with root package name */
    private String f24166a;
    private int b;

    public s(int i) {
        super(i);
        this.f24166a = null;
        this.b = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.v
    public void c(com.vivo.push.d dVar) {
        dVar.a("req_id", this.f24166a);
        dVar.a("status_msg_code", this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.v
    public void d(com.vivo.push.d dVar) {
        this.f24166a = dVar.a("req_id");
        this.b = dVar.b("status_msg_code", this.b);
    }

    public final String h() {
        return this.f24166a;
    }

    public final int i() {
        return this.b;
    }

    @Override // com.vivo.push.v
    public String toString() {
        return "OnReceiveCommand";
    }
}
