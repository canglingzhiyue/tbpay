package com.alipay.android.msp.drivers.dipatchers;

import com.alipay.android.msp.core.clients.MspLogicClient;
import com.alipay.android.msp.drivers.actions.Action;
import com.alipay.android.msp.drivers.dipatchers.MspResponse;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;

/* loaded from: classes3.dex */
public class RealCall implements Call {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MspLogicClient f4581a;
    private final Action b;
    private boolean c;

    public static /* synthetic */ Action a(RealCall realCall) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Action) ipChange.ipc$dispatch("b716f338", new Object[]{realCall}) : realCall.b;
    }

    public static /* synthetic */ MspLogicClient b(RealCall realCall) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspLogicClient) ipChange.ipc$dispatch("1e73513b", new Object[]{realCall}) : realCall.f4581a;
    }

    private RealCall(MspLogicClient mspLogicClient, Action action) {
        this.f4581a = mspLogicClient;
        this.b = action;
    }

    public static RealCall newRealCall(MspLogicClient mspLogicClient, Action action) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RealCall) ipChange.ipc$dispatch("541874bc", new Object[]{mspLogicClient, action}) : new RealCall(mspLogicClient, action);
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Call
    public Action getAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Action) ipChange.ipc$dispatch("1971399c", new Object[]{this}) : this.b;
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Call
    public MspResponse execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("d4f4f2ce", new Object[]{this});
        }
        synchronized (this) {
            if (this.c) {
                throw new IllegalStateException("Already Executed");
            }
            this.c = true;
        }
        try {
            return a();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace("RealCall", e.RECORD_EXECUTE, e);
            ExceptionUtils.sendUiMsgWhenException(this.f4581a.getMspContext().getBizId(), e);
            return null;
        }
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Call
    public void enqueue(Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed56732d", new Object[]{this, callback});
            return;
        }
        synchronized (this) {
            if (this.c) {
                throw new IllegalStateException("Already Executed");
            }
            this.c = true;
        }
        MspLogicClient mspLogicClient = this.f4581a;
        if (mspLogicClient != null) {
            synchronized (mspLogicClient.getUiLock()) {
                if (this.f4581a.dispatcher() != null && !this.f4581a.dispatcher().a()) {
                    this.f4581a.dispatcher().a(new AsyncCall(callback));
                } else {
                    LogUtil.e("RealCall", "enqueue", "executorService shutdown, client =" + this.f4581a + ", context=" + this.f4581a.getMspContext());
                }
            }
            return;
        }
        LogUtil.e("RealCall", "enqueue", "client is null");
    }

    public MspResponse a() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspResponse) ipChange.ipc$dispatch("4adabcba", new Object[]{this}) : new MspResponse.Builder().request(this.b).body(this.f4581a.processAction(this.b)).build();
    }

    /* loaded from: classes3.dex */
    public final class AsyncCall implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Callback b;

        public AsyncCall(Callback callback) {
            this.b = callback;
        }

        public final Action a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Action) ipChange.ipc$dispatch("64c20191", new Object[]{this}) : RealCall.a(RealCall.this);
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            try {
                try {
                    this.b.onResponse(RealCall.this, RealCall.this.a());
                    if (RealCall.b(RealCall.this).dispatcher() == null) {
                        return;
                    }
                    RealCall.b(RealCall.this).dispatcher().b(this);
                } catch (Exception e) {
                    e = e;
                    LogUtil.printExceptionStackTrace("AsyncCall", e.RECORD_EXECUTE, e);
                    if (!z) {
                        this.b.onFailure(RealCall.this, e);
                    }
                    if (RealCall.b(RealCall.this).dispatcher() != null) {
                        RealCall.b(RealCall.this).dispatcher().b(this);
                    }
                    ExceptionUtils.sendUiMsgWhenException(RealCall.b(RealCall.this).getMspContext().getBizId(), e);
                }
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b();
            }
        }
    }
}
