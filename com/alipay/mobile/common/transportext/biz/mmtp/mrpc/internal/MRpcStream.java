package com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal;

import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import com.alipay.mobile.common.transport.monitor.SignalStateHelper;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MRpcStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int h;

    /* renamed from: a  reason: collision with root package name */
    private MRpcConnection f5690a;
    private int b;
    private MRpcResponse d;
    private int e;
    private MRpcRequest f;
    private int g;
    private MRpcResultCode c = null;
    private boolean i = false;
    private boolean j = false;

    public MRpcStream(int i, MRpcConnection mRpcConnection) {
        this.f5690a = mRpcConnection;
        this.b = i;
    }

    public void sendRequest(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28d5222", new Object[]{this, mRpcRequest});
            return;
        }
        this.f = mRpcRequest;
        this.f5690a.sendRequest(mRpcRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x010d A[Catch: all -> 0x0118, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0009, B:66:0x010d, B:67:0x0117), top: B:71:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse getResponse() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcStream.getResponse():com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse");
    }

    private void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.j) {
        } else {
            this.j = true;
            if (this.f == null) {
                return;
            }
            ResultFeedback resultFeedback = new ResultFeedback();
            resultFeedback.id = 1L;
            resultFeedback.receipt = this.f.reqSeqId;
            resultFeedback.duration = i;
            if (z) {
                AmnetHelper.notifyResultFeedback(resultFeedback, this);
            } else {
                AmnetHelper.asyncNotifyResultFeedback(resultFeedback, this);
            }
        }
    }

    public void receiveResponse(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcae0481", new Object[]{this, mRpcResponse});
            return;
        }
        this.d = mRpcResponse;
        synchronized (this) {
            notifyAll();
        }
        this.f5690a.removeStream(this.b);
    }

    public void close(MRpcResultCode mRpcResultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb32c697", new Object[]{this, mRpcResultCode});
            return;
        }
        this.c = mRpcResultCode;
        synchronized (this) {
            try {
                notifyAll();
            }
        }
        this.f5690a.removeStream(this.b);
    }

    public void setTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f41d", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public int getTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue() : this.e;
    }

    public int getStreamId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f996ba2b", new Object[]{this})).intValue() : this.b;
    }

    public void setStreamId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc17663f", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public int getReqSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31206183", new Object[]{this})).intValue() : this.g;
    }

    public void setReqSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29353e7f", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public boolean isLocalAmnet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c62329b", new Object[]{this})).booleanValue() : this.i;
    }

    public void setLocalAmnet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c57cce5", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            int i = h + 1;
            h = i;
            if (i >= 5) {
                h = 0;
                NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcStream.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LogCatUtil.debug("MRpcStream", "mmtpErrorCount>=5,tryNetworkDiagnose");
                        SignalStateHelper.getInstance().reportNetStateInfo();
                        AlipayQosService.getInstance().getQosLevel();
                        DiagnoseBySystemCall.diagnoseNotify();
                    }
                });
            }
            AlipayQosService.getInstance().estimate(5000.0d, (byte) 1);
        } catch (Throwable th) {
            LogCatUtil.error("MRpcStream", "tryNetworkDiagnose ex:" + th.toString());
        }
    }
}
