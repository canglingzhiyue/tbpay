package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.t;

/* loaded from: classes4.dex */
public class eyi implements eyp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "：）";

    static {
        kge.a(1025812167);
        kge.a(1842823874);
    }

    @Override // tb.eyp
    public d a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("58ba28a4", new Object[]{this, context, eyxVar, eyyVar, dataEntryArr}) : new t(context, eyxVar, eyyVar, dataEntryArr);
    }
}
