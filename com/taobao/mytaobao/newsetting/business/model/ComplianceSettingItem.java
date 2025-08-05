package com.taobao.mytaobao.newsetting.business.model;

import android.graphics.Color;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class ComplianceSettingItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_TEXT_COLOR = "#597CAA";
    public static final String DEFAULT_TEXT_SIZE = "3";
    public static final String KEY_TEXT_COLOR = "textColor";
    public static final String KEY_TEXT_SIZE = "textSize";
    private static final long serialVersionUID = 2316668778968363883L;
    public String navUrl;
    public String text;
    public String textColor;
    public String textSize;
    public JSONObject userTrack;

    static {
        kge.a(853236496);
        kge.a(1028243835);
    }

    public ComplianceSettingItem() {
    }

    public ComplianceSettingItem(String str, String str2) {
        this.text = str;
        this.navUrl = str2;
    }

    public void processDefaultValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213b5cc6", new Object[]{this});
            return;
        }
        String str = this.text;
        if (str == null) {
            str = "";
        }
        this.text = str;
        String str2 = this.navUrl;
        if (str2 == null) {
            str2 = "";
        }
        this.navUrl = str2;
        String str3 = this.textColor;
        if (str3 == null) {
            str3 = DEFAULT_TEXT_COLOR;
        }
        this.textColor = str3;
        String str4 = this.textSize;
        if (str4 == null) {
            str4 = "3";
        }
        this.textSize = str4;
    }

    public int parseTextSize() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82d6a29b", new Object[]{this})).intValue();
        }
        try {
            i = Integer.parseInt(this.textSize);
        } catch (Exception unused) {
        }
        return i == 0 ? Integer.parseInt("3") : i;
    }

    public int parseTextColor() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3337f7bd", new Object[]{this})).intValue();
        }
        try {
            i = Color.parseColor(this.textColor);
        } catch (Exception unused) {
            i = -1;
        }
        return i == -1 ? Color.parseColor(DEFAULT_TEXT_COLOR) : i;
    }
}
