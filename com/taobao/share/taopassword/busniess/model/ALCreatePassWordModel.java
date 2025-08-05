package com.taobao.share.taopassword.busniess.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class ALCreatePassWordModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COPY = "copy";
    public static final String ITEM = "item";
    public static final String OTHER = "other";
    public static final String Other = "other";
    public static final String QQ = "taopassword-qq";
    public static final String SHOP = "shop";
    public static final String WeiXin = "taopassword-weixin";

    /* renamed from: a  reason: collision with root package name */
    public String f19654a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* loaded from: classes8.dex */
    public enum SourceType {
        ITEM,
        SHOP,
        Other
    }

    /* loaded from: classes8.dex */
    public enum Target {
        COPY,
        WeiXin,
        QQ,
        Other
    }

    static {
        kge.a(-893657967);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19654a;
    }
}
