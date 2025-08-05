package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.i;
import com.taobao.vessel.utils.b;
import java.net.URLDecoder;

/* loaded from: classes6.dex */
public class jvl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-128620353);
    }

    public static String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{str, new Boolean(z)});
        }
        try {
            String b = str.startsWith("http") ? b(str, z) : str;
            if (b != null) {
                return b;
            }
            if (str.startsWith(b.HTTPS_SCHEMA)) {
                i = 8;
            } else if (str.startsWith("http:")) {
                i = 7;
            }
            return str.substring(i);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private static String b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("645552ff", new Object[]{str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(URLDecoder.decode(str, "utf-8"));
            String queryParameter = parse.getQueryParameter(b.WX_TPL);
            if (queryParameter == null) {
                queryParameter = parse.getQueryParameter(i.WEEX_REFERER_ORIGIN);
            }
            if (queryParameter != null) {
                parse = Uri.parse(queryParameter);
            }
            if (!z) {
                return parse.toString();
            }
            return parse.getHost() + parse.getPath();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
