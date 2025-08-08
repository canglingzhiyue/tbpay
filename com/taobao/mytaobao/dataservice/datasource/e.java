package com.taobao.mytaobao.dataservice.datasource;

import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import com.taobao.tao.util.TaoHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;
import tb.nwv;
import tb.qnp;
import tb.rva;
import tb.xnq;
import tb.xnt;
import tb.xnv;
import tb.xnw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/taobao/mytaobao/dataservice/datasource/PageBackServerDataSource;", "", "mainPageDataService", "Lcom/taobao/mytaobao/dataservice/service/MainPageDataService;", "(Lcom/taobao/mytaobao/dataservice/service/MainPageDataService;)V", "diffProcessor", "Lcom/taobao/mytaobao/dataservice/utils/DiffProcessor;", "transformer", "Lcom/taobao/mytaobao/homepage/busniess/EquityNumSlideTransformer;", "buildMainDataRequest", "Lcom/taobao/tao/remotebusiness/MtopBusiness;", "pagebackContext", "Lcom/alibaba/fastjson/JSONObject;", "considerGenerateEquityNumSlideData", "", "hierarchyData", "oldDataMerger", "Lcom/taobao/mytaobao/dataservice/utils/DataMerger;", "isApiSuccess", "", "mtopStreamResponse", "Lcom/taobao/tao/stream/MtopStreamResponse;", "request", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final xnw f18373a;
    private final qnp b;
    private final xnt c;

    static {
        kge.a(-548475486);
    }

    public e(xnt mainPageDataService) {
        q.c(mainPageDataService, "mainPageDataService");
        this.c = mainPageDataService;
        this.f18373a = new xnw();
        this.b = new qnp();
    }

    public static final /* synthetic */ void a(e eVar, JSONObject jSONObject, xnv xnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ce44a", new Object[]{eVar, jSONObject, xnvVar});
        } else {
            eVar.a(jSONObject, xnvVar);
        }
    }

    public final void a(JSONObject pagebackContext) {
        final xnv xnvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, pagebackContext});
            return;
        }
        q.c(pagebackContext, "pagebackContext");
        if (this.c.o()) {
            return;
        }
        this.c.a(true);
        xnv n = this.c.n();
        if (n == null || (xnvVar = n.m()) == null) {
            xnvVar = new xnv(null, 1, null);
        }
        MtopBusiness b = b(pagebackContext);
        if (b == null) {
            return;
        }
        HandlerThread a2 = com.taobao.mytaobao.base.b.a();
        q.a((Object) a2, "MtbExecutor.getMtopHandlerThread()");
        b.mo1296handler(new Handler(a2.getLooper()));
        b.mo1330supportStreamJson(true);
        b.streamMode(true);
        b.registerListener(new IMtopStreamListener() { // from class: com.taobao.mytaobao.dataservice.datasource.PageBackServerDataSource$request$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.stream.IMtopStreamListener
            public void onFinish(com.taobao.tao.stream.c cVar, int i, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
                    return;
                }
                TLog.loge("mtbMainLink", "我淘pageback流式 onFinish");
                e eVar = e.this;
                e.$ipChange.a(false);
                xnvVar.p();
                e eVar2 = e.this;
                e.$ipChange.a(new xnq(3), xnvVar);
            }

            @Override // com.taobao.tao.stream.IMtopStreamListener
            public void onReceiveData(com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i, Object obj) {
                JSONObject jSONObject;
                byte[] bArr;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
                    return;
                }
                String str = null;
                String str2 = (dVar == null || (bArr = dVar.e) == null) ? null : new String(bArr, kotlin.text.d.UTF_8);
                TLog.loge("mtbMainLink", "我淘pageback流式: " + str2);
                e eVar = e.this;
                if (!e.$ipChange) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pageBack failed, retCode=");
                    sb.append(dVar != null ? dVar.f21113a : null);
                    sb.append(" retMsg=");
                    if (dVar != null) {
                        str = dVar.b;
                    }
                    sb.append(str);
                    nwv.f(sb.toString());
                    return;
                }
                if (str2 == null) {
                    q.a();
                }
                JSONObject parseObject = JSONObject.parseObject(str2);
                if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
                    return;
                }
                e eVar2 = e.this;
                xnv n2 = e.$ipChange.n();
                if (n2 == null) {
                    q.a();
                }
                xnvVar.b(jSONObject);
                xnv xnvVar2 = xnvVar;
                JSONObject d = n2.d();
                if (d == null) {
                    q.a();
                }
                xnvVar2.a(d);
                JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchyData");
                if (jSONObject2 == null) {
                    return;
                }
                e.a(e.this, jSONObject2, n2);
                e eVar3 = e.this;
                e.$ipChange.a(jSONObject2, xnvVar, n2);
                if (!(!jSONObject2.isEmpty())) {
                    return;
                }
                e eVar4 = e.this;
                rva<xnq, JSONObject, JSONObject, t> k = e.$ipChange.k();
                if (k == null) {
                    return;
                }
                xnq xnqVar = new xnq(3);
                JSONObject d2 = xnvVar.d();
                if (d2 == null) {
                    q.a();
                }
                k.invoke(xnqVar, jSONObject2, d2);
            }

            @Override // com.taobao.tao.stream.IMtopStreamListener
            public void onError(com.taobao.tao.stream.b bVar, int i, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
                    return;
                }
                e eVar = e.this;
                e.$ipChange.a(false);
                StringBuilder sb = new StringBuilder();
                sb.append("retCode=");
                String str = null;
                sb.append(bVar != null ? bVar.b : null);
                sb.append(" retMsg=");
                if (bVar != null) {
                    str = bVar.c;
                }
                sb.append(str);
                String sb2 = sb.toString();
                TLog.loge("mtbMainLink", "我淘pageback流式 onError " + sb2);
            }
        });
        b.startRequest();
    }

    private final MtopBusiness b(JSONObject jSONObject) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("844e1c6d", new Object[]{this, jSONObject});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.reborn.mclaren.pageback.stream");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject2 = new JSONObject();
        String string = jSONObject2.getString(PushConstants.PARAMS);
        if (StringUtils.isEmpty(string)) {
            parseObject = new JSONObject();
        } else {
            parseObject = JSON.parseObject(string);
            q.a((Object) parseObject, "JSON.parseObject(paramsStr)");
        }
        JSONObject jSONObject3 = parseObject;
        String str = com.taobao.mytaobao.base.c.x;
        if (str == null) {
            str = "";
        }
        jSONObject3.put((JSONObject) "pageLeaveUrl", str);
        if (jSONObject != null) {
            parseObject.putAll(jSONObject);
        }
        jSONObject2.put(PushConstants.PARAMS, (Object) JSON.toJSONString(parseObject));
        com.taobao.mytaobao.base.c.x = null;
        mtopRequest.setData(JSONObject.toJSONString(jSONObject2));
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.mo1305reqMethod(MethodEnum.POST);
        return build;
    }

    private final boolean a(com.taobao.tao.stream.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89241a28", new Object[]{this, dVar})).booleanValue() : (dVar == null || !ErrorConstant.isSuccess(dVar.f21113a) || dVar.e == null) ? false : true;
    }

    private final void a(JSONObject jSONObject, xnv xnvVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d28a5b8", new Object[]{this, jSONObject, xnvVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("benefitModule2024V2");
        if (jSONObject2 == null) {
            jSONObject2 = jSONObject.getJSONObject("headerModule");
        }
        if (jSONObject2 == null) {
            return;
        }
        JSONObject jSONObject3 = xnvVar.c().getJSONObject("benefitModule2024V2");
        if (jSONObject3 == null) {
            jSONObject3 = xnvVar.c().getJSONObject("headerModule");
        }
        if (jSONObject3 == null) {
            return;
        }
        qnp qnpVar = this.b;
        if (this.c.g().getIntValue("sourceFrom") != 1) {
            z = false;
        }
        qnpVar.b(jSONObject2, jSONObject3, false, z);
    }
}
