package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.tao.util.StringUtil;
import java.text.DecimalFormat;
import tb.mto;

/* loaded from: classes7.dex */
public class nol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-426285800);
    }

    public static String a(String str) {
        String str2;
        Double valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!StringUtil.isEmpty(str)) {
            try {
                valueOf = Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
                str2 = "String转double出错";
            }
            try {
                String str3 = "";
                if (valueOf.doubleValue() >= mto.a.GEO_NOT_SUPPORT && valueOf.doubleValue() < 10000.0d) {
                    str3 = String.valueOf(valueOf.intValue());
                } else if (valueOf.doubleValue() >= 10000.0d && valueOf.doubleValue() < 100000.0d) {
                    Double valueOf2 = Double.valueOf(valueOf.doubleValue() / 10000.0d);
                    DecimalFormat decimalFormat = new DecimalFormat(".#");
                    str3 = decimalFormat.format(valueOf2) + "万";
                } else if (valueOf.doubleValue() >= 100000.0d) {
                    Double valueOf3 = Double.valueOf(valueOf.doubleValue() / 10000.0d);
                    str3 = String.valueOf(valueOf3.intValue()) + "万";
                }
                if (!StringUtil.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused2) {
                str2 = "转换出错";
                q.b("PriceRangeParser", str2);
                return null;
            }
        }
        return null;
    }
}
