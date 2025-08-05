package anetwork.network.cache;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class CacheBlockConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -2567271693706129850L;
    public String blockName;
    public long blockSize;
    public boolean isCompress;
    public boolean isEncrypt;
    public boolean isRemovable;

    static {
        kge.a(-1610285827);
        kge.a(1028243835);
    }

    public CacheBlockConfig(String str, long j, boolean z, boolean z2, boolean z3) {
        this.blockName = str;
        this.blockSize = j;
        this.isCompress = z;
        this.isEncrypt = z2;
        this.isRemovable = z3;
    }

    public CacheBlockConfig() {
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("CacheBlockConfig [blockName=");
        sb.append(this.blockName);
        sb.append(", blockSize=");
        sb.append(this.blockSize);
        sb.append(", isCompress=");
        sb.append(this.isCompress);
        sb.append(", isEncrypt=");
        sb.append(this.isEncrypt);
        sb.append(", isRemovable=");
        sb.append(this.isRemovable);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
