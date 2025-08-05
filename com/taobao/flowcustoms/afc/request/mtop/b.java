package com.taobao.flowcustoms.afc.request.mtop;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import java.util.Map;
import tb.kge;
import tb.koe;

/* loaded from: classes7.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACK_OPERATION_API = "mtop.taobao.afc.refine.operate";
    public static final String BACK_OPERATION_API_VERSION = "1.0";
    public static final int DEFAULT_OUT_TIME = 5;
    public static final String LINK_INFO_API = "mtop.taobao.baichuan.afc.linkinforapidly";
    public static final String LINK_INFO_API_NEW = "mtop.taobao.afc.linkinfo.get";
    public static final String LINK_INFO_API_NEW_VERSION = "2.0";
    public static final String LINK_INFO_API_VERSION = "1.0";
    public static final String LOCAL_ROUTE_REPORT_API = "mtop.taobao.afc.localRoute.report";
    public static final String LOCAL_ROUTE_REPORT_API_VERSION = "1.0";

    /* renamed from: a  reason: collision with root package name */
    private static b f17183a;

    static {
        kge.a(-1528757441);
    }

    public abstract void a(String str, String str2, Map<String, String> map, boolean z, koe koeVar, Handler handler, int i);

    public static synchronized b a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ae1fecff", new Object[0]);
            } else if (f17183a != null) {
                return f17183a;
            } else {
                try {
                    Class.forName("mtopsdk.mtop.domain.MtopRequest");
                    f17183a = new a();
                } catch (ClassNotFoundException unused) {
                }
                return f17183a;
            }
        }
    }

    private static final String a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d97c20e", new Object[]{str, new Long(j)});
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

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        String str = map.get("appKey");
        if (str == null) {
            str = map.get("appkey");
        }
        long currentTimeMillis = System.currentTimeMillis();
        map.put("t", String.valueOf(currentTimeMillis));
        map.put(e.REQUEST_ID, a(str, currentTimeMillis));
    }
}
