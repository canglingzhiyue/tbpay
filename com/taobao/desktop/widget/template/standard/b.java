package com.taobao.desktop.widget.template.standard;

import android.content.Context;
import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.c;
import com.taobao.desktop.widget.template.standard.WidgetStandardData;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.kif;
import tb.kih;
import tb.kii;

/* loaded from: classes7.dex */
public class b extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<Integer, Object> c;

    static {
        kge.a(-369251062);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(Context context) {
        this.f16976a = context;
    }

    public void a(List<Integer> list, WidgetStandardData widgetStandardData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4534a57b", new Object[]{this, list, widgetStandardData});
        } else if (widgetStandardData == null) {
        } else {
            try {
                a(widgetStandardData, list, widgetStandardData.getNextRefreshTime());
            } catch (Exception e) {
                Class<?> cls = getClass();
                kif.a(cls, "notifyDataUpdate error" + e.getMessage());
                kih.a("widget_catch_error", "WidgetLiveReceiver.notifyDataUpdate", e.getMessage(), null);
            }
        }
    }

    private void a(WidgetStandardData widgetStandardData, List<Integer> list, long j) {
        WidgetStandardData.ExtData ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a97ca9", new Object[]{this, widgetStandardData, list, new Long(j)});
            return;
        }
        Class<?> cls = getClass();
        kif.a(cls, "updateAppWidget：appWidgetId: " + list + ",data: " + widgetStandardData);
        this.c = new HashMap(16);
        RemoteViews remoteViews = new RemoteViews(this.f16976a.getPackageName(), R.layout.widget_standard);
        d(remoteViews, R.id.iv_widget_standard_bg, widgetStandardData.getImageUrl());
        d(remoteViews, R.id.iv_widget_standard_above_bg, widgetStandardData.getOverlayImageUrl());
        d(remoteViews, R.id.iv_widget_standard_above_over_bg, widgetStandardData.getOverlayMaterialUrl());
        c(remoteViews, R.id.rl_widget_standard_container, widgetStandardData.getDeepLink());
        b(remoteViews, R.id.rl_widget_standard_template_one);
        b(remoteViews, R.id.rl_widget_standard_template_two);
        c(remoteViews, R.id.rl_widget_standard_contain_left);
        c(remoteViews, R.id.rl_widget_standard_contain_right);
        if (widgetStandardData.getExt() != null && (ext = widgetStandardData.getExt()) != null && ext.getContainers() != null) {
            List<WidgetStandardData.ExtData.ContainersData> containers = ext.getContainers();
            if (ext.getTemplateType() == 1) {
                a(remoteViews, R.id.rl_widget_standard_template_one);
                if (containers.size() > 0 && containers.get(0) != null) {
                    a(remoteViews, R.id.rl_widget_standard_contain_left);
                    a(remoteViews, containers.get(0));
                }
                if (containers.size() > 1 && containers.get(1) != null) {
                    a(remoteViews, R.id.rl_widget_standard_contain_right);
                    b(remoteViews, containers.get(1));
                }
            } else if (ext.getTemplateType() == 2) {
                a(remoteViews, R.id.rl_widget_standard_template_two);
                if (containers.size() > 0 && containers.get(0) != null) {
                    c(remoteViews, containers.get(0));
                }
            }
        }
        b(remoteViews, list, j, this.c);
    }

    private void a(RemoteViews remoteViews, WidgetStandardData.ExtData.ContainersData containersData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4e003b", new Object[]{this, remoteViews, containersData});
            return;
        }
        d(remoteViews, R.id.iv_widget_standard_contain_bg_left, containersData.getContentBgUrl());
        d(remoteViews, R.id.iv_widget_standard_contain_above_bg_left, containersData.getContentImageUrl());
        d(remoteViews, R.id.iv_widget_standard_contain_above_square_bg_left, containersData.getSquareContentImageUrl());
        d(remoteViews, R.id.iv_widget_standard_title_bg_left, containersData.getTitleBgUrl());
        a(remoteViews, R.id.tv_widget_standard_title_left, containersData.getTitle());
        b(remoteViews, R.id.tv_widget_standard_title_left, containersData.getTitleColor());
        d(remoteViews, R.id.iv_widget_standard_tag_bg_left, containersData.getTagBgUrl());
        a(remoteViews, R.id.tv_widget_standard_tag_left, containersData.getTag());
        b(remoteViews, R.id.tv_widget_standard_tag_left, containersData.getTagColor());
        d(remoteViews, R.id.iv_widget_standard_corner_bg_left, containersData.getCollectBgUrl());
        a(remoteViews, R.id.tv_widget_standard_corner_left, containersData.getCollect());
        b(remoteViews, R.id.tv_widget_standard_corner_left, containersData.getCollectColor());
        c(remoteViews, R.id.rl_widget_standard_contain_left, containersData.getDeepLink());
    }

    private void b(RemoteViews remoteViews, WidgetStandardData.ExtData.ContainersData containersData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bddb1a", new Object[]{this, remoteViews, containersData});
            return;
        }
        d(remoteViews, R.id.iv_widget_standard_contain_bg_right, containersData.getContentBgUrl());
        d(remoteViews, R.id.iv_widget_standard_contain_above_bg_right, containersData.getContentImageUrl());
        d(remoteViews, R.id.iv_widget_standard_contain_above_square_bg_right, containersData.getSquareContentImageUrl());
        d(remoteViews, R.id.iv_widget_standard_title_bg_right, containersData.getTitleBgUrl());
        a(remoteViews, R.id.tv_widget_standard_title_right, containersData.getTitle());
        b(remoteViews, R.id.tv_widget_standard_title_right, containersData.getTitleColor());
        d(remoteViews, R.id.iv_widget_standard_tag_bg_right, containersData.getTagBgUrl());
        a(remoteViews, R.id.tv_widget_standard_tag_right, containersData.getTag());
        b(remoteViews, R.id.tv_widget_standard_tag_right, containersData.getTagColor());
        d(remoteViews, R.id.iv_widget_standard_corner_bg_right, containersData.getCollectBgUrl());
        a(remoteViews, R.id.tv_widget_standard_corner_right, containersData.getCollect());
        b(remoteViews, R.id.tv_widget_standard_corner_right, containersData.getCollectColor());
        c(remoteViews, R.id.rl_widget_standard_contain_right, containersData.getDeepLink());
    }

    private void c(RemoteViews remoteViews, WidgetStandardData.ExtData.ContainersData containersData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992db5f9", new Object[]{this, remoteViews, containersData});
            return;
        }
        b(remoteViews, R.id.iv_widget_standard_mark_tag_bg);
        d(remoteViews, R.id.iv_widget_standard_mark_tag_bg, containersData.getTagBgUrl());
        Bitmap bitmap = null;
        if (!StringUtils.isEmpty(containersData.getTagBgGradient()) && containersData.getTagBgGradient().contains("-")) {
            String[] split = containersData.getTagBgGradient().split("-");
            bitmap = a(split[0], split[1], containersData.getTag(), false);
        } else if (!StringUtils.isEmpty(containersData.getTagBgColor())) {
            bitmap = a(containersData.getTagBgColor(), containersData.getTagBgColor(), containersData.getTag(), false);
        }
        if (bitmap != null) {
            a(remoteViews, R.id.iv_widget_standard_mark_tag_bg, bitmap);
            a(remoteViews, R.id.iv_widget_standard_mark_tag_bg);
        }
        a(remoteViews, R.id.tv_widget_standard_mark_tag, containersData.getTag());
        b(remoteViews, R.id.tv_widget_standard_mark_tag, containersData.getTagColor());
        a(remoteViews, R.id.tv_widget_standard_mark_title, containersData.getTitle());
        b(remoteViews, R.id.tv_widget_standard_mark_title, containersData.getTitleColor());
        a(remoteViews, R.id.tv_widget_standard_mark_desc, containersData.getDescription());
        b(remoteViews, R.id.tv_widget_standard_mark_desc, containersData.getDescriptionColor());
    }

    public void d(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7cd770", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!StringUtils.isEmpty(str)) {
            if (!this.c.containsKey(Integer.valueOf(i)) || !str.equals(this.c.get(Integer.valueOf(i)))) {
                this.c.put(Integer.valueOf(i), str);
            }
            a(remoteViews, i);
        } else {
            b(remoteViews, i);
        }
    }

    private void b(RemoteViews remoteViews, List<Integer> list, long j, Map<Integer, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597e62ad", new Object[]{this, remoteViews, list, new Long(j), map});
            return;
        }
        Class<?> cls = getClass();
        kif.a(cls, "appWidgetId: " + list + "loadImage imgMap: " + map);
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (map.get(Integer.valueOf(intValue)) instanceof String) {
                if (intValue == R.id.iv_widget_standard_contain_above_square_bg_left || intValue == R.id.iv_widget_standard_contain_above_square_bg_right) {
                    a(remoteViews, intValue, (String) map.get(Integer.valueOf(intValue)), new RoundedCornersBitmapProcessor(kii.a(38.0f), kii.a(6.0f), kii.a(6.0f), 0), list, j, map);
                } else {
                    a(remoteViews, intValue, (String) map.get(Integer.valueOf(intValue)), null, list, j, map);
                }
            }
        }
    }
}
