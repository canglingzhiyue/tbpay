package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.LoginChecker;
import com.taobao.android.detail.core.detail.widget.coupon.TMThreeRowToast;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.wrapper.ext.request.redpacket.OpenRedPacketClient;
import com.taobao.android.detail.wrapper.ext.request.redpacket.OpenRedPacketParams;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;
import tb.emu;
import tb.epo;
import tb.fcp;
import tb.kge;

/* loaded from: classes5.dex */
public class g implements j<fcp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MtopRequestListener<com.taobao.android.detail.wrapper.ext.request.redpacket.a> f11276a;
    private DetailCoreActivity b;

    /* renamed from: com.taobao.android.detail.wrapper.ext.event.subscriber.basic.g$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements LoginChecker.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fcp f11277a;

        public AnonymousClass1(fcp fcpVar) {
            this.f11277a = fcpVar;
        }

        @Override // com.taobao.android.detail.core.detail.kit.utils.LoginChecker.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            g.a(g.this, new MtopRequestListener<com.taobao.android.detail.wrapper.ext.request.redpacket.a>() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.basic.g.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.request.c
                public /* synthetic */ void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    } else {
                        a((com.taobao.android.detail.wrapper.ext.request.redpacket.a) obj);
                    }
                }

                public void a(final com.taobao.android.detail.wrapper.ext.request.redpacket.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6051c43", new Object[]{this, aVar});
                    } else if (!com.taobao.android.detail.core.detail.kit.utils.j.a(g.a(g.this))) {
                        epo.a(aVar.b);
                    } else {
                        final String string = g.a(g.this).getString(aVar.f11372a ? R.string.taodetail_iconfont_check : R.string.taodetail_iconfont_warn);
                        g.a(g.this).runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.basic.g.1.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    TMThreeRowToast.a(g.a(g.this), string, aVar.b, "", 0).b();
                                }
                            }
                        });
                    }
                }

                @Override // com.taobao.android.detail.core.request.c
                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    } else if (!com.taobao.android.detail.core.detail.kit.utils.j.a(g.a(g.this))) {
                        epo.a("领取失败");
                    } else {
                        final String string = g.a(g.this).getString(R.string.taodetail_iconfont_warn);
                        g.a(g.this).runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.basic.g.1.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    TMThreeRowToast.a(g.a(g.this), string, "领取失败", "", 0).b();
                                }
                            }
                        });
                    }
                }
            });
            new OpenRedPacketClient(new OpenRedPacketParams(this.f11277a.d), SDKConfig.getInstance().getGlobalTtid(), g.b(g.this)).execute();
        }
    }

    static {
        kge.a(200147257);
        kge.a(-1453870097);
    }

    public static /* synthetic */ DetailCoreActivity a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("5f9142d9", new Object[]{gVar}) : gVar.b;
    }

    public static /* synthetic */ MtopRequestListener a(g gVar, MtopRequestListener mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequestListener) ipChange.ipc$dispatch("f4ab3128", new Object[]{gVar, mtopRequestListener});
        }
        gVar.f11276a = mtopRequestListener;
        return mtopRequestListener;
    }

    public static /* synthetic */ MtopRequestListener b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopRequestListener) ipChange.ipc$dispatch("2913dae0", new Object[]{gVar}) : gVar.f11276a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(fcp fcpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fcpVar}) : a(fcpVar);
    }

    public g(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.OpenRedPacketSubscriber");
    }

    public com.taobao.android.trade.event.i a(fcp fcpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("68f7a72a", new Object[]{this, fcpVar});
        }
        if (fcpVar.d == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        if (!epo.g().b()) {
            epo.g().a(true);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        LoginChecker.a(this.b, new AnonymousClass1(fcpVar));
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
