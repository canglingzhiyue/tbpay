package com.taobao.desktop.widget.manager;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import java.util.Arrays;
import java.util.List;
import tb.ipd;
import tb.ipf;
import tb.kge;
import tb.kia;
import tb.kif;

/* loaded from: classes7.dex */
public abstract class a implements kia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16973a;
    public Context b;
    private final String c = getClass().getName();
    private final int d;

    static {
        kge.a(1078019383);
        kge.a(-1599411783);
    }

    @Override // tb.kia
    public void a(String str, List<Integer> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52777c2d", new Object[]{this, str, list, str2});
        }
    }

    public a(Context context, String str, int i) {
        this.b = context;
        this.f16973a = str;
        this.d = i;
    }

    @Override // tb.kia
    public void a(String str, List<Integer> list, WidgetContentData widgetContentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372ea719", new Object[]{this, str, list, widgetContentData});
        } else if (widgetContentData == null) {
            kif.a("[onRender] notifyDataUpdate data == null");
        } else {
            String id = widgetContentData.getId();
            try {
                if (!this.f16973a.equals(str)) {
                    return;
                }
                a(list, id, widgetContentData);
            } catch (Exception e) {
                kif.a("[onRender] notifyDataUpdate error " + e);
                com.taobao.desktop.widget.monitor.a a2 = com.taobao.desktop.widget.monitor.a.a();
                a.C0652a a3 = new a.C0652a().a(id);
                a2.a(MonitorType.WIDGET_RENDER_STATE, a3.f("notifyDataUpdate_" + e.getMessage()));
            }
        }
    }

    private void a(final List<Integer> list, final String str, WidgetContentData widgetContentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d88559", new Object[]{this, list, str, widgetContentData});
        } else {
            new ipf(this.b, list, widgetContentData, this.d, new ipd() { // from class: com.taobao.desktop.widget.manager.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipd
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    kif.a("[onRender] Start typeId: " + str + " widgetIds: " + Arrays.toString(list.toArray()));
                    com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_RENDER_STATE, new a.C0652a().a(str).e("widget_render_start"));
                }

                @Override // tb.ipd
                public void a(long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                        return;
                    }
                    kif.a("[onRender] DslSucces typeId: " + str + " widgetIds: " + Arrays.toString(list.toArray()) + " dslRenderTime: " + j);
                    com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_RENDER_STATE, new a.C0652a().a(str).e("widget_render_dsl_success").b(j));
                }

                @Override // tb.ipd
                public void b(long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
                        return;
                    }
                    kif.a("[onRender] Finish typeId: " + str + " widgetIds: " + Arrays.toString(list.toArray()) + " renderTime: " + j);
                    com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_RENDER_STATE, new a.C0652a().a(str).e("widget_render_finish").b(j));
                }

                @Override // tb.ipd
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    kif.a("[onRender] Failed typeId: " + str + " widgetIds: " + Arrays.toString(list.toArray()) + " errorMsg: " + str2);
                    com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(str).f(str2).d("widget_render_error"));
                }
            });
        }
    }
}
