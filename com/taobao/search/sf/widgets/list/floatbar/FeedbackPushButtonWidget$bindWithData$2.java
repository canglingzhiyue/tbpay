package com.taobao.search.sf.widgets.list.floatbar;

import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes8.dex */
public final class FeedbackPushButtonWidget$bindWithData$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackPushButtonWidget$bindWithData$2(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.this$0.getActivity());
        a aVar = this.this$0;
        localBroadcastManager.sendBroadcast(a.$ipChange);
    }
}
