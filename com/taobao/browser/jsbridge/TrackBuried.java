package com.taobao.browser.jsbridge;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.kge;

/* loaded from: classes6.dex */
public class TrackBuried {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION = "action";
    private static final String KEY_BDID = "bdid";
    public static final String KEY_CARRIER = "carrier_id";
    private static final String KEY_LIST_PARAM = "list_param";
    private static final String KEY_LIST_TYPE = "list_type";
    public static final String KEY_OBJECT_ID = "object_id";
    public static final String KEY_OBJECT_TYPE = "object_type";
    public static String bdid;
    public static String carrier;
    private static Map<String, String> effectMap;
    public static String list_CurPage;
    public static String list_PageType;
    public static String list_Param;
    public static String list_Type;
    public static String[] list_TypeArr;
    public static String list_refer;

    static {
        kge.a(-1705565007);
        list_PageType = "";
        list_refer = "";
        list_CurPage = "";
        list_Param = "";
        bdid = "";
        carrier = "";
        list_Type = "";
        list_TypeArr = new String[]{"activity", "search"};
    }

    public static void effectCtrlClick(CT ct, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56f2db0", new Object[]{ct, str, map});
            return;
        }
        if (map != null) {
            map.putAll(geteffectNormalMap());
        } else {
            map = geteffectNormalMap();
        }
        ctrlClick(ct, str, map);
    }

    public static void ctrlClick(CT ct, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac5fc81", new Object[]{ct, str, map});
            return;
        }
        String str2 = "";
        for (String str3 : map.keySet()) {
            String str4 = map.get(str3);
            if (!StringUtils.isEmpty(str4)) {
                str2 = str2 + str3 + "=" + str4 + ",";
            }
        }
        if (!StringUtils.isEmpty(str2)) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        String str5 = "TrackBuried args:" + str2;
        TBS.Adv.ctrlClicked(ct, str, str2);
    }

    private static Map<String, String> geteffectNormalMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2cdf8d4a", new Object[0]);
        }
        if (effectMap == null) {
            effectMap = new HashMap();
        }
        effectMap.put("list_param", list_Param);
        effectMap.put("list_type", list_Type);
        effectMap.put("bdid", bdid);
        effectMap.put("carrier_id", carrier);
        return effectMap;
    }

    public static void effectupdatePageProperties(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594098f8", new Object[]{str, map});
            return;
        }
        if (map != null) {
            map.putAll(geteffectNormalMap());
        } else {
            map = geteffectNormalMap();
        }
        Properties properties = new Properties();
        for (String str2 : map.keySet()) {
            if (!StringUtils.isEmpty(map.get(str2))) {
                properties.put(str2, map.get(str2));
            }
        }
        String str3 = "argsMap ：" + map.toString();
        TBS.Page.updatePageProperties(str, properties);
    }

    public static boolean needEffectParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("561f5891", new Object[0])).booleanValue() : !StringUtils.isEmpty(list_Type) || !StringUtils.isEmpty(carrier);
    }
}
