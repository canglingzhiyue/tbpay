package com.taobao.themis.container.app;

import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.b;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.qpm;
import tb.qqc;
import tb.rnc;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSMultiPageManager$resetTo$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ITMSPage $needPopPage;
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSMultiPageManager$resetTo$1(f fVar, ITMSPage iTMSPage) {
        super(0);
        this.this$0 = fVar;
        this.$needPopPage = iTMSPage;
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
        rnc pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ITMSPage needPopPage = this.$needPopPage;
        q.b(needPopPage, "needPopPage");
        if (qqc.a(needPopPage)) {
            this.$needPopPage.k();
            View findViewById = f.a(this.this$0).findViewById(R.id.tms_fragment_container);
            q.b(findViewById, "mActivity.findViewById(R…d.tms_fragment_container)");
            RelativeLayout relativeLayout = (RelativeLayout) findViewById;
            qpm f = this.$needPopPage.f();
            relativeLayout.removeView((f == null || (pageContainer = f.getPageContainer()) == null) ? null : pageContainer.getView());
            return;
        }
        f fVar = this.this$0;
        b bVar = f.$ipChange;
        ITMSPage needPopPage2 = this.$needPopPage;
        q.b(needPopPage2, "needPopPage");
        bVar.a(needPopPage2, false);
    }
}
