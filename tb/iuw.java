package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.d;

/* loaded from: classes4.dex */
public class iuw implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iuv f29327a;

    public iuw(iuv iuvVar) {
        this.f29327a = iuvVar;
    }

    @Override // com.taobao.tao.navigation.d
    public void onTabChanged(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        Context context = TBMainHost.a().getContext();
        if (!(context instanceof Activity)) {
            return;
        }
        TLog.loge("TBAutoSize.Tab", "onTabChanged: i=" + i + " s=" + str);
        this.f29327a.a((Activity) context);
    }
}
