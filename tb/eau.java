package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eau extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "equals";

    static {
        kge.a(2029867764);
    }

    public eau() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.parser.DetailEqualsParser");
    }

    @Override // tb.fnl
    public Object a(String str, Object obj) {
        Object a2;
        String trim;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length != 3) {
            return null;
        }
        fnr fnrVar = new fnr();
        if (!split[0].contains("WITH")) {
            return null;
        }
        String[] split2 = split[0].split(" WITH ");
        Object a3 = fnrVar.a(eay.b(split2[0]), obj);
        if (split2[1].contains("const")) {
            a2 = split2[1].substring(6, split2[1].length() - 1);
        } else {
            a2 = fnrVar.a(eay.b(split2[1]), obj);
        }
        if (a3 == null) {
            a3 = "";
        }
        if (a2 == null) {
            a2 = "";
        }
        if (!(a3 instanceof String) || !(a2 instanceof String)) {
            return null;
        }
        if (((String) a3).equals((String) a2)) {
            trim = split[1].trim();
        } else {
            trim = split[2].trim();
        }
        return eay.a(trim) ? fnrVar.a(eay.b(trim), obj) : trim;
    }

    @Override // tb.fnl
    public Object a(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2c17657e", new Object[]{this, str, str2, obj, obj2}) : a(str2, obj);
    }
}
