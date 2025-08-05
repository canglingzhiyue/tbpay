package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class hxf implements iac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-331458573);
        kge.a(396300225);
    }

    @Override // tb.iac
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = currentPageName;
        }
        hashMap.put(LogField.PAGE.toString(), str);
        hashMap.put(LogField.EVENTID.toString(), "2101");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2.startsWith(str)) {
            hashMap.put(LogField.ARG1.toString(), str2);
        } else {
            String logField = LogField.ARG1.toString();
            hashMap.put(logField, str + str2);
        }
        hashMap.put("_bmbu", Constants.VAL_YES);
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey("orderId")) {
            map.put("orderId", a());
        }
        hashMap.put(LogField.ARGS.toString(), map.toString());
        UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
    }

    @Override // tb.iac
    public void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, map).build());
        }
    }

    @Override // tb.iac
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(map.get("pageObject"), str);
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            Map<String, String> pageProperties = l.getInstance().getPageProperties("");
            if (pageProperties != null && (pageProperties.get("newOrderId") instanceof String)) {
                return pageProperties.get("newOrderId");
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
