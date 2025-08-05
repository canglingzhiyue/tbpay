package com.taobao.android.detail.core.aura.presenter;

import android.app.Activity;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.HashMap;
import java.util.Map;
import tb.dxu;
import tb.dxv;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_CONFIG = "detail_aura_config.json";
    public static final String TYPE = "MainPage";
    private final dxu b;

    static {
        kge.a(-1452986993);
    }

    public static /* synthetic */ dxu a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dxu) ipChange.ipc$dispatch("72bb1f21", new Object[]{cVar}) : cVar.b;
    }

    public c(Activity activity, dxu dxuVar) {
        super(activity);
        this.b = dxuVar;
        emu.a("com.taobao.android.detail.core.aura.presenter.MainPageAuraPresenter");
    }

    @Override // com.taobao.android.detail.core.aura.presenter.a
    public AURAPluginContainerNodeModel c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("30794f2c", new Object[]{this}) : com.taobao.android.detail.core.aura.utils.b.b(this.f9397a, ((DetailCoreActivity) this.f9397a).aT());
    }

    @Override // com.taobao.android.detail.core.aura.presenter.a
    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : new HashMap<String, Object>() { // from class: com.taobao.android.detail.core.aura.presenter.MainPageAuraPresenter$1
            {
                put(dxv.INSTANCE_TAG, c.a(c.this).e());
                put("instanceType", c.TYPE);
            }
        };
    }
}
