package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.detail.rate.RateDisplayApplication;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\u0018\u0000 :2\u00020\u0001:\u0001:B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000fJ\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\tH\u0002J\u0016\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u000fJ\u001a\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010*\u001a\u00020 H\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010,\u001a\u00020\u0014H\u0002J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010.\u001a\u00020 2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010/\u001a\u00020 J \u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u0006H\u0002J\u0010\u00104\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000fH\u0002J \u00105\u001a\u00020 2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J\b\u00109\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u001dj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f`\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/taobao/detail/rate/util/track/RateListLoadingViewFrameTrack;", "", "clickTime", "", "navTime", "openMode", "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "customParams", "Lcom/alibaba/fastjson/JSONObject;", "detailRate", "handler", "Landroid/os/Handler;", "imageLoadControlList", "Ljava/util/ArrayList;", "Lcom/taobao/detail/rate/util/track/IStageBean;", "Lkotlin/collections/ArrayList;", "imageLoadedTarget", "Lcom/taobao/detail/rate/util/track/LoadingViewImageLoadedTarget;", Constant.API_PARAMS_KEY_ENABLE, "", "isTrackStart", "getOpenMode", "()Ljava/lang/String;", "setOpenMode", "(Ljava/lang/String;)V", "perfModel", "Lcom/taobao/trade/common/kit/tracker/model/PerfModel;", "stageControlMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "addImageLoadedSubStage", "", "subStagBean", "addPublicParams", "param", "addStage", "keySection", "stagBean", "buildImageStageAndStat", "timeStamp", "exParams", "clearTrack", "getTargetBean", "isTrackInvalid", "parseTargetImageLoadedSize", "setDetailRate", "setTrackEnd", "statCurrentStageTime", "startBean", "endBean", "stageName", "statImageLoadedStageAndCompleteStage", "statSubStage", "startSection", "endSection", "name", "statSubStageWithoutImageLoaded", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class xmt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String STAGE_END_IMAGE_LOADED = "endImageLoaded";

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, ivw> f34378a = new HashMap<>();
    private final ArrayList<ivw> b = new ArrayList<>();
    private final Handler c = new Handler(Looper.getMainLooper());
    private boolean d = b();
    private boolean e;
    private xms f;
    private JSONObject g;
    private String h;
    private long i;
    private long j;
    private JSONObject k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/detail/rate/util/track/RateListLoadingViewFrameTrack$Companion;", "", "()V", "STAGE_END_ALL", "", "STAGE_END_IMAGE_LOADED", "STAGE_START_CLICK", "STAGE_START_CONTAINER_CREATE", "STAGE_START_NAV", RPCDataItems.SWITCH_TAG_LOG, "TRACK_BIZ", "TRACK_FIRST_FRAME", "TRACK_PAGE_NAME", "TRACK_PROCESS", "TRACK_PROCESS_CLICK_RESPONSE", "TRACK_PROCESS_NAV_RESPONSE", "TRACK_PROCESS_RENDER", "TRACK_TOTAL_FIRST_FRAME", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public xmt(Long l, Long l2, String str) {
        if (this.d) {
            this.e = true;
            this.h = str;
            e();
            long currentTimeMillis = System.currentTimeMillis();
            if (l != null && l.longValue() > 0) {
                this.i = l.longValue();
            } else {
                this.i = currentTimeMillis;
            }
            if (l2 != null && l2.longValue() > 0) {
                this.j = l2.longValue();
            } else {
                this.j = currentTimeMillis;
            }
            a("startClick", new ivy("startClick", this.i, new JSONObject()));
            a("startNav", new ivy("startNav", this.j, new JSONObject()));
            a("rateListContainerCreate", new ivy("rateListContainerCreate", currentTimeMillis, new JSONObject()));
            this.c.postDelayed(new Runnable() { // from class: tb.xmt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xmt.this.a();
                    }
                }
            }, kio.INSTANCE.z());
        }
    }

    private final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        boolean A = kio.INSTANCE.A();
        String str = "isEnable is = " + A;
        return A;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = false;
        e();
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.k = jSONObject;
        }
    }

    public final void a(String keySection, ivw stagBean) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e622b78", new Object[]{this, keySection, stagBean});
            return;
        }
        q.d(keySection, "keySection");
        q.d(stagBean, "stagBean");
        if (!d()) {
            return;
        }
        String str = "current keySection = " + keySection;
        this.f34378a.put(keySection, stagBean);
        if (!TextUtils.equals(keySection, "endImageLoaded") || (jSONObject = this.k) == null) {
            return;
        }
        c(jSONObject);
        if (b(jSONObject)) {
            c();
            b(stagBean);
            return;
        }
        a();
    }

    public final void a(ivw subStagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee77b5ae", new Object[]{this, subStagBean});
            return;
        }
        q.d(subStagBean, "subStagBean");
        if (!d() || !(subStagBean instanceof ivx)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sub mage type = ");
        ivx ivxVar = (ivx) subStagBean;
        sb.append(ivxVar.f29349a);
        sb.toString();
        int i = ivxVar.b;
        xms xmsVar = this.f;
        if (xmsVar != null) {
            if (i >= xmsVar.a()) {
                return;
            }
            this.b.add(subStagBean);
            if (!xmsVar.a(ivxVar)) {
                return;
            }
            a(ivxVar.d, ivxVar.e);
            return;
        }
        a(ivxVar.d, ivxVar.e);
    }

    private final boolean b(JSONObject jSONObject) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject a3 = fxr.a("group", jSONObject, (JSONObject) null);
        if (a3 == null || (a2 = fxr.a("items", a3, (JSONArray) null)) == null || a2.size() <= 0) {
            return false;
        }
        this.f = new xms(a2);
        return true;
    }

    private final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.remove("rateList");
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) c.KEY_DATA_SOURCE, fxr.a(c.KEY_DATA_SOURCE, jSONObject, "detail"));
        jSONObject3.put((JSONObject) tbt.PRE_RENDER, (String) Boolean.valueOf(ses.INSTANCE.a()));
        jSONObject3.put((JSONObject) "openMode", this.h);
        jSONObject3.put((JSONObject) nfc.PHA_MONITOR_IS_COLD_START, (String) Boolean.valueOf(RateDisplayApplication.isColdStart));
        this.g = jSONObject2;
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

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!d()) {
        } else {
            a("startClick", "startNav", "clickProcess");
            a("startNav", "rateListContainerCreate", "navProcess");
        }
    }

    private final void b(ivw ivwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfabc2f", new Object[]{this, ivwVar});
            return;
        }
        ivw a2 = a("rateListContainerCreate");
        if (a2 != null) {
            a(a2, ivwVar, "renderProcess");
        }
        ivy ivyVar = new ivy("endALL", ivwVar.a(), new JSONObject());
        this.f34378a.put("endALL", ivyVar);
        ivw a3 = a("startClick");
        if (a3 != null) {
            a(a3, ivyVar, "firstFrame");
        }
        a();
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
        if (TextUtils.equals(str, "firstFrame")) {
            str2 = "first_frame_rate_list";
        } else {
            str2 = "process_rate_list_" + str;
        }
        kik.a("rate_performance", "rate_loading_view_cost", str2, String.valueOf(a2), this.g);
        String str3 = str + " cost time = " + a2;
    }

    private final ivw a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ivw) ipChange.ipc$dispatch("7c70d26a", new Object[]{this, str}) : this.f34378a.get(str);
    }

    private final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d && this.e;
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f34378a.clear();
        this.b.clear();
        this.c.removeCallbacksAndMessages(null);
    }
}
