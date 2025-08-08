package com.taobao.android.detail.core.event.subscriber.trade;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.coupon.AchieveCouponAfterCartRequestClient;
import com.taobao.android.detail.core.request.coupon.AchieveCouponAfterCartRequestParams;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgc;
import tb.edc;
import tb.eei;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class AchieveCouponAfterCartSubscriber extends eei<edc> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_TIP = "很遗憾，领券失败。请到商品页面领券处试试～";
    private static final String FULL_CLASS = "com.taobao.android.detail.core.event.subscriber.trade.AchieveCouponAfterCartSubscriber";
    private Activity mActivity;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    static {
        kge.a(566315749);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(AchieveCouponAfterCartSubscriber achieveCouponAfterCartSubscriber, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : FULL_CLASS;
    }

    public AchieveCouponAfterCartSubscriber(Activity activity) {
        this.mActivity = activity;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public i handleEvent(edc edcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("803fb5aa", new Object[]{this, edcVar});
        }
        if (edcVar == null || edcVar.f27205a == null || StringUtils.isEmpty(edcVar.f27205a.c) || StringUtils.isEmpty(edcVar.f27205a.f9714a)) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        achieveCoupon(edcVar.f27205a);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private void achieveCoupon(com.taobao.android.detail.core.event.params.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f05a371", new Object[]{this, aVar});
        } else {
            new AchieveCouponAfterCartRequestClient().execute(new AchieveCouponAfterCartRequestParams(aVar.f9714a, aVar.b, aVar.c), new a(this.mHandler), epo.f());
        }
    }

    /* loaded from: classes4.dex */
    public class a implements com.taobao.android.trade.boost.request.mtop.a<MtopResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Handler> f9728a;

        static {
            kge.a(-482943220);
            kge.a(1595456606);
        }

        public static /* synthetic */ void a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("576def3f", new Object[]{aVar, str});
            } else {
                aVar.a(str);
            }
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
            } else {
                b(mtopResponse);
            }
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                a((MtopResponse) obj);
            }
        }

        public a(Handler handler) {
            this.f9728a = new WeakReference<>(handler);
        }

        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                return;
            }
            final String str = AchieveCouponAfterCartSubscriber.DEFAULT_TIP;
            if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
                z = mtopResponse.getDataJsonObject().optBoolean("isSuccess", false);
                str = mtopResponse.getDataJsonObject().optString("tip", str);
            }
            Handler handler = this.f9728a.get();
            if (!z && handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.event.subscriber.trade.AchieveCouponAfterCartSubscriber.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this, str);
                        }
                    }
                }, 5000L);
            }
            bgc.b("detail", mtopResponse);
        }

        public void b(final MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
                return;
            }
            Handler handler = this.f9728a.get();
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.event.subscriber.trade.AchieveCouponAfterCartSubscriber.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this, mtopResponse.getRetMsg());
                        }
                    }
                }, 5000L);
            }
            bgc.a("detail", mtopResponse);
        }

        @Override // com.taobao.android.trade.boost.request.mtop.a
        public void onSystemFailure(final MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                return;
            }
            Handler handler = this.f9728a.get();
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.event.subscriber.trade.AchieveCouponAfterCartSubscriber.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this, mtopResponse.getRetMsg());
                        }
                    }
                }, 5000L);
            }
            bgc.a("detail", mtopResponse);
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (epo.a() == null) {
            } else {
                Toast.makeText(epo.a(), str, 0).show();
            }
        }
    }
}
