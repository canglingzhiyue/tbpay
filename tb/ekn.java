package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.c;
import java.util.ArrayList;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.maingallery.frame.offsetAndResize")
/* loaded from: classes4.dex */
public final class ekn implements ate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURAGlobalData f27375a;
    private aqs c;
    private q d;
    private final List<String> b = new ArrayList();
    private final List<View> e = new ArrayList();
    private final eld f = new elf() { // from class: tb.ekn.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.elf, tb.eld
        public void a(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else if (eis.f27332a) {
                Context e = ekn.a(ekn.this).e();
                if (!eme.a(e)) {
                    return;
                }
                int a2 = emh.a(e);
                for (View view : ekn.b(ekn.this)) {
                    ekn.a(ekn.this, view, (int) (a2 * f));
                }
            }
        }
    };

    static {
        kge.a(-1203195857);
        kge.a(1643319480);
    }

    @Override // tb.ate
    public View a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c09f824a", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
        }
        return null;
    }

    @Override // tb.ate
    public void a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2fb4c", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
        }
    }

    public static /* synthetic */ q a(ekn eknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("eaf50e2f", new Object[]{eknVar}) : eknVar.d;
    }

    public static /* synthetic */ void a(ekn eknVar, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1445c1", new Object[]{eknVar, view, new Integer(i)});
        } else {
            eknVar.a(view, i);
        }
    }

    public static /* synthetic */ List b(ekn eknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7add656", new Object[]{eknVar}) : eknVar.e;
    }

    public ekn() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.AliSDetailMainGalleryFrameOffsetAndReSizeExtension");
    }

    @Override // tb.ate
    public boolean a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebad0c8", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        ejh.a(this.d, aURARenderComponent, view);
        if (a(aURARenderComponent)) {
            return false;
        }
        String str = aURARenderComponent.key;
        float a2 = emh.a(view, aURARenderComponent, false);
        View view2 = null;
        try {
            view2 = view.findViewById(ekq.mViewIdRealContent);
        } catch (Exception e) {
            ema.a("mainGalleryGetContentViewFromResizeError", e.getMessage() + ",componentKey=" + str, this.d, this.c);
        }
        if (view2 == null) {
            ard a3 = arc.a();
            a3.c("AliSDetailDXComponentOffsetExtension", "beforeItemViewRender", "cannot find real content, then use itemView:" + view + ",componentKey=" + str);
        } else {
            view = view2;
        }
        if (Float.compare(a2, 1.0f) == 0 && eis.f27332a) {
            this.e.add(view);
        }
        Context e2 = this.d.e();
        if (e2 == null) {
            e2 = view.getContext();
        }
        a(view, a(e2, view, a2));
        return false;
    }

    private void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        } else if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = new ViewGroup.MarginLayoutParams(layoutParams.width, layoutParams.height);
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        try {
            view.setLayoutParams(layoutParams);
        } catch (Exception e) {
            a("RESIZE_FRAME_SET_LAYOUTPARAMS_ERROR", "setContentViewParams|" + e.getMessage());
        }
    }

    private int a(Context context, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34f83d81", new Object[]{this, context, view, new Float(f)})).intValue();
        }
        if ((eme.b(context) && eis.f27332a) || 1.0f != f) {
            return 0;
        }
        return emh.a(context);
    }

    private boolean a(AURARenderComponent aURARenderComponent) {
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null) {
            return true;
        }
        for (String str : this.b) {
            if (str.equalsIgnoreCase(aURARenderComponentContainer.containerType)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.ate
    public void b(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115e7a3", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else {
            ejh.b(this.d, aURARenderComponent, view);
        }
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else {
            ejh.a(this.f27375a, this.d, aURARenderComponent.key);
        }
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else {
            ejh.b(this.f27375a, this.d, aURARenderComponent.key);
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.c = aqsVar;
        this.f27375a = aURAGlobalData;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.d = qVar;
        this.b.add(ekz.COMPONENT_TYPE);
        this.b.add(ekr.COMPONENT_TYPE);
        this.b.add(elg.COMPONENT_TYPE);
        if (!eis.f27332a) {
            return;
        }
        Context e = this.d.e();
        if (!eme.a(e)) {
            return;
        }
        ((c) e).a(this.f);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        aqs aqsVar = this.c;
        if (aqsVar == null) {
            return;
        }
        aqsVar.a(new b(1, "AliSDetailMainGallery", str, str2));
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!eis.f27332a) {
        } else {
            Context e = this.d.e();
            if (!eme.a(e)) {
                return;
            }
            ((c) e).b(this.f);
        }
    }
}
