package com.taobao.mytaobao.pop.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.mxq;

/* loaded from: classes7.dex */
public class MTBIconPixelInfoBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -1456862388402117781L;
    private float centerX;
    public float centerX2rpx;
    private float centerY;
    public float centerY2rpx;
    public boolean findIcon;
    private float iconHeight;
    private float iconHeight2rpx;
    private float iconWidth;
    private float iconWidth2rpx;
    private boolean isFindIcon;
    private boolean isIconShow;
    private float x;
    private float x2rpx;
    private float y;
    private float y2rpx;

    static {
        kge.a(-1625360081);
        kge.a(1028243835);
    }

    public void setFindIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f91359", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isFindIcon = z;
        this.findIcon = z;
    }

    public void setIconShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7893895", new Object[]{this, new Boolean(z)});
        } else {
            this.isIconShow = z;
        }
    }

    public void setX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ad55a3", new Object[]{this, new Float(f)});
            return;
        }
        this.x = f;
        this.x2rpx = mxq.a(f);
    }

    public void setY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29622e42", new Object[]{this, new Float(f)});
            return;
        }
        this.y = f;
        this.y2rpx = mxq.a(f);
    }

    public void setCenterX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98dcf0d8", new Object[]{this, new Float(f)});
            return;
        }
        this.centerX = f;
        this.centerX2rpx = mxq.a(f);
    }

    public void setCenterY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a91c977", new Object[]{this, new Float(f)});
            return;
        }
        this.centerY = f;
        this.centerY2rpx = mxq.a(f);
    }

    public void setIconWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdfbc6e", new Object[]{this, new Float(f)});
            return;
        }
        this.iconWidth = f;
        this.iconWidth2rpx = mxq.a(f);
    }

    public void setIconHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2d0457", new Object[]{this, new Float(f)});
            return;
        }
        this.iconHeight = f;
        this.iconHeight2rpx = mxq.a(f);
    }

    public boolean isFindIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af4a5fa7", new Object[]{this})).booleanValue() : this.isFindIcon;
    }

    public boolean isIconShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1fc2a2eb", new Object[]{this})).booleanValue() : this.isIconShow;
    }

    public float getX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue() : this.x;
    }

    public float getY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue() : this.y;
    }

    public float getX2rpx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1dd1eec1", new Object[]{this})).floatValue() : this.x2rpx;
    }

    public float getY2rpx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2165dc2", new Object[]{this})).floatValue() : this.y2rpx;
    }

    public float getCenterX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3cfc8064", new Object[]{this})).floatValue() : this.centerX;
    }

    public float getCenterY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d0a97e5", new Object[]{this})).floatValue() : this.centerY;
    }

    public float getCenterX2rpx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d64db26c", new Object[]{this})).floatValue() : this.centerX2rpx;
    }

    public float getCenterY2rpx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a92216d", new Object[]{this})).floatValue() : this.centerY2rpx;
    }

    public float getIconWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("85d5f70e", new Object[]{this})).floatValue() : this.iconWidth;
    }

    public float getIconWidth2rpx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("92d7c416", new Object[]{this})).floatValue() : this.iconWidth2rpx;
    }

    public float getIconHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ef1b8c6d", new Object[]{this})).floatValue() : this.iconHeight;
    }

    public float getIconHeight2rpx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8591f5", new Object[]{this})).floatValue() : this.iconHeight2rpx;
    }
}
