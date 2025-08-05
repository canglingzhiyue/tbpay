package com.taobao.calendar.sdk.db.schedule;

import com.taobao.calendar.sdk.db.Simple;
import com.taobao.weex.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.nog;

/* loaded from: classes6.dex */
public class Repeat extends Simple {
    public static final String D = "d";
    public static final String M = "m";
    public static final String N = "n";
    public static final String W = "w";
    public static final String Y = "y";
    public int interval;
    public String unit;

    static {
        kge.a(898694645);
    }

    public Repeat() {
        this.interval = 1;
        this.unit = "n";
    }

    public Repeat(int i, String str) {
        this.interval = 1;
        this.unit = "n";
        this.interval = i;
        this.unit = str;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Repeat)) {
            Repeat repeat = (Repeat) obj;
            if (repeat.unit.equals(this.unit) && repeat.interval == this.interval) {
                return true;
            }
        }
        return false;
    }

    public int getCalendarFlag() {
        if (this.unit.equals(D)) {
            return 5;
        }
        if (this.unit.equals("w")) {
            return 3;
        }
        return this.unit.equals("y") ? 1 : 0;
    }

    public boolean isRepeat() {
        return !this.unit.equals("n");
    }

    @Override // com.taobao.calendar.sdk.db.Simple
    public void parse(String str) {
        if (str == null || str.equals("")) {
            return;
        }
        JSONObject jSONObjectfromString = getJSONObjectfromString(str);
        this.interval = jSONObjectfromString.optInt(Constants.Name.INTERVAL);
        this.unit = jSONObjectfromString.optString(nog.PRICE_UNIT);
    }

    public String parseJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.Name.INTERVAL, this.interval);
            jSONObject.put(nog.PRICE_UNIT, this.unit);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
