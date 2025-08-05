package com.taobao.linkmanager.afc.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import java.util.Map;
import tb.kge;
import tb.koe;

/* loaded from: classes7.dex */
public abstract class TBLinkRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARRIVE_DATA_API = "mtop.taobao.afc.arrivedata.report";
    public static final String LOGIN_REPORT = "mtop.taobao.growth.afc.linkInfo.reportLogin";
    public static final String REDUCTION_LOGIN_API = "mtop.taobao.afc.reductionAndLogin";
    public static final String SMART_LINK_API = "mtop.taobao.baichuan.intelligent.call.query";
    public static final String VERSION = "1.0";
    private static TBLinkRequest instance;

    static {
        kge.a(-903026425);
    }

    public abstract void sendRequest(String str, String str2, Map<String, String> map, boolean z, koe koeVar);

    public static synchronized TBLinkRequest getInstance() {
        synchronized (TBLinkRequest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLinkRequest) ipChange.ipc$dispatch("db96300c", new Object[0]);
            } else if (instance != null) {
                return instance;
            } else {
                try {
                    Class.forName("mtopsdk.mtop.domain.MtopRequest");
                    instance = new a();
                } catch (ClassNotFoundException unused) {
                }
                c.a("linkx", "TBRequest === getInstance === 生成TBRequest实例");
                return instance;
            }
        }
    }

    private static final String getRequestId(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71169801", new Object[]{str, new Long(j)});
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("&&");
        sb.append(j);
        sb.append("&&_$#%151Safe");
        return AfcUtils.a(sb.toString());
    }

    public void addCheckParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4071db1", new Object[]{this, map});
            return;
        }
        String str = map.get("appKey");
        if (str == null) {
            str = map.get("appkey");
        }
        long currentTimeMillis = System.currentTimeMillis();
        map.put("t", String.valueOf(currentTimeMillis));
        map.put(e.REQUEST_ID, getRequestId(str, currentTimeMillis));
    }
}
