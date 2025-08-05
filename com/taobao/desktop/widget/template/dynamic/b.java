package com.taobao.desktop.widget.template.dynamic;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class b extends com.taobao.desktop.widget.manager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a c;

    static {
        kge.a(-2008111147);
    }

    public b(Context context, String str) {
        super(context, str, 0);
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
                this.c = new a(this.b);
            }
            this.c.a(str, list, str2);
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "WidgetStandardMiniManager notifyDataUpdate error" + e.getMessage());
            kih.a("widget_catch_error", "WidgetStandardMiniManager.notifyDataUpdate", e.getMessage(), null);
        }
    }
}
