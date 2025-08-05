package com.taobao.desktop.widget.action;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.kif;

/* loaded from: classes7.dex */
public abstract class f implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context c;
    public b d;
    public String e;
    public String f;
    public List<Integer> g;

    static {
        kge.a(1772283871);
        kge.a(1047541967);
    }

    public abstract void a(JSONObject jSONObject);

    @Override // com.taobao.desktop.widget.action.c
    public void a(Context context, Intent intent, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d61bf5e", new Object[]{this, context, intent, bVar});
            return;
        }
        try {
            this.c = context;
            this.d = bVar;
            intent.getIntegerArrayListExtra("appWidgetIds");
            int intExtra = intent.getIntExtra("widgetId", 0);
            JSONObject parseObject = JSONObject.parseObject(intent.getStringExtra("action"));
            if (parseObject == null) {
                return;
            }
            this.g = new ArrayList();
            CopyOnWriteArrayList<JSONObject> c = g.a(this.c).c();
            for (JSONObject jSONObject : c) {
                if (String.valueOf(intExtra).equals(jSONObject.getString("widget_id"))) {
                    this.e = jSONObject.getString("widget_type_id");
                }
            }
            for (JSONObject jSONObject2 : c) {
                if (this.e.equals(jSONObject2.getString("widget_type_id"))) {
                    this.g.add(Integer.valueOf(jSONObject2.getString("widget_id")));
                    this.f = jSONObject2.getString("widget_receiver");
                }
            }
            a(parseObject);
        } catch (Exception e) {
            kif.a("[widgetClickAction] WidgetActionBase error: " + e.getMessage());
        }
    }
}
