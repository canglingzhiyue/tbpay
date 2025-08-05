package com.alibaba.android.umf.datamodel.protocol.ultron.base;

import com.alibaba.android.umf.datamodel.protocol.ultron.BaseProtocol;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes2.dex */
public class ComponentView extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated
    public String containerType;
    private JSONObject mOriginData;
    @Deprecated
    public String md5;
    @Deprecated
    public String name;
    @Deprecated
    public Set<String> type;
    @Deprecated
    public String url;
    @Deprecated
    public String version;

    static {
        kge.a(-1179321510);
    }

    public static /* synthetic */ Object ipc$super(ComponentView componentView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ComponentView() {
    }

    public ComponentView(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
    }

    public String getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        if (this.containerType == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.containerType = jSONObject.getString("containerType");
        }
        return this.containerType;
    }

    public Set<String> getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8041d3e6", new Object[]{this});
        }
        if (this.type == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.type = JSONArrayToSet(jSONObject.getJSONArray("type"));
        }
        return this.type;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        if (this.name == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.name = jSONObject.getString("name");
        }
        return this.name;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        if (this.version == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.version = jSONObject.getString("version");
        }
        return this.version;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        if (this.url == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.url = jSONObject.getString("url");
        }
        return this.url;
    }

    public String getMd5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
        }
        if (this.md5 == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.md5 = jSONObject.getString("md5");
        }
        return this.md5;
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        ComponentView componentView = (ComponentView) super.clone();
        if (getType() != null) {
            componentView.type = new HashSet(new ArrayList(getType()));
        }
        return componentView;
    }
}
