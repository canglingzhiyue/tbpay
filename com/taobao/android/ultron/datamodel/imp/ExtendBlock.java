package com.taobao.android.ultron.datamodel.imp;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class ExtendBlock implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, List<IDMComponent>> blockComponents = new LinkedHashMap();
    public Map<String, JSONObject> blockHierarchy = new HashMap();
    private IDMComponent mExtendBlock;

    static {
        kge.a(415348696);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    public ExtendBlock(IDMComponent iDMComponent) {
        this.mExtendBlock = iDMComponent;
    }

    public void addBlock(String str, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50bd6cee", new Object[]{this, str, list});
        } else {
            this.blockComponents.put(str, list);
        }
    }

    public void addHierarchy(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ef06d5", new Object[]{this, str, bVar});
        } else if (bVar != null && !StringUtils.isEmpty(str)) {
            JSONObject jSONObject = this.blockHierarchy.get(str);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject w = bVar.w();
            if (w.containsKey(str)) {
                JSONArray jSONArray = w.getJSONArray(str);
                jSONObject.put(str, (Object) jSONArray);
                for (int i = 0; i < jSONArray.size(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        handleSubKeyArray((String) obj, w, jSONObject);
                    }
                }
                this.blockHierarchy.put(str, jSONObject);
                return;
            }
            this.blockHierarchy.remove(str);
        }
    }

    private void handleSubKeyArray(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5b44a3", new Object[]{this, str, jSONObject, jSONObject2});
        } else if (str != null && jSONObject.containsKey(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            jSONObject2.put(str, (Object) jSONArray);
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    handleSubKeyArray((String) obj, jSONObject, jSONObject2);
                }
            }
        }
    }

    public List<IDMComponent> getblockComponentList() {
        List<IDMComponent> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1eac9edc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<IDMComponent>> entry : this.blockComponents.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                arrayList.addAll(value);
            }
        }
        return arrayList;
    }

    public void removeBlockComponentList(String str) {
        Map<String, List<IDMComponent>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d4a063", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (map = this.blockComponents) == null || !map.containsKey(str)) {
        } else {
            this.blockComponents.remove(str);
        }
    }

    public void removeBlockHierarchy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d3e35d", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || !this.blockHierarchy.containsKey(str)) {
        } else {
            this.blockHierarchy.remove(str);
        }
    }

    public JSONObject getBlockHierarchy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24d9284f", new Object[]{this, str});
        }
        if (!this.blockHierarchy.containsKey(str)) {
            return null;
        }
        return this.blockHierarchy.get(str);
    }

    public IDMComponent getExtendBlock() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("20bb7c68", new Object[]{this}) : this.mExtendBlock;
    }

    public void updateExtendBlock(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ec6f63", new Object[]{this, iDMComponent});
        } else {
            this.mExtendBlock = iDMComponent;
        }
    }

    public boolean isExtendTypePrepend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc48fbfb", new Object[]{this})).booleanValue();
        }
        IDMComponent iDMComponent = this.mExtendBlock;
        return iDMComponent != null && DMComponent.PREPEND.equals(iDMComponent.getExtendType());
    }

    public boolean isExtendTypeReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("892b85bc", new Object[]{this})).booleanValue();
        }
        IDMComponent iDMComponent = this.mExtendBlock;
        return iDMComponent != null && DMComponent.RESET.equals(iDMComponent.getExtendType());
    }
}
