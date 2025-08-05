package com.taobao.tao.friends.model;

import com.taobao.contacts.data.member.RecentMember;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f20558a;
    public String b;
    public ContactType c;
    public String d;
    public int e;

    static {
        kge.a(-1186170413);
    }

    public b(String str, String str2, int i, String str3) {
        this(str, str2, i);
        this.d = str3;
    }

    public b(String str, String str2, int i) {
        this.c = ContactType.CONTINGENT;
        this.f20558a = str;
        this.b = str2;
        if (RecentMember.ShareChannelType.WEIXIN.getValue() == i) {
            this.e = R.drawable.tb_tag_wechat;
        } else if (RecentMember.ShareChannelType.QQ.getValue() == i) {
            this.e = R.drawable.tb_tag_qq;
        } else if (RecentMember.ShareChannelType.ALIPAY.getValue() == i) {
            this.e = R.drawable.tb_tag_alipay;
        } else if (RecentMember.ShareChannelType.DINGTALK.getValue() == i) {
            this.e = R.drawable.tb_tag_dingding;
        } else {
            this.e = 0;
        }
    }

    public b() {
        this.c = ContactType.CONTINGENT;
    }
}
