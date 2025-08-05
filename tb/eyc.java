package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.h;
import com.taobao.android.detail.ttdetail.component.module.i;
import com.taobao.android.detail.ttdetail.utils.a;

/* loaded from: classes4.dex */
public class eyc implements eyp<ezc> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "_tt_detail_header_frame_";

    static {
        kge.a(-1392609205);
        kge.a(1842823874);
    }

    @Override // tb.eyp
    public d<ezc> a(Context context, eyx eyxVar, ezc ezcVar, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b2c3c0bb", new Object[]{this, context, eyxVar, ezcVar, dataEntryArr});
        }
        if (a.a(dataEntryArr)) {
            return new i(context, eyxVar, ezcVar, dataEntryArr);
        }
        return new h(context, eyxVar, ezcVar, dataEntryArr);
    }
}
