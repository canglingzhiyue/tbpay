package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.b;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class kqk implements b, kqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IMainFeedsViewService<?> b;
    private final IVideoPlayControllerService c;
    private final IContainerService<?> d;
    private LinkedSplashData g;
    private final kql h;
    private final kqm j;
    private final IContainerDataService<?> k;
    private boolean l;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30234a = false;
    private boolean e = false;
    private long f = 0;
    private final int i = ldj.a("keepCardInterval", 10000);
    private final List<String> m = Arrays.asList("coldStart", com.taobao.android.editionswitcher.core.b.LOCATION_CHANGED);
    private final IContainerService.a n = new IContainerService.a() { // from class: tb.kqk.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            String requestType = iUiRefreshActionModel.getRequestType();
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart requestType:" + requestType);
            boolean z = SystemClock.elapsedRealtime() - kqk.a(kqk.this) > ((long) kqk.b(kqk.this));
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart isInserted:" + kqk.c(kqk.this) + ",timeOut:" + z);
            if (!kqk.c(kqk.this) || z) {
                return;
            }
            if (kqk.d(kqk.this).contains(requestType)) {
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart forceMergeAction:");
                kqk.a(kqk.this, false);
                return;
            }
            boolean a2 = kqk.e(kqk.this).a();
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart alreadyInsertSuccess:" + a2);
            if (a2) {
                return;
            }
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshStart mergeData");
            kqk.a(kqk.this, false);
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            kqk kqkVar = kqk.this;
            kqk.b(kqkVar, kqk.e(kqkVar).a());
            if (kqk.c(kqk.this)) {
                kqk.c(kqk.this, true);
                kqk.a(kqk.this, SystemClock.elapsedRealtime());
            }
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#RefreshFinish " + kqk.c(kqk.this));
        }
    };

    static {
        kge.a(-1719749372);
        kge.a(924978914);
        kge.a(296896139);
    }

    @Override // com.taobao.bootimage.linked.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "feeds";
    }

    @Override // com.taobao.bootimage.linked.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public static /* synthetic */ long a(kqk kqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1957ce7", new Object[]{kqkVar})).longValue() : kqkVar.f;
    }

    public static /* synthetic */ long a(kqk kqkVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("411a9825", new Object[]{kqkVar, new Long(j)})).longValue();
        }
        kqkVar.f = j;
        return j;
    }

    public static /* synthetic */ void a(kqk kqkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411ad441", new Object[]{kqkVar, new Boolean(z)});
        } else {
            kqkVar.a(z);
        }
    }

    public static /* synthetic */ int b(kqk kqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e0188367", new Object[]{kqkVar})).intValue() : kqkVar.i;
    }

    public static /* synthetic */ boolean b(kqk kqkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22f89de4", new Object[]{kqkVar, new Boolean(z)})).booleanValue();
        }
        kqkVar.e = z;
        return z;
    }

    public static /* synthetic */ boolean c(kqk kqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce9b89f9", new Object[]{kqkVar})).booleanValue() : kqkVar.e;
    }

    public static /* synthetic */ boolean c(kqk kqkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d66783", new Object[]{kqkVar, new Boolean(z)})).booleanValue();
        }
        kqkVar.f30234a = z;
        return z;
    }

    public static /* synthetic */ List d(kqk kqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e9b18711", new Object[]{kqkVar}) : kqkVar.m;
    }

    public static /* synthetic */ kql e(kqk kqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kql) ipChange.ipc$dispatch("eb56a4a9", new Object[]{kqkVar}) : kqkVar.h;
    }

    public kqk(ljs ljsVar) {
        this.h = new kql(ljsVar);
        this.j = new kqo(ljsVar);
        this.b = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.c = (IVideoPlayControllerService) ljsVar.a(IVideoPlayControllerService.class);
        this.d = (IContainerService) ljsVar.a(IContainerService.class);
        this.k = (IContainerDataService) ljsVar.a(IContainerDataService.class);
    }

    @Override // com.taobao.bootimage.linked.b
    public void a(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee262b0", new Object[]{this, linkedSplashData});
        } else {
            this.h.a(linkedSplashData);
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean b(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("526d8075", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.l = false;
        boolean a2 = a(linkedSplashData, i());
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldHotStartShow shouldShow：" + a2);
        return a2;
    }

    @Override // com.taobao.bootimage.linked.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#onShown：");
        l();
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b396a9b", new Object[]{this, aVar})).booleanValue();
        }
        if (k() || !this.e || this.b == null) {
            return false;
        }
        boolean h = this.j.h();
        boolean g = this.j.g();
        boolean equals = b.a.FROM_CLOSE.equals(aVar.f16704a);
        if (!equals && !h && !g) {
            this.h.a(aVar);
            l();
            return true;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldAnimate 用户点了闪屏跳过:" + equals + "当前有pop:" + h + ",或者有淘口令:" + g + ",不再执行缩放动画");
        return false;
    }

    @Override // com.taobao.bootimage.linked.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#onTerminate mIsInsert：" + this.e);
        if (!this.e) {
            return;
        }
        l();
        j();
        this.f30234a = true;
        this.f = SystemClock.elapsedRealtime();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#onTerminate done");
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean c(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f89e36", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.l = true;
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldColdStartShow");
        a(linkedSplashData, true);
        return true;
    }

    @Override // tb.kqn
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (SystemClock.elapsedRealtime() - this.f > this.i) {
            this.f30234a = false;
            return false;
        }
        return this.f30234a;
    }

    @Override // tb.kqn
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.f30234a = false;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.e = false;
        IContainerService<?> iContainerService = this.d;
        if (iContainerService != null) {
            iContainerService.removeUiRefreshListener(this.n);
        }
        if (this.b == null) {
            return;
        }
        this.b = null;
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        boolean d = this.j.d();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#isAtRecommendFeeds-> " + d);
        return d;
    }

    private boolean a(LinkedSplashData linkedSplashData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6aa628", new Object[]{this, linkedSplashData, new Boolean(z)})).booleanValue();
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldShow enableShow " + z);
        this.e = false;
        if (!z) {
            return false;
        }
        this.g = linkedSplashData;
        IContainerService<?> iContainerService = this.d;
        if (iContainerService == null) {
            return false;
        }
        iContainerService.addUiRefreshListener(this.n);
        if (k()) {
            return false;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#shouldShow insertCard");
        a(true);
        return this.e;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        SectionModel c = this.h.c(this.g);
        if (c == null) {
            return;
        }
        this.h.a(new SectionModel(c), z, this.l, m());
    }

    private void j() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("TopShowInsert#forceInsertPlayQueueHeader：");
        if (this.c == null) {
            z = false;
        }
        sb.append(z);
        strArr[0] = sb.toString();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, strArr);
        if (!this.e || this.c == null) {
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#forceVideoSeekToPlay do");
        this.c.forceInsertToQueueHeader(kql.USER_ID, this.h.b(this.g));
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#triggerVideoStart");
        this.c.triggerVideoStart();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!this.e || this.c == null) {
        } else {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#triggerVideoStop");
            this.c.triggerVideoStop();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        IContainerDataService<?> iContainerDataService = this.k;
        if (iContainerDataService == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert mIContainerService null");
            return false;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert containerData null");
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert containerDataBase null");
            return false;
        }
        JSONObject topViewSplashSection = base.getTopViewSplashSection();
        if (topViewSplashSection == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert topViewSplashSection null");
            return false;
        }
        JSONObject jSONObject = topViewSplashSection.getJSONObject("ext");
        if (jSONObject == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert ext null");
            return false;
        }
        boolean booleanValue = jSONObject.getBooleanValue("disableInsert");
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#disableInsert result:" + booleanValue);
        return booleanValue;
    }

    private int m() {
        JSONObject feedsJson;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        LinkedSplashData linkedSplashData = this.g;
        if (linkedSplashData == null || linkedSplashData.getFeedsData() == null || (feedsJson = this.g.getFeedsData().getFeedsJson()) == null || (jSONObject = feedsJson.getJSONObject("bizData")) == null) {
            return -1;
        }
        String string = jSONObject.getString("previewPosition");
        if (TextUtils.isEmpty(string)) {
            return -1;
        }
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            ldf.d("TopShowInsertCallbackImp", "广告预览位置数据格式异常");
            return -1;
        }
    }
}
