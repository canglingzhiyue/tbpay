package com.alipay.literpc.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import org.apache.http.HeaderElement;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes3.dex */
public final class Headers {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCEPT_RANGES = "accept-ranges";
    public static final String CACHE_CONTROL = "cache-control";
    public static final int CONN_CLOSE = 1;
    public static final String CONN_DIRECTIVE = "connection";
    public static final int CONN_KEEP_ALIVE = 2;
    public static final String CONTENT_DISPOSITION = "content-disposition";
    public static final String CONTENT_ENCODING = "content-encoding";
    public static final String CONTENT_LEN = "content-length";
    public static final String CONTENT_TYPE = "content-type";
    public static final String ETAG = "etag";
    public static final String EXPIRES = "expires";
    public static final String LAST_MODIFIED = "last-modified";
    public static final String LOCATION = "location";
    public static final int NO_CONN_TYPE = 0;
    public static final long NO_CONTENT_LENGTH = -1;
    public static final long NO_TRANSFER_ENCODING = 0;
    public static final String PRAGMA = "pragma";
    public static final String PROXY_AUTHENTICATE = "proxy-authenticate";
    public static final String PROXY_CONNECTION = "proxy-connection";
    public static final String REFRESH = "refresh";
    public static final String SET_COOKIE = "set-cookie";
    public static final String TRANSFER_ENCODING = "transfer-encoding";
    public static final String WWW_AUTHENTICATE = "www-authenticate";
    public static final String X_PERMITTED_CROSS_DOMAIN_POLICIES = "x-permitted-cross-domain-policies";
    private static final String[] f = {"transfer-encoding", "content-length", "content-type", "content-encoding", "connection", "location", "proxy-connection", "www-authenticate", "proxy-authenticate", "content-disposition", "accept-ranges", "expires", "cache-control", "last-modified", "etag", "set-cookie", "pragma", "refresh", "x-permitted-cross-domain-policies"};
    private ArrayList<String> d = new ArrayList<>(2);
    private String[] e = new String[19];
    private ArrayList<String> g = new ArrayList<>(4);
    private ArrayList<String> h = new ArrayList<>(4);

    /* renamed from: a  reason: collision with root package name */
    private long f5288a = 0;
    private long b = -1;
    private int c = 0;

    /* loaded from: classes3.dex */
    public interface HeaderCallback {
        void header(String str, String str2);
    }

    public void parseHeader(CharArrayBuffer charArrayBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa0146f", new Object[]{this, charArrayBuffer});
            return;
        }
        int a2 = CharArrayBuffers.a(charArrayBuffer, 58);
        if (a2 == -1) {
            return;
        }
        String substringTrimmed = charArrayBuffer.substringTrimmed(0, a2);
        if (substringTrimmed.length() == 0) {
            return;
        }
        int i = a2 + 1;
        String substringTrimmed2 = charArrayBuffer.substringTrimmed(i, charArrayBuffer.length());
        switch (substringTrimmed.hashCode()) {
            case -1345594014:
                if (!substringTrimmed.equals("x-permitted-cross-domain-policies")) {
                    return;
                }
                this.e[18] = substringTrimmed2;
                return;
            case -1309235404:
                if (!substringTrimmed.equals("expires")) {
                    return;
                }
                this.e[11] = substringTrimmed2;
                return;
            case -1267267485:
                if (!substringTrimmed.equals("content-disposition")) {
                    return;
                }
                this.e[9] = substringTrimmed2;
                return;
            case -1132779846:
                if (!substringTrimmed.equals("content-length")) {
                    return;
                }
                this.e[1] = substringTrimmed2;
                try {
                    this.b = Long.parseLong(substringTrimmed2);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case -980228804:
                if (!substringTrimmed.equals("pragma")) {
                    return;
                }
                this.e[16] = substringTrimmed2;
                return;
            case -775651618:
                if (!substringTrimmed.equals("connection")) {
                    return;
                }
                this.e[4] = substringTrimmed2;
                a(charArrayBuffer, i);
                return;
            case -301767724:
                if (!substringTrimmed.equals("proxy-authenticate")) {
                    return;
                }
                this.e[8] = substringTrimmed2;
                return;
            case -243037365:
                if (!substringTrimmed.equals("www-authenticate")) {
                    return;
                }
                this.e[7] = substringTrimmed2;
                return;
            case -208775662:
                if (!substringTrimmed.equals("cache-control")) {
                    return;
                }
                String[] strArr = this.e;
                if (strArr[12] != null && strArr[12].length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr2 = this.e;
                    sb.append(strArr2[12]);
                    sb.append(',');
                    sb.append(substringTrimmed2);
                    strArr2[12] = sb.toString();
                    return;
                }
                this.e[12] = substringTrimmed2;
                return;
            case 3123477:
                if (!substringTrimmed.equals("etag")) {
                    return;
                }
                this.e[14] = substringTrimmed2;
                return;
            case 150043680:
                if (!substringTrimmed.equals("last-modified")) {
                    return;
                }
                this.e[13] = substringTrimmed2;
                return;
            case 285929373:
                if (!substringTrimmed.equals("proxy-connection")) {
                    return;
                }
                this.e[6] = substringTrimmed2;
                a(charArrayBuffer, i);
                return;
            case 785670158:
                if (!substringTrimmed.equals("content-type")) {
                    return;
                }
                this.e[2] = substringTrimmed2;
                return;
            case 1085444827:
                if (!substringTrimmed.equals("refresh")) {
                    return;
                }
                this.e[17] = substringTrimmed2;
                return;
            case 1237214767:
                if (!substringTrimmed.equals("set-cookie")) {
                    return;
                }
                this.e[15] = substringTrimmed2;
                this.d.add(substringTrimmed2);
                return;
            case 1274458357:
                if (!substringTrimmed.equals("transfer-encoding")) {
                    return;
                }
                this.e[0] = substringTrimmed2;
                HeaderElement[] parseElements = BasicHeaderValueParser.DEFAULT.parseElements(charArrayBuffer, new ParserCursor(i, charArrayBuffer.length()));
                int length = parseElements.length;
                if ("identity".equalsIgnoreCase(substringTrimmed2)) {
                    this.f5288a = -1L;
                    return;
                } else if (length > 0 && "chunked".equalsIgnoreCase(parseElements[length - 1].getName())) {
                    this.f5288a = -2L;
                    return;
                } else {
                    this.f5288a = -1L;
                    return;
                }
            case 1397189435:
                if (!substringTrimmed.equals("accept-ranges")) {
                    return;
                }
                this.e[10] = substringTrimmed2;
                return;
            case 1901043637:
                if (!substringTrimmed.equals("location")) {
                    return;
                }
                this.e[5] = substringTrimmed2;
                return;
            case 2095084583:
                if (!substringTrimmed.equals("content-encoding")) {
                    return;
                }
                this.e[3] = substringTrimmed2;
                return;
            default:
                this.g.add(substringTrimmed);
                this.h.add(substringTrimmed2);
                return;
        }
    }

