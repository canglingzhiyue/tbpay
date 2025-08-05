package com.taobao.ugc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import tb.jmq;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u001a&\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¨\u0006\u000b"}, d2 = {"commitError", "", "errorMsg", "", "errorCode", "errorInfo", "extraMaps", "", "commitInfo", "actionInfo", "infoMap", "taobao_rate_sdk_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1970648020);
    }

    public static /* synthetic */ void a(String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc09619", new Object[]{str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        a(str, str2, str3);
    }

    public static final void a(String errorMsg, String errorCode, String errorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{errorMsg, errorCode, errorInfo});
            return;
        }
        kotlin.jvm.internal.q.d(errorMsg, "errorMsg");
        kotlin.jvm.internal.q.d(errorCode, "errorCode");
        kotlin.jvm.internal.q.d(errorInfo, "errorInfo");
        a(errorMsg, errorCode, errorInfo, null);
    }

    public static final void a(String errorMsg, String errorCode, String errorInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{errorMsg, errorCode, errorInfo, map});
            return;
        }
        kotlin.jvm.internal.q.d(errorMsg, "errorMsg");
        kotlin.jvm.internal.q.d(errorCode, "errorCode");
        kotlin.jvm.internal.q.d(errorInfo, "errorInfo");
        Map b = ai.b(j.a("umi_pub_session", x.INSTANCE.a()), j.a("umimonitor_error_msg", errorMsg), j.a("umimonitor_error_code", errorCode), j.a("umimonitor_info_node", errorInfo));
        if (map != null) {
            b.putAll(map);
        }
        String[] a2 = n.a(b);
        jmq.d().a(UmiPublishMonitor.UT_PAGE_NAME, 19999, "RatePublishFullChainMonitor_error", "x_rate", null, (String[]) Arrays.copyOf(a2, a2.length));
    }

    public static final void a(String actionInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{actionInfo, map});
            return;
        }
        kotlin.jvm.internal.q.d(actionInfo, "actionInfo");
        Map b = ai.b(j.a("umi_pub_session", x.INSTANCE.a()), j.a("umimonitor_info_node", actionInfo));
        if (map != null) {
            b.putAll(map);
        }
        String[] a2 = n.a(b);
        jmq.d().a(UmiPublishMonitor.UT_PAGE_NAME, 19999, "RatePublishFullChainMonitor_info", "x_rate", null, (String[]) Arrays.copyOf(a2, a2.length));
    }
}
