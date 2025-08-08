package com.alipay.zoloz.hardware.camera.abs;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.alipay.zoloz.hardware.camera.CameraCallback;
import com.alipay.zoloz.hardware.camera.data.CameraData;
import com.alipay.zoloz.hardware.camera.fps.FpsCallback;
import com.alipay.zoloz.hardware.camera.fps.FpsTask;
import com.alipay.zoloz.hardware.camera.param.AbsCameraParam;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes3.dex */
public abstract class AbsCamera<Param extends AbsCameraParam, Data extends CameraData> implements SurfaceTexture.OnFrameAvailableListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AbsCamera";

    /* renamed from: a  reason: collision with root package name */
    public final List<CameraCallback<Param, Data>> f6231a = new ArrayList();
    public final List<SurfaceTexture.OnFrameAvailableListener> b = new ArrayList();
    public final FpsTask c;
    public Param d;
    private final Handler e;

    /* loaded from: classes3.dex */
    public class CameraHandler extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public CameraHandler(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(CameraHandler cameraHandler, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 0) {
                AbsCamera.this.doStop();
            } else if (i == 1) {
                AbsCamera.this.doStart();
            } else if (i == 2) {
                try {
                    ((Runnable) message.obj).run();
                } catch (Throwable th) {
                    Log.w(AbsCamera.TAG, th);
                }
            }
            super.handleMessage(message);
        }
    }

    /* loaded from: classes3.dex */
    public static class PreviewTexture {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public SurfaceTexture surfaceTexture;
        public int textureId;

        public PreviewTexture(int i, SurfaceTexture surfaceTexture) {
            this.textureId = i;
            this.surfaceTexture = surfaceTexture;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "PreviewTexture{textureId=" + this.textureId + ", surfaceTexture=" + this.surfaceTexture + '}';
        }
    }

    public abstract void a(int i, ByteBuffer byteBuffer);

    public abstract void doStart();

    public abstract void doStop();

    public abstract PreviewTexture getPreview();

    public static int length(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18724f09", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i3 == 0) {
            return ((i * i2) * 3) / 2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return 0;
                    }
                }
            }
            return i * i2 * 3;
        }
        return (i * i2) << 2;
    }

    public AbsCamera(Looper looper, String str, FpsCallback fpsCallback) {
        this.e = new CameraHandler(looper);
        this.c = new FpsTask(str, fpsCallback);
    }

    public Param getCameraParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Param) ipChange.ipc$dispatch("ca3b744b", new Object[]{this}) : this.d;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, AccsConnection.DATA_PACKAGE_MAX, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    public void addOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20526785", new Object[]{this, onFrameAvailableListener});
            return;
        }
        synchronized (this.b) {
            if (this.b.contains(onFrameAvailableListener)) {
                Log.w(TAG, getClass().getSimpleName() + ".addOnFrameAvailableListener(" + onFrameAvailableListener + ") repeat : mListeners=" + StringUtils.join("_", this.b));
            } else {
                Log.d(TAG, getClass().getSimpleName() + ".addOnFrameAvailableListener(" + onFrameAvailableListener + riy.BRACKET_END_STR);
                this.b.add(onFrameAvailableListener);
            }
        }
    }

    public void removeOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d72ef328", new Object[]{this, onFrameAvailableListener});
            return;
        }
        Log.w(TAG, "removeOnFrameAvailableListener called for " + onFrameAvailableListener + " at stack " + android.util.Log.getStackTraceString(new Throwable()));
        synchronized (this.b) {
            if (this.b.contains(onFrameAvailableListener)) {
                Log.d(TAG, getClass().getSimpleName() + ".removeOnFrameAvailableListener(" + onFrameAvailableListener + riy.BRACKET_END_STR);
                this.b.remove(onFrameAvailableListener);
            } else {
                Log.w(TAG, getClass().getSimpleName() + ".removeOnFrameAvailableListener(" + onFrameAvailableListener + ") not exist : mListeners=" + StringUtils.join("_", this.b));
            }
        }
    }

    public final void addCallback(CameraCallback<Param, Data> cameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60647f83", new Object[]{this, cameraCallback});
            return;
        }
        Log.w(TAG, "addCallback called for " + cameraCallback + " at stack " + android.util.Log.getStackTraceString(new Throwable()));
        synchronized (this.f6231a) {
            if (this.f6231a.contains(cameraCallback)) {
                Log.w(TAG, getClass().getSimpleName() + ".addCallback(" + cameraCallback + ") repeat : mCallbacks=" + StringUtils.join("_", this.f6231a));
            } else {
                Log.d(TAG, getClass().getSimpleName() + ".addCallback(" + cameraCallback + riy.BRACKET_END_STR);
                this.f6231a.add(cameraCallback);
            }
        }
    }

    public final void removeCallback(CameraCallback<Param, Data> cameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9785a80", new Object[]{this, cameraCallback});
            return;
        }
        Log.w(TAG, "removeCallback called for " + cameraCallback + " at stack " + android.util.Log.getStackTraceString(new Throwable()));
        synchronized (this.f6231a) {
            if (this.f6231a.contains(cameraCallback)) {
                Log.d(TAG, getClass().getSimpleName() + ".removeCallback(" + cameraCallback + riy.BRACKET_END_STR);
                this.f6231a.remove(cameraCallback);
            } else {
                Log.v(TAG, getClass().getSimpleName() + ".removeCallback(" + cameraCallback + ") not exist : mCallbacks=" + StringUtils.join("_", this.f6231a));
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e997ed", new Object[]{this, surfaceTexture});
            return;
        }
        Log.d(TAG, "onFrameAvailable called for surfaceTexture" + System.identityHashCode(surfaceTexture));
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                for (SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener : this.b) {
                    onFrameAvailableListener.onFrameAvailable(surfaceTexture);
                }
            }
        }
    }

    public final void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        synchronized (this.f6231a) {
            if (!this.f6231a.isEmpty()) {
                for (CameraCallback<Param, Data> cameraCallback : this.f6231a) {
                    cameraCallback.cameraError(i, i2, str);
                }
            }
        }
    }

    public void postTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3198ca", new Object[]{this, runnable});
            return;
        }
        Handler handler = this.e;
        if (handler == null) {
            Log.w(TAG, new IllegalStateException("null == mHandler"));
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.obj = runnable;
        this.e.sendMessage(obtainMessage);
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Log.w(TAG, "start called at stack " + android.util.Log.getStackTraceString(new Throwable()));
        this.e.removeMessages(1);
        this.e.removeMessages(0);
        this.e.sendEmptyMessage(1);
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Log.w(TAG, "stop called at stack " + android.util.Log.getStackTraceString(new Throwable()));
        this.e.removeMessages(1);
        this.e.removeMessages(0);
        this.e.sendEmptyMessage(0);
    }

    public boolean willStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("deb1643b", new Object[]{this})).booleanValue() : this.e.hasMessages(1);
    }

    public boolean willStop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab39dd7f", new Object[]{this})).booleanValue() : this.e.hasMessages(0);
    }
}
