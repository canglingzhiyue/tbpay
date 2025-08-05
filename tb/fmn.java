package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes5.dex */
public class fmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fmi f28062a;

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.f28062a != null) {
        } else {
            TLog.loge("AliNewDetailExtend", "NewDetailDateManager", "notifyFirstDetailLoadState mGetFirstDetailListener is null!");
        }
    }
}
