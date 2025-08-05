package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class iup<BEEN, ROOT_VIEW extends View, MODEL> extends iut implements iui<BEEN, ROOT_VIEW> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MODEL mModel;
    public ROOT_VIEW mView;

    static {
        kge.a(1898653822);
        kge.a(2022974125);
    }

    public void bindWithData(BEEN been) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, been});
        }
    }

    public abstract void findAllViews();

    public abstract ROOT_VIEW obtainRootView();

    public iup(Activity activity, ium iumVar, MODEL model) {
        super(activity, iumVar);
        this.mModel = model;
    }

    @Override // tb.iui
    public final void ensureView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace3c70a", new Object[]{this});
        } else if (this.mView != null) {
        } else {
            this.mView = obtainRootView();
            findAllViews();
        }
    }

    public MODEL getModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MODEL) ipChange.ipc$dispatch("b4c825f8", new Object[]{this}) : this.mModel;
    }

    @Override // tb.iut
    public View findView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("86c73ae0", new Object[]{this, new Integer(i)});
        }
        ROOT_VIEW root_view = this.mView;
        if (root_view != null) {
            return root_view.findViewById(i);
        }
        return null;
    }

    @Override // tb.iui
    public final ROOT_VIEW getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ROOT_VIEW) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mView;
    }

    public final boolean isViewCreated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("31498504", new Object[]{this})).booleanValue() : this.mView != null;
    }
}
