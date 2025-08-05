package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.a;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes2.dex */
public class bkk implements bkl<IDMComponent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1231448324);
        kge.a(-1237682449);
    }

    @Override // tb.bkl
    public Object a(String str, IDMComponent iDMComponent) {
        IDMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f8431510", new Object[]{this, str, iDMComponent});
        }
        if (TextUtils.isEmpty(str) || (a2 = a.a(str, iDMComponent)) == null) {
            return null;
        }
        return a2.getKey();
    }
}
