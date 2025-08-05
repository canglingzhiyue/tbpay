package com.tmall.android.dai.internal.pyschedule;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.f;
import com.taobao.mrt.task.g;
import com.taobao.mrt.task.i;
import com.taobao.mrt.thread.b;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.internal.util.d;
import com.tmall.android.dai.model.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import tb.kge;
import tb.noa;
import tb.rkq;

/* loaded from: classes9.dex */
public class PyScheduleManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "py_schedule_run_task";

    static {
        kge.a(801258712);
    }

    public static Map runTaskSync(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fbd6ada", new Object[]{new Integer(i), str, str2});
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("state", "false");
        hashMap.put("msg", "");
        hashMap.put("result", "");
        a aVar = null;
        try {
            if (i == 0) {
                aVar = DAI.getRegisteredModel(str);
            } else if (i == 1) {
                aVar = DAI.getRegisteredModelForAlias(str);
            }
            if (aVar == null) {
                hashMap.put("msg", "model not registered");
                return hashMap;
            }
            MRTTaskDescription b = g.a().b(aVar.b());
            if (aVar != null && b != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(BHRTaskConfigBase.TYPE_CONFIG_UT);
                HashMap<String, Object> stringToModelInput = stringToModelInput(str2);
                HashMap hashMap2 = new HashMap();
                if (stringToModelInput != null && stringToModelInput.containsKey("walle_inner_run_id")) {
                    String valueOf = String.valueOf(stringToModelInput.get("walle_inner_run_id"));
                    DAIComputeService m = rkq.d().m();
                    Map<String, String> a2 = m.a(valueOf);
                    if (a2 != null) {
                        HashMap hashMap3 = new HashMap(a2);
                        String str3 = a2.get(noa.KEY_MODEL_NAME);
                        hashMap3.put("subModelName", aVar.b());
                        hashMap3.put("parentRunId", valueOf);
                        m.a(stringToModelInput, a2.get("triId"), str3, a2.get(com.taobao.android.behavix.feature.a.FEATURE_NAME), hashMap3, hashMap2);
                    }
                    stringToModelInput.remove("walle_inner_run_id");
                }
                arrayList.add(stringToModelInput);
                f fVar = new f(b, new i() { // from class: com.tmall.android.dai.internal.pyschedule.PyScheduleManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.mrt.task.i
                    public void onCompletion(int i2, MRTRuntimeException mRTRuntimeException, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f20526d", new Object[]{this, new Integer(i2), mRTRuntimeException, obj});
                        } else if (mRTRuntimeException != null) {
                            Map map = hashMap;
                            map.put("msg", "task run  error:" + mRTRuntimeException.toString());
                        } else {
                            if (obj != null && (obj instanceof List)) {
                                List list = (List) obj;
                                if (list.size() == 2 && list.get(1) != null && (list.get(1) instanceof Map)) {
                                    hashMap.put("state", "true");
                                    hashMap.put("result", d.a((Map) list.get(1)));
                                    return;
                                }
                            }
                            hashMap.put("msg", "task return format error!!! not Map");
                        }
                    }
                }, "__all__", arrayList, false, null, hashMap2);
                Thread currentThread = Thread.currentThread();
                if (currentThread instanceof b) {
                    fVar.a(((b) currentThread).b());
                } else {
                    hashMap.put("msg", "not in mrt thread");
                }
                return hashMap;
            }
            hashMap.put("msg", "model not registered");
            return hashMap;
        } catch (Exception e) {
            com.taobao.mrt.utils.a.b(TAG, "runTaskSyncFailed", e);
            hashMap.put("msg", e.toString());
            return hashMap;
        }
    }

    public static HashMap<String, Object> stringToModelInput(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("74e7ca61", new Object[]{str});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject parseObject = JSONObject.parseObject(str);
                for (String str2 : parseObject.keySet()) {
                    Object obj = parseObject.get(str2);
                    if (obj instanceof JSONArray) {
                        obj = toVector((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = toMap((JSONObject) obj);
                    }
                    hashMap.put(str2, obj);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b0b8273d", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                obj = toVector((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    public static Vector<Object> toVector(JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("66640915", new Object[]{jSONArray});
        }
        Vector<Object> vector = new Vector<>();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toVector((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            vector.add(obj);
        }
        return vector;
    }
}
