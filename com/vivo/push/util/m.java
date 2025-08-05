package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;

/* loaded from: classes9.dex */
public final class m implements BaseNotifyLayoutAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Resources f24264a;
    private String b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.f24264a.getIdentifier("push_notify", "layout", this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        Resources resources;
        String str;
        String str2;
        if (n.d) {
            resources = this.f24264a;
            str = this.b;
            str2 = "notify_icon_rom30";
        } else if (n.c) {
            resources = this.f24264a;
            str = this.b;
            str2 = "notify_icon_rom20";
        } else {
            resources = this.f24264a;
            str = this.b;
            str2 = "notify_icon";
        }
        return resources.getIdentifier(str2, "id", str);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int i;
        try {
            i = ((Integer) ag.a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i > 0) {
            return this.f24264a.getColor(i);
        }
        if (n.d) {
            return -1;
        }
        if (!n.c) {
            return -16777216;
        }
        if (!n.d) {
            return -1;
        }
        return Color.parseColor("#ff999999");
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.b = context.getPackageName();
        this.f24264a = context.getResources();
    }
}
