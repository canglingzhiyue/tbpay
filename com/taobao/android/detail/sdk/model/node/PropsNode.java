package com.taobao.android.detail.sdk.model.node;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class PropsNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<BundleProp> bundleProps;
    public ArrayList<Pair<String, String>> propList;

    static {
        kge.a(2060824779);
    }

    public PropsNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.PropsNode");
        JSONArray jSONArray = jSONObject.getJSONArray("propsList");
        if (jSONArray != null) {
            this.bundleProps = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                this.bundleProps.add(new BundleProp(jSONArray.getJSONObject(i)));
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
        if (this.root == null) {
            return arrayList;
        }
        try {
            Iterator<Object> it = this.root.values().iterator();
            while (it.hasNext()) {
                Iterator<Object> it2 = ((JSONArray) it.next()).iterator();
                while (it2.hasNext()) {
                    Iterator<Object> it3 = ((JSONObject) it2.next()).values().iterator();
                    while (it3.hasNext()) {
                        Iterator<Object> it4 = ((JSONArray) it3.next()).iterator();
                        while (it4.hasNext()) {
                            JSONObject jSONObject = (JSONObject) it4.next();
                            for (String str : jSONObject.keySet()) {
                                String string = jSONObject.getString(str);
                                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(string)) {
                                    arrayList.add(new Pair<>(str, string));
                                }
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
    public static class BundleProp {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String itemId;
        public String itemPic;
        public List<Pair<String, String>> propList;

        static {
            kge.a(-760567650);
        }

        public BundleProp(JSONObject jSONObject) {
            this.propList = initPropList(jSONObject);
            this.itemId = jSONObject.getString("itemId");
            this.itemPic = jSONObject.getString("itemPic");
        }

        private List<Pair<String, String>> initPropList(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6ae7952f", new Object[]{this, jSONObject});
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
