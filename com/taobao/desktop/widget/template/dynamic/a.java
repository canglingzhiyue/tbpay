package com.taobao.desktop.widget.template.dynamic;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.desktop.widget.manager.c;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.wireless.link.widget.dynamic.WidgetDynamicReceiver;
import java.util.List;
import tb.kge;
import tb.kia;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class a extends c implements kia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(365400434);
        kge.a(-1599411783);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.kia
    public void a(String str, List<Integer> list, WidgetContentData widgetContentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372ea719", new Object[]{this, str, list, widgetContentData});
        }
    }

    public a(Context context) {
        this.f16976a = context;
    }

    @Override // tb.kia
    public void a(String str, List<Integer> list, String str2) {
        WidgetDynamicData widgetDynamicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52777c2d", new Object[]{this, str, list, str2});
            return;
        }
        try {
            if (!WidgetDynamicReceiver.class.getName().equals(str) || (widgetDynamicData = (WidgetDynamicData) JSON.parseObject(String.valueOf(str2), WidgetDynamicData.class)) == null) {
                return;
            }
            a(widgetDynamicData, list, widgetDynamicData.getNextRefreshTime());
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "notifyDataUpdate error" + e.getMessage());
            kih.a("widget_catch_error", "WidgetDynamicReceiver.notifyDataUpdate", e.getMessage(), null);
        }
    }

    private void a(WidgetDynamicData widgetDynamicData, final List<Integer> list, final long j) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4528a581", new Object[]{this, widgetDynamicData, list, new Long(j)});
            return;
        }
        Class<?> cls = getClass();
        kif.a(cls, "updateAppWidget：appWidgetId: " + list + ",data: " + widgetDynamicData);
        String string = this.f16976a.getString(R.string.tao_app_widget_dynamic);
        String str3 = "";
        if (widgetDynamicData == null || widgetDynamicData.getExt() == null) {
            str = str3;
            str2 = str;
        } else {
            if (!StringUtils.isEmpty(widgetDynamicData.getExt().getTitle())) {
                string = widgetDynamicData.getExt().getTitle();
            }
            str = !StringUtils.isEmpty(widgetDynamicData.getDeepLink()) ? widgetDynamicData.getDeepLink() : str3;
            str2 = !StringUtils.isEmpty(widgetDynamicData.getImageUrl()) ? widgetDynamicData.getImageUrl() : str3;
            if (!StringUtils.isEmpty(widgetDynamicData.getExt().getCollect())) {
                str3 = widgetDynamicData.getExt().getCollect();
            }
        }
        final RemoteViews remoteViews = new RemoteViews(this.f16976a.getPackageName(), R.layout.widget_dynamic);
        remoteViews.setTextViewText(R.id.tv_widget_dynamic_name, string);
        if (!StringUtils.isEmpty(str3)) {
            remoteViews.setViewVisibility(R.id.tv_widget_dynamic_count, 0);
            remoteViews.setTextViewText(R.id.tv_widget_dynamic_count, str3);
        } else {
            remoteViews.setViewVisibility(R.id.tv_widget_dynamic_count, 8);
        }
        c(remoteViews, R.id.iv_widget_dynamic_icon, str);
        if (StringUtils.isEmpty(str2)) {
            b(remoteViews, list, j);
        } else {
            com.taobao.phenix.intf.b.h().a(this.f16976a).a(str2).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.desktop.widget.template.dynamic.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    try {
                        a.this.a(remoteViews, R.id.iv_widget_dynamic_icon, succPhenixEvent.getDrawable().getBitmap());
                        a.this.b(remoteViews, list, j);
                    } catch (Exception e) {
                        Class<?> cls2 = getClass();
                        kif.a(cls2, "loadImage error：" + e.getMessage());
                    }
                    return false;
                }
            }).fetch();
        }
    }

    public void b(RemoteViews remoteViews, List<Integer> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acb0dd8", new Object[]{this, remoteViews, list, new Long(j)});
            return;
        }
        a(remoteViews, list, j);
        Class<?> cls = getClass();
        kif.a(cls, "hasLoad widgetId：" + list);
    }
}
