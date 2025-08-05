package com.taobao.android.tbabilitykit.pop;

import android.app.Activity;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.tao.log.TLog;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class g implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.abilitykit.ability.pop.model.c f15354a;
    private Activity b;
    private com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> c;
    private e e;

    static {
        kge.a(1283390544);
        kge.a(825059505);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onActivityChanged(Activity activity, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
        } else {
            q.d(configuration, "configuration");
        }
    }

    public g(com.taobao.android.abilitykit.ability.pop.model.c cVar, Activity act, com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> dVar) {
        q.d(act, "act");
        this.f15354a = cVar;
        this.b = act;
        this.c = dVar;
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        q.d(configuration, "configuration");
        TLog.loge("stdPopTag", "stdPopTag", "onScreenChanged = " + i);
        com.taobao.android.abilitykit.ability.pop.model.c cVar = this.f15354a;
        if (cVar != null) {
            if (i == 1) {
                z = true;
            }
            cVar.a(z, this.b);
        }
        com.taobao.android.abilitykit.ability.pop.model.c cVar2 = this.f15354a;
        if (cVar2 == null || (bVar = cVar2.f8913a) == null || !bVar.C()) {
            return;
        }
        if (this.e == null) {
            this.e = new e(this.b, this.f15354a, this.c);
        }
        e eVar = this.e;
        if (eVar == null) {
            return;
        }
        eVar.a(i, configuration);
    }
}
