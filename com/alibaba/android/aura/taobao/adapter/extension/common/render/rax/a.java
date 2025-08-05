package com.alibaba.android.aura.taobao.adapter.extension.common.render.rax;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.annotation.AURAInputField;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;
import tb.asz;
import tb.atl;
import tb.bqa;
import tb.ept;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.render.component.creator.rax")
/* loaded from: classes2.dex */
public final class a extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String d = "floatView";
    private c e;
    @AURAInputField(name = "floatView", required = false)
    private com.alibaba.android.umf.taobao.adapter.widget.floatview.a f;
    private b g;

    static {
        kge.a(-477954169);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -1219783041) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ c a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("58735748", new Object[]{aVar}) : aVar.e;
    }

    @Override // tb.atl, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.e = new c(this.f25589a, true);
        this.f = (com.alibaba.android.umf.taobao.adapter.widget.floatview.a) b().a(this, "floatView", com.alibaba.android.umf.taobao.adapter.widget.floatview.a.class);
        if (this.f == null) {
            arc.a().c("AURARaxComponentExtension", "renderView", "没有注入floatView参数");
        }
        this.g = new b(this.c.b(), this.f);
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        c cVar = this.e;
        if (cVar == null) {
            arc.a().c("AURARaxComponentExtension", ept.SUB_CREATE_VIEW, "RaxComponentCreator为null");
            return new asz().a(viewGroup.getContext());
        }
        return cVar.a(viewGroup, aURARenderComponentContainer, new AURARaxJSBridgeApiPlugin(this.c.b(), new bqa<String, AURARenderComponent>() { // from class: com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqa
            public AURARenderComponent a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (AURARenderComponent) ipChange2.ipc$dispatch("cb48fc1d", new Object[]{this, str}) : a.a(a.this).a(str);
            }
        }));
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (this.e == null || this.f == null) {
            arc.a().c("AURARaxComponentExtension", ept.SUB_CREATE_VIEW, "floatView为null");
        } else {
            this.g.a(aURARenderComponent);
            this.e.a(aURARenderComponent, view, this.f, this.g);
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e.b();
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : this.e.a(aURARenderComponent);
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c cVar = this.e;
        if (cVar != null) {
            cVar.a();
        }
        this.e = null;
        this.f = null;
    }
}
