package com.alibaba.security.wukong.bx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.ccrc.service.build.C1204db;
import com.alibaba.security.ccrc.service.build.C1207eb;
import com.alibaba.security.ccrc.service.build.C1213gb;
import com.alibaba.security.ccrc.service.build.C1238p;
import com.alibaba.security.ccrc.service.build.Ka;
import com.alibaba.security.ccrc.service.build.RunnableC1210fb;
import com.alibaba.security.ccrc.service.build.RunnableC1216hb;
import com.alibaba.security.ccrc.service.build.Yb;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class CcrcBHService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BX_KEY_FEATURE = "feature";
    public static final int MAX_LIMIT_SIZE = 1;
    public static final String TAG = "CcrcBHService";
    public final String mCcrcCode;
    public final CcrcService mService;
    public static final Map<String, CcrcBHService> SERVICE_MAP = new HashMap();
    public static final AtomicInteger mDetectCallCounter = new AtomicInteger(0);
    public final Queue<Object> mQueue = new LinkedList();
    public final C1204db mBehaviorDataManager = new C1204db();
    public final AtomicBoolean mIsReceiverRegistered = new AtomicBoolean(false);
    public final BroadcastReceiver mReceiver = new C1207eb(this);
    public final ThreadPoolExecutor mThreadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Ka(TAG));

    public CcrcBHService(String str) {
        this.mCcrcCode = str;
        this.mService = CcrcService.getService(str);
        this.mThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void access$000(CcrcBHService ccrcBHService, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37350df7", new Object[]{ccrcBHService, obj});
        } else {
            ccrcBHService.enq(obj);
        }
    }

    public static /* synthetic */ void access$200(CcrcBHService ccrcBHService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272861dd", new Object[]{ccrcBHService});
        } else {
            ccrcBHService.doActivate();
        }
    }

    public static /* synthetic */ void access$400(CcrcBHService ccrcBHService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419dc4df", new Object[]{ccrcBHService});
        } else {
            ccrcBHService.triggerDetect();
        }
    }

    private void doActivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f59025", new Object[]{this});
        } else {
            this.mService.activate(new CcrcService.Config.Builder().setPid(String.format("BX_%s", UUID.randomUUID().toString())).build(), new C1213gb(this));
        }
    }

    private synchronized void enq(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f86b8b", new Object[]{this, obj});
            return;
        }
        if (this.mQueue.size() > 0) {
            this.mQueue.poll();
        }
        this.mQueue.offer(obj);
        triggerDetect();
    }

    public static synchronized CcrcBHService getBHService(String str) {
        synchronized (CcrcBHService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CcrcBHService) ipChange.ipc$dispatch("89bfcff0", new Object[]{str});
            } else if (TextUtils.isEmpty(str)) {
                Logging.e(TAG, "ccrcCode is null");
                return null;
            } else if (CcrcContextImpl.getContext() == null) {
                Logging.e(TAG, "ccrc context is not init yet");
                return null;
            } else if (SERVICE_MAP.containsKey(str) && SERVICE_MAP.get(str) != null) {
                return SERVICE_MAP.get(str);
            } else {
                CcrcBHService ccrcBHService = new CcrcBHService(str);
                SERVICE_MAP.put(str, ccrcBHService);
                return ccrcBHService;
            }
        }
    }

    private boolean isSwitchClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed76af95", new Object[]{this})).booleanValue();
        }
        CcrcService ccrcService = this.mService;
        if (ccrcService != null) {
            return ccrcService.isSwitchClosed();
        }
        return false;
    }

    private void registerBxReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef98fef", new Object[]{this});
        } else if (this.mIsReceiverRegistered.get()) {
        } else {
            Context context = CcrcContextImpl.getContext();
            if (context != null) {
                Logging.d(TAG, "registerBxReceiver: " + this + " " + this.mCcrcCode);
                LocalBroadcastManager.getInstance(context.getApplicationContext()).registerReceiver(this.mReceiver, new IntentFilter(String.format("BehaviX_%s", this.mCcrcCode)));
            }
            this.mIsReceiverRegistered.set(true);
        }
    }

    private void trackBhDetectLog(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ce5055", new Object[]{this, map, new Integer(i)});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(this.mService.getPid()).setCcrcCode(this.mCcrcCode).setPhase(Ba.b.e).setOperation(Ba.a.q).setStatus(0).addParam("input", JsonUtils.toJSONString(map)).addParam("detectCount", Integer.valueOf(i)).build());
        }
    }

    private void trackBhNotifyDetectLog(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60325d8a", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        String jSONString = JsonUtils.toJSONString(obj);
        if (C1238p.a(jSONString)) {
            jSONString = "features over limit size";
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(this.mService.getPid()).setCcrcCode(this.mCcrcCode).setPhase(Ba.b.e).setOperation(Ba.a.r);
        if (TextUtils.isEmpty(jSONString)) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).addParam("features", jSONString).addParam("isActivate", Boolean.valueOf(z)).build());
    }

    private void triggerDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b950d82", new Object[]{this});
            return;
        }
        Object poll = this.mQueue.poll();
        trackBhNotifyDetectLog(poll, this.mService.isActivate());
        CcrcService ccrcService = this.mService;
        if (ccrcService == null || !ccrcService.isActivate()) {
            return;
        }
        this.mBehaviorDataManager.a(this.mService.getCcrcServiceManager());
        List<BehaviorRiskSample> a2 = this.mBehaviorDataManager.a(poll);
        if (a2.isEmpty()) {
            this.mBehaviorDataManager.a(this.mService.getPid(), this.mCcrcCode, -1, "risk sample is empty", JsonUtils.toJSONString(poll));
            return;
        }
        boolean z = !this.mService.getCcrcServiceManager().k();
        for (BehaviorRiskSample behaviorRiskSample : a2) {
            behaviorRiskSample.detect(this.mService, z);
        }
    }

    private void triggerUTTracker(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a775259d", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("ccrc_seq_risk", 2101, this.mCcrcCode, "", "", map).build());
        }
    }

    private void unregisterBxReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cffb5c8", new Object[]{this});
        } else if (!this.mIsReceiverRegistered.get()) {
        } else {
            Context context = CcrcContextImpl.getContext();
            if (context != null) {
                Logging.d(TAG, "unregisterBxReceiver: " + this + " " + this.mCcrcCode);
                LocalBroadcastManager.getInstance(context.getApplicationContext()).unregisterReceiver(this.mReceiver);
            }
            this.mIsReceiverRegistered.set(false);
        }
    }

    public void activate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b7a7fa", new Object[]{this});
        } else if (isSwitchClosed() || CcrcContextImpl.getContext() == null) {
        } else {
            registerBxReceiver();
            this.mThreadPoolExecutor.execute(new RunnableC1210fb(this));
        }
    }

    public void deActivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d74f1b", new Object[]{this});
            return;
        }
        StringBuilder a2 = Yb.a("deActivate switch: ");
        a2.append(this.mService.isSwitchClosed());
        a2.append(" service: ");
        a2.append(this.mService.getCcrcCode());
        a2.append(" ");
        a2.append(this);
        Logging.d(TAG, a2.toString());
        if (isSwitchClosed()) {
            return;
        }
        this.mBehaviorDataManager.a();
        if (CcrcContextImpl.getContext() == null) {
            return;
        }
        unregisterBxReceiver();
        this.mThreadPoolExecutor.execute(new RunnableC1216hb(this));
    }

    public void detect(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b23709b", new Object[]{this, map});
        } else if (isSwitchClosed()) {
        } else {
            trackBhDetectLog(map, mDetectCallCounter.get());
            if (mDetectCallCounter.getAndIncrement() % this.mService.getDetectFrequency() != 0) {
                return;
            }
            triggerUTTracker(map);
        }
    }
}
