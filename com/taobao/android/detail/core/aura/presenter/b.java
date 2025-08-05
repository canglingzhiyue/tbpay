package com.taobao.android.detail.core.aura.presenter;

import android.app.Activity;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1978736213);
    }

    public b(Activity activity) {
        super(activity);
        emu.a("com.taobao.android.detail.core.aura.presenter.BottomBarAuraPresenter");
    }

    @Override // com.taobao.android.detail.core.aura.presenter.a
    public AURAPluginContainerNodeModel c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("30794f2c", new Object[]{this}) : com.taobao.android.detail.core.aura.utils.b.b(this.f9397a, ((DetailCoreActivity) this.f9397a).aT());
    }

    @Override // com.taobao.android.detail.core.aura.presenter.a
    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : new HashMap<String, Object>() { // from class: com.taobao.android.detail.core.aura.presenter.BottomBarAuraPresenter$1
            {
                b.this = this;
                put("instanceType", "BottomBar");
            }
        };
    }
}
