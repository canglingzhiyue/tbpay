package tb;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class emb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(610727028);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailColorUtil");
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            ard a2 = arc.a();
            a2.c("StandardDetailColorUtil", "parseColor", "wrong color format:" + str);
            return i;
        }
    }
}
