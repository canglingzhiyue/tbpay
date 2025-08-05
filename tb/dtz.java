package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

@AURAExtensionImpl(code = "alibuy.impl.performance.customStage.containerTime")
/* loaded from: classes4.dex */
public final class dtz extends azi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STAGE_KEY_AURA_START = "aura_start_time";
    public static final String STAGE_KEY_BUY_ON_CREATE = "buy_on_create_time";
    public static final String STAGE_KEY_CLICK_START = "start_click_time";
    public static final String STAGE_KEY_COUPON_FINISH = "coupon_finish";
    public static final String STAGE_KEY_NAV_START = "nav_start_time";
    public static final String STAGE_KEY_URL_START = "ode_url_start_time";
    public static final String USER_CONTEXT_KEY = "container_time";

    /* renamed from: a  reason: collision with root package name */
    private q f26981a;

    static {
        kge.a(69303968);
    }

    public static /* synthetic */ Object ipc$super(dtz dtzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.aqy, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f26981a = qVar;
        }
    }

    private JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : (JSONObject) this.f26981a.a(USER_CONTEXT_KEY, JSONObject.class);
    }

    @Override // tb.azi
    public List<AURAPerformanceStageModel> d() {
        AURAPerformanceStageModel a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        JSONObject e = e();
        if (e == null || (a2 = a(e)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        return arrayList;
    }

    private AURAPerformanceStageModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPerformanceStageModel) ipChange.ipc$dispatch("d11cfbcc", new Object[]{this, jSONObject});
        }
        try {
            Long l = jSONObject.getLong(STAGE_KEY_CLICK_START);
            Long l2 = jSONObject.getLong(STAGE_KEY_COUPON_FINISH);
            jSONObject.getLong(STAGE_KEY_URL_START);
            Long l3 = jSONObject.getLong(STAGE_KEY_NAV_START);
            Long l4 = jSONObject.getLong(STAGE_KEY_BUY_ON_CREATE);
            Long l5 = jSONObject.getLong(STAGE_KEY_AURA_START);
            AURAPerformanceStageModel aURAPerformanceStageModel = new AURAPerformanceStageModel("containerTime");
            aURAPerformanceStageModel.setStartMills((l.longValue() != 0 ? l : l3).longValue());
            aURAPerformanceStageModel.setEndMills(l5.longValue());
            if (l.longValue() != 0 && l2.longValue() != 0) {
                AURAPerformanceStageModel aURAPerformanceStageModel2 = new AURAPerformanceStageModel("coupon");
                aURAPerformanceStageModel2.setStartMills(l.longValue());
                aURAPerformanceStageModel2.setEndMills(l2.longValue());
                aURAPerformanceStageModel.addChildStage(aURAPerformanceStageModel2);
            }
            if (l3.longValue() != 0 && l4.longValue() != 0) {
                AURAPerformanceStageModel aURAPerformanceStageModel3 = new AURAPerformanceStageModel("newBuyNavTime");
                aURAPerformanceStageModel3.setStartMills(l3.longValue());
                aURAPerformanceStageModel3.setEndMills(l4.longValue());
                aURAPerformanceStageModel.addChildStage(aURAPerformanceStageModel3);
            }
            if (l5.longValue() != 0 && l4.longValue() != 0) {
                AURAPerformanceStageModel aURAPerformanceStageModel4 = new AURAPerformanceStageModel("newBuyInit");
                aURAPerformanceStageModel4.setStartMills(l4.longValue());
                aURAPerformanceStageModel4.setEndMills(l5.longValue());
                aURAPerformanceStageModel.addChildStage(aURAPerformanceStageModel4);
            }
            return aURAPerformanceStageModel;
        } catch (Throwable unused) {
            return null;
        }
    }
}
