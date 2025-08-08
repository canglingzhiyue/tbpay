package com.xiaomi.push;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* loaded from: classes9.dex */
public class ff extends Notification.Builder {

    /* renamed from: a  reason: collision with root package name */
    private Context f24469a;

    public ff(Context context) {
        super(context);
        this.f24469a = context;
    }

    public int a(Resources resources, String str, String str2, String str3) {
        if (!StringUtils.isEmpty(str)) {
            return resources.getIdentifier(str, str2, str3);
        }
        return 0;
    }

    public final int a(String str) {
        return a(mo1930a().getResources(), str, "id", mo1930a().getPackageName());
    }

    /* renamed from: a */
    protected Context mo1930a() {
        return this.f24469a;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public ff addExtras(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 20) {
            super.addExtras(bundle);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public ff setCustomContentView(RemoteViews remoteViews) {
        if (Build.VERSION.SDK_INT >= 24) {
            super.setCustomContentView(remoteViews);
        } else {
            super.setContent(remoteViews);
        }
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ff m1924a(String str) {
        if (!StringUtils.isEmpty(str)) {
            try {
                bh.a((Object) this, "setColor", Integer.valueOf(Color.parseColor(str)));
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to set color. " + e);
            }
        }
        return this;
    }

    public ff a(Map<String, String> map) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        a();
        return super.build();
    }
}
