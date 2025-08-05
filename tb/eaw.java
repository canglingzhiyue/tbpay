package tb;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class eaw extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "tenary";

    static {
        kge.a(-262669472);
    }

    public static /* synthetic */ Object ipc$super(eaw eawVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public eaw() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.parser.DetailTenaryParser");
    }

    @Override // tb.fnl
    public Object a(String str, Object obj) {
        String[] split;
        boolean z;
        String trim;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split2 = str.split(",");
        if (split2.length != 3) {
            return null;
        }
        fnr fnrVar = new fnr();
        String[] split3 = split2[0].split(" OR ");
        if (split3 == null || split3.length < 2) {
            split = split2[0].split(" AND ");
            z = true;
        } else {
            split = split3;
            z = false;
        }
        boolean z2 = z;
        for (String str2 : split) {
            String trim2 = str2.trim();
            if (!eay.a(trim2)) {
                return null;
            }
            Object a2 = fnrVar.a(eay.b(trim2), obj);
            if (z) {
                z2 &= a(a2);
                if (!z2) {
                    break;
                }
            } else {
                z2 |= a(a2);
                if (z2) {
                    break;
                }
            }
        }
        if (z2) {
            trim = split2[1].trim();
        } else {
            trim = split2[2].trim();
        }
        return eay.a(trim) ? fnrVar.a(eay.b(trim), obj) : trim;
    }

    @Override // tb.fnl
    public Object a(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2c17657e", new Object[]{this, str, str2, obj, obj2}) : a(str2, obj);
    }

    private boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof String)) {
            return obj instanceof Map ? ((Map) obj).size() > 0 : (obj instanceof List) && ((List) obj).size() > 0;
        }
        String str = (String) obj;
        if ("true".equalsIgnoreCase(str) || Constants.VAL_YES.equalsIgnoreCase(str) || "1".equalsIgnoreCase(str)) {
            return true;
        }
        return !"false".equalsIgnoreCase(str) && !"no".equalsIgnoreCase(str) && !"0".equalsIgnoreCase(str) && str.trim().length() > 0;
    }
}
