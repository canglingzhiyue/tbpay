package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* loaded from: classes3.dex */
public class ZHttpOutputStream extends FilterOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HttpWorker f5562a;
    private int b;
    private TimeoutMonitor c;
    private ScheduledFuture<?> d;

    public static /* synthetic */ Object ipc$super(ZHttpOutputStream zHttpOutputStream, String str, Object... objArr) {
        if (str.hashCode() == 462729549) {
            super.write((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ HttpWorker access$000(ZHttpOutputStream zHttpOutputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpWorker) ipChange.ipc$dispatch("d1f9a3b2", new Object[]{zHttpOutputStream}) : zHttpOutputStream.f5562a;
    }

    public ZHttpOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.b = -1;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            super.write(bArr, 0, bArr.length);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        a();
        super.write(bArr, i, i2);
        b();
    }

    public void setHttpWorker(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94895a45", new Object[]{this, httpWorker});
        } else {
            this.f5562a = httpWorker;
        }
    }

    public ScheduledFuture<?> getTimeoutScheduler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("6b7cfc76", new Object[]{this}) : this.d;
    }

    private void a() {
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f5562a == null || (c = c()) <= 0) {
        } else {
            TimeoutMonitor d = d();
            d.setExecuteTime(System.currentTimeMillis() + c);
            this.d = NetworkAsyncTaskExecutor.schedule(d, c + 300, TimeUnit.MILLISECONDS);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.d == null || this.d.isCancelled()) {
                return;
            }
            if (this.d.isDone()) {
                throw new SocketTimeoutException("write timeout");
            }
            this.d.cancel(true);
            this.d = null;
        } catch (Throwable th) {
            LogCatUtil.warn("ZHttpOutputStream", "cancel fail", th);
        }
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        int i = this.b;
        if (i != -1) {
            return i;
        }
        if (!TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.HTTP_WRITE_TIMEOUT_SWITCH, "T")) {
            this.b = 0;
            return this.b;
        }
        HttpWorker httpWorker = this.f5562a;
        if (httpWorker != null) {
            try {
                HttpParams params = httpWorker.getTargetHttpUriRequest().getParams();
                if (params != null) {
                    this.b = HttpConnectionParams.getSoTimeout(params);
                }
            } catch (Throwable unused) {
                this.b = 0;
                return this.b;
            }
        }
        return this.b;
    }

    private TimeoutMonitor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeoutMonitor) ipChange.ipc$dispatch("c088748d", new Object[]{this});
        }
        TimeoutMonitor timeoutMonitor = this.c;
        if (timeoutMonitor != null) {
            return timeoutMonitor;
        }
        TimeoutMonitor timeoutMonitor2 = new TimeoutMonitor();
        this.c = timeoutMonitor2;
        return timeoutMonitor2;
    }

    /* loaded from: classes3.dex */
    public class TimeoutMonitor implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long executeTime = -1;

        public TimeoutMonitor() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpUriRequest targetHttpUriRequest;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (System.currentTimeMillis() < this.executeTime) {
            } else {
                try {
                    HttpWorker access$000 = ZHttpOutputStream.access$000(ZHttpOutputStream.this);
                    if (access$000 == null || (targetHttpUriRequest = access$000.getTargetHttpUriRequest()) == null) {
                        return;
                    }
                    targetHttpUriRequest.abort();
                    LogCatUtil.warn("ZHttpOutputStream", "Timeout, initiative abort request ");
                } catch (Throwable th) {
                    LogCatUtil.warn("ZHttpOutputStream", "Timeout abort request fail.", th);
                }
            }
        }

        public void setExecuteTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95fea0fd", new Object[]{this, new Long(j)});
            } else {
                this.executeTime = j;
            }
        }
    }
}
