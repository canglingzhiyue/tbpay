package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.n;
import com.taobao.android.detail.core.utils.i;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.dyo;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private CopyOnWriteArrayList<String> f11360a = new CopyOnWriteArrayList<>();

    static {
        kge.a(-969376850);
    }

    public a() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.DetailStreamResponseDataController");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f11360a.add(str);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f11360a.clear();
        }
    }

    public void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        i.c(n.a("DetailStreamResponseDataController"), "流式分段合并数据操作");
        if (this.f11360a.isEmpty()) {
            i.c(n.a("DetailStreamResponseDataController"), "流式分段合并数据异常：dataList.isEmpty()");
            ecg.r(null, "dataListEmpty");
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(this.f11360a.get(0));
        String a2 = n.a("DetailStreamResponseDataController");
        i.c(a2, "第一段parser耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
        if (this.f11360a.size() == 1) {
            if (parseObject == null) {
                ecg.r(null, "coreDataEmpty");
                return;
            }
            i.c(n.a("DetailStreamResponseDataController"), "流式分段合并数据：数据完整");
            a(this.f11360a.get(0), str, null, this.f11360a.size());
            com.taobao.android.detail.core.debug.b.a(map, this.f11360a.get(0), com.taobao.android.detail.core.debug.b.REQUEST_TYPE_STREAM);
            ecg.n(null, "first");
            i.c(n.a("DetailStreamResponseDataController"), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            return;
        }
        JSONObject parseObject2 = JSONObject.parseObject(this.f11360a.get(1));
        String a3 = n.a("DetailStreamResponseDataController");
        i.c(a3, "第二段parser耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
        if (this.f11360a.size() == 2) {
            if (parseObject2 == null) {
                ecg.r(null, "otherDataEmpty");
                return;
            }
            JSONObject a4 = a(parseObject, parseObject2);
            String a5 = n.a("DetailStreamResponseDataController");
            i.c(a5, "合成,parser总耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
            i.c(n.a("DetailStreamResponseDataController"), "流式分段合并数据成功");
            long uptimeMillis2 = SystemClock.uptimeMillis();
            String jSONString = a4.toJSONString();
            String a6 = n.a("DetailStreamResponseDataController");
            i.c(a6, "合成toString耗时：" + (SystemClock.uptimeMillis() - uptimeMillis2));
            a(jSONString, str, Boolean.valueOf(a(a4)), this.f11360a.size());
            com.taobao.android.detail.core.debug.b.a(map, jSONString, com.taobao.android.detail.core.debug.b.REQUEST_TYPE_STREAM);
            i.c(n.a("DetailStreamResponseDataController"), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        if (this.f11360a.size() <= 2) {
            return;
        }
        i.c(n.a("DetailStreamResponseDataController"), "流式分段合并数据：数据多于二屏数据");
        ecg.r(null, "dataSizeOut");
    }

    public void a(String str, String str2, Boolean bool, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e084d2", new Object[]{this, str, str2, bool, new Integer(i)});
            return;
        }
        dyo.a aVar = new dyo.a();
        aVar.d = str;
        aVar.b = true;
        aVar.c = bool;
        aVar.e = i;
        dyo.a(aVar, str2);
        i.c(n.a("DetailStreamResponseDataController"), "流式分段数据保存");
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    c(jSONObject, key, value);
                } else if (value instanceof JSONArray) {
                    b(jSONObject, key, value);
                } else {
                    a(jSONObject, key, value);
                }
            }
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cfd2ae", new Object[]{this, jSONObject, str, obj});
        } else if ("value".equals(str) && (obj instanceof String)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            JSONObject parseObject = JSON.parseObject((String) obj);
            String a2 = n.a("DetailStreamResponseDataController");
            i.c(a2, "dynamicValue parser耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
            if (jSONObject.get(str) != null) {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                JSONObject parseObject2 = JSON.parseObject((String) jSONObject.get(str));
                String a3 = n.a("DetailStreamResponseDataController");
                i.c(a3, "starParserTime parser耗时：" + (SystemClock.uptimeMillis() - uptimeMillis2));
                jSONObject.put(str, (Object) a(parseObject2, parseObject));
                return;
            }
            jSONObject.put(str, obj);
        } else {
            jSONObject.put(str, obj);
        }
    }

    private void b(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6240cbcd", new Object[]{this, jSONObject, str, obj});
        } else if ("apiStack".equals(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray != null) {
                JSONObject a2 = a((JSONObject) jSONArray.get(0), (JSONObject) ((JSONArray) obj).get(0));
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.add(a2);
                jSONObject.put(str, (Object) jSONArray2);
                return;
            }
            jSONObject.put(str, obj);
        } else {
            jSONObject.put(str, obj);
        }
    }

    private void c(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb1c4ec", new Object[]{this, jSONObject, str, obj});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 != null) {
            jSONObject.put(str, (Object) a(jSONObject2, (JSONObject) obj));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONArray = jSONObject2.getJSONArray("apiStack")) == null || (jSONObject3 = jSONArray.getJSONObject(0)) == null) {
            return false;
        }
        JSONObject jSONObject7 = jSONObject3.getJSONObject("data");
        if (jSONObject7 == null) {
            jSONObject7 = jSONObject3.getJSONObject("value");
        }
        if (jSONObject7 != null && (jSONObject4 = jSONObject7.getJSONObject("global")) != null && (jSONObject5 = jSONObject4.getJSONObject("data")) != null && (jSONObject6 = jSONObject5.getJSONObject("feature")) != null) {
            return jSONObject6.getBooleanValue("newbuyShowSku");
        }
        return false;
    }
}
