package com.taobao.android.detail.wrapper.ext.event.subscriber.desc;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.dyd;
import tb.egy;
import tb.eha;
import tb.emu;
import tb.end;
import tb.epe;
import tb.kge;

/* loaded from: classes5.dex */
public class FloatDescFilterFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private end mContainerStructure;
    private a mDescFilterCallBack;
    private View mDescView;
    private dyd mDetailDescController;

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(1502563124);
    }

    public static /* synthetic */ Object ipc$super(FloatDescFilterFragment floatDescFilterFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static FloatDescFilterFragment newDialogInstance(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatDescFilterFragment) ipChange.ipc$dispatch("e77e1314", new Object[]{detailCoreActivity});
        }
        FloatDescFilterFragment floatDescFilterFragment = new FloatDescFilterFragment();
        floatDescFilterFragment.mDetailDescController = new dyd(detailCoreActivity);
        floatDescFilterFragment.mContainerStructure = detailCoreActivity.y().w();
        return floatDescFilterFragment;
    }

    public FloatDescFilterFragment() {
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.desc.FloatDescFilterFragment");
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mDescView == null) {
            for (epe epeVar : ((eha) this.mContainerStructure.d).f27304a) {
                if (epeVar instanceof egy) {
                    this.mDetailDescController.a(epeVar);
                    this.mDescView = this.mDetailDescController.k();
                }
            }
        }
        return this.mDescView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.mDetailDescController.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mDetailDescController.b();
        a aVar = this.mDescFilterCallBack;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mDetailDescController.a(false, false);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.mDetailDescController.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mDetailDescController.d();
        a aVar = this.mDescFilterCallBack;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public void setDescCallBack(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e10771", new Object[]{this, aVar});
        } else {
            this.mDescFilterCallBack = aVar;
        }
    }
}
