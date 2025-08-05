package com.taobao.android;

/* loaded from: classes4.dex */
public interface AliImageStrategyConfigBuilderInterface {

    /* loaded from: classes4.dex */
    public enum AliSizeLimitType {
        WIDTH_LIMIT,
        HEIGHT_LIMIT,
        ALL_LIMIT
    }

    AliImageStrategyConfigBuilderInterface a(AliSizeLimitType aliSizeLimitType);

    Object a();
}
