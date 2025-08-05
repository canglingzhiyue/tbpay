package com.alipay.android.msp.network.pb.v2;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class MspResV2 extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CLIENT_KEY = "";
    public static final String DEFAULT_CODE = "";
    public static final String DEFAULT_DATA = "";
    public static final String DEFAULT_END_CODE = "";
    public static final String DEFAULT_ERR_MSG = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_MEMO = "";
    public static final String DEFAULT_ONLOAD = "";
    public static final String DEFAULT_PAGE = "";
    public static final String DEFAULT_PKEY = "";
    public static final String DEFAULT_RESULT = "";
    public static final String DEFAULT_SESSION = "";
    public static final String DEFAULT_SYNCH = "";
    public static final String DEFAULT_TID = "";
    public static final String DEFAULT_TPL = "";
    public static final String DEFAULT_TPLID = "";
    public static final String DEFAULT_TRADE_NO = "";
    public static final String DEFAULT_UNAME = "";
    public static final String DEFAULT_USER_ID = "";
    public static final String DEFAULT_UURL = "";
    public static final String DEFAULT_WND = "";
    public static final int TAG_AJAX = 23;
    public static final int TAG_CLIENT_KEY = 22;
    public static final int TAG_CODE = 1;
    public static final int TAG_DATA = 14;
    public static final int TAG_DG = 17;
    public static final int TAG_END_CODE = 5;
    public static final int TAG_ERR_MSG = 2;
    public static final int TAG_EXTINFO = 28;
    public static final int TAG_IAJAX = 24;
    public static final int TAG_MEMO = 3;
    public static final int TAG_NOBACK = 9;
    public static final int TAG_ONLOAD = 25;
    public static final int TAG_PAGE = 19;
    public static final int TAG_PKEY = 27;
    public static final int TAG_RESULT = 4;
    public static final int TAG_SESSION = 20;
    public static final int TAG_SYNCH = 6;
    public static final int TAG_TID = 21;
    public static final int TAG_TIME = 15;
    public static final int TAG_TPL = 13;
    public static final int TAG_TPLID = 12;
    public static final int TAG_TRADE_NO = 7;
    public static final int TAG_UAC = 16;
    public static final int TAG_UNAME = 10;
    public static final int TAG_USER_ID = 26;
    public static final int TAG_UURL = 11;
    public static final int TAG_WND = 18;
    public static final int TAG_WPAGE = 8;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public Integer ajax;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public String client_key;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String code;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public String data;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public Integer dg;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String end_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String err_msg;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public Integer iajax;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String memo;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public Integer noBack;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public String onload;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public String page;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public String pkey;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String result;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public String session;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String synch;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public String tid;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public Integer time;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public String tpl;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public String tplid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String trade_no;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public Integer uac;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String uname;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public String user_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public String uurl;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public String wnd;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public Integer wpage;
    public static final Integer DEFAULT_WPAGE = 0;
    public static final Integer DEFAULT_NOBACK = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_UAC = 0;
    public static final Integer DEFAULT_DG = 0;
    public static final Integer DEFAULT_AJAX = 0;
    public static final Integer DEFAULT_IAJAX = 0;

    public MspResV2(MspResV2 mspResV2) {
        super(mspResV2);
        if (mspResV2 == null) {
            return;
        }
        this.code = mspResV2.code;
        this.err_msg = mspResV2.err_msg;
        this.memo = mspResV2.memo;
        this.result = mspResV2.result;
        this.end_code = mspResV2.end_code;
        this.synch = mspResV2.synch;
        this.trade_no = mspResV2.trade_no;
        this.wpage = mspResV2.wpage;
        this.noBack = mspResV2.noBack;
        this.uname = mspResV2.uname;
        this.uurl = mspResV2.uurl;
        this.tplid = mspResV2.tplid;
        this.tpl = mspResV2.tpl;
        this.data = mspResV2.data;
        this.time = mspResV2.time;
        this.uac = mspResV2.uac;
        this.dg = mspResV2.dg;
        this.wnd = mspResV2.wnd;
        this.page = mspResV2.page;
        this.session = mspResV2.session;
        this.tid = mspResV2.tid;
        this.client_key = mspResV2.client_key;
        this.ajax = mspResV2.ajax;
        this.iajax = mspResV2.iajax;
        this.onload = mspResV2.onload;
        this.user_id = mspResV2.user_id;
        this.pkey = mspResV2.pkey;
        this.extinfo = mspResV2.extinfo;
    }

    public MspResV2() {
    }

    public final MspResV2 fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResV2) ipChange.ipc$dispatch("8f37c40a", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.code = (String) obj;
                break;
            case 2:
                this.err_msg = (String) obj;
                break;
            case 3:
                this.memo = (String) obj;
                break;
            case 4:
                this.result = (String) obj;
                break;
            case 5:
                this.end_code = (String) obj;
                break;
            case 6:
                this.synch = (String) obj;
                break;
            case 7:
                this.trade_no = (String) obj;
                break;
            case 8:
                this.wpage = (Integer) obj;
                break;
            case 9:
                this.noBack = (Integer) obj;
                break;
            case 10:
                this.uname = (String) obj;
                break;
            case 11:
                this.uurl = (String) obj;
                break;
            case 12:
                this.tplid = (String) obj;
                break;
            case 13:
                this.tpl = (String) obj;
                break;
            case 14:
                this.data = (String) obj;
                break;
            case 15:
                this.time = (Integer) obj;
                break;
            case 16:
                this.uac = (Integer) obj;
                break;
            case 17:
                this.dg = (Integer) obj;
                break;
            case 18:
                this.wnd = (String) obj;
                break;
            case 19:
                this.page = (String) obj;
                break;
            case 20:
                this.session = (String) obj;
                break;
            case 21:
                this.tid = (String) obj;
                break;
            case 22:
                this.client_key = (String) obj;
                break;
            case 23:
                this.ajax = (Integer) obj;
                break;
            case 24:
                this.iajax = (Integer) obj;
                break;
            case 25:
                this.onload = (String) obj;
                break;
            case 26:
                this.user_id = (String) obj;
                break;
            case 27:
                this.pkey = (String) obj;
                break;
            case 28:
                this.extinfo = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspResV2)) {
            return false;
        }
        MspResV2 mspResV2 = (MspResV2) obj;
        return a(this.code, mspResV2.code) && a(this.err_msg, mspResV2.err_msg) && a(this.memo, mspResV2.memo) && a(this.result, mspResV2.result) && a(this.end_code, mspResV2.end_code) && a(this.synch, mspResV2.synch) && a(this.trade_no, mspResV2.trade_no) && a(this.wpage, mspResV2.wpage) && a(this.noBack, mspResV2.noBack) && a(this.uname, mspResV2.uname) && a(this.uurl, mspResV2.uurl) && a(this.tplid, mspResV2.tplid) && a(this.tpl, mspResV2.tpl) && a(this.data, mspResV2.data) && a(this.time, mspResV2.time) && a(this.uac, mspResV2.uac) && a(this.dg, mspResV2.dg) && a(this.wnd, mspResV2.wnd) && a(this.page, mspResV2.page) && a(this.session, mspResV2.session) && a(this.tid, mspResV2.tid) && a(this.client_key, mspResV2.client_key) && a(this.ajax, mspResV2.ajax) && a(this.iajax, mspResV2.iajax) && a(this.onload, mspResV2.onload) && a(this.user_id, mspResV2.user_id) && a(this.pkey, mspResV2.pkey) && a(this.extinfo, mspResV2.extinfo);
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.b;
        if (i2 != 0) {
            return i2;
        }
        String str = this.code;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.err_msg;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.memo;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.result;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.end_code;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.synch;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.trade_no;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Integer num = this.wpage;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.noBack;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str8 = this.uname;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.uurl;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.tplid;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.tpl;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.data;
        int hashCode14 = (hashCode13 + (str12 != null ? str12.hashCode() : 0)) * 37;
        Integer num3 = this.time;
        int hashCode15 = (hashCode14 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.uac;
        int hashCode16 = (hashCode15 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.dg;
        int hashCode17 = (hashCode16 + (num5 != null ? num5.hashCode() : 0)) * 37;
        String str13 = this.wnd;
        int hashCode18 = (hashCode17 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.page;
        int hashCode19 = (hashCode18 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.session;
        int hashCode20 = (hashCode19 + (str15 != null ? str15.hashCode() : 0)) * 37;
        String str16 = this.tid;
        int hashCode21 = (hashCode20 + (str16 != null ? str16.hashCode() : 0)) * 37;
        String str17 = this.client_key;
        int hashCode22 = (hashCode21 + (str17 != null ? str17.hashCode() : 0)) * 37;
        Integer num6 = this.ajax;
        int hashCode23 = (hashCode22 + (num6 != null ? num6.hashCode() : 0)) * 37;
        Integer num7 = this.iajax;
        int hashCode24 = (hashCode23 + (num7 != null ? num7.hashCode() : 0)) * 37;
        String str18 = this.onload;
        int hashCode25 = (hashCode24 + (str18 != null ? str18.hashCode() : 0)) * 37;
        String str19 = this.user_id;
        int hashCode26 = (hashCode25 + (str19 != null ? str19.hashCode() : 0)) * 37;
        String str20 = this.pkey;
        int hashCode27 = (hashCode26 + (str20 != null ? str20.hashCode() : 0)) * 37;
        String str21 = this.extinfo;
        if (str21 != null) {
            i = str21.hashCode();
        }
        int i3 = hashCode27 + i;
        this.b = i3;
        return i3;
    }
}
