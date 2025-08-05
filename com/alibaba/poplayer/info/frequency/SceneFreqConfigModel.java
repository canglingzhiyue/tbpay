package com.alibaba.poplayer.info.frequency;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class SceneFreqConfigModel implements Serializable {
    public String filter;
    public List<FreqConfig> freq;
    public List<String> uris;

    /* loaded from: classes3.dex */
    public static class FreqConfig implements Serializable {
        public Integer interval;
        public Long lastRecordTime;
        public String layer;

        static {
            kge.a(2043600661);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1175928727);
        kge.a(1028243835);
    }
}
