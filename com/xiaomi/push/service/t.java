package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.ic;
import com.xiaomi.push.ip;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
class t extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f24725a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1026a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ List f1027a;
    final /* synthetic */ String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, int i, String str, List list, String str2) {
        super(i);
        this.f24725a = sVar;
        this.f1026a = str;
        this.f1027a = list;
        this.b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "Send tiny data.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        String a2;
        XMPushService xMPushService;
        a2 = this.f24725a.a(this.f1026a);
        ArrayList<jb> a3 = ca.a(this.f1027a, this.f1026a, a2, 32768);
        if (a3 == null) {
            com.xiaomi.channel.commonutils.logger.b.d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
            return;
        }
        Iterator<jb> it = a3.iterator();
        while (it.hasNext()) {
            jb next = it.next();
            next.a("uploadWay", "longXMPushService");
            iy a4 = ai.a(this.f1026a, a2, next, ic.Notification);
            if (!TextUtils.isEmpty(this.b) && !TextUtils.equals(this.f1026a, this.b)) {
                if (a4.m2102a() == null) {
                    ip ipVar = new ip();
                    ipVar.a("-1");
                    a4.a(ipVar);
                }
                a4.m2102a().b("ext_traffic_source_pkg", this.b);
            }
            byte[] a5 = jm.a(a4);
            xMPushService = this.f24725a.f24724a;
            xMPushService.a(this.f1026a, a5, true);
        }
    }
}
