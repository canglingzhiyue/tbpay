package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.poplayer.trigger.h;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.taolive.room.utils.ag;
import com.taobao.tbpoplayer.util.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class qnx implements cad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32969a = "";
    private boolean b = false;

    static {
        kge.a(406575524);
        kge.a(843903071);
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            String userId = Login.getUserId();
            String str = "none_value";
            if (TextUtils.isEmpty(userId)) {
                userId = str;
            }
            map.put("userId", userId);
            if (TextUtils.isEmpty(this.f32969a)) {
                this.f32969a = e.a();
            }
            if (!TextUtils.isEmpty(this.f32969a)) {
                str = this.f32969a;
            }
            map.put("deviceLevel", str);
        } catch (Throwable th) {
            c.a("AppMonitorAdapter addBaseDimensions error.", th);
        }
    }

    @Override // tb.cad
    public void a(String str, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{this, str, map, map2});
            return;
        }
        try {
            if (!this.b) {
                c();
            }
            if (qnz.a().d() && qnz.a().a(str)) {
                a(map);
                DimensionValueSet create = DimensionValueSet.create();
                create.setMap(map);
                MeasureValueSet create2 = MeasureValueSet.create();
                if (map2 == null) {
                    map2 = new HashMap<>();
                }
                for (String str2 : map2.keySet()) {
                    if (!TextUtils.isEmpty(str2)) {
                        create2.setValue(str2, map2.get(str2).doubleValue());
                    }
                }
                AppMonitor.Stat.commit("PopLayer", str, create, create2);
                c.c("pageLifeCycle", "", "[Stat][point]" + str + "-[arg]" + map);
            }
        } catch (Throwable th) {
            c.a("AppMonitorAdapter stat error.", th);
        }
    }

    private DimensionSet a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DimensionSet) ipChange.ipc$dispatch("5821678c", new Object[]{this}) : DimensionSet.create().addDimension("uuid").addDimension("indexId").addDimension("pageName").addDimension("pageUrl").addDimension("triggerEvent").addDimension("sceneId").addDimension("bizId").addDimension("orangeVersion").addDimension("userId").addDimension("popTimeStamp").addDimension("popTraceId").addDimension("mainProcess").addDimension("abGroupID").addDimension("startTimeStamp");
    }

    private DimensionSet b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DimensionSet) ipChange.ipc$dispatch("9bac854d", new Object[]{this}) : a().addDimension("configCheckSuccess").addDimension("LMCheckSuccess").addDimension("crowdCheckSuccess").addDimension("mtopCheckSuccess").addDimension("viewCreated").addDimension("displayed").addDimension("LMEnqueueWaitTime").addDimension("LMEnqueueWaitEachTime").addDimension("continuousDisplayIndex").addDimension("crowdCheckSuccessReason").addDimension("mtopCheckSuccessReason").addDimension("mtopCheckTraceId").addDimension("configCheckTime").addDimension("LMTime").addDimension("viewLoadDelayTime").addDimension("crowdCheckTime").addDimension("preCheckTime").addDimension(ag.KEY_LOAD_TIME).addDimension("invisibleTime").addDimension("retainTime").addDimension("increaseTimes").addDimension("jumpTimes").addDimension("jumpUrl").addDimension("finished").addDimension("loseReasonCode").addDimension("loseSubErrorCode").addDimension("viewRequestCostTime").addDimension("viewLoadMaterialCostTime").addDimension("viewMtopCostTime").addDimension("viewPrepareCostTime").addDimension("contentId").addDimension("contentID").addDimension("extras").addDimension("preDealResult").addDimension("preDealTraceId").addDimension("preDealCostTime").addDimension("receiveEventTime").addDimension(h.KEY_SDK_WAIT_TIME).addDimension("userResult").addDimension("deviceLevel").addDimension("gradualExposeABBucketId").addDimension("nativePopABBucketId").addDimension("viewRenderType").addDimension("triggerToDisplayCostTime").addDimension("isColdLaunch").addDimension("preDealConfigName");
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        AppMonitor.register("PopLayer", "OnePop", MeasureSet.create(), b(), true);
        AppMonitor.register("PopLayer", "PopProcess", MeasureSet.create(), b(), true);
        AppMonitor.register("PopLayer", bzy.POINT_POP_DISPLAY, MeasureSet.create(), b(), true);
        AppMonitor.register("PopLayer", bzy.POINT_CONFIG_FAIL, MeasureSet.create(), b(), true);
        AppMonitor.register("PopLayer", "PopError", MeasureSet.create(), a().addDimension("errorCode").addDimension("subErrorCode").addDimension("errorMessage").addDimension("errorInfo").addDimension("useFileHelperFix"), true);
        AppMonitor.register("PopLayer", "JumpLose", MeasureSet.create(), a().addDimension("jumpTimes").addDimension("firstJumpPageUrl").addDimension("firstJumpPage").addDimension("secondJumpPageUrl").addDimension("secondJumpPage").addDimension("thirdJumpPageUrl").addDimension("thirdJumpPage").addDimension("fourthJumpPageUrl").addDimension("fourthJumpPage").addDimension("fifthJumpPageUrl").addDimension("fifthJumpPage").addDimension("sixthJumpPageUrl").addDimension("sixthJumpPage").addDimension("seventhJumpPageUrl").addDimension("seventhJumpPage").addDimension("firstStayDuration").addDimension("secondStayDuration").addDimension("thirdStayDuration").addDimension("fourthStayDuration").addDimension("fifthStayDuration").addDimension("sixthStayDuration"), true);
        AppMonitor.register("PopLayer", bzy.POINT_TEMPLATE_CACHE, MeasureSet.create(), DimensionSet.create().addDimension("downloadType").addDimension(keq.DOWNLOAD_SUCCESS).addDimension("failReason").addDimension("costTime"), true);
        AppMonitor.register("PopLayer", bzy.POINT_COLD_LAUNCH_REOPEN, MeasureSet.create(), DimensionSet.create().addDimension("lastPageUrl").addDimension("lastPage").addDimension("lastRecordTime").addDimension("lastRecordType").addDimension("popCurTime"), true);
        AppMonitor.register("PopLayer", bzy.POINT_CONFIG_PARSE_TIME, MeasureSet.create(), DimensionSet.create().addDimension("configParseTime").addDimension("deviceLevel"), true);
        this.b = true;
    }
}
