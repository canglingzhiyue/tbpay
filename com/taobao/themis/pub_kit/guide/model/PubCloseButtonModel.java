package com.taobao.themis.pub_kit.guide.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR,\u0010\u0015\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;", "Ljava/io/Serializable;", "()V", "bizFatigueModel", "", "", "getBizFatigueModel", "()Ljava/util/Map;", "setBizFatigueModel", "(Ljava/util/Map;)V", "disappearTime", "getDisappearTime", "()Ljava/lang/String;", "setDisappearTime", "(Ljava/lang/String;)V", "stayTime", "getStayTime", "setStayTime", "title", "getTitle", "setTitle", "userFatigueModel", "getUserFatigueModel", "setUserFatigueModel", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubCloseButtonModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> bizFatigueModel;
    private String disappearTime;
    private String stayTime;
    private String title;
    private Map<String, String> userFatigueModel;

    static {
        kge.a(-190542222);
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

    public final String getStayTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9235763d", new Object[]{this}) : this.stayTime;
    }

    public final void setStayTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f56abd9", new Object[]{this, str});
        } else {
            this.stayTime = str;
        }
    }

    public final String getDisappearTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c9941df", new Object[]{this}) : this.disappearTime;
    }

    public final void setDisappearTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2edbdf", new Object[]{this, str});
        } else {
            this.disappearTime = str;
        }
    }

    public final Map<String, String> getUserFatigueModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b4523f3f", new Object[]{this}) : this.userFatigueModel;
    }

    public final void setUserFatigueModel(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d96a72f", new Object[]{this, map});
        } else {
            this.userFatigueModel = map;
        }
    }

    public final Map<String, String> getBizFatigueModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c62c5fdb", new Object[]{this}) : this.bizFatigueModel;
    }

    public final void setBizFatigueModel(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ff2cab", new Object[]{this, map});
        } else {
            this.bizFatigueModel = map;
        }
    }
}
