package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class gou extends gmv<goq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1847642480);
    }

    public gou(gmv gmvVar) {
        super(gmvVar);
    }

    @Override // tb.gmv
    public boolean a(goq goqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaa8a5b3", new Object[]{this, goqVar})).booleanValue();
        }
        if (!gof.d(goqVar.a())) {
            return b(goqVar);
        }
        IDMComponent b = goqVar.b();
        IDMComponent a2 = gof.a(goqVar.c(), goqVar.d(), goqVar.e());
        if (a2 != null && TextUtils.equals(gof.i(b), gof.i(a2))) {
            return b(goqVar);
        }
        return true;
    }
}
