package com.taobao.tao.util;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.WindVaneSDK;
import android.taobao.windvane.util.m;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.aidl.LocationDTO;
import com.taobao.passivelocation.aidl.LocationServiceManager;
import com.ut.device.UTDevice;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import tb.bgy;
import tb.kge;

/* loaded from: classes8.dex */
public class UrlFormator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1280776836);
    }

    public static String formatUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdc78937", new Object[]{str});
        }
        if (str != null) {
            return (!WindVaneSDK.isTrustedUrl(str) || Uri.parse(str).getPath().endsWith(bgy.APK_EXTENSION)) ? str : addLBS(addHardInfo(str));
        }
        m.e(MonitorItemConstants.KEY_URL, "URL is null");
        return "m.taobao.com";
    }

    public static String insertParam(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e73c5111", new Object[]{str, str2});
        }
        int indexOf = str.indexOf("?");
        if (indexOf != -1) {
            str3 = "&" + str2;
        } else {
            str3 = "?" + str2;
        }
        int indexOf2 = str.indexOf("#");
        if (indexOf2 == -1) {
            return str + str3;
        } else if (indexOf2 < indexOf) {
            return str;
        } else {
            return str.substring(0, indexOf2) + str3 + str.substring(indexOf2);
        }
    }

    public static String appendutd_id(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("469973ab", new Object[]{context, uri});
        }
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        String utdid = UTDevice.getUtdid(context);
        try {
            utdid = URLEncoder.encode(utdid, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        buildUpon.appendQueryParameter("utd_id", utdid);
        return buildUpon.toString();
    }

    private static String addHardInfo(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a95390f5", new Object[]{str}) : (str.contains("ttid=") || str.contains("addHardInfo=0")) ? str : insertParam(str, TaoHelper.getHardnessInfo());
    }

    private static String addLBS(String str) {
        LocationDTO cachedLocation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2792153", new Object[]{str});
        }
        if (str == null || !str.contains("_tb_lbs_s=") || str.contains("longitude") || (cachedLocation = LocationServiceManager.getCachedLocation()) == null) {
            return str;
        }
        String longitude = cachedLocation.getLongitude();
        String latitude = cachedLocation.getLatitude();
        return insertParam(str, "longitude=" + longitude + "&latitude=" + latitude + "&from=2");
    }

    public static String appendQuery(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d96f18d", new Object[]{str, str2, str3});
        }
        StringBuilder sb = new StringBuilder(str);
        char lastChar = getLastChar(str);
        if ('?' != lastChar && '&' != lastChar) {
            if (str.contains("?")) {
                sb.append("&");
            } else {
                sb.append("?");
            }
        }
        try {
            sb.append(URLEncoder.encode(str2, "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
        return sb.toString();
    }

    private static char getLastChar(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Character) ipChange.ipc$dispatch("6483a980", new Object[]{str})).charValue() : str.charAt(str.length() - 1);
    }

    public static String rebuildWVurl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26bb1a90", new Object[]{str, str2});
        }
        StringBuilder sb = new StringBuilder(str2);
        char lastChar = getLastChar(str2);
        if ('?' != lastChar && '&' != lastChar) {
            if (str2.contains("?")) {
                sb.append("&");
            } else {
                sb.append("?");
            }
        }
        if ('?' != getLastChar(str) && str.contains("?")) {
            String[] split = str.split("\\?");
            for (int i = 1; i < split.length; i++) {
                if (split[i] != null) {
                    sb.append(split[i]);
                }
                if (i != split.length - 1) {
                    sb.append("?");
                }
            }
        }
        return sb.toString();
    }
}
