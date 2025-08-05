package com.taobao.themis.pub_kit.guide.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR,\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubRevisitGuideModelNew;", "Ljava/io/Serializable;", "()V", "actionText", "", "getActionText", "()Ljava/lang/String;", "setActionText", "(Ljava/lang/String;)V", "actionURL", "getActionURL", "setActionURL", "bizFatigueModel", "", "getBizFatigueModel", "()Ljava/util/Map;", "setBizFatigueModel", "(Ljava/util/Map;)V", "dailyMaxShowTime", "getDailyMaxShowTime", "setDailyMaxShowTime", "guideImg", "getGuideImg", "setGuideImg", "mainText", "getMainText", "setMainText", "platformType", "getPlatformType", "setPlatformType", "subText", "getSubText", "setSubText", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubRevisitGuideModelNew implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String actionText;
    private String actionURL;
    private Map<String, String> bizFatigueModel;
    private String dailyMaxShowTime;
    private String guideImg;
    private String mainText;
    private String platformType;
    private String subText;

    static {
        kge.a(-1684298834);
        kge.a(1028243835);
    }

    public final String getActionText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e8b50020", new Object[]{this}) : this.actionText;
    }

    public final void setActionText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d48b56", new Object[]{this, str});
        } else {
            this.actionText = str;
        }
    }

    public final String getActionURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e66fa36", new Object[]{this}) : this.actionURL;
    }

    public final void setActionURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60868", new Object[]{this, str});
        } else {
            this.actionURL = str;
        }
    }

    public final String getDailyMaxShowTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6cf8ab4e", new Object[]{this}) : this.dailyMaxShowTime;
    }

    public final void setDailyMaxShowTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5f4ce8", new Object[]{this, str});
        } else {
            this.dailyMaxShowTime = str;
        }
    }

    public final String getGuideImg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b0b327c", new Object[]{this}) : this.guideImg;
    }

    public final void setGuideImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6138777a", new Object[]{this, str});
        } else {
            this.guideImg = str;
        }
    }

    public final String getMainText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92f5cc7d", new Object[]{this}) : this.mainText;
    }

    public final void setMainText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a11d99", new Object[]{this, str});
        } else {
            this.mainText = str;
        }
    }

    public final String getPlatformType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9ff4a16", new Object[]{this}) : this.platformType;
    }

    public final void setPlatformType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6886d20", new Object[]{this, str});
        } else {
            this.platformType = str;
        }
    }

    public final String getSubText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a099e802", new Object[]{this}) : this.subText;
    }

    public final void setSubText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a6a11c", new Object[]{this, str});
        } else {
            this.subText = str;
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
