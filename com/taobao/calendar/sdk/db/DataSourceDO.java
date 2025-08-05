package com.taobao.calendar.sdk.db;

import android.graphics.Color;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class DataSourceDO {
    public String background;
    public int backgroundColor;
    public String description;
    public int id;
    public String lastdate;
    public String logo;
    public String name;
    public boolean subscribe;
    public Theme theme;
    public int themeId;
    public int totalUsers;

    /* loaded from: classes6.dex */
    public static class Theme {
        public String author;
        public String authorId;
        public int bgColor;
        public String bgImage;
        public int controllerBgColor;
        public int controllerFontColor;
        public int eventBgColor;
        public int eventFontColor;
        public int eventTouchBgColor;
        public int eventTouchFontColor;
        public long id;
        public int labelColor;
        public String labelType;
        public String logo;
        public int monthBgColor;
        public int monthFontColor;
        public String name;
        public int normalBgColor;
        public int normalFontColor;
        public int selectBgColor;
        public int selectFontColor;
        public int todayBgColor;
        public int todayFontColor;
        public int topBarBgColor;
        public int topBarFontColor;
        public int weekBgColor;
        public int weekFontColor;
        public int weekendBgColor;
        public int weekendDayBgColor;
        public int weekendDayFontColor;
        public int weekendFontColor;

        static {
            kge.a(1071761107);
        }
    }

    static {
        kge.a(1997438286);
    }

    public int parseColor(String str) {
        if (str == null || str == "") {
            return 0;
        }
        String[] split = str.split(",");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split[2]);
        int i = 255;
        if (split.length == 4) {
            i = (int) (255 * Double.valueOf(Double.parseDouble(split[3])).doubleValue());
        }
        return Color.argb(i, parseInt, parseInt2, parseInt3);
    }

    public void parseTheme(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            parseTheme(jSONObject);
        }
    }

    public void parseTheme(JSONObject jSONObject) {
        this.theme = new Theme();
        this.theme.id = jSONObject.optLong("id");
        this.theme.name = jSONObject.optString("name");
        this.theme.logo = jSONObject.optString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        this.theme.bgImage = jSONObject.optString("bg_image");
        this.theme.bgColor = parseColor(jSONObject.optString("bg_color"));
        this.theme.monthBgColor = parseColor(jSONObject.optString("month_bg_color"));
        this.theme.monthFontColor = parseColor(jSONObject.optString("month_font_color"));
        this.theme.weekBgColor = parseColor(jSONObject.optString("week_bg_color"));
        this.theme.weekFontColor = parseColor(jSONObject.optString("week_font_color"));
        this.theme.weekendBgColor = parseColor(jSONObject.optString("weekend_bg_color"));
        this.theme.weekendFontColor = parseColor(jSONObject.optString("weekend_font_color"));
        this.theme.todayBgColor = parseColor(jSONObject.optString("today_bg_color"));
        this.theme.todayFontColor = parseColor(jSONObject.optString("today_font_color"));
        this.theme.selectBgColor = parseColor(jSONObject.optString("select_bg_color"));
        this.theme.selectFontColor = parseColor(jSONObject.optString("select_font_color"));
        this.theme.eventBgColor = parseColor(jSONObject.optString("event_bg_color"));
        this.theme.eventFontColor = parseColor(jSONObject.optString("event_font_color"));
        this.theme.normalBgColor = parseColor(jSONObject.optString("normal_bg_color"));
        this.theme.normalFontColor = parseColor(jSONObject.optString("normal_font_color"));
        this.theme.topBarBgColor = parseColor(jSONObject.optString("topbar_bg_color"));
        this.theme.topBarFontColor = parseColor(jSONObject.optString("topbar_font_color"));
        this.theme.eventTouchBgColor = parseColor(jSONObject.optString("event_touch_bg_color"));
        this.theme.eventTouchFontColor = parseColor(jSONObject.optString("event_touch_font_color"));
        this.theme.controllerBgColor = parseColor(jSONObject.optString("controller_bg_color"));
        this.theme.controllerFontColor = parseColor(jSONObject.optString("controller_font_color"));
        this.theme.weekendDayBgColor = parseColor(jSONObject.optString("weekend_day_bg_color"));
        this.theme.weekendDayFontColor = parseColor(jSONObject.optString("weekend_day_font_color"));
        this.theme.labelColor = parseColor(jSONObject.optString("label_color"));
        this.theme.labelType = jSONObject.optString("label_type");
    }
}
