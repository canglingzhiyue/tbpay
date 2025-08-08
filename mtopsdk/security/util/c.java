package mtopsdk.security.util;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import org.json.JSONArray;
import tb.kge;
import tb.ryy;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f25027a;
    private static AtomicBoolean b;
    private static Boolean c;
    private static Set<String> d;
    private static final Set<String> e;
    private static final Set<String> f;

    static {
        kge.a(-1409565301);
        f25027a = null;
        d = null;
        c = null;
        b = new AtomicBoolean(false);
        e = new HashSet();
        f = new HashSet();
        e.add("mtop.ovs.setting.country.lang.get$1.0");
        f.add("mtop.taobao.wireless.home.newface.awesome.newget$1.0");
        f.add("mtop.taobao.wireless.home.newface.stream.newget$1.0");
    }

    public static boolean a(mtopsdk.framework.domain.a aVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ed0197", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || aVar.g.isSignDegradedRetry) {
            return false;
        }
        if (e.contains(aVar.b.getKey())) {
            return true;
        }
        Set<String> set = f25027a;
        if (set != null) {
            return set.contains(aVar.b.getKey());
        }
        try {
            a();
            if (SwitchConfig.getInstance().signDegradedApiSet != null) {
                z2 = SwitchConfig.getInstance().signDegradedApiSet.contains("*") ? true : SwitchConfig.getInstance().signDegradedApiSet.contains(aVar.b.getKey());
            } else {
                z2 = false;
            }
            try {
                if (SwitchConfig.getInstance().isEnableSignDegraded() && z2) {
                    z3 = true;
                }
                if (z3) {
                    return true;
                }
                try {
                    b();
                    if (SwitchConfig.getInstance().signDegradedApiSet2 != null) {
                        for (ryy ryyVar : SwitchConfig.getInstance().signDegradedApiSet2) {
                            if (SwitchConfig.getInstance().isABGlobalFeatureOpened(aVar.f25000a.getMtopConfig().context, StringUtils.isEmpty(ryyVar.a()) ? SwitchConfig.AB_SIGN_DEGRADED : "mtop_sign_degraded_" + ryyVar.a()) && (ryyVar.a("*") || ryyVar.a(aVar.b.getKey()))) {
                                return true;
                            }
                        }
                    }
                    return z3;
                } catch (Throwable th) {
                    th = th;
                    z = z3;
                    TBSdkLog.e("mtopsdk.SignDegradedUtils", aVar.h, "[isSignDegraded] error " + th);
                    return z;
                }
            } catch (Throwable th2) {
                z = z2;
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (SwitchConfig.getInstance().signDegradedApiSet != null || !StringUtils.isNotBlank(RemoteConfig.getInstance().signDegradedApiList)) {
        } else {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().signDegradedApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().signDegradedApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseSignDegradedList]parse and update signDegradedApiList error.", th);
            }
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i("mtopsdk.SignDegradedUtils", "[parseSignDegradedList]parse and update signDegradedApiList succeed");
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (SwitchConfig.getInstance().signDegradedApiSet2 == null && StringUtils.isNotBlank(RemoteConfig.getInstance().signDegradedApiList2)) {
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray(RemoteConfig.getInstance().signDegradedApiList2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(ryy.a(jSONArray.getJSONObject(i)));
                }
                SwitchConfig.getInstance().signDegradedApiSet2 = new HashSet(arrayList);
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseSignDegradedList2]parse and update signDegradedApiList2 error.", th);
            }
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i("mtopsdk.SignDegradedUtils", "[parseSignDegradedList2]parse and update signDegradedApiList2 succeed");
        }
    }

    public static void a(Context context) {
        com.alibaba.fastjson.JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (b.compareAndSet(false, true) && SwitchConfig.getInstance().isSimpleLinkEnable(context)) {
            f25027a = new HashSet();
            if (SwitchConfig.getInstance().isABGlobalFeatureOpened(context, SwitchConfig.AB_SIGN_DEGRADED) && StringUtils.isNotBlank(RemoteConfig.getInstance().signDegradedApiList)) {
                try {
                    f25027a.addAll(JSON.parseArray(RemoteConfig.getInstance().signDegradedApiList, String.class));
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseSignDegradedList]parse and update signDegradedApiList error.", th);
                }
            }
            if (StringUtils.isNotBlank(RemoteConfig.getInstance().signDegradedApiList2)) {
                try {
                    com.alibaba.fastjson.JSONArray parseArray = JSON.parseArray(RemoteConfig.getInstance().signDegradedApiList2);
                    for (int i = 0; i < parseArray.size(); i++) {
                        JSONObject jSONObject = parseArray.getJSONObject(i);
                        String string = jSONObject.getString("ab");
                        if (!StringUtils.isEmpty(string)) {
                            if (SwitchConfig.getInstance().isABGlobalFeatureOpened(context, "mtop_sign_degraded_" + string) && (jSONArray = jSONObject.getJSONArray("api")) != null && jSONArray.size() > 0) {
                                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                    String string2 = jSONArray.getString(i2);
                                    if (!StringUtils.isEmpty(string2)) {
                                        f25027a.add(string2);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseSignDegradedList2]parse and update signDegradedApiList2 error.", th2);
                }
            }
            d = new HashSet();
            if (StringUtils.isNotBlank(RemoteConfig.getInstance().cookieDisableApiList)) {
                try {
                    d.addAll(JSON.parseArray(RemoteConfig.getInstance().cookieDisableApiList, String.class));
                } catch (Throwable th3) {
                    TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseCookieDisableList]parse and update cookieDisableList error.", th3);
                }
            }
            TBSdkLog.e("mtopsdk.SignDegradedUtils", "[initSignDegradedList]signDegradedList=" + f25027a + ", cookieDisableList=" + d);
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (c == null) {
            c = new Boolean(SwitchConfig.getInstance().isABGlobalFeatureOpened(context, "Home_Page_SecondRefreshOpt"));
        }
        if (!c.booleanValue() || StringUtils.isEmpty(str)) {
            return false;
        }
        Set<String> set = d;
        if (set == null) {
            return f.contains(str);
        }
        return set.contains(str);
    }
}
