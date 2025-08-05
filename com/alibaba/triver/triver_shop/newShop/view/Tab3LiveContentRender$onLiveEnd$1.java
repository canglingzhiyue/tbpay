package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class Tab3LiveContentRender$onLiveEnd$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ View $liveEndView;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$onLiveEnd$1(View view, Tab3LiveContentRender tab3LiveContentRender) {
        super(1);
        this.$liveEndView = view;
        this.this$0 = tab3LiveContentRender;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        String str = null;
        JSONArray jSONArray = (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONObject3 = jSONObject2.getJSONObject("model")) == null) ? null : jSONObject3.getJSONArray("liveList");
        if (jSONArray == null || !(!jSONArray.isEmpty())) {
            z = false;
        }
        if (!z) {
            return;
        }
        JSONObject jSONObject4 = jSONArray.getJSONObject(0);
        if (jSONObject4 != null) {
            str = jSONObject4.getString("startTimeFormat");
        }
        if (str == null) {
            return;
        }
        TextView textView = (TextView) this.$liveEndView.findViewById(R.id.shop_tab3_live_next_time);
        if (textView != null) {
            textView.setText(str);
        }
        ((LinearLayout) this.$liveEndView.findViewById(R.id.shop_tab3_live_appointment_layout)).setVisibility(0);
        View findViewById = this.$liveEndView.findViewById(R.id.shop_tab3_live_appointment);
        if (findViewById == null) {
            return;
        }
        final Tab3LiveContentRender tab3LiveContentRender = this.this$0;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender$onLiveEnd$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.alibaba.triver.triver_shop.newShop.event.broadcast.a z2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.alibaba.triver.triver_shop.newShop.data.d g = Tab3LiveContentRender.g(Tab3LiveContentRender.this).g();
                if (g == null || (z2 = g.z()) == null) {
                    return;
                }
                z2.a("dongtai-customed", com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("programUniqueId", "10")).toJSONString());
            }
        });
    }
}
