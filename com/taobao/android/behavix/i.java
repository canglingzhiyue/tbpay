package com.taobao.android.behavix;

import android.graphics.Rect;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.dro;
import tb.drs;
import tb.dsa;
import tb.dsb;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CURRENT_SCENE_EXPOSE_APPEAR_MAX_CAPACITY = 15;
    public static final int MAX_REQUEST_NODE = 20;
    public static final int NODE_INTERIM_MAX_CAPACITY = 200;
    public static final String TAG = "UserActionTrack";
    public static Map<String, Map<String, drs>> currentSceneExposeNode;
    public static Map<String, String> enterSessionIdsMap;
    public static Map<String, String> newEnterSessionIdsMap;

    static {
        kge.a(-1013367262);
        currentSceneExposeNode = new HashMap();
        enterSessionIdsMap = new HashMap();
        newEnterSessionIdsMap = new HashMap();
    }

    public static void tryClearMap(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252c0134", new Object[]{map});
        } else {
            tryClearMap(map, 200);
        }
    }

    public static void tryClearMap(Map map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8054984f", new Object[]{map, new Integer(i)});
        } else if (map == null || map.size() <= i) {
        } else {
            map.clear();
        }
    }

    public static boolean isContainsKeyValue(String[] strArr, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("366fe6f4", new Object[]{strArr, new Integer(i), str})).booleanValue();
        }
        if (strArr != null) {
            try {
                if (strArr.length >= i + 1 && strArr[i] != null) {
                    if (StringUtils.equals(strArr[i], str)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                dsb.a("isContainsKeyValue", null, null, e);
            }
        }
        return false;
    }

    public static String getSource(Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22e9e84e", new Object[]{map, strArr}) : map != null ? map.containsKey("BXUtListener") ? BHRTaskConfigBase.TYPE_CONFIG_UT : NativeDelegate.SETTING_BIZ : isFromUTListener(strArr) ? BHRTaskConfigBase.TYPE_CONFIG_UT : NativeDelegate.SETTING_BIZ;
    }

    public static boolean isFromUTListener(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd4631f5", new Object[]{strArr})).booleanValue() : isContainsKeyValue(strArr, 2, "BXUtListener=true");
    }

    public static void triggerExposeCurrentStatus(String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fd16f4", new Object[]{str, str2, str3});
            return;
        }
        Map<String, drs> map = currentSceneExposeNode.get(str);
        final long currentTimeMillis = System.currentTimeMillis();
        if (map == null) {
            return;
        }
        clearExposeAction(str3, map, currentTimeMillis);
        if (!StringUtils.equals("scrollEnd", str3)) {
            return;
        }
        final HashMap hashMap = new HashMap(map);
        com.taobao.android.behavix.utils.e.a().post(new Runnable() { // from class: com.taobao.android.behavix.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v9, types: [com.alibaba.fastjson.JSONArray] */
            @Override // java.lang.Runnable
            public void run() {
                String str4;
                long j;
                String str5;
                View view;
                JSONArray jSONArray;
                String str6;
                Iterator it;
                Integer num;
                JSONArray jSONArray2;
                JSONObject jSONObject;
                long j2;
                long j3;
                long j4;
                JSONArray jSONArray3;
                float f;
                long j5;
                String str7 = "triggerExposeFocusDur";
                String str8 = "exposeSeries";
                IpChange ipChange2 = $ipChange;
                Integer num2 = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long nanoTime = System.nanoTime();
                try {
                    Iterator it2 = hashMap.values().iterator();
                    while (it2.hasNext()) {
                        drs drsVar = (drs) it2.next();
                        if (drsVar != null && drsVar.c != null && (view = drsVar.c.get()) != null) {
                            if (drsVar.f26931a == null) {
                                drsVar.f26931a = new JSONObject();
                            }
                            if (drsVar.f26931a.getJSONArray(str8) == null) {
                                jSONArray = new JSONArray();
                                drsVar.f26931a.put(str8, (Object) jSONArray);
                            } else {
                                jSONArray = drsVar.f26931a.getJSONArray(str8);
                            }
                            JSONArray jSONArray4 = jSONArray;
                            JSONObject jSONObject2 = new JSONObject();
                            if (a.d()) {
                                Rect rect = new Rect();
                                long width = view.getWidth();
                                j = nanoTime;
                                long height = view.getHeight();
                                try {
                                    j2 = 0;
                                    if (!view.getGlobalVisibleRect(rect) || width <= 0 || height <= 0) {
                                        str4 = str7;
                                        j3 = height;
                                        it = it2;
                                        num = num2;
                                        j4 = width;
                                        jSONArray3 = jSONArray4;
                                        f = 0.0f;
                                        j5 = 0;
                                    } else {
                                        it = it2;
                                        num = num2;
                                        long j6 = width * height;
                                        j4 = width;
                                        long width2 = rect.width();
                                        jSONArray3 = jSONArray4;
                                        long height2 = rect.height();
                                        str4 = str7;
                                        j3 = height;
                                        f = ((float) (width2 * height2)) / ((float) j6);
                                        j2 = width2;
                                        j5 = height2;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    str4 = str7;
                                    str5 = str4;
                                    dsb.a(str5, null, null, e);
                                    TLog.logd("BehaviX", str5, "main thread dur=" + (System.nanoTime() - j));
                                }
                                try {
                                    jSONObject2.put("exposeArea", (Object) Float.valueOf(f));
                                    str6 = str8;
                                    jSONObject = jSONObject2;
                                    jSONArray2 = jSONArray3;
                                    dsa.a(drsVar, str3, currentTimeMillis, j5, j2, j3, j4, dro.b());
                                } catch (Exception e2) {
                                    e = e2;
                                    str5 = str4;
                                    dsb.a(str5, null, null, e);
                                    TLog.logd("BehaviX", str5, "main thread dur=" + (System.nanoTime() - j));
                                }
                            } else {
                                str6 = str8;
                                str4 = str7;
                                j = nanoTime;
                                it = it2;
                                num = num2;
                                jSONArray2 = jSONArray4;
                                jSONObject = jSONObject2;
                                jSONObject.put("exposeArea", (Object) num);
                                jSONObject.put("exposePositionX", (Object) num);
                                jSONObject.put("exposePositionY", (Object) num);
                            }
                            jSONObject.put("triggerTime", (Object) Long.valueOf(currentTimeMillis));
                            jSONObject.put("triggerSeqId", (Object) str2);
                            jSONObject.put("triggerAction", (Object) str3);
                            jSONArray2.add(jSONObject);
                            num2 = num;
                            nanoTime = j;
                            it2 = it;
                            str7 = str4;
                            str8 = str6;
                        }
                    }
                    j = nanoTime;
                    str5 = str7;
                } catch (Exception e3) {
                    e = e3;
                    str4 = str7;
                    j = nanoTime;
                }
                TLog.logd("BehaviX", str5, "main thread dur=" + (System.nanoTime() - j));
            }
        });
    }

    private static void clearExposeAction(String str, Map<String, drs> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ece137", new Object[]{str, map, new Long(j)});
        } else if (map == null) {
        } else {
            if (!StringUtils.equals(str, "scrollStart") && !StringUtils.equals(str, "leave") && !StringUtils.equals(str, "pv")) {
                return;
            }
            Iterator<Map.Entry<String, drs>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                drs value = it.next().getValue();
                if ("pv".equals(str) || "leave".equals(str)) {
                    if (value == null || value.c == null) {
                        it.remove();
                    } else {
                        View view = value.c.get();
                        if (view == null) {
                            it.remove();
                        } else if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
                            it.remove();
                        }
                    }
                }
                dsa.a(value, str, j);
            }
        }
    }
}
