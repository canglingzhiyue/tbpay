package com.taobao.browser.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.TrackBuried;
import java.util.HashMap;
import java.util.Properties;
import tb.kge;

/* loaded from: classes6.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(917091734);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        String[] split = str2.split("#");
        int length = split.length;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        while (i < length) {
            Uri parse = Uri.parse(split[i]);
            if (parse != null && parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("locate");
                if (!TextUtils.isEmpty(queryParameter)) {
                    str6 = queryParameter;
                }
                String queryParameter2 = parse.getQueryParameter("actparam");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    str4 = queryParameter2;
                }
                String queryParameter3 = parse.getQueryParameter("list_param");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    str5 = queryParameter3;
                }
                String queryParameter4 = parse.getQueryParameter("carrier_id");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    str7 = queryParameter4;
                }
                if (str4 != null || str5 != null) {
                    if (!TextUtils.isEmpty(str4)) {
                        TrackBuried.list_Type = TrackBuried.list_TypeArr[c];
                        TrackBuried.list_Param = str4;
                        Properties properties = new Properties();
                        if (!TextUtils.isEmpty(str6)) {
                            TrackBuried.list_Param += "_" + str6;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            properties.put("url", str3);
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            properties.put("carrier_id", str7);
                            TrackBuried.carrier = str7;
                        }
                        TBS.Page.updatePageProperties(str, properties);
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", "kpv");
                        TrackBuried.effectupdatePageProperties(str, hashMap);
                    } else if (!TextUtils.isEmpty(str5)) {
                        TrackBuried.list_Type = TrackBuried.list_TypeArr[0];
                        TrackBuried.list_Param = str5;
                        Properties properties2 = new Properties();
                        if (!TextUtils.isEmpty(str3)) {
                            properties2.put("url", str3);
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            properties2.put("carrier_id", str7);
                            TrackBuried.carrier = str7;
                        }
                        TBS.Page.updatePageProperties(str, properties2);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("action", "kpv");
                        TrackBuried.effectupdatePageProperties(str, hashMap2);
                        i++;
                        c = 0;
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    public static void a(Activity activity, String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c9038b", new Object[]{activity, str, str2, intent});
            return;
        }
        TBS.Page.create(str, "Webview");
        Uri parse = Uri.parse(str2);
        String stringExtra = intent.getStringExtra("sellerId");
        if (!TextUtils.isEmpty(stringExtra)) {
            Properties properties = new Properties();
            properties.put("seller_id", stringExtra);
            TBS.Page.updatePageProperties(str, properties);
        }
        if (parse != null && parse.isHierarchical()) {
            String queryParameter = parse.getQueryParameter("carrier_id");
            if (!TextUtils.isEmpty(queryParameter)) {
                TrackBuried.carrier = queryParameter;
            }
        }
        Properties properties2 = new Properties();
        properties2.put("url", str2);
        TBS.EasyTrace.updateEasyTraceActivityProperties(activity, properties2);
    }
}
