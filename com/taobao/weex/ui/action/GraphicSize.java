package com.taobao.weex.ui.action;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class GraphicSize {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mHeight;
    private float mWidth;

    static {
        kge.a(2086694096);
    }

    public GraphicSize(float f, float f2) {
        this.mWidth = f;
        this.mHeight = f2;
    }

    public float getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue() : this.mWidth;
    }

    public void setWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5f815", new Object[]{this, new Float(f)});
        } else {
            this.mWidth = f;
        }
    }

    public float getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue() : this.mHeight;
    }

    public void setHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde3d90", new Object[]{this, new Float(f)});
        } else {
            this.mHeight = f;
        }
    }

    public void update(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848e34d0", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mWidth = f;
        this.mHeight = f2;
    }
}
