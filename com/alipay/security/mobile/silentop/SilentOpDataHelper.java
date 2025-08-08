package com.alipay.security.mobile.silentop;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SilentOpDataHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CMD_KM_FP_UPDATE = "km_update";
    public static final String CMD_SILENT_REG_IFAA = "ifaa_v2_register";
    public static final String CMD_SILENT_REG_KM = "register";
    private static SilentOpDataHelper instance;
    private SilentOpModel model;

    private SilentOpDataHelper() {
    }

    public static synchronized SilentOpDataHelper getInstance() {
        synchronized (SilentOpDataHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SilentOpDataHelper) ipChange.ipc$dispatch("dc7adca1", new Object[0]);
            }
            if (instance == null) {
                instance = new SilentOpDataHelper();
            }
            return instance;
        }
    }

    public boolean initData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e007bef", new Object[]{this, str})).booleanValue();
        }
        restore();
        return parseBicAsyncData(str);
    }

    private void restore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13986015", new Object[]{this});
        } else {
            this.model = null;
        }
    }

    private boolean parseBicAsyncData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b0efd2", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        this.model = (SilentOpModel) JSON.parseObject(str, SilentOpModel.class);
        return this.model != null;
    }

    public String getBizID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffe2fe41", new Object[]{this});
        }
        SilentOpModel silentOpModel = this.model;
        if (silentOpModel != null) {
            return silentOpModel.bizId;
        }
        return null;
    }

    public String getBizData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c78d2232", new Object[]{this});
        }
        SilentOpModel silentOpModel = this.model;
        if (silentOpModel != null) {
            return silentOpModel.bizData;
        }
        return null;
    }

    public String getRegInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79d7bf4d", new Object[]{this});
        }
        SilentOpModel silentOpModel = this.model;
        if (silentOpModel == null) {
            return null;
        }
        if ("register".equals(silentOpModel.action)) {
            return this.model.bizData;
        }
        if (CMD_SILENT_REG_IFAA.equals(this.model.action)) {
            JSONObject parseObject = JSON.parseObject(this.model.bizData);
            if (parseObject.containsKey("registerData")) {
                return parseObject.getString("registerData");
            }
        }
        return null;
    }

    public String getDeregInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7eb02ace", new Object[]{this});
        }
        SilentOpModel silentOpModel = this.model;
        if (silentOpModel == null || !CMD_SILENT_REG_IFAA.equals(silentOpModel.action)) {
            return null;
        }
        JSONObject parseObject = JSON.parseObject(this.model.bizData);
        if (!parseObject.containsKey("closeData")) {
            return null;
        }
        return parseObject.getString("closeData");
    }

    public String getOpCmd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09980f6", new Object[]{this});
        }
        SilentOpModel silentOpModel = this.model;
        if (silentOpModel != null) {
            return silentOpModel.action;
        }
        return null;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        SilentOpModel silentOpModel = this.model;
        if (silentOpModel != null) {
            return silentOpModel.isUsable;
        }
        return false;
    }

    public String getProtocolType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc11e791", new Object[]{this});
        }
        SilentOpModel silentOpModel = this.model;
        return (silentOpModel == null || silentOpModel.ifaaProductInfoData == null) ? "" : this.model.ifaaProductInfoData.protocolType;
    }

    public IfaaProductInfoData getProductInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfaaProductInfoData) ipChange.ipc$dispatch("d6d360d9", new Object[]{this});
        }
        SilentOpModel silentOpModel = this.model;
        if (silentOpModel != null) {
            return silentOpModel.ifaaProductInfoData;
        }
        return null;
    }
}
