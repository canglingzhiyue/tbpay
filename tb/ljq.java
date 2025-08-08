package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.c;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopStatistics;
import tb.lzc;

/* loaded from: classes5.dex */
public class ljq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f30690a;

    static {
        kge.a(-1578663301);
        f30690a = 60000L;
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{fluidContext, str});
        } else if (!a()) {
        } else {
            if (obu.i()) {
                spz.c("FastTrackUtils", "低端机优化，不统计fasttrack。return。");
                return;
            }
            sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams == null || FluidSDK.getMTopAdapter() == null) {
                return;
            }
            lzc lzcVar = new lzc();
            ((ITrackService) fluidContext.getService(ITrackService.class)).setPageFastTracker(lzcVar);
            lzc.a e = lzc.a.a(str).d("page").e("normal");
            e.a("type", sessionParams.b);
            e.a("source", sessionParams.c);
            e.a("enterId", sessionParams.d);
            e.a(obw.VIDEO_ACTION_TYPE_SHAREPLAYER, String.valueOf(((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).isEnableSharePlayer()));
            if (((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).isSharePlayerViewStateNoPlaying()) {
                e.b("errorSharePlayerState", "0");
            }
            float c = pio.c(fluidContext);
            spz.c("FastTrackUtils", "deviceScore:" + c);
            e.a("deviceScore", Float.valueOf(c));
            lzcVar.a(e);
        }
    }

    public static void a(FluidContext fluidContext) {
        lzc.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
            return;
        }
        lzc h = h(fluidContext);
        if (h == null || (a2 = h.a()) == null) {
            return;
        }
        ab sharedTNodeEngine = ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).getSharedTNodeEngine();
        if (sharedTNodeEngine != null) {
            a2.a("tMD5", sharedTNodeEngine.F());
        }
        a2.a("duration", String.valueOf(SystemClock.elapsedRealtime() - a2.i));
        h.b();
    }

    public static void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{fluidContext});
        } else if (!spj.d(fluidContext) || System.currentTimeMillis() - f30690a < juo.a() * 1000) {
        } else {
            a(fluidContext);
            f30690a = System.currentTimeMillis();
        }
    }

    public static lzc.a c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzc.a) ipChange.ipc$dispatch("daa82dd8", new Object[]{fluidContext});
        }
        lzc.a g = g(fluidContext);
        if (g == null) {
            return null;
        }
        g.e("detail");
        return g;
    }

    public static lzc.a d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzc.a) ipChange.ipc$dispatch("679544f7", new Object[]{fluidContext});
        }
        lzc.a g = g(fluidContext);
        if (g == null) {
            return null;
        }
        g.e("recommend");
        return g;
    }

    public static lzc.a e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzc.a) ipChange.ipc$dispatch("f4825c16", new Object[]{fluidContext});
        }
        lzc.a g = g(fluidContext);
        if (g == null) {
            return null;
        }
        g.e("reportNoExpose");
        return g;
    }

    public static void a(boolean z, lzc.a aVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18fc0ccf", new Object[]{new Boolean(z), aVar, mtopResponse});
        } else if (aVar == null) {
        } else {
            aVar.a("cost", String.valueOf(SystemClock.elapsedRealtime() - aVar.i));
            aVar.a("state", z ? "2" : "1");
            if (mtopResponse == null) {
                return;
            }
            if (z) {
                aVar.a("errorCode", mtopResponse.getRetCode());
                aVar.a("errorMsg", mtopResponse.getRetMsg());
            }
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            if (mtopStat == null) {
                return;
            }
            aVar.a("eTId", mtopStat.eagleEyeTraceId);
        }
    }

    public static void a(lzc.a aVar, MtopBuilder mtopBuilder) {
        a mtopContext;
        MtopStatistics mtopStatistics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5c3836", new Object[]{aVar, mtopBuilder});
        } else if (aVar == null || mtopBuilder == null || (mtopContext = mtopBuilder.getMtopContext()) == null || (mtopStatistics = mtopContext.g) == null) {
        } else {
            aVar.a("cTId", mtopStatistics.fullTraceId);
        }
    }

    private static lzc.a g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzc.a) ipChange.ipc$dispatch("e5c8a54", new Object[]{fluidContext});
        }
        lzc h = h(fluidContext);
        if (h == null) {
            return null;
        }
        lzc.a d = lzc.a.a().d("request");
        d.a("state", "0");
        return h.b(d);
    }

    public static void a(psw pswVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6bdd262", new Object[]{pswVar, str, str2, str3});
            return;
        }
        b(pswVar, str, str3);
        lzc.a e = e(pswVar);
        if (e == null) {
            return;
        }
        e.a("contentId", str2);
    }

    public static void a(psw pswVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7de2c4e", new Object[]{pswVar, str});
        } else {
            b(pswVar, "video", str);
        }
    }

    private static void b(psw pswVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2163b899", new Object[]{pswVar, str, str2});
        } else if (!a()) {
        } else {
            if (obu.i()) {
                spz.c("FastTrackUtils", "命中低端机优化，不统计fasttrack。return。");
            } else if (c(pswVar) != null) {
            } else {
                lzc lzcVar = new lzc();
                pswVar.v().a(lzcVar);
                lzcVar.a(lzc.a.a().b(d.b(pswVar.z())).d("cell").e(str).a("index", String.valueOf(b.a(pswVar.z()))).a("videoId", str2));
            }
        }
    }

    public static void b(psw pswVar, String str) {
        lzc.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc6f48f", new Object[]{pswVar, str});
            return;
        }
        lzc c = c(pswVar);
        if (c == null || (a2 = c.a()) == null) {
            return;
        }
        ab sharedTNodeEngine = ((IHostTNodeService) pswVar.z().getService(IHostTNodeService.class)).getSharedTNodeEngine();
        if (sharedTNodeEngine != null) {
            String F = sharedTNodeEngine.F();
            spz.a("FastTrackUtils", "FastTrackUtils cellEnd " + F);
            a2.a("tMD5", F);
        }
        a2.a("duration", String.valueOf(SystemClock.elapsedRealtime() - a2.i));
        c.a b = c.b(str);
        if (b != null) {
            a2.a("OBI", b.a());
            a2.a("PDC", Boolean.valueOf(b.f));
        }
        c.b();
        d(pswVar);
    }

    public static void a(psw pswVar) {
        long currentTimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3f5b84", new Object[]{pswVar});
            return;
        }
        lzc.a e = e(pswVar);
        if (e == null) {
            return;
        }
        IMTopAdapter mTopAdapter = FluidSDK.getMTopAdapter();
        if (mTopAdapter != null) {
            currentTimeMillis = mTopAdapter.getServerTimeMillis();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        e.a("activeTime", String.valueOf(currentTimeMillis));
        skl j = ((IDataService) pswVar.z().getService(IDataService.class)).getConfig().j();
        if (j != null) {
            e.a(Constants.Name.AUTO_PLAY, String.valueOf(sij.a(j.q)));
        }
        e.i = SystemClock.elapsedRealtime();
    }

    public static void c(psw pswVar, String str) {
        List arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1afbcd0", new Object[]{pswVar, str});
            return;
        }
        lzc.a e = e(pswVar);
        if (e == null || StringUtils.isEmpty(str)) {
            return;
        }
        Object f = e.f("playerTokens");
        if (f instanceof List) {
            arrayList = (List) f;
        } else {
            arrayList = new ArrayList(2);
        }
        arrayList.add(str);
        e.a("playerTokens", arrayList);
    }

    public static void a(psw pswVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21da1e98", new Object[]{pswVar, str, str2});
            return;
        }
        lzc.a e = e(pswVar);
        if (e == null || StringUtils.isEmpty(str)) {
            return;
        }
        e.a("lastErrorCode", str);
        e.a("lastErrorContent", str2);
    }

    public static void a(psw pswVar, String str, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2d152e", new Object[]{pswVar, str, map, map2});
        } else {
            a(pswVar, null, "action", str, map, map2);
        }
    }

    public static void d(psw pswVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6988511", new Object[]{pswVar, str});
        } else {
            c(pswVar, "nodes", str);
        }
    }

    public static void e(psw pswVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb814d52", new Object[]{pswVar, str});
        } else {
            c(pswVar, "states", str);
        }
    }

    private static void c(psw pswVar, String str, String str2) {
        lzc.a e;
        IMTopAdapter mTopAdapter;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ed529a", new Object[]{pswVar, str, str2});
        } else if (StringUtils.isEmpty(str2) || (e = e(pswVar)) == null || (mTopAdapter = FluidSDK.getMTopAdapter()) == null) {
        } else {
            long serverTimeMillis = mTopAdapter.getServerTimeMillis();
            Object f = e.f(str);
            String str4 = f instanceof String ? (String) f : "";
            if (str4.length() == 0) {
                str3 = serverTimeMillis + ":" + str2;
                e.j = serverTimeMillis;
            } else {
                str3 = str4 + "|" + (serverTimeMillis - e.j) + ":" + str2;
            }
            e.a(str, str3);
        }
    }

    public static lzc.a a(psw pswVar, String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzc.a) ipChange.ipc$dispatch("a8163f2", new Object[]{pswVar, str, str2, str3, map, map2});
        }
        lzc c = c(pswVar);
        lzc.a aVar = null;
        if (c != null && c.a() != null) {
            lzc.a a2 = c.a();
            if (a2 == null) {
                return null;
            }
            aVar = a(a2, str);
            if (aVar == null) {
                aVar = lzc.a.a(str).d(str2).e(str3);
                c.b(aVar);
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null && !map2.isEmpty()) {
                aVar.a(map2);
            }
        }
        return aVar;
    }

    public static Map f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ee295994", new Object[]{fluidContext});
        }
        lzc h = h(fluidContext);
        if (h == null) {
            return new HashMap();
        }
        return h.c();
    }

    public static Map b(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a2ea077a", new Object[]{pswVar});
        }
        lzc c = c(pswVar);
        if (c == null) {
            return new HashMap();
        }
        return c.c();
    }

    private static lzc.a a(lzc.a aVar, String str) {
        List<lzc.a> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzc.a) ipChange.ipc$dispatch("6de80e24", new Object[]{aVar, str});
        }
        if (aVar != null && str != null && (b = aVar.b()) != null && b.size() != 0) {
            for (lzc.a aVar2 : b) {
                if (StringUtils.equals(aVar2.f31001a, str)) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    private static lzc h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lzc) ipChange.ipc$dispatch("2d729fd0", new Object[]{fluidContext}) : ((ITrackService) fluidContext.getService(ITrackService.class)).getPageFastTracker();
    }

    private static lzc c(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lzc) ipChange.ipc$dispatch("cebe594b", new Object[]{pswVar}) : pswVar.v().b();
    }

    private static void d(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c86f07", new Object[]{pswVar});
        } else {
            pswVar.v().a((lzc) null);
        }
    }

    private static lzc.a e(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzc.a) ipChange.ipc$dispatch("25985d6c", new Object[]{pswVar});
        }
        lzc c = c(pswVar);
        if (c == null) {
            return null;
        }
        return c.a();
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !son.t() && juo.b();
    }
}
