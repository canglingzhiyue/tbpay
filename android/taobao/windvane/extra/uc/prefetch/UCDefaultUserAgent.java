package android.taobao.windvane.extra.uc.prefetch;

import android.os.Build;
import android.taobao.windvane.config.a;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import java.net.URLEncoder;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class UCDefaultUserAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String VALUE;
    private static String sUcImplVersion;

    static {
        kge.a(-108538335);
        sUcImplVersion = null;
        VALUE = getDefaultUserAgent(getUcVersion());
    }

    private static String getUcVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce1f0bc5", new Object[0]);
        }
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        if (iCoreVersion != null) {
            return iCoreVersion.version();
        }
        return Build.Version.NAME;
    }

    public static String getUcDetailVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("898ff9b6", new Object[0]);
        }
        if (!StringUtils.isEmpty(sUcImplVersion)) {
            return sUcImplVersion;
        }
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        if (iCoreVersion != null) {
            sUcImplVersion = iCoreVersion.version() + "." + iCoreVersion.buildTimestamp();
        }
        return sUcImplVersion;
    }

    private static String getDefaultUserAgent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dce0f20", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = Build.VERSION.RELEASE;
        if (str2.length() > 0) {
            if (Character.isDigit(str2.charAt(0))) {
                stringBuffer.append(str2);
            } else {
                stringBuffer.append("4.3");
            }
        } else {
            stringBuffer.append("1.0");
        }
        stringBuffer.append("; zh-CN");
        String str3 = android.os.Build.MODEL;
        if (str3.length() > 0) {
            stringBuffer.append("; ");
            stringBuffer.append(str3);
        }
        String str4 = android.os.Build.ID;
        if (str4 != null && str4.length() > 0) {
            String encode = URLEncoder.encode(str4);
            stringBuffer.append(" Build/");
            stringBuffer.append(encode);
        }
        String format = String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/100.0.4896.58 UWS/%s Mobile Safari/537.36", stringBuffer, str);
        if (format == null) {
            return format;
        }
        try {
            String h = a.a().h();
            String i = a.a().i();
            if (!StringUtils.isEmpty(h) && !StringUtils.isEmpty(i)) {
                format = format + " AliApp(" + h + "/" + i + riy.BRACKET_END_STR;
            }
            String str5 = format + " UCBS/2.11.1.1";
            if (str5.contains("TTID/") || StringUtils.isEmpty(a.a().b())) {
                return str5;
            }
            return str5 + " TTID/" + a.a().b();
        } catch (Exception unused) {
            return format;
        }
    }
}
