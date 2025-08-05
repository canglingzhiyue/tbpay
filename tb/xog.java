package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.weex.c;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/taobao/mytaobao/pagev2/basement/dataservice/BasementDataService;", "Lcom/taobao/mytaobao/pagev2/basement/dataservice/IBasementDataService;", "userId", "", "(Ljava/lang/String;)V", "consume", "", "feedMtopFetcher", "Lcom/taobao/mytaobao/pagev2/basement/dataservice/FeedMtopFetcher;", "feedMtopNextFetcher", "Lcom/taobao/mytaobao/pagev2/basement/dataservice/FeedMtopNextFetcher;", "hasInvokeFetchNext", "localMainData", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbHomePageVO;", "mAvailableFeedDataModel", "Lcom/taobao/mytaobao/basement/weex/FeedDataModel;", "preloadExpireTime", "", nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, "considerLoadLocalFeedData", "", "considerLoadMtopFeedData", "considerRemoteCacheAndFetchRemoteForNext", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "fetchFeedData", "Lcom/alibaba/fastjson/JSONObject;", "callback", "Lcom/taobao/mytaobao/basement/listener/BasementCommonCallback;", "isDowngradePrestrain", "mtbHomePageVO", "isFeedDataValid", "feedDataModel", "onAppLaunch", "onTabClick", "parseBasementData", "data", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xog implements xok {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f34425a;
    private String b;
    private long c;
    private volatile c d;
    private xoi e;
    private xoj f;
    private xon g;
    private boolean h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            muh.c(com.taobao.mytaobao.basement.weex.a.DB_KEY_FEED_DATA);
            xon a2 = xog.a(xog.this);
            if (a2 == null) {
                return;
            }
            if (xog.this.a(a2)) {
                xoi b = xog.b(xog.this);
                if (b != null) {
                    b.e = com.taobao.mytaobao.base.a.d;
                }
                TLog.loge("我淘二屏数据层", "feed降级，不请求next");
                return;
            }
            TLog.loge("我淘二屏数据层", "预请求next数据");
            xoj c = xog.c(xog.this);
            if (c == null) {
                return;
            }
            c.a();
        }
    }

    static {
        kge.a(-216619782);
        kge.a(29747349);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "success", "", "errorMsg", "", "ext", "Lcom/alibaba/fastjson/JSONObject;", "onResult"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b<T> implements mtr<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mtr f34427a;

        public b(mtr mtrVar) {
            this.f34427a = mtrVar;
        }

        @Override // tb.mtr
        public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject});
            } else {
                a(z, str, jSONObject);
            }
        }

        public final void a(boolean z, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject});
                return;
            }
            this.f34427a.onResult(z, str, jSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append("feed数据callback返回结果:");
            if (jSONObject == null) {
                z2 = false;
            }
            sb.append(z2);
            TLog.loge("我淘二屏数据层", sb.toString());
        }
    }

    public xog(String userId) {
        q.c(userId, "userId");
    }

    public static final /* synthetic */ xon a(xog xogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xon) ipChange.ipc$dispatch("6866b87", new Object[]{xogVar}) : xogVar.g;
    }

    public static final /* synthetic */ xoi b(xog xogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xoi) ipChange.ipc$dispatch("ee28414b", new Object[]{xogVar}) : xogVar.e;
    }

    public static final /* synthetic */ xoj c(xog xogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xoj) ipChange.ipc$dispatch("d5ca17c9", new Object[]{xogVar}) : xogVar.f;
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.h) {
        } else {
            this.h = true;
            com.taobao.mytaobao.base.b.a(new a(), 2000L);
        }
    }

    @Override // tb.xok
    public JSONObject a(mtr<JSONObject> callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7402da6d", new Object[]{this, callback});
        }
        q.c(callback, "callback");
        if (this.d != null) {
            TLog.loge("我淘二屏数据层", "前端问客户端要feed数据, 本地数据可用");
            com.taobao.mytaobao.basement.weex.a aVar = com.taobao.mytaobao.basement.weex.a.INSTANCE;
            c cVar = this.d;
            if (cVar == null) {
                q.a();
            }
            JSONObject b2 = aVar.b(cVar.f18351a);
            callback.onResult(true, null, b2);
            d();
            return b2;
        }
        xoi xoiVar = this.e;
        if (xoiVar != null) {
            if (xoiVar == null) {
                q.a();
            }
            JSONObject a2 = xoiVar.a(new b(callback));
            StringBuilder sb = new StringBuilder();
            sb.append("feed数据同步返回结果:");
            if (a2 == null) {
                z = false;
            }
            sb.append(z);
            TLog.loge("我淘二屏数据层", sb.toString());
            d();
            return a2;
        }
        TLog.loge("我淘二屏数据层", "前端问客户端要feed数据, 客户端啥都没有");
        callback.onResult(false, null, null);
        return null;
    }

    @Override // tb.xok
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // tb.xok
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            f();
        }
    }

    @Override // tb.xok
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f();
        e();
    }

    private final void e() {
        xon xonVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d != null || (xonVar = this.g) == null) {
        } else {
            if (a(xonVar)) {
                xoi xoiVar = this.e;
                if (xoiVar != null) {
                    xoiVar.e = com.taobao.mytaobao.base.a.d;
                }
                TLog.loge("我淘二屏数据层", "feed降级，不预请求");
                return;
            }
            xoi xoiVar2 = this.e;
            if (xoiVar2 == null) {
                return;
            }
            xoiVar2.a();
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f34425a) {
        } else {
            this.f34425a = true;
            xon i = com.taobao.mytaobao.pagev2.dataservice.a.i();
            if (i == null) {
                return;
            }
            this.g = i;
            b(i);
            if (!q.a((Object) this.b, (Object) "delay")) {
                return;
            }
            String a2 = muh.a(com.taobao.mytaobao.basement.weex.a.DB_KEY_FEED_DATA);
            c cVar = null;
            if (a2 != null) {
                cVar = com.taobao.mytaobao.basement.weex.a.INSTANCE.a(a2, c.SOURCE_FROM_DISK, (Long) null);
            }
            if (cVar == null || !a(cVar)) {
                return;
            }
            TLog.loge("我淘二屏数据层", "launch,本地有可用数据，则不需要预请求");
            this.d = cVar;
        }
    }

    private final boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13d97bca", new Object[]{this, cVar})).booleanValue();
        }
        if (q.a((Object) cVar.b, (Object) c.SOURCE_FROM_PAGE_PRELOAD) || q.a((Object) this.b, (Object) com.taobao.mytaobao.basement.weex.a.PRELOAD_TYPE_INTIME)) {
            return true;
        }
        long currentTimeMillis = (System.currentTimeMillis() - cVar.c) / 1000;
        if (cVar.c > 0 && currentTimeMillis < this.c) {
            return true;
        }
        Log.e("BasementFeedData", "过期过期 delta=" + currentTimeMillis + " preloadExpireTime=" + this.c);
        return false;
    }

    @Override // tb.xok
    public boolean a(xon mtbHomePageVO) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a9ab25", new Object[]{this, mtbHomePageVO})).booleanValue();
        }
        q.c(mtbHomePageVO, "mtbHomePageVO");
        JSONObject c = mtbHomePageVO.c();
        if (q.a((Object) (c != null ? c.getBoolean("disableDowngradePrestrain") : null), (Object) true)) {
            return false;
        }
        JSONObject c2 = mtbHomePageVO.c();
        return ((c2 == null || (jSONObject = c2.getJSONObject("bizParams")) == null) ? false : jSONObject.getBooleanValue("isDowngradePrestrain")) || q.a((Object) "1", (Object) OrangeConfig.getInstance().getConfig("mpm_data_switch", "isDowngradePrestrainTaoFriend", null));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(tb.xon r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xog.b(tb.xon):void");
    }
}
