package tb;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.detail.rate.RateDisplayApplication;
import com.taobao.detail.rate.RateFeedsFragment;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 <2\u00020\u0001:\u0001<B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0010J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000bH\u0002J\u0016\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0010J\u001a\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010+\u001a\u00020!H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0006\u00101\u001a\u00020!J \u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u00020\bH\u0002J\u0010\u00106\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0010H\u0002J \u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0002J\b\u0010;\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u001ej\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010`\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/taobao/detail/rate/util/track/RateListFirstFrameTrackManager;", "", bgp.FRAGMENT, "Lcom/taobao/detail/rate/RateFeedsFragment;", "clickTime", "", "navTime", "openMode", "", "(Lcom/taobao/detail/rate/RateFeedsFragment;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "customParams", "Lcom/alibaba/fastjson/JSONObject;", "handler", "Landroid/os/Handler;", "imageLoadControlList", "Ljava/util/ArrayList;", "Lcom/taobao/detail/rate/util/track/IStageBean;", "Lkotlin/collections/ArrayList;", "imageLoadedTarget", "Lcom/taobao/detail/rate/util/track/RateListImageLoadedTarget;", Constant.API_PARAMS_KEY_ENABLE, "", "isTrackStart", "getOpenMode", "()Ljava/lang/String;", "setOpenMode", "(Ljava/lang/String;)V", "perfModel", "Lcom/taobao/trade/common/kit/tracker/model/PerfModel;", "stageControlMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "addImageLoadedSubStage", "", "subStagBean", "addPublicParams", "param", "addStage", "keySection", "stagBean", "buildImageStageAndStat", "timeStamp", "exParams", "clearTrack", "getTargetBean", "isTrackInvalid", "parseTargetImageLoadedSize", "feedList", "Lcom/alibaba/fastjson/JSONArray;", "setTrackEnd", "statCurrentStageTime", "startBean", "endBean", "stageName", "statImageLoadedStageAndCompleteStage", "statSubStage", "startSection", "endSection", "name", "statSubStageWithoutImageLoaded", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ivz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String STAGE_END_IMAGE_LOADED = "endImageLoaded";

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, ivw> f29350a;
    private final ArrayList<ivw> b;
    private final Handler c;
    private boolean d;
    private boolean e;
    private iwa f;
    private JSONObject g;
    private String h;
    private RateFeedsFragment i;
    private long j;
    private long k;
    private xpq l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/detail/rate/util/track/RateListFirstFrameTrackManager$Companion;", "", "()V", "STAGE_END_ALL", "", "STAGE_END_DATA_HANDLE", "STAGE_END_IMAGE_LOADED", "STAGE_END_NET_REQUEST", "STAGE_START_CLICK", "STAGE_START_CONTAINER_CREATE", "STAGE_START_NAV", "STAGE_START_NET_REQUEST", RPCDataItems.SWITCH_TAG_LOG, "TRACK_BIZ", "TRACK_FIRST_FRAME", "TRACK_PAGE_NAME", "TRACK_PROCESS", "TRACK_PROCESS_CLICK_RESPONSE", "TRACK_PROCESS_CREATE", "TRACK_PROCESS_DATA_HANDLE", "TRACK_PROCESS_NAV_RESPONSE", "TRACK_PROCESS_NET", "TRACK_PROCESS_RENDER", "TRACK_TOTAL_FIRST_FRAME", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public ivz(RateFeedsFragment fragment, Long l, Long l2, String str) {
        q.d(fragment, "fragment");
        this.f29350a = new HashMap<>();
        this.b = new ArrayList<>();
        this.c = new Handler(Looper.getMainLooper());
        this.d = a();
        if (this.d) {
            this.e = true;
            this.h = str;
            this.i = fragment;
            f();
            long currentTimeMillis = System.currentTimeMillis();
            if (l != null && l.longValue() > 0) {
                this.j = l.longValue();
            } else {
                this.j = currentTimeMillis;
            }
            if (l2 != null && l2.longValue() > 0) {
                this.k = l2.longValue();
            } else {
                this.k = currentTimeMillis;
            }
            a("startClick", new ivy("startClick", this.j, new JSONObject()));
            a("startNav", new ivy("startNav", this.k, new JSONObject()));
            a("rateListContainerCreate", new ivy("rateListContainerCreate", currentTimeMillis, new JSONObject()));
            this.c.postDelayed(new Runnable() { // from class: tb.ivz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ivz.this.c();
                    }
                }
            }, kio.INSTANCE.z());
            this.l = new xpq("RateList", "31158-tracker", "http://taobao.com/jstracker/rateList.html");
            xpq xpqVar = this.l;
            if (xpqVar == null) {
                return;
            }
            xpqVar.c("RateListFirstFrameTrackManager");
        }
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        boolean w = kio.INSTANCE.w();
        String str = "isEnable is = " + w;
        return w;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e = false;
        f();
    }

    public final void a(String keySection, ivw stagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e622b78", new Object[]{this, keySection, stagBean});
            return;
        }
        q.d(keySection, "keySection");
        q.d(stagBean, "stagBean");
        if (!e()) {
            return;
        }
        String str = "current keySection = " + keySection;
        this.f29350a.put(keySection, stagBean);
        String str2 = keySection;
        if (StringUtils.equals(str2, "endDataHandle")) {
            JSONObject b = stagBean.b();
            if (b == null) {
                return;
            }
            a(b);
            d();
            a(b.getJSONArray("rateList"));
        } else if (!StringUtils.equals(str2, "endImageLoaded")) {
        } else {
            b(stagBean);
        }
    }

    public final void a(ivw subStagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee77b5ae", new Object[]{this, subStagBean});
            return;
        }
        q.d(subStagBean, "subStagBean");
        if (!e() || !(subStagBean instanceof ivx)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sub mage type = ");
        ivx ivxVar = (ivx) subStagBean;
        sb.append(ivxVar.f29349a);
        sb.toString();
        int i = ivxVar.b;
        iwa iwaVar = this.f;
        if (iwaVar != null) {
            if (i >= iwaVar.a()) {
                return;
            }
            this.b.add(subStagBean);
            if (!iwaVar.a(ivxVar)) {
                return;
            }
            a(ivxVar.d, ivxVar.e);
            return;
        }
        a(ivxVar.d, ivxVar.e);
    }

    private final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray == null || jSONArray.size() == 0) {
            ivw a2 = a("endDataHandle");
            if (a2 == null) {
                return;
            }
            a(a2.a(), a2.b());
        } else {
            this.f = new iwa(jSONArray);
        }
    }

    private final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject copyParams = JSON.parseObject(JSON.toJSONString(jSONObject));
        copyParams.remove("rateList");
        q.b(copyParams, "copyParams");
        JSONObject jSONObject2 = copyParams;
        jSONObject2.put((JSONObject) tbt.PRE_RENDER, (String) Boolean.valueOf(ses.INSTANCE.a()));
        jSONObject2.put((JSONObject) "openMode", this.h);
        jSONObject2.put((JSONObject) nfc.PHA_MONITOR_IS_COLD_START, (String) Boolean.valueOf(RateDisplayApplication.isColdStart));
        jSONObject2.put((JSONObject) "clickStage", (String) Long.valueOf(this.k - this.j));
        this.g = copyParams;
    }

    private final void a(String str, String str2, String str3) {
        ivw a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        ivw a3 = a(str2);
        if (a3 == null || (a2 = a(str)) == null) {
            return;
        }
        a(a2, a3, str3);
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!e()) {
        } else {
            a("startClick", "startNav", "clickProcess");
            a("startNav", "rateListContainerCreate", "navProcess");
            a("rateListContainerCreate", "startNetworkRequest", "createProcess");
            a("startNetworkRequest", "endNetworkRequest", "networkProcess");
            a("endNetworkRequest", "endDataHandle", "dataHandleProcess");
        }
    }

    private final void b(ivw ivwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfabc2f", new Object[]{this, ivwVar});
            return;
        }
        ivw a2 = a("endDataHandle");
        if (a2 != null) {
            a(a2, ivwVar, "renderProcess");
        }
        ivy ivyVar = new ivy("endALL", ivwVar.a(), new JSONObject());
        this.f29350a.put("endALL", ivyVar);
        ivw a3 = a("startClick");
        if (a3 != null) {
            a(a3, ivyVar, "firstFrame");
        }
        RateFeedsFragment rateFeedsFragment = this.i;
        if (rateFeedsFragment != null) {
            nkv.INSTANCE.a(rateFeedsFragment);
        }
        xpq xpqVar = this.l;
        if (xpqVar != null) {
            xpqVar.a(kio.INSTANCE.E());
            xpqVar.a(JSON.toJSONString(this.g));
            com.taobao.trade.common.kit.tracker.a.a(xpqVar);
        }
        c();
    }

    private final void a(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c5ff14", new Object[]{this, new Long(j), jSONObject});
        } else {
            a("endImageLoaded", new ivy("endImageLoaded", j, jSONObject));
        }
    }

    private final void a(ivw ivwVar, ivw ivwVar2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda4adbe", new Object[]{this, ivwVar, ivwVar2, str});
            return;
        }
        long a2 = ivwVar2.a() - ivwVar.a();
        if (StringUtils.equals(str, "firstFrame")) {
            str2 = "first_frame_rate_list";
        } else {
            str2 = "process_rate_list_" + str;
        }
        kik.a("rate_performance", "rate_cost", str2, String.valueOf(a2), this.g);
        String str3 = str + " cost time = " + a2;
        xpq xpqVar = this.l;
        if (xpqVar == null) {
            return;
        }
        xpqVar.a(str2, a2);
    }

    private final ivw a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ivw) ipChange.ipc$dispatch("7c70d26a", new Object[]{this, str}) : this.f29350a.get(str);
    }

    private final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.d && this.e;
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f29350a.clear();
        this.b.clear();
        this.c.removeCallbacksAndMessages(null);
    }
}
