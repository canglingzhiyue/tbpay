package com.taobao.tao.handler.worker;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.tao.util.AnalyticsUtil;
import com.ut.share.business.ShareTargetType;
import tb.kge;
import tb.obc;
import tb.oif;
import tb.oig;
import tb.oir;

/* loaded from: classes8.dex */
public class f extends oir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(37620902);
    }

    public f(oif oifVar) {
        super(oifVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.share.globalmodel.b bVar = this.f32104a.b.f;
        if (bVar == null) {
            return;
        }
        boolean equals = StringUtils.equals(ShareTargetType.Share2QQ.getValue(), bVar.b());
        if (StringUtils.equals(ShareTargetType.Share2Weixin.getValue(), bVar.b()) || equals) {
            String a2 = obc.a(equals ? TPTargetType.QQFRIEND : TPTargetType.WEIXIN);
            if (!StringUtils.isEmpty(a2)) {
                obc.d(this.f32104a.b.b.getContext(), a2);
            }
            AnalyticsUtil.wxAndQQOnClick(bVar);
            return;
        }
        com.taobao.share.globalmodel.e.b().j().imgPath = str;
        oig.a(bVar.b(), null);
        AnalyticsUtil.traceViewClickOthers(bVar, com.taobao.share.globalmodel.e.b().j().url);
    }
}
