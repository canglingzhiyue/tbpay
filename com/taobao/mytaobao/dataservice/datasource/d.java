package com.taobao.mytaobao.dataservice.datasource;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.stream.IMtopStreamListener;
import com.taobao.themis.kernel.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;
import tb.nwv;
import tb.qnp;
import tb.ruw;
import tb.rva;
import tb.xnq;
import tb.xnt;
import tb.xnv;
import tb.xnw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\"\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\"\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010 \u001a\u00020\u0012J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J*\u0010%\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0004H\u0002J\u0018\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/taobao/mytaobao/dataservice/datasource/MainPageServerDataSource;", "", "()V", "cacheTask", "Lcom/taobao/mytaobao/dataservice/datasource/MainApiRequestTask;", "diffProcessor", "Lcom/taobao/mytaobao/dataservice/utils/DiffProcessor;", "isFirst", "", "localDataSource", "Lcom/taobao/mytaobao/dataservice/datasource/MainPageLocalDataSource;", "getLocalDataSource", "()Lcom/taobao/mytaobao/dataservice/datasource/MainPageLocalDataSource;", "setLocalDataSource", "(Lcom/taobao/mytaobao/dataservice/datasource/MainPageLocalDataSource;)V", "transformer", "Lcom/taobao/mytaobao/homepage/busniess/EquityNumSlideTransformer;", "considerDispatchDataChange", "", "reason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "data", "Lcom/alibaba/fastjson/JSONObject;", "dataMerger", "Lcom/taobao/mytaobao/dataservice/utils/DataMerger;", "mainPageDataService", "Lcom/taobao/mytaobao/dataservice/service/MainPageDataService;", "considerDispatchGlobalChange", "considerDispatchLayoutChange", "considerGenerateEquityNumSlideData", "hierarchyData", "oldDataMerger", "considerPlayBackUnConsumedEvents", "delaySaveSnapshot", "isApiSuccess", "mtopStreamResponse", "Lcom/taobao/tao/stream/MtopStreamResponse;", "processNoStreamCallbackForDebug", "task", "request", i.CDN_REQUEST_TYPE, "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final xnw f18371a = new xnw();
    private boolean b = true;
    private final qnp c = new qnp();
    private c d;
    private b e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ xnv b;

        public a(xnv xnvVar) {
            this.b = xnvVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c a2 = d.this.a();
            if (a2 == null) {
                return;
            }
            a2.a(this.b);
        }
    }

    static {
        kge.a(1121740148);
    }

    public static final /* synthetic */ void a(d dVar, xnq xnqVar, JSONObject jSONObject, xnt xntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd93756", new Object[]{dVar, xnqVar, jSONObject, xntVar});
        } else {
            dVar.a(xnqVar, jSONObject, xntVar);
        }
    }

    public static final /* synthetic */ void a(d dVar, xnq xnqVar, JSONObject jSONObject, xnv xnvVar, xnt xntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a39586", new Object[]{dVar, xnqVar, jSONObject, xnvVar, xntVar});
        } else {
            dVar.a(xnqVar, jSONObject, xnvVar, xntVar);
        }
    }

    public static final /* synthetic */ void a(d dVar, xnv xnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b467067", new Object[]{dVar, xnvVar});
        } else {
            dVar.a(xnvVar);
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07747d", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.b = z;
        }
    }

    public static final /* synthetic */ void b(d dVar, xnq xnqVar, JSONObject jSONObject, xnt xntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b565f7b5", new Object[]{dVar, xnqVar, jSONObject, xntVar});
        } else {
            dVar.b(xnqVar, jSONObject, xntVar);
        }
    }

    public final c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("233970de", new Object[]{this}) : this.d;
    }

    public final void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab570d8", new Object[]{this, cVar});
        } else {
            this.d = cVar;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    public final void a(final int i, final xnt xntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bde920d", new Object[]{this, new Integer(i), xntVar});
        } else if (xntVar != null && xntVar.o()) {
        } else {
            if (xntVar != null) {
                xntVar.a(true);
            }
            b bVar = new b(xntVar);
            final xnq xnqVar = new xnq(3);
            final xnv xnvVar = new xnv(null, 1, null);
            a(xntVar, xnvVar, xnqVar, bVar);
            bVar.a(xnvVar, xnqVar, new IMtopStreamListener() { // from class: com.taobao.mytaobao.dataservice.datasource.MainPageServerDataSource$request$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onFinish(com.taobao.tao.stream.c cVar, int i2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i2), obj});
                        return;
                    }
                    xnt xntVar2 = xntVar;
                    if (xntVar2 != null) {
                        xntVar2.a(false);
                    }
                    d.a(d.this, false);
                    if (!xnvVar.o()) {
                        return;
                    }
                    xnvVar.p();
                    int i3 = i;
                    if (i3 == 2 || (i3 == 3 && xnvVar.f())) {
                        xnqVar.a(ai.b(j.a("refreshBasement", true)));
                    }
                    xnt xntVar3 = xntVar;
                    if (xntVar3 != null) {
                        xntVar3.a(xnqVar, xnvVar);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("我淘主接口流式 onFinish: ");
                    sb.append(cVar != null ? cVar.toString() : null);
                    TLog.loge("mtbMainLink", sb.toString());
                    d.a(d.this, xnvVar);
                }

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onReceiveData(com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i2, Object obj) {
                    JSONObject jSONObject;
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i2), obj});
                        return;
                    }
                    String str = null;
                    String str2 = (dVar == null || (bArr = dVar.e) == null) ? null : new String(bArr, kotlin.text.d.UTF_8);
                    TLog.loge("mtbMainLink", "我淘主接口流式: " + str2);
                    d dVar2 = d.this;
                    if (d.$ipChange) {
                        if (str2 == null) {
                            q.a();
                        }
                        JSONObject parseObject = JSONObject.parseObject(str2);
                        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
                            return;
                        }
                        xnvVar.b(jSONObject);
                        d.a(d.this, xnqVar, jSONObject, xntVar);
                        d.b(d.this, xnqVar, jSONObject, xntVar);
                        d.a(d.this, xnqVar, jSONObject, xnvVar, xntVar);
                        return;
                    }
                    xnvVar.q();
                    StringBuilder sb = new StringBuilder();
                    sb.append("retCode=");
                    sb.append(dVar != null ? dVar.f21113a : null);
                    sb.append(" retMsg=");
                    if (dVar != null) {
                        str = dVar.b;
                    }
                    sb.append(str);
                    String sb2 = sb.toString();
                    xnt xntVar2 = xntVar;
                    if (xntVar2 == null) {
                        return;
                    }
                    xntVar2.a(sb2);
                }

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onError(com.taobao.tao.stream.b bVar2, int i2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5fad801", new Object[]{this, bVar2, new Integer(i2), obj});
                        return;
                    }
                    xnt xntVar2 = xntVar;
                    if (xntVar2 != null) {
                        xntVar2.a(false);
                    }
                    xnvVar.q();
                    StringBuilder sb = new StringBuilder();
                    sb.append("retCode=");
                    String str = null;
                    sb.append(bVar2 != null ? bVar2.b : null);
                    sb.append(" retMsg=");
                    if (bVar2 != null) {
                        str = bVar2.c;
                    }
                    sb.append(str);
                    String sb2 = sb.toString();
                    TLog.loge("mtbMainLink", "我淘主接口流式 onError " + sb2);
                    xnt xntVar3 = xntVar;
                    if (xntVar3 == null) {
                        return;
                    }
                    xntVar3.a(sb2);
                }
            });
            if (!this.b) {
                return;
            }
            this.e = bVar;
        }
    }

    private final boolean a(com.taobao.tao.stream.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89241a28", new Object[]{this, dVar})).booleanValue() : (dVar == null || !ErrorConstant.isSuccess(dVar.f21113a) || dVar.e == null) ? false : true;
    }

    private final void a(xnq xnqVar, JSONObject jSONObject, xnt xntVar) {
        JSONObject jSONObject2;
        ruw<xnq, JSONObject, t> j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f65c45", new Object[]{this, xnqVar, jSONObject, xntVar});
        } else if (xntVar == null || (jSONObject2 = jSONObject.getJSONObject("global")) == null || (j = xntVar.j()) == null) {
        } else {
            j.mo2423invoke(xnqVar, jSONObject2);
        }
    }

    private final void b(xnq xnqVar, JSONObject jSONObject, xnt xntVar) {
        JSONArray jSONArray;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f11dae4", new Object[]{this, xnqVar, jSONObject, xntVar});
        } else if (xntVar != null && (jSONArray = jSONObject.getJSONArray("hierarchy")) != null) {
            JSONArray jSONArray2 = new JSONArray();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                jSONArray2.addAll(jSONArray.getJSONArray(i));
            }
            ArrayList arrayList = new ArrayList();
            int size2 = jSONArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                if (jSONObject2 != null && (string = jSONObject2.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME)) != null) {
                    arrayList.add(string);
                }
            }
            if (!(!arrayList.isEmpty())) {
                return;
            }
            ruw<xnq, List<String>, t> m = xntVar.m();
            if (m != null) {
                m.mo2423invoke(xnqVar, arrayList);
            }
            ruw<xnq, JSONArray, t> l = xntVar.l();
            if (l == null) {
                return;
            }
            l.mo2423invoke(xnqVar, jSONArray2);
        }
    }

    private final void a(xnq xnqVar, JSONObject jSONObject, xnv xnvVar, xnt xntVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60405b75", new Object[]{this, xnqVar, jSONObject, xnvVar, xntVar});
            return;
        }
        nwv.f("considerDispatchDataChange 001");
        if (xntVar == null || (jSONObject2 = jSONObject.getJSONObject("hierarchyData")) == null) {
            return;
        }
        nwv.f("considerDispatchDataChange 002");
        xnv n = xntVar.n();
        a(jSONObject2, n, xntVar);
        this.f18371a.a(jSONObject2, xnvVar, n);
        if (!(!jSONObject2.isEmpty())) {
            return;
        }
        nwv.f("considerDispatchDataChange 003");
        rva<xnq, JSONObject, JSONObject, t> k = xntVar.k();
        if (k == null) {
            return;
        }
        JSONObject d = xnvVar.d();
        if (d == null) {
            q.a();
        }
        k.invoke(xnqVar, jSONObject2, d);
    }

    private final void a(JSONObject jSONObject, xnv xnvVar, xnt xntVar) {
        JSONObject jSONObject2;
        JSONObject c;
        JSONObject c2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4574372a", new Object[]{this, jSONObject, xnvVar, xntVar});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("benefitModule2024V2");
        if (jSONObject3 == null) {
            jSONObject3 = jSONObject.getJSONObject("headerModule");
        }
        if (jSONObject3 == null) {
            return;
        }
        if (xnvVar == null || (c2 = xnvVar.c()) == null || (jSONObject2 = c2.getJSONObject("benefitModule2024V2")) == null) {
            jSONObject2 = (xnvVar == null || (c = xnvVar.c()) == null) ? null : c.getJSONObject("headerModule");
        }
        if (jSONObject2 == null) {
            return;
        }
        qnp qnpVar = this.c;
        boolean z2 = this.b;
        if (xntVar.g().getIntValue("sourceFrom") == 1) {
            z = true;
        }
        qnpVar.b(jSONObject3, jSONObject2, z2, z);
    }

    private final void a(final xnt xntVar, final xnv xnvVar, final xnq xnqVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858b8030", new Object[]{this, xntVar, xnvVar, xnqVar, bVar});
        } else {
            bVar.a(new IRemoteBaseListener() { // from class: com.taobao.mytaobao.dataservice.datasource.MainPageServerDataSource$processNoStreamCallbackForDebug$remoteBaseListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    xnt xntVar2 = xntVar;
                    if (xntVar2 != null) {
                        xntVar2.a(false);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("mtop onReceiveData: ");
                    sb.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                    nwv.f(sb.toString());
                    if (mtopResponse == null) {
                        q.a();
                    }
                    byte[] bytedata = mtopResponse.getBytedata();
                    q.a((Object) bytedata, "response!!.bytedata");
                    JSONObject parseObject = JSONObject.parseObject(new String(bytedata, kotlin.text.d.UTF_8));
                    if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
                        return;
                    }
                    xnvVar.b(jSONObject);
                    d.a(d.this, xnqVar, jSONObject, xntVar);
                    d.b(d.this, xnqVar, jSONObject, xntVar);
                    d.a(d.this, xnqVar, jSONObject, xnvVar, xntVar);
                    d.a(d.this, false);
                    xnvVar.p();
                    xnt xntVar3 = xntVar;
                    if (xntVar3 != null) {
                        xntVar3.a(xnqVar, xnvVar);
                    }
                    nwv.f("mtop onFinish: " + String.valueOf(i));
                    d.a(d.this, xnvVar);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    xnt xntVar2 = xntVar;
                    if (xntVar2 != null) {
                        xntVar2.a(false);
                    }
                    xnvVar.q();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mtop onError: ");
                    String str = null;
                    sb.append(mtopResponse != null ? mtopResponse.toString() : null);
                    nwv.f(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("retCode=");
                    sb2.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                    sb2.append(" retMsg=");
                    if (mtopResponse != null) {
                        str = mtopResponse.getRetMsg();
                    }
                    sb2.append(str);
                    String sb3 = sb2.toString();
                    xnt xntVar3 = xntVar;
                    if (xntVar3 == null) {
                        return;
                    }
                    xntVar3.a(sb3);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    xnt xntVar2 = xntVar;
                    if (xntVar2 != null) {
                        xntVar2.a(false);
                    }
                    xnvVar.q();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mtop onError: ");
                    String str = null;
                    sb.append(mtopResponse != null ? mtopResponse.toString() : null);
                    nwv.f(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("retCode=");
                    sb2.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                    sb2.append(" retMsg=");
                    if (mtopResponse != null) {
                        str = mtopResponse.getRetMsg();
                    }
                    sb2.append(str);
                    String sb3 = sb2.toString();
                    xnt xntVar3 = xntVar;
                    if (xntVar3 == null) {
                        return;
                    }
                    xntVar3.a(sb3);
                }
            });
        }
    }

    private final void a(xnv xnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f3698", new Object[]{this, xnvVar});
        } else {
            com.taobao.mytaobao.base.b.a(new a(xnvVar), 1000L);
        }
    }
}
