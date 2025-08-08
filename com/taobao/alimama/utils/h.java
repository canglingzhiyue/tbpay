package com.taobao.alimama.utils;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.anim.AnimConstance;
import com.taobao.taopai.business.util.y;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1637495920);
    }

    public static String a(String str, List<String> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("158dcde", new Object[]{str, list, map});
        }
        if (StringUtils.isEmpty(str)) {
            return "tracking_json_null";
        }
        String str2 = null;
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString(AnimConstance.VIEW_ANIM_KEY_URLS);
            if (!StringUtils.isEmpty(string)) {
                list.addAll(JSONObject.parseArray(string, String.class));
            }
            String string2 = parseObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
            String string3 = parseObject.getString("creative_type");
            String string4 = parseObject.getString(y.TEMPLATE_ID);
            String string5 = parseObject.getString("event_type");
            String string6 = parseObject.getString("session_id");
            map.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, string2);
            map.put("creative_type", string3);
            map.put(y.TEMPLATE_ID, string4);
            map.put("event_type", string5);
            map.put("session_id", string6);
            if (list.size() <= 0) {
                str2 = "exposure_urlList_empty";
            }
            if (!StringUtils.isEmpty(string2) && !StringUtils.isEmpty(string3) && !StringUtils.isEmpty(string4) && !StringUtils.isEmpty(string5)) {
                if (!StringUtils.isEmpty(string6)) {
                    return str2;
                }
            }
            return "exposure_param_empty";
        } catch (Exception e) {
            return Uri.encode(e.getMessage());
        }
    }
}
