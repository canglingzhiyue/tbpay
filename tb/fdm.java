package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.params.e;
import com.taobao.android.detail.wrapper.fragment.msoa.FloatWeexFragment;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fdm implements j<Event> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27836a;
    private FloatWeexFragment b;

    static {
        kge.a(1005314401);
        kge.a(-1453870097);
    }

    public fdm(DetailCoreActivity detailCoreActivity) {
        this.f27836a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.msoa.ManipulateFloatWeexFragmentSubscriber");
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        e eVar = (e) event.getParam();
        if (this.b == null) {
            this.b = new FloatWeexFragment();
        }
        Bundle bundle = new Bundle();
        if (eVar.b) {
            this.b.disappear();
        } else {
            bundle.putString("bundle_url", eVar.f9718a);
            bundle.putString(FloatWeexFragment.BUNDLE_PARAMS, eVar.c);
            this.b.setArguments(bundle);
            if (this.b.isAdded()) {
                this.b.refreshContent();
            } else {
                this.b.show(this.f27836a.getSupportFragmentManager(), "");
            }
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
