package com.taobao.search.searchdoor.activate.guess;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class GuessDiscoveryVO {
    @JSONField(name = "changeOnReturn")
    public boolean changeOnReturn;
    @JSONField(name = "discover_rownum")
    public int discoverRowNum;
    @JSONField(name = "isChangeButton")
    public boolean isChangeButton;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "result")
    public a result;
    @JSONField(name = "sfStratage")
    public String sfStratage;
    @JSONField(name = "simplyStyle")
    public boolean simplyStyle;

    /* loaded from: classes7.dex */
    public static class a {
        @JSONField(name = "text")

        /* renamed from: a  reason: collision with root package name */
        public List<ActivateGuessBean> f19341a;

        static {
            kge.a(411713407);
        }
    }

    static {
        kge.a(2029306945);
    }
}
