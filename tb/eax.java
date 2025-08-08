package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eax extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "xtrim";

    static {
        kge.a(371836936);
    }

    public eax() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.parser.DetailTrimStringParser");
    }

    @Override // tb.fnl
    public Object a(String str, Object obj) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        fnr fnrVar = new fnr();
        String trim = str.trim();
        try {
            try {
                if (eay.a(trim)) {
                    a2 = fnrVar.a(eay.b(trim), obj);
                } else {
                    a2 = fnrVar.a(trim, obj);
                }
                if (a2 != null && (a2 instanceof String)) {
                    sb.append(a2);
                }
                return sb.toString().trim();
            } catch (Exception e) {
                e.printStackTrace();
                return sb.toString().trim();
            }
        } catch (Throwable unused) {
            return sb.toString().trim();
        }
    }

    @Override // tb.fnl
    public Object a(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2c17657e", new Object[]{this, str, str2, obj, obj2}) : a(str2, obj);
    }
}
