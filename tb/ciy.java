package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.m;

/* loaded from: classes.dex */
public class ciy implements cix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1733177444);
        kge.a(961378442);
    }

    @Override // tb.cix
    public String a(String str, ciu ciuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("654f2b8d", new Object[]{this, str, ciuVar});
        }
        if (str.indexOf("$TTID") >= 0) {
            str = str.replace("$TTID", a(m.f6406a));
        }
        return ciuVar.a(str);
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        int identifier = context.getResources().getIdentifier("ttid", "string", context.getPackageName());
        return identifier <= 0 ? "" : context.getString(identifier);
    }
}
