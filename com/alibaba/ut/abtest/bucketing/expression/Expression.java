package com.alibaba.ut.abtest.bucketing.expression;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class Expression {
    @JSONField(name = "criterions")
    public List<ExpressionCriterion> criterions;
    @JSONField(name = "type")
    public String operator;

    static {
        kge.a(-12183285);
    }
}
