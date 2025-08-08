package com.taobao.desktop.widget.manager;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.ClickArea;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.khu;
import tb.kii;

/* loaded from: classes7.dex */
public abstract class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f16992a;
    private final String b = getClass().getName();

    static {
        kge.a(-1250716736);
    }

    public k(Context context) {
        this.f16992a = context;
    }

    public void a(RemoteViews remoteViews, List<ClickArea> list, List<Integer> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e68f35c", new Object[]{this, remoteViews, list, list2});
            return;
        }
        try {
            for (ClickArea clickArea : list) {
                int positionStartY = clickArea.getPositionStartY();
                int positionEndX = clickArea.getPositionEndX();
                int positionEndY = clickArea.getPositionEndY();
                for (int positionStartX = clickArea.getPositionStartX(); positionStartX < positionEndX; positionStartX++) {
                    for (int i = positionStartY; i < positionEndY; i++) {
                        int a2 = a("click_area_" + positionStartX + "_" + i);
                        if (!StringUtils.isEmpty(clickArea.getAction())) {
                            a(remoteViews, a2, list2, clickArea.getAction());
                        } else {
                            a(remoteViews, a2, a(clickArea.getDeepUrl(), list2), clickArea.getAreaId());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            khu.a("setClickArea error = " + th);
            com.taobao.desktop.widget.monitor.a a3 = com.taobao.desktop.widget.monitor.a.a();
            a.C0652a c0652a = new a.C0652a();
            a3.a(MonitorType.WIDGET_RENDER_STATE, c0652a.f("setClickArea" + th.getMessage()));
        }
    }

    public void a(RemoteViews remoteViews, int i, String str, String str2) {
        PendingIntent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1143e35d", new Object[]{this, remoteViews, new Integer(i), str, str2});
        } else if (StringUtils.isEmpty(str)) {
            String str3 = this.b;
            Log.e(str3, "url is null in " + str2);
        } else {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.setFlags(805339136);
            if (Build.VERSION.SDK_INT >= 31) {
                a2 = com.android.taobao.aop.a.a(this.f16992a, 0, intent, 201326592);
            } else {
                a2 = com.android.taobao.aop.a.a(this.f16992a, 0, intent, 134217728);
            }
            remoteViews.setOnClickPendingIntent(i, a2);
        }
    }

    private void a(RemoteViews remoteViews, int i, List<Integer> list, String str) {
        PendingIntent b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a86904", new Object[]{this, remoteViews, new Integer(i), list, str});
            return;
        }
        try {
            for (Integer num : list) {
                AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this.f16992a).getAppWidgetInfo(num.intValue());
                if (appWidgetInfo == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("com.taobao.widget_action_click");
                intent.setComponent(appWidgetInfo.provider);
                intent.putIntegerArrayListExtra("appWidgetIds", (ArrayList) list);
                intent.putExtra("widgetId", num);
                intent.putExtra("action", str);
                if (Build.VERSION.SDK_INT >= 31) {
                    b = com.android.taobao.aop.a.b(this.f16992a, i, intent, 167772160);
                } else {
                    b = com.android.taobao.aop.a.b(this.f16992a, i, intent, 134217728);
                }
                remoteViews.setOnClickPendingIntent(i, b);
            }
        } catch (Throwable th) {
            khu.a("setClickAction error = " + th.getMessage());
        }
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue() : this.f16992a.getResources().getIdentifier(str, "id", this.f16992a.getPackageName());
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue() : this.f16992a.getResources().getIdentifier(str, "layout", this.f16992a.getPackageName());
    }

    public void a(RemoteViews remoteViews, int i, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fef7f85", new Object[]{this, remoteViews, new Integer(i), bitmap});
        } else if (bitmap != null) {
            remoteViews.setImageViewBitmap(i, bitmap);
            a(remoteViews, i);
        } else {
            b(remoteViews, i);
        }
    }

    public void a(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f30853", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!StringUtils.isEmpty(str)) {
            a(remoteViews, i);
            remoteViews.setTextViewText(i, str);
        } else {
            c(remoteViews, i);
        }
    }

    public void b(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cba2b2", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                remoteViews.setTextColor(i, Color.parseColor(str));
            } catch (Exception e) {
                khu.a("setViewTextColor parseColor error: " + e);
            }
        }
    }

    public void c(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa43d11", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            remoteViews.setTextViewTextSize(i, 1, Float.parseFloat(str));
        }
    }

    public void a(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e929ec9", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 0);
        }
    }

    public void b(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb262e8", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 4);
        }
    }

    public void c(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d22707", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 8);
        }
    }

    public String a(String str, List<Integer> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e49249dd", new Object[]{this, str, list}) : "https".equals(Uri.parse(str).getScheme()) ? kii.a("tbopen://m.taobao.com/tbopen/index.html?action=ali.open.nav&module=h5&bootImage=0&bc_fl_src=growth_dhh_2200803434487_android-widget-1069565676-editableWidget-biz_null-mfP_0_null_widgetCenter_null", "h5Url", kii.a(str, "widgetId", String.valueOf(list.get(0)))) : str;
    }
}
