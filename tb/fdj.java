package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment;
import com.taobao.android.detail.core.detail.kit.utils.LoginChecker;
import com.taobao.android.detail.wrapper.ext.event.subscriber.basic.c;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fdj implements j<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27831a;
    private String b = "mtop.macao.market.activity.applycoupon.querycouponsfordetail";

    static {
        kge.a(1067833314);
        kge.a(-1453870097);
    }

    public static /* synthetic */ DetailCoreActivity a(fdj fdjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("e0f4c8f7", new Object[]{fdjVar}) : fdjVar.f27831a;
    }

    public static /* synthetic */ String b(fdj fdjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96d9d3", new Object[]{fdjVar}) : fdjVar.b;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, cVar}) : a(cVar);
    }

    public i a(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("42a6ba9d", new Object[]{this, cVar});
        }
        LoginChecker.a(this.f27831a, new LoginChecker.a() { // from class: tb.fdj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.kit.utils.LoginChecker.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (cVar.b != null && !"".equals(cVar.b)) {
                    f.a(fdj.a(fdj.this), new enu(cVar.b));
                } else {
                    CouponInfoFragment.startFragment(fdj.a(fdj.this), fdj.b(fdj.this), cVar.c, cVar.d, fdj.a(fdj.this).y().t.p() == 1 ? "C" : "B");
                }
            }
        });
        return i.SUCCESS;
    }

    public fdj(DetailCoreActivity detailCoreActivity) {
        this.f27831a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.entrance.OpenCouponInfoSubscriber");
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
