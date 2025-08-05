package com.taobao.message.conversation;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/taobao/message/conversation/CompatMessageTabHost$onCreate$2$1$1"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class CompatMessageTabHost$onCreate$2$$special$$inlined$let$lambda$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CompatMessageTabHost$onCreate$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompatMessageTabHost$onCreate$2$$special$$inlined$let$lambda$1(CompatMessageTabHost$onCreate$2 compatMessageTabHost$onCreate$2) {
        super(0);
        this.this$0 = compatMessageTabHost$onCreate$2;
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
        CompatMessageTabHost compatMessageTabHost = this.this$0.this$0;
        CompatMessageTabHost compatMessageTabHost2 = this.this$0.this$0;
        CompatMessageTabHost.access$replaceContentView(compatMessageTabHost, CompatMessageTabHost.$ipChange);
        CompatMessageTabHost.access$downloadBundle(this.this$0.this$0, CompatMessageTabHost$onCreate$2$1$1$1.INSTANCE);
    }
}
