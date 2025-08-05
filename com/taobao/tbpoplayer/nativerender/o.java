package com.taobao.tbpoplayer.nativerender;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.PreFetchModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.qnw;

/* loaded from: classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final e f22242a;

    /* loaded from: classes8.dex */
    public interface a {
        void onSuccess();
    }

    static {
        kge.a(-1409579289);
    }

    public static /* synthetic */ void lambda$FGVqo1LebUbOLbACzn0Gv4rNnNk(o oVar, List list, CountDownLatch countDownLatch) {
        oVar.b(list, countDownLatch);
    }

    public static /* synthetic */ void lambda$IeZk4Z4RlA9nO7_xM1Ur4lfDfVo(o oVar, List list, CountDownLatch countDownLatch) {
        oVar.c(list, countDownLatch);
    }

    public static /* synthetic */ e a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("5c2c07b8", new Object[]{oVar}) : oVar.f22242a;
    }

    public o(e eVar) {
        this.f22242a = eVar;
    }

    public void a(DSLModel dSLModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733aa727", new Object[]{this, dSLModel});
        } else if (dSLModel == null) {
        } else {
            try {
                if (dSLModel.prefetch == null || dSLModel.prefetch.isEmpty()) {
                    return;
                }
                b(dSLModel);
            } catch (Throwable unused) {
                this.f22242a.a("prePareDisplayFailed", "");
            }
        }
    }

    private void b(DSLModel dSLModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5625c6", new Object[]{this, dSLModel});
            return;
        }
        ArrayList<PreFetchModel> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (PreFetchModel preFetchModel : dSLModel.prefetch) {
            if (!preFetchModel.isValid()) {
                this.f22242a.a("PrefetchConfigInValid", "");
                return;
            } else if (p.a(preFetchModel.requestParams) || (preFetchModel.preCondition != null && preFetchModel.preCondition.isValid())) {
                arrayList2.add(preFetchModel);
            } else {
                arrayList.add(preFetchModel);
            }
        }
        if (!arrayList.isEmpty()) {
            final CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
            for (PreFetchModel preFetchModel2 : arrayList) {
                if ("mtop".equals(preFetchModel2.dataSource)) {
                    countDownLatch.getClass();
                    a(preFetchModel2, new a() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$0wD6A1qKjwF2jAMlS2Hp_i0eIoE
                        @Override // com.taobao.tbpoplayer.nativerender.o.a
                        public final void onSuccess() {
                            countDownLatch.countDown();
                        }
                    });
                } else if ("windvane".equals(preFetchModel2.dataSource)) {
                    countDownLatch.getClass();
                    b(preFetchModel2, new a() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$0wD6A1qKjwF2jAMlS2Hp_i0eIoE
                        @Override // com.taobao.tbpoplayer.nativerender.o.a
                        public final void onSuccess() {
                            countDownLatch.countDown();
                        }
                    });
                }
            }
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.f22242a.a("prePareParallelDisplayOutOfTime", "");
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        CountDownLatch countDownLatch2 = new CountDownLatch(arrayList2.size());
        a(arrayList2, countDownLatch2);
        try {
            countDownLatch2.await(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            this.f22242a.a("prePareSerialDisplayOutOfTime", "");
        }
    }

    private void a(final List<PreFetchModel> list, final CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261f79fd", new Object[]{this, list, countDownLatch});
        } else if (list == null || list.isEmpty()) {
        } else {
            PreFetchModel remove = list.remove(0);
            if (!b.a(remove.preCondition, this.f22242a, true)) {
                a(list, countDownLatch);
                countDownLatch.countDown();
            } else if ("mtop".equals(remove.dataSource)) {
                a(remove, new a() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$o$IeZk4Z4RlA9nO7_xM1Ur4lfDfVo
                    {
                        o.this = this;
                    }

                    @Override // com.taobao.tbpoplayer.nativerender.o.a
                    public final void onSuccess() {
                        o.lambda$IeZk4Z4RlA9nO7_xM1Ur4lfDfVo(o.this, list, countDownLatch);
                    }
                });
            } else if ("windvane".equals(remove.dataSource)) {
                b(remove, new a() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$o$FGVqo1LebUbOLbACzn0Gv4rNnNk
                    {
                        o.this = this;
                    }

                    @Override // com.taobao.tbpoplayer.nativerender.o.a
                    public final void onSuccess() {
                        o.lambda$FGVqo1LebUbOLbACzn0Gv4rNnNk(o.this, list, countDownLatch);
                    }
                });
            } else {
                a(list, countDownLatch);
                countDownLatch.countDown();
            }
        }
    }

    public /* synthetic */ void c(List list, CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff9a83b", new Object[]{this, list, countDownLatch});
            return;
        }
        a(list, countDownLatch);
        countDownLatch.countDown();
    }

    public /* synthetic */ void b(List list, CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30c911c", new Object[]{this, list, countDownLatch});
            return;
        }
        a(list, countDownLatch);
        countDownLatch.countDown();
    }

    private void a(final PreFetchModel preFetchModel, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4aab2a2", new Object[]{this, preFetchModel, aVar});
        } else if (this.f22242a.a().g()) {
        } else {
            try {
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName(preFetchModel.requestAddress);
                mtopRequest.setVersion(!TextUtils.isEmpty(preFetchModel.requestVer) ? preFetchModel.requestVer : !TextUtils.isEmpty(preFetchModel.version) ? preFetchModel.version : "1.0");
                mtopRequest.setNeedEcode(false);
                mtopRequest.setData(p.a(this.f22242a, preFetchModel.requestParams));
                MtopBusiness mo1305reqMethod = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tbpoplayer.nativerender.PreRequestFetcher$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        e a2 = o.a(o.this);
                        StringBuilder sb = new StringBuilder();
                        sb.append("dealPreFetchMTOP.onSystemError.retCode=");
                        sb.append(mtopResponse != null ? mtopResponse.getRetCode() : "");
                        a2.a("PrefetchMtopFailed", sb.toString());
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        if (mtopResponse != null && mtopResponse.isApiSuccess() && mtopResponse.getBytedata() != null) {
                            try {
                                String str = new String(mtopResponse.getBytedata(), "UTF-8");
                                if (!TextUtils.isEmpty(str)) {
                                    com.alibaba.poplayer.utils.c.a("dealPreFetch.MTOP.apiName=%s.params=%s.result=%s", preFetchModel.requestAddress, preFetchModel.requestParams, str);
                                    JSONObject jSONObject = JSON.parseObject(str).getJSONObject("data");
                                    if (jSONObject != null) {
                                        o.a(o.this).a(preFetchModel.dataId, jSONObject);
                                        if (!b.a(preFetchModel.requestSuccessJudge, o.a(o.this), true)) {
                                            o.a(o.this).a("PrefetchMtopJudgeFailed", "dealPreFetchMTOP.onSuccess.conditionCheckFailed.");
                                            return;
                                        } else {
                                            aVar.onSuccess();
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                com.alibaba.poplayer.utils.c.a("dealPreFetchMTOP.parseObject.responseContent.error.", th);
                            }
                        }
                        o.a(o.this).a("PrefetchMtopFailed", "dealPreFetchMTOP.onSuccess.getDataFailed.");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        e a2 = o.a(o.this);
                        StringBuilder sb = new StringBuilder();
                        sb.append("dealPreFetchMTOP.onError.retCode=");
                        sb.append(mtopResponse != null ? mtopResponse.getRetCode() : "");
                        a2.a("PrefetchMtopFailed", sb.toString());
                    }
                }).mo1342showLoginUI(false).mo1305reqMethod("GET".equals(preFetchModel.requestMethod) ? MethodEnum.GET : MethodEnum.POST);
                if (preFetchModel.needWua) {
                    mo1305reqMethod.mo1335useWua();
                }
                if (!TextUtils.isEmpty(preFetchModel.safeToken)) {
                    mo1305reqMethod.mo1289addHttpQueryParameter("asac", preFetchModel.safeToken);
                }
                mo1305reqMethod.startRequest();
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("dealPreFetchMTOP.mtop.error.", th);
                this.f22242a.a("PrefetchMtopError", "");
            }
        }
    }

    private void b(final PreFetchModel preFetchModel, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e364ea63", new Object[]{this, preFetchModel, aVar});
        } else if (this.f22242a.a().g()) {
        } else {
            try {
                if (this.f22242a.d().a(preFetchModel.requestMethodName, p.a(this.f22242a, preFetchModel.requestParams), this.f22242a.a().d(), new qnw.a() { // from class: com.taobao.tbpoplayer.nativerender.o.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        o.this = this;
                    }

                    @Override // tb.qnw.a
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        try {
                            com.alibaba.poplayer.utils.c.a("dealPreFetch.WINDVANE.apiName=%s.params=%s.result=%s", preFetchModel.requestMethod, preFetchModel.requestParams, str);
                            o.a(o.this).a(preFetchModel.dataId, JSON.parseObject(str));
                            if (!b.a(preFetchModel.requestSuccessJudge, o.a(o.this), true)) {
                                o.a(o.this).a("PrefetchWindvaneJudgeFailed", "dealPreFetchWindvane.onSuccess.conditionCheckFailed.");
                            } else {
                                aVar.onSuccess();
                            }
                        } catch (Throwable unused) {
                            o.a(o.this).a("PrefetchWindvaneParseJsonFailed", str);
                        }
                    }

                    @Override // tb.qnw.a
                    public void b(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                        } else {
                            o.a(o.this).a("PrefetchWindvaneFailed", str);
                        }
                    }
                })) {
                    return;
                }
                this.f22242a.a("PrefetchWindvaneInvalid", "");
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("dealPreFetchMTOP.windvane.error.", th);
                this.f22242a.a("PrefetchWindvaneError", "");
            }
        }
    }
}
