package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST;
import com.taobao.search.common.util.k;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes8.dex */
public class ohk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(428682413);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getAuthority());
            sb.append(parse.getPath());
            for (String str2 : new TreeSet(parse.getQueryParameterNames())) {
                String queryParameter = parse.getQueryParameter(str2);
                if (TextUtils.isEmpty(queryParameter)) {
                    break;
                }
                if (b(queryParameter)) {
                    queryParameter = a(queryParameter);
                }
                if (i == 0) {
                    sb.append("?");
                    sb.append(str2);
                    sb.append("=");
                    sb.append(queryParameter);
                } else {
                    sb.append("&");
                    sb.append(str2);
                    sb.append("=");
                    sb.append(queryParameter);
                }
                i++;
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str) || map == null || map.size() == 0) {
            return str;
        }
        Set<String> keySet = map.keySet();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : keySet) {
            Object obj = map.get(str2);
            if (obj != null) {
                buildUpon.appendQueryParameter(str2, obj.toString());
            }
        }
        return buildUpon.toString();
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(k.HTTP_PREFIX) || str.startsWith(k.HTTPS_PREFIX) || str.startsWith("h5.m.taobao.com") || str.startsWith("wapp.wapa.taobao.com");
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getAuthority());
            sb.append(parse.getPath());
            String queryParameter = parse.getQueryParameter("tnode");
            Uri uri = null;
            if (!TextUtils.isEmpty(queryParameter)) {
                uri = oec.a(Uri.parse(queryParameter), b.sIgnoreTNodeQuery);
                queryParameter = uri.toString();
            }
            if (uri != null ? TextUtils.equals(uri.getQueryParameter("preload"), "true") : false) {
                sb.append("?");
                sb.append("tnode");
                sb.append("=");
                sb.append(queryParameter);
            } else {
                for (String str2 : new TreeSet(parse.getQueryParameterNames())) {
                    String queryParameter2 = parse.getQueryParameter(str2);
                    if ("tnode".equals(str2)) {
                        queryParameter2 = queryParameter;
                    }
                    if (!TextUtils.isEmpty(queryParameter2) && !b.sIgnoreBizQuery.contains(str2) && !ASK_CONST.KEY_TNODE_TIME.equals(str2)) {
                        if (b(queryParameter2)) {
                            queryParameter2 = c(queryParameter2);
                        }
                        if (i == 0) {
                            sb.append("?");
                            sb.append(str2);
                            sb.append("=");
                            sb.append(queryParameter2);
                        } else {
                            sb.append("&");
                            sb.append(str2);
                            sb.append("=");
                            sb.append(queryParameter2);
                        }
                        i++;
                    }
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null) {
            return "";
        }
        String queryParameter = uri.getQueryParameter("tnode");
        return !TextUtils.isEmpty(queryParameter) ? Uri.parse(queryParameter).getPath() : "";
    }

    public static Map<String, String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa35996a", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return b(Uri.parse(str));
        }
        return null;
    }

    public static Map<String, String> b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c689e33", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }
}
