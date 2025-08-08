package com.taobao.desktop.widget.action;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.desktop.widget.manager.g;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import java.util.List;
import tb.kge;
import tb.kif;

/* loaded from: classes7.dex */
public class d extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f16963a = 0;

    static {
        kge.a(846656977);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.desktop.widget.action.f
    public void a(JSONObject jSONObject) {
        WidgetContentData widgetContentData;
        List<String> dataFrames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("step");
            String d = g.a(this.c).d(this.e);
            if ((!StringUtils.isEmpty(d) || !StringUtils.isEmpty(string)) && (dataFrames = (widgetContentData = (WidgetContentData) JSON.parseObject(d, WidgetContentData.class)).getDataFrames()) != null && !dataFrames.isEmpty()) {
                widgetContentData.setDataContent(dataFrames.get(a(dataFrames.size(), string)));
                if (this.d != null) {
                    this.d.a(this.g, this.f, JSONObject.toJSONString(widgetContentData));
                }
                com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(this.e).d("widget_click_switch_item"));
            }
        } catch (Throwable th) {
            kif.a("[SwitchItemAction] actionEvent: " + th);
        }
    }

    private int a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f12c98", new Object[]{this, new Integer(i), str})).intValue();
        }
        this.f16963a = ((this.f16963a + Integer.parseInt(str)) + i) % i;
        kif.a("disposeSwitchItemIndex step: " + str + " currentIndex: " + this.f16963a);
        return this.f16963a;
    }
}
