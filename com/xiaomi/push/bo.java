package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ah;

/* loaded from: classes9.dex */
public class bo extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f24380a;

    public bo(Context context) {
        this.f24380a = context;
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.f24380a).m1626a().isPerfUploadSwitchOpen();
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!a()) {
                return;
            }
            com.xiaomi.clientreport.manager.a.a(this.f24380a).c();
            com.xiaomi.channel.commonutils.logger.b.c(this.f24380a.getPackageName() + " perf begin upload");
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("fail to send perf data. " + e);
        }
    }
}
