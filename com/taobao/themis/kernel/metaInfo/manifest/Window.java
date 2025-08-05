package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public final class Window implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String aspectFitOrientation;
    private boolean hideHomeIndicator;
    private boolean inheritDocumentTitle;
    private String navBarBgColor;
    private boolean navBarHide;
    private boolean navBarImmersive;
    private String navBarTheme;
    private String orientation;
    private String pageBgColor;
    private boolean statusBarHide;
    private String title;
    private String titleColor;
    private String titleImage;

    static {
        kge.a(-1890569744);
        kge.a(1028243835);
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final String getTitleImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4777ac0", new Object[]{this}) : this.titleImage;
    }

    public final void setTitleImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116164b6", new Object[]{this, str});
        } else {
            this.titleImage = str;
        }
    }

    public final String getTitleColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec2889b8", new Object[]{this}) : this.titleColor;
    }

    public final void setTitleColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd234be", new Object[]{this, str});
        } else {
            this.titleColor = str;
        }
    }

    public final boolean getInheritDocumentTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcf0dc3", new Object[]{this})).booleanValue() : this.inheritDocumentTitle;
    }

    public final void setInheritDocumentTitle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dfb569", new Object[]{this, new Boolean(z)});
        } else {
            this.inheritDocumentTitle = z;
        }
    }

    public final String getNavBarBgColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8cb1dda1", new Object[]{this}) : this.navBarBgColor;
    }

    public final void setNavBarBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e29b85d", new Object[]{this, str});
        } else {
            this.navBarBgColor = str;
        }
    }

    public final boolean getNavBarImmersive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6be4a880", new Object[]{this})).booleanValue() : this.navBarImmersive;
    }

    public final void setNavBarImmersive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0448e4", new Object[]{this, new Boolean(z)});
        } else {
            this.navBarImmersive = z;
        }
    }

    public final String getNavBarTheme() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c79b5056", new Object[]{this}) : this.navBarTheme;
    }

    public final void setNavBarTheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4385e948", new Object[]{this, str});
        } else {
            this.navBarTheme = str;
        }
    }

    public final boolean getNavBarHide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7abbd5d3", new Object[]{this})).booleanValue() : this.navBarHide;
    }

    public final void setNavBarHide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13963059", new Object[]{this, new Boolean(z)});
        } else {
            this.navBarHide = z;
        }
    }

    public final boolean getStatusBarHide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("343d61f8", new Object[]{this})).booleanValue() : this.statusBarHide;
    }

    public final void setStatusBarHide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9b116c", new Object[]{this, new Boolean(z)});
        } else {
            this.statusBarHide = z;
        }
    }

    public final String getPageBgColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f1a8d40", new Object[]{this}) : this.pageBgColor;
    }

    public final void setPageBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bee499e", new Object[]{this, str});
        } else {
            this.pageBgColor = str;
        }
    }

    public final String getOrientation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8711b69f", new Object[]{this}) : this.orientation;
    }

    public final void setOrientation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72dc4c1f", new Object[]{this, str});
        } else {
            this.orientation = str;
        }
    }

    public final boolean getHideHomeIndicator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84821a3", new Object[]{this})).booleanValue() : this.hideHomeIndicator;
    }

    public final void setHideHomeIndicator(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33006121", new Object[]{this, new Boolean(z)});
        } else {
            this.hideHomeIndicator = z;
        }
    }

    public final String getAspectFitOrientation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e719a52c", new Object[]{this}) : this.aspectFitOrientation;
    }

    public final void setAspectFitOrientation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e064a8ca", new Object[]{this, str});
        } else {
            this.aspectFitOrientation = str;
        }
    }
}
