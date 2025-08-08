package com.alipay.mobile.common.transport.h5;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.TraficConsumeModel;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.io.RpcBufferedInputStream;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.DataItemsUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MonitorLogRecordUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class NetworkInputStreamWrapper extends RpcBufferedInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5542a;
    private HttpManager b;
    private long c;
    private HttpWorker d;
    private Throwable e;
    public TransportContext mTransportContext;

    public static /* synthetic */ Object ipc$super(NetworkInputStreamWrapper networkInputStreamWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -483678593) {
            super.close();
            return null;
        } else if (hashCode != 862063607) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.read((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
    }

    public static /* synthetic */ void access$000(NetworkInputStreamWrapper networkInputStreamWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b30b21", new Object[]{networkInputStreamWrapper});
        } else {
            networkInputStreamWrapper.b();
        }
    }

    public NetworkInputStreamWrapper(InputStream inputStream, TransportContext transportContext, HttpManager httpManager, HttpWorker httpWorker) {
        super(inputStream);
        this.f5542a = false;
        this.c = -1L;
        this.mTransportContext = transportContext;
        this.b = httpManager;
        this.d = httpWorker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.alipay.mobile.common.transport.io.RpcBufferedInputStream, java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        long currentTimeMillis;
        int read;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.c == -1) {
            this.c = System.currentTimeMillis();
        }
        try {
            try {
                currentTimeMillis = System.currentTimeMillis();
                read = super.read(bArr, i, i2);
            } catch (IOException e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                AlipayQosService.getInstance().estimateByStartTime(currentTimeMillis, (byte) 5);
                if ((read == -1 || this.e != null) && !this.f5542a) {
                    monitorLog();
                }
                return read;
            } catch (IOException e2) {
                e = e2;
                LogCatUtil.debug("NetworkInputStreamWrapper", "read ex:" + e.toString());
                if (e instanceof SocketTimeoutException) {
                    AlipayQosService.getInstance().estimate(5000.0d, (byte) 5);
                }
                this.e = e;
                throw e;
            } catch (Throwable th2) {
                th = th2;
                this.e = th;
                InterruptedIOException interruptedIOException = new InterruptedIOException(th.getMessage());
                interruptedIOException.initCause(th);
                throw interruptedIOException;
            }
        } catch (Throwable th3) {
            th = th3;
            if ((bArr != -1 || this.e != null) && !this.f5542a) {
                monitorLog();
            }
            throw th;
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        LogCatUtil.warn("NetworkInputStreamWrapper", "H5InputStream invoke close.");
        if (!this.f5542a) {
            monitorLog();
        }
        super.close();
    }

    public void monitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1ee711", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f5542a = true;
            this.mTransportContext.getCurrentDataContainer().timeItemRelease("ALL_TIME");
            long currentTimeMillis2 = System.currentTimeMillis() - this.c;
            if (this.c == -1) {
                currentTimeMillis2 = 0;
            }
            this.mTransportContext.getCurrentDataContainer().putDataItem(RPCDataItems.READ_TIME, String.valueOf(currentTimeMillis2));
            if (c()) {
                a();
            } else {
                b();
            }
        } catch (Exception e) {
            LogCatUtil.error("NetworkInputStreamWrapper", e);
        } finally {
            LogCatUtil.info("NetworkInputStreamWrapper", "cost:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.mTransportContext.taskFinishedTimeMillis = System.currentTimeMillis();
        NetworkAsyncTaskExecutor.executeHighSerial(new Runnable() { // from class: com.alipay.mobile.common.transport.h5.NetworkInputStreamWrapper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NetworkInputStreamWrapper.access$000(NetworkInputStreamWrapper.this);
                }
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Throwable th = this.e;
        if (th != null) {
            LogCatUtil.error("NetworkInputStreamWrapper", "Read fail, exception: ", th);
            this.mTransportContext.getCurrentDataContainer().putDataItem("ERROR", this.e.toString());
        }
        if (this.d.getOriginRequest().isCanceled()) {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), "CANCEL", "T");
        }
        this.mTransportContext.getCurrentDataContainer().putDataItem(RPCDataItems.RES_SIZE, String.valueOf(getReaded()));
        this.d.doMonitorLog();
        try {
            if (this.mTransportContext.bizType == 3) {
                i = 2;
            }
            int i2 = this.mTransportContext.bizType == 5 ? 5 : i;
            String str = this.mTransportContext.url;
            String dataItem = this.mTransportContext.getCurrentDataContainer().getDataItem(RPCDataItems.REQ_SIZE);
            TraficConsumeModel obtain = TraficConsumeModel.obtain(i2, str, !StringUtils.isEmpty(dataItem) ? Long.valueOf(dataItem).longValue() : 0L, getReaded(), null);
            obtain.isUpload = false;
            obtain.bizId = this.d.getOriginRequest().getTag("bizId");
            obtain.reqHeaders = this.d.getOriginRequest().getHttpUriRequest().getAllHeaders();
            obtain.respHeaders = this.d.getHttpResponse().getAllHeaders();
            HttpUrlRequest originRequest = this.d.getOriginRequest();
            if (originRequest != null && (originRequest instanceof H5HttpUrlRequest)) {
                H5HttpUrlRequest h5HttpUrlRequest = (H5HttpUrlRequest) originRequest;
                MonitorLogRecordUtil.recordCtrlPrintURLFlagToDataflow(obtain, h5HttpUrlRequest.isPrintUrlToMonitorLog());
                if (!StringUtils.isEmpty(h5HttpUrlRequest.getRefer())) {
                    obtain.extParams.put("h5_refer", h5HttpUrlRequest.getRefer());
                }
            }
            MonitorInfoUtil.noteTraficConsume(obtain);
        } catch (Throwable th2) {
            LogCatUtil.warn("NetworkInputStreamWrapper", "NetworkISW.outer", th2);
        }
        String dataItem2 = this.mTransportContext.getCurrentDataContainer().getDataItem(RPCDataItems.READ_TIME);
        if (StringUtils.isEmpty(dataItem2)) {
            return;
        }
        try {
            this.b.addSocketTime(Long.parseLong(dataItem2));
        } catch (Throwable unused) {
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            HttpUrlRequest originRequest = this.d.getOriginRequest();
            if (originRequest != null && (originRequest instanceof H5HttpUrlRequest)) {
                return ((H5HttpUrlRequest) originRequest).isAsyncMonitorLog();
            }
            return false;
        } catch (Throwable th) {
            LogCatUtil.error("NetworkInputStreamWrapper", "isAsyncMonitorLog error. ", th);
            return false;
        }
    }
}
