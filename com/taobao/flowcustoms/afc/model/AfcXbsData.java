package com.taobao.flowcustoms.afc.model;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class AfcXbsData implements Serializable {
    public static int STRATEGY_0;
    public static int STRATEGY_1;
    public static int STRATEGY_2;
    public static int STRATEGY_3;
    public static int STRATEGY_4;
    public String appKey;
    public String appName;
    public String backUrl;
    public long expireTime;
    public String tipsIcon;
    public int tipsStrategy = STRATEGY_4;
    public String type;

    static {
        kge.a(486870618);
        kge.a(1028243835);
        STRATEGY_0 = 0;
        STRATEGY_1 = 1;
        STRATEGY_2 = 2;
        STRATEGY_3 = 3;
        STRATEGY_4 = 4;
    }
}
