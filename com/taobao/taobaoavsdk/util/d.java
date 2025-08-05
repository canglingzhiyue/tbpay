package com.taobao.taobaoavsdk.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f21344a;
    private Map<String, String> b = new HashMap();
    private Map<String, String> c = new HashMap();
    private List<a> d = new LinkedList();

    static {
        kge.a(204961489);
    }

    public static /* synthetic */ Map a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5150c0ac", new Object[]{dVar}) : dVar.b;
    }

    public static /* synthetic */ Map b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("42fa66cb", new Object[]{dVar}) : dVar.c;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.b.put(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.c.put(str, str2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.clear();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !str.equals(this.f21344a)) {
            this.d.clear();
            this.f21344a = str;
            try {
                JSONArray parseArray = JSON.parseArray(str);
                for (int i = 0; i < parseArray.size(); i++) {
                    String string = parseArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        this.d.add(new a(string));
                    }
                }
            } catch (Throwable th) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "initCompareRule exception " + th.toString());
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        List<a> list = this.d;
        if (list != null && list.size() != 0) {
            for (int i = 0; i < this.d.size(); i++) {
                if (this.d.get(i).a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* loaded from: classes8.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, List<String>> f21345a = new HashMap();

        static {
            kge.a(-1060537073);
        }

        public a(String str) {
            JSONObject parseObject = JSON.parseObject(str);
            for (String str2 : parseObject.keySet()) {
                LinkedList linkedList = new LinkedList();
                JSONArray jSONArray = parseObject.getJSONArray(str2);
                for (int i = 0; i < jSONArray.size(); i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        linkedList.add(string);
                    }
                }
                if (linkedList.size() > 0) {
                    this.f21345a.put(str2, linkedList);
                }
            }
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            int size = this.f21345a.size();
            int i = 0;
            for (Map.Entry<String, List<String>> entry : this.f21345a.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ((d.a(d.this).containsKey(key) && value.contains((String) d.a(d.this).get(key))) || (d.b(d.this).containsKey(key) && value.contains((String) d.b(d.this).get(key)))) {
                    i++;
                }
            }
            return size > 0 && size == i;
        }
    }
}
