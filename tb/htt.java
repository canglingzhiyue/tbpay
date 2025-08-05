package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class htt extends htn<FrameLayout, htp, hto, iru<? extends b<a, MetaResult<a>>>, hte> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-944588289);
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "MetaFootStateWidget";
    }

    @Override // tb.iun
    public /* synthetic */ iuh d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuh) ipChange.ipc$dispatch("261b13ff", new Object[]{this}) : b();
    }

    @Override // tb.iun
    public /* synthetic */ iuj f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuj) ipChange.ipc$dispatch("357e5efb", new Object[]{this}) : e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htt(Activity activity, ium parent, iru<? extends b<a, MetaResult<a>>> model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
    }

    public hto b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hto) ipChange.ipc$dispatch("16b751fa", new Object[]{this}) : a().k().a(a());
    }

    public htp e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htp) ipChange.ipc$dispatch("2dcc4236", new Object[]{this}) : a().h().a(a());
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            ((hto) K()).a();
        }
    }
}
