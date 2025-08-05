package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.a;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes7.dex */
public class laa implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.homepage.pop.protocol.event.a
    public void b(View view, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471aa397", new Object[]{this, view, iPopData});
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.a
    public void a(View view, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464c2516", new Object[]{this, view, iPopData});
        } else {
            a(iPopData);
        }
    }

    private void a(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ae3ed8", new Object[]{this, iPopData});
        } else if (!"appear".equals(b(iPopData))) {
            c.a("PopViewUpdateListener", "当前fatigueStyle不是appear");
        } else {
            new com.taobao.homepage.pop.mtop.a().a(iPopData);
        }
    }

    private String b(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57d46b89", new Object[]{this, iPopData});
        }
        if (iPopData == null) {
            c.a("PopViewUpdateListener", "popData == null");
            return null;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null) {
            c.a("PopViewUpdateListener", "popConfig == null");
            return null;
        }
        return popConfig.getFatigueReportStyle();
    }
}
