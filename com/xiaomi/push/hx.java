package com.xiaomi.push;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* loaded from: classes9.dex */
public class hx implements XMPushService.n {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24537a = false;

    /* renamed from: a  reason: collision with other field name */
    private int f492a;

    /* renamed from: a  reason: collision with other field name */
    private Context f493a;
    private boolean b;

    public hx(Context context) {
        this.f493a = context;
    }

    private String a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f493a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    private void a(Context context) {
        this.b = com.xiaomi.push.service.az.a(context).a(ih.TinyDataUploadSwitch.a(), true);
        this.f492a = com.xiaomi.push.service.az.a(context).a(ih.TinyDataUploadFrequency.a(), 7200);
        this.f492a = Math.max(60, this.f492a);
    }

    public static void a(boolean z) {
        f24537a = z;
    }

    private boolean a() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f493a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.f492a);
    }

    private boolean a(ib ibVar) {
        if (bg.b(this.f493a) && ibVar != null && !StringUtils.isEmpty(a(this.f493a.getPackageName())) && new File(this.f493a.getFilesDir(), "tiny_data.data").exists() && !f24537a) {
            return !com.xiaomi.push.service.az.a(this.f493a).a(ih.ScreenOnOrChargingTinyDataUploadSwitch.a(), false) || i.m2027a(this.f493a) || i.m2030b(this.f493a);
        }
        return false;
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* renamed from: a  reason: collision with other method in class */
    public void mo2024a() {
        a(this.f493a);
        if (!this.b || !a()) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
        ib a2 = ia.a(this.f493a).a();
        if (a(a2)) {
            f24537a = true;
            hy.a(this.f493a, a2);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
    }
}
