package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class boy implements boz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-908360990);
        kge.a(-745436470);
    }

    @Override // tb.boz
    public RecyclerView.LayoutManager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("9b5f6525", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.boz
    public void a(bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, bnvVar});
        }
    }

    @Override // tb.boz
    public void a(bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e215f60b", new Object[]{this, bnyVar});
        }
    }

    @Override // tb.boz
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.boz
    public bnn b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnn) ipChange.ipc$dispatch("16b4811b", new Object[]{this});
        }
        return null;
    }
}
