package com.taobao.wireless.link.widget.tjb;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.i;
import tb.kge;
import tb.kif;

/* loaded from: classes9.dex */
public class TjbWidgetReceiver extends AppWidgetProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1710171640);
    }

    public static /* synthetic */ Object ipc$super(TjbWidgetReceiver tjbWidgetReceiver, String str, Object... objArr) {
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
            kif.a("TjbWidgetReceiver.onReceive error: " + th.getMessage());
        }
    }
}
