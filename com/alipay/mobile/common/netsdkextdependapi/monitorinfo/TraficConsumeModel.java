package com.alipay.mobile.common.netsdkextdependapi.monitorinfo;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.apache.http.Header;

/* loaded from: classes3.dex */
public class TraficConsumeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DATA_FLOW_TYPE_AMNET_SYNC = 6;
    public static final int DATA_FLOW_TYPE_HTTPCLIENT_DJANGO = 2;
    public static final int DATA_FLOW_TYPE_HTTPCLIENT_DOWNLOAD = 4;
    public static final int DATA_FLOW_TYPE_HTTPCLIENT_H5 = 1;
    public static final int DATA_FLOW_TYPE_HTTPCLIENT_MDAP = 5;
    public static final int DATA_FLOW_TYPE_HTTPCLIENT_NBNET = 3;
    public static final int DATA_FLOW_TYPE_HTTPCLIENT_RPC = 0;
    public static final int DATA_FLOW_TYPE_UNKNOWN = -1;
    public String bizId;
    public String bundle;
    public int dataFlowType = -1;
    public String diagnose;
    public Map<String, String> extParams;
    public String fileId;
    public boolean isUpload;
    public Map<String, String> params;
    public Header[] reqHeaders;
    public long reqSize;
    public Header[] respHeaders;
    public long respSize;
    public String url;

    public static TraficConsumeModel obtain(int i, String str, long j, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TraficConsumeModel) ipChange.ipc$dispatch("feb8ca12", new Object[]{new Integer(i), str, new Long(j), new Long(j2), str2});
        }
        TraficConsumeModel traficConsumeModel = new TraficConsumeModel();
        traficConsumeModel.dataFlowType = i;
        traficConsumeModel.url = str;
        traficConsumeModel.reqSize = j;
        traficConsumeModel.respSize = j2;
        traficConsumeModel.diagnose = str2;
        return traficConsumeModel;
    }
}
