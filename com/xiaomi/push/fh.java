package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class fh extends ff {

    /* renamed from: a  reason: collision with root package name */
    private int f24471a;

    /* renamed from: a  reason: collision with other field name */
    protected Bitmap f345a;

    /* renamed from: a  reason: collision with other field name */
    private RemoteViews f346a;

    /* renamed from: a  reason: collision with other field name */
    protected CharSequence f347a;

    /* renamed from: a  reason: collision with other field name */
    private String f348a;

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<Notification.Action> f349a;

    /* renamed from: a  reason: collision with other field name */
    protected Map<String, String> f350a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f351a;
    private int b;

    /* renamed from: b  reason: collision with other field name */
    protected CharSequence f352b;

    /* renamed from: b  reason: collision with other field name */
    private boolean f353b;

    public fh(Context context, int i, String str) {
        super(context);
        this.f349a = new ArrayList<>();
        this.b = 0;
        this.f348a = str;
        this.f24471a = i;
        m1926c();
    }

    public fh(Context context, String str) {
        this(context, 0, str);
    }

    private Bitmap a() {
        return com.xiaomi.push.service.al.a(g.m1945a(a(), this.f348a));
    }

    private String c() {
        this.f353b = e();
        return this.f353b ? b() : mo1930a();
    }

    /* renamed from: c  reason: collision with other method in class */
    private void m1926c() {
        int a2 = a(a().getResources(), c(), "layout", a().getPackageName());
        if (a2 == 0) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("create RemoteViews failed, no such layout resource was found");
            return;
        }
        this.f346a = new RemoteViews(a().getPackageName(), a2);
        this.f351a = mo1930a();
    }

    /* renamed from: c  reason: collision with other method in class */
    private boolean m1927c() {
        Map<String, String> map = this.f350a;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    private void d() {
        super.setContentTitle(this.f347a);
        super.setContentText(this.f352b);
    }

    /* renamed from: d  reason: collision with other method in class */
    private boolean m1928d() {
        return !StringUtils.isEmpty(b()) && !StringUtils.isEmpty(this.f348a);
    }

    private boolean e() {
        return m1928d() && f();
    }

    private boolean f() {
        List<StatusBarNotification> m2297b;
        if (Build.VERSION.SDK_INT >= 20 && (m2297b = com.xiaomi.push.service.aw.a(a(), this.f348a).m2297b()) != null && !m2297b.isEmpty()) {
            Iterator<StatusBarNotification> it = m2297b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StatusBarNotification next = it.next();
                if (next.getId() == this.f24471a) {
                    Notification notification = next.getNotification();
                    if (notification != null && !notification.extras.getBoolean("mipush.customCopyLayout", true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(float f) {
        return (int) ((f * a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bitmap a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public final RemoteViews mo1930a() {
        return this.f346a;
    }

    @Override // com.xiaomi.push.ff
    public ff a(Map<String, String> map) {
        this.f350a = map;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public fh addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public fh addAction(Notification.Action action) {
        if (action != null) {
            this.f349a.add(action);
        }
        int i = this.b;
        this.b = i + 1;
        a(i, action);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public fh setLargeIcon(Bitmap bitmap) {
        this.f345a = bitmap;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public fh setContentTitle(CharSequence charSequence) {
        this.f347a = charSequence;
        return this;
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a  reason: collision with other method in class */
    protected abstract String mo1930a();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.push.ff
    /* renamed from: a */
    public void mo1930a() {
        super.a();
        Bundle bundle = new Bundle();
        if (m1928d()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f353b);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", a("large_icon"));
        if (this.f349a.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f349a.size()];
            this.f349a.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m1927c() || !com.xiaomi.push.service.ax.m2299a(a().getContentResolver())) {
            d();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f347a);
            bundle.putCharSequence("mipush.customContent", this.f352b);
        }
        addExtras(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        Bitmap a2 = a();
        if (a2 != null) {
            mo1930a().setImageViewBitmap(i, a2);
            return;
        }
        int b = g.b(a(), this.f348a);
        if (b == 0) {
            return;
        }
        mo1930a().setImageViewResource(i, b);
    }

    protected void a(int i, Notification.Action action) {
    }

    @Override // com.xiaomi.push.ff
    /* renamed from: a  reason: collision with other method in class */
    protected abstract boolean mo1930a();

    /* renamed from: a  reason: collision with other method in class */
    protected final boolean m1931a(int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 192.0d;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: b */
    public fh setContentText(CharSequence charSequence) {
        this.f352b = charSequence;
        return this;
    }

    protected abstract String b();

    /* renamed from: b  reason: collision with other method in class */
    protected final void m1932b() {
        super.setContentTitle(this.f347a);
        super.setContentText(this.f352b);
        Bitmap bitmap = this.f345a;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    protected final boolean m1933b() {
        return this.f351a;
    }
}
