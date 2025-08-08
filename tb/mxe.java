package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.homepage.busniess.acds.DealInfo;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020,J\u0018\u0010-\u001a\u0004\u0018\u00010\u00192\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190/J\u0016\u00100\u001a\u00020,2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190/J\u0018\u00101\u001a\u0004\u0018\u00010\u00192\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190/J\b\u00102\u001a\u0004\u0018\u00010\u0019J\b\u00103\u001a\u00020,H\u0002J\b\u00104\u001a\u00020,H\u0007J\u0006\u00105\u001a\u00020,J\u0006\u00106\u001a\u00020,J\u0006\u00107\u001a\u00020\u0010J\b\u00108\u001a\u00020,H\u0007J\u0006\u00109\u001a\u00020,J\"\u0010:\u001a\u00020,2\b\u0010;\u001a\u0004\u0018\u00010\u00152\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190/H\u0003J\n\u0010<\u001a\u0004\u0018\u00010\u0015H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0007\u001a\u0004\u0018\u00010%@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006="}, d2 = {"Lcom/taobao/mytaobao/data/MtbDataService;", "", "()V", "FETCHING", "", c.LIVE_FINISH_STATUS, Configuration.IDLE, "<set-?>", "Lcom/taobao/mytaobao/data/FeedMtopPrefetcher;", "feedMtopFetcher", "getFeedMtopFetcher", "()Lcom/taobao/mytaobao/data/FeedMtopPrefetcher;", "Lcom/taobao/mytaobao/data/FeedSnapshotPrefetcher;", "feedSnapshotFetcher", "getFeedSnapshotFetcher", "()Lcom/taobao/mytaobao/data/FeedSnapshotPrefetcher;", "", "isSnapshotWeex", "()Z", "mainDataPreFetchStatus", "mainDataPrefetchCache", "Lmtopsdk/mtop/domain/MtopResponse;", "mainDataPrefetchLatch", "Ljava/util/concurrent/CountDownLatch;", "snapshotMainData", "Lcom/alibaba/fastjson/JSONObject;", "snapshotOrderData", "Lcom/taobao/mytaobao/homepage/busniess/acds/DealInfo;", "getSnapshotOrderData", "()Lcom/taobao/mytaobao/homepage/busniess/acds/DealInfo;", "setSnapshotOrderData", "(Lcom/taobao/mytaobao/homepage/busniess/acds/DealInfo;)V", "snapshotType", "getSnapshotType", "()I", "setSnapshotType", "(I)V", "", "snapshotWeexUrl", "getSnapshotWeexUrl", "()Ljava/lang/String;", "buildMainDataRequest", "Lmtopsdk/mtop/domain/MtopRequest;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "fetchFirstFeedData", "callback", "Lcom/taobao/mytaobao/basement/listener/BasementCommonCallback;", "fetchMainData", "fetchSecondFeedData", "fetchSnapshotData", "parseSnapshotMainData", "preFetchConfigs", "preFetchFeedData", "preFetchMainData", "preFetchSnapshotData", "preloadOrderSnapshot", "releaseFeedService", "sendMTopResponseToCallback", "mtopResponse", "syncFetchMainData", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class mxe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mxe INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f31306a;
    private static volatile MtopResponse b;
    private static CountDownLatch c;
    private static JSONObject d;
    private static volatile DealInfo e;
    private static boolean f;
    private static String g;
    private static int h;
    private static esp i;
    private static esn j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/data/MtbDataService$fetchMainData$1", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mtr f31307a;

        public a(mtr mtrVar) {
            this.f31307a = mtrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge("mtbMainLink", "fetchMainData，预请求状态:" + mxe.c(mxe.INSTANCE));
            int c = mxe.c(mxe.INSTANCE);
            if (c == 1) {
                try {
                    mxe.d(mxe.INSTANCE).await(10L, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
                MtopResponse b = mxe.b(mxe.INSTANCE);
                mxe.a(mxe.INSTANCE, (MtopResponse) null);
                mxe.a(mxe.INSTANCE, 0);
                mxe.a(mxe.INSTANCE, b, this.f31307a);
            } else if (c != 2) {
                mxe.a(mxe.INSTANCE, mxe.a(mxe.INSTANCE), this.f31307a);
            } else {
                MtopResponse b2 = mxe.b(mxe.INSTANCE);
                mxe.a(mxe.INSTANCE, (MtopResponse) null);
                mxe.a(mxe.INSTANCE, 0);
                mxe.a(mxe.INSTANCE, b2, this.f31307a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/data/MtbDataService$preFetchMainData$1", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nwv.a("preloadMainData", 0);
            MtopResponse a2 = mxe.a(mxe.INSTANCE);
            nwv.b("preloadMainData", 0);
            mxe.a(mxe.INSTANCE, a2);
            mxe.a(mxe.INSTANCE, 2);
            mxe.d(mxe.INSTANCE).countDown();
        }
    }

    static {
        kge.a(-494054861);
        INSTANCE = new mxe();
        c = new CountDownLatch(1);
        i = new esp();
        j = new esn();
    }

    private mxe() {
    }

    public static final /* synthetic */ MtopResponse a(mxe mxeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopResponse) ipChange.ipc$dispatch("b161d29d", new Object[]{mxeVar}) : mxeVar.i();
    }

    public static final /* synthetic */ void a(mxe mxeVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6846a45", new Object[]{mxeVar, new Integer(i2)});
        } else {
            f31306a = i2;
        }
    }

    public static final /* synthetic */ void a(mxe mxeVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9623f4c3", new Object[]{mxeVar, mtopResponse});
        } else {
            b = mtopResponse;
        }
    }

    public static final /* synthetic */ void a(mxe mxeVar, MtopResponse mtopResponse, mtr mtrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2fa0a8", new Object[]{mxeVar, mtopResponse, mtrVar});
        } else {
            mxeVar.a(mtopResponse, mtrVar);
        }
    }

    public static final /* synthetic */ MtopResponse b(mxe mxeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopResponse) ipChange.ipc$dispatch("6ad9603c", new Object[]{mxeVar}) : b;
    }

    public static final /* synthetic */ int c(mxe mxeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d2652573", new Object[]{mxeVar})).intValue() : f31306a;
    }

    public static final /* synthetic */ CountDownLatch d(mxe mxeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("3c9ed267", new Object[]{mxeVar}) : c;
    }

    public final DealInfo a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DealInfo) ipChange.ipc$dispatch("5a88b407", new Object[]{this}) : e;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : f;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : g;
    }

    public final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else {
            h = i2;
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : h;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Object b2 = muh.b(muh.ORDER_NUM);
        if (!(b2 instanceof DealInfo)) {
            b2 = null;
        }
        e = (DealInfo) b2;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (!Login.checkSessionValid()) {
            return false;
        }
        com.taobao.mytaobao.ultron.b a2 = com.taobao.mytaobao.ultron.b.a();
        q.a((Object) a2, "MTBDataProvider.getInstance()");
        d = a2.l();
        h();
        return true;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!f) {
        } else {
            nwv.c("进入preFetchFeedData");
            com.taobao.mytaobao.ultron.b a2 = com.taobao.mytaobao.ultron.b.a();
            q.a((Object) a2, "MTBDataProvider.getInstance()");
            com.taobao.mytaobao.basement.weex.a.INSTANCE.b(a2.o());
        }
    }

    private final void h() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject4 = d;
            if (jSONObject4 != null && (jSONObject = jSONObject4.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject("global")) != null && (jSONObject3 = jSONObject2.getJSONObject("secScreenFragment")) != null) {
                if (q.a((Object) "true", (Object) jSONObject3.getString("newBasementContainer")) && q.a((Object) "weex", (Object) jSONObject3.getString("pageType"))) {
                    z = true;
                }
                f = z;
                g = jSONObject3.getString("fragmentWeexUrl");
                Log.e("dssdw", "parseSnapshotMainData");
            }
        } catch (Throwable unused) {
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!Login.checkSessionValid() || f31306a != 0) {
        } else {
            f31306a = 1;
            c = new CountDownLatch(1);
            com.taobao.mytaobao.base.b.b(new b());
        }
    }

    public final void a(mtr<JSONObject> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52ca34d", new Object[]{this, callback});
            return;
        }
        q.c(callback, "callback");
        com.taobao.mytaobao.base.b.c(new a(callback));
    }

    private final void a(MtopResponse mtopResponse, mtr<JSONObject> mtrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b47012", new Object[]{this, mtopResponse, mtrVar});
        } else if (mtopResponse == null) {
            mtrVar.onResult(false, "mtopResponse=null", null);
            TLog.loge("mtbDataLink", "主接口onResult,errorMsg=mtopResponse=null");
        } else if (mtopResponse.isApiSuccess()) {
            try {
                JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
                if (originFastJsonObject == null) {
                    originFastJsonObject = (JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0]);
                }
                mtrVar.onResult(true, null, originFastJsonObject);
                StringBuilder sb = new StringBuilder();
                sb.append("主接口onResult success,data=");
                byte[] bytedata = mtopResponse.getBytedata();
                q.a((Object) bytedata, "mtopResponse.bytedata");
                sb.append(new String(bytedata, d.UTF_8));
                TLog.loge("mtbDataLink", sb.toString());
            } catch (Throwable th) {
                mtrVar.onResult(false, th.getMessage(), null);
                TLog.loge("mtbDataLink", "主接口onResult exception,errMsg=" + th.getMessage());
            }
        } else {
            mtrVar.onResult(false, mtopResponse.getRetCode() + mtopResponse.getRetMsg(), null);
            TLog.loge("mtbDataLink", "主接口onResult failed,errMsg=" + mtopResponse.getRetCode() + mtopResponse.getRetMsg());
        }
    }

    private final MtopResponse i() {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("cd2908eb", new Object[]{this});
        }
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), j(), TaoHelper.getTTID());
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.mo1305reqMethod(MethodEnum.POST);
        try {
            mtopResponse = build.syncRequest();
        } catch (Throwable unused) {
            mtopResponse = null;
        }
        if (mtopResponse != null) {
            mtopResponse.parseJsonByte();
        }
        return mtopResponse;
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        JSONObject jSONObject = d;
        if (jSONObject != null) {
            return jSONObject;
        }
        com.taobao.mytaobao.ultron.b a2 = com.taobao.mytaobao.ultron.b.a();
        q.a((Object) a2, "MTBDataProvider.getInstance()");
        return a2.l();
    }

    private final MtopRequest j() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8abb401c", new Object[]{this});
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
        Float w = com.taobao.mytaobao.base.c.w();
        if (w != null) {
            jSONObject2.put(com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.ASPECT_RATIO, (Object) w);
        }
        jSONObject.put(PushConstants.PARAMS, (Object) JSON.toJSONString(jSONObject2));
        jSONObject.put("deviceLevel", (Object) String.valueOf(com.taobao.mytaobao.base.c.a()));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.reborn.mclaren");
        mtopRequest.setVersion("2.0");
        mtopRequest.setData(JSONObject.toJSONString(jSONObject));
        return mtopRequest;
    }

    public final JSONObject b(mtr<JSONObject> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ea39cee", new Object[]{this, callback});
        }
        q.c(callback, "callback");
        if (j.e == com.taobao.mytaobao.base.a.c) {
            return j.a(callback);
        }
        return i.a(callback);
    }

    public final JSONObject c(mtr<JSONObject> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a9445f6f", new Object[]{this, callback});
        }
        q.c(callback, "callback");
        return j.a(callback);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        i = new esp();
        j = new esn();
    }
}
