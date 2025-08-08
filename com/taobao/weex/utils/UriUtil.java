package com.taobao.weex.utils;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import tb.ado;
import tb.kge;
import tb.riu;

/* loaded from: classes9.dex */
public class UriUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1801186827);
    }

    public static Uri addScheme(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("4942af1", new Object[]{uri});
        }
        if (!StringUtils.isEmpty(uri.getScheme())) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (uri.getHost() == null) {
            String uri2 = uri.toString();
            buildUpon = Uri.parse(ado.URL_SEPARATOR + uri2).buildUpon();
        }
        buildUpon.scheme("http");
        return buildUpon.build();
    }

    public static Uri getBundleUri(Uri uri) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("20222683", new Object[]{uri});
        }
        if (uri.getBooleanQueryParameter(riu.h, false)) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter(riu.g);
        WXLogUtils.d("TBWXNavPreProcessor", "origin WX_TPL:" + queryParameter);
        if (StringUtils.isEmpty(queryParameter) || (parse = Uri.parse(queryParameter)) == null) {
            return null;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        for (String str : queryParameterNames) {
            if (!StringUtils.equals(str, riu.g)) {
                buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return buildUpon.build();
    }
}
