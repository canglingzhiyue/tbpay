package android.taobao.windvane.extra.uc;

import android.taobao.windvane.config.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import tb.kge;
import tb.qgo;

/* loaded from: classes2.dex */
public class WVLaunchTaskOptAB {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile WVLaunchTaskOptAB INSTANCE;
    private static volatile v sGroupDetail;

    static {
        kge.a(-2001391009);
    }

    private WVLaunchTaskOptAB() {
    }

    public static WVLaunchTaskOptAB getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVLaunchTaskOptAB) ipChange.ipc$dispatch("7c78f3b4", new Object[0]);
        }
        if (INSTANCE == null) {
            synchronized (WVLaunchTaskOptAB.class) {
                if (INSTANCE == null) {
                    INSTANCE = new WVLaunchTaskOptAB();
                }
            }
        }
        return INSTANCE;
    }

    public v getGroupDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("4d863948", new Object[]{this});
        }
        if (sGroupDetail == null) {
            synchronized (qgo.class) {
                if (sGroupDetail == null && a.f != null) {
                    sGroupDetail = t.a(a.f, "WVLaunchTaskOptAB", "[0,49],[50,99]");
                }
            }
        }
        return sGroupDetail;
    }
}
