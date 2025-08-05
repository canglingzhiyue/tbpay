package com.vivo.push.f;

import com.vivo.push.cache.ClientConfigManagerImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class ai extends com.vivo.push.s {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ai(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        if (this.f24241a == null) {
            com.vivo.push.util.u.d("SendCommandTask", "SendCommandTask " + vVar + " ; mContext is Null");
        } else if (vVar == null) {
            com.vivo.push.util.u.d("SendCommandTask", "SendCommandTask pushCommand is Null");
        } else {
            com.vivo.push.model.b a2 = com.vivo.push.util.aa.a(this.f24241a, com.vivo.push.restructure.a.a().f());
            int b = vVar.b();
            if (b != 0) {
                if (b == 2009) {
                    com.vivo.push.util.u.a(ClientConfigManagerImpl.getInstance(this.f24241a).isDebug());
                    if (com.vivo.push.util.u.b()) {
                        com.vivo.push.m.a();
                        com.vivo.push.restructure.a.a().e().e();
                        com.vivo.push.util.c cVar = new com.vivo.push.util.c();
                        cVar.a(this.f24241a, "com.vivo.push_preferences.hybridapptoken_v1");
                        cVar.a();
                        com.vivo.push.util.c cVar2 = new com.vivo.push.util.c();
                        cVar2.a(this.f24241a, "com.vivo.push_preferences.appconfig_v1");
                        cVar2.a();
                        if (!com.vivo.push.m.a().f()) {
                            ClientConfigManagerImpl.getInstance(this.f24241a).clearPush();
                        }
                    }
                } else if (b != 2011) {
                    switch (b) {
                        case 2002:
                        case 2003:
                        case 2004:
                        case 2005:
                            if (a2 == null || a2.c()) {
                                com.vivo.push.m.a().a(((com.vivo.push.b.c) vVar).f(), 1005);
                                break;
                            } else {
                                com.vivo.push.b.c cVar3 = (com.vivo.push.b.c) vVar;
                                int a3 = com.vivo.push.util.y.a(cVar3);
                                if (a3 != 0) {
                                    com.vivo.push.m.a().a(cVar3.f(), a3);
                                    return;
                                }
                            }
                            break;
                    }
                } else {
                    com.vivo.push.util.u.a(ClientConfigManagerImpl.getInstance(this.f24241a).isDebug(((com.vivo.push.b.w) vVar).d()));
                }
            }
            if (a2 == null) {
                com.vivo.push.util.u.d("SendCommandTask", "SendCommandTask " + vVar + " ; pushPkgInfo is Null");
                return;
            }
            String a4 = a2.a();
            if (a2.c()) {
                try {
                    com.vivo.push.m.a().a(((com.vivo.push.b.c) vVar).f(), 1004);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                vVar = new com.vivo.push.b.e();
                com.vivo.push.util.u.d("SendCommandTask", "SendCommandTask " + vVar + " ; pkgName is InBlackList ");
            }
            com.vivo.push.a.a.a(this.f24241a, a4, vVar);
        }
    }
}
