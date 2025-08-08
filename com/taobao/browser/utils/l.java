package com.taobao.browser.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TrackBuried;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1239507261);
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa971818", new Object[]{activity, str, str2, str3});
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
            if (parse == null || !parse.isHierarchical()) {
                strArr = split;
            } else {
                String queryParameter = parse.getQueryParameter("locate");
                if (StringUtils.isEmpty(queryParameter)) {
                    queryParameter = str6;
                }
                String queryParameter2 = parse.getQueryParameter("actparam");
                if (!StringUtils.isEmpty(queryParameter2)) {
                    str4 = queryParameter2;
                }
                String queryParameter3 = parse.getQueryParameter("list_param");
                if (!StringUtils.isEmpty(queryParameter3)) {
                    str5 = queryParameter3;
                }
                String queryParameter4 = parse.getQueryParameter("carrier_id");
                if (!StringUtils.isEmpty(queryParameter4)) {
                    str7 = queryParameter4;
                }
                if (str4 == null && str5 == null) {
                    strArr = split;
                } else {
                    if (!StringUtils.isEmpty(str4)) {
                        TrackBuried.list_Type = TrackBuried.list_TypeArr[c];
                        TrackBuried.list_Param = str4;
                        HashMap hashMap = new HashMap();
                        if (!StringUtils.isEmpty(queryParameter)) {
                            StringBuilder sb = new StringBuilder();
                            strArr = split;
                            sb.append(TrackBuried.list_Param);
                            sb.append("_");
                            sb.append(queryParameter);
                            TrackBuried.list_Param = sb.toString();
                        } else {
                            strArr = split;
                        }
                        if (!StringUtils.isEmpty(str3)) {
                            hashMap.put("url", str3);
                        }
                        if (!StringUtils.isEmpty(str7)) {
                            hashMap.put("carrier_id", str7);
                            TrackBuried.carrier = str7;
                        }
                        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("action", "kpv");
                        TrackBuried.effectupdatePageProperties(str, hashMap2);
                    } else {
                        strArr = split;
                        if (!StringUtils.isEmpty(str5)) {
                            c = 0;
                            TrackBuried.list_Type = TrackBuried.list_TypeArr[0];
                            TrackBuried.list_Param = str5;
                            HashMap hashMap3 = new HashMap();
                            if (!StringUtils.isEmpty(str3)) {
                                hashMap3.put("url", str3);
                            }
                            if (!StringUtils.isEmpty(str7)) {
                                hashMap3.put("carrier_id", str7);
                                TrackBuried.carrier = str7;
                            }
                            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap3);
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("action", "kpv");
                            TrackBuried.effectupdatePageProperties(str, hashMap4);
                        }
                    }
                    c = 0;
                }
                str6 = queryParameter;
            }
            i++;
            split = strArr;
        }
    }

    public static void a(Activity activity, String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c9038b", new Object[]{activity, str, str2, intent});
            return;
        }
        Uri parse = Uri.parse(str2);
        String stringExtra = intent.getStringExtra("sellerId");
        if (!StringUtils.isEmpty(stringExtra)) {
            HashMap hashMap = new HashMap();
            hashMap.put("seller_id", stringExtra);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
        }
        if (parse != null && parse.isHierarchical()) {
            String queryParameter = parse.getQueryParameter("carrier_id");
            if (!StringUtils.isEmpty(queryParameter)) {
                TrackBuried.carrier = queryParameter;
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap2);
    }
}
