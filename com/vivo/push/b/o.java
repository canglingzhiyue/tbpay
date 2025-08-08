package com.vivo.push.b;

import mtopsdk.common.util.StringUtils;
import com.vivo.push.model.UnvarnishedMessage;

/* loaded from: classes9.dex */
public final class o extends v {

    /* renamed from: a  reason: collision with root package name */
    protected UnvarnishedMessage f24163a;

    public o() {
        super(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("msg_v1", this.f24163a.unpackToJson());
    }

    public final String d() {
        UnvarnishedMessage unvarnishedMessage = this.f24163a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        String a2 = dVar.a("msg_v1");
        if (!StringUtils.isEmpty(a2)) {
            this.f24163a = new UnvarnishedMessage(a2);
            this.f24163a.setMsgId(f());
        }
    }

    public final UnvarnishedMessage e() {
        return this.f24163a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnMessageCommand";
    }
}
