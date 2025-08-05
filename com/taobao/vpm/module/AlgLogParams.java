package com.taobao.vpm.module;

import com.taobao.vpm.pixai.MapAdapter;

/* loaded from: classes9.dex */
public class AlgLogParams extends MapAdapter {
    private String aglModelName;
    private int algoResult;
    private int algoType;
    private String cpuType;
    private String gpuType;
    private Long initAlgoCastTime;
    private Long runAlgoCastTime;

    public AlgLogParams(String str, String str2, int i, int i2, Long l, Long l2, String str3) {
        this.cpuType = str;
        this.gpuType = str2;
        this.algoType = i;
        this.algoResult = i2;
        this.initAlgoCastTime = l;
        this.runAlgoCastTime = l2;
        this.aglModelName = str3;
    }
}
