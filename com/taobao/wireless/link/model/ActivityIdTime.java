package com.taobao.wireless.link.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class ActivityIdTime implements Serializable {
    @JSONField(name = "activities")
    public List<ActivityOutTime> activities;

    static {
        kge.a(-1338291340);
        kge.a(1028243835);
    }
}
