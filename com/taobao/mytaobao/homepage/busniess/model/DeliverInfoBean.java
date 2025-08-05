package com.taobao.mytaobao.homepage.busniess.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class DeliverInfoBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_CODE_CONSIGN = 1;
    public static final int STATUS_CODE_DELIVERING = 3;
    public static final int STATUS_CODE_FAILED = 5;
    public static final int STATUS_CODE_SIGN = 4;
    public static final int STATUS_CODE_TRANSPORT = 2;
    public static final int STATUS_CODE_WAITTING_DELIVERY = 6;
    public JSONObject args;
    public BgLinearGradient bgLinearGradient;
    public String bounderColor;
    public String buttonText;
    public ClickParamBean clickParam;
    public String countdownTextColor;
    public String cpCode;
    public String cpName;
    public String expectArriveTime;
    public Object ext;
    public ExtraInfo extraInfo;
    public int fatigue = Integer.MAX_VALUE;
    public String futureTime;
    public String goodsName;
    public Integer goodsNum;
    public String goodsUrl;
    public String icon;
    public String id;
    public int index;
    public String isShowButton;
    public String isStressed;
    public String isWhiteBgd;
    public String jumpUrl;
    public String lastDetail;
    public String orderCode;
    public String orderId;
    public Long packageId;
    public String scm;
    public String spm;
    public String status;
    public String statusDesc;
    public String statusIcon;
    public String time;
    public String tip;
    public String tips;
    public String tips2020;
    public String title;
    public String titleColor;
    public String traceNo;
    public String tradeId;
    public int type;

    /* loaded from: classes7.dex */
    public static class BgLinearGradient implements Serializable {
        public String endColor;
        public String startColor;

        static {
            kge.a(-2024853209);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes7.dex */
    public static class ExtraInfo implements Serializable {
        public String displayName;
        public String moreUrl;

        static {
            kge.a(-1052350095);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static String f18377a;
        public static String b;
        public static String c;
        public static String d;
        public static String e;
        public static String f;
        public static String g;
        public static String h;
        public static String i;
        public static String j;
        public static String k;
        public static String l;
        public static String m;
        public static String n;

        static {
            kge.a(-141256566);
            f18377a = "CREATE";
            b = "WAREHOUSE_ACCEPT";
            c = "WAREHOUSE_PROCESS";
            d = "WAREHOUSE_CONFIRMED";
            e = "CONSIGN";
            f = "ACCEPT";
            g = "LH_HO";
            h = "CC_HO";
            i = "TRANSPORT";
            j = "DELIVERING";
            k = "FAILED";
            l = "WAITTING_DELIVERY";
            m = "AGENT_SIGN";
            n = "SIGN";
        }
    }

    static {
        kge.a(-792285929);
        kge.a(1028243835);
    }

    public int getStatusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        if (this.status == null || a.k.equals(this.status)) {
            return 5;
        }
        if (a.n.equals(this.status) || a.m.equals(this.status)) {
            return 4;
        }
        if (a.j.equals(this.status)) {
            return 3;
        }
        if (a.l.equals(this.status)) {
            return 6;
        }
        if (a.i.equals(this.status) || a.f.equals(this.status) || a.h.equals(this.status) || a.g.equals(this.status)) {
            return 2;
        }
        return (a.e.equals(this.status) || a.f18377a.equals(this.status) || a.d.equals(this.status) || a.c.equals(this.status) || a.b.equals(this.status)) ? 1 : 5;
    }
}
