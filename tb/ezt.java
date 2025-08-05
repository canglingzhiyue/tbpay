package tb;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.i;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;

/* loaded from: classes5.dex */
public class ezt implements DragDismissLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ezs b;

    public ezt(ezs ezsVar) {
        this.b = ezsVar;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void a(DragDismissLayout dragDismissLayout, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa8202", new Object[]{this, dragDismissLayout, view});
        } else {
            ezs.a(this.b, 0.0f);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
            return;
        }
        ezs.a(this.b, true);
        ezs.a(this.b, (float) (1.0d - d));
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void a(DragDismissLayout dragDismissLayout, View view, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef561e7c", new Object[]{this, dragDismissLayout, view, new Double(d)});
            return;
        }
        ezs.a(this.b, false);
        ezs.a(this.b, 1.0f);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void b(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d65975", new Object[]{this, new Double(d)});
            return;
        }
        ezs.a(this.b, true);
        ezs.a(this.b, (float) (1.0d - d));
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void a(DragDismissLayout dragDismissLayout, View view, boolean z, double d) {
        Rect rect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb78116c", new Object[]{this, dragDismissLayout, view, new Boolean(z), new Double(d)});
            return;
        }
        ezs.a(this.b, true);
        if (z) {
            return;
        }
        ezs.a(this.b, d);
        eyu c = ezs.c(this.b);
        ezs ezsVar = this.b;
        i iVar = (i) c.a(ezs.$ipChange.getCurrentItem());
        ezs ezsVar2 = this.b;
        if (ezs.$ipChange != null) {
            ezs ezsVar3 = this.b;
            rect = ezs.$ipChange.a(iVar);
        } else {
            rect = null;
        }
        if (rect == null || rect.isEmpty() || iVar == null) {
            return;
        }
        dragDismissLayout.setTargetViewInitScreenLocation(rect);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void c(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3214", new Object[]{this, new Double(d)});
            return;
        }
        ezs.a(this.b, true);
        ezs.a(this.b, (float) (1.0d - d));
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void b(DragDismissLayout dragDismissLayout, View view, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0d527d", new Object[]{this, dragDismissLayout, view, new Double(d)});
        } else {
            ezs.a(this.b, false);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void d(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad400ab3", new Object[]{this, new Double(d)});
            return;
        }
        ezs.a(this.b, true);
        ezs ezsVar = this.b;
        ezs.a(this.b, (float) (1.0d - (d + ezs.$ipChange)));
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void c(DragDismissLayout dragDismissLayout, View view, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec4867e", new Object[]{this, dragDismissLayout, view, new Double(d)});
        } else {
            ezs.g(this.b);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.a
    public void d(DragDismissLayout dragDismissLayout, View view, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7bba7f", new Object[]{this, dragDismissLayout, view, new Double(d)});
            return;
        }
        this.b.a(true);
        ezs.a(this.b, false);
    }
}
