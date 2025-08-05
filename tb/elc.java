package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.c;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayList;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.video.inside.ext")
/* loaded from: classes4.dex */
public final class elc implements ekw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f27393a;
    private List<AbsPicGalleryVideoPlayer> b = new ArrayList();
    private List<ViewGroup> c = new ArrayList();
    private eld d = new elf() { // from class: tb.elc.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.elf, tb.eld
        public void a(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
                return;
            }
            Context e = elc.a(elc.this).e();
            if (!eme.a(e)) {
                return;
            }
            c cVar = (c) e;
            int b = bay.b();
            int i3 = (int) (((i - b) * f) + b);
            for (ViewGroup viewGroup : elc.b(elc.this)) {
                viewGroup.getLayoutParams().height = i3;
            }
            for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer : elc.c(elc.this)) {
                if (eis.f27332a) {
                    if (!elc.a(elc.this, absPicGalleryVideoPlayer)) {
                        absPicGalleryVideoPlayer.a(b, i3);
                    }
                } else {
                    absPicGalleryVideoPlayer.a(b, eme.a(cVar) ? i3 - emh.a(e) : i3);
                }
            }
        }

        @Override // tb.elf, tb.eld
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            Context e = elc.a(elc.this).e();
            if (!eme.a(e)) {
                return;
            }
            c cVar = (c) e;
            for (ViewGroup viewGroup : elc.b(elc.this)) {
                viewGroup.getLayoutParams().height = i;
            }
            int b = bay.b();
            for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer : elc.c(elc.this)) {
                if (eis.f27332a) {
                    if (!elc.a(elc.this, absPicGalleryVideoPlayer)) {
                        absPicGalleryVideoPlayer.a(b, i);
                    }
                } else {
                    absPicGalleryVideoPlayer.a(b, eme.a(cVar) ? i - emh.a(e) : i);
                }
            }
        }
    };

    static {
        kge.a(809068880);
        kge.a(1342534105);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    public static /* synthetic */ q a(elc elcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("8d24b343", new Object[]{elcVar}) : elcVar.f27393a;
    }

    public static /* synthetic */ boolean a(elc elcVar, AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f05f498c", new Object[]{elcVar, absPicGalleryVideoPlayer})).booleanValue() : elcVar.a(absPicGalleryVideoPlayer);
    }

    public static /* synthetic */ List b(elc elcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c8fd796a", new Object[]{elcVar}) : elcVar.c;
    }

    public static /* synthetic */ List c(elc elcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b9ce80c9", new Object[]{elcVar}) : elcVar.b;
    }

    public elc() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.component.PicGalleryVideoInsideExtension");
    }

    @Override // tb.ekw
    public void a(AURARenderComponent aURARenderComponent, AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866fcf1d", new Object[]{this, aURARenderComponent, absPicGalleryVideoPlayer, viewGroup, viewGroup2});
            return;
        }
        Context e = this.f27393a.e();
        if (!eme.a(e)) {
            return;
        }
        if (!this.c.contains(viewGroup2)) {
            this.c.add(viewGroup2);
        }
        View o = absPicGalleryVideoPlayer.o();
        if (o == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = o.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        } else {
            i.a("PicGalleryVideoInsideExtension", "video parent view is not FrameLayout");
        }
        if (!this.b.contains(absPicGalleryVideoPlayer)) {
            this.b.add(absPicGalleryVideoPlayer);
        }
        float b = emh.b(aURARenderComponent, emh.sDefaultDimension);
        absPicGalleryVideoPlayer.a("videoRatio", Float.valueOf(b));
        int a2 = a(e, b);
        for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer2 : this.b) {
            absPicGalleryVideoPlayer2.a(bay.b(), a2);
        }
        int a3 = a(e);
        for (ViewGroup viewGroup3 : this.c) {
            viewGroup3.getLayoutParams().height = a3;
        }
    }

    private int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue();
        }
        if (!eme.b(context)) {
            return eme.d(context);
        }
        return bay.b();
    }

    private int a(Context context, float f) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{this, context, new Float(f)})).intValue();
        }
        int a3 = a(context);
        if (eis.f27332a) {
            if (Float.compare(f, 1.0f) != 0 || eme.b(context)) {
                return a3;
            }
            a2 = emh.a(context);
        } else if (!eme.a((c) context)) {
            return a3;
        } else {
            a2 = emh.a(context);
        }
        return a3 - a2;
    }

    @Override // tb.ekw
    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (!eme.a(this.f27393a.e())) {
        } else {
            viewGroup.setBackgroundColor(-16777216);
        }
    }

    private boolean a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de199938", new Object[]{this, absPicGalleryVideoPlayer})).booleanValue();
        }
        if (absPicGalleryVideoPlayer == null) {
            return false;
        }
        Object a2 = absPicGalleryVideoPlayer.a("videoRatio");
        return (a2 instanceof Float) && Float.compare(((Float) a2).floatValue(), 1.0f) == 0;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f27393a = qVar;
        if (!eme.a(this.f27393a.e())) {
            return;
        }
        ((c) this.f27393a.e()).a(this.d);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!eme.a(this.f27393a.e())) {
        } else {
            ((c) this.f27393a.e()).b(this.d);
            this.b.clear();
            this.c.clear();
        }
    }
}
