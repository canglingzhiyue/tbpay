package com.taobao.taobao.scancode.huoyan.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.taobao.util.k;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class KaDialogFragment extends DialogFragment implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "KaDialogFragment";
    private boolean isShow;
    public a mKaCallback;
    private View.OnClickListener onClickListener;

    static {
        kge.a(1545314773);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(KaDialogFragment kaDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1062113567:
                return new Integer(super.show((FragmentTransaction) objArr[0], (String) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -185779930:
                super.onCancel((DialogInterface) objArr[0]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        try {
            super.onStart();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    private void remove(FragmentTransaction fragmentTransaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d938eb5", new Object[]{this, fragmentTransaction, str});
        } else if (fragmentTransaction == null) {
        } else {
            try {
                Fragment findFragmentByTag = getFragmentManager().findFragmentByTag(str);
                if (findFragmentByTag == null) {
                    return;
                }
                String str2 = "#####find dialog" + str;
                fragmentTransaction.remove(findFragmentByTag);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public synchronized int show(FragmentTransaction fragmentTransaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0b16ee1", new Object[]{this, fragmentTransaction, str})).intValue();
        }
        if (this.isShow) {
            remove(fragmentTransaction, str);
        }
        this.isShow = true;
        try {
            return super.show(fragmentTransaction, str);
        } catch (IllegalStateException e) {
            k.a(TAG, "show dialogFragment error is " + e.getLocalizedMessage());
            return -1;
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public synchronized void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bfe67f", new Object[]{this, fragmentManager, str});
            return;
        }
        if (fragmentManager != null) {
            show(fragmentManager.beginTransaction(), str);
        }
    }

    public boolean isShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc734052", new Object[]{this})).booleanValue() : this.isShow;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setStyle(2, getTheme());
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.isShow = true;
    }

    public void setKaCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af420f9", new Object[]{this, aVar});
        } else {
            this.mKaCallback = aVar;
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.onClickListener = onClickListener;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            return;
        }
        super.onCancel(dialogInterface);
        a aVar = this.mKaCallback;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        this.isShow = false;
        a aVar = this.mKaCallback;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        if (view != null) {
            view.setOnClickListener(this);
        }
        if (getDialog() != null) {
            getDialog().setCanceledOnTouchOutside(true);
        }
        super.onViewCreated(view, bundle);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        View.OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dismissAllowingStateLoss();
    }
}
