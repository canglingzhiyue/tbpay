package com.taobao.tbliveinteractive;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.tbliveinteractive.business.list.InteractiveShowInfo;
import com.taobao.tbliveinteractive.componentlist.MtopMediaplatformDetailComponentlistResponseData;
import tb.kge;
import tb.pqj;

/* loaded from: classes8.dex */
public class InteractiveComponent implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String kTBLiveInteractiveDynamicDefaultComptType = "default";
    private static final String kTBLiveInteractiveDynamicMessageComptType = "message";
    public String actionUrl;
    public String bundleMD5;
    public String bundleUrl;
    public int componentStatus;
    public String comptType;
    public String currentState;
    public String customizedMtop;
    public int customizedType;
    public JSONObject extraParams;
    public String fedName;
    public boolean floatingLayerStatus;
    public String iconAction;
    public String iconUrl;
    public String iconViewStyle;
    public String id;
    public boolean interactivePanelDisplayOnly;
    public boolean isFistShow;
    public boolean isNeedShowEntrance;
    public boolean isNotifying;
    public boolean isRightAnimated;
    public boolean isShowInInteractivePanel;
    public String label;
    public boolean migrationFlag;
    public String name;
    public JSONObject notificationViewParams;
    public String panelTitle;
    public String priority;
    public boolean rightShowFlag;
    public int showOrder;
    public String type;
    public String version;
    public JSON viewParams;

    static {
        kge.a(1057720757);
        kge.a(-540945145);
    }

    public InteractiveComponent() {
        this.interactivePanelDisplayOnly = false;
        this.componentStatus = 0;
        this.floatingLayerStatus = false;
        this.customizedType = 0;
        this.showOrder = -1;
        this.migrationFlag = false;
        this.rightShowFlag = false;
        this.isNeedShowEntrance = false;
        this.isNotifying = false;
        this.isRightAnimated = false;
        this.isFistShow = false;
    }

    public InteractiveComponent(MtopMediaplatformDetailComponentlistResponseData.Component component) {
        boolean z = false;
        this.interactivePanelDisplayOnly = false;
        this.componentStatus = 0;
        this.floatingLayerStatus = false;
        this.customizedType = 0;
        this.showOrder = -1;
        this.migrationFlag = false;
        this.rightShowFlag = false;
        this.isNeedShowEntrance = false;
        this.isNotifying = false;
        this.isRightAnimated = false;
        this.isFistShow = false;
        this.id = component.id;
        this.name = component.name;
        this.fedName = component.fedName;
        this.label = component.label;
        this.iconUrl = component.iconUrl;
        this.comptType = component.comptType;
        this.type = component.type;
        this.version = component.version;
        this.bundleUrl = component.bundleUrl;
        this.bundleMD5 = component.bundleMD5;
        this.iconAction = component.iconAction;
        this.actionUrl = component.actionUrl;
        this.iconViewStyle = component.iconViewStyle;
        this.customizedType = component.customizedType;
        this.customizedMtop = component.customizedMtop;
        this.isShowInInteractivePanel = component.hideable == 1 ? true : z;
        this.panelTitle = component.panelTitle;
        this.interactivePanelDisplayOnly = component.interactivePanelDisplayOnly;
        this.showOrder = component.showOrder;
        this.currentState = component.currentState;
        this.migrationFlag = component.migrationFlag;
        this.rightShowFlag = component.rightShowFlag;
        this.priority = component.priority;
    }

    public boolean isMessageComponentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d5a75ce5", new Object[]{this})).booleanValue() : "message".equals(this.comptType);
    }

    public boolean isDefaultComponentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e39281eb", new Object[]{this})).booleanValue() : "default".equals(this.comptType);
    }

    public boolean isLoadComponentComplete() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b589b91", new Object[]{this})).booleanValue() : this.componentStatus > 0;
    }

    public boolean isInitComponentComplete() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6cae99a7", new Object[]{this})).booleanValue() : this.componentStatus == 2;
    }

    public void loadComponentComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a820597", new Object[]{this});
        } else {
            this.componentStatus = 1;
        }
    }

    public void initComponentComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd803ad", new Object[]{this});
        } else {
            this.componentStatus = 2;
        }
    }

    public boolean isFloatingLayerStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c76a8a3e", new Object[]{this})).booleanValue() : this.floatingLayerStatus;
    }

    public void setFloatingLayerStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621cf712", new Object[]{this, new Boolean(z)});
        } else {
            this.floatingLayerStatus = z;
        }
    }

    public void updateViewParams(InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a41e39", new Object[]{this, interactiveShowInfo});
            return;
        }
        this.isNeedShowEntrance = interactiveShowInfo.isNeedShow;
        this.isNotifying = interactiveShowInfo.isNotifying;
        this.notificationViewParams = pqj.b(interactiveShowInfo.notificationViewParams);
        Object a2 = pqj.a(interactiveShowInfo.viewParams);
        this.viewParams = a2 instanceof JSON ? (JSON) a2 : null;
        this.extraParams = pqj.b(interactiveShowInfo.extraParams);
        if (!StringUtils.isEmpty(interactiveShowInfo.iconAction)) {
            this.iconAction = interactiveShowInfo.iconAction;
        }
        if (!StringUtils.isEmpty(interactiveShowInfo.actionUrl)) {
            this.actionUrl = interactiveShowInfo.actionUrl;
        }
        if (StringUtils.isEmpty(interactiveShowInfo.iconViewStyle)) {
            return;
        }
        this.iconViewStyle = interactiveShowInfo.iconViewStyle;
    }

    public JSONObject parseJsonTBLiveInteractiveComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c6ea39f7", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.id);
        jSONObject.put("name", (Object) this.name);
        jSONObject.put("fedName", (Object) this.fedName);
        jSONObject.put("label", (Object) this.label);
        jSONObject.put("iconUrl", (Object) this.iconUrl);
        jSONObject.put("type", (Object) this.type);
        jSONObject.put("isShowInInteractivePanel", (Object) Boolean.valueOf(this.isShowInInteractivePanel));
        jSONObject.put("panelTitle", (Object) this.panelTitle);
        jSONObject.put("interactivePanelDisplayOnly", (Object) Boolean.valueOf(this.interactivePanelDisplayOnly));
        jSONObject.put("version", (Object) this.version);
        jSONObject.put("iconAction", (Object) this.iconAction);
        jSONObject.put("actionUrl", (Object) this.actionUrl);
        jSONObject.put("iconViewStyle", (Object) this.iconViewStyle);
        jSONObject.put("showOrder", (Object) Integer.valueOf(this.showOrder));
        jSONObject.put("rightShowFlag", (Object) Boolean.valueOf(this.rightShowFlag));
        jSONObject.put("migrationFlag", (Object) Boolean.valueOf(this.migrationFlag));
        jSONObject.put("isNeedShowEntrance", (Object) Boolean.valueOf(this.isNeedShowEntrance));
        jSONObject.put("isNotifying", (Object) Boolean.valueOf(this.isNotifying));
        jSONObject.put("notificationViewParams", (Object) this.notificationViewParams);
        jSONObject.put("viewParams", (Object) this.viewParams);
        jSONObject.put("extraParams", (Object) this.extraParams);
        jSONObject.put("componentStatus", (Object) Integer.valueOf(this.componentStatus));
        jSONObject.put("floatingLayerStatus", (Object) Boolean.valueOf(this.floatingLayerStatus));
        jSONObject.put("priority", (Object) this.priority);
        jSONObject.put("isRightAnimated", (Object) Boolean.valueOf(this.isRightAnimated));
        return jSONObject;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TBLiveInteractiveComponent{comptType='" + this.comptType + "', name='" + this.name + "', fedName='" + this.fedName + "', label='" + this.label + "', type='" + this.type + "', isShowInInteractivePanel=" + this.isShowInInteractivePanel + ", panelTitle=" + this.panelTitle + ", interactivePanelDisplayOnly=" + this.interactivePanelDisplayOnly + ", currentState='" + this.currentState + "', version='" + this.version + "', bundleUrl='" + this.bundleUrl + "', bundleMD5='" + this.bundleMD5 + "', iconAction='" + this.iconAction + "', actionUrl='" + this.actionUrl + "', iconViewStyle='" + this.iconViewStyle + "', customizedType=" + this.customizedType + ", customizedMtop='" + this.customizedMtop + "', showOrder=" + this.showOrder + ", migrationFlag=" + this.migrationFlag + ", rightShowFlag=" + this.rightShowFlag + ", isNeedShowEntrance=" + this.isNeedShowEntrance + ", isNotifying=" + this.isNotifying + ", notificationViewParams=" + this.notificationViewParams + ", viewParams=" + this.viewParams + ", extraParams=" + this.extraParams + ", isFistShow=" + this.isFistShow + ", componentStatus=" + this.componentStatus + ", floatingLayerStatus=" + this.floatingLayerStatus + ", priority=" + this.priority + ", isRightAnimated=" + this.isRightAnimated + '}';
    }
}
