package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import com.taobao.android.tab2liveroom.liveroom.preload.a;
import com.taobao.android.tab2liveroom.liveroom.preload.business.PreloadRecommendResponse;
import com.taobao.android.tab2liveroom.liveroom.preload.business.b;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.detail.checkforeground.CheckForeGroundResponseData;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class ivu implements ivt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private long f29346a;
    private long b;
    private Context c;
    private LivePreloadData d;
    private a e;
    private a f;
    private b g;
    private com.taobao.taolive.sdk.business.detail.checkforeground.a h;
    private boolean i;
    private int j;

    static {
        kge.a(-749479986);
        kge.a(12956493);
    }

    /* renamed from: lambda$l5fLj9_2O94KHXfcG5YIsj-IUSk */
    public static /* synthetic */ void m2445lambda$l5fLj9_2O94KHXfcG5YIsjIUSk(ivu ivuVar) {
        ivuVar.i();
    }

    public static /* synthetic */ void lambda$mU455ICydPqnQanoRDiYWJAXwLI(ivu ivuVar, String str) {
        ivuVar.d(str);
    }

    public static /* synthetic */ void a(ivu ivuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955c9aba", new Object[]{ivuVar, str});
        } else {
            ivuVar.a(str);
        }
    }

    public static /* synthetic */ void a(ivu ivuVar, String str, NetBaseOutDo netBaseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1149d732", new Object[]{ivuVar, str, netBaseOutDo});
        } else {
            ivuVar.a(str, netBaseOutDo);
        }
    }

    public ivu(Context context, ivs ivsVar, int i) {
        this.c = context;
        this.j = i;
        this.i = ivsVar.a();
        this.f29346a = ivsVar.b() * 1000;
        this.b = ivsVar.c() * 1000;
    }

    @Override // tb.ivt
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    public void a(LivePreloadData livePreloadData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb6a2ee", new Object[]{this, livePreloadData, new Boolean(z)});
        } else if (z) {
            this.d = null;
        } else {
            if (livePreloadData == null) {
                livePreloadData = new LivePreloadData();
            }
            livePreloadData.setPreloadType(this.j);
            livePreloadData.setHitPreloadAB(this.i);
            this.d = livePreloadData;
        }
    }

    @Override // tb.ivt
    public LivePreloadData b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LivePreloadData) ipChange.ipc$dispatch("e693994b", new Object[]{this}) : this.d;
    }

    @Override // tb.ivt
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        e();
        this.d = null;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.g == null) {
            this.g = new b(new com.taobao.android.tab2liveroom.liveroom.preload.business.a() { // from class: tb.ivu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    ivu.this = this;
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    LivePreloadData preloadResponseData;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    ogg.d("LiveNormalPreloadTask", "startRequestRecommend onSuccess: " + i + " netResponse = " + netResponse + " netBaseOutDo = " + netBaseOutDo + " o = " + obj);
                    if (!(netBaseOutDo instanceof PreloadRecommendResponse) || (preloadResponseData = ((PreloadRecommendResponse) netBaseOutDo).getPreloadResponseData()) == null) {
                        return;
                    }
                    ivu.this.a(preloadResponseData, false);
                    ivu.a(ivu.this, preloadResponseData.id);
                    ogg.a("LiveNormalPreloadTask", "2.startRequestRecommend onSuccess,liveId: " + preloadResponseData.id + ",customPlayCtrlParams isEmpty: " + TextUtils.isEmpty(preloadResponseData.customPlayCtrlParams));
                }
            });
        }
        ogg.a("LiveNormalPreloadTask", "1.startRequestRecommend");
        this.g.b();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ogg.a("LiveNormalPreloadTask", "3.startCountDownTimer liveId:" + str);
        b(str);
        f();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ogg.a("LiveNormalPreloadTask", "cancelCountDownTimer");
        h();
        g();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        g();
        this.f = new a(this.b);
        this.f.a(new a.InterfaceC0587a() { // from class: tb.-$$Lambda$ivu$l5fLj9_2O94KHXfcG5YIsj-IUSk
            @Override // com.taobao.android.tab2liveroom.liveroom.preload.a.InterfaceC0587a
            public final void onFinish() {
                ivu.m2445lambda$l5fLj9_2O94KHXfcG5YIsjIUSk(ivu.this);
            }
        });
        this.f.start();
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ogg.a("LiveNormalPreloadTask", "5.启动定时轮询强制刷新倒计时结束，请求推荐接口");
        d();
    }

    private void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        h();
        this.e = new a(this.f29346a);
        this.e.a(new a.InterfaceC0587a() { // from class: tb.-$$Lambda$ivu$mU455ICydPqnQanoRDiYWJAXwLI
            @Override // com.taobao.android.tab2liveroom.liveroom.preload.a.InterfaceC0587a
            public final void onFinish() {
                ivu.lambda$mU455ICydPqnQanoRDiYWJAXwLI(ivu.this, str);
            }
        });
        this.e.start();
    }

    public /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        ogg.a("LiveNormalPreloadTask", "4.启动定时轮询直播间状态倒计时结束，请求检查直播间状态接口");
        c(str);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a aVar = this.f;
        if (aVar == null) {
            return;
        }
        aVar.cancel();
        this.f = null;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.cancel();
        this.e = null;
    }

    private void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            if (this.h == null) {
                this.h = new com.taobao.taolive.sdk.business.detail.checkforeground.a(new com.taobao.android.tab2liveroom.liveroom.preload.business.a() { // from class: tb.ivu.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        ivu.this = this;
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                            return;
                        }
                        ogg.d("LiveNormalPreloadTask", "onSuccess: " + i + " netResponse = " + netResponse + " netBaseOutDo = " + netBaseOutDo + " o = " + obj);
                        if (netBaseOutDo == null || !(netBaseOutDo.mo1437getData() instanceof Map)) {
                            return;
                        }
                        ivu.a(ivu.this, str, netBaseOutDo);
                    }
                });
            }
            this.h.a(arrayList);
        }
    }

    private void a(String str, NetBaseOutDo netBaseOutDo) {
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1020ba", new Object[]{this, str, netBaseOutDo});
        } else if (TextUtils.isEmpty(str) || netBaseOutDo == null || netBaseOutDo.mo1437getData() == null || (a2 = oec.a(netBaseOutDo.mo1437getData(), (Map) null)) == null) {
        } else {
            CheckForeGroundResponseData checkForeGroundResponseData = (CheckForeGroundResponseData) a2.get(str);
            if (checkForeGroundResponseData != null && !TextUtils.equals(checkForeGroundResponseData.roomStatus, "1")) {
                ogg.a("LiveNormalPreloadTask", "6.removeFinishedLiveRoom，直播已结束，请求推荐接口");
                a((LivePreloadData) null, true);
                d();
                return;
            }
            ogg.a("LiveNormalPreloadTask", "7.removeFinishedLiveRoom，直播未结束，开启倒计时");
            b(str);
        }
    }
}
