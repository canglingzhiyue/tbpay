package com.zoloz.android.phone.zdoc.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rri;
import tb.rrl;
import tb.rrm;

/* loaded from: classes9.dex */
public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback, AbsSurfaceView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static rrm mCameraInterface;
    public rrl mCameraCallback;
    public Context mContext;
    public float mPreviewRate;
    public SurfaceHolder mSurfaceHolder;

    static {
        kge.a(2110971159);
        kge.a(632307482);
        kge.a(-1241171754);
        mCameraInterface = null;
    }

    public CameraSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context.getApplicationContext();
        this.mPreviewRate = DisplayUtil.getScreenRate(this.mContext);
        this.mSurfaceHolder = getHolder();
        this.mSurfaceHolder.setFormat(-2);
        this.mSurfaceHolder.setType(3);
        this.mSurfaceHolder.addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        BioLog.i("surfaceCreated...");
        rrm rrmVar = mCameraInterface;
        if (rrmVar != null) {
            rrmVar.a(this.mCameraCallback);
        }
        try {
            if (mCameraInterface != null) {
                mCameraInterface.b();
            }
            rrl rrlVar = this.mCameraCallback;
            if (rrlVar == null) {
                return;
            }
            rrlVar.onSurfaceCreated();
        } catch (Exception unused) {
            rrl rrlVar2 = this.mCameraCallback;
            if (rrlVar2 == null) {
                return;
            }
            rrlVar2.onError(-1);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        BioLog.i("surfaceChanged...");
        rrm rrmVar = mCameraInterface;
        if (rrmVar == null) {
            return;
        }
        try {
            rrmVar.a(this.mSurfaceHolder, this.mPreviewRate, i2, i3);
        } catch (Exception unused) {
        }
        if (this.mCameraCallback == null) {
            return;
        }
        int e = mCameraInterface.e();
        if (e == 90 || e == 270) {
            i2 = mCameraInterface.i();
            i3 = mCameraInterface.h();
        } else if (e == 0 || e == 180) {
            i2 = mCameraInterface.h();
            i3 = mCameraInterface.i();
        }
        this.mCameraCallback.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        BioLog.i("surfaceDestroyed...");
        rrm rrmVar = mCameraInterface;
        if (rrmVar != null) {
            rrmVar.c();
            mCameraInterface.a((rrl) null);
        }
        rrl rrlVar = this.mCameraCallback;
        if (rrlVar == null) {
            return;
        }
        rrlVar.onSurfaceDestroyed();
    }

    @Deprecated
    public static rrm getCameraImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrm) ipChange.ipc$dispatch("d2dd313", new Object[]{context});
        }
        if (mCameraInterface == null) {
            mCameraInterface = new rri(context);
        }
        return mCameraInterface;
    }

    public static void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
        } else {
            mCameraInterface = null;
        }
    }

    @Override // com.zoloz.android.phone.zdoc.camera.widget.AbsSurfaceView
    public void setCameraCallback(rrl rrlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9513d7", new Object[]{this, rrlVar});
        } else {
            this.mCameraCallback = rrlVar;
        }
    }
}
