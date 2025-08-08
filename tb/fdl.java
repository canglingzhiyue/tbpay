package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.fragment.CouponFragment;
import com.taobao.android.detail.core.detail.kit.utils.LoginChecker;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fdl implements j<enr> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DetailCoreActivity f;

    /* renamed from: a  reason: collision with root package name */
    private String f27834a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private LoginChecker.b g = new LoginChecker.b() { // from class: tb.fdl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.detail.kit.utils.LoginChecker.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                epo.a("请先登录");
            }
        }

        @Override // com.taobao.android.detail.core.detail.kit.utils.LoginChecker.b
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (!z) {
            } else {
                if (StringUtils.isEmpty(fdl.a(fdl.this))) {
                    CouponFragment.startFragment(fdl.b(fdl.this), fdl.c(fdl.this), fdl.d(fdl.this), fdl.e(fdl.this), fdl.f(fdl.this));
                } else {
                    f.a(fdl.b(fdl.this), new enu(fdl.a(fdl.this)));
                }
            }
        }
    };

    static {
        kge.a(979595643);
        kge.a(-1453870097);
    }

    public static /* synthetic */ String a(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("191c1936", new Object[]{fdlVar}) : fdlVar.f27834a;
    }

    public static /* synthetic */ DetailCoreActivity b(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("59de6c76", new Object[]{fdlVar}) : fdlVar.f;
    }

    public static /* synthetic */ String c(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a757074", new Object[]{fdlVar}) : fdlVar.e;
    }

    public static /* synthetic */ String d(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b221c13", new Object[]{fdlVar}) : fdlVar.b;
    }

    public static /* synthetic */ String e(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcec7b2", new Object[]{fdlVar}) : fdlVar.c;
    }

    public static /* synthetic */ String f(fdl fdlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c7b7351", new Object[]{fdlVar}) : fdlVar.d;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(enr enrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, enrVar}) : a(enrVar);
    }

    public fdl(DetailCoreActivity detailCoreActivity) {
        this.f = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.miscellaneous.OpenCouponViewSubscriber");
    }

    public i a(enr enrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f5d311c0", new Object[]{this, enrVar});
        }
        this.f27834a = enrVar.f27475a;
        this.b = enrVar.c;
        this.c = enrVar.d;
        this.d = enrVar.b;
        this.e = enrVar.a();
        LoginChecker.a(this.f, this.g);
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
