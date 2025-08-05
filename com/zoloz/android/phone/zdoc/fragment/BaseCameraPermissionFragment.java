package com.zoloz.android.phone.zdoc.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.speech.util.e;
import com.taobao.taobao.R;
import com.zoloz.android.phone.zdoc.camera.widget.CameraSurfaceView;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class BaseCameraPermissionFragment extends BaseFragment implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 1;
    private boolean isFirst = true;
    private CameraSurfaceView mCameraSurfaceView;
    public View mRootView;

    static {
        kge.a(-1766300545);
        kge.a(1968282841);
    }

    public static /* synthetic */ Object ipc$super(BaseCameraPermissionFragment baseCameraPermissionFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 602429250) {
            super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    public abstract void alertCameraNoPermissionDialog(a aVar);

    public abstract void alertSystemError();

    public abstract int getLayoutId();

    public abstract void onCameraInit();

    public abstract void onInitView();

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View view = this.mRootView;
        if (view == null) {
            try {
                this.mRootView = layoutInflater.inflate(getLayoutId(), viewGroup, false);
            } catch (Exception e) {
                BioLog.e("BaseCameraPermissionFragment", e);
                alertSystemError();
            }
            initView();
        } else {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mRootView);
            }
        }
        return this.mRootView;
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mCameraSurfaceView = (CameraSurfaceView) findViewById(R.id.surface);
        this.mCameraSurfaceView.setVisibility(4);
        this.mCameraSurfaceView.setFocusable(true);
        onInitView();
        onCameraInit();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mCameraSurfaceView.setVisibility(0);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mCameraSurfaceView.setVisibility(4);
    }

    public void checkCameraPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ba83", new Object[]{this});
        } else if (!this.isFirst) {
            alertCameraNoPermissionDialog(this);
        } else {
            this.isFirst = false;
            if (hasCameraPermission()) {
                dealCameraHasPermission();
            } else {
                requestPermissions(new String[]{e.CAMERA}, 1);
            }
        }
    }

    public boolean hasCameraPermission() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c528eb19", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(getActivity(), e.CAMERA) == 0;
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            dealCameraHasPermission();
        } else {
            alertCameraNoPermissionDialog(this);
        }
    }

    public void dealCameraHasPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae3dc15f", new Object[]{this});
        } else if (this.mCameraSurfaceView == null) {
        } else {
            onCameraInit();
            this.mCameraSurfaceView.setVisibility(0);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.a
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + getContext().getPackageName()));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        startActivity(intent);
    }

    public View findViewById(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}) : this.mRootView.findViewById(i);
    }
}
