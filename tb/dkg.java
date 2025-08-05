package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class dkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static dkf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkf) ipChange.ipc$dispatch("f03b83f", new Object[0]) : new djw();
    }

    public static dkf b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkf) ipChange.ipc$dispatch("16b55d9e", new Object[0]) : new dkh(new djz(), new djw(), new dki(), new djx(), new dke() { // from class: tb.dkg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dke
            public dkf d(Context context) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (dkf) ipChange2.ipc$dispatch("6fb9d3ca", new Object[]{this, context}) : new dkb(context);
            }
        });
    }
}
