package anetwork.channel.entity;

import android.text.TextUtils;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import anetwork.channel.Header;
import anetwork.channel.IBodyHandler;
import anetwork.channel.Param;
import anetwork.channel.Request;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class RequestImpl implements Request {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.RequestImpl";
    private String bizId;
    private int connectTimeout;
    private Map<String, String> extProperties;
    private List<Header> headers;
    private List<Param> params;
    private int readTimeout;
    private String seqNo;
    @Deprecated
    private URI uri;
    @Deprecated
    private URL url;
    private String urlString;
    private boolean isRedirect = true;
    private String method = "GET";
    private int retryTime = 2;
    private String charset = "utf-8";
    private BodyEntry bodyEntry = null;

    static {
        kge.a(-1539939791);
        kge.a(2008854017);
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public IBodyHandler getBodyHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBodyHandler) ipChange.ipc$dispatch("3307d43d", new Object[]{this});
        }
        return null;
    }

    public RequestImpl() {
    }

    @Deprecated
    public RequestImpl(URI uri) {
        this.uri = uri;
        this.urlString = uri.toString();
    }

    @Deprecated
    public RequestImpl(URL url) {
        this.url = url;
        this.urlString = url.toString();
    }

    public RequestImpl(String str) {
        this.urlString = str;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public URI getURI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("8e1ee1b", new Object[]{this});
        }
        URI uri = this.uri;
        if (uri != null) {
            return uri;
        }
        String str = this.urlString;
        if (str != null) {
            try {
                this.uri = new URI(str);
            } catch (Exception e) {
                ALog.e(TAG, "uri error", this.seqNo, e, new Object[0]);
            }
        }
        return this.uri;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setUri(URI uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cb77d3", new Object[]{this, uri});
        } else {
            this.uri = uri;
        }
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public URL getURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("569794d5", new Object[]{this});
        }
        URL url = this.url;
        if (url != null) {
            return url;
        }
        String str = this.urlString;
        if (str != null) {
            try {
                this.url = new URL(str);
            } catch (Exception e) {
                ALog.e(TAG, "url error", this.seqNo, e, new Object[0]);
            }
        }
        return this.url;
    }

    @Deprecated
    public void setUrL(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857fc213", new Object[]{this, url});
            return;
        }
        this.url = url;
        this.urlString = url.toString();
    }

    @Override // anetwork.channel.Request
    public String getUrlString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bb9898f", new Object[]{this}) : this.urlString;
    }

    @Override // anetwork.channel.Request
    public boolean getFollowRedirects() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8fbbdbb", new Object[]{this})).booleanValue() : this.isRedirect;
    }

    @Override // anetwork.channel.Request
    public void setFollowRedirects(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cfdb09", new Object[]{this, new Boolean(z)});
        } else {
            this.isRedirect = z;
        }
    }

    @Override // anetwork.channel.Request
    public List<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("19344190", new Object[]{this}) : this.headers;
    }

    @Override // anetwork.channel.Request
    public void setHeaders(List<Header> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f026123c", new Object[]{this, list});
        } else {
            this.headers = list;
        }
    }

    @Override // anetwork.channel.Request
    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            if (this.headers == null) {
                this.headers = new ArrayList();
            }
            this.headers.add(new BasicHeader(str, str2));
        }
    }

    @Override // anetwork.channel.Request
    public void removeHeader(Header header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c6b4ce", new Object[]{this, header});
            return;
        }
        List<Header> list = this.headers;
        if (list == null) {
            return;
        }
        list.remove(header);
    }

    @Override // anetwork.channel.Request
    public void setHeader(Header header) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f513f430", new Object[]{this, header});
        } else if (header == null) {
        } else {
            if (this.headers == null) {
                this.headers = new ArrayList();
            }
            int size = this.headers.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (header.getName().equalsIgnoreCase(this.headers.get(i).getName())) {
                    this.headers.set(i, header);
                    break;
                } else {
                    i++;
                }
            }
            if (i >= this.headers.size()) {
                return;
            }
            this.headers.add(header);
        }
    }

    @Override // anetwork.channel.Request
    public Header[] getHeaders(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header[]) ipChange.ipc$dispatch("399b4be6", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.headers == null) {
            return null;
        }
        for (int i = 0; i < this.headers.size(); i++) {
            if (this.headers.get(i) != null && this.headers.get(i).getName() != null && this.headers.get(i).getName().equalsIgnoreCase(str)) {
                arrayList.add(this.headers.get(i));
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        Header[] headerArr = new Header[arrayList.size()];
        arrayList.toArray(headerArr);
        return headerArr;
    }

    @Override // anetwork.channel.Request
    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.method;
    }

    @Override // anetwork.channel.Request
    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.method = str;
        }
    }

    @Override // anetwork.channel.Request
    public int getRetryTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d972c3d9", new Object[]{this})).intValue() : this.retryTime;
    }

    @Override // anetwork.channel.Request
    public void setRetryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i)});
        } else {
            this.retryTime = i;
        }
    }

    @Override // anetwork.channel.Request
    public String getCharset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ca2bba3", new Object[]{this}) : this.charset;
    }

    @Override // anetwork.channel.Request
    public void setCharset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb8419b", new Object[]{this, str});
        } else {
            this.charset = str;
        }
    }

    @Override // anetwork.channel.Request
    public List<Param> getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2ef808e4", new Object[]{this}) : this.params;
    }

    @Override // anetwork.channel.Request
    public void setParams(List<Param> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a81e000", new Object[]{this, list});
        } else {
            this.params = list;
        }
    }

    @Override // anetwork.channel.Request
    public BodyEntry getBodyEntry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BodyEntry) ipChange.ipc$dispatch("60609b33", new Object[]{this}) : this.bodyEntry;
    }

    @Override // anetwork.channel.Request
    public void setBodyEntry(BodyEntry bodyEntry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd9a0b3", new Object[]{this, bodyEntry});
        } else {
            this.bodyEntry = bodyEntry;
        }
    }

    @Override // anetwork.channel.Request
    public void setBodyHandler(IBodyHandler iBodyHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c545e347", new Object[]{this, iBodyHandler});
        } else {
            this.bodyEntry = new BodyHandlerEntry(iBodyHandler);
        }
    }

    @Override // anetwork.channel.Request
    public int getConnectTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5824f407", new Object[]{this})).intValue() : this.connectTimeout;
    }

    @Override // anetwork.channel.Request
    public int getReadTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue() : this.readTimeout;
    }

    @Override // anetwork.channel.Request
    public void setConnectTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabec0e3", new Object[]{this, new Integer(i)});
        } else {
            this.connectTimeout = i;
        }
    }

    @Override // anetwork.channel.Request
    public void setReadTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d585fd3", new Object[]{this, new Integer(i)});
        } else {
            this.readTimeout = i;
        }
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.bizId = String.valueOf(i);
        }
    }

    @Override // anetwork.channel.Request
    public void setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.bizId = str;
        }
    }

    @Override // anetwork.channel.Request
    public String getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this}) : this.bizId;
    }

    @Override // anetwork.channel.Request
    public void setSeqNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfc034f", new Object[]{this, str});
        } else {
            this.seqNo = str;
        }
    }

    @Override // anetwork.channel.Request
    public String getSeqNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3df0a06f", new Object[]{this}) : this.seqNo;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public boolean isCookieEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc2e6a3e", new Object[]{this})).booleanValue() : !"false".equals(getExtProperty(RequestConstant.ENABLE_COOKIE));
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setCookieEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8178e112", new Object[]{this, new Boolean(z)});
        } else {
            setExtProperty(RequestConstant.ENABLE_COOKIE, z ? "true" : "false");
        }
    }

    @Override // anetwork.channel.Request
    public void setExtProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506a336f", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.extProperties == null) {
                this.extProperties = new HashMap();
            }
            this.extProperties.put(str, str2);
        }
    }

    @Override // anetwork.channel.Request
    public String getExtProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaea504f", new Object[]{this, str});
        }
        Map<String, String> map = this.extProperties;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // anetwork.channel.Request
    public Map<String, String> getExtProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("185e757a", new Object[]{this}) : this.extProperties;
    }

    @Override // anetwork.channel.Request
    public void setTraceContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994e0e72", new Object[]{this, map});
        } else {
            this.extProperties.putAll(map);
        }
    }
}
