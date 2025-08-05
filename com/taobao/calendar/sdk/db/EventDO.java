package com.taobao.calendar.sdk.db;

import com.alibaba.evo.internal.database.ExperimentDO;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class EventDO extends BaseEventDO {
    public Message message;

    /* loaded from: classes6.dex */
    public static class Message {
        public String description;
        public int endTime;
        public String location;
        public String members;
        public String name;
        public int startTime;

        static {
            kge.a(30196874);
        }
    }

    static {
        kge.a(710415431);
    }

    public void parseMessage(String str) {
        parseMessage(parseJSONObjectFromString(str));
    }

    public void parseMessage(JSONObject jSONObject) {
        this.message = new Message();
        this.message.name = jSONObject.optString("name");
        this.message.startTime = jSONObject.optInt("start_time");
        this.message.endTime = jSONObject.optInt(ExperimentDO.COLUMN_END_TIME);
        this.message.description = jSONObject.optString("description");
        this.message.location = jSONObject.optString("location");
        this.message.members = jSONObject.optString("members");
    }
}
