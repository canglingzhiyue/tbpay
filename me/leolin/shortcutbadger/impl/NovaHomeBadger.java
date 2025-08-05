package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.b;

/* loaded from: classes9.dex */
public class NovaHomeBadger implements b {
    @Override // me.leolin.shortcutbadger.b
    public List<String> a() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }

    @Override // me.leolin.shortcutbadger.b
    public void a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
