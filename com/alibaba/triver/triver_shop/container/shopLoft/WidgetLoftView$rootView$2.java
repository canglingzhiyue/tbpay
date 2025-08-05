package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

/* loaded from: classes3.dex */
public final class WidgetLoftView$rootView$2 extends Lambda implements ruk<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetLoftView$rootView$2(i iVar) {
        super(0);
        this.this$0 = iVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final FrameLayout mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this});
        }
        i iVar = this.this$0;
        Context context = i.$ipChange;
        q.a(context);
        FrameLayout frameLayout = new FrameLayout(context);
        if (Build.VERSION.SDK_INT >= 21) {
            frameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.WidgetLoftView$rootView$2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else if (view == null || outline == null) {
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 24.0f);
                    }
                }
            });
            frameLayout.setClipToOutline(true);
        }
        return frameLayout;
    }
}
