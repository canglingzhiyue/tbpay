package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.d;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import tb.egv;

/* loaded from: classes4.dex */
public abstract class eac<T extends egv> extends d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1429267583);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.bottombar.BottomBarWgtViewHolder";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(b bVar) {
        a((eac<T>) ((egv) bVar));
    }

    public eac(Context context) {
        super(context);
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d07e44", new Object[]{this, t});
        } else if (t == null || t.c() <= 0) {
        } else {
            this.b.setMinimumWidth(t.c());
        }
    }
}
