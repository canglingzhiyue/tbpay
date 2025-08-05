package com.alipay.zoloz.toyger.widget;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.mobile.security.bio.config.bean.Coll;
import com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.widget.CameraCanvasSurfaceView;
import com.alipay.zoloz.hardware.camera.widget.CameraGLSurfaceView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class CameraSurfaceViewWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static CameraSurfaceViewWrapper f6301a;
    private CameraGLSurfaceView b;
    private CameraCanvasSurfaceView c;
    private boolean d;

    private CameraSurfaceViewWrapper(DeviceSetting[] deviceSettingArr, Coll coll) {
        if (coll != null && coll.getPreviewStyle() != null && coll.getPreviewStyle().equals("sys")) {
            this.d = false;
        } else {
            this.d = true;
        }
    }

    public static CameraSurfaceViewWrapper newInstance(DeviceSetting[] deviceSettingArr, Coll coll) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraSurfaceViewWrapper) ipChange.ipc$dispatch("fb827241", new Object[]{deviceSettingArr, coll});
        }
        CameraSurfaceViewWrapper cameraSurfaceViewWrapper = new CameraSurfaceViewWrapper(deviceSettingArr, coll);
        f6301a = cameraSurfaceViewWrapper;
        return cameraSurfaceViewWrapper;
    }

    public static void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
        } else {
            f6301a = null;
        }
    }

    public static CameraSurfaceViewWrapper getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraSurfaceViewWrapper) ipChange.ipc$dispatch("95140007", new Object[0]) : f6301a;
    }

    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
        } else if (this.d) {
            if (view == null) {
                return;
            }
            this.b = (CameraGLSurfaceView) view.findViewById(R.id.toyger_circle_surfaceview_gl);
        } else if (view == null) {
        } else {
            this.c = (CameraCanvasSurfaceView) view.findViewById(R.id.toyger_circle_surfaceview_canvas);
        }
    }

    public FrameLayout.LayoutParams getLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b1ecf96", new Object[]{this});
        }
        if (this.d) {
            CameraGLSurfaceView cameraGLSurfaceView = this.b;
            if (cameraGLSurfaceView == null) {
                return null;
            }
            return (FrameLayout.LayoutParams) cameraGLSurfaceView.getLayoutParams();
        }
        CameraCanvasSurfaceView cameraCanvasSurfaceView = this.c;
        if (cameraCanvasSurfaceView == null) {
            return null;
        }
        return (FrameLayout.LayoutParams) cameraCanvasSurfaceView.getLayoutParams();
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b960bfa0", new Object[]{this, layoutParams});
        } else if (this.d) {
            CameraGLSurfaceView cameraGLSurfaceView = this.b;
            if (cameraGLSurfaceView == null) {
                return;
            }
            cameraGLSurfaceView.setLayoutParams(layoutParams);
        } else {
            CameraCanvasSurfaceView cameraCanvasSurfaceView = this.c;
            if (cameraCanvasSurfaceView == null) {
                return;
            }
            cameraCanvasSurfaceView.setLayoutParams(layoutParams);
        }
    }

    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else if (this.d) {
            CameraGLSurfaceView cameraGLSurfaceView = this.b;
            if (cameraGLSurfaceView == null) {
                return;
            }
            cameraGLSurfaceView.setBackgroundColor(i);
        } else {
            CameraCanvasSurfaceView cameraCanvasSurfaceView = this.c;
            if (cameraCanvasSurfaceView == null) {
                return;
            }
            cameraCanvasSurfaceView.setBackgroundColor(i);
        }
    }

    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
        } else if (this.d) {
            CameraGLSurfaceView cameraGLSurfaceView = this.b;
            if (cameraGLSurfaceView == null) {
                return;
            }
            cameraGLSurfaceView.setVisibility(i);
        } else {
            CameraCanvasSurfaceView cameraCanvasSurfaceView = this.c;
            if (cameraCanvasSurfaceView == null) {
                return;
            }
            cameraCanvasSurfaceView.setVisibility(i);
        }
    }

    public ICameraInterface getCameraImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICameraInterface) ipChange.ipc$dispatch("fafd2945", new Object[]{this, context});
        }
        if (this.d) {
            return CameraGLSurfaceView.getCameraImpl(context);
        }
        return CameraCanvasSurfaceView.getCameraImpl(context);
    }

    public void setCameraCallback(ICameraCallback iCameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fe22b6", new Object[]{this, iCameraCallback});
        } else if (this.d) {
            CameraGLSurfaceView cameraGLSurfaceView = this.b;
            if (cameraGLSurfaceView == null) {
                return;
            }
            cameraGLSurfaceView.setCameraCallback(iCameraCallback);
        } else {
            CameraCanvasSurfaceView cameraCanvasSurfaceView = this.c;
            if (cameraCanvasSurfaceView == null) {
                return;
            }
            cameraCanvasSurfaceView.setCameraCallback(iCameraCallback);
        }
    }

    public String getCameraName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5844773", new Object[]{this});
        }
        if (this.d) {
            return CameraGLSurfaceView.getCameraName();
        }
        return CameraCanvasSurfaceView.getCameraName();
    }

    public boolean invalidateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52e40f0b", new Object[]{this})).booleanValue() : this.d ? this.b != null : this.c != null;
    }
}
