package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.b;

/* loaded from: classes9.dex */
public class ZukHomeBadger implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f24996a = Uri.parse("content://com.android.badge/badge");

    @Override // me.leolin.shortcutbadger.b
    public List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // me.leolin.shortcutbadger.b
    public void a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f24996a, "setAppBadgeCount", (String) null, bundle);
    }
}
