package com.taobao.message.sp.category;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.conversation.IErrorViewService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorMsg", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleMessageTabHostV2$onCreate$2 extends Lambda implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ SimpleMessageTabHostV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleMessageTabHostV2$onCreate$2(SimpleMessageTabHostV2 simpleMessageTabHostV2) {
        super(1);
        this.this$0 = simpleMessageTabHostV2;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(String str) {
        invoke2(str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String errorMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, errorMsg});
            return;
        }
        q.c(errorMsg, "errorMsg");
        RemoteMonitorUtil.INSTANCE.remoteLoadFailCount("category", errorMsg);
        if (((IErrorViewService) GlobalContainer.getInstance().get(IErrorViewService.class)) == null) {
            return;
        }
        SimpleMessageTabHostV2.access$downloadBundle(this.this$0, SimpleMessageTabHostV2$onCreate$2$1$1.INSTANCE);
    }
}
