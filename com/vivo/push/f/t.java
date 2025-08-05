package com.vivo.push.f;

import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.UnvarnishedMessage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class t extends aa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.b.o oVar = (com.vivo.push.b.o) vVar;
        com.vivo.push.m.a().a(new com.vivo.push.b.h(String.valueOf(oVar.f())));
        if (!ClientConfigManagerImpl.getInstance(this.f24241a).isEnablePush()) {
            com.vivo.push.util.u.d("OnMessageTask", "command  " + vVar + " is ignore by disable push ");
            super.a(1020);
        } else if (com.vivo.push.m.a().g() && !a(com.vivo.push.util.ag.c(this.f24241a), oVar.d(), oVar.g())) {
            super.a(1021);
        } else {
            UnvarnishedMessage e = oVar.e();
            if (e == null) {
                super.a(2807);
                com.vivo.push.util.u.a("OnMessageTask", " message is null");
                return;
            }
            int targetType = e.getTargetType();
            long msgId = e.getMsgId();
            com.vivo.push.util.u.d("OnMessageTask", "tragetType is " + targetType + " ; messageId is " + msgId);
            this.b.onTransmissionMessage(this.f24241a, e);
            super.a(0);
        }
    }
}
