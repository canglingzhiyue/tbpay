package com.alipay.mobile.common.transportext.biz.mmtp.mrpc;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcStream;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse;
import com.alipay.mobile.common.transportext.biz.util.AmnetLimitingHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class MRpcTransport {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MRpcRequest f5687a;
    private MRpcStream b;

    public void sendRequest(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28d5222", new Object[]{this, mRpcRequest});
            return;
        }
        this.f5687a = mRpcRequest;
        this.b = getMRpcConneciton().newMRpcStream();
        this.b.setLocalAmnet(mRpcRequest.localAmnet);
        mRpcRequest.addHeader(HeaderConstant.HEADER_KEY_RPCID, String.valueOf(this.b.getStreamId()));
        mRpcRequest.reqSeqId = this.b.getStreamId();
        b(mRpcRequest);
        a(mRpcRequest);
        this.b.sendRequest(mRpcRequest);
        LogCatUtil.debug("MRpcTransport", " rpcid = " + this.b.getStreamId() + " API=" + mRpcRequest.getHeaders().get(HeaderConstant.HEADER_KEY_OPERATION_TYPE));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.transportext.biz.mmtp.mrpc.MRpcTransport.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r6
            r1[r3] = r7
            java.lang.String r7 = "a665e99c"
            r0.ipc$dispatch(r7, r1)
            return
        L15:
            int r0 = r7.readTimeout
            com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection r1 = com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection.getInstance()
            int r1 = r1.getConnectionState()
            java.lang.String r4 = ")="
            java.lang.String r5 = "MRpcTransport"
            if (r1 == 0) goto L66
            if (r1 == r3) goto L66
            if (r1 == r2) goto L45
            r2 = 3
            if (r1 == r2) goto L45
            r2 = 5
            if (r1 == r2) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setStreamTimeout.STATE_ESTABLISHED:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r5, r1)
            goto L93
        L45:
            int r1 = r7.sslTimeout
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setStreamTimeout. STATE_HANDSHAKING. (+="
            r1.append(r2)
            int r2 = r7.sslTimeout
            r1.append(r2)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r5, r1)
            goto L93
        L66:
            int r1 = r7.connTimeout
            int r2 = r7.sslTimeout
            int r1 = r1 + r2
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setStreamTimeout. STATE_SHUTTING. (+="
            r1.append(r2)
            int r2 = r7.connTimeout
            r1.append(r2)
            java.lang.String r2 = "+"
            r1.append(r2)
            int r2 = r7.sslTimeout
            r1.append(r2)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r5, r1)
        L93:
            boolean r1 = r7.important
            if (r1 == 0) goto Lae
            int r0 = r0 + 5000
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setStreamTimeout. important is true. (+=5000)="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r5, r1)
        Lae:
            int r0 = r6.a(r7, r0)
            com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcStream r1 = r6.b
            r1.setTimeout(r0)
            r7.taskTimeout = r0
            int r0 = r7.taskTimeout
            r1 = 15000(0x3a98, float:2.102E-41)
            if (r0 >= r1) goto Lc1
            r7.taskTimeout = r1
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.mmtp.mrpc.MRpcTransport.a(com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest):void");
    }

    private int a(MRpcRequest mRpcRequest, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2657bcda", new Object[]{this, mRpcRequest, new Integer(i)})).intValue();
        }
        Map<String, String> headers = mRpcRequest.getHeaders();
        if (headers == null || headers.isEmpty() || !TextUtils.equals(headers.get(HeaderConstant.HEADER_KEY_OPERATION_TYPE), "alipay.mobilechat.sendMsg")) {
            return i;
        }
        LogCatUtil.info("MRpcTransport", "setStreamTimeout,sendMsg timeout: 180000");
        return 180000;
    }

    public MRpcResponse execute(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcResponse) ipChange.ipc$dispatch("b9f463cc", new Object[]{this, mRpcRequest});
        }
        if (AmnetLimitingHelper.isServerLimiting()) {
            return AmnetLimitingHelper.getLimitingMRpcResponse();
        }
        sendRequest(mRpcRequest);
        return getResponse();
    }

    public MRpcResponse getResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MRpcResponse) ipChange.ipc$dispatch("f375e5da", new Object[]{this}) : this.b.getResponse();
    }

    public MRpcConnection getMRpcConneciton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MRpcConnection) ipChange.ipc$dispatch("8aa5cb9b", new Object[]{this}) : MRpcConnection.getInstance();
    }

    public String getTargetHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4121f38a", new Object[]{this});
        }
        MRpcConnection mRpcConneciton = getMRpcConneciton();
        String currentTargetHost = mRpcConneciton.getCurrentTargetHost();
        if (TextUtils.isEmpty(currentTargetHost)) {
            return "";
        }
        return currentTargetHost + ":" + mRpcConneciton.getCurrentTargetPort();
    }

    private void b(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a734681d", new Object[]{this, mRpcRequest});
            return;
        }
        try {
            String str = mRpcRequest.getHeaders().get(HeaderConstant.HEADER_KEY_PARAM_TRACEID);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str2 = str + "_" + mRpcRequest.reqSeqId;
            mRpcRequest.addHeader(HeaderConstant.HEADER_KEY_PARAM_TRACEID, str2);
            TransportContext value = TransportContextThreadLocalUtils.getValue();
            if (value == null) {
                return;
            }
            value.rpcUUID = str2;
        } catch (Throwable th) {
            LogCatUtil.error("MRpcTransport", "setTraceId exception", th);
        }
    }
}
