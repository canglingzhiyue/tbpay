package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.main.b;
import com.taobao.android.detail.core.model.viewmodel.main.c;
import com.taobao.android.detail.core.request.async.AsyncQueryData;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.trade.boost.request.mtop.a;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public class eag extends eap<b> implements a<AsyncQueryData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1213589943);
        kge.a(1595456606);
    }

    public static /* synthetic */ Object ipc$super(eag eagVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.DinamicAsyncViewHolder";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((AsyncQueryData) obj);
        }
    }

    public eag(Context context) {
        super(context);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        e();
        if (this.b instanceof ViewGroup) {
            ((ViewGroup) this.b).removeAllViews();
            this.b.setVisibility(8);
        }
        this.h = 3;
    }

    @Override // tb.eap
    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270aa41b", new Object[]{this, bVar})).booleanValue();
        }
        if (this.c != 0 && ((b) this.c).f9763a == null) {
            ((b) this.c).a(this.f9568a, this);
        }
        return true;
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
            return;
        }
        ((b) this.c).a(this.f9568a, mtopResponse);
        k();
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        ((b) this.c).b(this.f9568a, mtopResponse);
        k();
    }

    public void a(AsyncQueryData asyncQueryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610cc30b", new Object[]{this, asyncQueryData});
        } else if (asyncQueryData == null || asyncQueryData.size() == 0) {
            k();
        } else {
            try {
                ((b) this.c).a(this.f9568a, asyncQueryData);
                b((eag) ((c) this.c));
            } catch (Throwable th) {
                k();
                i.a("DinamicAsyncViewHolder", "biz_degrade fail", th);
            }
        }
    }

    @Override // tb.eap
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!((b) this.c).a()) {
        } else {
            super.c();
        }
    }
}
