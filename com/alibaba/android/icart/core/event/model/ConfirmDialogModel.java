package com.alibaba.android.icart.core.event.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class ConfirmDialogModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String cancelBtn;
    private String confirmBtn;
    private String message;
    private String title;

    static {
        kge.a(-1487888315);
        kge.a(1028243835);
    }

    public String getConfirmBtn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24634ac7", new Object[]{this}) : this.confirmBtn;
    }

    public void setConfirmBtn(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deef958f", new Object[]{this, str});
        } else {
            this.confirmBtn = str;
        }
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.message;
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.message = str;
        }
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public String getCancelBtn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e9b1a7ad", new Object[]{this}) : this.cancelBtn;
    }

    public void setCancelBtn(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec109d1", new Object[]{this, str});
        } else {
            this.cancelBtn = str;
        }
    }
}
