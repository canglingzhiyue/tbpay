package com.taobao.android.detail.ttdetail.utils;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.FavoriteConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes5.dex */
public class ak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1999206588);
    }

    public static void a(Intent intent, String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289186af", new Object[]{intent, str});
        } else if (intent == null || StringUtils.isEmpty(str) || (data = intent.getData()) == null || !StringUtils.isEmpty(data.getQueryParameter("id"))) {
        } else {
            intent.setData(data.buildUpon().appendQueryParameter("id", str).build());
        }
    }

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra("id");
        if (!StringUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        String stringExtra2 = intent.getStringExtra("item_id");
        if (!StringUtils.isEmpty(stringExtra2)) {
            return stringExtra2;
        }
        String b = b(intent);
        return b == null ? "" : b;
    }

    private static String b(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra(FavoriteConstants.DetailConstants_DETAIL_URL);
        String a2 = stringExtra != null ? a(stringExtra) : "";
        if (StringUtils.isEmpty(a2)) {
            String dataString = intent.getDataString();
            if (!StringUtils.isEmpty(dataString)) {
                a2 = a(dataString);
            }
        }
        if (StringUtils.isEmpty(a2) && (data = intent.getData()) != null && !StringUtils.isEmpty(data.getPath())) {
            Matcher matcher = Pattern.compile("/i(\\d+)\\.htm").matcher(data.getPath());
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return a2;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String b = b(str);
        return b != null ? b : c(str);
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        Matcher matcher = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com/i(\\d+)\\.htm").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        Matcher matcher2 = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com.*[?|&](?:id|item_id)=(\\d+)").matcher(str);
        if (!matcher2.find()) {
            return null;
        }
        return matcher2.group(1);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        for (String str2 : new String[]{"[?|&]item_id=(\\d+)", "[?|&]itemId=(\\d+)", "[?|&]item_num_id=(\\d+)", "[?|&]itemNumId=(\\d+)", "[?|&]id=(\\d+)"}) {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }
}
