package com.taobao.android.detail.provider;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.core.IShareAdapter;
import com.taobao.android.detail.protocol.model.share.ShareModel;
import com.taobao.share.aidl.ShareCopy;
import com.taobao.tao.detail.activity.DetailActivity;
import com.taobao.tao.log.TLog;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class TBShareProvider implements IShareAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1606817329);
        kge.a(-887280683);
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IShareAdapter
    public void shareItem(Activity activity, ShareModel shareModel, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfea029", new Object[]{this, activity, shareModel, hashMap});
            return;
        }
        ShareContent shareContent = new ShareContent();
        if (!TextUtils.isEmpty(shareModel.businessId)) {
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
        shareContent.templateId = "detail";
        HashMap hashMap2 = new HashMap();
        hashMap2.put("price", shareModel.price);
        hashMap2.putAll(putParamsIntoExtendedParams(activity));
        shareContent.extendParams = hashMap2;
        if (shareModel.picUrlList != null && shareModel.picUrlList.size() > 0) {
            shareContent.imageUrl = shareModel.picUrlList.get(0);
        }
        ShareBusiness.share(activity, shareModel.title, shareContent);
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IShareAdapter
    public void shareItem(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84d8ed3", new Object[]{this, activity, str, str2, str3, str4});
            return;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = "1";
        shareContent.description = str2;
        shareContent.imageUrl = str3;
        shareContent.imageSoure = null;
        shareContent.shareScene = "item";
        shareContent.url = str4;
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        shareContent.extendParams = putParamsIntoExtendedParams(activity);
        ShareBusiness.share(activity, str, shareContent);
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IShareAdapter
    public void shareItem(Activity activity, String str, String str2, String str3, String str4, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec07f400", new Object[]{this, activity, str, str2, str3, str4, hashMap});
            return;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = "1";
        shareContent.description = str2;
        shareContent.imageUrl = str3;
        shareContent.imageSoure = null;
        shareContent.shareScene = "item";
        shareContent.url = str4;
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        shareContent.activityParams = hashMap;
        shareContent.extendParams = putParamsIntoExtendedParams(activity);
        ShareBusiness.share(activity, str, shareContent);
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IShareAdapter
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
        return hashMap;
    }
}
