package com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class UiRefreshActionModel implements IUiRefreshActionModel, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_CHANGE_TYPE_BASE = "base";
    public static final String DATA_CHANGE_TYPE_DELTA = "delta";
    public static final String DATA_SOURCE_TYPE_DOWNLOAD = "download";
    public static final String DATA_SOURCE_TYPE_LOCAL = "local";
    public static final String DATA_SOURCE_TYPE_REMOTE = "remote";
    public static final String OPERATION_TYPE_SCROLL_TO_TOP = "scrollToTop";
    public static final String OPERATION_TYPE_UI_REFRESH = "uiRefresh";
    public String containerId;
    public IContainerDataModel containerModel;
    public String dataChangeType;
    public String dataSourceType;
    public String errorCode;
    public String errorMsg;
    public boolean isSecondReturn;
    public String requestType;
    @JSONField(name = "UIOperation")
    public JSONObject subUiOperation;
    @JSONField(name = "_msgType")
    public String uiOperationType = "uiRefresh";

    static {
        kge.a(-1430438701);
        kge.a(1693673289);
        kge.a(1028243835);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getUiOperationType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c08da82", new Object[]{this}) : this.uiOperationType;
    }

    public JSONObject getSubUiOperation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6eb43ef0", new Object[]{this}) : this.subUiOperation;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getRequestType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this}) : this.requestType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this}) : this.containerId;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public IContainerDataModel<?> getContainerModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataModel) ipChange.ipc$dispatch("697d3f50", new Object[]{this}) : this.containerModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getDataChangeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1799b5ef", new Object[]{this}) : this.dataChangeType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getDataSourceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("831c9fe4", new Object[]{this}) : this.dataSourceType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.errorCode;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public boolean isSecondReturn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73b38699", new Object[]{this})).booleanValue() : this.isSecondReturn;
    }
}
