package com.taobao.themis.container.app.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSBaseFragment$createViewSafely$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSBaseFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBaseFragment$createViewSafely$1(TMSBaseFragment tMSBaseFragment) {
        super(0);
        this.this$0 = tMSBaseFragment;
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
        TMSBaseFragment tMSBaseFragment = this.this$0;
        ITMSPage mPage = tMSBaseFragment.getMPage();
        q.a(mPage);
        TMSBaseFragment.access$loadPage(tMSBaseFragment, mPage);
    }
}
