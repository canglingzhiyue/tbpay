package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public class eet implements j<eny> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27251a;

    static {
        kge.a(1305308666);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eny enyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, enyVar}) : a(enyVar);
    }

    public eet(DetailCoreActivity detailCoreActivity) {
        this.f27251a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.basic.UserTrackSubscriber");
    }

    public i a(eny enyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("7f69da47", new Object[]{this, enyVar});
        }
        if (TextUtils.isEmpty(enyVar.f27483a)) {
            return a.FAILURE;
        }
        DetailCoreActivity detailCoreActivity = this.f27251a;
        if (detailCoreActivity != null && detailCoreActivity.y() != null && this.f27251a.y().t != null && this.f27251a.y().t.g() != null) {
            enyVar.c.putAll(this.f27251a.y().t.g());
        }
        eps.a((Context) this.f27251a, enyVar.f27483a, enyVar.c);
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
