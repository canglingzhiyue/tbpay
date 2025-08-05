package com.taobao.trtc.video;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoCapturer;
import tb.kge;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-820034697);
    }

    public static VideoCapturer a(Context context, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoCapturer) ipChange.ipc$dispatch("6b01145d", new Object[]{context, cameraEventsHandler, new Boolean(z)});
        }
        Camera1Enumerator camera1Enumerator = new Camera1Enumerator();
        String[] deviceNames = camera1Enumerator.getDeviceNames();
        TrtcLog.d("TrtcVideoCapturer", "Looking for preferred camera, frontCamera:" + z);
        for (String str : deviceNames) {
            if ((z && camera1Enumerator.isFrontFacing(str)) || (!z && !camera1Enumerator.isFrontFacing(str))) {
                TrtcLog.d("TrtcVideoCapturer", "Creating camera capture, prefer front:" + z + ", name:" + str);
                CameraVideoCapturer createCapturer = camera1Enumerator.createCapturer(context, str, cameraEventsHandler);
                if (createCapturer != null) {
                    return createCapturer;
                }
            }
        }
        TrtcLog.d("TrtcVideoCapturer", "Looking for other cameras.");
        for (String str2 : deviceNames) {
            if (!camera1Enumerator.isFrontFacing(str2)) {
                TrtcLog.d("TrtcVideoCapturer", "Creating other camera capture.");
                CameraVideoCapturer createCapturer2 = camera1Enumerator.createCapturer(context, str2, cameraEventsHandler);
                if (createCapturer2 != null) {
                    return createCapturer2;
                }
            }
        }
        return null;
    }

    public static VideoCapturer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoCapturer) ipChange.ipc$dispatch("64280ded", new Object[0]);
        }
        TrtcLog.d("TrtcVideoCapturer", "create ExternalVideoCapturer");
        return new b();
    }
}
