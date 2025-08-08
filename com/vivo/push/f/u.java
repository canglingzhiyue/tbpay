package com.vivo.push.f;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.InsideNotificationItem;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class u extends aa {

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        if (vVar == null) {
            com.vivo.push.util.u.a("OnNotificationArrivedTask", "command is null");
            return;
        }
        boolean isEnablePush = ClientConfigManagerImpl.getInstance(this.f24241a).isEnablePush();
        com.vivo.push.b.q qVar = (com.vivo.push.b.q) vVar;
        if (!com.vivo.push.util.aa.d(this.f24241a, this.f24241a.getPackageName())) {
            com.vivo.push.b.x xVar = new com.vivo.push.b.x(2101L);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("messageID", String.valueOf(qVar.f()));
            String a2 = com.vivo.push.restructure.a.a().e().a();
            if (!StringUtils.isEmpty(a2)) {
                hashMap.put("remoteAppId", a2);
            }
            xVar.a(hashMap);
            com.vivo.push.m.a().a(xVar);
            return;
        }
        com.vivo.push.m.a().a(new com.vivo.push.b.h(String.valueOf(qVar.f())));
        com.vivo.push.util.u.d("OnNotificationArrivedTask", "PushMessageReceiver " + this.f24241a.getPackageName() + " isEnablePush :" + isEnablePush);
        if (!isEnablePush) {
            com.vivo.push.b.x xVar2 = new com.vivo.push.b.x(1020L);
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("messageID", String.valueOf(qVar.f()));
            String a3 = com.vivo.push.restructure.a.a().e().a();
            if (!StringUtils.isEmpty(a3)) {
                hashMap2.put("remoteAppId", a3);
            }
            xVar2.a(hashMap2);
            com.vivo.push.m.a().a(xVar2);
        } else if (com.vivo.push.m.a().g() && !a(com.vivo.push.util.ag.c(this.f24241a), qVar.e(), qVar.g())) {
            com.vivo.push.b.x xVar3 = new com.vivo.push.b.x(1021L);
            HashMap<String, String> hashMap3 = new HashMap<>();
            hashMap3.put("messageID", String.valueOf(qVar.f()));
            String a4 = com.vivo.push.restructure.a.a().e().a();
            if (!StringUtils.isEmpty(a4)) {
                hashMap3.put("remoteAppId", a4);
            }
            xVar3.a(hashMap3);
            com.vivo.push.m.a().a(xVar3);
        } else {
            InsideNotificationItem d = qVar.d();
            if (d == null) {
                com.vivo.push.util.u.a("OnNotificationArrivedTask", "notify is null");
                Context context = this.f24241a;
                com.vivo.push.util.u.c(context, "通知内容为空，" + qVar.f());
                com.vivo.push.util.f.a(qVar.f(), 1027L);
                return;
            }
            int targetType = d.getTargetType();
            String tragetContent = d.getTragetContent();
            com.vivo.push.util.u.d("OnNotificationArrivedTask", "tragetType is " + targetType + " ; target is " + tragetContent);
            com.vivo.push.t.c(new v(this, d, qVar));
        }
    }
}
