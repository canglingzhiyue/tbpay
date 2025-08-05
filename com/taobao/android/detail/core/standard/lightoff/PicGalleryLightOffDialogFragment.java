package com.taobao.android.detail.core.standard.lightoff;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Map;
import tb.ejh;
import tb.elq;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryLightOffDialogFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PicGalleryLightOffDialogFragment";
    private FrameLayout mLightOffBackgroundView;
    private FrameLayout mLightOffContainer;
    private c mLightOffView;
    private f mPicGalleryLightOffTransController;
    private boolean mIsShowing = false;
    private boolean mbDismissFromLightOff = false;

    static {
        kge.a(-14794910);
    }

    public static /* synthetic */ Object ipc$super(PicGalleryLightOffDialogFragment picGalleryLightOffDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1373052399:
                super.dismiss();
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
            case 1639966335:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
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
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public PicGalleryLightOffDialogFragment() {
        emu.a("com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffDialogFragment");
    }

    public static String generateFragmentTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb012fa4", new Object[0]);
        }
        return TAG + System.currentTimeMillis();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.picGalleryLightOffDialogStyle);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        setupDialogLayerLevel();
        View inflate = layoutInflater.inflate(R.layout.pic_gallery_light_off_fragment, viewGroup);
        this.mLightOffContainer = (FrameLayout) inflate.findViewById(R.id.picgallery_lightoff_container);
        this.mLightOffBackgroundView = (FrameLayout) inflate.findViewById(R.id.picgallery_lightoff_backgroud);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        c cVar = this.mLightOffView;
        if (cVar == null || cVar.getView() == null) {
            return;
        }
        View view2 = this.mLightOffView.getView();
        ViewGroup viewGroup = (ViewGroup) view2.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view2);
        }
        View a2 = this.mPicGalleryLightOffTransController.a(view, this.mLightOffBackgroundView);
        if (a2 != null) {
            this.mLightOffContainer.addView(a2, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.mLightOffContainer.addView(view2);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        c cVar = this.mLightOffView;
        if (cVar == null) {
            return;
        }
        cVar.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        c cVar = this.mLightOffView;
        if (cVar == null) {
            return;
        }
        cVar.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        c cVar = this.mLightOffView;
        if (cVar == null) {
            return;
        }
        cVar.onPause();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        this.mLightOffContainer.removeAllViews();
        f fVar = this.mPicGalleryLightOffTransController;
        if (fVar == null) {
            return;
        }
        fVar.b();
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        if (!this.mIsShowing) {
            return;
        }
        this.mIsShowing = false;
        c cVar = this.mLightOffView;
        if (cVar != null && !this.mbDismissFromLightOff) {
            cVar.onDismiss();
        }
        this.mLightOffView = null;
        this.mbDismissFromLightOff = false;
        ejh.d(getActivity());
    }

    public void show(elq elqVar, c cVar, FragmentManager fragmentManager, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfd416b", new Object[]{this, elqVar, cVar, fragmentManager, str, map});
        } else if (this.mIsShowing) {
        } else {
            this.mIsShowing = true;
            this.mLightOffView = cVar;
            c cVar2 = this.mLightOffView;
            if (cVar2 != null) {
                cVar2.onShow();
            }
            if (this.mPicGalleryLightOffTransController == null) {
                this.mPicGalleryLightOffTransController = new f(this);
            }
            this.mPicGalleryLightOffTransController.a(elqVar, cVar, map);
            ejh.c(((PicGalleryLightOffWeexView) this.mLightOffView).getContext());
            super.show(fragmentManager, str);
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        this.mbDismissFromLightOff = true;
        f fVar = this.mPicGalleryLightOffTransController;
        if (fVar != null && fVar.a()) {
            return;
        }
        super.dismiss();
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue() : this.mIsShowing;
    }

    private void setupDialogLayerLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ad3f", new Object[]{this});
        } else if (getDialog() == null || getDialog().getWindow() == null) {
        } else {
            Window window = getDialog().getWindow();
            window.setType(1000);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
