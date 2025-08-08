package com.taobao.android.msoa.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98cb8082", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("serviceId", str);
        }
        if (!StringUtils.isEmpty(str2)) {
            hashMap.put("version", str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            hashMap.put("bizName", str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            hashMap.put(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, str4);
        }
        if (!StringUtils.isEmpty(str5)) {
            hashMap.put("token", str5);
        }
        if (!StringUtils.isEmpty(str6)) {
            hashMap.put("cost", str6);
        }
        if (!StringUtils.isEmpty(str7)) {
            hashMap.put("errorCode", str7);
        }
        if (!StringUtils.isEmpty(str8)) {
            hashMap.put("errorMsg", str8);
        }
        TBS.Ext.commitEvent(2201, str9, (Object) null, (Object) null, a(hashMap));
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return UTDevice.getUtdid(Globals.getApplication()) + ":" + str + ":" + System.currentTimeMillis();
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append("=");
            sb.append(map.get(str));
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
