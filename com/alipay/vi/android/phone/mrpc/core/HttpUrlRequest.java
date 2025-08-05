package com.alipay.vi.android.phone.mrpc.core;

import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* loaded from: classes3.dex */
public class HttpUrlRequest extends Request {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6202a;
    private byte[] b;
    private String c;
    private ArrayList<Header> d;
    private Map<String, String> e;
    private boolean f;

    public HttpUrlRequest(String str) {
        this.f6202a = str;
        this.d = new ArrayList<>();
        this.e = new HashMap();
        this.c = HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }

    public HttpUrlRequest(String str, byte[] bArr, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this.f6202a = str;
        this.b = bArr;
        this.d = arrayList;
        this.e = hashMap;
        this.c = HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.f6202a;
    }

    public String setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b4d97e2", new Object[]{this, str});
        }
        this.f6202a = str;
        return str;
    }

    public byte[] getReqData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("bfa72344", new Object[]{this}) : this.b;
    }

    public void setReqData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82a05b4", new Object[]{this, bArr});
        } else {
            this.b = bArr;
        }
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this}) : this.c;
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d221114", new Object[]{this})).booleanValue() : this.f;
    }

    public void setResetCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d02fc", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("Url : %s,HttpHeader: %s", getUrl(), getHeaders());
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Map<String, String> map = this.e;
        if (map != null && map.containsKey("id")) {
            i2 = this.e.get("id").hashCode() + 31;
        }
        int i3 = i2 * 31;
        String str = this.f6202a;
        if (str != null) {
            i = str.hashCode();
        }
        return i3 + i;
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
        } else if (!bArr.equals(httpUrlRequest.b)) {
            return false;
        }
        String str = this.f6202a;
        if (str == null) {
            if (httpUrlRequest.f6202a != null) {
                return false;
            }
        } else if (!str.equals(httpUrlRequest.f6202a)) {
            return false;
        }
        return true;
    }
}
