package com.taobao.android.detail.core.aura.wrapper;

import android.support.v4.util.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.emu;
import tb.jpk;
import tb.kge;

/* loaded from: classes4.dex */
public class DMComponentWrapper implements IDMComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<IDMComponent> mChildren;
    private JSONObject mEvents;
    private JSONObject mFields;

    static {
        kge.a(-1162807678);
        kge.a(-325349683);
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public boolean clearOnceExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac073794", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getAdjustOperatorAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b50fe7a", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getCardGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b741200", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public Map<String, DMComponent> getCodePopupWindowMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49b4a8ff", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getContainerInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("245b3440", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public Map<String, List<com.taobao.android.ultron.common.model.b>> getEventMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("86199254", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ArrayMap<String, Object> getExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("c980df8e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getExtendType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82c37cf", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("23924447", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2fbde1c7", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getLayoutStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ff3b1298", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getLayoutType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("208cadbf", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public LinkageType getLinkageType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkageType) ipChange.ipc$dispatch("67b2f4b8", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public jpk getMessageChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpk) ipChange.ipc$dispatch("3bbd35a8", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public int getModifiedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a626c8a", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ArrayMap<String, Object> getOnceExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("b7b8cd4d", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public IDMComponent getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("c56546ab", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ConcurrentHashMap<String, Object> getSafeExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("ffabd961", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getStashData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("41d69a30", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public boolean isNormalComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff5283d7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void record() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setAdjustOperatorAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c318793c", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setComponentCardGroupTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c04f837", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setComponentPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3f4095", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setCornerTypeFields(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c844b252", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setCustomValidate(IDMComponent.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b398bc7", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setExtendType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4444987", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setLayoutType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f29197", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setMessageChannel(jpk jpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b08cf0", new Object[]{this, jpkVar});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void updateModifiedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f37784", new Object[]{this});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public com.taobao.android.ultron.common.b validate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.b) ipChange.ipc$dispatch("cce007c2", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackData(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac85edb", new Object[]{this, jSONObject, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackDataAndReloadEvent(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36db19a5", new Object[]{this, jSONObject, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackFields(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e220c12a", new Object[]{this, jSONObject, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeFields(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fac4fa5", new Object[]{this, str, obj});
        }
    }

    public DMComponentWrapper() {
        emu.a("com.taobao.android.detail.core.aura.wrapper.DMComponentWrapper");
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getFields() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this}) : this.mFields;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public List<IDMComponent> getChildren() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this}) : this.mChildren;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("78cabc36", new Object[]{this}) : this.mEvents;
    }

    public void setFields(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f811566e", new Object[]{this, jSONObject});
        } else {
            this.mFields = jSONObject;
        }
    }

    public void setChildren(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4ad579", new Object[]{this, list});
        } else {
            this.mChildren = list;
        }
    }

    public void addChildren(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2141cd38", new Object[]{this, list});
            return;
        }
        if (this.mChildren == null) {
            this.mChildren = new ArrayList();
        }
        this.mChildren.addAll(list);
    }

    public void addChildren(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e259136d", new Object[]{this, iDMComponent});
            return;
        }
        if (this.mChildren == null) {
            this.mChildren = new ArrayList();
        }
        this.mChildren.add(iDMComponent);
    }

    public void setEvents(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13ef00e", new Object[]{this, jSONObject});
        } else {
            this.mEvents = jSONObject;
        }
    }
}
