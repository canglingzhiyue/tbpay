package com.taobao.vpm.module;

import com.taobao.vpm.pixai.MapAdapter;

/* loaded from: classes9.dex */
public class RenderLogParams extends MapAdapter {
    private String cpuType;
    private int deviceLevel;
    private Long feedId;
    private String gpuType;
    private int renderResult;
    private Long renderTime;
    private int renderType;
    private String resolution;
    private String userId;

    public RenderLogParams(Long l, String str, int i, String str2, String str3, String str4, int i2, Long l2, int i3) {
        this.feedId = l;
        this.userId = str;
        this.deviceLevel = i;
        this.resolution = str2;
        this.cpuType = str3;
        this.gpuType = str4;
        this.renderType = i2;
        this.renderTime = l2;
        this.renderResult = i3;
    }
}
