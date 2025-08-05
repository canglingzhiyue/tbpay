package com.taobao.mytaobao.newSettingV2.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class NewGeneralSettingDataModel implements Serializable {
    public static final String STYLE_NORMAL = "normal";
    public static final String STYLE_PICKER_SWITCH = "pickerSwitch";
    public static final String STYLE_SWITCH = "switch";
    private static final long serialVersionUID = -7910415271831831457L;
    public String defaultSwitchStat;
    public String desc;
    public JSONObject events;
    public boolean isShowDividerWithoutTitle = false;
    public String key;
    public String nativeKey;
    public String rightTip;
    public String showDividerWithTitle;
    public JSONArray showRule;
    public String style;
    public boolean switchState;
    public String title;

    static {
        kge.a(795586811);
        kge.a(1028243835);
    }
}
