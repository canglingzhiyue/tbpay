package com.taobao.mytaobao.dataservice.datasource;

import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import com.taobao.tao.util.TaoHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.mxa;
import tb.nwv;
import tb.xnq;
import tb.xnt;
import tb.xnv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0002J\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lcom/taobao/mytaobao/dataservice/datasource/MainApiRequestTask;", "", "mainPageDataService", "Lcom/taobao/mytaobao/dataservice/service/MainPageDataService;", "(Lcom/taobao/mytaobao/dataservice/service/MainPageDataService;)V", "cacheFinishSchema", "Lcom/taobao/mytaobao/dataservice/datasource/FinishDataSchema;", "cacheReceiveDataEventList", "", "Lcom/taobao/mytaobao/dataservice/datasource/ReceiveDataSchema;", "hasSubscribed", "", "getHasSubscribed", "()Z", "setHasSubscribed", "(Z)V", "mDataMerger", "Lcom/taobao/mytaobao/dataservice/utils/DataMerger;", "mReason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "mtopStreamListener", "Lcom/taobao/tao/stream/IMtopStreamListener;", "remoteBaseListener", "Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "getRemoteBaseListener", "()Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;", "setRemoteBaseListener", "(Lcom/taobao/tao/remotebusiness/IRemoteBaseListener;)V", "buildMainDataRequest", "Lmtopsdk/mtop/domain/MtopRequest;", "checkHasSubscribed", "considerPlayBackUnConsumedEvents", "", "request", "dataMerger", "reason", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private IRemoteBaseListener f18369a;
    private xnv b;
    private xnq c;
    private a d;
    private final List<f> e = new ArrayList();
    private boolean f = true;
    private IMtopStreamListener g;
    private final xnt h;

    static {
        kge.a(-1781574473);
    }

    public b(xnt xntVar) {
        this.h = xntVar;
    }

    public static final /* synthetic */ void a(b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749da26b", new Object[]{bVar, aVar});
        } else {
            bVar.d = aVar;
        }
    }

    public static final /* synthetic */ boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fab4fc7d", new Object[]{bVar})).booleanValue() : bVar.d();
    }

    public static final /* synthetic */ List b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a5dabccd", new Object[]{bVar}) : bVar.e;
    }

    public final void a(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{this, iRemoteBaseListener});
        } else {
            this.f18369a = iRemoteBaseListener;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f;
    }

    public final void b() {
        a aVar;
        IMtopStreamListener iMtopStreamListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f && d() && (aVar = this.d) != null && (iMtopStreamListener = this.g) != null && !this.e.isEmpty()) {
            this.f = true;
            nwv.f("发射补偿事件");
            for (f fVar : this.e) {
                iMtopStreamListener.onReceiveData(fVar.a(), fVar.b(), fVar.c(), fVar.d());
            }
            iMtopStreamListener.onFinish(aVar.a(), aVar.b(), aVar.c());
            nwv.f("发射补偿事件完成");
        }
    }

    public final void a(xnv dataMerger, xnq reason, final IMtopStreamListener mtopStreamListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ef6ede", new Object[]{this, dataMerger, reason, mtopStreamListener});
            return;
        }
        q.c(dataMerger, "dataMerger");
        q.c(reason, "reason");
        q.c(mtopStreamListener, "mtopStreamListener");
        this.b = dataMerger;
        this.c = reason;
        this.g = mtopStreamListener;
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), c(), TaoHelper.getTTID());
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.mo1305reqMethod(MethodEnum.POST);
        HandlerThread a2 = com.taobao.mytaobao.base.b.a();
        q.a((Object) a2, "MtbExecutor.getMtopHandlerThread()");
        build.mo1296handler(new Handler(a2.getLooper()));
        if (ABGlobal.isFeatureOpened(Globals.getApplication(), "disableMtbStream")) {
            build.streamMode(false);
            build.registerListener((IRemoteListener) this.f18369a);
        } else {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            build.streamMode(true);
            build.registerListener(new IMtopStreamListener() { // from class: com.taobao.mytaobao.dataservice.datasource.MainApiRequestTask$request$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onFinish(com.taobao.tao.stream.c cVar, int i, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
                    } else if (b.this.a()) {
                        mtopStreamListener.onFinish(cVar, i, obj);
                    } else {
                        b.a(b.this, new a(cVar, i, obj));
                        b.this.b();
                    }
                }

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onReceiveData(com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
                        return;
                    }
                    if (booleanRef.element) {
                        booleanRef.element = false;
                        b bVar = b.this;
                        bVar.a(b.a(bVar));
                    }
                    if (b.this.a()) {
                        mtopStreamListener.onReceiveData(dVar, baseOutDo, i, obj);
                    } else {
                        b.b(b.this).add(new f(dVar, baseOutDo, i, obj));
                    }
                }

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onError(com.taobao.tao.stream.b bVar, int i, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
                    } else if (!b.this.a()) {
                    } else {
                        mtopStreamListener.onError(bVar, i, obj);
                    }
                }
            });
        }
        build.startRequest();
    }

    private final MtopRequest c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("1247795", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (TBRevisionSwitchManager.i().a("new2021UIEnable") && mxa.c()) {
            z = true;
        }
        jSONObject2.put("new2021UIEnable", (Object) Boolean.valueOf(z));
        String jSONString = JSON.toJSONString(com.taobao.mytaobao.ultron.fatigue.a.a(Login.getUserId()).b());
        if (!StringUtils.isEmpty(jSONString)) {
            jSONObject2.put("orderFatigue", (Object) jSONString);
        }
        if (com.taobao.android.tbelder.b.c()) {
            jSONObject2.put("elderFont", (Object) "true");
        }
        jSONObject.put(PushConstants.PARAMS, (Object) JSON.toJSONString(jSONObject2));
        jSONObject.put("deviceLevel", (Object) String.valueOf(com.taobao.mytaobao.base.c.a()));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.reborn.mclaren.stream");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(JSONObject.toJSONString(jSONObject));
        return mtopRequest;
    }

    private final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        xnt xntVar = this.h;
        return xntVar == null || !(xntVar.j() == null || this.h.m() == null || this.h.l() == null || this.h.k() == null);
    }
}
