package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class caa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRACK_TYPE_BACK_FLOW = "backflow";
    public static final String TRACK_TYPE_DEBUG = "debug";
    public static final String TRACK_TYPE_TRACK = "track";
    public static final String UCP_ACTION_CANCEL = "Cancel";
    public static final String UCP_ACTION_CLICK = "Click";
    public static final String UCP_ACTION_EXPOSE = "Expose";
    public static final int UCP_PROCESS_FINISH_FAIL = 3;
    public static final int UCP_PROCESS_FINISH_SUCCESS = 2;
    public static final int UCP_PROCESS_STEP_FAIL = 1;
    public static final int UCP_PROCESS_STEP_SUCCESS = 0;

    /* renamed from: a */
    private static final AtomicBoolean f26218a;

    public static /* synthetic */ void lambda$03JtQVbALyWW6Whq_zJZchMvonU(List list, int i, String str, Event event, String str2, String str3) {
        a(list, i, str, event, str2, str3);
    }

    public static /* synthetic */ void lambda$9cE0_0_dcoBDCsGN1auP7JJKmuc(String str) {
        b(str);
    }

    public static /* synthetic */ void lambda$Iw5rp4T4mal4d5cQf9EzUbe63_c(d dVar, String str, JSONObject jSONObject) {
        b(dVar, str, jSONObject);
    }

    /* renamed from: lambda$X-98p4TUqQkns1euPxi5KJs7fnQ */
    public static /* synthetic */ void m2433lambda$X98p4TUqQkns1euPxi5KJs7fnQ(int i, Set set, Event event, String str, String str2, String str3, JSONObject jSONObject) {
        a(i, set, event, str, str2, str3, jSONObject);
    }

    public static /* synthetic */ void lambda$Yh_QyM4bWT3sdbsZoaf2GAzyURo(PreDealCustomEventParams preDealCustomEventParams) {
        b(preDealCustomEventParams);
    }

    public static void a(final PreDealCustomEventParams preDealCustomEventParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557f5072", new Object[]{preDealCustomEventParams});
        } else {
            f.a(new Runnable() { // from class: tb.-$$Lambda$caa$Yh_QyM4bWT3sdbsZoaf2GAzyURo
                @Override // java.lang.Runnable
                public final void run() {
                    caa.lambda$Yh_QyM4bWT3sdbsZoaf2GAzyURo(PreDealCustomEventParams.this);
                }
            });
        }
    }

    public static /* synthetic */ void b(PreDealCustomEventParams preDealCustomEventParams) {
        Set<String> indexIds;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8b3773", new Object[]{preDealCustomEventParams});
        } else if (preDealCustomEventParams != null) {
            try {
                if (!preDealCustomEventParams.needTrack() || (indexIds = preDealCustomEventParams.getIndexIds()) == null) {
                    return;
                }
                for (String str : indexIds) {
                    JSONObject trackMap = preDealCustomEventParams.getTrackMap();
                    if (trackMap != null && trackMap.containsKey(str)) {
                        JSONObject jSONObject = trackMap.getJSONObject(str);
                        if (jSONObject != null && jSONObject.size() > 0) {
                            Intent intent = new Intent("UCPTracker");
                            intent.putExtra("type", "track");
                            intent.putExtra("group", "PopLayer");
                            intent.putExtra("key", "PopReceiver");
                            intent.putExtra("errorCode", 0);
                            intent.putExtra("trackInfo", jSONObject);
                            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
                            cab.a("callback", preDealCustomEventParams.getTraceId(), new HashMap());
                            c.c("pageLifeCycle", "", "UCPTracker.sendUCPTrackerBroadcast.uriset=" + preDealCustomEventParams.getUriSet() + ".indexmap=" + preDealCustomEventParams.getIndexMap() + ".traceId=" + preDealCustomEventParams.getTraceId());
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                c.a("UCPTracker.UCPReceiverTrack.fail.", th);
            }
        }
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27c3b8", new Object[]{dVar});
            return;
        }
        OnePopModule t = dVar.t();
        a("true".equals(t.s) ? 2 : 3, "track", dVar, t.T.name(), String.valueOf(t.U));
    }

    public static void a(int i, String str, d dVar, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54596e89", new Object[]{new Integer(i), str, dVar, str2, str3});
            return;
        }
        c.a("UCPTracker.UCPProcessTrack.ucpProcess=%s", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        a(i, str, dVar.y(), arrayList, str2, str3);
    }

    public static void a(final int i, final String str, final Event event, final List<d> list, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8290b9a4", new Object[]{new Integer(i), str, event, list, str2, str3});
        } else if (list == null || list.isEmpty() || event == null || event.source != 4) {
        } else {
            c.a("UCPTracker.UCPProcessTrack.ucpProcess=%s.beforeRunInGlobalThread", Integer.valueOf(i));
            f.a(new Runnable() { // from class: tb.-$$Lambda$caa$03JtQVbALyWW6Whq_zJZchMvonU
                @Override // java.lang.Runnable
                public final void run() {
                    caa.lambda$03JtQVbALyWW6Whq_zJZchMvonU(list, i, str, event, str2, str3);
                }
            });
        }
    }

    public static /* synthetic */ void a(List list, int i, String str, Event event, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9aeba2", new Object[]{list, new Integer(i), str, event, str2, str3});
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            try {
                if (dVar.A()) {
                    str4 = dVar.z();
                } else {
                    BaseConfigItem x = dVar.x();
                    str4 = x != null ? x.indexID : "";
                }
                HashSet hashSet = new HashSet();
                hashSet.add(str4);
                c.a("UCPTracker.UCPProcessTrack.ucpProcess=%s.indexId=%s.runInGlobalThread", Integer.valueOf(i), str4);
                OnePopModule t = dVar.t();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("renderType", (Object) String.valueOf(t.ab));
                jSONObject.put("viewCreated", (Object) Boolean.valueOf("true".equals(t.r)));
                jSONObject.put("displayed", (Object) Boolean.valueOf("true".equals(t.s)));
                a(i, str, event, hashSet, jSONObject, str2, str3);
            } catch (Throwable th) {
                c.a("UCPTracker.UCPProcessTrack.error.", th);
            }
        }
    }

    public static void a(final int i, final String str, final Event event, final Set<String> set, final JSONObject jSONObject, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12b10c4", new Object[]{new Integer(i), str, event, set, jSONObject, str2, str3});
        } else if (event == null || event.source != 4 || set == null || set.isEmpty()) {
        } else {
            f.a(new Runnable() { // from class: tb.-$$Lambda$caa$X-98p4TUqQkns1euPxi5KJs7fnQ
                @Override // java.lang.Runnable
                public final void run() {
                    caa.m2433lambda$X98p4TUqQkns1euPxi5KJs7fnQ(i, set, event, str, str2, str3, jSONObject);
                }
            });
        }
    }

    public static /* synthetic */ void a(int i, Set set, Event event, String str, String str2, String str3, JSONObject jSONObject) {
        JSONObject trackMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1155c7d4", new Object[]{new Integer(i), set, event, str, str2, str3, jSONObject});
            return;
        }
        try {
            c.a("UCPTracker.UCPProcessTrackRaw.ucpProcess=%s.indexIds=%s.runInGlobalThread", Integer.valueOf(i), set);
            PreDealCustomEventParams preDealCustomEventParams = event.getPreDealCustomEventParams();
            if (preDealCustomEventParams == null || !preDealCustomEventParams.needTrack() || (trackMap = preDealCustomEventParams.getTrackMap()) == null) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                JSONObject jSONObject2 = trackMap.getJSONObject(str4);
                if (jSONObject2 != null && jSONObject2.size() > 0) {
                    Intent intent = new Intent("UCPTracker");
                    intent.putExtra("type", str);
                    intent.putExtra("group", "PopLayer");
                    intent.putExtra("key", str2);
                    intent.putExtra("errorCode", i);
                    intent.putExtra("errorMessage", str3);
                    intent.putExtra("bizTrackInfo", jSONObject);
                    intent.putExtra("trackInfo", jSONObject2);
                    LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
                    c.c("pageLifeCycle", str4, "UCPActionTrack.UCPProcessTrack.PreDealBroadcast.traceId=%s.trackIntent=" + preDealCustomEventParams.getTraceId());
                }
            }
        } catch (Throwable th) {
            c.a("UCPTracker.UCPProcessTrackRaw.error.", th);
        }
    }

    public static void a(final d dVar, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c143ae", new Object[]{dVar, str, jSONObject});
        } else {
            f.a(new Runnable() { // from class: tb.-$$Lambda$caa$Iw5rp4T4mal4d5cQf9EzUbe63_c
                @Override // java.lang.Runnable
                public final void run() {
                    caa.lambda$Iw5rp4T4mal4d5cQf9EzUbe63_c(d.this, str, jSONObject);
                }
            });
        }
    }

    public static /* synthetic */ void b(d dVar, String str, JSONObject jSONObject) {
        Event y;
        JSONObject trackMap;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31c5a8d", new Object[]{dVar, str, jSONObject});
        } else if (dVar == null) {
        } else {
            try {
                if (dVar.y() != null && !StringUtils.isEmpty(str) && (y = dVar.y()) != null && y.source == 4) {
                    BaseConfigItem x = dVar.x();
                    PreDealCustomEventParams preDealCustomEventParams = y.getPreDealCustomEventParams();
                    if (preDealCustomEventParams == null || !preDealCustomEventParams.needTrack() || (trackMap = preDealCustomEventParams.getTrackMap()) == null) {
                        return;
                    }
                    if (dVar.A()) {
                        str2 = dVar.z();
                    } else {
                        str2 = x != null ? x.indexID : "";
                    }
                    a(str2, str, preDealCustomEventParams.getTraceId(), trackMap.getJSONObject(str2), jSONObject);
                }
            } catch (Throwable th) {
                c.a("UCPTracker.UCPActionTrack.error.", th);
            }
        }
    }

    private static void a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d85c4c6", new Object[]{str, str2, str3, jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject.size() <= 0) {
        } else {
            Intent intent = new Intent("UCPTracker");
            intent.putExtra("type", TRACK_TYPE_BACK_FLOW);
            intent.putExtra("group", "PopLayer");
            intent.putExtra("key", str2);
            intent.putExtra("errorCode", 2);
            intent.putExtra("trackInfo", jSONObject);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            intent.putExtra("bizTrackInfo", jSONObject2);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            c.b("pageLifeCycle", str, "UCPActionTrack.UCPActionTrack.PreDealBroadcast.ucpAction=" + str2 + ",traceId=" + str3);
        }
    }

    static {
        kge.a(231044904);
        f26218a = new AtomicBoolean(false);
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            c.b("sdkLifeCycle", "", "UCPActionTrack.UCPFragmentPageSwitchTrack.pageUri=" + str);
            if (!f26218a.compareAndSet(false, true)) {
                return;
            }
            if (bzl.a().b().usePopReadyApi()) {
                f.b($$Lambda$caa$ercwSNddsLsEB4rPpl4OqajYBY.INSTANCE);
            } else {
                f.a(new Runnable() { // from class: tb.-$$Lambda$caa$9cE0_0_dcoBDCsGN1auP7JJKmuc
                    @Override // java.lang.Runnable
                    public final void run() {
                        caa.lambda$9cE0_0_dcoBDCsGN1auP7JJKmuc(str);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            UCPManager.a();
        } catch (Throwable th) {
            c.a("UCPTracker.popFirstPageReady.error.", th);
        }
    }

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        try {
            Intent intent = new Intent(PopLayer.ACTION_BROADCAST_ACTION_FIRST_PAGE_READY);
            intent.putExtra("pageUri", str);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            c.a("UCPActionTrack.UCPActionTrack.UCPFragmentPageSwitchTrack.pageUri=" + str, new Object[0]);
            c.b("sdkLifeCycle", "", "UCPActionTrack.UCPFragmentPageSwitchTrack.sendBroadcast.pageUri=" + str);
        } catch (Throwable th) {
            c.a("UCPTracker.UCPFragmentPageSwitchTrack.error.", th);
        }
    }

    public static void a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45199658", new Object[]{str, str2, obj});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) TRACK_TYPE_BACK_FLOW);
            jSONObject.put("group", (Object) "PopLayerHub");
            jSONObject.put("key", (Object) str);
            jSONObject.put("trackInfo", obj);
            jSONObject.put("errorCode", (Object) 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) str2);
            jSONObject.put("bizTrackInfo", (Object) jSONObject2);
            UCPManager.c(jSONObject);
        } catch (Throwable th) {
            c.a("UCPTracker.reportAction.error.", th);
        }
    }
}
