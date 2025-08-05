package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.c;
import com.taobao.android.detail.core.standard.widget.anchor.PicGalleryAnchorView;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.locatorbar.inside.ext")
/* loaded from: classes4.dex */
public final class ekx implements ekt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f27384a;
    private AURAGlobalData b;
    private eld c = new elf() { // from class: tb.ekx.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.elf, tb.eld
        public void a(int i, int i2, float f) {
            PicGalleryAnchorView picGalleryAnchorView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else if (!eme.a(ekx.a(ekx.this).e()) || ekx.b(ekx.this) == null || (picGalleryAnchorView = (PicGalleryAnchorView) ekx.b(ekx.this).get("AliDetailMainGalleryAnchorView", PicGalleryAnchorView.class)) == null) {
            } else {
                picGalleryAnchorView.setAlpha(f);
            }
        }
    };

    static {
        kge.a(-1339015183);
        kge.a(-2006977286);
    }

    public static /* synthetic */ q a(ekx ekxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("bc0ce0b9", new Object[]{ekxVar}) : ekxVar.f27384a;
    }

    public static /* synthetic */ AURAGlobalData b(ekx ekxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("af92ad9d", new Object[]{ekxVar}) : ekxVar.b;
    }

    public ekx() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.component.PicGalleryLocatorExtension");
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
        this.f27384a = qVar;
        if (!eme.a(qVar.e())) {
            return;
        }
        ((c) qVar.e()).a(this.c);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!eme.a(this.f27384a.e())) {
        } else {
            ((c) this.f27384a.e()).b(this.c);
        }
    }
}
