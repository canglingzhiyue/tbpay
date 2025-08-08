package com.taobao.android.purchase.core.utils;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.dui;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CREATE_ORDER = "tao_purchase_create_request_page_data";
    public static final String ENTER_ORDER = "tao_purchase_request_page_data";
    public static final String PAGE_THROTTLING = "Page_ConfirmOrder";
    public static final String SUBMIT_ORDER = "tao_purchase_submit_order";

    static {
        kge.a(-1531622948);
    }

    public static Map<String, String> a(Context context, Intent intent) {
        Map<String, String> a2;
        String sb;
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3241e792", new Object[]{context, intent});
        }
        if (intent == null || (a2 = dui.a(context, intent)) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int b = dui.b(intent);
        if (b == 1) {
            String str2 = a2.get("buyParam");
            String str3 = a2.get("cartIds");
            if (StringUtils.isEmpty(str2) || "null".equalsIgnoreCase(str2)) {
                if (!StringUtils.isEmpty(str3) && !"null".equalsIgnoreCase(str3)) {
                    String[] split = str3.split(",");
                    StringBuilder sb2 = new StringBuilder("");
                    if (split != null && split.length > 0) {
                        int length = split.length;
                        while (i < length) {
                            sb2.append(split[i]);
                            if (i != length - 1) {
                                sb2.append("$");
                            }
                            i++;
                        }
                    }
                    hashMap.put("type", "3");
                    sb = sb2.toString();
                    str = "cartId";
                }
                return hashMap;
            }
            String[] split2 = str2.split(",");
            StringBuilder sb3 = new StringBuilder("");
            if (split2 != null && split2.length > 0) {
                int length2 = split2.length;
                while (i < length2) {
                    sb3.append(split2[i]);
                    if (i != length2 - 1) {
                        sb3.append("$");
                    }
                    i++;
                }
            }
            hashMap.put("type", "2");
            sb = sb3.toString();
            str = "settlement";
        } else if (b != 2) {
            sb = intent.getDataString();
            if (StringUtils.isEmpty(sb)) {
                sb = "null";
            }
            hashMap.put("type", "4");
            str = "url";
        } else {
            String str4 = a2.get("itemId");
            String str5 = a2.get("skuId");
            if (StringUtils.isEmpty(str4) || "null".equalsIgnoreCase(str4)) {
                str4 = "0";
            }
            if (StringUtils.isEmpty(str5) || "null".equalsIgnoreCase(str5)) {
                str5 = "0";
            }
            hashMap.put("type", "1");
            sb = str4 + "|" + str5;
            str = "info";
        }
        hashMap.put(str, sb);
        return hashMap;
    }
}