    public long getTransferEncoding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a924104f", new Object[]{this})).longValue() : this.f5288a;
    }

    public long getContentLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e384f104", new Object[]{this})).longValue() : this.b;
    }

    public int getConnectionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe936da8", new Object[]{this})).intValue() : this.c;
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this}) : this.e[2];
    }

    public String getContentEncoding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc1b8e03", new Object[]{this}) : this.e[3];
    }

    public String getLocation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d853caae", new Object[]{this}) : this.e[5];
    }

    public String getWwwAuthenticate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d7e20e3", new Object[]{this}) : this.e[7];
    }

    public String getProxyAuthenticate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29bb156c", new Object[]{this}) : this.e[8];
    }

    public String getContentDisposition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b803f005", new Object[]{this}) : this.e[9];
    }

    public String getAcceptRanges() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1390305", new Object[]{this}) : this.e[10];
    }

    public String getExpires() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6d7b6bb", new Object[]{this}) : this.e[11];
    }

    public String getCacheControl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abcfb5a8", new Object[]{this}) : this.e[12];
    }

    public String getLastModified() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42ef5424", new Object[]{this}) : this.e[13];
    }

    public String getEtag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d2d124e", new Object[]{this}) : this.e[14];
    }

    public ArrayList<String> getSetCookie() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("118a191", new Object[]{this}) : this.d;
    }

    public String getPragma() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ed49a07", new Object[]{this}) : this.e[16];
    }

    public String getRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de896974", new Object[]{this}) : this.e[17];
    }

    public String getXPermittedCrossDomainPolicies() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9918cf7b", new Object[]{this}) : this.e[18];
    }

    public void setContentLength(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244529c0", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.e[2] = str;
        }
    }

    public void setContentEncoding(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717e073b", new Object[]{this, str});
        } else {
            this.e[3] = str;
        }
    }

    public void setLocation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd02e588", new Object[]{this, str});
        } else {
            this.e[5] = str;
        }
    }

    public void setWwwAuthenticate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6dd05b", new Object[]{this, str});
        } else {
            this.e[7] = str;
        }
    }

    public void setProxyAuthenticate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b269ff2", new Object[]{this, str});
        } else {
            this.e[8] = str;
        }
    }

    public void setContentDisposition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4bcc11", new Object[]{this, str});
        } else {
            this.e[9] = str;
        }
    }

    public void setAcceptRanges(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d685d211", new Object[]{this, str});
        } else {
            this.e[10] = str;
        }
    }

    public void setExpires(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22a983", new Object[]{this, str});
        } else {
            this.e[11] = str;
        }
    }

    public void setCacheControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec573ce", new Object[]{this, str});
        } else {
            this.e[12] = str;
        }
    }

    public void setLastModified(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab99a4d2", new Object[]{this, str});
        } else {
            this.e[13] = str;
        }
    }

    public void setEtag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf477e8", new Object[]{this, str});
        } else {
            this.e[14] = str;
        }
    }

    public void setXPermittedCrossDomainPolicies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680b99c3", new Object[]{this, str});
        } else {
            this.e[18] = str;
        }
    }

    public void getHeaders(HeaderCallback headerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4cb351", new Object[]{this, headerCallback});
            return;
        }
        for (int i = 0; i < 19; i++) {
            String str = this.e[i];
            if (str != null) {
                headerCallback.header(f[i], str);
            }
        }
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            headerCallback.header(this.g.get(i2), this.h.get(i2));
        }
    }

    private void a(CharArrayBuffer charArrayBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67be493", new Object[]{this, charArrayBuffer, new Integer(i)});
        } else if (CharArrayBuffers.a(charArrayBuffer, i, "Close")) {
            this.c = 1;
        } else if (!CharArrayBuffers.a(charArrayBuffer, i, "Keep-Alive")) {
        } else {
            this.c = 2;
        }
    }
}
