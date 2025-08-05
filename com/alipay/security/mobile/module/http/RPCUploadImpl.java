package com.alipay.security.mobile.module.http;

import android.content.Context;
import com.alipay.mobile.framework.service.common.MpaasRpcService;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.alipay.tscenterdata.biz.service.EdgeDataReportService;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbRequest;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import tb.cjw;

/* loaded from: classes3.dex */
public class RPCUploadImpl implements IUpload {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static DataReportResult asyncResult;
    private static int riskRpcStatus;
    private static RPCUploadImpl rpcUpload;
    private BugTrackMessageService mBugTrackMessageService;
    private DataReportService mDataReportService;
    private EdgeDataReportService mEdgeDataReportService;
    private MpaasRpcService mpaasRpcService;

    private RPCUploadImpl(Context context, String str) {
        this.mpaasRpcService = null;
        this.mBugTrackMessageService = null;
        this.mDataReportService = null;
        this.mEdgeDataReportService = null;
        this.mpaasRpcService = new MpaasRpcServiceImpl(context);
        this.mBugTrackMessageService = (BugTrackMessageService) this.mpaasRpcService.getRpcProxy(BugTrackMessageService.class);
        this.mDataReportService = (DataReportService) this.mpaasRpcService.getRpcProxy(DataReportService.class);
        this.mEdgeDataReportService = (EdgeDataReportService) this.mpaasRpcService.getRpcProxy(EdgeDataReportService.class);
        this.mpaasRpcService.getRpcInvokeContext(this.mBugTrackMessageService).setGwUrl(str);
        this.mpaasRpcService.getRpcInvokeContext(this.mDataReportService).setGwUrl(str);
        this.mpaasRpcService.getRpcInvokeContext(this.mEdgeDataReportService).setGwUrl(str);
    }

    public static /* synthetic */ EdgeDataReportService access$000(RPCUploadImpl rPCUploadImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EdgeDataReportService) ipChange.ipc$dispatch("993f10a0", new Object[]{rPCUploadImpl}) : rPCUploadImpl.mEdgeDataReportService;
    }

    public static /* synthetic */ int access$102(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4936387c", new Object[]{new Integer(i)})).intValue();
        }
        riskRpcStatus = i;
        return i;
    }

    public static /* synthetic */ DataReportService access$200(RPCUploadImpl rPCUploadImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataReportService) ipChange.ipc$dispatch("34a1ee6b", new Object[]{rPCUploadImpl}) : rPCUploadImpl.mDataReportService;
    }

    public static /* synthetic */ DataReportResult access$302(DataReportResult dataReportResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataReportResult) ipChange.ipc$dispatch("6425bb84", new Object[]{dataReportResult});
        }
        asyncResult = dataReportResult;
        return dataReportResult;
    }

    public static synchronized RPCUploadImpl getInstance(Context context, String str) {
        synchronized (RPCUploadImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RPCUploadImpl) ipChange.ipc$dispatch("c3b77eb8", new Object[]{context, str});
            }
            if (rpcUpload == null) {
                rpcUpload = new RPCUploadImpl(context, str);
            }
            return rpcUpload;
        }
    }

    @Override // com.alipay.security.mobile.module.http.IUpload
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2d435b", new Object[]{this, str})).booleanValue();
        }
        if (cjw.a(str) || (bugTrackMessageService = this.mBugTrackMessageService) == null) {
            return false;
        }
        String str2 = null;
        try {
            str2 = bugTrackMessageService.logCollect(cjw.f(str));
        } catch (Throwable unused) {
        }
        if (cjw.a(str2)) {
            return false;
        }
        return ((Boolean) new JSONObject(str2).get("success")).booleanValue();
    }

    @Override // com.alipay.security.mobile.module.http.IUpload
    public DataReportResult updateStaticData(final DataReportRequest dataReportRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataReportResult) ipChange.ipc$dispatch("bdf87ddc", new Object[]{this, dataReportRequest});
        }
        if (dataReportRequest == null) {
            return null;
        }
        if (this.mDataReportService != null) {
            asyncResult = null;
            new Thread(new Runnable() { // from class: com.alipay.security.mobile.module.http.RPCUploadImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DataReportResult dataReportResult;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        dataReportResult = RPCUploadImpl.access$200(RPCUploadImpl.this).reportData(dataReportRequest);
                    } catch (Throwable th) {
                        DataReportResult dataReportResult2 = new DataReportResult();
                        dataReportResult2.success = false;
                        dataReportResult2.resultCode = "static data rpc upload error, " + cjw.a(th);
                        new StringBuilder("rpc failed:").append(cjw.a(th));
                        dataReportResult = dataReportResult2;
                    }
                    RPCUploadImpl.access$302(dataReportResult);
                }
            }, "APSecuritySdk").start();
            for (int i = RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT; asyncResult == null && i >= 0; i -= 50) {
                Thread.sleep(50L);
            }
        }
        return asyncResult;
    }

    @Override // com.alipay.security.mobile.module.http.IUpload
    public int uploadRiskData(final ReportPbRequest reportPbRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22bb88d", new Object[]{this, reportPbRequest})).intValue();
        }
        riskRpcStatus = 404;
        if (this.mEdgeDataReportService == null) {
            return riskRpcStatus;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.alipay.security.mobile.module.http.RPCUploadImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ReportPbResult upload = RPCUploadImpl.access$000(RPCUploadImpl.this).upload(reportPbRequest);
                    if (upload != null) {
                        RPCUploadImpl.access$102(upload.code);
                    }
                } catch (Throwable th) {
                    try {
                        new StringBuilder("EdgeDataReportService rpc exception:").append(cjw.a(th));
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            }
        }, "APSecuritySdk").start();
        try {
            countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            new StringBuilder("EdgeDataReportService rpc exception:").append(cjw.a(e));
        }
        if (riskRpcStatus != 0) {
            new StringBuilder("EdgeDataReportService rpc failed:").append(riskRpcStatus);
        }
        return riskRpcStatus;
    }
}
