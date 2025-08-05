package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ih;
import com.xiaomi.push.service.az;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class f implements AbstractPushManager {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f24324a;

    /* renamed from: a  reason: collision with other field name */
    private Context f73a;

    /* renamed from: a  reason: collision with other field name */
    private PushConfiguration f74a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f76a = false;

    /* renamed from: a  reason: collision with other field name */
    private Map<e, AbstractPushManager> f75a = new HashMap();

    private f(Context context) {
        this.f73a = context.getApplicationContext();
    }

    public static f a(Context context) {
        if (f24324a == null) {
            synchronized (f.class) {
                if (f24324a == null) {
                    f24324a = new f(context);
                }
            }
        }
        return f24324a;
    }

    private void a() {
        AbstractPushManager a2;
        AbstractPushManager a3;
        AbstractPushManager a4;
        AbstractPushManager a5;
        PushConfiguration pushConfiguration = this.f74a;
        if (pushConfiguration != null) {
            if (pushConfiguration.getOpenHmsPush()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ASSEMBLE_PUSH : ");
                sb.append(" HW user switch : " + this.f74a.getOpenHmsPush() + " HW online switch : " + i.m1689a(this.f73a, e.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + n.m1693a(this.f73a));
                com.xiaomi.channel.commonutils.logger.b.m1616a(sb.toString());
            }
            if (this.f74a.getOpenHmsPush() && i.m1689a(this.f73a, e.ASSEMBLE_PUSH_HUAWEI) && n.m1693a(this.f73a)) {
                if (!m1683a(e.ASSEMBLE_PUSH_HUAWEI)) {
                    a(e.ASSEMBLE_PUSH_HUAWEI, ak.a(this.f73a, e.ASSEMBLE_PUSH_HUAWEI));
                }
                com.xiaomi.channel.commonutils.logger.b.c("hw manager add to list");
            } else if (m1683a(e.ASSEMBLE_PUSH_HUAWEI) && (a2 = a(e.ASSEMBLE_PUSH_HUAWEI)) != null) {
                m1682a(e.ASSEMBLE_PUSH_HUAWEI);
                a2.unregister();
            }
            if (this.f74a.getOpenFCMPush()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ASSEMBLE_PUSH : ");
                sb2.append(" FCM user switch : " + this.f74a.getOpenFCMPush() + " FCM online switch : " + i.m1689a(this.f73a, e.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + n.b(this.f73a));
                com.xiaomi.channel.commonutils.logger.b.m1616a(sb2.toString());
            }
            if (this.f74a.getOpenFCMPush() && i.m1689a(this.f73a, e.ASSEMBLE_PUSH_FCM) && n.b(this.f73a)) {
                if (!m1683a(e.ASSEMBLE_PUSH_FCM)) {
                    a(e.ASSEMBLE_PUSH_FCM, ak.a(this.f73a, e.ASSEMBLE_PUSH_FCM));
                }
                com.xiaomi.channel.commonutils.logger.b.c("fcm manager add to list");
            } else if (m1683a(e.ASSEMBLE_PUSH_FCM) && (a3 = a(e.ASSEMBLE_PUSH_FCM)) != null) {
                m1682a(e.ASSEMBLE_PUSH_FCM);
                a3.unregister();
            }
            if (this.f74a.getOpenCOSPush()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ASSEMBLE_PUSH : ");
                sb3.append(" COS user switch : " + this.f74a.getOpenCOSPush() + " COS online switch : " + i.m1689a(this.f73a, e.ASSEMBLE_PUSH_COS) + " COS isSupport : " + n.c(this.f73a));
                com.xiaomi.channel.commonutils.logger.b.m1616a(sb3.toString());
            }
            if (this.f74a.getOpenCOSPush() && i.m1689a(this.f73a, e.ASSEMBLE_PUSH_COS) && n.c(this.f73a)) {
                a(e.ASSEMBLE_PUSH_COS, ak.a(this.f73a, e.ASSEMBLE_PUSH_COS));
            } else if (m1683a(e.ASSEMBLE_PUSH_COS) && (a4 = a(e.ASSEMBLE_PUSH_COS)) != null) {
                m1682a(e.ASSEMBLE_PUSH_COS);
                a4.unregister();
            }
            if (this.f74a.getOpenFTOSPush() && i.m1689a(this.f73a, e.ASSEMBLE_PUSH_FTOS) && n.d(this.f73a)) {
                a(e.ASSEMBLE_PUSH_FTOS, ak.a(this.f73a, e.ASSEMBLE_PUSH_FTOS));
            } else if (!m1683a(e.ASSEMBLE_PUSH_FTOS) || (a5 = a(e.ASSEMBLE_PUSH_FTOS)) == null) {
            } else {
                m1682a(e.ASSEMBLE_PUSH_FTOS);
                a5.unregister();
            }
        }
    }

    public AbstractPushManager a(e eVar) {
        return this.f75a.get(eVar);
    }

    public void a(PushConfiguration pushConfiguration) {
        this.f74a = pushConfiguration;
        this.f76a = az.a(this.f73a).a(ih.AggregatePushSwitch.a(), true);
        if (this.f74a.getOpenHmsPush() || this.f74a.getOpenFCMPush() || this.f74a.getOpenCOSPush() || this.f74a.getOpenFTOSPush()) {
            az.a(this.f73a).a(new g(this, 101, "assemblePush"));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1682a(e eVar) {
        this.f75a.remove(eVar);
    }

    public void a(e eVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f75a.containsKey(eVar)) {
                this.f75a.remove(eVar);
            }
            this.f75a.put(eVar, abstractPushManager);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1683a(e eVar) {
        return this.f75a.containsKey(eVar);
    }

    public boolean b(e eVar) {
        int i = h.f24326a[eVar.ordinal()];
        boolean z = false;
        if (i == 1) {
            PushConfiguration pushConfiguration = this.f74a;
            if (pushConfiguration == null) {
                return false;
            }
            return pushConfiguration.getOpenHmsPush();
        } else if (i == 2) {
            PushConfiguration pushConfiguration2 = this.f74a;
            if (pushConfiguration2 == null) {
                return false;
            }
            return pushConfiguration2.getOpenFCMPush();
        } else {
            if (i == 3) {
                PushConfiguration pushConfiguration3 = this.f74a;
                if (pushConfiguration3 != null) {
                    z = pushConfiguration3.getOpenCOSPush();
                }
            } else if (i != 4) {
                return false;
            }
            PushConfiguration pushConfiguration4 = this.f74a;
            return pushConfiguration4 != null ? pushConfiguration4.getOpenFTOSPush() : z;
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void register() {
        com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : assemble push register");
        if (this.f75a.size() <= 0) {
            a();
        }
        if (this.f75a.size() > 0) {
            for (AbstractPushManager abstractPushManager : this.f75a.values()) {
                if (abstractPushManager != null) {
                    abstractPushManager.register();
                }
            }
            i.m1685a(this.f73a);
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void unregister() {
        com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager abstractPushManager : this.f75a.values()) {
            if (abstractPushManager != null) {
                abstractPushManager.unregister();
            }
        }
        this.f75a.clear();
    }
}
