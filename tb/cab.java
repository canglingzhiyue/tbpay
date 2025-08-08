package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class cab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1031260057);
    }

    /* renamed from: lambda$VZiMXuonpiKBe0iR16_XLy1Zi-I */
    public static /* synthetic */ void m2435lambda$VZiMXuonpiKBe0iR16_XLy1ZiI(String str, String str2, ActionLineModule actionLineModule, String str3, String str4, String str5) {
        a(str, str2, actionLineModule, str3, str4, str5);
    }

    public static /* synthetic */ void lambda$krVBr7bmz99xzJB7lkEV7eQcvQA(boolean z, Event event, String str) {
        a(z, event, str);
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else if (th == null) {
        } else {
            try {
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("ErrorCatch", str);
                hashMap.put("ErrorMessage", StringUtils.isEmpty(th.getMessage()) ? "empty" : th.getMessage());
                cac.a().a("other", "PopProgramError", null, hashMap);
            } catch (Throwable th2) {
                c.a("UserTrackCommon.trackProgramErrorCatch.error.", th2);
            }
        }
    }

    public static void a(String str, Map<String, String> map, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0b43a3", new Object[]{str, map, baseConfigItem});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("ProgramLogicName", str);
            hashMap.put("configItem", baseConfigItem != null ? baseConfigItem.indexID : "none");
            if (map != null) {
                hashMap.putAll(map);
            }
            cac.a().a("other", "", null, hashMap);
        } catch (Throwable th) {
            c.a("UserTrackCommon.trackProgramPoint.error.", th);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("ProgramLogic", "trackPopFileHelperFix");
            hashMap.put("pageJson", String.valueOf(str));
            hashMap.put("userId", PopLayer.getReference().getFaceAdapter().getUserId());
            hashMap.put("deviceId", PopLayer.getReference().getFaceAdapter().getDeviceId());
            cac.a().a("other", "", null, hashMap);
        } catch (Throwable th) {
            c.a("UserTrackCommon.trackPopFileHelperFix.error.", th);
        }
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        try {
            if (StringUtils.isEmpty(str2)) {
                str2 = "";
            }
            String str3 = str2;
            map.put("ProgramLogic", "PopReceiver");
            map.put("pointName", str);
            map.put("traceId", str3);
            map.put("userId", PopLayer.getReference().getFaceAdapter().getUserId());
            map.put("deviceId", PopLayer.getReference().getFaceAdapter().getDeviceId());
            cac.a().a(19999, "PopLayer_appLifeCycle", "PopReceiver", str, str3, map);
        } catch (Throwable th) {
            c.a("UserTrackCommon.trackPopFileHelperFix.error.", th);
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        try {
            cac.a().a(UtUtils.CHANGED_UPP_EVENT_ID, "PopLayerPerf", "Perf", str, String.valueOf(System.currentTimeMillis()), map);
        } catch (Throwable th) {
            c.a("UserTrackCommon.trackPopFileHelperFix.error.", th);
        }
    }

    public static void a(OnePopModule onePopModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d806645", new Object[]{onePopModule, new Boolean(z)});
        } else {
            a(onePopModule, 2201, "display", z);
        }
    }

    public static void b(OnePopModule onePopModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479be4e4", new Object[]{onePopModule, new Boolean(z)});
        } else {
            a(onePopModule, 2101, "click", z);
        }
    }

    public static void c(OnePopModule onePopModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b76383", new Object[]{onePopModule, new Boolean(z)});
        } else {
            a(onePopModule, 2101, "close", z);
        }
    }

    public static void a(String str, String str2, String str3, String str4, ActionLineModule actionLineModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f43c938", new Object[]{str, str2, str3, str4, actionLineModule});
        } else {
            a(str, str2, str3, str4, actionLineModule, "exposeState");
        }
    }

    public static void b(String str, String str2, String str3, String str4, ActionLineModule actionLineModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6302b939", new Object[]{str, str2, str3, str4, actionLineModule});
        } else {
            a(str, str2, str3, str4, actionLineModule, "action");
        }
    }

    public static void c(String str, String str2, String str3, String str4, ActionLineModule actionLineModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c1a93a", new Object[]{str, str2, str3, str4, actionLineModule});
        } else {
            a(str, str2, str3, str4, actionLineModule, "animation");
        }
    }

    public static void a(final Event event, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b1ab28", new Object[]{event, str, new Boolean(z)});
        } else {
            f.a(new Runnable() { // from class: tb.-$$Lambda$cab$krVBr7bmz99xzJB7lkEV7eQcvQA
                @Override // java.lang.Runnable
                public final void run() {
                    cab.lambda$krVBr7bmz99xzJB7lkEV7eQcvQA(z, event, str);
                }
            });
        }
    }

    public static /* synthetic */ void a(boolean z, Event event, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11782930", new Object[]{new Boolean(z), event, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("configExist", String.valueOf(z));
            hashMap.put("pageName", PopLayer.getReference().getFaceAdapter().getUTCurPageName());
            hashMap.put("pageUri", String.valueOf(event.curPage));
            hashMap.put("pageUrl", URLEncoder.encode(event.curPageUrl, "UTF-8"));
            hashMap.put(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, Event.a.b(event.source));
            hashMap.put("triggerUri", event.uri);
            cac.a().a(19999, "PopMonitor", "configExist", str, "PopLayer", hashMap);
        } catch (Throwable th) {
            c.a("UserTrackCommon.trackPopPoint.error.", th);
        }
    }

    private static void a(final OnePopModule onePopModule, final int i, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b387ff56", new Object[]{onePopModule, new Integer(i), str, new Boolean(z)});
        } else {
            f.a(new Runnable() { // from class: tb.-$$Lambda$cab$6LQCs6pSv_1RDCQnwLX2d3wV1ow
                @Override // java.lang.Runnable
                public final void run() {
                    cab.a(OnePopModule.this, z, i, str);
                }
            });
        }
    }

    public static /* synthetic */ void a(OnePopModule onePopModule, boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4236a3a8", new Object[]{onePopModule, new Boolean(z), new Integer(i), str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pageName", onePopModule.av);
            hashMap.put("pageUri", onePopModule.aw);
            hashMap.put("pageUrl", URLEncoder.encode(onePopModule.d, "UTF-8"));
            hashMap.put(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, onePopModule.e);
            hashMap.put("triggerUri", onePopModule.ax);
            hashMap.put("renderType", onePopModule.ab);
            hashMap.put("augePlanId", onePopModule.au);
            hashMap.put("traceId", onePopModule.j);
            hashMap.put("traceInfo", !StringUtils.isEmpty(onePopModule.ay) ? onePopModule.ay : "");
            hashMap.put("countTire", z + "");
            cac.a().a(i, "PopMonitor", str, onePopModule.f3203a, onePopModule.c, hashMap);
        } catch (Throwable th) {
            c.a("UserTrackCommon.trackPopPoint.error.", th);
        }
    }

    private static void a(final String str, final String str2, final String str3, final String str4, final ActionLineModule actionLineModule, final String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4e1502", new Object[]{str, str2, str3, str4, actionLineModule, str5});
        } else {
            f.a(new Runnable() { // from class: tb.-$$Lambda$cab$VZiMXuonpiKBe0iR16_XLy1Zi-I
                @Override // java.lang.Runnable
                public final void run() {
                    cab.m2435lambda$VZiMXuonpiKBe0iR16_XLy1ZiI(str3, str4, actionLineModule, str5, str, str2);
                }
            });
        }
    }

    public static /* synthetic */ void a(String str, String str2, ActionLineModule actionLineModule, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ee0302", new Object[]{str, str2, actionLineModule, str3, str4, str5});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            String str6 = "";
            if (StringUtils.isEmpty(str)) {
                str = str6;
            }
            hashMap.put("traceId", str);
            if (StringUtils.isEmpty(str2)) {
                str2 = str6;
            }
            hashMap.put("traceInfo", str2);
            hashMap.put("stateId", !StringUtils.isEmpty(actionLineModule.f3200a) ? actionLineModule.f3200a : str6);
            hashMap.put("stateVer", !StringUtils.isEmpty(actionLineModule.b) ? actionLineModule.b : str6);
            hashMap.put("stateIndex", actionLineModule.c + str6);
            hashMap.put("countTire", actionLineModule.d + str6);
            hashMap.put(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, !StringUtils.isEmpty(actionLineModule.e) ? actionLineModule.e : str6);
            hashMap.put(b.KEY_ACTIONS, actionLineModule.f != null ? URLEncoder.encode(JSON.toJSONString(actionLineModule.f), "UTF-8") : str6);
            if (actionLineModule.g != null) {
                str6 = URLEncoder.encode(JSON.toJSONString(actionLineModule.g), "UTF-8");
            }
            hashMap.put("animations", str6);
            cac.a().a(2101, "PopMonitor", str3, str4, str5, hashMap);
        } catch (Throwable th) {
            c.a("UserTrackCommon.trackPopPointActionLine.error.", th);
        }
    }
}
