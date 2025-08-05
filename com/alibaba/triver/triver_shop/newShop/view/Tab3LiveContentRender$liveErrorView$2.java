package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import kotlin.jvm.internal.Lambda;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Tab3LiveContentRender$liveErrorView$2 extends Lambda implements ruk<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$liveErrorView$2(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final View mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("287bc381", new Object[]{this});
        }
        Tab3LiveContentRender tab3LiveContentRender = this.this$0;
        View inflate = View.inflate(Tab3LiveContentRender.$ipChange, R.layout.view_tab3_live_error_layout, null);
        final Tab3LiveContentRender tab3LiveContentRender2 = this.this$0;
        ((TextView) inflate.findViewById(R.id.shop_live_retry_text)).setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender$liveErrorView$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ceg.Companion.b("tab3 click retry");
                Tab3LiveContentRender tab3LiveContentRender3 = Tab3LiveContentRender.this;
                TaoliveOpenLiveRoom taoliveOpenLiveRoom = Tab3LiveContentRender.$ipChange;
                if (taoliveOpenLiveRoom != null) {
                    taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.callVideoStart, new Object[0]);
                }
                Tab3LiveContentRender.j(Tab3LiveContentRender.this);
            }
        });
        final Tab3LiveContentRender tab3LiveContentRender3 = this.this$0;
        ((TextView) inflate.findViewById(R.id.shop_live_go_home_page_text)).setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender$liveErrorView$2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.alibaba.triver.triver_shop.newShop.event.broadcast.a z;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ceg.Companion.b("tab3 click goHomePage");
                com.alibaba.triver.triver_shop.newShop.data.d g = Tab3LiveContentRender.g(Tab3LiveContentRender.this).g();
                if (g == null || (z = g.z()) == null) {
                    return;
                }
                z.a(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX, (String) null);
            }
        });
        return inflate;
    }
}
