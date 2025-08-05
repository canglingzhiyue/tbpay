package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.a;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.render.b;
import com.taobao.android.abilitykit.ability.pop.render.d;
import kotlin.jvm.internal.q;
import tb.dlr;

/* loaded from: classes6.dex */
public final class xmn<P extends a, CONTEXT extends dlr> extends b<P, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final View b;

    static {
        kge.a(-1427039068);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(xmn xmnVar, String str, Object... objArr) {
        if (str.hashCode() == -994991334) {
            super.a((xmn) ((dlr) objArr[0]), (dlr) ((c) objArr[1]), (View) objArr[2], (d) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    public xmn(View view) {
        this.b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public /* bridge */ /* synthetic */ void a(dle dleVar, c cVar, View view, d dVar) {
        a((xmn<P, CONTEXT>) ((dlr) dleVar), (dlr) ((a) cVar), view, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.b
    public /* bridge */ /* synthetic */ void a(dlr dlrVar, c cVar, View view, d dVar) {
        a((xmn<P, CONTEXT>) dlrVar, (dlr) ((a) cVar), view, dVar);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean a(View contentView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, contentView, new Integer(i)})).booleanValue();
        }
        q.d(contentView, "contentView");
        if (!(contentView instanceof hfg)) {
            return false;
        }
        return contentView.canScrollVertically(i);
    }

    public void a(CONTEXT abilityRuntimeContext, P params, View view, d callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d554d98", new Object[]{this, abilityRuntimeContext, params, view, callback});
            return;
        }
        q.d(abilityRuntimeContext, "abilityRuntimeContext");
        q.d(params, "params");
        q.d(callback, "callback");
        super.a((xmn<P, CONTEXT>) abilityRuntimeContext, (CONTEXT) params, view, callback);
        View view2 = this.b;
        if (view2 != null) {
            callback.a(view2);
        } else {
            callback.a(new dkv(10015, "nativeView is null"), null);
        }
    }
}
