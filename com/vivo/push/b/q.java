package com.vivo.push.b;

import mtopsdk.common.util.StringUtils;
import com.vivo.push.model.InsideNotificationItem;

/* loaded from: classes9.dex */
public final class q extends v {

    /* renamed from: a  reason: collision with root package name */
    protected InsideNotificationItem f24165a;
    private String b;

    public q() {
        super(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        this.b = com.vivo.push.util.v.b(this.f24165a);
        dVar.a("notification_v1", this.b);
    }

    public final InsideNotificationItem d() {
        return this.f24165a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.b = dVar.a("notification_v1");
        if (!StringUtils.isEmpty(this.b)) {
            this.f24165a = com.vivo.push.util.v.a(this.b);
            InsideNotificationItem insideNotificationItem = this.f24165a;
            if (insideNotificationItem == null) {
                return;
            }
            insideNotificationItem.setMsgId(f());
        }
    }

    public final String e() {
        if (StringUtils.isEmpty(this.b)) {
            InsideNotificationItem insideNotificationItem = this.f24165a;
            if (insideNotificationItem != null) {
                return com.vivo.push.util.v.b(insideNotificationItem);
            }
            return null;
        }
        return this.b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnNotifyArrivedCommand";
    }
}
