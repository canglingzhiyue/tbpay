package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.c;
import java.util.ArrayList;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.mainpic.inside.ext")
/* loaded from: classes4.dex */
public final class eky implements eku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f27386a;
    private final List<ViewGroup> b = new ArrayList();
    private final List<ImageView> c = new ArrayList();
    private eld d = new elf() { // from class: tb.eky.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.elf, tb.eld
        public void a(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else if (eme.a(eky.a(eky.this).e())) {
                int b = bay.b();
                for (ViewGroup viewGroup : eky.b(eky.this)) {
                    viewGroup.getLayoutParams().height = (int) (((i - b) * f) + b);
                }
            }
        }

        @Override // tb.elf, tb.eld
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (eme.a(eky.a(eky.this).e())) {
                for (ViewGroup viewGroup : eky.b(eky.this)) {
                    viewGroup.getLayoutParams().height = i;
                }
            }
        }
    };

    static {
        kge.a(-349020051);
        kge.a(1209952950);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    public static /* synthetic */ q a(eky ekyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("d0f5a8fa", new Object[]{ekyVar}) : ekyVar.f27386a;
    }

    public static /* synthetic */ List b(eky ekyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8e0009a1", new Object[]{ekyVar}) : ekyVar.b;
    }

    public eky() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.component.PicGalleryPictureInsideExtension");
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f27386a = qVar;
        Context e = qVar.e();
        if (!eme.a(e)) {
            return;
        }
        ((c) e).a(this.d);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Context e = this.f27386a.e();
        if (eme.a(e)) {
            ((c) e).b(this.d);
        }
        this.b.clear();
        this.c.clear();
    }

    @Override // tb.eku
    public void a(ViewGroup viewGroup, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7cdd9a1", new Object[]{this, viewGroup, imageView});
        } else if (imageView != null && viewGroup != null) {
            Context e = this.f27386a.e();
            if (!eme.a(e)) {
                return;
            }
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (!this.b.contains(viewGroup)) {
                this.b.add(viewGroup);
            }
            if (!eme.b(e)) {
                return;
            }
            for (ViewGroup viewGroup2 : this.b) {
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                layoutParams.height = eme.c(e);
                viewGroup2.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // tb.eku
    public void b(ViewGroup viewGroup, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1222ee2", new Object[]{this, viewGroup, imageView});
        } else if (!eme.a(this.f27386a.e()) || this.c.contains(imageView)) {
        } else {
            this.c.add(imageView);
        }
    }
}
