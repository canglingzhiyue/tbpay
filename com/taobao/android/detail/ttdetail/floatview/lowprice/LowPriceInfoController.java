package com.taobao.android.detail.ttdetail.floatview.lowprice;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoController;", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "apiName", "", "apiVersion", "lowPriceInfoLoadListener", "Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoLoadListener;", "(Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoLoadListener;)V", "mHandler", "Landroid/os/Handler;", "mLowPriceInfoLoadListener", "refresh", "", "Companion", "LowPriceRequestCallBack", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class LowPriceInfoController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f10659a;
    private final b b;

    static {
        kge.a(-327002152);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoController$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-1991748320);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public LowPriceInfoController(JSONObject data, String apiName, String apiVersion, b lowPriceInfoLoadListener) {
        q.c(data, "data");
        q.c(apiName, "apiName");
        q.c(apiVersion, "apiVersion");
        q.c(lowPriceInfoLoadListener, "lowPriceInfoLoadListener");
        this.f10659a = new Handler(Looper.getMainLooper());
        this.b = lowPriceInfoLoadListener;
        com.taobao.android.detail.ttdetail.floatview.lowprice.a aVar = new com.taobao.android.detail.ttdetail.floatview.lowprice.a(new LowPriceRequestParams(data, apiName, apiVersion));
        aVar.a(new LowPriceRequestCallBack());
        aVar.k();
    }

    public static final /* synthetic */ Handler a(LowPriceInfoController lowPriceInfoController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ef6d7a67", new Object[]{lowPriceInfoController}) : lowPriceInfoController.f10659a;
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.b.a(jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016J$\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoController$LowPriceRequestCallBack;", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "(Lcom/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoController;)V", "onError", "", "p0", "", p1.d, "Lmtopsdk/mtop/domain/MtopResponse;", "p2", "", "onSuccess", com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, "mtopResponse", "baseOutDo", "Lmtopsdk/mtop/domain/BaseOutDo;", com.taobao.android.weex_framework.util.a.ATOM_EXT_any, "onSystemError", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public final class LowPriceRequestCallBack implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
        /* loaded from: classes4.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ MtopResponse b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/taobao/android/detail/ttdetail/floatview/lowprice/LowPriceInfoController$LowPriceRequestCallBack$onSuccess$1$1$1"}, k = 3, mv = {1, 1, 16})
            /* renamed from: com.taobao.android.detail.ttdetail.floatview.lowprice.LowPriceInfoController$LowPriceRequestCallBack$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class RunnableC0415a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ JSONObject f10661a;
                public final /* synthetic */ a b;

                public RunnableC0415a(JSONObject jSONObject, a aVar) {
                    this.f10661a = jSONObject;
                    this.b = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LowPriceInfoController.this.a(this.f10661a);
                    }
                }
            }

            public a(MtopResponse mtopResponse) {
                this.b = mtopResponse;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MtopResponse mtopResponse = this.b;
                if (mtopResponse != null) {
                    byte[] bytedata = mtopResponse.getBytedata();
                    q.a((Object) bytedata, "it.bytedata");
                    jSONObject = JSON.parseObject(new String(bytedata, d.UTF_8));
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return;
                }
                LowPriceInfoController.a(LowPriceInfoController.this).post(new RunnableC0415a(jSONObject.getJSONObject("data"), this));
            }
        }

        static {
            kge.a(-1131594733);
            kge.a(-525336021);
        }

        public LowPriceRequestCallBack() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                bf.a(new a(mtopResponse));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                i.a("lowPriceRequestListener", q.a(mtopResponse != null ? mtopResponse.getRetMsg() : null, (Object) " onError"));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                i.a("lowPriceRequestListener", q.a(mtopResponse != null ? mtopResponse.getRetMsg() : null, (Object) " onSystemError"));
            }
        }
    }
}
