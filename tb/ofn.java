package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;

/* loaded from: classes8.dex */
public class ofn implements ofp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32003a;
    private RecyclerView b;

    static {
        kge.a(-979395720);
        kge.a(-140060976);
    }

    public static /* synthetic */ RecyclerView a(ofn ofnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("44f2fa3", new Object[]{ofnVar}) : ofnVar.b;
    }

    public static /* synthetic */ String b(ofn ofnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbc4885e", new Object[]{ofnVar}) : ofnVar.f32003a;
    }

    public ofn(String str, RecyclerView recyclerView) {
        this.f32003a = str;
        this.b = recyclerView;
    }

    @Override // tb.ofp
    public void a(int i, final int i2, final int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1660f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        if (this.b.isComputingLayout()) {
            oec.a(new Runnable() { // from class: tb.ofn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ofn.a(ofn.this).getAdapter().notifyItemRangeInserted(i2, i3);
                    } catch (Exception e) {
                        ogg.a(ofn.b(ofn.this), e.getMessage());
                    }
                }
            });
        } else {
            this.b.getAdapter().notifyItemRangeInserted(i2, i3);
        }
    }

    @Override // tb.ofp
    public void a(int i, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        if (this.b.isComputingLayout()) {
            oec.a(new Runnable() { // from class: tb.ofn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ofn.a(ofn.this).getAdapter().notifyItemRangeRemoved(i2, i3);
                    } catch (Exception e) {
                        ogg.a(ofn.b(ofn.this), e.getMessage());
                    }
                }
            });
        } else {
            this.b.getAdapter().notifyItemRangeRemoved(i2, i3);
        }
    }

    @Override // tb.ofp
    public void b(int i, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfaa61a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        if (this.b.isComputingLayout()) {
            oec.a(new Runnable() { // from class: tb.ofn.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ofn.a(ofn.this).getAdapter().notifyItemMoved(i2, i3);
                    } catch (Exception e) {
                        ogg.a(ofn.b(ofn.this), e.getMessage());
                    }
                }
            });
        } else {
            this.b.getAdapter().notifyItemMoved(i2, i3);
        }
    }

    @Override // tb.ofp
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        final HashSet<Integer> hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i2));
        if (this.b.isComputingLayout()) {
            oec.a(new Runnable() { // from class: tb.ofn.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        for (Integer num : hashSet) {
                            ofn.a(ofn.this).getAdapter().notifyItemChanged(num.intValue(), 1);
                        }
                    } catch (Exception e) {
                        ogg.a(ofn.b(ofn.this), e.getMessage());
                    }
                }
            });
            return;
        }
        for (Integer num : hashSet) {
            this.b.getAdapter().notifyItemChanged(num.intValue(), 1);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        if (this.b.isComputingLayout()) {
            oec.a(new Runnable() { // from class: tb.ofn.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ofn.a(ofn.this).getAdapter().notifyDataSetChanged();
                    } catch (Exception e) {
                        ogg.a(ofn.b(ofn.this), e.getMessage());
                    }
                }
            });
        } else {
            this.b.getAdapter().notifyDataSetChanged();
        }
    }
}
