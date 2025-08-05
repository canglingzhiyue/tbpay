package com.alipay.share.sdk.openapi.ui;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class Ui implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 2077101865739221146L;
    public String skin;
    public Style style;

    public String getSkin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7af826e6", new Object[]{this}) : this.skin;
    }

    public void setSkin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788bf650", new Object[]{this, str});
        } else {
            this.skin = str;
        }
    }

    public Style getStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Style) ipChange.ipc$dispatch("4c84ae22", new Object[]{this}) : this.style;
    }

    public void setStyle(Style style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653741fa", new Object[]{this, style});
        } else {
            this.style = style;
        }
    }
}
