package com.alibaba.android.umf.datamodel.protocol.ultron;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.b;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronProtocol extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UltronProtocol";
    @Deprecated
    public Container container;
    @Deprecated
    public Map<String, Component> data;
    @Deprecated
    public Map<String, Object> endpoint;
    @Deprecated
    public Object features;
    @Deprecated
    public Global global;
    @Deprecated
    public Hierarchy hierarchy;
    @Deprecated
    public Object linkage;
    @JSONField(serialize = false)
    private JSONObject mOriginData;

    static {
        kge.a(-356494654);
    }

    public static /* synthetic */ Object ipc$super(UltronProtocol ultronProtocol, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public UltronProtocol() {
    }

    public UltronProtocol(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
    }

    @JSONField(serialize = false)
    public JSONObject getOriginData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6d23a08d", new Object[]{this}) : this.mOriginData;
    }

    public void setOriginData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5bbc97", new Object[]{this, jSONObject});
        } else {
            this.mOriginData = jSONObject;
        }
    }

    public Container getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("5524bbb8", new Object[]{this});
        }
        if (this.container == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.container = new Container(jSONObject.getJSONObject("container"));
        }
        return this.container;
    }

    public Map<String, Component> getData() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        if (this.data == null) {
            JSONObject jSONObject2 = this.mOriginData;
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("data")) == null) {
                return null;
            }
            this.data = new HashMap();
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                    if (jSONObject3 instanceof JSONObject) {
                        this.data.put(str, new Component(jSONObject3));
                    }
                }
            }
        }
        return this.data;
    }

    public Hierarchy getHierarchy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Hierarchy) ipChange.ipc$dispatch("6545d238", new Object[]{this});
        }
        Hierarchy hierarchy = this.hierarchy;
        if (hierarchy == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return hierarchy;
            }
            this.hierarchy = new Hierarchy(jSONObject.getJSONObject("hierarchy"));
        }
        return this.hierarchy;
    }

    public Global getGlobal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Global) ipChange.ipc$dispatch("9a809fcc", new Object[]{this});
        }
        if (this.global == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.global = new Global(jSONObject.getJSONObject("global"));
        }
        return this.global;
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

    public Object getLinkage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9fb2865c", new Object[]{this});
        }
        if (this.linkage == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.linkage = jSONObject.getJSONObject("linkage");
        }
        return this.linkage;
    }

    public Map<String, Object> getEndpoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b6f86cc7", new Object[]{this});
        }
        if (this.endpoint == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.endpoint = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
        }
        return this.endpoint;
    }

    /* renamed from: clone */
    public UltronProtocol m147clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronProtocol) ipChange.ipc$dispatch("b1a1d59f", new Object[]{this});
        }
        UltronProtocol ultronProtocol = (UltronProtocol) super.clone();
        if (getHierarchy() != null) {
            ultronProtocol.hierarchy = getHierarchy().m146clone();
        }
        if (getEndpoint() != null) {
            try {
                ultronProtocol.endpoint = b.a((Map) getEndpoint());
            } catch (IOException e) {
                arc.a().c(TAG, "clone.IOException", e.getMessage());
            } catch (ClassNotFoundException e2) {
                arc.a().c(TAG, "clone.ClassNotFoundException", e2.getMessage());
            }
        }
        if (getData() != null) {
            try {
                ultronProtocol.data = b.a((Map) getData());
            } catch (IOException e3) {
                arc.a().c(TAG, "clone.IOException", e3.getMessage());
            } catch (ClassNotFoundException e4) {
                arc.a().c(TAG, "clone.ClassNotFoundException", e4.getMessage());
            }
        }
        if (getContainer() != null) {
            ultronProtocol.container = getContainer().m144clone();
        }
        if (getGlobal() != null) {
            ultronProtocol.global = getGlobal().m145clone();
        }
        if (getFeatures() instanceof JSONObject) {
            try {
                ultronProtocol.features = JSON.parseObject(((JSONObject) getFeatures()).toJSONString());
            } catch (Throwable th) {
                arc.a().c(TAG, "clone.IOException", th.getMessage());
            }
        }
        if (getLinkage() != null) {
            try {
                ultronProtocol.linkage = b.a((Serializable) getLinkage());
            } catch (IOException e5) {
                arc.a().c(TAG, "clone.IOException", e5.getMessage());
            } catch (ClassNotFoundException e6) {
                arc.a().c(TAG, "clone.ClassNotFoundException", e6.getMessage());
            }
        }
        return ultronProtocol;
    }
}
