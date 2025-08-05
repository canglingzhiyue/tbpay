package com.taobao.infoflow.protocol.model.datamodel.request;

import com.taobao.infoflow.protocol.model.datamodel.request.IContainerParams;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IRequestParams<CP extends IContainerParams> extends Serializable {
    void setAcookie(String str);

    void setAddress(String str);

    void setApiName(String str);

    void setAreaCode(String str);

    void setAreaName(String str);

    void setCityCode(String str);

    void setCityName(String str);

    void setContainerParams(Map<String, CP> map);

    void setCountryCode(String str);

    void setCountryName(String str);

    void setEdition(String str);

    void setEncryptUserId(String str);

    void setGatewayVersion(String str);

    void setLatitude(String str);

    void setLongitude(String str);

    void setNick(String str);

    void setPoiRefreshTime(long j);

    void setPreviewParam(String str);

    void setProvinceCode(String str);

    void setProvinceName(String str);

    void setTownName(String str);

    void setUserId(String str);

    void setUtdid(String str);

    void setVersion(String str);
}
