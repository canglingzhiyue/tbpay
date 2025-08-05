package com.taobao.login4android.ab;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class AbtestExpDo implements Serializable {
    public static final String MURMUR32 = "Murmur32";
    public static final String NUM_100_PUB = "num100Pub";
    public static final String NUM_100_W_PUB = "num100WPub";
    public String algorithm;
    public List<AbtestBucket> buckets;
    public AbtestBucket emptyBucket;
    public boolean needRandomFactor = true;
    public String testKey = "";

    static {
        kge.a(1652377861);
        kge.a(1028243835);
    }
}
