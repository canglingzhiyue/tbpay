package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;
import tb.kge;

/* loaded from: classes.dex */
public class TemplateModel extends BaseTemplateModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1535008257);
    }

    public TemplateModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : getString("name");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : getString("url");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : getString("version");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getNameV2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a0269bc", new Object[]{this}) : getString("name_v2");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getUrlV2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4fbeb784", new Object[]{this}) : getString("url_v2");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getVersionV2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f2a2efb", new Object[]{this}) : getString("version_v2");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel
    public String getColumnType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24061f13", new Object[]{this}) : getString("columnType");
    }
}
