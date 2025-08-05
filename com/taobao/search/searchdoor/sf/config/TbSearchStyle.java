package com.taobao.search.searchdoor.sf.config;

import com.alibaba.fastjson.annotation.JSONField;
import tb.kge;

/* loaded from: classes7.dex */
public class TbSearchStyle {
    @JSONField(name = "card")
    public TbSearchStyleCard card;
    @JSONField(name = "common")
    public TbSearchStyleCommon common;
    public boolean isTb2024;

    static {
        kge.a(-1590797595);
    }
}
