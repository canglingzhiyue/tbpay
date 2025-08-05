package com.taobao.themis.pub.titlebar.action;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/widget/ImageView;", "invoke", "com/taobao/themis/pub/titlebar/action/PubMoreCloseAction$getView$3$1"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubMoreCloseAction$getView$$inlined$apply$lambda$2 extends Lambda implements rul<ImageView, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubMoreCloseAction$getView$$inlined$apply$lambda$2(j jVar) {
        super(1);
        this.this$0 = jVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(ImageView imageView) {
        invoke2(imageView);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ImageView it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600507f9", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        this.this$0.k();
    }
}
