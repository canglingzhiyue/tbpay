package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.c;
import com.taobao.taobao.R;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.topmask")
/* loaded from: classes4.dex */
public final class elg extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "aliDetailTopMask";

    static {
        kge.a(-1378588316);
    }

    public static /* synthetic */ Object ipc$super(elg elgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : COMPONENT_TYPE;
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : COMPONENT_TYPE;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        }
    }

    public elg() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.topmask.AliSDetailTopMaskComponentExtension");
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(bay.b(), bay.a(138.0f)));
        view.setBackgroundResource(R.drawable.pic_gallery_anchor_view_gradient_bg);
        a(view);
        return view;
    }

    private void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.c == null) {
        } else {
            Context e = this.c.e();
            if (!eme.a(e)) {
                return;
            }
            view.setAlpha(0.0f);
            ((c) e).a(new elf() { // from class: tb.elg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 639200760) {
                        super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).floatValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.elf, tb.eld
                public void a(int i, int i2, float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
                        return;
                    }
                    super.a(i, i2, f);
                    view.setAlpha(f);
                }
            });
        }
    }
}
