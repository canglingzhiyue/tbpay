package com.taobao.themis.container.app;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.app.page.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/taobao/themis/container/app/page/TMSFragmentManager;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSMultiPageManager$mFragmentManager$2 extends Lambda implements ruk<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSMultiPageManager$mFragmentManager$2(f fVar) {
        super(0);
        this.this$0 = fVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final b mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("68a71132", new Object[]{this}) : new b(f.a(this.this$0), 0, null, 6, null);
    }
}
