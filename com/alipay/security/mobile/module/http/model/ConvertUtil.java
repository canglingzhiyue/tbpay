package com.alipay.security.mobile.module.http.model;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.cjw;
import tb.rrv;

/* loaded from: classes3.dex */
public class ConvertUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static DeviceDataReponseModel convertFrom(DataReportResult dataReportResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceDataReponseModel) ipChange.ipc$dispatch("458497b", new Object[]{dataReportResult});
        }
        DeviceDataReponseModel deviceDataReponseModel = new DeviceDataReponseModel();
        if (dataReportResult == null) {
            return null;
        }
        deviceDataReponseModel.success = dataReportResult.success;
        deviceDataReponseModel.resultCode = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            deviceDataReponseModel.apdid = map.get("apdid");
            deviceDataReponseModel.token = map.get(rrv.APDIDTOKEN);
            deviceDataReponseModel.dynamicKey = map.get("dynamicKey");
            deviceDataReponseModel.timeInterval = map.get("timeInterval");
            deviceDataReponseModel.webrtcUrl = map.get("webrtcUrl");
            deviceDataReponseModel.lastTimeApdidGenerated = "";
            String str = map.get("drmSwitch");
            if (cjw.b(str)) {
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.charAt(0));
                    deviceDataReponseModel.bugTrackSwitch = sb.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(2));
                    deviceDataReponseModel.agentSwitch = sb2.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                deviceDataReponseModel.apseDegrade = map.get("apse_degrade");
            }
            if (map.containsKey("collectConfig")) {
                deviceDataReponseModel.collectConfig = map.get("collectConfig");
            }
        }
        return deviceDataReponseModel;
    }

    public static DataReportRequest convertFrom(DeviceDataRequestModel deviceDataRequestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataReportRequest) ipChange.ipc$dispatch("ded5d90e", new Object[]{deviceDataRequestModel});
        }
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (deviceDataRequestModel == null) {
            return null;
        }
        dataReportRequest.os = deviceDataRequestModel.os;
        dataReportRequest.rpcVersion = deviceDataRequestModel.rpcVersion;
        dataReportRequest.bizType = (deviceDataRequestModel.bizType == null || "".equals(deviceDataRequestModel.bizType)) ? "1" : deviceDataRequestModel.bizType;
        dataReportRequest.bizData = new HashMap();
        dataReportRequest.bizData.put("apdid", deviceDataRequestModel.apdid);
        dataReportRequest.bizData.put(rrv.APDIDTOKEN, deviceDataRequestModel.token);
        dataReportRequest.bizData.put("umidToken", deviceDataRequestModel.umidToken);
        dataReportRequest.bizData.put("dynamicKey", deviceDataRequestModel.dynamicKey);
        dataReportRequest.deviceData = deviceDataRequestModel.dataMap;
        return dataReportRequest;
    }
}
