package com.taobao.android.detail.wrapper.ext.provider.core;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.protocol.adapter.core.IShareAdapter;
import com.taobao.android.detail.datasdk.protocol.model.share.ShareModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.share.aidl.ShareCopy;
import com.taobao.tao.log.TLog;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.Map;
import tb.dya;
import tb.emu;
import tb.eqb;
import tb.kge;

/* loaded from: classes5.dex */
public class TBShareProvider implements IShareAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-237046597);
        kge.a(-172807018);
    }

    public TBShareProvider() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBShareProvider");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.IShareAdapter
    public void shareItem(Activity activity, ShareModel shareModel, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975a20aa", new Object[]{this, activity, shareModel, hashMap});
            return;
        }
        ShareContent shareContent = new ShareContent();
        if (com.alibaba.ability.localization.b.c()) {
            shareContent.businessId = "1_" + com.alibaba.ability.localization.b.d();
        } else if (!TextUtils.isEmpty(shareModel.businessId)) {
            shareContent.businessId = shareModel.businessId;
        } else {
            shareContent.businessId = "1";
        }
        if (!TextUtils.isEmpty(shareModel.isActivity)) {
            shareContent.isActivity = shareModel.isActivity;
        }
        shareContent.description = shareModel.msg;
        shareContent.snapshotImages = shareModel.picUrlList;
        shareContent.url = shareModel.link;
        shareContent.imageSoure = null;
        shareContent.shareScene = "item";
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        shareContent.templateId = "detail";
        shareContent.activityParams = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("price", shareModel.price);
        hashMap2.putAll(putParamsIntoExtendedParams(activity));
        shareContent.extendParams = hashMap2;
        if (shareModel.picUrlList != null && shareModel.picUrlList.size() > 0) {
            shareContent.imageUrl = shareModel.picUrlList.get(0);
        }
        ShareBusiness.share(activity, shareModel.title, shareContent);
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.IShareAdapter
    public void copyToClipBoard(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a90fef", new Object[]{this, context, str, str2});
        } else {
            ShareCopy.copyToClipboard(context, "1", str, str2, "item");
        }
    }

    private Map<String, String> putParamsIntoExtendedParams(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd5aa402", new Object[]{this, activity});
        }
        HashMap hashMap = new HashMap();
        if (activity != null && (activity instanceof DetailActivity)) {
            try {
                dya y = ((DetailActivity) activity).y();
                ResourceNode.i iVar = eqb.l(y.t.f10055a).share;
                if (iVar != null && iVar.c != null) {
                    hashMap.putAll(iVar.c);
                }
                hashMap.put("targetId", y.t.i());
                if (hashMap.containsKey("iconFont")) {
                    hashMap.remove("iconFont");
                }
            } catch (NullPointerException e) {
                TLog.loge("Detail", "Share error: cannot get shareExtendedParams, because something is null");
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            if (activity instanceof DetailActivity) {
                final String str = eqb.c(((DetailActivity) activity).y().t.f10055a).wxShareUrl;
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("defineToolParams", new JSONArray() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.TBShareProvider.1
                        {
                            add(new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.TBShareProvider.1.1
                                {
                                    put("type", "wxfriend");
                                    put("shareUrl", (Object) str);
                                }
                            });
                        }
                    }.toJSONString());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }
}
