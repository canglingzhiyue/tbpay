package com.taobao.message.sp.chat.transformer;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.message.image.Image;
import com.taobao.message.chat.message.image.ImageConvertHelper;
import com.taobao.message.datasdk.facade.message.newmsgbody.NewImageExMsgBody;
import com.taobao.message.datasdk.facade.message.newmsgbody.NewImageMsgBody;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.kit.util.ImageUrlUtil;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.ItemState;
import com.taobao.message.lab.comfrm.inner2.IteratorTransformer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.sp.framework.model.SimpleMessage;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kin;

/* loaded from: classes7.dex */
public class SimpleImageMessageVOTransform implements IteratorTransformer<ResultData<SimpleMessage>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageConvertHelper mHelper = new ImageConvertHelper();

    static {
        kge.a(-1891574913);
        kge.a(1186226634);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.IteratorTransformer
    public ItemState transform(Action action, SharedState sharedState, ResultData<SimpleMessage> resultData, ItemState itemState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemState) ipChange.ipc$dispatch("e7333691", new Object[]{this, action, sharedState, resultData, itemState});
        }
        Map map = (Map) itemState.getData("messageViewData", Map.class, new HashMap());
        int msgType = resultData.getMainData().getMsgType();
        if (msgType == 102) {
            NewImageMsgBody newImageMsgBody = new NewImageMsgBody(resultData.getMainData().getOriginalData(), resultData.getMainData().getLocalExt());
            Image image = new Image(ImageUrlUtil.getThumbnailPath(newImageMsgBody.getUrl()), newImageMsgBody.getUrl(), newImageMsgBody.getUrl(), newImageMsgBody.getWidth(), newImageMsgBody.getHeight());
            map.put("imageUrl", newImageMsgBody.getUrl());
            if (!TextUtils.isEmpty(image.previewUrl)) {
                map.put("previewUrl", image.previewUrl);
            } else {
                map.put("previewUrl", newImageMsgBody.getLocalThumbnailPath());
            }
            image.type = newImageMsgBody.getSuffix();
            if (TextUtils.equals(kin.GIF_MODE, image.type) && TextUtils.isEmpty(newImageMsgBody.getUrl())) {
                map.put("imageUrl", newImageMsgBody.getLocalUrl());
            }
            if (newImageMsgBody.isHideMessageBubble() || TextUtils.equals(kin.GIF_MODE, image.type)) {
                map.put("showRadius", false);
                this.mHelper.adjustImageSize(image);
            } else {
                map.put("showRadius", true);
            }
            map.put("hasGoods", Boolean.valueOf(newImageMsgBody.getGoodsInfo() != null && newImageMsgBody.getGoodsInfo().size() > 0));
            map.put("mimeType", image.type);
            map.put("width", Integer.valueOf(image.width));
            map.put("height", Integer.valueOf(image.height));
            Map map2 = (Map) sharedState.getRuntimeData("sendProgressMap", Map.class, null);
            String clientId = resultData.getMainData().getCode().getClientId();
            if (map2 != null && map2.containsKey(clientId)) {
                map.put("uploadProgress", map2.get(clientId));
            }
        } else if (msgType == 103) {
            NewImageExMsgBody newImageExMsgBody = new NewImageExMsgBody(resultData.getMainData().getOriginalData(), resultData.getMainData().getLocalExt());
            String gifUrl = newImageExMsgBody.getGifUrl();
            Image image2 = new Image(gifUrl, gifUrl, gifUrl, newImageExMsgBody.getWidth(), newImageExMsgBody.getHeight());
            image2.type = newImageExMsgBody.getMimeType();
            this.mHelper.adjustImageSize(image2);
            map.put("showRadius", false);
            map.put("mimeType", newImageExMsgBody.getMimeType());
            map.put("width", Integer.valueOf(image2.width));
            map.put("height", Integer.valueOf(image2.height));
            map.put("imageUrl", gifUrl);
            map.put("previewUrl", gifUrl);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("messageViewData", map);
        return itemState.updateData(hashMap);
    }
}
