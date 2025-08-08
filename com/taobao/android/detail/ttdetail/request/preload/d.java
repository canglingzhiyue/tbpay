package com.taobao.android.detail.ttdetail.request.preload;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.ak;
import com.taobao.android.detail.ttdetail.utils.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.nfc;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f10791a;
    private final Deque<c> b = new ArrayDeque();

    static {
        kge.a(1037512714);
        f10791a = com.taobao.android.detail.ttdetail.utils.j.k();
    }

    public synchronized List<c> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; !this.b.isEmpty() && i < 5; i++) {
            arrayList.add(this.b.pop());
        }
        return arrayList;
    }

    public synchronized void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a898baed", new Object[]{this, cVar});
            return;
        }
        if (this.b.contains(cVar)) {
            this.b.remove(cVar);
        }
        this.b.push(cVar);
    }

    public List<c> a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc382782", new Object[]{this, intent});
        }
        if (intent == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String stringExtra = intent.getStringExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS);
        if (!StringUtils.isEmpty(stringExtra)) {
            arrayList.addAll(a(stringExtra));
        } else {
            arrayList.add(b(intent));
        }
        return arrayList;
    }

    private c b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ff7a6fb5", new Object[]{this, intent});
        }
        Uri data = intent.getData();
        String a2 = ak.a(intent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) "page_detail");
        String a3 = a(data);
        jSONObject.put("from", (Object) a3);
        jSONObject.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, (Object) "nav");
        jSONObject.put("id", (Object) a2);
        jSONObject.putAll(l.c(data));
        c cVar = new c();
        cVar.b = a2;
        cVar.c = "nav";
        cVar.f10790a = jSONObject;
        cVar.d = a3;
        return cVar;
    }

    private List<c> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return arrayList;
        }
        String string = parseObject.getString("sourceFrom");
        if (StringUtils.isEmpty(string) || !f10791a.contains(string)) {
            return arrayList;
        }
        String string2 = parseObject.getString("bizName");
        parseObject.getString(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE);
        JSONArray jSONArray = parseObject.getJSONArray("items");
        com.taobao.android.detail.ttdetail.utils.i.a("PreloadItemManager", "批量预加载sourceFrom=" + string + ", items=" + jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                c a2 = c.a(jSONObject);
                JSONObject jSONObject2 = a2.f10790a;
                if (StringUtils.isEmpty(jSONObject2.getString("from"))) {
                    jSONObject2.put("from", (Object) (StringUtils.isEmpty(string) ? com.taobao.android.detail.ttdetail.constant.a.UN_KNOW : string));
                }
                if (!StringUtils.isEmpty(string2)) {
                    jSONObject2.put("bizName", (Object) string2);
                }
                jSONObject2.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, (Object) "batch");
                a2.c = jSONObject2.getString(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE);
                a2.d = jSONObject2.getString("from");
                String string3 = jSONObject.getString("itemId");
                if (!StringUtils.isEmpty(string3)) {
                    a2.b = string3;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("PreloadItemManager", "批量预加载itemId=" + a2.b);
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{this, uri});
        }
        if (uri == null) {
            return com.taobao.android.detail.ttdetail.constant.a.UN_KNOW;
        }
        String queryParameter = uri.getQueryParameter("from");
        return StringUtils.isEmpty(queryParameter) ? com.taobao.android.detail.ttdetail.constant.a.UN_KNOW : queryParameter;
    }
}
