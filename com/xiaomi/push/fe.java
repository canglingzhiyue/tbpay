package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;

/* loaded from: classes9.dex */
public class fe extends fh {

    /* renamed from: a  reason: collision with root package name */
    private int f24468a;
    private Bitmap b;
    private Bitmap c;

    public fe(Context context, String str) {
        super(context, str);
        this.f24468a = 16777216;
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    public fe mo1922a(Bitmap bitmap) {
        if (b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || 184 > bitmap.getHeight() || bitmap.getHeight() > 1678) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            } else {
                this.b = bitmap;
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.ff
    public fe a(String str) {
        if (b() && !StringUtils.isEmpty(str)) {
            try {
                this.f24468a = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh, android.app.Notification.Builder
    /* renamed from: a  reason: collision with other method in class */
    public fh setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    protected String mo1930a() {
        return "notification_banner";
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a  reason: collision with other method in class */
    public void mo1930a() {
        RemoteViews a2;
        Bitmap bitmap;
        if (!b() || this.b == null) {
            b();
            return;
        }
        super.mo1930a();
        Resources resources = mo1930a().getResources();
        String packageName = mo1930a().getPackageName();
        int a3 = a(resources, "bg", "id", packageName);
        if (j.a(mo1930a()) >= 10) {
            a2 = mo1930a();
            bitmap = a(this.b, 30.0f);
        } else {
            a2 = mo1930a();
            bitmap = this.b;
        }
        a2.setImageViewBitmap(a3, bitmap);
        int a4 = a(resources, "icon", "id", packageName);
        if (this.c != null) {
            mo1930a().setImageViewBitmap(a4, this.c);
        } else {
            a(a4);
        }
        int a5 = a(resources, "title", "id", packageName);
        mo1930a().setTextViewText(a5, this.f347a);
        if (this.f350a != null && this.f24468a == 16777216) {
            a(this.f350a.get("notification_image_text_color"));
        }
        RemoteViews a6 = mo1930a();
        int i = this.f24468a;
        a6.setTextColor(a5, (i == 16777216 || !a(i)) ? -1 : -16777216);
        setCustomContentView(mo1930a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    protected boolean mo1930a() {
        if (!j.m2117a()) {
            return false;
        }
        Resources resources = mo1930a().getResources();
        String packageName = mo1930a().getPackageName();
        return (a(mo1930a().getResources(), "bg", "id", mo1930a().getPackageName()) == 0 || a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || j.a(mo1930a()) < 9) ? false : true;
    }

    public fe b(Bitmap bitmap) {
        if (b() && bitmap != null) {
            this.c = bitmap;
        }
        return this;
    }

    @Override // com.xiaomi.push.fh
    protected String b() {
        return null;
    }
}
