package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class ius<BEEN, ROOT_VIEW extends View, MODEL> extends iup<BEEN, ROOT_VIEW, MODEL> implements iuk<BEEN, ROOT_VIEW> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAttached;
    public final ViewGroup mContainer;
    private iur mSetter;

    static {
        kge.a(-1154757402);
        kge.a(2060400277);
    }

    public static /* synthetic */ Object ipc$super(ius iusVar, String str, Object... objArr) {
        if (str.hashCode() == 302831676) {
            super.destroyAndRemoveFromParent();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
        }
    }

    public abstract ROOT_VIEW onCreateView();

    public void resetViewAndProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e4c241f", new Object[]{this});
        }
    }

    public ius(Activity activity, ium iumVar, MODEL model, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, model);
        this.mContainer = viewGroup;
        this.mSetter = iurVar;
    }

    @Override // tb.iup
    public ROOT_VIEW obtainRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ROOT_VIEW) ipChange.ipc$dispatch("40b8ce75", new Object[]{this}) : onCreateView();
    }

    @Override // tb.iut, tb.iul
    public void destroyAndRemoveFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cd83c", new Object[]{this});
            return;
        }
        removeFromContainer();
        super.destroyAndRemoveFromParent();
    }

    @Override // tb.iuk
    public final void attachToContainer(iur iurVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3bccb2", new Object[]{this, iurVar});
        } else if (isAttached()) {
            logError("error trying to attach a component which is already attached");
        } else {
            this.mSetter = iurVar;
            attachToContainer();
        }
    }

    @Override // tb.iuk
    public final void attachToContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cab40c8", new Object[]{this});
            return;
        }
        ensureView();
        if (this.mSetter == null) {
            logWarn("trying attach with out setter");
        } else if (isAttached()) {
        } else {
            if (this.mView == null) {
                logError("view not created after ensureView()");
                return;
            }
            this.mSetter.a(this.mView);
            this.mAttached = true;
        }
    }

    public final void removeFromContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8affe4da", new Object[]{this});
        } else if (!isAttached() || this.mView == null) {
        } else {
            iur iurVar = this.mSetter;
            if (iurVar == null) {
                logError("remove from container while setter == null");
                return;
            }
            iurVar.b(this.mView);
            this.mAttached = false;
        }
    }

    public final boolean isAttached() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue() : this.mAttached;
    }

    public final void setSetter(iur iurVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a350f72", new Object[]{this, iurVar});
        } else if (isAttached()) {
            logError("error change setter while attached");
        } else {
            this.mSetter = iurVar;
        }
    }

    public iur getSetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iur) ipChange.ipc$dispatch("497efd84", new Object[]{this}) : this.mSetter;
    }

    public final void reuseView(iur iurVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe48ea", new Object[]{this, iurVar, new Boolean(z)});
            return;
        }
        ROOT_VIEW view = getView();
        if (view == null) {
            this.mSetter = iurVar;
            return;
        }
        if (this.mAttached) {
            iur iurVar2 = this.mSetter;
            if (iurVar2 == null) {
                logError("reuse view while setter no exits,trying remove from parent");
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            } else {
                iurVar2.b(view);
            }
            this.mAttached = false;
        }
        if (z) {
            resetViewAndProperty();
        }
        this.mSetter = iurVar;
    }

    public final ViewGroup getContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("c9c16903", new Object[]{this}) : this.mContainer;
    }
}
