package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class glr extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1371959988);
    }

    @Override // tb.glo
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (TextUtils.isEmpty(str)) {
            return obj;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        while (stringTokenizer.hasMoreTokens()) {
            obj = glz.a(obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar}) : a((String) list.get(0), gmfVar.c());
    }
}
