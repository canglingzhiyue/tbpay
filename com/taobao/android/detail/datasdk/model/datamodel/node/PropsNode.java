package com.taobao.android.detail.datasdk.model.datamodel.node;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PropsNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "props";
    public List<a> bundleProps;
    public ArrayList<Pair<String, String>> propList;

    static {
        kge.a(-1448007867);
    }

    public PropsNode(JSONObject jSONObject) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("propsList");
        if (jSONArray != null) {
            this.bundleProps = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                this.bundleProps.add(new a(jSONArray.getJSONObject(i)));
            }
        } else {
            this.propList = initPropList();
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.PropsNode");
    }

    private ArrayList<Pair<String, String>> initPropList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("82f9d3b2", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.data == null) {
            return arrayList;
        }
        try {
            Iterator<Object> it = this.data.getJSONArray("groupProps").iterator();
            while (it.hasNext()) {
                Iterator<Object> it2 = ((JSONObject) it.next()).values().iterator();
                while (it2.hasNext()) {
                    Iterator<Object> it3 = ((JSONArray) it2.next()).iterator();
                    while (it3.hasNext()) {
                        JSONObject jSONObject = (JSONObject) it3.next();
                        for (String str : jSONObject.keySet()) {
                            String string = jSONObject.getString(str);
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
        public List<Pair<String, String>> f9989a;
        public String b;
        public String c;

        static {
            kge.a(-372096540);
        }

        public a(JSONObject jSONObject) {
            this.f9989a = a(jSONObject);
            this.b = jSONObject.getString("itemId");
            this.c = jSONObject.getString("itemPic");
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
}
