package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class Metrics {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Metrics";
    public final Map<String, HistogramInfo> map = new HashMap();

    static {
        kge.a(1976083884);
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();

    /* loaded from: classes9.dex */
    public static class HistogramInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        static {
            kge.a(1712216858);
        }

        public HistogramInfo(int i, int i2, int i3) {
            this.min = i;
            this.max = i2;
            this.bucketCount = i3;
        }

        public void addSample(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f13d092", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                this.samples.put(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    private void add(String str, HistogramInfo histogramInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84153b87", new Object[]{this, str, histogramInfo});
        } else {
            this.map.put(str, histogramInfo);
        }
    }

    public static void enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[0]);
        } else {
            nativeEnable();
        }
    }

    public static Metrics getAndReset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Metrics) ipChange.ipc$dispatch("23d0584", new Object[0]) : nativeGetAndReset();
    }
}
