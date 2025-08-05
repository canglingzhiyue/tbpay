package com.ut.mini.behavior.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.loc.at;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.io.Serializable;
import java.util.List;
import tb.fne;
import tb.kge;

/* loaded from: classes9.dex */
public class Data implements Serializable {
    @JSONField(name = Repeat.D)
    public List<Data> dataList;
    @JSONField(name = at.k)
    public String key;
    @JSONField(name = fne.KEY_OP)
    public String operator;
    @JSONField(name = "v")
    public Object value;

    static {
        kge.a(1180182056);
        kge.a(1028243835);
    }
}
