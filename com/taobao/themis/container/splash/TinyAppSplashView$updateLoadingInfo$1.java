package com.taobao.themis.container.splash;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TinyAppSplashView$updateLoadingInfo$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyAppSplashView$updateLoadingInfo$1(b bVar) {
        super(0);
        this.this$0 = bVar;
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
        b bVar = this.this$0;
        if (b.$ipChange.compareTo(ISplashView.Status.LOADING) > 0) {
            return;
        }
        b bVar2 = this.this$0;
        b.$ipChange.setVisibility(0);
        b bVar3 = this.this$0;
        View findViewById = b.$ipChange.findViewById(R.id.tms_loading_view);
        if (!(findViewById instanceof com.taobao.themis.container.splash.loading.a)) {
            findViewById = null;
        }
        com.taobao.themis.container.splash.loading.a aVar = (com.taobao.themis.container.splash.loading.a) findViewById;
        if (aVar == null) {
            return;
        }
        b bVar4 = this.this$0;
        String j = k.j(b.$ipChange);
        if (j == null) {
            j = "";
        }
        aVar.setAppName(j);
        b bVar5 = this.this$0;
        String k = k.k(b.$ipChange);
        if (k == null) {
            k = "";
        }
        aVar.setLogo(k);
        b bVar6 = this.this$0;
        String v = k.v(b.$ipChange);
        if (v == null) {
            v = "";
        }
        aVar.setDeveloper(v);
    }
}
