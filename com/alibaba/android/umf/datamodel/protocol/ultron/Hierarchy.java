package com.alibaba.android.umf.datamodel.protocol.ultron;

import com.alibaba.android.aura.datamodel.b;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tb.arc;
import tb.kge;

/* loaded from: classes2.dex */
public class Hierarchy extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Hierarchy";
    @Deprecated
    public List<Delta> delta;
    @Deprecated
    private JSONObject mOriginData;
    @Deprecated
    public String root;
    @Deprecated
    public JSONObject structure;

    static {
        kge.a(1555736671);
    }

    public static /* synthetic */ Object ipc$super(Hierarchy hierarchy, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Hierarchy() {
    }

    public Hierarchy(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
    }

    public String getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb1a0ca1", new Object[]{this});
        }
        if (this.root == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.root = jSONObject.getString("root");
        }
        return this.root;
    }

    public JSONObject getStructure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("608317e4", new Object[]{this});
        }
        if (this.structure == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.structure = jSONObject.getJSONObject("structure");
        }
        return this.structure;
    }

    public List<Delta> getDelta() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be69d99e", new Object[]{this});
        }
        if (this.delta == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("delta")) == null) {
                return null;
            }
            this.delta = JSONArrayToEventList(jSONArray);
        }
        return this.delta;
    }

    private List<Delta> JSONArrayToEventList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ab3f862c", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(new Delta((JSONObject) obj));
            }
        }
        return arrayList;
    }

    /* renamed from: clone */
    public Hierarchy m146clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Hierarchy) ipChange.ipc$dispatch("fe2dbc16", new Object[]{this});
        }
        Hierarchy hierarchy = (Hierarchy) super.clone();
        try {
            hierarchy.structure = (JSONObject) b.a(getStructure());
        } catch (IOException e) {
            arc.a().c(TAG, "clone.IOException", e.getMessage());
        } catch (ClassNotFoundException e2) {
            arc.a().c(TAG, "clone.ClassNotFoundException", e2.getMessage());
        }
        try {
            hierarchy.delta = b.a((List) getDelta());
        } catch (IOException e3) {
            arc.a().c(TAG, "clone.IOException", e3.getMessage());
        } catch (ClassNotFoundException e4) {
            arc.a().c(TAG, "clone.ClassNotFoundException", e4.getMessage());
        }
        return hierarchy;
    }
}
