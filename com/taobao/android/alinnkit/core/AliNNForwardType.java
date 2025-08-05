package com.taobao.android.alinnkit.core;

/* loaded from: classes4.dex */
public enum AliNNForwardType {
    FORWARD_CPU(0),
    FORWARD_OPENCL(3),
    FORWARD_AUTO(4),
    FORWARD_OPENGL(6),
    FORWARD_VULKAN(7),
    FORWARD_NPU(8);
    
    public int type;

    AliNNForwardType(int i) {
        this.type = i;
    }
}
