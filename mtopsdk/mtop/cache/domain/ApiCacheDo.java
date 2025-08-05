package mtopsdk.mtop.cache.domain;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Objects;
import mtopsdk.common.util.StringUtils;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class ApiCacheDo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -6169477447314447135L;
    public String api;
    public String blockName;
    public String cacheControlHeader;
    public List<String> cacheKeyItems;
    public String v;
    public boolean privateScope = true;
    public boolean offline = false;
    public String cacheKeyType = "ALL";

    /* loaded from: classes9.dex */
    public interface CacheKeyType {
        public static final String ALL = "ALL";
        public static final String EXC = "EXC";
        public static final String INC = "INC";
        public static final String NONE = "NONE";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    static {
        kge.a(-933572249);
        kge.a(1028243835);
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : StringUtils.concatStr2LowerCase(this.api, this.v);
    }

    public ApiCacheDo(String str, String str2, String str3) {
        this.api = str;
        this.v = str2;
        this.blockName = str3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("ApiCacheDo [ api=");
        sb.append(this.api);
        sb.append(", v=");
        sb.append(this.v);
        sb.append(", blockName=");
        sb.append(this.blockName);
        sb.append(", cacheControlHeader=");
        sb.append(this.cacheControlHeader);
        sb.append(", privateScope=");
        sb.append(this.privateScope);
        sb.append(", offline=");
        sb.append(this.offline);
        sb.append(", cacheKeyType=");
        sb.append(this.cacheKeyType);
        sb.append(", cacheKeyItems=");
        sb.append(this.cacheKeyItems);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiCacheDo)) {
            return false;
        }
        ApiCacheDo apiCacheDo = (ApiCacheDo) obj;
        return this.privateScope == apiCacheDo.privateScope && this.offline == apiCacheDo.offline && Objects.equals(this.api, apiCacheDo.api) && Objects.equals(this.v, apiCacheDo.v) && Objects.equals(this.blockName, apiCacheDo.blockName) && Objects.equals(this.cacheControlHeader, apiCacheDo.cacheControlHeader) && Objects.equals(this.cacheKeyType, apiCacheDo.cacheKeyType) && Objects.equals(this.cacheKeyItems, apiCacheDo.cacheKeyItems);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.api, this.v, this.blockName, this.cacheControlHeader, Boolean.valueOf(this.privateScope), Boolean.valueOf(this.offline), this.cacheKeyType, this.cacheKeyItems);
    }
}
