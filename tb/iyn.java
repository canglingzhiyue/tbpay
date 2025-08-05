package tb;

import android.view.ScaleGestureDetector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavix.e;
import com.taobao.statistic.TBS;

/* loaded from: classes4.dex */
public class iyn extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(118252569);
    }

    public static /* synthetic */ Object ipc$super(iyn iynVar, String str, Object... objArr) {
        if (str.hashCode() == -717469221) {
            super.onScaleEnd((ScaleGestureDetector) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("factor=");
        sb.append(scaleGestureDetector.getScaleFactor() > 1.0f ? "out" : "in");
        TBS.Ext.commitEvent("BehaviX", UtUtils.CHANGED_UPP_EVENT_ID, "bx_page_scale", e.a(), null, sb.toString());
        super.onScaleEnd(scaleGestureDetector);
    }
}
