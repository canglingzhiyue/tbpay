package com.alibaba.android.ultron.ext.event;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class h extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_IMAGES = "images";
    public static final String FIELD_KEY_BUSSINESS_ID = "businessId";
    public static final String FIELD_KEY_DESCRIPTION = "description";
    public static final String FIELD_KEY_PRICE = "price";
    public static final String FIELD_KEY_TEMPLATE_ID = "templateId";
    public static final String FIELD_KEY_TITLE = "title";
    public static final String FIELD_KEY_URL = "url";
    public static final String NEXT_TAG_ON_SHARE = "onShare";
    public static final String NEXT_TAG_SHARE_FINISH = "onFinish";

    static {
        kge.a(-1393784794);
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
            return;
        }
        JSONObject d = d(eVar);
        if (d == null) {
            com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "获取fields失败");
            return;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = "1";
        if (d.containsKey("businessId")) {
            shareContent.businessId = d.getString("businessId");
        }
        shareContent.templateId = "detail";
        if (d.containsKey("templateId")) {
            shareContent.templateId = d.getString("templateId");
        }
        shareContent.description = d.getString("description");
        List parseArray = JSONObject.parseArray(d.getJSONArray("images").toJSONString(), String.class);
        HashMap hashMap = new HashMap();
        String[] strArr = (String[]) parseArray.toArray(new String[parseArray.size()]);
        if (strArr != null && strArr.length > 0) {
            hashMap.put("images", strArr);
            shareContent.imageUrl = strArr[0];
        }
        hashMap.put("price", d.getString("price"));
        hashMap.put("title", d.getString("title"));
        shareContent.templateParams = hashMap;
        shareContent.url = d.getString("url");
        shareContent.title = d.getString("title");
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        ShareBusiness.getInstance();
        ShareBusiness.share((Activity) eVar.a(), shareContent, new ShareBusinessListener() { // from class: com.alibaba.android.ultron.ext.event.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.share.business.ShareBusinessListener
            public void onShare(ShareContent shareContent2, ShareTargetType shareTargetType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8a481375", new Object[]{this, shareContent2, shareTargetType});
                } else {
                    h.this.a(eVar, h.NEXT_TAG_ON_SHARE);
                }
            }

            @Override // com.ut.share.business.ShareBusinessListener
            public void onFinished(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff43b50d", new Object[]{this, map});
                } else {
                    h.this.a(eVar, "onFinish");
                }
            }
        });
    }
}
