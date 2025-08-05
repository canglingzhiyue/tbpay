package com.taobao.mytaobao.ultron;

import android.app.Activity;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.homepage.busniess.acds.DealInfo;
import com.taobao.mytaobao.homepage.busniess.model.DeliverInfoBean;
import com.taobao.mytaobao.homepage.busniess.model.DeliverListResponse;
import com.taobao.mytaobao.ultron.model.OrderCountResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.kng;
import tb.muf;
import tb.muh;
import tb.mwu;
import tb.mxb;
import tb.mxe;
import tb.mxp;
import tb.mxq;
import tb.sdw;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;
    private static DealInfo f;

    /* renamed from: a */
    public List<DeliverInfoBean> f18493a;
    public JSONObject b;
    private sdw d;
    private DealInfo e;
    private String[] g;

    public static /* synthetic */ DealInfo a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DealInfo) ipChange.ipc$dispatch("1f45c8cb", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ void a(d dVar, com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f972bf", new Object[]{dVar, eVar});
        } else {
            dVar.b(eVar);
        }
    }

    public static /* synthetic */ void a(d dVar, com.alibaba.android.ultron.event.base.e eVar, DealInfo dealInfo, List list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cba0b4f", new Object[]{dVar, eVar, dealInfo, list, jSONObject});
        } else {
            dVar.a(eVar, dealInfo, list, jSONObject);
        }
    }

    public static /* synthetic */ void a(d dVar, com.alibaba.android.ultron.event.base.e eVar, OrderCountResponse.Results results) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e66478f", new Object[]{dVar, eVar, results});
        } else {
            dVar.a(eVar, results);
        }
    }

    public static /* synthetic */ sdw b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sdw) ipChange.ipc$dispatch("a3fe1373", new Object[]{dVar}) : dVar.d;
    }

    static {
        kge.a(2002318631);
        c = d.class.getSimpleName();
    }

    public d(sdw sdwVar) {
        this.d = sdwVar;
        DealInfo a2 = mxe.INSTANCE.a();
        if (a2 != null) {
            Log.e("dswdsw", "->>>>>>>>>>>>命中order快照");
            this.e = a2;
            return;
        }
        Log.e("dswdsw", "->>>>>>>>>>>>没命中order快照");
        Object b = muh.b(muh.ORDER_NUM);
        if (b == null || !(b instanceof DealInfo)) {
            return;
        }
        this.e = (DealInfo) b;
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else {
            this.g = strArr;
        }
    }

    public void a(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.ultron.MTBOrderDataProvider$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    d.this.f18493a = mwu.a(eVar.d());
                    muf.a(new IRemoteBaseListener() { // from class: com.taobao.mytaobao.ultron.MTBOrderDataProvider$1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            new HashMap().put("mtopOnSystemErrorCode", mtopResponse == null ? "UNKONW" : mtopResponse.getRetCode());
                            d.a(d.this, eVar);
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            } else if (baseOutDo == null || baseOutDo.mo2429getData() == null || !(baseOutDo.mo2429getData() instanceof OrderCountResponse.Results)) {
                            } else {
                                d.a(d.this, eVar, (OrderCountResponse.Results) baseOutDo.mo2429getData());
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            String retCode = mtopResponse == null ? "UNKONW" : mtopResponse.getRetCode();
                            if (mtopResponse != null) {
                                mtopResponse.getRetMsg();
                            }
                            new HashMap().put("mtopOnErrorCode", retCode);
                            d.a(d.this, eVar);
                        }
                    });
                }
            });
        }
    }

    private void a(com.alibaba.android.ultron.event.base.e eVar, OrderCountResponse.Results results) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e136bcb", new Object[]{this, eVar, results});
            return;
        }
        DealInfo dealInfo = new DealInfo();
        if (results.result != null && !results.result.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (OrderCountResponse.Order order : results.result) {
                if (order != null && order.tabCode != null) {
                    jSONObject.put(order.tabCode, (Object) order.count);
                    String str = order.tabCode;
                    char c2 = 65535;
                    switch (str.hashCode()) {
                        case -470817430:
                            if (str.equals("refunding")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 245272565:
                            if (str.equals("waitRate")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 245306013:
                            if (str.equals("waitSend")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1116288755:
                            if (str.equals("waitPay")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1143361419:
                            if (str.equals("waitConfirm")) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0) {
                        dealInfo.toPayBiz = order.count;
                    } else if (c2 == 1) {
                        dealInfo.hasPaid = order.count;
                    } else if (c2 == 2) {
                        dealInfo.toConfirmBiz = order.count;
                    } else if (c2 == 3) {
                        dealInfo.toComment = order.count;
                    } else if (c2 == 4) {
                        dealInfo.refundBiz = order.count;
                    }
                }
            }
            kng.a(jSONObject);
            mxp.a(jSONObject.toJSONString());
        }
        muh.a(muh.ORDER_NUM, dealInfo);
        if (eVar == null) {
            return;
        }
        if (eVar.a() != null && mxq.b(eVar.a())) {
            return;
        }
        mxb.a(dealInfo);
        a(eVar, dealInfo);
    }

    public static DealInfo b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DealInfo) ipChange.ipc$dispatch("801cbd08", new Object[0]) : f;
    }

    private void a(final com.alibaba.android.ultron.event.base.e eVar, DealInfo dealInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606c9f0c", new Object[]{this, eVar, dealInfo});
        } else if (dealInfo == null) {
        } else {
            boolean isSameBiz = dealInfo.isSameBiz(this.e, true, this.g);
            if (dealInfo.isSameBiz(this.e, DealInfo.KEY_TO_CONFIRM) && isSameBiz) {
                b(eVar, dealInfo);
                this.e = dealInfo;
                f = dealInfo;
                return;
            }
            this.e = dealInfo;
            f = dealInfo;
            HashMap hashMap = new HashMap();
            if (dealInfo != null) {
                try {
                    hashMap.put("orderNumInfo", JSON.toJSONString(dealInfo));
                } catch (Exception unused) {
                }
            }
            muf.a(new IRemoteBaseListener() { // from class: com.taobao.mytaobao.ultron.MTBOrderDataProvider$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    d dVar = d.this;
                    d.a(dVar, eVar, d.a(dVar), d.this.f18493a, d.this.b);
                    String retCode = mtopResponse == null ? "UNKONW" : mtopResponse.getRetCode();
                    if (mtopResponse != null) {
                        mtopResponse.getRetMsg();
                    }
                    new HashMap().put("mtopOnSystemErrorCode", retCode);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    com.alibaba.android.ultron.event.base.e eVar2 = eVar;
                    if (eVar2 == null || mxq.b(eVar2.a())) {
                        return;
                    }
                    DeliverListResponse.DeliveryData deliveryData = (DeliverListResponse.DeliveryData) baseOutDo.mo2429getData();
                    List<DeliverInfoBean> list = deliveryData.deliveryList;
                    d.this.f18493a = deliveryData.deliveryList;
                    d.this.b = deliveryData.events;
                    d dVar = d.this;
                    d.a(dVar, eVar, d.a(dVar), list, deliveryData.events);
                    ArrayList arrayList = new ArrayList(d.this.f18493a.size());
                    for (int i2 = 0; i2 < d.this.f18493a.size(); i2++) {
                        arrayList.add(d.this.f18493a.get(i2).orderId);
                    }
                    com.taobao.mytaobao.ultron.fatigue.a.a(Login.getUserId()).a(arrayList);
                    com.taobao.mytaobao.ultron.fatigue.a.a(Login.getUserId()).e();
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    d dVar = d.this;
                    d.a(dVar, eVar, d.a(dVar), d.this.f18493a, d.this.b);
                    String retCode = mtopResponse == null ? "UNKONW" : mtopResponse.getRetCode();
                    if (mtopResponse != null) {
                        mtopResponse.getRetMsg();
                    }
                    new HashMap().put("mtopOnErrorCode", retCode);
                }
            }, hashMap);
        }
    }

    private void a(final com.alibaba.android.ultron.event.base.e eVar, DealInfo dealInfo, List<DeliverInfoBean> list, JSONObject jSONObject) {
        IDMComponent d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaddda93", new Object[]{this, eVar, dealInfo, list, jSONObject});
        } else if (eVar == null || eVar.h() == null || eVar.d() == null || (d = eVar.d()) == null) {
        } else {
            mwu.a(d, list);
            mwu.a(d, dealInfo);
            mwu.a(d, jSONObject);
            final ArrayList arrayList = new ArrayList();
            arrayList.add(d);
            if (!(eVar.a() instanceof Activity)) {
                return;
            }
            ((Activity) eVar.a()).runOnUiThread(new Runnable() { // from class: com.taobao.mytaobao.ultron.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (d.b(d.this) != null && d.b(d.this).a()) {
                        d.b(d.this).a(new Runnable() { // from class: com.taobao.mytaobao.ultron.d.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            {
                                AnonymousClass2.this = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                ((com.alibaba.android.ultron.vfw.instance.d) eVar.h()).q().g(false);
                                eVar.h().a(arrayList);
                            }
                        });
                    } else {
                        ((com.alibaba.android.ultron.vfw.instance.d) eVar.h()).q().g(false);
                        eVar.h().a(arrayList);
                    }
                }
            });
        }
    }

    private void b(final com.alibaba.android.ultron.event.base.e eVar, DealInfo dealInfo) {
        IDMComponent d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f26d6cd", new Object[]{this, eVar, dealInfo});
        } else if (eVar == null || eVar.h() == null || eVar.d() == null || (d = eVar.d()) == null || !mwu.b(d, dealInfo)) {
        } else {
            final ArrayList arrayList = new ArrayList();
            arrayList.add(d);
            if (!(eVar.a() instanceof Activity)) {
                return;
            }
            ((Activity) eVar.a()).runOnUiThread(new Runnable() { // from class: com.taobao.mytaobao.ultron.MTBOrderDataProvider$4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (d.b(d.this) != null && d.b(d.this).a()) {
                        d.b(d.this).a(new Runnable() { // from class: com.taobao.mytaobao.ultron.MTBOrderDataProvider$4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                ((com.alibaba.android.ultron.vfw.instance.d) eVar.h()).q().g(false);
                                eVar.h().a(arrayList);
                            }
                        });
                    } else {
                        ((com.alibaba.android.ultron.vfw.instance.d) eVar.h()).q().g(false);
                        eVar.h().a(arrayList);
                    }
                }
            });
        }
    }

    private void b(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
            return;
        }
        DealInfo createZeroCount = DealInfo.createZeroCount();
        b(eVar, createZeroCount);
        this.e = createZeroCount;
        f = createZeroCount;
    }
}
