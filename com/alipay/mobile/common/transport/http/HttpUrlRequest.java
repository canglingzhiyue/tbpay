package com.alipay.mobile.common.transport.http;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.RequestMethodUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.ZURLEncodedUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class HttpUrlRequest extends Request {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte TASK_STATE_END = 2;
    public static final byte TASK_STATE_INIT = 0;
    public static final byte TASK_STATE_RUNNING = 1;
    private boolean A;
    private Map<String, String> B;
    private String C;

    /* renamed from: a  reason: collision with root package name */
    private String f5557a;
    public boolean allowNonNet;
    public boolean allowRetry;
    private byte[] b;
    private String c;
    public boolean capture;
    private ArrayList<Header> d;
    private Map<String, String> e;
    private boolean f;
    public Throwable failedException;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private HttpForm l;
    private InputStream m;
    public PerformanceDataCallback mPerformanceDataCallback;
    public long mTimeout;
    private boolean n;
    public Thread networkThread;
    private long o;
    private HttpEntity p;
    private HttpUriRequest q;
    private HttpResponse r;
    private boolean s;
    private boolean t;
    public int taskState;
    private boolean u;
    private String v;
    private boolean w;
    private boolean x;
    private boolean y;
    private Map<String, String> z;

    public static /* synthetic */ Object ipc$super(HttpUrlRequest httpUrlRequest, String str, Object... objArr) {
        if (str.hashCode() == 1887430145) {
            super.cancel();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HttpUrlRequest(HttpUriRequest httpUriRequest) {
        this(httpUriRequest.getURI().toString());
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase;
        HttpEntity entity;
        this.q = httpUriRequest;
        Header[] allHeaders = httpUriRequest.getAllHeaders();
        if (allHeaders != null && allHeaders.length > 0) {
            for (Header header : allHeaders) {
                addHeader(header);
            }
        }
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase2 = this.q;
        if ((httpEntityEnclosingRequestBase2 instanceof HttpEntityEnclosingRequestBase) && (entity = (httpEntityEnclosingRequestBase = httpEntityEnclosingRequestBase2).getEntity()) != null) {
            httpEntityEnclosingRequestBase.setEntity(new ZNetworkHttpEntityWrapper(entity));
        }
        setRequestMethod(RequestMethodUtils.getMethodByHttpUriRequest(httpUriRequest));
        a(httpUriRequest);
    }

    public HttpUrlRequest(String str) {
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = "GET";
        this.n = false;
        this.o = 0L;
        this.allowRetry = false;
        this.mTimeout = -1L;
        this.allowNonNet = false;
        this.s = false;
        this.t = false;
        this.capture = false;
        this.u = false;
        this.w = false;
        this.x = false;
        this.taskState = 0;
        this.y = true;
        this.A = false;
        this.B = new HashMap();
        this.C = "";
        this.f5557a = ZURLEncodedUtil.urlEncode(str);
        this.d = new ArrayList<>();
        this.e = new HashMap();
        this.c = HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }

    public HttpUrlRequest(String str, byte[] bArr, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = "GET";
        this.n = false;
        this.o = 0L;
        this.allowRetry = false;
        this.mTimeout = -1L;
        this.allowNonNet = false;
        this.s = false;
        this.t = false;
        this.capture = false;
        this.u = false;
        this.w = false;
        this.x = false;
        this.taskState = 0;
        this.y = true;
        this.A = false;
        this.B = new HashMap();
        this.C = "";
        this.f5557a = ZURLEncodedUtil.urlEncode(str);
        this.b = bArr;
        if (bArr != null) {
            this.o = bArr.length;
        }
        if (arrayList == null) {
            this.d = new ArrayList<>();
        } else {
            this.d = arrayList;
        }
        if (hashMap == null) {
            this.e = new HashMap(4);
        } else {
            this.e = hashMap;
        }
        this.c = HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }

    public HttpUrlRequest(String str, HttpForm httpForm, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this(str, (byte[]) null, arrayList, hashMap);
        this.l = httpForm;
        this.o = httpForm.getContentLength();
    }

    public HttpUrlRequest(String str, HttpEntity httpEntity, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this(str, (byte[]) null, arrayList, hashMap);
        this.p = httpEntity;
        this.o = httpEntity.getContentLength();
    }

    public HttpUrlRequest(String str, InputStream inputStream, long j, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this(str, (byte[]) null, arrayList, hashMap);
        this.m = inputStream;
        this.o = j;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.f5557a;
    }

    public String setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b4d97e2", new Object[]{this, str});
        }
        String urlEncode = ZURLEncodedUtil.urlEncode(str);
        this.f5557a = urlEncode;
        return urlEncode;
    }

    public byte[] getReqData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("bfa72344", new Object[]{this}) : this.b;
    }

    public void setReqData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82a05b4", new Object[]{this, bArr});
        } else if (this.m != null) {
            throw new IllegalArgumentException("You have been set inputStream  ， not allowed to set reqData");
        } else {
            if (this.l != null) {
                throw new IllegalArgumentException("You have been set httpForm ， not allowed to set reqData");
            }
            this.b = bArr;
            if (bArr == null) {
                return;
            }
            this.o = bArr.length;
        }
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this});
        }
        ArrayList<Header> arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return this.c;
        }
        Iterator<Header> it = this.d.iterator();
        while (it.hasNext()) {
            Header next = it.next();
            if ("Content-Type".equalsIgnoreCase(next.getName()) && !StringUtils.isEmpty(next.getValue())) {
                this.c = next.getValue();
                return this.c;
            }
        }
        return this.c;
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setHeaders(ArrayList<Header> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23bab3f", new Object[]{this, arrayList});
        } else if (arrayList == null) {
        } else {
            this.d = arrayList;
        }
    }

    public void addHeader(Header header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369e1a26", new Object[]{this, header});
        } else {
            this.d.add(header);
        }
    }

    public void setHeader(Header header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a362da7", new Object[]{this, header});
        } else if (header != null) {
            for (int i = 0; i < this.d.size(); i++) {
                Header header2 = this.d.get(i);
                if (header2 != null && header2.getName() != null && header2.getName().equalsIgnoreCase(header.getName())) {
                    LogCatUtil.warn("HttpUrlRequest", "setHeadert. Conflict header , key=[" + header.getName() + "], old_value=[" + header2.getValue() + "] , new_value=[" + header.getValue() + "] ");
                    this.d.set(i, header);
                    return;
                }
            }
            this.d.add(header);
        }
    }

    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
        } else {
            this.d.add(new BasicHeader(str, str2));
        }
    }

    public ArrayList<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("387b9a31", new Object[]{this}) : this.d;
    }

    public void setTags(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328360a3", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public void addTags(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6584875", new Object[]{this, str, str2});
            return;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(str, str2);
    }

    public String getTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca26b54b", new Object[]{this, str});
        }
        Map<String, String> map = this.e;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public boolean isResetCookie() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d221114", new Object[]{this})).booleanValue() : this.g;
    }

    public void setResetCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d02fc", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return getUrl() + Integer.toHexString(getReqData().hashCode());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        Object[] objArr = new Object[4];
        objArr[0] = getUrl();
        objArr[1] = getHeaders();
        objArr[2] = getTags().toString();
        byte[] bArr = this.b;
        objArr[3] = bArr == null ? "" : new String(bArr);
        return String.format("Url : %s,HttpHeader: %s, Tags: %s, Body:%s", objArr);
    }

    public Map<String, String> getTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6c88d54b", new Object[]{this});
        }
        Map<String, String> map = this.e;
        if (map != null && !map.isEmpty()) {
            return this.e;
        }
        return Collections.EMPTY_MAP;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 1;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Map<String, String> map = this.e;
        if (map != null && map.containsKey(TransportConstants.KEY_REQ_DATA_DIGEST)) {
            i = 31 + this.e.get(TransportConstants.KEY_REQ_DATA_DIGEST).hashCode();
        }
        int hashCode = (i * 31) + (StringUtils.isEmpty(this.f5557a) ? 0 : this.f5557a.hashCode());
        if (this.e.containsKey("operationType")) {
            i2 = this.e.get("operationType").hashCode();
        }
        return hashCode + i2;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpUrlRequest httpUrlRequest = (HttpUrlRequest) obj;
        byte[] bArr = this.b;
        if (bArr == null) {
            if (httpUrlRequest.b != null) {
                return false;
            }
        } else if (!Arrays.equals(bArr, httpUrlRequest.b)) {
            return false;
        }
        String str = this.f5557a;
        if (str == null) {
            if (httpUrlRequest.f5557a != null) {
                return false;
            }
        } else if (!StringUtils.equals(str, httpUrlRequest.f5557a)) {
            return false;
        }
        return true;
    }

    public boolean isBgRpc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a6f29e1", new Object[]{this})).booleanValue() : this.f;
    }

    public void setBgRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e70cdcf", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean isUseEtag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97c2ea3d", new Object[]{this})).booleanValue() : this.h;
    }

    public void setUseEtag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2537aaf3", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean isCompress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2873e137", new Object[]{this})).booleanValue() : this.i;
    }

    public void setCompress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ffc3c9", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public boolean isContainerHeader(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c52bdf79", new Object[]{this, str})).booleanValue();
        }
        Iterator<Header> it = this.d.iterator();
        while (it.hasNext()) {
            if (StringUtils.equals(str, it.next().getName())) {
                return true;
            }
        }
        return false;
    }

    public void setRequestMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1acc71f", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public String getRequestMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e510ee9f", new Object[]{this}) : this.k;
    }

    public HttpForm getHttpForm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpForm) ipChange.ipc$dispatch("27b7ac1d", new Object[]{this}) : this.l;
    }

    public void setHttpForm(HttpForm httpForm) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7f1145", new Object[]{this, httpForm});
        } else if (this.m != null) {
            throw new IllegalArgumentException("You have been set inputStream  ， not allowed to set httpForm");
        } else {
            if (this.b != null) {
                throw new IllegalArgumentException("You have been set reqData ， not allowed to set httpForm");
            }
            this.l = httpForm;
            if (httpForm == null) {
                return;
            }
            this.o = httpForm.getContentLength();
        }
    }

    public void setInputStream(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186a1f44", new Object[]{this, inputStream});
        } else if (this.l != null) {
            throw new IllegalArgumentException("You have been set httpForm ， not allowed to set inputStream");
        } else {
            if (this.b != null) {
                throw new IllegalArgumentException("You have been set mReqData ， not allowed to set inputStream");
            }
            this.m = inputStream;
            if (inputStream == null) {
                return;
            }
            innerSetDataLength(inputStream);
        }
    }

    public void innerSetDataLength(InputStream inputStream) {
        int available;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22d2170", new Object[]{this, inputStream});
            return;
        }
        try {
            if (this.o > 0 || (available = inputStream.available()) <= 0) {
                return;
            }
            this.o = available;
        } catch (IOException e) {
            LogCatUtil.error(HttpWorker.TAG, "HttpUrlRequest#setInputStream. available error!", e);
        }
    }

    public InputStream getInputStream() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("b713b4be", new Object[]{this}) : this.m;
    }

    public void setUrgentFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ee543e", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public boolean getUrgentFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c08d214e", new Object[]{this})).booleanValue() : this.n;
    }

    public long getDataLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2bf868a1", new Object[]{this})).longValue() : this.o;
    }

    public void setDataLength(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ebbd2b", new Object[]{this, new Long(j)});
        } else {
            this.o = j;
        }
    }

    public HttpEntity getHttpEntity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpEntity) ipChange.ipc$dispatch("3ae0cb21", new Object[]{this}) : this.p;
    }

    public void setHttpEntity(HttpEntity httpEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13755e7", new Object[]{this, httpEntity});
            return;
        }
        this.p = httpEntity;
        if (httpEntity == null) {
            return;
        }
        this.o = httpEntity.getContentLength();
    }

    public HttpUriRequest getHttpUriRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpUriRequest) ipChange.ipc$dispatch("13e8dd7e", new Object[]{this}) : this.q;
    }

    public void setHttpUriRequest(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c839cdb2", new Object[]{this, httpUriRequest});
        } else {
            this.q = httpUriRequest;
        }
    }

    public String getCancelMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5e917a8", new Object[]{this}) : this.v;
    }

    @Override // com.alipay.mobile.common.transport.Request
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        super.cancel();
        if (this.q == null) {
            return;
        }
        try {
            closeRequestEntity();
            closeResponseStream();
            if (this.q.isAborted()) {
                return;
            }
            this.q.abort();
            if (isTaskStateRunning()) {
                this.networkThread.interrupt();
                LogCatUtil.info("HttpUrlRequest", "invoke cancel, interrupt thread");
            }
            LogCatUtil.info("HttpUrlRequest", "invoke cancel, abort request");
        } catch (Throwable th) {
            LogCatUtil.warn("HttpUrlRequest", "abort request exception. errMsg=" + th.toString());
        }
    }

    @Override // com.alipay.mobile.common.transport.Request
    public void cancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5301f18b", new Object[]{this, str});
            return;
        }
        this.v = str;
        cancel();
    }

    public void closeRequestEntity() {
        InputStream content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9429f7c1", new Object[]{this});
            return;
        }
        HttpEntityEnclosingRequest httpEntityEnclosingRequest = this.q;
        if (httpEntityEnclosingRequest == null || !(httpEntityEnclosingRequest instanceof HttpEntityEnclosingRequest)) {
            return;
        }
        try {
            HttpEntity entity = httpEntityEnclosingRequest.getEntity();
            if (entity == null || (content = entity.getContent()) == null) {
                return;
            }
            content.close();
        } catch (Throwable th) {
            LogCatUtil.warn("HttpUrlRequest", "closeRequestEntity exception: " + th.toString());
        }
    }

    public void closeResponseStream() {
        InputStream content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56237340", new Object[]{this});
            return;
        }
        HttpResponse httpResponse = this.r;
        if (httpResponse == null) {
            return;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity == null || (content = entity.getContent()) == null) {
                return;
            }
            content.close();
        } catch (Throwable th) {
            LogCatUtil.warn("HttpUrlRequest", "closeResponseStream exception: " + th.toString());
        }
    }

    public void setHttpResponse(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6aa6a7", new Object[]{this, httpResponse});
        } else {
            this.r = httpResponse;
        }
    }

    public void setTimeout(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f7de", new Object[]{this, new Long(j)});
        } else {
            this.mTimeout = j;
        }
    }

    public long getTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e838026", new Object[]{this})).longValue() : this.mTimeout;
    }

    public boolean isAllowNonNet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbdbddba", new Object[]{this})).booleanValue() : this.allowNonNet;
    }

    public void setAllowNonNet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418ccb16", new Object[]{this, new Boolean(z)});
        } else {
            this.allowNonNet = z;
        }
    }

    public boolean isDisableEncrypt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a99db332", new Object[]{this})).booleanValue() : this.s;
    }

    public void setDisableEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6a3b2e", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public boolean isEnableEncrypt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6a0eae3", new Object[]{this})).booleanValue() : this.t;
    }

    public void setEnableEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b556750d", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public boolean isCapture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b598d547", new Object[]{this})).booleanValue() : this.capture;
    }

    public void setCapture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f2129", new Object[]{this, new Boolean(z)});
        } else {
            this.capture = z;
        }
    }

    public boolean isUseHttpStdRetryModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12f80eca", new Object[]{this})).booleanValue() : this.u;
    }

    public void setUseHttpStdRetryModel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9685dc96", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public boolean isSwitchLoginRpc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64196465", new Object[]{this})).booleanValue() : this.w;
    }

    public void setSwitchLoginRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4264b05b", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public void setNetworkThread(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d449060e", new Object[]{this, thread});
        } else {
            this.networkThread = thread;
        }
    }

    public int getTaskState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b388a4d0", new Object[]{this})).intValue() : this.taskState;
    }

    public void setTaskState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8582d1d2", new Object[]{this, new Integer(i)});
        } else {
            this.taskState = i;
        }
    }

    public boolean isTaskStateInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd61afbd", new Object[]{this})).booleanValue() : this.taskState == 0;
    }

    public boolean isTaskStateRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("76d68968", new Object[]{this})).booleanValue() : this.taskState == 1;
    }

    public boolean isTaskStateEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7ca0d84", new Object[]{this})).booleanValue() : this.taskState == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: Throwable -> 0x008d, TryCatch #0 {Throwable -> 0x008d, blocks: (B:20:0x0056, B:23:0x005d, B:25:0x0064, B:27:0x006c, B:28:0x0070), top: B:33:0x0056 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.apache.http.client.methods.HttpUriRequest r9) {
        /*
            r8 = this;
            java.lang.String r0 = "alinet_tspi"
            java.lang.String r1 = "HttpUrlRequest"
            java.lang.String r2 = "bizId"
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.common.transport.http.HttpUrlRequest.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L1b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r8
            r1 = 1
            r0[r1] = r9
            java.lang.String r9 = "5d512bfe"
            r3.ipc$dispatch(r9, r0)
            return
        L1b:
            org.apache.http.params.HttpParams r9 = r9.getParams()
            if (r9 != 0) goto L22
            return
        L22:
            java.lang.String r3 = ""
            java.lang.Object r4 = r9.getParameter(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L34
            r9.removeParameter(r2)     // Catch: java.lang.Throwable -> L2f
            r3 = r4
            goto L4d
        L2f:
            r3 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L35
        L34:
            r4 = move-exception
        L35:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Get bizId from parameter fail. msg: "
            r5.append(r6)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r1, r4)
        L4d:
            boolean r4 = android.text.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L56
            r8.addTags(r2, r3)
        L56:
            java.lang.Object r2 = r9.getParameter(r0)     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L5d
            return
        L5d:
            r9.removeParameter(r0)     // Catch: java.lang.Throwable -> L8d
            boolean r9 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L8d
            if (r9 == 0) goto L70
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L8d
            boolean r9 = android.text.StringUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L8d
            if (r9 != 0) goto La6
            r8.addTags(r0, r2)     // Catch: java.lang.Throwable -> L8d
            goto La6
        L70:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r9.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "[paramsCopyToTags] Illegal target spi data type: "
            r9.append(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L8d
            r9.append(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L8d
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r1, r9)     // Catch: java.lang.Throwable -> L8d
            return
        L8d:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[paramsCopyToTags] Not find target spi param. msg : "
            r0.append(r2)
            java.lang.String r9 = r9.toString()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r1, r9)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.HttpUrlRequest.a(org.apache.http.client.methods.HttpUriRequest):void");
    }

    public void setRpcHttp2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb12ef46", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public boolean isRpcHttp2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bbed21a", new Object[]{this})).booleanValue();
        }
        return this.y || StringUtils.equals(getTag(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK), "true");
    }

    public void putLogAttachment(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8737ead3", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            if (this.z == null) {
                this.z = new HashMap(1);
            }
            this.z.put(str, str2);
        }
    }

    public Map<String, String> refLogAttachmentMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f4a7b84", new Object[]{this});
        }
        Map<String, String> map = this.z;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public boolean isUseSystemH2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9aa25401", new Object[]{this})).booleanValue() : this.j;
    }

    public void setUseSystemH2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b951daf", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void setRadicalStrategy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebb68e2", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public boolean isRadicalStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23de7a6e", new Object[]{this})).booleanValue() : this.x;
    }

    public Throwable getFailedException() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("210c9e48", new Object[]{this}) : this.failedException;
    }

    public void setFailedException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33407fe", new Object[]{this, th});
        } else {
            this.failedException = th;
        }
    }

    public PerformanceDataCallback getPerformanceDataCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PerformanceDataCallback) ipChange.ipc$dispatch("f1c563f5", new Object[]{this}) : this.mPerformanceDataCallback;
    }

    public void setPerformanceDataCallback(PerformanceDataCallback performanceDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc7ef31", new Object[]{this, performanceDataCallback});
        } else {
            this.mPerformanceDataCallback = performanceDataCallback;
        }
    }

    public boolean isFastReturnFailure() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b274d9bf", new Object[]{this})).booleanValue() : this.A;
    }

    public void setFastReturnFailure(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580505b1", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public void setExtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.B.clear();
            this.B.putAll(map);
        }
    }

    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this}) : this.B;
    }

    public void setBizLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e4a84", new Object[]{this, str});
        } else {
            this.C = str;
        }
    }

    public String getBizLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd4c932", new Object[]{this}) : this.C;
    }
}
