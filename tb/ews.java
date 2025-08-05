package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.basic.d;
import com.taobao.android.detail.sdk.utils.ocr.b;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public abstract class ews implements j<d> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseGetOCRManagerSubscriber";

    /* renamed from: a  reason: collision with root package name */
    public Context f27618a;

    static {
        kge.a(-1704790353);
        kge.a(-1453870097);
    }

    public abstract b a();

    public ews(Context context) {
        this.f27618a = context;
        tpc.a("com.taobao.android.detail.sdk.utils.ocr.abstracts.BaseGetOCRManagerSubscriber");
    }
}
