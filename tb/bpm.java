package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class bpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<h> f26035a;
    private final ViewGroup b;
    private final j c;

    static {
        kge.a(-1303706186);
    }

    public abstract List<IDMComponent> a();

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getChildCount() > 0) {
            this.b.removeAllViews();
        }
        if (this.f26035a.size() > 0) {
            this.f26035a.clear();
        }
        List<IDMComponent> a2 = a();
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (IDMComponent iDMComponent : a2) {
            h a3 = this.c.a(this.b, this.c.a(iDMComponent));
            View view = a3.itemView;
            if (view != null) {
                this.b.addView(view);
                this.f26035a.add(a3);
                if (iDMComponent.getStatus() == 0) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            this.c.a(a3, iDMComponent);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<IDMComponent> a2 = a();
        for (int i = 0; i < a2.size(); i++) {
            h hVar = this.f26035a.get(i);
            IDMComponent iDMComponent = a2.get(i);
            this.c.a(hVar, iDMComponent);
            if (iDMComponent.getStatus() == 0) {
                hVar.itemView.setVisibility(8);
            } else {
                hVar.itemView.setVisibility(0);
            }
        }
    }
}
