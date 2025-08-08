package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.tao.log.TLog;

/* loaded from: classes6.dex */
public class xjx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Nav:OptionalInterceptor";

    static {
        kge.a(2055140151);
    }

    public static Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{uri});
        }
        String str = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            String uri2 = uri.toString();
            if (uri2.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + uri2;
            } else {
                str = k.HTTP_PREFIX + uri2;
            }
        } else if (scheme.startsWith(ado.URL_SEPARATOR)) {
            str = "http:" + uri;
        }
        if (StringUtils.isEmpty(str)) {
            return uri;
        }
        TLog.loge("Nav", "The Url used to determine has a scheme added, urlString: " + str);
        return Uri.parse(str);
    }

    public static String a(String[] strArr, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94e7830", new Object[]{strArr, uri});
        }
        if (strArr != null && uri != null) {
            try {
                for (String str : strArr) {
                    if (uri.getQueryParameter(str) != null) {
                        return str;
                    }
                }
                return null;
            } catch (UnsupportedOperationException e) {
                TLog.loge(TAG, "不支持的 Uri:" + Log.getStackTraceString(e));
            } catch (Exception e2) {
                TLog.loge(TAG, "未知异常 Uri:" + Log.getStackTraceString(e2));
                return null;
            }
        }
        return null;
    }
}
