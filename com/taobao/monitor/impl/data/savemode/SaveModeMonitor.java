package com.taobao.monitor.impl.data.savemode;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.impl.d;
import com.taobao.metrickit.i;
import java.util.Map;

/* loaded from: classes7.dex */
public class SaveModeMonitor implements i.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SaveModeMonitor() {
        i.a(92, this);
        i.a(93, this);
    }

    @Override // com.taobao.metrickit.i.a
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            return;
        }
        if (i == 92) {
            d.a().b("saveMode", true);
        }
        if (i != 93) {
            return;
        }
        d.a().b("saveMode", false);
    }
}
