package com.alipay.mobile.common.transport.download;

import com.alipay.mobile.common.transport.GlobalTransportCallbackObservable;
import com.alipay.mobile.common.transport.TransportCallback;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.Header;

/* loaded from: classes3.dex */
public class DownloadRequest extends HttpUrlRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATION_TYPE = "download_request";

    /* renamed from: a  reason: collision with root package name */
    private String f5531a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    public static /* synthetic */ Object ipc$super(DownloadRequest downloadRequest, String str, Object... objArr) {
        if (str.hashCode() == -998684407) {
            return super.getCallback();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DownloadRequest(String str) {
        super(str);
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        addTags("operationType", OPERATION_TYPE);
    }

    public DownloadRequest(String str, byte[] bArr, ArrayList<Header> arrayList) {
        super(str, bArr, arrayList, (HashMap<String, String>) null);
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        addTags("operationType", OPERATION_TYPE);
    }

    public DownloadRequest(String str, String str2, byte[] bArr, ArrayList<Header> arrayList) {
        super(str, bArr, arrayList, (HashMap<String, String>) null);
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        addTags("operationType", OPERATION_TYPE);
        setPath(str2);
    }

    public String getPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this}) : this.f5531a;
    }

    public void setPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600486f8", new Object[]{this, str});
        } else if (str == null) {
            throw new IllegalArgumentException("Not set valid path.");
        } else {
            this.f5531a = str;
        }
    }

    public boolean isRedownload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9729aa90", new Object[]{this})).booleanValue() : this.b;
    }

    public void setRedownload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7f5390", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public boolean isUrgentResource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ddbc7244", new Object[]{this})).booleanValue() : this.c;
    }

    public void setUrgentResource(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd235e5c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        setUrgentFlag(z);
    }

    @Override // com.alipay.mobile.common.transport.Request
    public void setTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1df508", new Object[]{this, transportCallback});
        } else {
            this.mCallback = new DownloadTransportCallbackWrapper(transportCallback);
        }
    }

    @Override // com.alipay.mobile.common.transport.Request
    public TransportCallback getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportCallback) ipChange.ipc$dispatch("c4794909", new Object[]{this});
        }
        TransportCallback callback = super.getCallback();
        return callback != null ? callback : GlobalTransportCallbackObservable.getInstance();
    }

    public boolean isAllowRetryForErrorHttpStatusCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23a8e5a", new Object[]{this})).booleanValue() : this.d;
    }

    public void setAllowRetryForErrorHttpStatusCode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d9e306", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean isOnlyWifiRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1cd526f", new Object[]{this})).booleanValue() : this.e;
    }

    public void setOnlyWifiRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea79101", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }
}
