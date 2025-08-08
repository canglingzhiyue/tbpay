package com.taobao.avplayer;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import com.ut.share.business.WWMessageType;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class af implements com.taobao.avplayer.common.ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-915242473);
        kge.a(-1285245618);
    }

    @Override // com.taobao.avplayer.common.ac
    public void a(Activity activity, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0a212c", new Object[]{this, activity, str, str2, str3, str4, str5});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWTBShareAdapter);
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = str5;
        shareContent.description = "剁手党无法抵抗的视频，你还不来看吗？";
        shareContent.imageUrl = str3;
        if (!StringUtils.isEmpty(str4)) {
            shareContent.url = str4;
        }
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDefault;
        shareContent.disableBackToClient = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ShareTargetType.Share2Copy.getValue());
        arrayList.add(ShareTargetType.Share2QRCode.getValue());
        arrayList.add(ShareTargetType.Share2ScanCode.getValue());
        arrayList.add(ShareTargetType.Share2Weixin.getValue());
        arrayList.add(ShareTargetType.Share2QQ.getValue());
        arrayList.add(ShareTargetType.Share2WeixinTimeline.getValue());
        arrayList.add(ShareTargetType.Share2Qzone.getValue());
        arrayList.add(ShareTargetType.Share2SinaWeibo.getValue());
        arrayList.add(ShareTargetType.Share2IShopping.getValue());
        arrayList.add(ShareTargetType.Share2DingTalk.getValue());
        arrayList.add(ShareTargetType.Share2Alipay.getValue());
        arrayList.add(ShareTargetType.Share2Wangxin.getValue());
        ShareBusiness.share(activity, arrayList, shareContent);
    }
}
