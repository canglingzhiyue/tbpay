package com.taobao.android.litecreator.util;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes5.dex */
public class ax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(411310821);
    }

    public static InputStream a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("667e3e6a", new Object[]{context, uri});
        }
        try {
            return context.getContentResolver().openInputStream(uri);
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean b(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32eba32c", new Object[]{context, uri})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                z = false;
            }
            if (openAssetFileDescriptor != null) {
                try {
                    openAssetFileDescriptor.close();
                    String str = "method[isFileExist] cost:" + (System.currentTimeMillis() - currentTimeMillis);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d711a94c", new Object[]{uri, uri2})).booleanValue();
        }
        if (uri == uri2) {
            return true;
        }
        if (uri != null && uri2 != null) {
            return uri.equals(uri2);
        }
        return false;
    }

    public static Uri a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ccfd7169", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean b(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a012a08d", new Object[]{uri, uri2})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (uri == uri2) {
            return true;
        }
        if (uri != null && uri2 != null) {
            if (uri.equals(uri2)) {
                return true;
            }
            String scheme = uri.getScheme();
            String scheme2 = uri2.getScheme();
            if ((StringUtils.equals(scheme, scheme2) || ((StringUtils.equals(scheme, "http") || StringUtils.equals(scheme, "https")) && (StringUtils.equals(scheme2, "http") || StringUtils.equals(scheme2, "https")))) && StringUtils.equals(uri.getHost(), uri2.getHost()) && StringUtils.equals(uri.getPath(), uri2.getPath())) {
                z = true;
            }
            String str = "method[isSame] cost:" + (System.currentTimeMillis() - currentTimeMillis);
        }
        return z;
    }

    public static Uri a(Uri uri, StringBuilder sb) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3058c63", new Object[]{uri, sb});
        }
        try {
            String encodedQuery = uri.getEncodedQuery();
            if (StringUtils.isEmpty(encodedQuery)) {
                str = sb.toString();
            } else {
                str = ((Object) sb) + "&" + encodedQuery;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme()).encodedAuthority(uri.getEncodedAuthority()).encodedPath(uri.getEncodedPath()).encodedQuery(str).fragment(uri.getEncodedFragment());
            return builder.build();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Uri a(Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b31278fd", new Object[]{uri, map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!StringUtils.isEmpty(entry.getKey())) {
                if (z) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    z = false;
                } else {
                    sb.append("&");
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                }
            }
        }
        return a(uri, sb);
    }

    public static Uri a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("da09ca35", new Object[]{str, jSONObject});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!StringUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        return buildUpon.build();
    }

    public static Uri a(String str, org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("41f18a03", new Object[]{str, jSONObject});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!StringUtils.isEmpty(next)) {
                    buildUpon.appendQueryParameter(next, jSONObject.get(next).toString());
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return buildUpon.build();
    }

    public static Uri a(String str, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("69baa84a", new Object[]{str, map});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            if (!StringUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        return buildUpon.build();
    }
}
