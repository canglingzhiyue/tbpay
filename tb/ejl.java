package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.container.d;
import com.taobao.taobao.R;
import java.util.List;
import tb.atn;

@AURAExtensionImpl(code = "alidetail.impl.lifecycle.component.nestedcontainer")
/* loaded from: classes4.dex */
public final class ejl extends arn implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27348a = "AliSDetailNestedContainerLifecycleExtension";
    private List<ejm> b;

    static {
        kge.a(-499726762);
        kge.a(-1744374023);
    }

    public static /* synthetic */ Object ipc$super(ejl ejlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1372880223) {
            super.afterServiceExecute((c) objArr[0], (a) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    public ejl() {
        emu.a("com.taobao.android.detail.core.standard.componentlifecycle.nested.AliSDetailNestedContainerLifecycleExtension");
    }

    private RecyclerView e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("1db4cd8", new Object[]{this});
        }
        AURAGlobalData c = c();
        if (c != null) {
            return (RecyclerView) c.get("render_view", RecyclerView.class);
        }
        return null;
    }

    @Override // tb.arn, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.b = b().b(ejm.class);
    }

    @Override // tb.arn, tb.arp
    public void afterServiceExecute(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(cVar, aVar, z);
        if (!asw.RENDER_SERVICE_CODE.equalsIgnoreCase(aVar.c())) {
            return;
        }
        g();
    }

    private NestedScrollContainer f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedScrollContainer) ipChange.ipc$dispatch("2141737b", new Object[]{this});
        }
        Context e = a().e();
        if (e instanceof Activity) {
            return (NestedScrollContainer) ((Activity) e).findViewById(R.id.aliDetailNestedScrollContainer);
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.d
    public void a(int i, String str, int i2) {
        RecyclerView e;
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34dafe", new Object[]{this, new Integer(i), str, new Integer(i2)});
        } else if (!bau.a(this.b) && (e = e()) != null && (childCount = e.getChildCount()) != 0) {
            int[] iArr = new int[2];
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = e.getChildAt(i3);
                childAt.getLocationOnScreen(iArr);
                int height = childAt.getHeight();
                int i4 = iArr[1];
                RecyclerView.ViewHolder findContainingViewHolder = e.findContainingViewHolder(childAt);
                if (!(findContainingViewHolder instanceof atn.a)) {
                    arc.a().c("AliSDetailNestedContainerLifecycleExtension", "onIndexChanged", "");
                } else if (i4 < (-height)) {
                    if (ejj.c(childAt)) {
                        for (ejm ejmVar : this.b) {
                            ejmVar.b(e, (atn.a) findContainingViewHolder);
                        }
                    }
                } else if (!ejj.c(childAt)) {
                    for (ejm ejmVar2 : this.b) {
                        ejmVar2.a(e, (atn.a) findContainingViewHolder);
                    }
                }
            }
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        h();
        NestedScrollContainer f = f();
        if (f == null) {
            return;
        }
        f.addScrollIndexListener(this);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        NestedScrollContainer f = f();
        if (f == null) {
            return;
        }
        f.removeScrollIndexListener((Class<? extends d>) getClass());
    }

    @Override // tb.arn, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        h();
    }
}
