package com.alipay.mobile.common.transport.http;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.HeaderGroup;
import tb.riy;

/* loaded from: classes3.dex */
public class HttpUrlHeader implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HeaderGroup headergroup = new HeaderGroup();

    public Header[] getAllHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header[]) ipChange.ipc$dispatch("6a782f8", new Object[]{this});
        }
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup == null) {
            return new Header[0];
        }
        return headerGroup.getAllHeaders();
    }

    @Deprecated
    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        Header[] allHeaders = this.headergroup.getAllHeaders();
        HeaderMap headerMap = new HeaderMap(allHeaders.length);
        for (Header header : allHeaders) {
            if (TextUtils.isEmpty((String) headerMap.get(header.getName()))) {
                headerMap.put((HeaderMap) header.getName(), header.getValue());
            }
        }
        return Collections.unmodifiableMap(headerMap);
    }

    public String getHead(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0f90319", new Object[]{this, str});
        }
        Header firstHeader = this.headergroup.getFirstHeader(str);
        return firstHeader == null ? "" : firstHeader.getValue();
    }

    public Header getLastHeader(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Header) ipChange.ipc$dispatch("9c43a59d", new Object[]{this, str}) : this.headergroup.getLastHeader(str);
    }

    public void setHead(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a1b57d", new Object[]{this, str, str2});
        } else if (str == null) {
            throw new IllegalArgumentException("Header key may not be null");
        } else {
            this.headergroup.updateHeader(new BasicHeader(str, str2));
        }
    }

    public void addHead(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee874f3c", new Object[]{this, str, str2});
        } else if (str == null) {
            throw new IllegalArgumentException("Header key may not be null");
        } else {
            this.headergroup.addHeader(new BasicHeader(str, str2));
        }
    }

    public void removeHeaders(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf9773", new Object[]{this, str});
        } else if (str == null) {
        } else {
            HeaderIterator it = this.headergroup.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(((Header) it.next()).getName())) {
                    it.remove();
                }
            }
        }
    }

    public Map<String, List<String>> toMultimap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dbcd341a", new Object[]{this});
        }
        HeaderMap headerMap = new HeaderMap();
        HeaderIterator it = this.headergroup.iterator();
        while (it.hasNext()) {
            Header nextHeader = it.nextHeader();
            String name = nextHeader.getName();
            if (TextUtils.isEmpty(name)) {
                name = "";
            }
            List list = (List) headerMap.get(name);
            if (list == null) {
                list = new ArrayList(2);
                headerMap.put((HeaderMap) name, (String) list);
            }
            list.add(nextHeader.getValue());
        }
        return Collections.unmodifiableMap(headerMap);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("HttpUrlHeader{headers=");
        HeaderIterator it = this.headergroup.iterator();
        while (it.hasNext()) {
            Header nextHeader = it.nextHeader();
            sb.append(nextHeader.getName());
            sb.append(":");
            sb.append(nextHeader.getValue());
            sb.append(",");
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }
}
