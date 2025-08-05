package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.c;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.progressBar.inside.ext")
/* loaded from: classes4.dex */
public final class ela implements ekv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f27390a;
    private AURAGlobalData b;
    private eld c = new elf() { // from class: tb.ela.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.elf, tb.eld
        public void a(int i, int i2, float f) {
            RecyclerView recyclerView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else if (!eme.a(ela.a(ela.this).e()) || ela.b(ela.this) == null || (recyclerView = (RecyclerView) ela.b(ela.this).get("render_view", RecyclerView.class)) == null) {
            } else {
                emj.c(recyclerView);
            }
        }
    };

    static {
        kge.a(-1160729147);
        kge.a(1387031438);
    }

    public static /* synthetic */ q a(ela elaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("635322c1", new Object[]{elaVar}) : elaVar.f27390a;
    }

    public static /* synthetic */ AURAGlobalData b(ela elaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("c6f5f895", new Object[]{elaVar}) : elaVar.b;
    }

    public ela() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.component.PicGalleryProgressBarInsideExtension");
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f27390a = qVar;
        Context e = this.f27390a.e();
        if (!eme.a(e)) {
            return;
        }
        ((c) e).a(this.c);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Context e = this.f27390a.e();
        if (!eme.a(e)) {
            return;
        }
        ((c) e).b(this.c);
    }
}
