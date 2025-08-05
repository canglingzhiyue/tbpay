package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ah;

/* loaded from: classes9.dex */
public class bn extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f24379a;

    public bn(Context context) {
        this.f24379a = context;
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.f24379a).m1626a().isEventUploadSwitchOpen();
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a  reason: collision with other method in class */
    public String mo1839a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!a()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.c(this.f24379a.getPackageName() + " begin upload event");
            com.xiaomi.clientreport.manager.a.a(this.f24379a).m1628b();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }
}
