package com.taobao.linkmanager.flowout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.flowout.data.FloutIdListBean;
import com.taobao.linkmanager.flowout.data.FloutWhiteListBean;
import com.taobao.linkmanager.flowout.data.FlowOutConfigData;
import com.taobao.tao.Globals;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, String> f17709a;

    static {
        kge.a(2024394767);
        f17709a = new HashMap<>();
    }

    public static boolean a(String str, String str2, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9adff8a4", new Object[]{str, str2, flowOutConfigData})).booleanValue();
        }
        if (flowOutConfigData == null || StringUtils.isEmpty(str2)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === isPackageNameInFlowIdList === 外跳配置或者floutId为空");
            return false;
        }
        List<FloutIdListBean> list = flowOutConfigData.floutIdList;
        if (list != null && list.size() != 0) {
            for (FloutIdListBean floutIdListBean : list) {
                if (StringUtils.equals(floutIdListBean.floutId, str2)) {
                    if (floutIdListBean.packageNames == null) {
                        return false;
                    }
                    for (String str3 : floutIdListBean.packageNames) {
                        if (StringUtils.equals(str3, str) && a(floutIdListBean)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private static boolean a(FloutIdListBean floutIdListBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("591e62f3", new Object[]{floutIdListBean})).booleanValue();
        }
        if (floutIdListBean == null) {
            return false;
        }
        return floutIdListBean.validDate < 0 || ((long) floutIdListBean.validDate) > AfcUtils.a();
    }

    public static String a(FlowOutConfigData flowOutConfigData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4a0b62", new Object[]{flowOutConfigData, str});
        }
        if (flowOutConfigData != null && !StringUtils.isEmpty(str)) {
            return b(flowOutConfigData, str) ? f17709a.get(str) : "";
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === getAppPackageName === 外跳配置或者mScheme为空");
        return "";
    }

    public static boolean b(FlowOutConfigData flowOutConfigData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc9016a1", new Object[]{flowOutConfigData, str})).booleanValue();
        }
        if (flowOutConfigData == null || StringUtils.isEmpty(str)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === isInWhiteList === 外跳配置或者mScheme为空");
            return false;
        } else if (!StringUtils.isEmpty(f17709a.get(str))) {
            return true;
        } else {
            List<FloutWhiteListBean> list = flowOutConfigData.floutWhiteList;
            if (list != null && list.size() != 0) {
                for (FloutWhiteListBean floutWhiteListBean : list) {
                    if (floutWhiteListBean.schemes != null && floutWhiteListBean.schemes.length > 0) {
                        for (String str2 : floutWhiteListBean.schemes) {
                            if (StringUtils.equals(str2, str)) {
                                f17709a.put(str, floutWhiteListBean.packageName);
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }
    }

    public static boolean a(Intent intent, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ce53fdb", new Object[]{intent, flowOutConfigData})).booleanValue();
        }
        if (flowOutConfigData == null || intent == null) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === isSystemActionOrAndroidActions === 外跳配置或者mScheme为空");
            return false;
        }
        String scheme = intent.getScheme();
        String action = intent.getAction();
        String[] strArr = flowOutConfigData.systemActions;
        String[] strArr2 = flowOutConfigData.androidActions;
        if (!StringUtils.isEmpty(action) && strArr2 != null && strArr2.length > 0) {
            for (String str : strArr2) {
                if (StringUtils.equals(action, str)) {
                    return true;
                }
            }
        }
        if (!StringUtils.isEmpty(scheme) && strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                if (StringUtils.equals(scheme, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a(String str, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cacd48b6", new Object[]{str, flowOutConfigData});
        }
        if (flowOutConfigData == null || StringUtils.isEmpty(str)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === getAppLink === 外跳配置或者packageName为空");
            return "";
        }
        List<FloutWhiteListBean> list = flowOutConfigData.floutWhiteList;
        if (list != null && list.size() != 0) {
            for (FloutWhiteListBean floutWhiteListBean : list) {
                if (StringUtils.equals(str, floutWhiteListBean.packageName)) {
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === getAppLink === 获取到的AppLink:" + floutWhiteListBean.link);
                    return floutWhiteListBean.link;
                }
            }
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === getAppLink === 获取到的AppLink为空");
        }
        return "";
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === formateUrl === linkUrl或者URL为空");
            return "";
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === formateUrl === linkUrl：" + str + "  url=" + str2);
        Matcher matcher = Pattern.compile("\\$\\{(.*?)\\}").matcher(str);
        while (matcher.find()) {
            String group = matcher.group(0);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === formateUrl === originalKey：" + group);
            if (StringUtils.equals("${url}", group)) {
                if (!StringUtils.isEmpty(str)) {
                    str = str.replace(group, a(str2));
                } else {
                    str = str.replace(group, "");
                }
            } else if (StringUtils.equals("${backUrl}", group)) {
                str = str.replace("${backUrl}", a("tbopen://"));
            } else if (group.length() >= 3) {
                String substring = group.substring(2, group.length() - 1);
                if (StringUtils.isEmpty(substring)) {
                    str = str.replace(group, "");
                } else {
                    if (substring.contains("#")) {
                        substring = substring.substring(1, substring.length() - 1);
                    }
                    if (StringUtils.isEmpty(substring)) {
                        str = str.replace(group, "");
                    }
                }
            }
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === formateUrl === 最终的URL：" + str);
        return str;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === urlEncode === 异常" + e);
            return "";
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Nav.from(Globals.getApplication()).toUri(str);
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || context == null) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === startApp === Url或者context为空");
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(805339136);
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === startApp === 打开APP,intent=" + intent);
            return true;
        } catch (Exception e) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === startApp === 打开APP,异常：" + e);
            return false;
        }
    }

    public static boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue();
        }
        if (context == null || intent == null) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === startActivity === intent或者context为空");
            return false;
        }
        try {
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "FlowOutUtils === startActivity 异常：" + th.toString());
            return false;
        }
    }

    public static boolean b(String str, String str2, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b61c083", new Object[]{str, str2, flowOutConfigData})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || flowOutConfigData == null) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === startBrowser === Url或者flowOutConfig为空,返回false");
            return false;
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = a(flowOutConfigData, Uri.parse(str).getScheme());
        }
        if (StringUtils.isEmpty(str2)) {
            return false;
        }
        for (FloutWhiteListBean floutWhiteListBean : flowOutConfigData.floutWhiteList) {
            if (StringUtils.equals(floutWhiteListBean.packageName, str2)) {
                z = floutWhiteListBean.supportAfcLink;
            }
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === isSupportAppLink === 是否支持海关协议:" + z);
        return z;
    }

    public static boolean b(String str, FlowOutConfigData flowOutConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23d3b6cd", new Object[]{str, flowOutConfigData})).booleanValue();
        }
        if (flowOutConfigData == null || StringUtils.isEmpty(str)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === chekFlowOutWhiteList === flowOutConfig或者floutId为空,返回false");
            return false;
        }
        if (flowOutConfigData.floutIdWhiteList != null) {
            for (String str2 : flowOutConfigData.floutIdWhiteList) {
                if (StringUtils.equals(str2, str)) {
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === chekFlowOutWhiteList === 在flowOutId白名单，放过");
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(String str, Intent intent, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701ba82a", new Object[]{str, intent, str2, new Integer(i)});
            return;
        }
        Map<String, String> a2 = a(intent, str2);
        a2.put("freeCode", i + "");
        d.a(19999, str, a2);
    }

    public static void a(Intent intent, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99fc234", new Object[]{intent, str, new Integer(i)});
            return;
        }
        Map<String, String> a2 = a(intent, str);
        a2.put("handleCode", i + "");
        a(d.ARG1_OUTGOING_BLOCKED, a2);
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else {
            d.a(19999, str, map);
        }
    }

    public static Map<String, String> a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("131ebaa4", new Object[]{intent, str});
        }
        Uri data = intent.getData();
        if (StringUtils.isEmpty(str) && data != null) {
            str = a(b.a(), data.getScheme());
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("targetUrl", data != null ? data.toString() : str);
        hashMap.put("packageName", str);
        hashMap.put("isSystemAction", str);
        hashMap.put("data", intent.getDataString() != null ? intent.getDataString() : "unknown");
        return hashMap;
    }

    public static boolean a(Context context, Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd717ceb", new Object[]{context, uri})).booleanValue();
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === tboutJump === uri=" + uri);
        String queryParameter = uri.getQueryParameter("url");
        String queryParameter2 = uri.getQueryParameter(c.DEGTAGE_H5URL);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter(c.MEAN_WHILE, false);
        String queryParameter3 = uri.getQueryParameter("h5Url");
        String queryParameter4 = uri.getQueryParameter("package_name");
        String queryParameter5 = uri.getQueryParameter("spm");
        String queryParameter6 = uri.getQueryParameter(c.LINK_KEY);
        String queryParameter7 = uri.getQueryParameter("failMode");
        if (StringUtils.isEmpty(queryParameter7) || !StringUtils.isDigitsOnly(queryParameter7)) {
            queryParameter7 = "0";
        }
        String queryParameter8 = uri.getQueryParameter(c.FL_OUT_ID);
        if (StringUtils.isEmpty(queryParameter8)) {
            queryParameter8 = uri.getQueryParameter(c.VISA);
        }
        if (!StringUtils.isEmpty(queryParameter5) && !StringUtils.isEmpty(queryParameter2)) {
            queryParameter2 = b(queryParameter5, queryParameter2);
        }
        if (StringUtils.isEmpty(queryParameter3) && !StringUtils.isEmpty(queryParameter4)) {
            queryParameter3 = queryParameter;
        }
        if (StringUtils.equals(c.TMALL, queryParameter6)) {
            str = c.TMALL_PREFIX + a(queryParameter);
        } else {
            if (!StringUtils.isEmpty(queryParameter3)) {
                String a2 = a(queryParameter4, b.a());
                if (!StringUtils.isEmpty(a2)) {
                    str = a(a2, queryParameter3);
                }
            }
            str = queryParameter;
        }
        if (!StringUtils.isEmpty(queryParameter8)) {
            str = TFCCommonUtils.a(str, c.FL_OUT_ID, queryParameter8);
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === tboutJump === 跳转url=" + queryParameter);
        return a(context, str, queryParameter2, booleanQueryParameter, queryParameter7);
    }

    public static boolean a(Context context, String str, final String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9ae9ae", new Object[]{context, str, str2, new Boolean(z), str3})).booleanValue();
        }
        if (z) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === startOut === 打开APP，同时打开降级URL=" + str);
            com.taobao.flowcustoms.afc.utils.d.b.a(new Runnable() { // from class: com.taobao.linkmanager.flowout.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        e.b(str2);
                    }
                }
            });
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === startOut === 打开APP: " + str);
        boolean a2 = a(context, str);
        if (!a2 && !z && (StringUtils.equals(str3, "1") || StringUtils.equals(str3, "2"))) {
            b(str2);
        }
        return a2;
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        Uri parse = Uri.parse(str2);
        if (StringUtils.isEmpty(parse.getQueryParameter("spm"))) {
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.appendQueryParameter("spm", str);
            return buildUpon.toString();
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutUtils === spmTransform === 降级h5Url" + str2);
        return str2;
    }

    public static void a(String str, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5042e193", new Object[]{str, context, intent});
            return;
        }
        intent.putExtra(c.FLOW_OUT_SOURCE, str);
        context.startActivity(intent);
    }

    public static void a(String str, Fragment fragment, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ed6826", new Object[]{str, fragment, intent, new Integer(i)});
            return;
        }
        intent.putExtra(c.FLOW_OUT_SOURCE, str);
        fragment.startActivityForResult(intent, i);
    }

    public static void a(String str, Activity activity, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d021bd62", new Object[]{str, activity, intent, new Integer(i)});
            return;
        }
        intent.putExtra(c.FLOW_OUT_SOURCE, str);
        activity.startActivityForResult(intent, i);
    }
}
