package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class iue<VIEW, WIDGET> implements iuh<VIEW, WIDGET> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private imn mCore;
    private VIEW mView;
    private WIDGET mWidget;

    static {
        kge.a(-338201933);
        kge.a(-1768594468);
    }

    @Override // tb.iuh
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.iuh
    public void bind(VIEW view, WIDGET widget, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb31b62", new Object[]{this, view, widget, imnVar});
            return;
        }
        this.mView = view;
        this.mWidget = widget;
        this.mCore = imnVar;
    }

    public final imn c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("1e695152", new Object[]{this}) : this.mCore;
    }

    public final VIEW getIView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VIEW) ipChange.ipc$dispatch("78722393", new Object[]{this}) : this.mView;
    }

    public final WIDGET getWidget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WIDGET) ipChange.ipc$dispatch("f3963c91", new Object[]{this}) : this.mWidget;
    }
}
