package com.alipay.mobile.common.transport.download;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class DownloadConnChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DownloadConnChangedListener f5530a;
    private List<DownloadRequest> b;

    public static final DownloadConnChangedListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DownloadConnChangedListener) ipChange.ipc$dispatch("3787f42", new Object[0]);
        }
        DownloadConnChangedListener downloadConnChangedListener = f5530a;
        if (downloadConnChangedListener != null) {
            return downloadConnChangedListener;
        }
        synchronized (DownloadConnChangedListener.class) {
            if (f5530a != null) {
                return f5530a;
            }
            f5530a = new DownloadConnChangedListener();
            return f5530a;
        }
    }

    private DownloadConnChangedListener() {
    }

    public void addNetworkSensitiveTask(DownloadRequest downloadRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968d24f8", new Object[]{this, downloadRequest});
        } else if (downloadRequest == null) {
        } else {
            try {
                synchronized (this) {
                    a().add(downloadRequest);
                }
            } catch (Throwable th) {
                LogCatUtil.warn("DownloadConnChangedListener", "[addNetworkSensitiveTask] Remove exception = " + th.toString(), th);
            }
        }
    }

    public void removeNetworkSensitiveTask(DownloadRequest downloadRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bef18f5", new Object[]{this, downloadRequest});
        } else if (downloadRequest == null || this.b == null) {
        } else {
            try {
                synchronized (this) {
                    a().remove(downloadRequest);
                }
            } catch (Throwable th) {
                LogCatUtil.warn("DownloadConnChangedListener", "[removeNetworkSensitiveTask] Remove exception = " + th.toString(), th);
            }
        }
    }

    public void notifyNetworkChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825a4292", new Object[]{this});
            return;
        }
        List<DownloadRequest> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
            LogCatUtil.info("DownloadConnChangedListener", "[notifyNetworkChangedEvent] Network unavailable, don't cancel.");
        } else if (NetworkUtils.isWiFiMobileNetwork(TransportEnvUtil.getContext())) {
        } else {
            synchronized (this) {
                int size = this.b.size();
                if (size <= 0) {
                    return;
                }
                while (this.b.size() > 0) {
                    DownloadRequest remove = this.b.remove(0);
                    if (remove != null) {
                        remove.cancel(TransportConstants.ERR_MSG_ILLEGAL_NETWORK_TYPE);
                    }
                }
                LogCatUtil.info("DownloadConnChangedListener", "[notifyNetworkChangedEvent] The number of cancellation tasks is " + size);
            }
        }
    }

    private List<DownloadRequest> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<DownloadRequest> list = this.b;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = new ArrayList(2);
            return this.b;
        }
    }
}
