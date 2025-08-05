package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.PageVisibleAlgorithm;

/* loaded from: classes7.dex */
public class mnk implements mnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.mnn
    public mnm a(String str, View view, View view2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (mnm) ipChange.ipc$dispatch("c14bf768", new Object[]{this, str, view, view2});
        }
        mnl mnlVar = null;
        if (!TextUtils.isEmpty(str) && mpe.i(str)) {
            mnlVar = new mnl(view, view2);
        }
        if (mnlVar != null) {
            return mnlVar;
        }
        if (mpe.l(str) && !mpe.m(str)) {
            z = false;
        }
        return new mnq(view, view2, z);
    }

    @Override // tb.mnn
    public mnm a(PageVisibleAlgorithm pageVisibleAlgorithm, String str, View view, View view2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (mnm) ipChange.ipc$dispatch("b96a3a00", new Object[]{this, pageVisibleAlgorithm, str, view, view2});
        }
        if (pageVisibleAlgorithm == PageVisibleAlgorithm.SHADOW) {
            if (mpe.l(str) && !mpe.m(str)) {
                z = false;
            }
            return new mnq(view, view2, z);
        } else if (pageVisibleAlgorithm != PageVisibleAlgorithm.CANVAS) {
            return null;
        } else {
            return new mnl(view, view2);
        }
    }
}
