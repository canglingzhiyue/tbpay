package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.skeleton.recommend.a;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.j;

/* loaded from: classes4.dex */
public class kvt implements eyp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "guessyoulike";

    static {
        kge.a(-1302618258);
        kge.a(1842823874);
    }

    @Override // tb.eyp
    public d a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("58ba28a4", new Object[]{this, context, eyxVar, eyyVar, dataEntryArr});
        }
        if (j.G() && com.taobao.android.detail.ttdetail.utils.d.a(eyxVar) && (!e.b() || j.F())) {
            return new a(context, eyxVar, eyyVar, dataEntryArr);
        }
        return new kwj(context, eyxVar, eyyVar, dataEntryArr);
    }
}
