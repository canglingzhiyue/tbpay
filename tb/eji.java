package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Enumeration;
import tb.atn;

/* loaded from: classes4.dex */
public class eji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f27344a = new Handler(Looper.getMainLooper());
    private Runnable b;
    private ejh c;

    static {
        kge.a(877318847);
    }

    public static /* synthetic */ void a(eji ejiVar, AURAGlobalData aURAGlobalData, q qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a987cf99", new Object[]{ejiVar, aURAGlobalData, qVar, new Boolean(z)});
        } else {
            ejiVar.a(aURAGlobalData, qVar, z);
        }
    }

    public eji(ejh ejhVar) {
        this.c = ejhVar;
        emu.a("com.taobao.android.detail.core.standard.base.lifecycle.ComponentLifecycleController");
    }

    public void a(AURAGlobalData aURAGlobalData, q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e95cb1", new Object[]{this, aURAGlobalData, qVar, str});
            return;
        }
        try {
            a(aURAGlobalData, qVar, str, true);
        } catch (Throwable th) {
            ejf.c("ComponentLifecycleImpl", "onAppear exception: " + th.getMessage());
        }
    }

    public void b(AURAGlobalData aURAGlobalData, q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fec10", new Object[]{this, aURAGlobalData, qVar, str});
            return;
        }
        try {
            a(aURAGlobalData, qVar, str, false);
        } catch (Throwable th) {
            ejf.c("ComponentLifecycleImpl", "onDisappear exception: " + th.getMessage());
        }
    }

    public void a(q qVar, AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b751c88", new Object[]{this, qVar, aURARenderComponent, view});
            return;
        }
        try {
            this.c.a(qVar.e(), aURARenderComponent.key);
        } catch (Throwable th) {
            ejf.c("ComponentLifecycleImpl", "onBeforeItemViewRender exception: " + th.getMessage());
        }
    }

    public void b(q qVar, AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f1b249", new Object[]{this, qVar, aURARenderComponent, view});
            return;
        }
        try {
            this.c.a(qVar.e(), aURARenderComponent.key);
        } catch (Throwable th) {
            ejf.c("ComponentLifecycleImpl", "onAfterItemViewRender exception: " + th.getMessage());
        }
    }

    private boolean b(q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e7be860", new Object[]{this, qVar, str})).booleanValue();
        }
        ejg a2 = this.c.a(qVar.e(), str);
        if (a2 == null) {
            return false;
        }
        a2.c();
        return true;
    }

    public boolean a(q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af0ca9f", new Object[]{this, qVar, str})).booleanValue();
        }
        ejg a2 = this.c.a(qVar.e(), str);
        if (a2 == null) {
            return false;
        }
        a2.d();
        return true;
    }

    private void a(final AURAGlobalData aURAGlobalData, final q qVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42ec43", new Object[]{this, aURAGlobalData, qVar, str, new Boolean(z)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (z && b(qVar, str)) {
                return;
            }
            if ((!z && a(qVar, str)) || !ekr.COMPONENT_TYPE.equalsIgnoreCase(str)) {
                return;
            }
            if (!z) {
                a();
                this.b = new Runnable() { // from class: tb.eji.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            eji.a(eji.this, aURAGlobalData, qVar, false);
                        }
                    }
                };
                this.f27344a.postDelayed(this.b, 100L);
                return;
            }
            a();
            this.b = new Runnable() { // from class: tb.eji.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        eji.a(eji.this, aURAGlobalData, qVar, true);
                    }
                }
            };
            this.f27344a.postDelayed(this.b, 100L);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Runnable runnable = this.b;
        if (runnable == null) {
            return;
        }
        this.f27344a.removeCallbacks(runnable);
    }

    private void a(AURAGlobalData aURAGlobalData, q qVar, boolean z) {
        AURARenderComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f60990d", new Object[]{this, aURAGlobalData, qVar, new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
        if (recyclerView == null) {
            ejf.c("ComponentLifecycleImpl", "notifyVisibleFrame recyclerView is null");
        } else if (recyclerView.getChildCount() == 0) {
            ejf.c("ComponentLifecycleImpl", "notifyVisibleFrame child count of RecyclerView is 0");
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (!(adapter instanceof atq)) {
                if (baw.a()) {
                    throw new IllegalStateException("RecyclerView's adapter is not IAURARenderContainerAdapter");
                }
                return;
            }
            int a3 = emj.a(recyclerView, false);
            if (a3 < 0) {
                ejf.c("ComponentLifecycleImpl", "notifyVisibleFrame firstVisibleItemIndex is less than 0");
                return;
            }
            int min = Math.min(emj.b(recyclerView, false) + 1, adapter.getItemCount());
            while (a3 < min) {
                try {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(a3);
                    if (!(findViewHolderForAdapterPosition instanceof atn.a)) {
                        ejf.c("ComponentLifecycleImpl", "notifyVisibleFrame " + a3 + " of RecycleView's viewHolder is not AURAContainerViewHolder");
                    } else if (findViewHolderForAdapterPosition.itemView != null && (a2 = ((atn.a) findViewHolderForAdapterPosition).a()) != null) {
                        if (z) {
                            b(qVar, a2.key);
                        } else {
                            a(qVar, a2.key);
                        }
                    }
                    a3++;
                } catch (Throwable th) {
                    ejf.c("ComponentLifecycleImpl", "notifyVisibleFrame exception:" + th.getMessage());
                    baw.a(th);
                    return;
                }
            }
        }
    }

    public void a(boolean z, RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888c0da9", new Object[]{this, new Boolean(z), recyclerView, new Integer(i)});
            return;
        }
        Enumeration<ejg> a2 = this.c.a(recyclerView.getContext());
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                a2.nextElement();
            } catch (Throwable th) {
                ejf.c("ComponentLifecycleImpl", "onScrollStateChanged exception: " + th.getMessage());
                return;
            }
        }
    }

    public void a(boolean z, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f61a7a", new Object[]{this, new Boolean(z), recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        Enumeration<ejg> a2 = this.c.a(recyclerView.getContext());
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                a2.nextElement();
            } catch (Throwable th) {
                ejf.c("ComponentLifecycleImpl", "onScrolled exception: " + th.getMessage());
                return;
            }
        }
    }

    public void a(Context context, ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79195c2b", new Object[]{this, context, ekkVar});
            return;
        }
        Enumeration<ejg> a2 = this.c.a(context);
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                a2.nextElement();
            } catch (Throwable th) {
                ejf.c("ComponentLifecycleImpl", "onFrameComponentShown exception: " + th.getMessage());
                return;
            }
        }
    }

    public void a(RecyclerView recyclerView, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9e40dc", new Object[]{this, recyclerView, view, new Integer(i), new Integer(i2)});
            return;
        }
        Enumeration<ejg> a2 = this.c.a(recyclerView.getContext());
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                a2.nextElement();
            } catch (Throwable th) {
                ejf.c("ComponentLifecycleImpl", "onPicGalleryExpand exception: " + th.getMessage());
                return;
            }
        }
    }

    public void b(RecyclerView recyclerView, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cdc8fb", new Object[]{this, recyclerView, view, new Integer(i), new Integer(i2)});
            return;
        }
        Enumeration<ejg> a2 = this.c.a(recyclerView.getContext());
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                a2.nextElement();
            } catch (Throwable th) {
                ejf.c("ComponentLifecycleImpl", "onPicGalleryExitExpand exception: " + th.getMessage());
                return;
            }
        }
    }

    public void a(Context context) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        Runnable runnable = this.b;
        if (runnable == null || (handler = this.f27344a) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }
}
