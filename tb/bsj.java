package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.a;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bsj extends bsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1469636112);
    }

    @Override // tb.bsi
    public void a(View view, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5101d9a", new Object[]{this, view, bsqVar});
        } else if (!a(view)) {
        } else {
            bsqVar.c(0.0f);
            bsqVar.a(bsqVar.b());
            bsqVar.a(false);
        }
    }

    public static boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{view})).booleanValue();
        }
        if (!(view instanceof RecyclerView)) {
            return false;
        }
        RecyclerView.Adapter adapter = ((RecyclerView) view).getAdapter();
        if (1 != adapter.getItemCount()) {
            return false;
        }
        AURARenderComponent aURARenderComponent = null;
        if (adapter instanceof bqw) {
            aURARenderComponent = ((bqw) adapter).a(0);
        } else if (adapter instanceof atq) {
            aURARenderComponent = ((atq) adapter).a(0);
        }
        return (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.container == null || !a.b.b.equals(aURARenderComponent.data.container.containerType)) ? false : true;
    }
}
