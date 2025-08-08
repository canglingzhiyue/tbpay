package com.alibaba.android.umf.datamodel.protocol.ultron.base;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.b;
import com.alibaba.android.umf.datamodel.protocol.ultron.BaseProtocol;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.arc;
import tb.ifv;
import tb.kge;

/* loaded from: classes2.dex */
public class Component extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Component";
    @JSONField(name = "children")
    private JSONObject children;
    @JSONField(serialize = false)
    private Map<String, Object> codePopupWindowMap;
    @JSONField(name = "events")
    @Deprecated
    public Map<String, List<Event>> events;
    @JSONField(name = "features")
    @Deprecated
    public Object features;
    @JSONField(name = "fields")
    @Deprecated
    public Map<String, Object> fields;
    @JSONField(name = "id")
    @Deprecated
    public String id;
    @JSONField(name = "localFields")
    @Deprecated
    public Map<String, Object> localFields;
    private JSONObject mOriginData;
    @JSONField(name = "validate")
    @Deprecated
    public JSONObject mValidate;
    @JSONField(name = "position")
    @Deprecated
    public String position;
    @JSONField(name = "ref")
    @Deprecated
    public String ref;
    @JSONField(name = "status")
    @Deprecated
    public String status;
    @JSONField(name = "submit")
    @Deprecated
    public String submit;
    @JSONField(name = "tag")
    @Deprecated
    public String tag;
    @JSONField(name = "type")
    @Deprecated
    public String type;

    static {
        kge.a(527163157);
    }

    public static /* synthetic */ Object ipc$super(Component component, String str, Object... objArr) throws InstantReloadException {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Component() {
        this.fields = new HashMap();
        this.events = new HashMap();
    }

    public Component(JSONObject jSONObject) {
        this();
        this.mOriginData = jSONObject;
    }

    public String getRef() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fee331bc", new Object[]{this});
        }
        if (this.ref == null && (jSONObject = this.mOriginData) != null) {
            this.ref = jSONObject.getString("ref");
        }
        return this.ref;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        String str = this.id;
        if (str == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return str;
            }
            this.id = jSONObject.getString("id");
        }
        return this.id;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        String str = this.tag;
        if (str == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return str;
            }
            this.tag = jSONObject.getString("tag");
        }
        return this.tag;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        String str = this.type;
        if (str == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return str;
            }
            this.type = jSONObject.getString("type");
        }
        return this.type;
    }

    public Map<String, Object> getFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fb94d26b", new Object[]{this});
        }
        Map<String, Object> map = this.fields;
        if (map == null || map.size() == 0) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return this.fields;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 == null) {
                return this.fields;
            }
            this.fields = jSONObject2;
        }
        return this.fields;
    }

    public void setFields(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8937a83", new Object[]{this, map});
        } else {
            this.fields = map;
        }
    }

    public Map<String, List<Event>> getEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57675ccb", new Object[]{this});
        }
        Map<String, List<Event>> map = this.events;
        if (map == null || map.size() == 0) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return this.events;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 == null) {
                return this.events;
            }
            this.events = ifv.a(jSONObject2);
        }
        return this.events;
    }

    public void setEvents(Map<String, List<Event>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7123c23", new Object[]{this, map});
        } else {
            this.events = map;
        }
    }

    public Object getFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("50f14db8", new Object[]{this});
        }
        if (this.features == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.features = jSONObject.getJSONObject("features");
        }
        return this.features;
    }

    public void setFeatures(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d5a22", new Object[]{this, obj});
        } else {
            this.features = obj;
        }
    }

    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        if (this.status == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.status = jSONObject.getString("status");
        }
        return this.status;
    }

    public String getSubmit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fb3e0ab", new Object[]{this});
        }
        if (this.submit == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.submit = jSONObject.getString("submit");
        }
        return this.submit;
    }

    public Map<String, Object> getLocalFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5415bca", new Object[]{this});
        }
        if (this.localFields == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.localFields = jSONObject.getJSONObject("localFields");
        }
        return this.localFields;
    }

    public void setLocalFields(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c8949c", new Object[]{this, map});
        } else {
            this.localFields = map;
        }
    }

    public JSONObject getChildren() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("638f189c", new Object[]{this}) : this.children;
    }

    public void setChildren(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22eb1368", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.children = jSONObject;
        }
    }

    @JSONField(serialize = false)
    public boolean isHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fb439ff", new Object[]{this})).booleanValue();
        }
        getStatus();
        return !StringUtils.isEmpty(this.status) && "hidden".equals(this.status.toLowerCase());
    }

    @JSONField(serialize = false)
    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue();
        }
        getStatus();
        return !StringUtils.isEmpty(this.status) && "disable".equals(this.status.toLowerCase());
    }

    public void addCodePopupWindow(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c06db", new Object[]{this, str, obj});
            return;
        }
        if (this.codePopupWindowMap == null) {
            this.codePopupWindowMap = new HashMap();
        }
        this.codePopupWindowMap.put(str, obj);
    }

    public Map<String, Object> getCodePopupWindowMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("49b4a8ff", new Object[]{this}) : this.codePopupWindowMap;
    }

    public JSONObject getValidate() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0805433", new Object[]{this});
        }
        getFeatures();
        Object obj = this.features;
        if ((obj instanceof JSONObject) && (jSONObject = ((JSONObject) obj).getJSONObject("linkage")) != null) {
            return jSONObject.getJSONObject("validate");
        }
        return this.mValidate;
    }

    public boolean isIndependentNode() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb50e99d", new Object[]{this})).booleanValue();
        }
        getFields();
        Map<String, Object> map = this.fields;
        if (map == null || (obj = map.get("independentAURANode")) == null) {
            return false;
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        getFields();
        Map<String, Object> map = this.fields;
        return map == null || map.isEmpty();
    }

    public String getPosition() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this});
        }
        getFields();
        if (StringUtils.isEmpty(this.position) && (map = this.fields) != null) {
            Object obj = map.get("position");
            this.position = obj instanceof String ? (String) obj : null;
        }
        return this.position;
    }

    /* renamed from: clone */
    public Component m149clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("1267d3ac", new Object[]{this});
        }
        Component component = (Component) super.clone();
        try {
            if (getFields() != null) {
                component.fields = b.a((Map) getFields());
            }
            if (!(getFeatures() instanceof Serializable)) {
                component.features = b.a((Serializable) getFeatures());
            }
            if (getEvents() != null) {
                component.events = eventsDeepClone();
            }
        } catch (IOException e) {
            arc.a().c(TAG, "clone.IOException", e.getMessage());
        } catch (ClassNotFoundException e2) {
            arc.a().c(TAG, "clone.ClassNotFoundException", e2.getMessage());
        }
        return component;
    }

    private Map<String, List<Event>> eventsDeepClone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3880ef34", new Object[]{this});
        }
        getEvents();
        HashMap hashMap = new HashMap();
        for (String str : this.events.keySet()) {
            ArrayList arrayList = new ArrayList();
            for (Event event : this.events.get(str)) {
                arrayList.add(event.m150clone());
            }
            hashMap.put(str, arrayList);
        }
        return hashMap;
    }
}
