package com.alipay.mobile.common.transport.h5;

import com.alipay.mobile.common.transport.http.HttpForm;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpUriRequest;

/* loaded from: classes3.dex */
public class H5HttpUrlRequest extends HttpUrlRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte HTTP_LINK = 2;
    public static final String OPERATION_TYPE = "h5_http_request";
    public static final byte SPDY_LINK = 1;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5539a;
    private boolean b;
    private boolean c;
    private String d;
    public int linkType;

    public H5HttpUrlRequest(String str) {
        super(str);
        this.linkType = 2;
        this.f5539a = false;
        this.b = true;
        this.c = false;
        init();
    }

    public H5HttpUrlRequest(String str, byte[] bArr, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        super(str, bArr, arrayList, hashMap);
        this.linkType = 2;
        this.f5539a = false;
        this.b = true;
        this.c = false;
        init();
    }

    public H5HttpUrlRequest(String str, HttpForm httpForm, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        super(str, httpForm, arrayList, hashMap);
        this.linkType = 2;
        this.f5539a = false;
        this.b = true;
        this.c = false;
        init();
    }

    public H5HttpUrlRequest(String str, HttpEntity httpEntity, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        super(str, httpEntity, arrayList, hashMap);
        this.linkType = 2;
        this.f5539a = false;
        this.b = true;
        this.c = false;
        init();
    }

    public H5HttpUrlRequest(String str, InputStream inputStream, int i, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        super(str, inputStream, i, arrayList, hashMap);
        this.linkType = 2;
        this.f5539a = false;
        this.b = true;
        this.c = false;
        init();
    }

    public H5HttpUrlRequest(HttpUriRequest httpUriRequest) {
        super(httpUriRequest);
        this.linkType = 2;
        this.f5539a = false;
        this.b = true;
        this.c = false;
        init();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        addTags("operationType", OPERATION_TYPE);
        setCompress(false);
        setBgRpc(false);
        setUseHttpStdRetryModel(true);
        LogCatUtil.info("H5HttpUrlRequest", "url=" + getUrl());
    }

    public boolean isGoSpdy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("98c2590f", new Object[]{this})).booleanValue() : (this.linkType & 1) == 1;
    }

    public boolean isGoHttp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("107d0ee5", new Object[]{this})).booleanValue() : (this.linkType & 2) == 2;
    }

    public boolean isAsyncMonitorLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa727327", new Object[]{this})).booleanValue() : this.f5539a;
    }

    public void setAsyncMonitorLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa68749", new Object[]{this, new Boolean(z)});
        } else {
            this.f5539a = z;
        }
    }

    public boolean isPrintUrlToMonitorLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bde9215c", new Object[]{this})).booleanValue() : this.b;
    }

    public void setPrintUrlToMonitorLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b71c44", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void setUseCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad83890", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean getUseCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f39d7bc", new Object[]{this})).booleanValue() : this.c;
    }

    public String getRefer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a60c1e6f", new Object[]{this}) : this.d;
    }

    public void setRefer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c850454f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
