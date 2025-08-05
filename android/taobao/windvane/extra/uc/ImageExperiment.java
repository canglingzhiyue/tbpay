package android.taobao.windvane.extra.uc;

import android.app.Application;
import android.taobao.windvane.config.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import tb.kge;

/* loaded from: classes2.dex */
public class ImageExperiment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile v sExpDetail;

    static {
        kge.a(-570019270);
    }

    public static v getExpDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("e19a346a", new Object[0]);
        }
        if (sExpDetail == null) {
            synchronized (ImageExperiment.class) {
                if (sExpDetail == null) {
                    Application application = a.f;
                    if (application == null) {
                        return null;
                    }
                    sExpDetail = t.a(application, "wvImageFormatOptAB", "[49,49],[50,50]");
                }
            }
        }
        return sExpDetail;
    }
}
