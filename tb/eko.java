package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.l;

@AURAExtensionImpl(code = "alidetail.impl.lifecycle.render.end")
/* loaded from: classes4.dex */
public final class eko extends atm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1668947310);
    }

    public static /* synthetic */ Object ipc$super(eko ekoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atm, tb.atf
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a859cf93", new Object[]{this, context});
        }
        return null;
    }

    public static /* synthetic */ DetailCoreActivity a(eko ekoVar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("56d9120e", new Object[]{ekoVar, view}) : ekoVar.a(view);
    }

    public eko() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.AliSMainGalleryLifecycleRenderEndExtension");
    }

    private DetailCoreActivity a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCoreActivity) ipChange.ipc$dispatch("852e38f5", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        if (context instanceof DetailCoreActivity) {
            return (DetailCoreActivity) context;
        }
        return null;
    }

    @Override // tb.atm, tb.atf
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
            return;
        }
        arc.a().a(l.a("AliSMainGalleryLifecycleRenderEndExtension"), "AliSMainGalleryLifecycleRenderEndExtension", "行业化头图 onContentViewCreated");
        if (a(view) == null) {
            return;
        }
        b(view);
    }

    private void b(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        try {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tb.eko.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    View view3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    arc.a().a(l.a("AliSMainGalleryLifecycleRenderEndExtension"), "AliSMainGalleryLifecycleRenderEndExtension", "行业化头图 onLayoutChange");
                    if (view2 == null || (view3 = view) == null) {
                        return;
                    }
                    view3.removeOnLayoutChangeListener(this);
                    if (eko.a(eko.this, view2) == null) {
                        return;
                    }
                    View view4 = view;
                    if (!(view4 instanceof RecyclerView)) {
                        return;
                    }
                    emn.a((RecyclerView) view4);
                }
            });
        } catch (Exception e) {
            arc.a().c(l.a("AliSMainGalleryLifecycleRenderEndExtension"), "onLayoutChange error", e.getMessage());
        }
    }
}
