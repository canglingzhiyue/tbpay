package android.taobao.windvane.extra.uc.prefetch;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class ResourceRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, String> extProperties;
    public final Map<String, String> headers;
    public boolean isSsrPreRender;
    public final String method;
    public String seqNo;
    public final int timeout;
    public final String url;
    public Comparator<String> urlComparator;

    static {
        kge.a(-402232825);
    }

    private ResourceRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.extProperties = builder.extProperties;
        this.timeout = builder.timeout;
        this.urlComparator = builder.urlComparator;
        this.isSsrPreRender = builder.isSsrPreRender;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SsrRequest{url='" + this.url + "', method='" + this.method + "', headers=" + this.headers + ", extProperties=" + this.extProperties + ", timeoutMills=" + this.timeout + ", seqNo='" + this.seqNo + "'}";
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean isSsrPreRender;
        public String url;
        public Comparator<String> urlComparator;
        public String method = "GET";
        public Map<String, String> headers = new HashMap();
        public int timeout = 60000;
        public Map<String, String> extProperties = new HashMap();

        static {
            kge.a(-226342434);
        }

        public Builder setUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("dd07ad91", new Object[]{this, str});
            }
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.url = str;
            return this;
        }

        public Builder setHeader(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a5e7cabd", new Object[]{this, str, str2});
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.headers.put(str, str2);
            }
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3ffa7eed", new Object[]{this, map});
            }
            this.headers.clear();
            if (map != null) {
                this.headers.putAll(map);
            }
            return this;
        }

        public Builder setTimeout(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5e0c1570", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.timeout = i;
            }
            return this;
        }

        public Builder setMethod(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("decc5c7", new Object[]{this, str});
            }
            this.method = str;
            return this;
        }

        public Builder setExtProperty(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2aae3842", new Object[]{this, str, str2});
            }
            if (!TextUtils.isEmpty(str)) {
                this.extProperties.put(str, str2);
            }
            return this;
        }

        public Builder setUrlComparator(Comparator<String> comparator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8c98fe36", new Object[]{this, comparator});
            }
            this.urlComparator = comparator;
            return this;
        }

        public ResourceRequest build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourceRequest) ipChange.ipc$dispatch("cb446f3f", new Object[]{this});
            }
            if (this.url == null) {
                throw new IllegalStateException("url == null");
            }
            return new ResourceRequest(this);
        }

        public Builder setSsrPreRender(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("bdbde6b7", new Object[]{this, new Boolean(z)});
            }
            this.isSsrPreRender = z;
            return this;
        }
    }
}
