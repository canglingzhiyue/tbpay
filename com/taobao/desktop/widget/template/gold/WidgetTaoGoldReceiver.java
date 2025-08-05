package com.taobao.desktop.widget.template.gold;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.i;
import tb.kge;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class WidgetTaoGoldReceiver extends AppWidgetProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1237741422);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            i.a(context).a(getClass().getName(), intent);
            kih.a("widget_miui_gold_receiver", intent.getAction(), "", null);
        } catch (Throwable th) {
            kif.a("WidgetTaoGoldReceiver.onReceive error: " + th.getMessage());
        }
    }
}
