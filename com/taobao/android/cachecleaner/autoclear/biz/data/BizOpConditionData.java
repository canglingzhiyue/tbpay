package com.taobao.android.cachecleaner.autoclear.biz.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.realidentity.o;
import com.alipay.mobile.common.logging.api.LogContext;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class BizOpConditionData {
    public static final String LOGIC_AND = "&&";
    public static final String LOGIC_OR = "||";
    public static final String STATISTIC_EQUAL = "==";
    public static final String STATISTIC_GREATER = ">";
    public static final String STATISTIC_GREATER_OR_EQUAL = ">=";
    public static final String STATISTIC_LESS = "<";
    public static final String STATISTIC_LESS_OR_EQUAL = "<=";
    public static final String STATISTIC_NO_EQUAL = "!=";
    @JSONField(name = "lc")
    public BizOpConditionData leftCondition;
    @JSONField(name = "l")
    public List<String> leftValue;
    @JSONField(name = o.b)
    public String operation;
    @JSONField(name = LogContext.RELEASETYPE_RC)
    public BizOpConditionData rightCondition;
    @JSONField(name = "r")
    public List<String> rightValue;

    static {
        kge.a(1492984769);
    }
}
