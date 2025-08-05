package com.xiaomi.push;

import java.util.Date;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class gp implements gt {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ go f24507a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gp(go goVar) {
        this.f24507a = goVar;
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f24507a.f431a.format(new Date()) + " Connection started (" + this.f24507a.f428a.hashCode() + riy.BRACKET_END_STR);
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, int i, Exception exc) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f24507a.f431a.format(new Date()) + " Connection closed (" + this.f24507a.f428a.hashCode() + riy.BRACKET_END_STR);
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, Exception exc) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f24507a.f431a.format(new Date()) + " Reconnection failed due to an exception (" + this.f24507a.f428a.hashCode() + riy.BRACKET_END_STR);
        exc.printStackTrace();
    }

    @Override // com.xiaomi.push.gt
    public void b(gq gqVar) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f24507a.f431a.format(new Date()) + " Connection reconnected (" + this.f24507a.f428a.hashCode() + riy.BRACKET_END_STR);
    }
}
