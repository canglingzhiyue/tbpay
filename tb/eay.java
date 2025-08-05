package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eay {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(559765549);
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.parser.ParserUtils");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String trim = str.trim();
        return trim != null && trim.startsWith(riy.BRACKET_START_STR) && trim.endsWith(riy.BRACKET_END_STR);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String trim = str.trim();
        return trim.substring(1, trim.length() - 1);
    }
}
