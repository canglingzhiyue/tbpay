package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import tb.crd;

/* loaded from: classes9.dex */
public class fg extends fh {

    /* renamed from: a  reason: collision with root package name */
    private int f24470a;

    /* renamed from: a  reason: collision with other field name */
    private PendingIntent f342a;
    private int b;

    /* renamed from: b  reason: collision with other field name */
    private Bitmap f343b;
    private int c;

    /* renamed from: c  reason: collision with other field name */
    private CharSequence f344c;

    public fg(Context context, int i, String str) {
        super(context, i, str);
        this.f24470a = 16777216;
        this.b = 16777216;
        this.c = 16777216;
    }

    private Drawable a(int i, int i2, int i3, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }

    private void a(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int a2 = a(6.0f);
        remoteViews.setViewPadding(i, a2, 0, a2, 0);
        int i4 = z ? -1 : -16777216;
        remoteViews.setTextColor(i2, i4);
        remoteViews.setTextColor(i3, i4);
    }

    @Override // com.xiaomi.push.fh
    /* renamed from: a */
    public fg mo1922a(Bitmap bitmap) {
        if (b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || bitmap.getHeight() < 177 || bitmap.getHeight() > 207) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("colorful notification bg image resolution error, must [984*177, 984*207]");
            } else {
                this.f343b = bitmap;
            }
        }
        return this;
    }

    public fg a(CharSequence charSequence, PendingIntent pendingIntent) {
        if (b()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f344c = charSequence;
            this.f342a = pendingIntent;
        }
        return this;
    }

    @Override // com.xiaomi.push.ff
    public fg a(String str) {
        if (b() && !StringUtils.isEmpty(str)) {
            try {
                this.b = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    protected String mo1930a() {
        return "notification_colorful";
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a  reason: collision with other method in class */
    public void mo1930a() {
        RemoteViews a2;
        Bitmap bitmap;
        boolean z;
        RemoteViews a3;
        RemoteViews a4;
        Drawable a5;
        if (!b()) {
            b();
            return;
        }
        super.mo1930a();
        Resources resources = mo1930a().getResources();
        String packageName = mo1930a().getPackageName();
        int a6 = a(resources, "icon", "id", packageName);
        if (this.f345a == null) {
            a(a6);
        } else {
            mo1930a().setImageViewBitmap(a6, this.f345a);
        }
        int a7 = a(resources, "title", "id", packageName);
        int a8 = a(resources, "content", "id", packageName);
        mo1930a().setTextViewText(a7, this.f347a);
        mo1930a().setTextViewText(a8, this.f352b);
        if (!StringUtils.isEmpty(this.f344c)) {
            int a9 = a(resources, "buttonContainer", "id", packageName);
            int a10 = a(resources, com.taobao.android.weex_framework.util.a.ATOM_EXT_button, "id", packageName);
            int a11 = a(resources, "buttonBg", "id", packageName);
            mo1930a().setViewVisibility(a9, 0);
            mo1930a().setTextViewText(a10, this.f344c);
            mo1930a().setOnClickPendingIntent(a9, this.f342a);
            if (this.b != 16777216) {
                int a12 = a(70.0f);
                int a13 = a(29.0f);
                mo1930a().setImageViewBitmap(a11, com.xiaomi.push.service.al.a(a(this.b, a12, a13, a13 / 2.0f)));
                mo1930a().setTextColor(a10, a(this.b) ? -1 : -16777216);
            }
        }
        int a14 = a(resources, "bg", "id", packageName);
        int a15 = a(resources, "container", "id", packageName);
        if (this.f24470a != 16777216) {
            if (j.a(mo1930a()) >= 10) {
                a4 = mo1930a();
                a5 = a(this.f24470a, 984, crd.DETECT_WIDTH, 30.0f);
            } else {
                a4 = mo1930a();
                a5 = a(this.f24470a, 984, crd.DETECT_WIDTH, 0.0f);
            }
            a4.setImageViewBitmap(a14, com.xiaomi.push.service.al.a(a5));
            a3 = mo1930a();
            z = a(this.f24470a);
        } else if (this.f343b == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                mo1930a().setViewVisibility(a6, 8);
                mo1930a().setViewVisibility(a14, 8);
                try {
                    bh.a((Object) this, "setStyle", r.a(mo1930a(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception unused) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("load class DecoratedCustomViewStyle failed");
                }
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("miui.customHeight", true);
            addExtras(bundle);
            setCustomContentView(mo1930a());
        } else {
            if (j.a(mo1930a()) >= 10) {
                a2 = mo1930a();
                bitmap = a(this.f343b, 30.0f);
            } else {
                a2 = mo1930a();
                bitmap = this.f343b;
            }
            a2.setImageViewBitmap(a14, bitmap);
            if (this.f350a != null && this.c == 16777216) {
                c(this.f350a.get("notification_image_text_color"));
            }
            int i = this.c;
            z = i == 16777216 || !a(i);
            a3 = mo1930a();
        }
        a(a3, a15, a7, a8, z);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("miui.customHeight", true);
        addExtras(bundle2);
        setCustomContentView(mo1930a());
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    protected boolean mo1930a() {
        if (!j.m2117a()) {
            return false;
        }
        Resources resources = mo1930a().getResources();
        String packageName = mo1930a().getPackageName();
        return (a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || a(resources, "content", "id", packageName) == 0) ? false : true;
    }

    public fg b(String str) {
        if (b() && !StringUtils.isEmpty(str)) {
            try {
                this.f24470a = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("parse colorful notification bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fh
    protected String b() {
        return "notification_colorful_copy";
    }

    public fg c(String str) {
        if (b() && !StringUtils.isEmpty(str)) {
            try {
                this.c = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("parse colorful notification image text color error");
            }
        }
        return this;
    }
}
