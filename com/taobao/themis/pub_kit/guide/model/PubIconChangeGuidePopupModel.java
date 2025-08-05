package com.taobao.themis.pub_kit.guide.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR,\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\t¨\u0006*"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;", "Ljava/io/Serializable;", "()V", "bizFatigueModel", "", "", "getBizFatigueModel", "()Ljava/util/Map;", "setBizFatigueModel", "(Ljava/util/Map;)V", "guideType", "getGuideType", "()Ljava/lang/String;", "setGuideType", "(Ljava/lang/String;)V", "guideTypeStr", "getGuideTypeStr", "setGuideTypeStr", "icon", "getIcon", "setIcon", "name", "getName", "setName", "newPopupData", "Lcom/alibaba/fastjson/JSONObject;", "getNewPopupData", "()Lcom/alibaba/fastjson/JSONObject;", "setNewPopupData", "(Lcom/alibaba/fastjson/JSONObject;)V", "strongGuidePopDesc", "getStrongGuidePopDesc", "setStrongGuidePopDesc", "strongGuidePopTitle", "getStrongGuidePopTitle", "setStrongGuidePopTitle", "touchPopupUserStayTime", "getTouchPopupUserStayTime", "setTouchPopupUserStayTime", "userFatigueModel", "getUserFatigueModel", "setUserFatigueModel", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubIconChangeGuidePopupModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> bizFatigueModel;
    private String guideType;
    private String guideTypeStr;
    private String icon;
    private String name;
    private JSONObject newPopupData;
    private String strongGuidePopDesc;
    private String strongGuidePopTitle;
    private String touchPopupUserStayTime;
    private Map<String, String> userFatigueModel;

    static {
        kge.a(1049001501);
        kge.a(1028243835);
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

    public final String getGuideType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8832a159", new Object[]{this}) : this.guideType;
    }

    public final void setGuideType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f45a5", new Object[]{this, str});
        } else {
            this.guideType = str;
        }
    }

    public final String getGuideTypeStr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5789ff28", new Object[]{this}) : this.guideTypeStr;
    }

    public final void setGuideTypeStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a545a4e", new Object[]{this, str});
        } else {
            this.guideTypeStr = str;
        }
    }

    public final String getIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this}) : this.icon;
    }

    public final void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        } else {
            this.icon = str;
        }
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public final JSONObject getNewPopupData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5cd5a8d3", new Object[]{this}) : this.newPopupData;
    }

    public final void setNewPopupData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31e3011", new Object[]{this, jSONObject});
        } else {
            this.newPopupData = jSONObject;
        }
    }

    public final String getTouchPopupUserStayTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46216185", new Object[]{this}) : this.touchPopupUserStayTime;
    }

    public final void setTouchPopupUserStayTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4852491", new Object[]{this, str});
        } else {
            this.touchPopupUserStayTime = str;
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

    public final String getStrongGuidePopDesc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1e728c6", new Object[]{this}) : this.strongGuidePopDesc;
    }

    public final void setStrongGuidePopDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecfab70", new Object[]{this, str});
        } else {
            this.strongGuidePopDesc = str;
        }
    }

    public final String getStrongGuidePopTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a90767a3", new Object[]{this}) : this.strongGuidePopTitle;
    }

    public final void setStrongGuidePopTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fbb079b", new Object[]{this, str});
        } else {
            this.strongGuidePopTitle = str;
        }
    }
}
