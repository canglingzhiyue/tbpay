package com.taobao.media.connectionclass;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class ConnectionClassManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long BANDWIDTH_LOWER_BOUND = 10;
    private static final int BYTES_TO_BITS = 8;
    public static double DEFAULT_DECAY_CONSTANT = 0.0d;
    private static final int DEFAULT_GOOD_BANDWIDTH = 2000;
    private static final int DEFAULT_MODERATE_BANDWIDTH = 550;
    private static final int DEFAULT_POOR_BANDWIDTH = 150;
    public static final double DEFAULT_SAMPLES_TO_QUALITY_CHANGE = 5.0d;
    private AtomicReference<ConnectionQuality> mCurrentBandwidthConnectionQuality;
    private ExponentialGeometricAverage mDownloadBandwidth;
    private volatile boolean mInitiateStateChange;
    private ArrayList<ConnectionClassStateChangeListener> mListenerList;
    private AtomicReference<ConnectionQuality> mNextBandwidthConnectionQuality;
    private int mSampleCounter;

    /* loaded from: classes7.dex */
    public static class ConnectionClassManagerHolder {
        public static final ConnectionClassManager instance;

        static {
            kge.a(554688733);
            instance = new ConnectionClassManager();
        }

        private ConnectionClassManagerHolder() {
        }
    }

    /* loaded from: classes7.dex */
    public interface ConnectionClassStateChangeListener {
        void onBandwidthStateChange(ConnectionQuality connectionQuality);
    }

    static {
        kge.a(-575787066);
        DEFAULT_DECAY_CONSTANT = 0.05d;
    }

    public static ConnectionClassManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnectionClassManager) ipChange.ipc$dispatch("d8c16a3d", new Object[0]) : ConnectionClassManagerHolder.instance;
    }

    private ConnectionClassManager() {
        this.mDownloadBandwidth = new ExponentialGeometricAverage(DEFAULT_DECAY_CONSTANT);
        this.mInitiateStateChange = false;
        this.mCurrentBandwidthConnectionQuality = new AtomicReference<>(ConnectionQuality.UNKNOWN);
        this.mListenerList = new ArrayList<>();
    }

    public synchronized void addBandwidth(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b77d857", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        if (j2 != 0) {
            double d = (j / j2) * 8.0d;
            if (d >= 10.0d) {
                this.mDownloadBandwidth.addMeasurement(d);
                if (this.mInitiateStateChange) {
                    this.mSampleCounter++;
                    if (getCurrentBandwidthQuality() != this.mNextBandwidthConnectionQuality.get()) {
                        this.mInitiateStateChange = false;
                        this.mSampleCounter = 1;
                    }
                    if (this.mSampleCounter >= 5.0d) {
                        this.mInitiateStateChange = false;
                        this.mSampleCounter = 1;
                        this.mCurrentBandwidthConnectionQuality.set(this.mNextBandwidthConnectionQuality.get());
                        notifyListeners();
                    }
                    return;
                }
                if (this.mCurrentBandwidthConnectionQuality.get() != getCurrentBandwidthQuality()) {
                    this.mInitiateStateChange = true;
                    this.mNextBandwidthConnectionQuality = new AtomicReference<>(getCurrentBandwidthQuality());
                }
            }
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        ExponentialGeometricAverage exponentialGeometricAverage = this.mDownloadBandwidth;
        if (exponentialGeometricAverage != null) {
            exponentialGeometricAverage.reset();
        }
        this.mCurrentBandwidthConnectionQuality.set(ConnectionQuality.UNKNOWN);
    }

    public synchronized ConnectionQuality getCurrentBandwidthQuality() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectionQuality) ipChange.ipc$dispatch("a33ee31f", new Object[]{this});
        } else if (this.mDownloadBandwidth == null) {
            return ConnectionQuality.UNKNOWN;
        } else {
            return mapBandwidthQuality(this.mDownloadBandwidth.getAverage());
        }
    }

    private ConnectionQuality mapBandwidthQuality(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectionQuality) ipChange.ipc$dispatch("ea9ed2a", new Object[]{this, new Double(d)});
        }
        if (d < mto.a.GEO_NOT_SUPPORT) {
            return ConnectionQuality.UNKNOWN;
        }
        if (d < 150.0d) {
            return ConnectionQuality.POOR;
        }
        if (d < 550.0d) {
            return ConnectionQuality.MODERATE;
        }
        if (d < 2000.0d) {
            return ConnectionQuality.GOOD;
        }
        return ConnectionQuality.EXCELLENT;
    }

    public synchronized double getDownloadKBitsPerSecond() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45f821f3", new Object[]{this})).doubleValue();
        } else if (this.mDownloadBandwidth == null) {
            return -1.0d;
        } else {
            return this.mDownloadBandwidth.getAverage();
        }
    }

    public ConnectionQuality register(ConnectionClassStateChangeListener connectionClassStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectionQuality) ipChange.ipc$dispatch("40d3e7f7", new Object[]{this, connectionClassStateChangeListener});
        }
        if (connectionClassStateChangeListener != null) {
            this.mListenerList.add(connectionClassStateChangeListener);
        }
        return this.mCurrentBandwidthConnectionQuality.get();
    }

    public void remove(ConnectionClassStateChangeListener connectionClassStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2103281", new Object[]{this, connectionClassStateChangeListener});
        } else if (connectionClassStateChangeListener == null) {
        } else {
            this.mListenerList.remove(connectionClassStateChangeListener);
        }
    }

    private void notifyListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd3967d", new Object[]{this});
            return;
        }
        int size = this.mListenerList.size();
        for (int i = 0; i < size; i++) {
            this.mListenerList.get(i).onBandwidthStateChange(this.mCurrentBandwidthConnectionQuality.get());
        }
    }
}
