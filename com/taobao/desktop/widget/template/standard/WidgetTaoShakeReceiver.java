package com.taobao.desktop.widget.template.standard;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.i;
import tb.kge;
import tb.kif;

/* loaded from: classes7.dex */
public class WidgetTaoShakeReceiver extends AppWidgetProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1949550855);
    }

    public static /* synthetic */ Object ipc$super(WidgetTaoShakeReceiver widgetTaoShakeReceiver, String str, Object... objArr) {
        if (str.hashCode() == 1006950490) {
            super.onReceive((Context) objArr[0], (Intent) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            super.onReceive(context, intent);
            i.a(context).a(getClass().getName(), intent);
        } catch (Throwable th) {
            Class<?> cls = getClass();
            kif.a(cls, "onReceive error: " + th.getMessage());
        }
    }
}
