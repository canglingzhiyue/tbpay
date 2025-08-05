package com.taobao.informationflowdataservice.dataservice.core.datasource.model.request;

import com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetRequestParams implements IRequestParams<AwesomeGetContainerParams>, IMTOPDataObject {
    private String acookie;
    private String address;
    private String areaCode;
    private String areaName;
    private String cityCode;
    private String cityName;
    private String countryCode;
    private String countryName;
    private String edition;
    private String encryptUserId;
    private String latitude;
    private String longitude;
    private String nick;
    private long poiRefreshTime;
    private String previewParam;
    private String provinceCode;
    private String provinceName;
    private String townName;
    private String userId;
    private String utdid;
    public String API_NAME = "mtop.taobao.wireless.home.awesome.get";
    public String VERSION = "1.0";
    public final boolean NEED_ECODE = false;
    public final boolean NEED_SESSION = true;
    private String gatewayVersion = "2.0";
    private Map<String, AwesomeGetContainerParams> containerParams = new HashMap(4);

    static {
        kge.a(-355897229);
        kge.a(252882553);
        kge.a(-350052935);
    }

    public String getApiName() {
        return this.API_NAME;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setApiName(String str) {
        this.API_NAME = str;
    }

    public String getVersion() {
        return this.VERSION;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setVersion(String str) {
        this.VERSION = str;
    }

    public String getUserId() {
        return this.userId;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setUserId(String str) {
        this.userId = str;
    }

    public String getNick() {
        return this.nick;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setNick(String str) {
        this.nick = str;
    }

    public String getUtdid() {
        return this.utdid;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setUtdid(String str) {
        this.utdid = str;
    }

    public String getLongitude() {
        return this.longitude;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setLongitude(String str) {
        this.longitude = str;
    }

    public String getLatitude() {
        return this.latitude;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setLatitude(String str) {
        this.latitude = str;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setProvinceCode(String str) {
        this.provinceCode = str;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setAreaCode(String str) {
        this.areaCode = str;
    }

    public String getCountryName() {
        return this.countryName;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setCountryName(String str) {
        this.countryName = str;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setProvinceName(String str) {
        this.provinceName = str;
    }

    public String getCityName() {
        return this.cityName;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setCityName(String str) {
        this.cityName = str;
    }

    public String getAreaName() {
        return this.areaName;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setAreaName(String str) {
        this.areaName = str;
    }

    public String getTownName() {
        return this.townName;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setTownName(String str) {
        this.townName = str;
    }

    public String getAddress() {
        return this.address;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setAddress(String str) {
        this.address = str;
    }

    public String getAcookie() {
        return this.acookie;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setAcookie(String str) {
        this.acookie = str;
    }

    public String getPreviewParam() {
        return this.previewParam;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setPreviewParam(String str) {
        this.previewParam = str;
    }

    public String getEdition() {
        return this.edition;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setEdition(String str) {
        this.edition = str;
    }

    public String getGatewayVersion() {
        return this.gatewayVersion;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setGatewayVersion(String str) {
        this.gatewayVersion = str;
    }

    public String getEncryptUserId() {
        return this.encryptUserId;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setEncryptUserId(String str) {
        this.encryptUserId = str;
    }

    public long getPoiRefreshTime() {
        return this.poiRefreshTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setPoiRefreshTime(long j) {
        this.poiRefreshTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.request.IRequestParams
    public void setContainerParams(Map<String, AwesomeGetContainerParams> map) {
        this.containerParams = this.containerParams;
    }

    public Map<String, AwesomeGetContainerParams> getContainerParams() {
        return this.containerParams;
    }
}
