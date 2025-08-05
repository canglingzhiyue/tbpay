package com.taobao.android.sku.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.app.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.presenter.c;
import com.taobao.android.sku.presenter.e;
import com.taobao.android.sku.utils.o;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes6.dex */
public class SkuDialogFragment extends AppCompatDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mAnimRes;
    private DialogInterface.OnDismissListener mDismissListener;
    private int mGravity;
    private boolean mHasSetWindowAttributes;
    private int mHeightDimens;
    private boolean mIsShowing;
    private e mLifecycleCallback;
    private c.a mOnBackPressedListener;
    private View mView;
    private int mWidthDimens;
    private int mXOff;
    private int mYOff;

    static {
        kge.a(1916088335);
    }

    public static /* synthetic */ Object ipc$super(SkuDialogFragment skuDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1840095042:
                super.setupDialog((Dialog) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1639966335:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ c.a access$000(SkuDialogFragment skuDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("f5715c16", new Object[]{skuDialogFragment}) : skuDialogFragment.mOnBackPressedListener;
    }

    public static /* synthetic */ int access$100(SkuDialogFragment skuDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25132b8d", new Object[]{skuDialogFragment})).intValue() : skuDialogFragment.mAnimRes;
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue() : this.mIsShowing || (getDialog() != null && getDialog().isShowing());
    }

    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.mView = view;
        }
    }

    @Override // android.support.v7.app.AppCompatDialogFragment, android.support.v4.app.DialogFragment
    /* renamed from: onCreateDialog */
    public Dialog mo1438onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("cc7a75a5", new Object[]{this, bundle});
        }
        setStyle(1, 0);
        return new h(getContext(), getTheme()) { // from class: com.taobao.android.sku.widget.SkuDialogFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 143326307) {
                    super.onBackPressed();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.app.Dialog
            public void onBackPressed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88afc63", new Object[]{this});
                } else if (SkuDialogFragment.access$000(SkuDialogFragment.this) != null && SkuDialogFragment.access$000(SkuDialogFragment.this).a()) {
                } else {
                    super.onBackPressed();
                }
            }
        };
    }

    @Override // android.support.v7.app.AppCompatDialogFragment, android.support.v4.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925260be", new Object[]{this, dialog, new Integer(i)});
            return;
        }
        super.setupDialog(dialog, i);
        Window window = dialog.getWindow();
        window.setSoftInputMode(51);
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        window.addFlags(67108864);
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        if (this.mIsShowing) {
            return;
        }
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.set(this, false);
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.set(this, true);
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        } catch (Throwable th) {
            super.show(fragmentManager, str);
            o.b("fragment show error : " + th.getMessage());
        }
        this.mIsShowing = true;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : this.mView;
    }

    public void initWindow(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b405587", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        this.mHasSetWindowAttributes = true;
        this.mWidthDimens = i;
        this.mHeightDimens = i2;
        this.mGravity = i3;
        this.mXOff = i4;
        this.mYOff = i5;
        this.mAnimRes = i6;
    }

    private void initWindowInternal(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f480bd", new Object[]{this, dialog});
            return;
        }
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = this.mGravity;
        attributes.width = this.mWidthDimens;
        attributes.height = this.mHeightDimens;
        attributes.x = this.mXOff;
        attributes.y = this.mYOff;
        attributes.windowAnimations = this.mAnimRes;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(17170445);
        window.clearFlags(131072);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        if (getDialog() == null || !this.mHasSetWindowAttributes) {
            return;
        }
        initWindowInternal(getDialog());
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        e eVar = this.mLifecycleCallback;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        e eVar = this.mLifecycleCallback;
        if (eVar != null) {
            eVar.b();
        }
        if (this.mView == null || getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        final Window window = getDialog().getWindow();
        this.mView.post(new Runnable() { // from class: com.taobao.android.sku.widget.SkuDialogFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    window.setWindowAnimations(SkuDialogFragment.access$100(SkuDialogFragment.this));
                }
            }
        });
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        e eVar = this.mLifecycleCallback;
        if (eVar == null) {
            return;
        }
        eVar.c();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setWindowAnimations(0);
        }
        e eVar = this.mLifecycleCallback;
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        this.mIsShowing = false;
        DialogInterface.OnDismissListener onDismissListener = this.mDismissListener;
        if (onDismissListener == null) {
            return;
        }
        onDismissListener.onDismiss(dialogInterface);
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        } else {
            this.mDismissListener = onDismissListener;
        }
    }

    public void setOnBackPressedListener(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a457590", new Object[]{this, aVar});
        } else {
            this.mOnBackPressedListener = aVar;
        }
    }

    public void setPresenterLifecycleCallback(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb9d506", new Object[]{this, eVar});
        } else {
            this.mLifecycleCallback = eVar;
        }
    }
}
