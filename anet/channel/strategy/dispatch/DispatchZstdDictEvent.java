package anet.channel.strategy.dispatch;

import tb.kge;

/* loaded from: classes2.dex */
public class DispatchZstdDictEvent {
    public String LatestDictionaryStr;
    public String contentEncodeStr;
    public String urlKey;
    public String useAsDictionaryStr;

    static {
        kge.a(-1828558999);
    }

    public DispatchZstdDictEvent(boolean z, String str, String str2, String str3, String str4) {
        this.contentEncodeStr = null;
        this.useAsDictionaryStr = null;
        this.LatestDictionaryStr = null;
        this.urlKey = null;
        this.contentEncodeStr = str2;
        this.useAsDictionaryStr = str3;
        this.LatestDictionaryStr = str4;
        if (z) {
            this.urlKey = str;
        }
    }
}
