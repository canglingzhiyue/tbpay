package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class kqv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DETAILAPPVERSION = -8964819166049023094L;

    static {
        kge.a(-25710134);
    }

    public kqv() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.parser.DXDataParserDetailAppVersion");
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (eip.b && objArr != null && objArr.length != 0) {
            for (Object obj : objArr) {
                if (a((String) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && a(epo.e().trim(), str.trim()) >= 0;
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i = 0; i < split.length && i < split2.length; i++) {
            if (!split[i].equals(split2[i])) {
                return Integer.valueOf(split[i]).intValue() - Integer.valueOf(split2[i]).intValue();
            }
        }
        return split.length - split2.length;
    }
}
