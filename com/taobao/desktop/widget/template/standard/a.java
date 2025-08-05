package com.taobao.desktop.widget.template.standard;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class a extends com.taobao.desktop.widget.manager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b c;

    static {
        kge.a(744726308);
    }

    public a(Context context, String str) {
        super(context, str, 1);
    }

    @Override // com.taobao.desktop.widget.manager.a, tb.kia
    public void a(String str, List<Integer> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52777c2d", new Object[]{this, str, list, str2});
            return;
        }
        try {
            if (!this.f16973a.equals(str)) {
                return;
            }
            if (this.c == null) {
                this.c = new b(this.b);
            }
            this.c.a(list, (WidgetStandardData) JSON.parseObject(String.valueOf(str2), WidgetStandardData.class));
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "notifyDataUpdate error" + e.getMessage());
            kih.a("widget_catch_error", "DittoWidgetStandardManager.notifyDataUpdate", e.getMessage(), null);
        }
    }
}
