package com.alipay.android.phone.iifaa.did.rpc.model;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.model.VCFilter;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.ifh;

/* loaded from: classes3.dex */
public class ServiceProviderModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String algorithm;
    public String banner;
    public String challenge;
    public String icon;
    public String isNeedAudited;
    public String isPush;
    public String jumpMethod;
    public String jumpType;
    public String name;
    public String publicKey;
    public String scene;
    public String securityLevel;
    public String spVmId;
    public String spdid;
    public List<VCFilter> vcFilterList;
    public String vmType;
    public List<String> vpTpList;
    public String vpType;

    public static boolean isValid(ServiceProviderModel serviceProviderModel) {
        List<VCFilter> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5812ce68", new Object[]{serviceProviderModel})).booleanValue();
        }
        if (serviceProviderModel != null && !ifh.a(serviceProviderModel.spVmId, serviceProviderModel.securityLevel, serviceProviderModel.spdid, serviceProviderModel.publicKey) && (list = serviceProviderModel.vcFilterList) != null && list.size() != 0) {
            try {
                serviceProviderModel.vpTpList = JSONObject.parseArray(serviceProviderModel.vpType, String.class);
                List<VCFilter> list2 = serviceProviderModel.vcFilterList;
                if (list2 != null && list2.size() > 0) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
