package com.taobao.mytaobao.basement.weex;

import android.app.Application;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.basement.i;
import com.taobao.mytaobao.ut.c;
import com.taobao.tao.Globals;
import com.taobao.tao.MytaobaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.mtx;
import tb.mtz;
import tb.muh;
import tb.mxf;
import tb.mxj;
import tb.nfc;
import tb.nwv;
import tb.qpl;
import tb.riy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u0012\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0004J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0012\u0010$\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\rJ%\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u0004\u0018\u00010\t2\u0006\u0010-\u001a\u00020\u0015J\n\u0010.\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010/\u001a\u0004\u0018\u00010\u00012\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0004H\u0002J\u0010\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0010H\u0002J\u0010\u00104\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0012\u00105\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u00107\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0010\u00108\u001a\u0002092\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/taobao/mytaobao/basement/weex/BasementFeedDataProvider;", "", "()V", "DB_KEY_FEED_DATA", "", "PRELOAD_TYPE_DELAY", "PRELOAD_TYPE_INTIME", RPCDataItems.SWITCH_TAG_LOG, "basementData", "Lcom/alibaba/fastjson/JSONObject;", "fetchStatus", "", "hasLoadFeedMtopByPage", "", "hasTraceHitRate", "mFeedDataModel", "Lcom/taobao/mytaobao/basement/weex/FeedDataModel;", "preloadExpireTime", "", nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, "weexCallback", "Lcom/taobao/android/weex_framework/bridge/MUSCallback;", "asyncRemoveDiskFeedData", "", "buildRequest", "Lmtopsdk/mtop/domain/MtopRequest;", "considerDispatchDiskData", "considerLoadBasementFeedDataWhenAppLaunch", "mainApiDataStr", "considerLoadNextOnceData", "considerNotifyPreloadResult", "result", "considerPreloadFirstCardImg", "feedDataStr", "considerTraceHitRate", "state", "coreParseBasementPreloadConfig", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "retainFeedData", "generateFeedDataModel", "feedData", "sourceFrom", "mockTimestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/taobao/mytaobao/basement/weex/FeedDataModel;", "getFeedDataWithCallback", "callback", "getUnitStrategy", "getValueByKeyPath", "obj", "keyPath", "isFeedDataValid", "feedDataModel", "loadBasementFeedDataWhenOpenPage", "parseBasementPreloadConfig", "mainApiData", "processFeedData", "secondScreenUTParams", "Lcom/taobao/mytaobao/ut/UserTrackUtils$TrackPage;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DB_KEY_FEED_DATA = "mtbBasementFeedData";
    public static final a INSTANCE;
    public static final String PRELOAD_TYPE_DELAY = "delay";
    public static final String PRELOAD_TYPE_INTIME = "inTime";

    /* renamed from: a  reason: collision with root package name */
    private static volatile long f18346a;
    private static volatile com.taobao.mytaobao.basement.weex.c b;
    private static volatile com.taobao.android.weex_framework.bridge.b c;
    private static volatile String d;
    private static volatile JSONObject e;
    private static volatile int f;
    private static volatile boolean g;
    private static boolean h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/basement/weex/BasementFeedDataProvider$considerLoadBasementFeedDataWhenAppLaunch$task$1", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18347a;

        public b(String str) {
            this.f18347a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f18347a;
            a.a(a.INSTANCE, str == null ? null : JSONObject.parseObject(str));
            if (!q.a((Object) a.e(a.INSTANCE), (Object) "delay")) {
                return;
            }
            String a2 = muh.a(a.DB_KEY_FEED_DATA);
            com.taobao.mytaobao.basement.weex.c a3 = a2 != null ? a.INSTANCE.a(a2, com.taobao.mytaobao.basement.weex.c.SOURCE_FROM_DISK, (Long) null) : null;
            if (a3 != null && a.a(a.INSTANCE, a3)) {
                TLog.loge("BasementFeedDP", "launch,本地有可用数据，则不需要预请求");
                a.b(a.INSTANCE, a3);
            } else if (a.b(a.INSTANCE) > 0 || com.taobao.mytaobao.basement.a.e()) {
                TLog.loge("BasementFeedDP", "launch,加载中 or 降级， 不预先请求");
            } else {
                a.a(a.INSTANCE, 1);
                MtopRequest h = a.h(a.INSTANCE);
                if (h == null) {
                    TLog.loge("BasementFeedDP", "预加载API不正确");
                    a.a(a.INSTANCE, 0);
                    return;
                }
                Application application = Globals.getApplication();
                q.a((Object) application, "Globals.getApplication()");
                MtopBusiness business = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, application.getApplicationContext()), h, TaoHelper.getTTID());
                String f = a.f(a.INSTANCE);
                if (f != null) {
                    business.mo1328setUnitStrategy(f);
                }
                IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.mytaobao.basement.weex.BasementFeedDataProvider$considerLoadBasementFeedDataWhenAppLaunch$task$1$run$mTopListener$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        String str2 = null;
                        byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                        if (bytedata != null) {
                            a aVar = a.INSTANCE;
                            a.b(aVar, aVar.a(new String(bytedata, kotlin.text.d.UTF_8), c.SOURCE_FROM_LAUNCH_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                        }
                        a.a(a.INSTANCE, 2);
                        c a4 = a.a(a.INSTANCE);
                        if (a4 != null) {
                            str2 = a4.f18351a;
                        }
                        boolean unused = a.$ipChange;
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        TLog.loge("BasementFeedDP", "launch,预请求成功");
                        String str2 = null;
                        byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                        if (bytedata != null) {
                            a aVar = a.INSTANCE;
                            a.b(aVar, aVar.a(new String(bytedata, kotlin.text.d.UTF_8), c.SOURCE_FROM_LAUNCH_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                        }
                        a.a(a.INSTANCE, 2);
                        c a4 = a.a(a.INSTANCE);
                        if (a4 != null) {
                            str2 = a4.f18351a;
                        }
                        boolean z = a.$ipChange;
                        if (a.a(a.INSTANCE) == null) {
                            return;
                        }
                        if (z) {
                            a.c(a.INSTANCE);
                            return;
                        }
                        a aVar2 = a.INSTANCE;
                        c a5 = a.a(aVar2);
                        if (a5 == null) {
                            q.a();
                        }
                        String str3 = a5.f18351a;
                        q.a((Object) str3, "mFeedDataModel!!.feedData");
                        aVar2.c(str3);
                        TLog.loge("BasementFeedDP", "launch,存磁盘");
                        c a6 = a.a(a.INSTANCE);
                        if (a6 == null) {
                            q.a();
                        }
                        JSONObject parseObject = JSONObject.parseObject(a6.f18351a);
                        if (!parseObject.getJSONObject("data").containsKey("timestamp")) {
                            parseObject.getJSONObject("data").put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                        }
                        muh.a(a.DB_KEY_FEED_DATA, parseObject.toJSONString());
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        String str2 = null;
                        byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                        if (bytedata != null) {
                            a aVar = a.INSTANCE;
                            a.b(aVar, aVar.a(new String(bytedata, kotlin.text.d.UTF_8), c.SOURCE_FROM_LAUNCH_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                        }
                        a.a(a.INSTANCE, 2);
                        c a4 = a.a(a.INSTANCE);
                        if (a4 != null) {
                            str2 = a4.f18351a;
                        }
                        boolean unused = a.$ipChange;
                    }
                };
                try {
                    MtopResponse syncRequest = business.syncRequest();
                    if (syncRequest == null || !syncRequest.isApiSuccess()) {
                        q.a((Object) business, "business");
                        iRemoteBaseListener.onError(business.getRequestType(), syncRequest, null);
                        return;
                    }
                    q.a((Object) business, "business");
                    iRemoteBaseListener.onSuccess(business.getRequestType(), syncRequest, null, null);
                } catch (Throwable unused) {
                    a.a(a.INSTANCE, 2);
                    q.a((Object) business, "business");
                    iRemoteBaseListener.onError(business.getRequestType(), null, null);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18348a;

        public c(String str) {
            this.f18348a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONArray jSONArray;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = JSONObject.parseObject(this.f18348a).getJSONObject("data");
                if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("imgJsonPath")) == null) {
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null && (string = jSONObject2.getString("keyPath")) != null) {
                        Object a2 = a.a(a.INSTANCE, jSONObject, string);
                        if (!(a2 instanceof String)) {
                            a2 = null;
                        }
                        String str = (String) a2;
                        if (str != null) {
                            TLog.loge("BasementFeedDP", "imgUrl=" + str);
                            if (!StringUtils.isEmpty(str)) {
                                arrayList.add(str + "_760x760q90.jpg_.webp");
                            }
                        }
                    }
                }
                Log.e("dsw", "img预请求请求222");
                mtz.f31263a.post(new Runnable() { // from class: com.taobao.mytaobao.basement.weex.a.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        for (String str2 : arrayList) {
                            TLog.loge("BasementFeedDP", "img预请求:" + str2);
                            com.taobao.phenix.intf.b.h().a(str2).releasableDrawable(true).fetch();
                        }
                    }
                });
            } catch (Throwable th) {
                TLog.loge("BasementFeedDP", "considerPreloadFirstCardImg onError, " + th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.weex_framework.bridge.b f18350a;

        public d(com.taobao.android.weex_framework.bridge.b bVar) {
            this.f18350a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f18350a.a(a.INSTANCE.b((String) null));
            TLog.loge("BasementFeedDP", "删磁盘");
            muh.c(a.DB_KEY_FEED_DATA);
        }
    }

    static {
        kge.a(-872514152);
        INSTANCE = new a();
    }

    private a() {
    }

    public static final /* synthetic */ com.taobao.mytaobao.basement.weex.c a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.basement.weex.c) ipChange.ipc$dispatch("ae423766", new Object[]{aVar}) : b;
    }

    public static final /* synthetic */ Object a(a aVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("70d68c0", new Object[]{aVar, jSONObject, str}) : aVar.a(jSONObject, str);
    }

    public static final /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673a40fb", new Object[]{aVar, new Integer(i)});
        } else {
            f = i;
        }
    }

    public static final /* synthetic */ void a(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7228e8", new Object[]{aVar, jSONObject});
        } else {
            aVar.a(jSONObject);
        }
    }

    public static final /* synthetic */ boolean a(a aVar, com.taobao.mytaobao.basement.weex.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("efcef92a", new Object[]{aVar, cVar})).booleanValue() : aVar.a(cVar);
    }

    public static final /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b3dc81a", new Object[]{aVar})).intValue() : f;
    }

    public static final /* synthetic */ void b(a aVar, com.taobao.mytaobao.basement.weex.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f7db67", new Object[]{aVar, cVar});
        } else {
            b = cVar;
        }
    }

    public static final /* synthetic */ void b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7bef8d", new Object[]{aVar, new Boolean(z)});
        } else {
            g = z;
        }
    }

    public static final /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a2fd46", new Object[]{aVar});
        } else {
            aVar.d();
        }
    }

    public static final /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a083269", new Object[]{aVar})).booleanValue() : g;
    }

    public static final /* synthetic */ String e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ca0059c", new Object[]{aVar}) : d;
    }

    public static final /* synthetic */ String f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d55d25d", new Object[]{aVar}) : aVar.b();
    }

    public static final /* synthetic */ void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037d1c2", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    public static final /* synthetic */ MtopRequest h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopRequest) ipChange.ipc$dispatch("9e15470c", new Object[]{aVar}) : aVar.h();
    }

    public static final /* synthetic */ boolean i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f023c04", new Object[]{aVar})).booleanValue() : aVar.e();
    }

    private final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            try {
                JSONObject a2 = com.taobao.mytaobao.basement.a.a(jSONObject.getJSONObject("data"));
                if (a2 == null) {
                    return;
                }
                e = a2;
                d(e);
            } catch (Throwable unused) {
            }
        }
    }

    private final void d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("initApi")) == null || (jSONObject3 = jSONObject2.getJSONObject("params")) == null) {
        } else {
            d = jSONObject3.getString(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE);
            f18346a = jSONObject3.getLongValue("preloadExpireTime");
            if (!q.a((Object) d, (Object) PRELOAD_TYPE_INTIME) || !com.taobao.mytaobao.base.c.g()) {
                return;
            }
            d = "delay";
            f18346a = 86400L;
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        TLog.loge("BasementFeedDP", "launch, isPageCreated=" + MytaobaoApplication.isPageCreated);
        if (MytaobaoApplication.isPageCreated) {
            return;
        }
        com.taobao.mytaobao.base.b.c(new b(str));
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!q.a((Object) "delay", (Object) d)) {
            TLog.loge("BasementFeedDP", "considerLoadNextOnceData return");
        } else {
            com.taobao.mytaobao.base.b.a(f.INSTANCE, 3000L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final f INSTANCE = new f();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mxf.a("basementPreloadData");
            MtopRequest h = a.h(a.INSTANCE);
            if (h == null) {
                return;
            }
            Application application = Globals.getApplication();
            q.a((Object) application, "Globals.getApplication()");
            MtopBusiness business = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, application.getApplicationContext()), h, TaoHelper.getTTID());
            String f = a.f(a.INSTANCE);
            if (f != null) {
                business.mo1328setUnitStrategy(f);
            }
            IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.mytaobao.basement.weex.BasementFeedDataProvider$considerLoadNextOnceData$1$mTopListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    byte[] bytedata;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null || (bytedata = mtopResponse.getBytedata()) == null) {
                    } else {
                        c a2 = a.INSTANCE.a(new String(bytedata, kotlin.text.d.UTF_8), c.SOURCE_FROM_PAGE_PRELOAD, Long.valueOf(System.currentTimeMillis()));
                        TLog.loge("BasementFeedDP", "page next网络成功");
                        a aVar = a.INSTANCE;
                        String str = a2.f18351a;
                        q.a((Object) str, "nextOnceData.feedData");
                        aVar.c(str);
                        TLog.loge("BasementFeedDP", "next page 存磁盘");
                        JSONObject parseObject = JSONObject.parseObject(a2.f18351a);
                        if (!parseObject.getJSONObject("data").containsKey("timestamp")) {
                            parseObject.getJSONObject("data").put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                        }
                        muh.a(a.DB_KEY_FEED_DATA, parseObject.toJSONString());
                    }
                }
            };
            try {
                MtopResponse syncRequest = business.syncRequest();
                if (syncRequest == null || !syncRequest.isApiSuccess()) {
                    return;
                }
                q.a((Object) business, "business");
                iRemoteBaseListener.onSuccess(business.getRequestType(), syncRequest, null, null);
            } catch (Throwable unused) {
            }
        }
    }

    private final boolean e() {
        com.taobao.mytaobao.basement.weex.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!mxj.b("optMtbFeedData", true) || (cVar = b) == null) {
            return false;
        }
        if (!a(cVar)) {
            b = null;
            return false;
        }
        f = 2;
        TLog.loge("BasementFeedDP", "page 读内存成功");
        boolean a2 = a(cVar.f18351a);
        mxf.b("basementPreloadData");
        if (a2) {
            d();
        }
        c();
        return true;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        if (d == null) {
            d(jSONObject);
        }
        if (d == null) {
            TLog.loge("BasementFeedDP", "loadBasementFeedDataWhenOpenPage,preloadType is null");
            return;
        }
        if (b != null) {
            com.taobao.mytaobao.basement.weex.c cVar = b;
            if (cVar == null) {
                q.a();
            }
            if (!a(cVar)) {
                TLog.loge("BasementFeedDP", "页面进入，feed数据数据过期");
                b = null;
            }
        }
        if (q.a((Object) d, (Object) PRELOAD_TYPE_INTIME)) {
            b = null;
        }
        e eVar = e.INSTANCE;
        if (b != null) {
            mtz.f31263a.postDelayed(eVar, 3000L);
        } else {
            eVar.run();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.b(a.INSTANCE) == 1 || a.d(a.INSTANCE) || com.taobao.mytaobao.basement.a.e()) {
                TLog.loge("BasementFeedDP", "page load 加载中，return");
            } else {
                a.b(a.INSTANCE, true);
                a.a(a.INSTANCE, 1);
                mtx.c().a("PreloadInterface");
                nwv.c("准备进入mtop异步");
                com.taobao.mytaobao.base.b.c(new Runnable() { // from class: com.taobao.mytaobao.basement.weex.a.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        final boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        nwv.c("进入mtop异步");
                        mxf.a("basementPreloadData");
                        if (a.a(a.INSTANCE) == null && q.a((Object) a.e(a.INSTANCE), (Object) "delay")) {
                            String a2 = muh.a(a.DB_KEY_FEED_DATA);
                            if (a2 != null) {
                                a aVar = a.INSTANCE;
                                a.b(aVar, aVar.a(a2, com.taobao.mytaobao.basement.weex.c.SOURCE_FROM_DISK, (Long) null));
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("page 读磁盘,内容=");
                            sb.append(a.a(a.INSTANCE) != null);
                            sb.append(" time=");
                            com.taobao.mytaobao.basement.weex.c a3 = a.a(a.INSTANCE);
                            sb.append(a3 != null ? Long.valueOf(a3.c) : null);
                            TLog.loge("BasementFeedDP", sb.toString());
                        }
                        if (a.i(a.INSTANCE)) {
                            return;
                        }
                        MtopRequest h = a.h(a.INSTANCE);
                        if (h == null) {
                            a.a(a.INSTANCE, 0);
                            return;
                        }
                        if (a.a(a.INSTANCE) == null || !q.a((Object) a.e(a.INSTANCE), (Object) "delay")) {
                            z = false;
                        }
                        Application application = Globals.getApplication();
                        q.a((Object) application, "Globals.getApplication()");
                        MtopBusiness business = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, application.getApplicationContext()), h, TaoHelper.getTTID());
                        String f = a.f(a.INSTANCE);
                        if (f != null) {
                            business.mo1328setUnitStrategy(f);
                        }
                        IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.mytaobao.basement.weex.BasementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1$1$run$mTopListener$1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                    return;
                                }
                                mtx.c().a("PreloadInterface", mtx.b());
                                String str = null;
                                byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                                if (bytedata != null) {
                                    a aVar2 = a.INSTANCE;
                                    a.b(aVar2, aVar2.a(new String(bytedata, kotlin.text.d.UTF_8), c.SOURCE_FROM_PAGE_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                                }
                                a.a(a.INSTANCE, 2);
                                c a4 = a.a(a.INSTANCE);
                                if (a4 != null) {
                                    str = a4.f18351a;
                                }
                                boolean unused = a.$ipChange;
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                    return;
                                }
                                nwv.c("进入mtop success");
                                String str = null;
                                mtx.c().a("PreloadInterface", null);
                                byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                                if (bytedata != null) {
                                    a aVar2 = a.INSTANCE;
                                    a.b(aVar2, aVar2.a(new String(bytedata, kotlin.text.d.UTF_8), c.SOURCE_FROM_PAGE_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                                }
                                a.a(a.INSTANCE, 2);
                                TLog.loge("BasementFeedDP", "page 网络成功,isPreFetchForNextTime=" + z);
                                c a4 = a.a(a.INSTANCE);
                                if (a4 != null) {
                                    str = a4.f18351a;
                                }
                                boolean z2 = a.$ipChange;
                                mxf.b("basementPreloadData");
                                if (z2) {
                                    a.c(a.INSTANCE);
                                } else if (z) {
                                    a aVar3 = a.INSTANCE;
                                    c a5 = a.a(aVar3);
                                    if (a5 == null) {
                                        q.a();
                                    }
                                    String str2 = a5.f18351a;
                                    q.a((Object) str2, "mFeedDataModel!!.feedData");
                                    aVar3.c(str2);
                                    TLog.loge("BasementFeedDP", "page 存磁盘");
                                    c a6 = a.a(a.INSTANCE);
                                    if (a6 == null) {
                                        q.a();
                                    }
                                    JSONObject parseObject = JSONObject.parseObject(a6.f18351a);
                                    if (!parseObject.getJSONObject("data").containsKey("timestamp")) {
                                        parseObject.getJSONObject("data").put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                                    }
                                    muh.a(a.DB_KEY_FEED_DATA, parseObject.toJSONString());
                                }
                                if (z || !z2) {
                                    return;
                                }
                                a.g(a.INSTANCE);
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                    return;
                                }
                                mtx.c().a("PreloadInterface", mtx.b());
                                String str = null;
                                byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                                if (bytedata != null) {
                                    a aVar2 = a.INSTANCE;
                                    a.b(aVar2, aVar2.a(new String(bytedata, kotlin.text.d.UTF_8), c.SOURCE_FROM_PAGE_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                                }
                                a.a(a.INSTANCE, 2);
                                c a4 = a.a(a.INSTANCE);
                                if (a4 != null) {
                                    str = a4.f18351a;
                                }
                                boolean unused = a.$ipChange;
                            }
                        };
                        try {
                            MtopResponse syncRequest = business.syncRequest();
                            if (syncRequest == null || !syncRequest.isApiSuccess()) {
                                q.a((Object) business, "business");
                                iRemoteBaseListener.onError(business.getRequestType(), syncRequest, null);
                                return;
                            }
                            q.a((Object) business, "business");
                            iRemoteBaseListener.onSuccess(business.getRequestType(), syncRequest, null, null);
                        } catch (Throwable unused) {
                            a.a(a.INSTANCE, 2);
                            q.a((Object) business, "business");
                            iRemoteBaseListener.onError(business.getRequestType(), null, null);
                        }
                    }
                });
            }
        }
    }

    public final JSONObject a(com.taobao.android.weex_framework.bridge.b callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f252df9f", new Object[]{this, callback});
        }
        q.c(callback, "callback");
        nwv.a("BasementFeedDP", "前端问数据");
        String str = null;
        if (b != null) {
            com.taobao.mytaobao.basement.weex.c cVar = b;
            if (cVar == null) {
                q.a();
            }
            if (!a(cVar)) {
                TLog.loge("BasementFeedDP", "前端问客户端要feed数据,数据过期");
                b = null;
            }
        }
        com.taobao.mytaobao.basement.weex.c cVar2 = b;
        String str2 = cVar2 != null ? cVar2.f18351a : null;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("前端问客户端要feed数据, 内存存在可用数据，数据来源：");
            com.taobao.mytaobao.basement.weex.c cVar3 = b;
            if (cVar3 != null) {
                str = cVar3.b;
            }
            sb.append(str);
            TLog.loge("BasementFeedDP", sb.toString());
            d();
            a(2);
            return b(str2);
        } else if (f == 1) {
            TLog.loge("BasementFeedDP", "前端问客户端要feed数据, 数据加载中，hold住");
            c = callback;
            a(1);
            return null;
        } else {
            Coordinator.execute(new d(callback));
            TLog.loge("BasementFeedDP", "前端问客户端要feed数据, 客户端啥都没有");
            a(0);
            return null;
        }
    }

    private final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (h) {
        } else {
            h = true;
            qpl.a(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, "feedDataHitStatus", "{\"state\":" + i + '}', 1.0d);
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        c = null;
        if (z) {
            return;
        }
        f = 0;
        g = false;
        b = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.taobao.mytaobao.basement.weex.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0730a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final RunnableC0730a INSTANCE = new RunnableC0730a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge("BasementFeedDP", "删磁盘");
            muh.c(a.DB_KEY_FEED_DATA);
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            Coordinator.execute(RunnableC0730a.INSTANCE);
        }
    }

    private final boolean a(com.taobao.mytaobao.basement.weex.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13d97bca", new Object[]{this, cVar})).booleanValue();
        }
        if (q.a((Object) cVar.b, (Object) com.taobao.mytaobao.basement.weex.c.SOURCE_FROM_PAGE_PRELOAD) || q.a((Object) d, (Object) PRELOAD_TYPE_INTIME)) {
            return true;
        }
        long currentTimeMillis = (System.currentTimeMillis() - cVar.c) / 1000;
        if (cVar.c > 0 && currentTimeMillis < f18346a) {
            return true;
        }
        Log.e("BasementFeedData", "过期过期 delta=" + currentTimeMillis + " preloadExpireTime=" + f18346a);
        return false;
    }

    public final com.taobao.mytaobao.basement.weex.c a(String feedData, String sourceFrom, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mytaobao.basement.weex.c) ipChange.ipc$dispatch("51f2d499", new Object[]{this, feedData, sourceFrom, l});
        }
        q.c(feedData, "feedData");
        q.c(sourceFrom, "sourceFrom");
        if (l != null) {
            return new com.taobao.mytaobao.basement.weex.c(feedData, sourceFrom, l.longValue());
        }
        long j = 0;
        try {
            Long l2 = JSONObject.parseObject(feedData).getJSONObject("data").getLong("timestamp");
            q.a((Object) l2, "JSONObject.parseObject(f…ta\").getLong(\"timestamp\")");
            j = l2.longValue();
        } catch (Throwable unused) {
        }
        return new com.taobao.mytaobao.basement.weex.c(feedData, sourceFrom, j);
    }

    public final c.a c(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("6b9dc40d", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("pageUTParams") : null;
        String name = i.class.getName();
        if (jSONObject2 == null || (str = jSONObject2.getString("pageName")) == null) {
            str = com.taobao.mytaobao.basement.monitor.b.MODULE_NAME;
        }
        if (jSONObject2 == null || (str2 = jSONObject2.getString("spm")) == null) {
            str2 = BasementConstants.SPM;
        }
        return new c.a(name, str, str2);
    }

    private final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        JSONObject jSONObject = e;
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("initApi");
        String string = jSONObject2 != null ? jSONObject2.getString("unitStrategy") : null;
        if (q.a((Object) string, (Object) "GUIDE_ONLINE_DOMAIN")) {
            return "UNIT_GUIDE";
        }
        if (!q.a((Object) string, (Object) "TRADE_ONLINE_DOMAIN")) {
            return null;
        }
        return "UNIT_TRADE";
    }

    private final MtopRequest h() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("636b991a", new Object[]{this});
        }
        JSONObject jSONObject2 = e;
        MtopRequest mtopRequest = null;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("initApi")) == null) {
            return null;
        }
        String string = jSONObject.getString("apiMethod");
        String string2 = jSONObject.getString("apiVersion");
        if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
            mtopRequest = new MtopRequest();
            mtopRequest.setApiName(string);
            mtopRequest.setVersion(string2);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = jSONObject4;
            jSONObject5.put((JSONObject) "personalization", (String) Boolean.valueOf(com.alibaba.wireless.aliprivacyext.c.a().a("AliPrivacySDK")));
            Application application = Globals.getApplication();
            q.a((Object) application, "Globals.getApplication()");
            if (ContextCompat.checkSelfPermission(application.getApplicationContext(), "android.permission.READ_CONTACTS") == 0) {
                z = true;
            }
            jSONObject5.put((JSONObject) "allowContactAccess", (String) Boolean.valueOf(z));
            jSONObject5.put((JSONObject) "deviceLevel", (String) Integer.valueOf(!com.taobao.mytaobao.base.c.g() ? 1 : 0));
            jSONObject5.put((JSONObject) "isWeex", "true");
            JSONObject jSONObject6 = jSONObject.getJSONObject("params");
            if (jSONObject6 != null) {
                jSONObject4.putAll(jSONObject6);
            }
            jSONObject3.put((JSONObject) "cursor", jSONObject4.toJSONString());
            mtopRequest.setData(jSONObject3.toJSONString());
        }
        return mtopRequest;
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (c == null) {
            return false;
        }
        TLog.loge("BasementFeedDP", "缓存的weex callback异步回调");
        com.taobao.android.weex_framework.bridge.b bVar = c;
        if (bVar != null) {
            bVar.a(b(str));
        }
        nwv.c("给前端成功");
        c = null;
        return true;
    }

    public final JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject2.put("data", (Object) str);
            JSONObject jSONObject3 = jSONObject;
            jSONObject3.put((JSONObject) "preloadData", jSONObject2.toJSONString());
            jSONObject3.put((JSONObject) com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_SUCCESS");
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v8 */
    private final Object a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("805a9220", new Object[]{this, jSONObject, str});
        }
        for (String str2 : n.b((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null)) {
            if (n.b(str2, riy.ARRAY_START_STR, false, 2, (Object) null) && n.c(str2, riy.ARRAY_END_STR, false, 2, (Object) null)) {
                int length = str2.length() - 1;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = str2.substring(1, length);
                q.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (!(jSONObject instanceof JSONArray)) {
                    jSONObject = null;
                }
                JSONArray jSONArray = (JSONArray) jSONObject;
                if (jSONArray == null || (jSONObject = jSONArray.get(parseInt)) == null) {
                    return null;
                }
            } else {
                boolean z = jSONObject instanceof JSONObject;
                JSONObject jSONObject2 = jSONObject;
                if (!z) {
                    jSONObject2 = null;
                }
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null || (jSONObject = jSONObject3.get(str2)) == null) {
                    return null;
                }
            }
        }
        return jSONObject;
    }

    public final void c(String feedDataStr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, feedDataStr});
            return;
        }
        q.c(feedDataStr, "feedDataStr");
        Log.e("dsw", "img预请求请求");
        Coordinator.execute(new c(feedDataStr));
    }
}
