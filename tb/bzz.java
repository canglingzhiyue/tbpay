package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.trigger.h;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.taolive.room.utils.ag;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class bzz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26217a = false;
    private static boolean b = false;
    private static boolean c = false;
    public static final String tlogTag = "Monitor";

    static {
        kge.a(732938574);
        f26217a = false;
        b = true;
        c = false;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f26217a = z;
        }
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void a(d dVar) {
        cai processCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27c3b8", new Object[]{dVar});
        } else if (dVar == null || dVar.t() == null || dVar.t().k) {
        } else {
            OnePopModule t = dVar.t();
            if (b) {
                d(dVar);
            }
            if (!b) {
                if (f26217a && t.T == OnePopModule.OnePopLoseReasonCode.ConfigCheckFail) {
                    e(dVar);
                    return;
                }
                t.k = true;
                BaseConfigItem x = dVar.x();
                Event y = dVar.y();
                if (!dVar.A() && x != null && TextUtils.isEmpty(x.indexID)) {
                    c.a(tlogTag, "pageLifeCycle", x.indexID, "MonitorTrackCommon.trackOnePop.indexIdIsEmpty.");
                    return;
                }
                if (t.T == null) {
                    t.T = OnePopModule.OnePopLoseReasonCode.other;
                }
                Map<String, String> a2 = a(t);
                bzy.a().a("OnePop", a2, new HashMap());
                cac.a().a("OnePop", y.curPage, x, a2);
                c.a("MonitorTrackCommon.trackOnePop.arg=%s", a2);
            } else if ("true".equals(t.r)) {
                t.k = true;
                BaseConfigItem x2 = dVar.x();
                if (!dVar.A() && x2 != null && TextUtils.isEmpty(x2.indexID)) {
                    c.a(tlogTag, "pageLifeCycle", x2.indexID, "MonitorTrackCommon.trackOnePop.indexIdIsEmpty.");
                    return;
                }
                if (t.T == null) {
                    t.T = OnePopModule.OnePopLoseReasonCode.other;
                }
                Map<String, String> a3 = a(t);
                bzy.a().a("OnePop", a3, new HashMap());
                c.a("MonitorTrackCommon.trackOnePop.arg=%s", a3);
            }
            try {
                Event y2 = dVar.y();
                if (y2 == null || (processCallBack = y2.getProcessCallBack()) == null) {
                    return;
                }
                processCallBack.a(dVar.z(), Boolean.parseBoolean(t.r), Boolean.parseBoolean(t.s), t.T.name(), t.U);
            } catch (Throwable th) {
                c.a("MonitorTrackCommon.trackOnePop.processCallBack.onClosed.error", th);
            }
        }
    }

    private static void d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1f3e3b", new Object[]{dVar});
        } else if (dVar == null || dVar.t() == null || dVar.t().k) {
        } else {
            OnePopModule t = dVar.t();
            t.k = true;
            BaseConfigItem x = dVar.x();
            if (!dVar.A() && x != null && TextUtils.isEmpty(x.indexID)) {
                c.a(tlogTag, "pageLifeCycle", x.indexID, "MonitorTrackCommon.trackPopProcess.indexIdIsEmpty.");
                return;
            }
            if (t.T == null) {
                t.T = OnePopModule.OnePopLoseReasonCode.other;
            }
            Map<String, String> a2 = a(t);
            bzy.a().a("PopProcess", a2, new HashMap());
            c.a("MonitorTrackCommon.trackPopProcess.arg=%s", a2);
            caa.a(dVar);
        }
    }

    public static void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cf9739", new Object[]{dVar});
        } else if (!c || dVar == null || dVar.t() == null || dVar.t().l) {
        } else {
            OnePopModule t = dVar.t();
            t.l = true;
            BaseConfigItem x = dVar.x();
            if (!dVar.A() && x != null && TextUtils.isEmpty(x.indexID)) {
                c.a(tlogTag, "pageLifeCycle", x.indexID, "MonitorTrackCommon.trackPopDisplay.indexIdIsEmpty.");
                return;
            }
            Map<String, String> a2 = a(t);
            bzy.a().a("PopProcess", a2, new HashMap());
            c.a("MonitorTrackCommon.trackPopDisplay.arg=%s", a2);
        }
    }

    private static void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc711bc", new Object[]{dVar});
        } else if (dVar == null || dVar.t() == null || dVar.t().T != OnePopModule.OnePopLoseReasonCode.ConfigCheckFail || dVar.t().k) {
        } else {
            OnePopModule t = dVar.t();
            t.k = true;
            BaseConfigItem x = dVar.x();
            if (x == null || TextUtils.isEmpty(x.indexID)) {
                c.a(tlogTag, "pageLifeCycle", x != null ? x.indexID : "", "MonitorTrackCommon.trackConfigCheckFail.indexIdIsEmpty.");
                return;
            }
            Map<String, String> a2 = a(t);
            bzy.a().a(bzy.POINT_CONFIG_FAIL, a2, new HashMap());
            c.a("MonitorTrackCommon.trackConfigCheckFail.arg=%s", a2);
        }
    }

    public static void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36776aba", new Object[]{dVar});
        } else if (dVar == null || dVar.t() == null || dVar.t().m) {
        } else {
            OnePopModule t = dVar.t();
            if (t.T == null) {
                return;
            }
            BaseConfigItem x = dVar.x();
            if (TextUtils.isEmpty(x.indexID)) {
                c.a(tlogTag, "pageLifeCycle", x.indexID, "MonitorTrackCommon.trackPopError.indexIdIsEmpty.");
                return;
            }
            t.m = true;
            Map<String, String> b2 = b(t);
            bzy.a().a("PopError", b2, new HashMap());
            c.a("MonitorTrackCommon.trackPopError.arg=%s", b2);
        }
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("configParseTime", a(String.valueOf(j)));
        bzy.a().a(bzy.POINT_CONFIG_PARSE_TIME, hashMap, new HashMap());
        c.a("MonitorTrackCommon.trackConfigParseTime.arg=%s", hashMap);
    }

    private static void a(OnePopModule onePopModule, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b63536", new Object[]{onePopModule, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            map.put("uuid", onePopModule.b);
            map.put("indexId", onePopModule.f3203a);
            map.put("pageName", onePopModule.aw);
            map.put("pageUrl", onePopModule.d);
            map.put("triggerEvent", onePopModule.e);
            map.put("sceneId", onePopModule.f);
            map.put("bizId", onePopModule.g);
            map.put("orangeVersion", onePopModule.h);
            map.put("embed", onePopModule.i);
            map.put("popTraceId", onePopModule.j);
            map.put("popTimeStamp", String.valueOf(PopLayer.getReference().getCurrentTimeStamp(false)));
            String str = "none_value";
            map.put("viewRenderType", !TextUtils.isEmpty(onePopModule.ab) ? onePopModule.ab : str);
            map.put("gradualExposeABBucketId", !TextUtils.isEmpty(onePopModule.aq) ? onePopModule.aq : str);
            if (!TextUtils.isEmpty(onePopModule.ap)) {
                str = onePopModule.ap;
            }
            map.put("nativePopABBucketId", str);
            map.put("triggerToDisplayCostTime", a(onePopModule.O));
            map.put("isColdLaunch", a(String.valueOf(onePopModule.an)));
        } catch (Throwable th) {
            c.a("AppMonitorAdapter addBaseDimensions error.", th);
        }
    }

    private static Map<String, String> a(OnePopModule onePopModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35733e64", new Object[]{onePopModule});
        }
        HashMap hashMap = new HashMap();
        if (onePopModule == null) {
            onePopModule = new OnePopModule();
        }
        a(onePopModule, hashMap);
        try {
            hashMap.put("startTimeStamp", a(String.valueOf(onePopModule.ac)));
            hashMap.put("configCheckSuccess", a(onePopModule.n));
            hashMap.put("LMCheckSuccess", a(onePopModule.o));
            hashMap.put("crowdCheckSuccess", a(onePopModule.p));
            hashMap.put("mtopCheckSuccess", a(onePopModule.q));
            hashMap.put("viewCreated", a(onePopModule.r));
            hashMap.put("displayed", a(onePopModule.s));
            hashMap.put("continuousDisplayIndex", a(String.valueOf(onePopModule.t)));
            hashMap.put("crowdCheckSuccessReason", a(onePopModule.u));
            hashMap.put("mtopCheckSuccessReason", a(onePopModule.v));
            hashMap.put("mtopCheckTraceId", a(onePopModule.w));
            hashMap.put("configCheckTime", a(onePopModule.x));
            hashMap.put("LMTime", a(onePopModule.y));
            hashMap.put("LMEnqueueWaitTime", a(onePopModule.z));
            hashMap.put("LMEnqueueWaitEachTime", a(onePopModule.A));
            hashMap.put("viewLoadDelayTime", a(onePopModule.B));
            hashMap.put("crowdCheckTime", a(onePopModule.C));
            hashMap.put("preCheckTime", a(onePopModule.D));
            hashMap.put("prepareLoadTime", a(onePopModule.E));
            hashMap.put(ag.KEY_LOAD_TIME, a(onePopModule.F));
            hashMap.put("invisibleTime", a(onePopModule.G));
            hashMap.put("retainTime", a(onePopModule.H));
            hashMap.put("viewPrepareCostTime", a(onePopModule.I));
            hashMap.put("viewRequestCostTime", a(onePopModule.J));
            hashMap.put("viewLoadMaterialCostTime", a(onePopModule.K));
            hashMap.put("viewMtopCostTime", a(onePopModule.L));
            hashMap.put("increaseTimes", a(onePopModule.Q));
            hashMap.put("jumpTimes", a(String.valueOf(onePopModule.a())));
            hashMap.put("jumpUrl", a(onePopModule.b()));
            hashMap.put("finished", a(onePopModule.R));
            String str = "";
            hashMap.put("loseReasonCode", a(onePopModule.T != null ? onePopModule.T.name() : str));
            hashMap.put("loseSubErrorCode", a(onePopModule.U));
            hashMap.put("contentId", a(onePopModule.S));
            hashMap.put("contentID", a(onePopModule.S));
            hashMap.put("userResult", a(onePopModule.aa));
            hashMap.put("preDealTraceId", a(onePopModule.Y));
            hashMap.put("preDealResult", a(onePopModule.X));
            hashMap.put("preDealConfigName", a(onePopModule.Z));
            hashMap.put("preDealCostTime", a(onePopModule.M));
            hashMap.put("receiveEventTime", a(onePopModule.N));
            hashMap.put(h.KEY_SDK_WAIT_TIME, a(onePopModule.P));
            if (!onePopModule.ar.isEmpty()) {
                str = onePopModule.ar.toJSONString();
            }
            hashMap.put("extras", a(str));
        } catch (Throwable th) {
            c.a("MonitorTrackCommon.transOnePopDimension.error.", th);
        }
        return hashMap;
    }

    private static Map<String, String> b(OnePopModule onePopModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1134ba25", new Object[]{onePopModule});
        }
        HashMap hashMap = new HashMap();
        if (onePopModule == null) {
            onePopModule = new OnePopModule();
        }
        a(onePopModule, hashMap);
        try {
            hashMap.put("startTimeStamp", a(String.valueOf(onePopModule.ac)));
            hashMap.put("errorCode", a(onePopModule.T.name()));
            hashMap.put("subErrorCode", a(onePopModule.U));
            if (onePopModule.V != null && onePopModule.V.length() > 10240) {
                onePopModule.V = onePopModule.V.substring(0, AccsConnection.DATA_PACKAGE_MAX);
            }
            hashMap.put("errorMessage", a(onePopModule.V));
            String str = onePopModule.W;
            if (str != null && str.length() > 10240) {
                str = null;
            }
            hashMap.put("errorInfo", a(str));
        } catch (Throwable th) {
            c.a("MonitorTrackCommon.transPopErrorDimension.error.", th);
        }
        return hashMap;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }
}
