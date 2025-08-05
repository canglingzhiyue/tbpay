package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Tab3LiveContentRender$shopHeaderExtraView$2 extends Lambda implements ruk<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$shopHeaderExtraView$2(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final View mo2427invoke() {
        Object obj;
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("287bc381", new Object[]{this});
        }
        Tab3LiveContentRender tab3LiveContentRender = this.this$0;
        View inflate = View.inflate(Tab3LiveContentRender.$ipChange, R.layout.view_tab3_live_header_extra_layout, null);
        Tab3LiveContentRender tab3LiveContentRender2 = this.this$0;
        ((TUrlImageView) inflate.findViewById(R.id.shop_live_header_logo)).setImageUrl(Tab3LiveContentRender.$ipChange);
        TextView textView = (TextView) inflate.findViewById(R.id.shop_tab3_live_id);
        JSONObject j = Tab3LiveContentRender.g(this.this$0).j();
        String str = "";
        if (j != null && (obj = j.get("roomNum")) != null && (obj2 = obj.toString()) != null) {
            str = obj2;
        }
        textView.setText(kotlin.jvm.internal.q.a("ID:", (Object) str));
        return inflate;
    }
}
