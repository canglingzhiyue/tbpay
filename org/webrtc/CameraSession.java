package org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import org.webrtc.VideoFrame;
import tb.kge;

/* loaded from: classes9.dex */
public interface CameraSession {

    /* loaded from: classes9.dex */
    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    /* loaded from: classes9.dex */
    public interface Events {
        void onCameraClosed(CameraSession cameraSession);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    /* loaded from: classes9.dex */
    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    void enableTorch(boolean z);

    int getBrightness();

    void setBlack(boolean z);

    void setBrightness(int i);

    void stop();

    /* loaded from: classes9.dex */
    public static class StaticMethod {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-973648999);
        }

        public static int getDeviceOrientation(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b684e2b0", new Object[]{context})).intValue();
            }
            int rotation = ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getRotation();
            if (rotation == 1) {
                return 90;
            }
            if (rotation == 2) {
                return 180;
            }
            return rotation != 3 ? 0 : 270;
        }

        public static VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(TextureBufferImpl textureBufferImpl, boolean z, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoFrame.TextureBuffer) ipChange.ipc$dispatch("1182d811", new Object[]{textureBufferImpl, new Boolean(z), new Integer(i)});
            }
            Matrix matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            if (z) {
                matrix.preScale(-1.0f, 1.0f);
            }
            matrix.preRotate(i);
            matrix.preTranslate(-0.5f, -0.5f);
            int width = textureBufferImpl.getWidth();
            int height = textureBufferImpl.getHeight();
            if (i == 90 || i == 270) {
                height = width;
                width = height;
            }
            return textureBufferImpl.applyTransformMatrix(matrix, width, height);
        }
    }
}
