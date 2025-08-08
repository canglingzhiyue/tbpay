package tb;

import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;

/* loaded from: classes6.dex */
public class hzs extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UPDATEDXROOTHEIGHT = "8572232953135811470";

    static {
        kge.a(-1239093189);
    }

    public static /* synthetic */ Object ipc$super(hzs hzsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (lVar == null || lVar.i() == null) {
            return new dla();
        }
        ViewGroup.LayoutParams layoutParams = lVar.i().getLayoutParams();
        if (layoutParams == null) {
            return new dla();
        }
        String c = dlhVar.c("height");
        if (!StringUtils.isEmpty(c)) {
            try {
                layoutParams.height = Integer.parseInt(a(c));
            } catch (NumberFormatException unused) {
            }
        }
        String c2 = dlhVar.c("width");
        if (!StringUtils.isEmpty(c2)) {
            try {
                layoutParams.width = Integer.parseInt(a(c2));
            } catch (NumberFormatException unused2) {
            }
        }
        lVar.i().setLayoutParams(layoutParams);
        return new dla();
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : str.contains(".") ? str.split("\\.")[0] : str;
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1298047982);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public hzs a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hzs) ipChange.ipc$dispatch("16bc0e41", new Object[]{this, obj}) : new hzs();
        }
    }
}
