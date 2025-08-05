package com.taobao.desktop.widget.template.combine;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.c;
import java.util.List;
import tb.kge;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class b extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(944363378);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(Context context) {
        this.f16976a = context;
    }

    public void a(List<Integer> list, WidgetCombineData widgetCombineData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96eb1fe3", new Object[]{this, list, widgetCombineData});
        } else if (widgetCombineData == null) {
        } else {
            try {
                a(widgetCombineData, list, widgetCombineData.getNextRefreshTime());
            } catch (Exception e) {
                Class<?> cls = getClass();
                kif.a(cls, "notifyDataUpdate error" + e.getMessage());
                kih.a("widget_catch_error", "WidgetCombineReceiver.notifyDataUpdate", e.getMessage(), null);
            }
        }
    }

    private void a(WidgetCombineData widgetCombineData, List<Integer> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb1f81", new Object[]{this, widgetCombineData, list, new Long(j)});
            return;
        }
        Class<?> cls = getClass();
        kif.a(cls, "updateAppWidget：appWidgetId: " + list + ",data: " + widgetCombineData);
    }
}
