package com.taobao.mytaobao.homepage.busniess.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.mxw;

/* loaded from: classes7.dex */
public class SkinData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_GLOBAL_BG_HEIGHT = "bgHeight";
    public static final String KEY_GLOBAL_HORIZONTAL_BG_HEIGHT = "horizontalBgHeight";
    public static final String VIEW_TYPE_NORMAL = "normal";
    public String actionBarBackgroundColor;
    public String actionBarBackgroundImage;
    public String actionbarTextColor;
    public String bgHeight;
    public String horizontalBgHeight;
    public String skinColor;
    public String skinPic;
    public String vipType;
    public String whiteActionBarBackgroundColor;
    public String whiteActionBarBackgroundImage;
    public String whiteNaviActionbarTextColor;
    public String whiteSkinColor;
    public String whiteSkinPic;

    static {
        kge.a(-1063728653);
        kge.a(1028243835);
    }

    public static SkinData getChangeFestivalSkinData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinData) ipChange.ipc$dispatch("a317b5ae", new Object[]{jSONObject});
        }
        if (!mxw.a()) {
            return null;
        }
        SkinData skinData = new SkinData();
        skinData.actionbarTextColor = mxw.b("actionbarTextColor");
        skinData.actionBarBackgroundColor = mxw.b("actionBarBackgroundColor");
        skinData.actionBarBackgroundImage = mxw.b("actionBarBackgroundImage");
        skinData.skinPic = mxw.a(mxw.KEY_SKIN_PIC);
        skinData.skinColor = mxw.a(mxw.KEY_SKIN_COLOR);
        if (jSONObject != null && jSONObject.containsKey(KEY_GLOBAL_BG_HEIGHT)) {
            skinData.bgHeight = jSONObject.getString(KEY_GLOBAL_BG_HEIGHT);
        }
        if (jSONObject != null && jSONObject.containsKey(KEY_GLOBAL_HORIZONTAL_BG_HEIGHT)) {
            skinData.horizontalBgHeight = jSONObject.getString(KEY_GLOBAL_HORIZONTAL_BG_HEIGHT);
        }
        return skinData;
    }
}
