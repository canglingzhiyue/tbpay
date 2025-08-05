package com.alipay.mobile.common.transport.zfeatures;

import android.content.Context;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public class LoginRefreshManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LoginRefreshManager f5640a;
    private byte b = -1;
    private int c = -1;
    private int d = 0;
    private Map<HttpWorker, SeqModel> e = new HashMap();
    private AtomicBoolean i = new AtomicBoolean(false);
    private ReentrantReadWriteLock f = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock g = this.f.readLock();
    private ReentrantReadWriteLock.WriteLock h = this.f.writeLock();

    /* loaded from: classes3.dex */
    public class SafetyInspector implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private LoginRefreshManager f5641a;

        public SafetyInspector(LoginRefreshManager loginRefreshManager) {
            this.f5641a = loginRefreshManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (LoginRefreshManager.access$000(this.f5641a).isEmpty()) {
                    LoginRefreshManager.access$100(this.f5641a).set(false);
                    return;
                }
                LoginRefreshManager.access$200(this.f5641a);
                if (!LoginRefreshManager.access$000(this.f5641a).isEmpty()) {
                    LoginRefreshManager.access$400(this.f5641a);
                    return;
                }
                LoginRefreshManager.access$100(this.f5641a).set(false);
                LoginRefreshManager.access$300(this.f5641a);
            } catch (Throwable th) {
                LogCatUtil.warn("LoginRefreshManager", "SafetyInspector. execute error. ", th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class SeqModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final long createTime = System.currentTimeMillis();
        public final int seqNum;

        public SeqModel(int i) {
            this.seqNum = i;
        }

        public long getCreateTime() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9b0beda", new Object[]{this})).longValue() : this.createTime;
        }
    }

    public static /* synthetic */ Map access$000(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("74274d4c", new Object[]{loginRefreshManager}) : loginRefreshManager.e;
    }

    public static /* synthetic */ AtomicBoolean access$100(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("54804d98", new Object[]{loginRefreshManager}) : loginRefreshManager.i;
    }

    public static /* synthetic */ void access$200(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0e2d59", new Object[]{loginRefreshManager});
        } else {
            loginRefreshManager.f();
        }
    }

    public static /* synthetic */ void access$300(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41a145a", new Object[]{loginRefreshManager});
        } else {
            loginRefreshManager.b();
        }
    }

    public static /* synthetic */ void access$400(LoginRefreshManager loginRefreshManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b25fb5b", new Object[]{loginRefreshManager});
        } else {
            loginRefreshManager.d();
        }
    }

    private LoginRefreshManager() {
    }

    public static final LoginRefreshManager getInstance() {
        LoginRefreshManager loginRefreshManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginRefreshManager) ipChange.ipc$dispatch("34944124", new Object[0]);
        }
        LoginRefreshManager loginRefreshManager2 = f5640a;
        if (loginRefreshManager2 != null) {
            return loginRefreshManager2;
        }
        synchronized (LoginRefreshManager.class) {
            if (f5640a == null) {
                f5640a = new LoginRefreshManager();
            }
            loginRefreshManager = f5640a;
        }
        return loginRefreshManager;
    }

    public void enableRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc0345f", new Object[]{this});
        } else if (this.b == 1) {
        } else {
            this.b = (byte) 1;
            LogCatUtil.info("LoginRefreshManager", "enableRefresh. mEnabledLoginRefresh is 1");
        }
    }

    public boolean isEnabledLoginRefresh(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba46063c", new Object[]{this, context})).booleanValue();
        }
        if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.LOGIN_REFRESH_SWITCH))) {
            return false;
        }
        byte b = this.b;
        if (b != -1) {
            return b == 1;
        }
        boolean booleanFromMetaData = MiscUtils.getBooleanFromMetaData(context, "login_refresh_feature");
        LogCatUtil.info("LoginRefreshManager", "isEnabledLoginRefresh. meta-data value : " + booleanFromMetaData);
        try {
            this.b = (byte) (booleanFromMetaData ? 1 : 0);
            LogCatUtil.info("LoginRefreshManager", "isEnabledLoginRefresh. mEnabledLoginRefresh : " + ((int) this.b));
            return booleanFromMetaData;
        } catch (Throwable th) {
            LogCatUtil.error("LoginRefreshManager", "isEnabledLoginRefresh error", th);
            return this.b == 1;
        }
    }

    public boolean checkIn(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c8aab6e", new Object[]{this, httpWorker})).booleanValue();
        }
        if (!c()) {
            return true;
        }
        this.g.lock();
        try {
            return a(httpWorker);
        } catch (Throwable th) {
            try {
                LogCatUtil.error("LoginRefreshManager", "checkIn error. ", th);
                return true;
            } finally {
                this.g.unlock();
            }
        }
    }

    public void recordRpc(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc7c5f1", new Object[]{this, httpWorker});
        } else if (!c()) {
        } else {
            this.h.lock();
            try {
                b(httpWorker);
            } finally {
                this.h.unlock();
            }
        }
    }

    public void removeRecord(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9da512", new Object[]{this, httpWorker});
        } else if (!c()) {
        } else {
            this.h.lock();
            try {
                c(httpWorker);
            } finally {
                this.h.unlock();
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.e.isEmpty()) {
        } else {
            if (this.c == -1 && this.d == 0) {
                return;
            }
            this.c = -1;
            this.d = 0;
            LogCatUtil.info("LoginRefreshManager", "reseted");
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h.lock();
        try {
            a();
        } finally {
            this.h.unlock();
        }
    }

    public void cleanMapAndReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27b8032", new Object[]{this});
            return;
        }
        this.h.lock();
        try {
            if (!this.e.isEmpty()) {
                this.e.clear();
            }
            a();
        } finally {
            this.h.unlock();
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        byte b = this.b;
        return b != -1 && b == 1;
    }

    private boolean a(HttpWorker httpWorker) {
        SeqModel seqModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fab09382", new Object[]{this, httpWorker})).booleanValue();
        }
        if (httpWorker.getOriginRequest().isSwitchLoginRpc()) {
            this.c = e();
            LogCatUtil.info("LoginRefreshManager", "loginRespSeq is " + String.valueOf(this.c));
            return true;
        } else if (this.c == -1 || (seqModel = this.e.get(httpWorker)) == null || seqModel.seqNum > this.c) {
            return true;
        } else {
            LogCatUtil.warn("LoginRefreshManager", " checkIn it's false. API is " + httpWorker.getOperationType() + ", loginRespSeq=" + this.c + ", rpcReqSeq=" + seqModel.seqNum);
            return false;
        }
    }

    private void b(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20449c7f", new Object[]{this, httpWorker});
        } else if (httpWorker.getOriginRequest().isSwitchLoginRpc()) {
        } else {
            this.e.put(httpWorker, new SeqModel(e()));
            d();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.i.get() || this.i.get()) {
        } else {
            this.i.set(true);
            NetworkAsyncTaskExecutor.schedule(new SafetyInspector(this), 60L, TimeUnit.SECONDS);
        }
    }

    private void c(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d8a580", new Object[]{this, httpWorker});
            return;
        }
        this.e.remove(httpWorker);
        a();
    }

    private int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        int i = this.d + 1;
        this.d = i;
        return i;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.h.lock();
        try {
            if (this.e.isEmpty()) {
                return;
            }
            ArrayList<HttpWorker> arrayList = new ArrayList(3);
            for (Map.Entry<HttpWorker, SeqModel> entry : this.e.entrySet()) {
                if (System.currentTimeMillis() - entry.getValue().getCreateTime() > 300000) {
                    arrayList.add(entry.getKey());
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder("gcReqSeqMap.  The GC RPC are: ");
            for (HttpWorker httpWorker : arrayList) {
                sb.append(httpWorker.getOperationType());
                sb.append(",");
                this.e.remove(httpWorker);
            }
            this.h.unlock();
            LogCatUtil.warn("LoginRefreshManager", sb.toString());
        } finally {
            this.h.unlock();
        }
    }
}
