package com.alipay.mobile.security.bio.workspace;

import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class BioTransferLifecycleRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static BioTransferLifecycleRegistry f5832a = new BioTransferLifecycleRegistry();
    private AtomicInteger b = new AtomicInteger(0);
    private Object c = new Object();
    private Map<Integer, BioActivityState> d = new HashMap();
    private Map<Integer, WeakReference<BioDetector>> e = new HashMap();
    private int f = 0;

    /* loaded from: classes3.dex */
    public enum BioActivityState {
        DESTROYED,
        INITIALIZED,
        CREATED,
        RESUMED
    }

    private BioTransferLifecycleRegistry() {
    }

    public static BioTransferLifecycleRegistry getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioTransferLifecycleRegistry) ipChange.ipc$dispatch("e20c42b5", new Object[0]) : f5832a;
    }

    public int getNextBioDetectorId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af086a3a", new Object[]{this})).intValue() : this.b.addAndGet(1);
    }

    public void markActivityState(int i, BioActivityState bioActivityState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b5afe6", new Object[]{this, new Integer(i), bioActivityState});
            return;
        }
        synchronized (this.c) {
            this.d.put(Integer.valueOf(i), bioActivityState);
        }
    }

    public BioActivityState getActivityState(int i) {
        BioActivityState bioActivityState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioActivityState) ipChange.ipc$dispatch("c96b4965", new Object[]{this, new Integer(i)});
        }
        synchronized (this.c) {
            bioActivityState = this.d.get(Integer.valueOf(i));
        }
        return bioActivityState;
    }

    public void removeActivityState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8325917e", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.c) {
            this.d.remove(Integer.valueOf(i));
        }
    }

    public void registerBioDetector(BioDetector bioDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d01d08", new Object[]{this, bioDetector});
            return;
        }
        synchronized (this.c) {
            this.e.put(Integer.valueOf(bioDetector.getId()), new WeakReference<>(bioDetector));
        }
    }

    public void unregisterBioDetector(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b6538a", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.c) {
            this.e.remove(Integer.valueOf(i));
            this.d.remove(Integer.valueOf(i));
        }
    }

    public BioDetector findBioDetectorById(int i) {
        WeakReference<BioDetector> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioDetector) ipChange.ipc$dispatch("7f8c5cd7", new Object[]{this, new Integer(i)});
        }
        synchronized (this.c) {
            weakReference = this.e.get(Integer.valueOf(i));
        }
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public BioDetector findCurrentUIActiveDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioDetector) ipChange.ipc$dispatch("dbd630c5", new Object[]{this});
        }
        synchronized (this.c) {
            for (WeakReference<BioDetector> weakReference : this.e.values()) {
                BioDetector bioDetector = weakReference.get();
                if (bioDetector != null && bioDetector.isUIActive()) {
                    return bioDetector;
                }
            }
            return null;
        }
    }

    public void setLastServiceManagerOwnerDetectorId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd464d8", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.c) {
            this.f = i;
        }
    }

    public int getLastServiceManagerOwnerDetectorId() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f344b50a", new Object[]{this})).intValue();
        }
        synchronized (this.c) {
            i = this.f;
        }
        return i;
    }
}
