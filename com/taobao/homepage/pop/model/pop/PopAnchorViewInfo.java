package com.taobao.homepage.pop.model.pop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;

/* loaded from: classes7.dex */
public class PopAnchorViewInfo implements IPopAnchorViewInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int height;
    private final int offsetX;
    private final int offsetY;
    private final int screenX;
    private final int screenY;
    private final int width;

    public PopAnchorViewInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.screenX = i;
        this.screenY = i2;
        this.width = i3;
        this.height = i4;
        this.offsetX = i5;
        this.offsetY = i6;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo
    public int getScreenX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6c182b0", new Object[]{this})).intValue() : this.screenX;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo
    public int getScreenY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6cf9a31", new Object[]{this})).intValue() : this.screenY;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo
    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.width;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo
    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.height;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo
    public int getOffsetX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25635ee9", new Object[]{this})).intValue() : this.offsetX;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo
    public int getOffsetY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2571766a", new Object[]{this})).intValue() : this.offsetY;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PopAnchorViewInfo{screenX=" + this.screenX + ", screenY=" + this.screenY + ", width=" + this.width + ", height=" + this.height + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + '}';
    }
}
