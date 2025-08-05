package com.taobao.wireless.link.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import java.util.Map;
import tb.kge;
import tb.rkg;
import tb.rkj;

/* loaded from: classes9.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSISTANT_API = "mtop.taobao.growth.afc.linkInfo.assistant.equity";
    public static final String DESK_TOP_API = "mtop.taobao.afc.android.desktop";
    public static final String DESK_TOP_COIN_API = "mtop.coingame.farm.task.biz.update";
    public static final String GET_MSG_API = "mtop.taobao.yuntai.doAction";
    public static final String VERSION = "1.0";
    public static final String VERSION_2 = "2.0";
    public static final String WIDGET_DYNAMIC_TOP_API = "mtop.alibaba.mobile.desktop.link.get";
    public static final String WIDGET_TOP_API = "mtop.taobao.growth.starlink.config.get";

    /* renamed from: a  reason: collision with root package name */
    private static a f23603a;

    static {
        kge.a(-1255612646);
    }

    public abstract void a(String str, String str2, Map<String, String> map, boolean z, boolean z2, boolean z3, c cVar);

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b701768", new Object[0]);
            } else if (f23603a != null) {
                return f23603a;
            } else {
                try {
                    Class.forName("mtopsdk.mtop.domain.MtopRequest");
                    f23603a = new b();
                } catch (ClassNotFoundException unused) {
                }
                rkg.a("link_tag", "LinkCommonRequest === TBRequest实例: " + f23603a.toString());
                return f23603a;
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
        return rkj.a(sb.toString());
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
