package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.g;
import com.taobao.android.remoteso.log.RSoLog;

/* loaded from: classes6.dex */
public class ric implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.remoteso.index.g
    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48cc4ef0", new Object[]{this, soIndexData, soIndexAdvanced});
        } else {
            RSoLog.c("HotfixThresholdDataHook, do nothing");
        }
    }
}
