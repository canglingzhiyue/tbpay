package tb;

import android.content.Context;
import com.alibaba.android.icart.core.widget.d;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class bfh implements bfd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2125085140);
        kge.a(-1461353125);
    }

    @Override // tb.bfd
    public void a(bbz bbzVar, Context context, int i, MtopResponse mtopResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece7f9f6", new Object[]{this, bbzVar, context, new Integer(i), mtopResponse, new Boolean(z)});
        }
    }

    @Override // tb.bfd
    public void a(bbz bbzVar, Context context, int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff624c9e", new Object[]{this, bbzVar, context, new Integer(i), mtopResponse});
        } else if (mtopResponse == null) {
        } else {
            d.a(context, mtopResponse.getRetMsg());
            bed.a("showErrorView", "显示统一错误页", true, 1.0f);
        }
    }
}
