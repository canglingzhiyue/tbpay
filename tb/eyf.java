package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.p;
import com.taobao.android.detail.ttdetail.component.module.q;
import com.taobao.android.detail.ttdetail.utils.a;

/* loaded from: classes4.dex */
public class eyf implements eyp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "headervideo";

    static {
        kge.a(-1056974256);
        kge.a(1842823874);
    }

    @Override // tb.eyp
    public d a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("58ba28a4", new Object[]{this, context, eyxVar, eyyVar, dataEntryArr});
        }
        if (a.a(dataEntryArr)) {
            return new q(context, eyxVar, eyyVar, dataEntryArr);
        }
        return new p(context, eyxVar, eyyVar, dataEntryArr);
    }
}
