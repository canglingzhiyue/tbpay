package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eav extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "strcat";

    static {
        kge.a(-1387770182);
    }

    public eav() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.parser.DetailStrcatParser");
    }

    @Override // tb.fnl
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        StringBuilder sb = new StringBuilder();
        fnr fnrVar = new fnr();
        for (String str2 : split) {
            String trim = str2.trim();
            if (eay.a(trim)) {
                Object a2 = fnrVar.a(eay.b(trim), obj);
                if (a2 instanceof String) {
                    sb.append(a2);
                }
            } else {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    @Override // tb.fnl
    public Object a(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2c17657e", new Object[]{this, str, str2, obj, obj2}) : a(str2, obj);
    }
}
