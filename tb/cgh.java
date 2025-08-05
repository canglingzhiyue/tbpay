package tb;

import android.content.Context;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class cgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            cgj.a().a(context);
        }
    }

    public static void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d966404e", new Object[]{trackLog});
            return;
        }
        if (trackLog != null) {
            trackLog.addTag9("0.10.1");
            trackLog.addTag10("Android");
        }
        cgj.a().a(trackLog);
    }

    public static void a(cgi cgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e360e433", new Object[]{cgiVar});
        } else {
            cgj.a().a(cgiVar);
        }
    }
}
