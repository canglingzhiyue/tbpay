package com.taobao.android.detail.ttdetail.data.meta;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

@MappingKey(key = "props")
/* loaded from: classes4.dex */
public class Props extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<a> bundleProps;
    private JSONObject data;
    private ArrayList<Pair<String, String>> propList;

    static {
        kge.a(-1886083112);
    }

    public Props(JSONObject jSONObject) {
        super(jSONObject);
        this.data = jSONObject;
        JSONArray jSONArray = jSONObject.getJSONArray("propsList");
        if (jSONArray != null) {
            this.bundleProps = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                this.bundleProps.add(new a(jSONArray.getJSONObject(i)));
            }
            return;
        }
        this.propList = initPropList();
    }

    private ArrayList<Pair<String, String>> initPropList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("82f9d3b2", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.data;
        if (jSONObject == null) {
            return arrayList;
        }
        try {
            Iterator<Object> it = jSONObject.getJSONArray("groupProps").iterator();
            while (it.hasNext()) {
                Iterator<Object> it2 = ((JSONObject) it.next()).values().iterator();
                while (it2.hasNext()) {
                    Iterator<Object> it3 = ((JSONArray) it2.next()).iterator();
                    while (it3.hasNext()) {
                        JSONObject jSONObject2 = (JSONObject) it3.next();
                        for (String str : jSONObject2.keySet()) {
                            String string = jSONObject2.getString(str);
                            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(string)) {
                                arrayList.add(new Pair<>(str, string));
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<Pair<String, String>> f10615a;
        private String b;
        private String c;

        static {
            kge.a(-977225871);
        }

        public a(JSONObject jSONObject) {
            this.f10615a = a(jSONObject);
            this.b = jSONObject.getString("itemId");
            this.c = jSONObject.getString("itemPic");
        }

        public List<Pair<String, String>> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f10615a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
        }

        private List<Pair<String, String>> a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("baseProps");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    arrayList.add(new Pair(jSONObject2.getString("key"), jSONObject2.getString("value")));
                }
            }
            return arrayList;
        }
    }

    public ArrayList<Pair<String, String>> getPropList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("109f65f8", new Object[]{this}) : this.propList;
    }

    public List<a> getBundleProps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fde2bf08", new Object[]{this}) : this.bundleProps;
    }
}
