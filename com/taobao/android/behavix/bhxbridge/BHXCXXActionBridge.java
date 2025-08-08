package com.taobao.android.behavix.bhxbridge;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.h;
import com.taobao.android.behavix.j;
import com.taobao.android.behavix.service.b;
import com.taobao.android.behavix.service.c;
import com.taobao.android.behavix.utils.g;
import com.taobao.android.external.BHXVisualCenterItem;
import com.taobao.android.testutils.JsBridgeBehaviXConfig;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.metrickit.f;
import com.taobao.search.common.util.k;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.utils.aw;
import com.taobao.weex.common.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.drf;
import tb.dro;
import tb.drp;
import tb.drq;
import tb.drs;
import tb.drt;
import tb.dru;
import tb.dsa;
import tb.dsc;
import tb.dsh;
import tb.dsi;
import tb.dsj;
import tb.kge;
import tb.shc;

/* loaded from: classes.dex */
public class BHXCXXActionBridge extends BHXCXXBaseBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BHXCXXActionBridge";
    public static int lastOffsetX;
    public static int lastOffsetY;
    private static final AtomicBoolean sAttachedFlag;
    private static final boolean sAttachedSwitch;

    private static native String nativeCommitAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, int i2, String str12);

    public static drp commitEnter(String str, String str2, String str3, String str4, long j, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("49664c36", new Object[]{str, str2, str3, str4, new Long(j), map, strArr});
        }
        drp commitAction = commitAction(str, "pv", str2, "", str3, str4, "", strArr, map, 0, 0, false, null);
        if (commitAction == null) {
            return null;
        }
        triggerExposeCurrentStatus(str2, commitAction.f26928a + "", commitAction.h);
        dru.a(dru.LAST_ENTER_NODE, commitAction);
        return commitAction;
    }

    public static drp updateEnterEvent(String str, String str2, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (drp) ipChange.ipc$dispatch("47d11dc4", new Object[]{str, str2, map, strArr}) : commitAction("", "pvUpdate", str, "", "", str2, "", strArr, map, 0, 0, false, null);
    }

    public static drp commitLeave(String str, String str2, String str3, String str4, long j, String str5, boolean z, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("42d61115", new Object[]{str, str2, str3, str4, new Long(j), str5, new Boolean(z), map, strArr});
        }
        drp commitAction = commitAction(str, "leave", str2, "", str3, str5, str4, strArr, map, 0, 0, z, null);
        if (commitAction == null) {
            return null;
        }
        triggerExposeCurrentStatus(str2, commitAction.f26928a + "", commitAction.h);
        return commitAction;
    }

    public static drp commitTap(String str, String str2, String str3, String str4, String str5, long j, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("5141318b", new Object[]{str, str2, str3, str4, str5, new Long(j), map, strArr});
        }
        drp commitAction = commitAction(str, shc.SCENE_TAP, str2, str3, str5, "", "", strArr, map, 0, 0, false, null);
        if (commitAction != null) {
            return commitAction;
        }
        return null;
    }

    public static drp commitRequest(String str, String str2, String str3, String str4, long j, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("aa9cc26d", new Object[]{str, str2, str3, str4, new Long(j), map, strArr});
        }
        drp commitAction = commitAction(str, "request", str2, str3, "", "", str4, strArr, map, 0, 0, false, null);
        if (commitAction != null) {
            return commitAction;
        }
        return null;
    }

    public static drp commitVisualCenter(String str, List<BHXVisualCenterItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("a4eb3cde", new Object[]{str, list, new Boolean(z)});
        }
        Map<String, String> b = dsi.b();
        JSONArray jSONArray = new JSONArray();
        long currentTimeMillis = System.currentTimeMillis();
        if (!g.a(list)) {
            for (BHXVisualCenterItem bHXVisualCenterItem : list) {
                if (!StringUtils.isEmpty(bHXVisualCenterItem.f12314a)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bizId", (Object) bHXVisualCenterItem.f12314a);
                    jSONObject.put("position", (Object) Integer.valueOf(bHXVisualCenterItem.b));
                    if (bHXVisualCenterItem.d != null) {
                        jSONObject.put("cardX", (Object) Integer.valueOf((int) bHXVisualCenterItem.d.a()));
                        jSONObject.put("cardY", (Object) Integer.valueOf((int) bHXVisualCenterItem.d.b()));
                        jSONObject.put("cardW", (Object) Integer.valueOf((int) bHXVisualCenterItem.d.c()));
                        jSONObject.put("cardH", (Object) Integer.valueOf((int) bHXVisualCenterItem.d.d()));
                        jSONObject.put("cardPosition", (Object) dsi.a(bHXVisualCenterItem.d.f12313a + (bHXVisualCenterItem.d.c / 2.0f), bHXVisualCenterItem.d.b + (bHXVisualCenterItem.d.d / 2.0f), false));
                    }
                    if (bHXVisualCenterItem.c != null && bHXVisualCenterItem.c.size() > 0) {
                        jSONObject.put("ext", (Object) bHXVisualCenterItem.c);
                    }
                    if (b != null && b.size() > 0) {
                        jSONObject.put("slideGesture", (Object) b);
                    }
                    jSONObject.put("isFirstScreen", (Object) Boolean.valueOf(z));
                    jSONObject.put("index", (Object) Integer.valueOf(bHXVisualCenterItem.e));
                    jSONObject.put("time", (Object) Long.valueOf(currentTimeMillis));
                    jSONArray.add(jSONObject);
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("visualCenterItems", (Object) jSONArray);
        drp commitAction = commitAction(NativeDelegate.SETTING_BIZ, "visualCenterExpose", str, "", "", "", "", null, null, 0, 0, false, JSON.toJSONString(jSONObject2, SerializerFeature.DisableCircularReferenceDetect));
        if (commitAction != null) {
            return commitAction;
        }
        return null;
    }

    public static drp commitAppIn(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("5352772a", new Object[]{str, str2, new Long(j)});
        }
        drp commitAction = commitAction(NativeDelegate.SETTING_BIZ, "appIn", str, "", "", str2, "", null, null, 0, 0, false, null);
        if (commitAction != null) {
            return commitAction;
        }
        return null;
    }

    public static drp commitAppOut(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("a2fb967f", new Object[]{str, str2, new Long(j)});
        }
        drp commitAction = commitAction(NativeDelegate.SETTING_BIZ, "appOut", str, "", "", str2, "", null, null, 0, 0, false, null);
        if (commitAction != null) {
            return commitAction;
        }
        return null;
    }

    public static drp commitExposeStart(String str, String str2, String str3, String str4, View view, long j, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("85f61dc2", new Object[]{str, str2, str3, str4, view, new Long(j), map, strArr});
        }
        drp commitAction = commitAction(str, "exposeStart", str2, str3, str4, "", map != null ? map.get(aw.PARAM_PVID) : j.a(aw.PARAM_PVID, strArr), strArr, map, 0, 0, false, null);
        if (commitAction == null) {
            return null;
        }
        if (dro.m()) {
            if (commitAction.v != null && StringUtils.equals(String.valueOf(commitAction.v.get("BXUTEventType")), "1")) {
                return commitAction;
            }
        } else if (commitAction.u != null && StringUtils.equals(commitAction.u.get("BXUTEventType"), "1")) {
            return commitAction;
        }
        String a2 = dro.a(str2, str3, str4, view);
        drs drsVar = new drs();
        drsVar.c = new WeakReference<>(view);
        drsVar.b = (drt) commitAction;
        dsa.a(drsVar, "exposeStart", j);
        h.a(str2, a2, drsVar);
        return commitAction;
    }

    public static drp commitExposeEnd(String str, String str2, String str3, View view, long j, String str4, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("10183a9", new Object[]{str, str2, str3, view, new Long(j), str4, map, strArr});
        }
        String a2 = dro.a(str, str2, str3, view);
        dsa.a(h.b(str, a2), "exposeEnd", j);
        drp commitAction = commitAction("", "exposeEnd", str, str2, str3, "", "", strArr, map, 0, 0, false, getActionArgsOfExposeNode(str, str2, str3, view));
        if (commitAction == null) {
            return null;
        }
        h.a(str, a2);
        return commitAction;
    }

    private static String getActionArgsOfExposeNode(String str, String str2, String str3, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35ddcc19", new Object[]{str, str2, str3, view});
        }
        drs b = h.b(str, dro.a(str, str2, str3, view));
        if (b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = b.f26931a;
        if (jSONObject2 != null) {
            if (!a.a("enableExpSeries", false)) {
                jSONObject2.put("exposeSeries", (Object) new JSONArray());
            }
            jSONObject.put(e.ACTION_ARGS, (Object) jSONObject2.toString());
            JSONArray jSONArray = jSONObject2.getJSONArray("exposeSeries");
            if (jSONArray != null) {
                jSONObject.put("exposeSeries", (Object) jSONArray.toString());
            }
        }
        float f = b.b.A;
        if (f > 0.0f) {
            jSONObject.put("stayMaxArea", (Object) Float.valueOf(f));
        }
        float f2 = b.b.B;
        if (f2 > 0.0f) {
            jSONObject.put("halfDuration", (Object) Float.valueOf(f2));
        }
        if (view != null && a.b.e()) {
            jSONObject.put("exposeFocusDur", (Object) Double.valueOf(b.j));
        }
        Map<String, String> b2 = dsi.b();
        if (!g.a(b2)) {
            jSONObject.put("slideGesture", (Object) b2);
        }
        return jSONObject.toJSONString();
    }

    public static drp commitScroll(String str, String str2, String str3, String str4, int i, int i2, List<com.taobao.android.external.e> list, long j, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("c6865c4a", new Object[]{str, str2, str3, str4, new Integer(i), new Integer(i2), list, new Long(j), map, strArr});
        }
        int i3 = "scrollStart".equals(str3) ? i : lastOffsetX;
        int i4 = "scrollStart".equals(str3) ? i2 : lastOffsetY;
        lastOffsetX = i;
        lastOffsetY = i2;
        int i5 = i - i3;
        int i6 = i2 - i4;
        Object a2 = dsi.a(i, i2, i3, i4);
        JSONObject jSONObject = new JSONObject();
        if (!g.a(list)) {
            JSONArray jSONArray = new JSONArray();
            long currentTimeMillis = System.currentTimeMillis();
            for (com.taobao.android.external.e eVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                if (!StringUtils.isEmpty(eVar.f12314a) && eVar.e >= 0) {
                    jSONObject2.put("bizId", (Object) eVar.f12314a);
                    if (eVar.d != null) {
                        jSONObject2.put("cardX", (Object) Integer.valueOf((int) eVar.d.f12313a));
                        jSONObject2.put("cardY", (Object) Integer.valueOf((int) eVar.d.b));
                        jSONObject2.put("cardW", (Object) Integer.valueOf((int) eVar.d.c));
                        jSONObject2.put("cardH", (Object) Integer.valueOf((int) eVar.d.d));
                        float f = eVar.d.f12313a + (eVar.d.c / 2.0f);
                        float f2 = eVar.d.b + (eVar.d.d / 2.0f);
                        jSONObject2.put("cardPosition", (Object) dsi.a(f, f2, true));
                        jSONObject2.put("cardLastPosition", (Object) dsi.a(f + i5, f2 + i6, true));
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    if (!StringUtils.isEmpty(eVar.f)) {
                        jSONObject3.put(aw.PARAM_PVID, (Object) eVar.f);
                    }
                    if (!StringUtils.isEmpty(eVar.g)) {
                        jSONObject3.put(aw.PARAM_SEARCH_KEYWORD_RN, (Object) eVar.g);
                    }
                    if (!StringUtils.isEmpty(eVar.h)) {
                        jSONObject3.put(k.a.PARAM_KEY_FIRST_RN, (Object) eVar.h);
                    }
                    if (jSONObject3.size() > 0) {
                        jSONObject2.put("ext", (Object) jSONObject3);
                    }
                    jSONObject2.put("time", (Object) Long.valueOf(currentTimeMillis));
                    jSONObject2.put("index", (Object) Integer.valueOf(eVar.e));
                    jSONArray.add(jSONObject2);
                }
            }
            jSONObject.put("visualItems", (Object) jSONArray);
            jSONObject.put(Constants.Name.SCROLL_DIRECTION, a2);
        }
        drp commitAction = commitAction(str, str3, str2, str4, "", "", "", strArr, map, i, i2, false, jSONObject.size() > 0 ? JSON.toJSONString(jSONObject, SerializerFeature.DisableCircularReferenceDetect) : null);
        if (commitAction == null) {
            return null;
        }
        triggerExposeCurrentStatus(str2, commitAction.f26928a + "", str3);
        return commitAction;
    }

    public static drp commitCustom(String str, String str2, String str3, String str4, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (drp) ipChange.ipc$dispatch("a714d313", new Object[]{str, str2, str3, str4, map, strArr}) : commitAction(str, "custom", str2, str3, str4, "", "", strArr, map, 0, 0, false, null);
    }

    private static boolean needPreFilter(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89d1beee", new Object[]{str, str2, str3})).booleanValue() : !c.a().a(str, str2, str3) && !b.a().a(str, str2, str3);
    }

    private static void markCommitAction(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d9dc5f", new Object[]{str, str2, str3});
        } else if (!dro.a(0.03d)) {
        } else {
            TLog.loge(TAG, str, str3, str2);
        }
    }

    private static drp commitAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String[] strArr, Map<String, String> map, int i, int i2, boolean z, String str8) {
        String str9;
        String str10;
        drp a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drp) ipChange.ipc$dispatch("cd834b86", new Object[]{str, str2, str3, str4, str5, str6, str7, strArr, map, new Integer(i), new Integer(i2), new Boolean(z), str8});
        }
        setupBHXCpp();
        JSONObject jSONObject = null;
        if (!isNativeLibraryLoaded || dro.i()) {
            return null;
        }
        if (dro.j() && !JsBridgeBehaviXConfig.isEnableRealTimeMTopDebug() && needPreFilter(str3, str2, str4)) {
            return null;
        }
        String b = dsh.a().b();
        drp a3 = drf.a(str2);
        if (a3 == null) {
            return null;
        }
        markCommitAction(str3, str2, str4);
        a3.d = str3;
        a3.h = str2;
        a3.e = System.currentTimeMillis();
        a3.i = str4;
        a3.c = str5;
        a3.g = dsj.f26943a;
        a3.b = str6;
        a3.q = b;
        if ("exposeStart".equals(a3.h) || "exposeEnd".equals(a3.h)) {
            a3.k = str8;
        }
        if (map != null) {
            drq.a().a(map, a3);
        } else if (strArr != null) {
            a3.l = j.a(strArr);
            drq.a().a(a3.l, a3);
        }
        String nativeCommitAction = nativeCommitAction(dsj.f26943a, str, str2, str3, str4, str5, str6, str7, a3.l, a3.c(), b, z, i, i2, str8);
        if (StringUtils.isEmpty(nativeCommitAction)) {
            a.b.a(true);
            str9 = str2;
            str10 = "exposeStart";
            if (str10.equals(str9) || "exposeEnd".equals(str9)) {
                a2 = a3;
                a2.h = "expose";
            } else {
                a2 = a3;
            }
            a2.a();
        } else {
            str9 = str2;
            str10 = "exposeStart";
            a.b.a(false);
            try {
                jSONObject = JSONObject.parseObject(nativeCommitAction);
            } catch (Exception e) {
                e.printStackTrace();
            }
            a2 = drf.a(a3, jSONObject, a3.v);
        }
        if (str10.equals(str9) || "leave".equals(str9) || shc.SCENE_TAP.equals(str9)) {
            triggerTask(a2);
        }
        attachThreadMonitor();
        return a2;
    }

    static {
        kge.a(-2093452419);
        sAttachedFlag = new AtomicBoolean();
        sAttachedSwitch = a.b.r();
    }

    private static synchronized void attachThreadMonitor() {
        synchronized (BHXCXXActionBridge.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ce958b2", new Object[0]);
                return;
            }
            if (sAttachedSwitch && sAttachedFlag.compareAndSet(false, true)) {
                i.a(new i.a() { // from class: com.taobao.android.behavix.bhxbridge.BHXCXXActionBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.behavix.utils.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        int a2 = dsc.a();
                        int nativeThreadTidByName = BHXCXXInnerBridge.getNativeThreadTidByName("bhx_bufs");
                        TLog.loge(BHXCXXActionBridge.TAG, "BHXTID::bhx cpu monitor", String.valueOf(a2), ";", String.valueOf(nativeThreadTidByName));
                        f.a("bhx_action", a2);
                        f.a("bhx_bufs", nativeThreadTidByName);
                    }
                });
            }
        }
    }

    private static void triggerTask(drp drpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d914b6f2", new Object[]{drpVar});
        } else if (drpVar == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("baseNode", drpVar);
            com.taobao.android.behavix.task.c.a().a(drpVar.d, drpVar.h, drpVar.i, hashMap);
        }
    }
}
