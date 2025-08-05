package com.alipay.mobile.intelligentdecision.db.model;

import com.alibaba.fastjson.JSONArray;

/* loaded from: classes3.dex */
public class FeatureModel {
    public static final String TYPE_API = "api";
    public static final String TYPE_DERIVE = "derived";
    public static final String TYPE_MODEL = "model";
    public static final String TYPE_SQL_COMMON = "sql_biz_common";
    public boolean cache;
    public String content;
    public String id;
    public boolean isCommon;
    public String name;
    public JSONArray relay;
    public String rule_id;
    public String type;
}
