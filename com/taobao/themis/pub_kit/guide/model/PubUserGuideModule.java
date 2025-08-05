package com.taobao.themis.pub_kit.guide.model;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR\u001c\u0010<\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010K\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010-\"\u0004\bM\u0010/R\u001c\u0010N\u001a\u0004\u0018\u00010OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010T\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010-\"\u0004\bV\u0010/¨\u0006W"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "Ljava/io/Serializable;", "()V", "addIconTips", "Lcom/taobao/themis/pub_kit/guide/model/PubAddIconTipsModel;", "getAddIconTips", "()Lcom/taobao/themis/pub_kit/guide/model/PubAddIconTipsModel;", "setAddIconTips", "(Lcom/taobao/themis/pub_kit/guide/model/PubAddIconTipsModel;)V", "appName", "", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "authConfig", "Lcom/taobao/themis/pub_kit/guide/model/PubAuthConfigModel;", "getAuthConfig", "()Lcom/taobao/themis/pub_kit/guide/model/PubAuthConfigModel;", "setAuthConfig", "(Lcom/taobao/themis/pub_kit/guide/model/PubAuthConfigModel;)V", "closeButtonTip", "Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;", "getCloseButtonTip", "()Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;", "setCloseButtonTip", "(Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;)V", "dosaLogo", "getDosaLogo", "setDosaLogo", "dosaName", "getDosaName", "setDosaName", "enableAddToTBHome", "getEnableAddToTBHome", "setEnableAddToTBHome", "expBuckets", "", "getExpBuckets", "()Ljava/util/List;", "setExpBuckets", "(Ljava/util/List;)V", "favorSimpleGuidePopup", "Lcom/alibaba/fastjson/JSONObject;", "getFavorSimpleGuidePopup", "()Lcom/alibaba/fastjson/JSONObject;", "setFavorSimpleGuidePopup", "(Lcom/alibaba/fastjson/JSONObject;)V", "favorTips", "getFavorTips", "setFavorTips", "iconChangeGuidePopup", "Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;", "getIconChangeGuidePopup", "()Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;", "setIconChangeGuidePopup", "(Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;)V", MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, "getLogo", "setLogo", "miniappId", "getMiniappId", "setMiniappId", "navbar", "Lcom/taobao/themis/pub_kit/guide/model/PubNavBarModel;", "getNavbar", "()Lcom/taobao/themis/pub_kit/guide/model/PubNavBarModel;", "setNavbar", "(Lcom/taobao/themis/pub_kit/guide/model/PubNavBarModel;)V", "properties", "Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesModel;", "getProperties", "()Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesModel;", "setProperties", "(Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesModel;)V", "revisitPopupByAdd", "getRevisitPopupByAdd", "setRevisitPopupByAdd", "revisitPopupByReturn", "Lcom/taobao/themis/pub_kit/guide/model/PubRevisitGuideModelNew;", "getRevisitPopupByReturn", "()Lcom/taobao/themis/pub_kit/guide/model/PubRevisitGuideModelNew;", "setRevisitPopupByReturn", "(Lcom/taobao/themis/pub_kit/guide/model/PubRevisitGuideModelNew;)V", "userActiveIconChangeGuidePopup", "getUserActiveIconChangeGuidePopup", "setUserActiveIconChangeGuidePopup", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubUserGuideModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PubAddIconTipsModel addIconTips;
    private String appName;
    private PubAuthConfigModel authConfig;
    private PubCloseButtonModel closeButtonTip;
    private String dosaLogo;
    private String dosaName;
    private String enableAddToTBHome;
    private List<String> expBuckets;
    private JSONObject favorSimpleGuidePopup;
    private JSONObject favorTips;
    private PubIconChangeGuidePopupModel iconChangeGuidePopup;
    private String logo;
    private String miniappId;
    private PubNavBarModel navbar;
    private PubPropertiesModel properties;
    private JSONObject revisitPopupByAdd;
    private PubRevisitGuideModelNew revisitPopupByReturn;
    private JSONObject userActiveIconChangeGuidePopup;

    static {
        kge.a(-905991958);
        kge.a(1028243835);
    }

    public final PubNavBarModel getNavbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubNavBarModel) ipChange.ipc$dispatch("91fc8f92", new Object[]{this}) : this.navbar;
    }

    public final void setNavbar(PubNavBarModel pubNavBarModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906fa2c2", new Object[]{this, pubNavBarModel});
        } else {
            this.navbar = pubNavBarModel;
        }
    }

    public final List<String> getExpBuckets() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("40d2c0be", new Object[]{this}) : this.expBuckets;
    }

    public final void setExpBuckets(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5c3d66", new Object[]{this, list});
        } else {
            this.expBuckets = list;
        }
    }

    public final String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this}) : this.appName;
    }

    public final void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.appName = str;
        }
    }

    public final String getDosaLogo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("985bf45f", new Object[]{this}) : this.dosaLogo;
    }

    public final void setDosaLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfff1f7", new Object[]{this, str});
        } else {
            this.dosaLogo = str;
        }
    }

    public final String getDosaName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54970b7f", new Object[]{this}) : this.dosaName;
    }

    public final void setDosaName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c927bed7", new Object[]{this, str});
        } else {
            this.dosaName = str;
        }
    }

    public final String getEnableAddToTBHome() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a70e64c9", new Object[]{this}) : this.enableAddToTBHome;
    }

    public final void setEnableAddToTBHome(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383d3c35", new Object[]{this, str});
        } else {
            this.enableAddToTBHome = str;
        }
    }

    public final JSONObject getFavorSimpleGuidePopup() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1cd409b1", new Object[]{this}) : this.favorSimpleGuidePopup;
    }

    public final void setFavorSimpleGuidePopup(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a48348b", new Object[]{this, jSONObject});
        } else {
            this.favorSimpleGuidePopup = jSONObject;
        }
    }

    public final JSONObject getFavorTips() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b5950b87", new Object[]{this}) : this.favorTips;
    }

    public final void setFavorTips(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56971f75", new Object[]{this, jSONObject});
        } else {
            this.favorTips = jSONObject;
        }
    }

    public final String getLogo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfcecf78", new Object[]{this}) : this.logo;
    }

    public final void setLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a5ffe", new Object[]{this, str});
        } else {
            this.logo = str;
        }
    }

    public final String getMiniappId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ceb6fea", new Object[]{this}) : this.miniappId;
    }

    public final void setMiniappId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c04934", new Object[]{this, str});
        } else {
            this.miniappId = str;
        }
    }

    public final PubPropertiesModel getProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubPropertiesModel) ipChange.ipc$dispatch("22440f52", new Object[]{this}) : this.properties;
    }

    public final void setProperties(PubPropertiesModel pubPropertiesModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6947bc68", new Object[]{this, pubPropertiesModel});
        } else {
            this.properties = pubPropertiesModel;
        }
    }

    public final JSONObject getRevisitPopupByAdd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("610d4387", new Object[]{this}) : this.revisitPopupByAdd;
    }

    public final void setRevisitPopupByAdd(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a31b75", new Object[]{this, jSONObject});
        } else {
            this.revisitPopupByAdd = jSONObject;
        }
    }

    public final PubRevisitGuideModelNew getRevisitPopupByReturn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubRevisitGuideModelNew) ipChange.ipc$dispatch("485f5b5b", new Object[]{this}) : this.revisitPopupByReturn;
    }

    public final void setRevisitPopupByReturn(PubRevisitGuideModelNew pubRevisitGuideModelNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e2986f", new Object[]{this, pubRevisitGuideModelNew});
        } else {
            this.revisitPopupByReturn = pubRevisitGuideModelNew;
        }
    }

    public final PubIconChangeGuidePopupModel getIconChangeGuidePopup() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubIconChangeGuidePopupModel) ipChange.ipc$dispatch("980f3752", new Object[]{this}) : this.iconChangeGuidePopup;
    }

    public final void setIconChangeGuidePopup(PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc8b2f4", new Object[]{this, pubIconChangeGuidePopupModel});
        } else {
            this.iconChangeGuidePopup = pubIconChangeGuidePopupModel;
        }
    }

    public final JSONObject getUserActiveIconChangeGuidePopup() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ff815e67", new Object[]{this}) : this.userActiveIconChangeGuidePopup;
    }

    public final void setUserActiveIconChangeGuidePopup(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4677fd", new Object[]{this, jSONObject});
        } else {
            this.userActiveIconChangeGuidePopup = jSONObject;
        }
    }

    public final PubAddIconTipsModel getAddIconTips() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubAddIconTipsModel) ipChange.ipc$dispatch("981f4ea", new Object[]{this}) : this.addIconTips;
    }

    public final void setAddIconTips(PubAddIconTipsModel pubAddIconTipsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac43e60", new Object[]{this, pubAddIconTipsModel});
        } else {
            this.addIconTips = pubAddIconTipsModel;
        }
    }

    public final PubCloseButtonModel getCloseButtonTip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubCloseButtonModel) ipChange.ipc$dispatch("6c5215ed", new Object[]{this}) : this.closeButtonTip;
    }

    public final void setCloseButtonTip(PubCloseButtonModel pubCloseButtonModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3630a595", new Object[]{this, pubCloseButtonModel});
        } else {
            this.closeButtonTip = pubCloseButtonModel;
        }
    }

    public final PubAuthConfigModel getAuthConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubAuthConfigModel) ipChange.ipc$dispatch("251e7172", new Object[]{this}) : this.authConfig;
    }

    public final void setAuthConfig(PubAuthConfigModel pubAuthConfigModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd580ad6", new Object[]{this, pubAuthConfigModel});
        } else {
            this.authConfig = pubAuthConfigModel;
        }
    }
}
