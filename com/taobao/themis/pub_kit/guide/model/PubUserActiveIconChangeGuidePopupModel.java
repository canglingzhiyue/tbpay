package com.taobao.themis.pub_kit.guide.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubUserActiveIconChangeGuidePopupModel;", "Ljava/io/Serializable;", "()V", "guidePopDesc", "", "getGuidePopDesc", "()Ljava/lang/String;", "setGuidePopDesc", "(Ljava/lang/String;)V", "guidePopTitle", "getGuidePopTitle", "setGuidePopTitle", "successFloatWindowImage", "getSuccessFloatWindowImage", "setSuccessFloatWindowImage", "successFloatWindowSubTitle", "getSuccessFloatWindowSubTitle", "setSuccessFloatWindowSubTitle", "successFloatWindowTitle", "getSuccessFloatWindowTitle", "setSuccessFloatWindowTitle", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubUserActiveIconChangeGuidePopupModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String guidePopDesc;
    private String guidePopTitle;
    private String successFloatWindowImage;
    private String successFloatWindowSubTitle;
    private String successFloatWindowTitle;

    static {
        kge.a(1541406764);
        kge.a(1028243835);
    }

    public final String getGuidePopTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3cdab2c", new Object[]{this}) : this.guidePopTitle;
    }

    public final void setGuidePopTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a879c32", new Object[]{this, str});
        } else {
            this.guidePopTitle = str;
        }
    }

    public final String getGuidePopDesc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d8f5d01d", new Object[]{this}) : this.guidePopDesc;
    }

    public final void setGuidePopDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d662a7f9", new Object[]{this, str});
        } else {
            this.guidePopDesc = str;
        }
    }

    public final String getSuccessFloatWindowTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfe0f660", new Object[]{this}) : this.successFloatWindowTitle;
    }

    public final void setSuccessFloatWindowTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967df67e", new Object[]{this, str});
        } else {
            this.successFloatWindowTitle = str;
        }
    }

    public final String getSuccessFloatWindowSubTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("52c98ee2", new Object[]{this}) : this.successFloatWindowSubTitle;
    }

    public final void setSuccessFloatWindowSubTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ae3cd4", new Object[]{this, str});
        } else {
            this.successFloatWindowSubTitle = str;
        }
    }

    public final String getSuccessFloatWindowImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9535ff3d", new Object[]{this}) : this.successFloatWindowImage;
    }

    public final void setSuccessFloatWindowImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bca0941", new Object[]{this, str});
        } else {
            this.successFloatWindowImage = str;
        }
    }
}
