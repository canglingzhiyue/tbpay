package org.webrtc;

import android.graphics.ImageFormat;
import com.alibaba.security.realidentity.x2;
import com.alipay.mobile.security.faceauth.api.AntDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class CameraEnumerationAndroid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ArrayList<Size> COMMON_RESOLUTIONS;
    private static final String TAG = "CameraEnumerationAndroid";

    static {
        kge.a(-685227932);
        COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size(160, 120), new Size(240, 160), new Size(320, 240), new Size(400, 240), new Size(480, 320), new Size(640, 360), new Size(640, 480), new Size(LogType.UNEXP_OTHER, 480), new Size(854, 480), new Size(800, 600), new Size(960, x2.o), new Size(960, 640), new Size(1024, 576), new Size(1024, 600), new Size(1280, 720), new Size(1280, 1024), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)));
    }

    /* loaded from: classes9.dex */
    public static class CaptureFormat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        static {
            kge.a(1991567997);
        }

        /* loaded from: classes9.dex */
        public static class FramerateRange {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public int max;
            public int min;

            static {
                kge.a(-1669426537);
            }

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return riy.ARRAY_START_STR + (this.min / 1000.0f) + ":" + (this.max / 1000.0f) + riy.ARRAY_END_STR;
            }

            public boolean equals(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
                }
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            public int hashCode() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (this.min * AntDetector.ACTION_ID_LOGIN) + 1 + this.max;
            }
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }

        public int frameSize() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9880cc88", new Object[]{this})).intValue() : frameSize(this.width, this.height, 17);
        }

        public static int frameSize(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f63d8de1", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
            }
            if (i3 != 17) {
                throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
            }
            return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.width + "x" + this.height + "@" + this.framerate;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            return this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class ClosestComparator<T> implements Comparator<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-301557841);
            kge.a(-2099169482);
        }

        public abstract int diff(T t);

        private ClosestComparator() {
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, t, t2})).intValue() : diff(t) - diff(t2);
        }
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CaptureFormat.FramerateRange) ipChange.ipc$dispatch("ab6d43fe", new Object[]{list, new Integer(i)}) : (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() { // from class: org.webrtc.CameraEnumerationAndroid.1
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            private int progressivePenalty(int i2, int i3, int i4, int i5) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("85fb7638", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue() : i2 < i3 ? i2 * i4 : (i4 * i3) + ((i2 - i3) * i5);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(CaptureFormat.FramerateRange framerateRange) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("304cf5f7", new Object[]{this, framerateRange})).intValue() : (Math.abs((i * 1000) - framerateRange.min) * 2) + (Math.abs((i * 1000) - framerateRange.max) * 2) + ((i * 1000) - framerateRange.min);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Size) ipChange.ipc$dispatch("645e3cbd", new Object[]{list, new Integer(i), new Integer(i2)}) : (Size) Collections.min(list, new ClosestComparator<Size>() { // from class: org.webrtc.CameraEnumerationAndroid.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(Size size) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("66371670", new Object[]{this, size})).intValue() : Math.abs(i - size.width) + Math.abs(i2 - size.height);
            }
        });
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be08587b", new Object[]{histogram, size});
        } else {
            histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
        }
    }
}
