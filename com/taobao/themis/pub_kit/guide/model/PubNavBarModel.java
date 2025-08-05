package com.taobao.themis.pub_kit.guide.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubNavBarModel;", "Ljava/io/Serializable;", "()V", "closeButtonEvent", "", "getCloseButtonEvent", "()Ljava/lang/String;", "setCloseButtonEvent", "(Ljava/lang/String;)V", "enableAddIconButton", "", "getEnableAddIconButton", "()Z", "setEnableAddIconButton", "(Z)V", "enableFavorButton", "getEnableFavorButton", "setEnableFavorButton", "enableNewNavbar", "getEnableNewNavbar", "setEnableNewNavbar", "toString", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubNavBarModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String closeButtonEvent;
    private boolean enableAddIconButton;
    private boolean enableFavorButton;
    private boolean enableNewNavbar;

    static {
        kge.a(676005062);
        kge.a(1028243835);
    }

    public final boolean getEnableNewNavbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("37cc4a62", new Object[]{this})).booleanValue() : this.enableNewNavbar;
    }

    public final void setEnableNewNavbar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c10e342", new Object[]{this, new Boolean(z)});
        } else {
            this.enableNewNavbar = z;
        }
    }

    public final boolean getEnableAddIconButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d986479e", new Object[]{this})).booleanValue() : this.enableAddIconButton;
    }

    public final void setEnableAddIconButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7102786", new Object[]{this, new Boolean(z)});
        } else {
            this.enableAddIconButton = z;
        }
    }

    public final boolean getEnableFavorButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("696f5e2", new Object[]{this})).booleanValue() : this.enableFavorButton;
    }

    public final void setEnableFavorButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8c14c2", new Object[]{this, new Boolean(z)});
        } else {
            this.enableFavorButton = z;
        }
    }

    public final String getCloseButtonEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7b3689d3", new Object[]{this}) : this.closeButtonEvent;
    }

    public final void setCloseButtonEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27dd3f03", new Object[]{this, str});
        } else {
            this.closeButtonEvent = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PubNavBarModel(enableNewNavbar=" + this.enableNewNavbar + ", enableAddIconButton=" + this.enableAddIconButton + ", enableFavorButton=" + this.enableFavorButton + ", closeButtonEvent=" + this.closeButtonEvent + ')';
    }
}
