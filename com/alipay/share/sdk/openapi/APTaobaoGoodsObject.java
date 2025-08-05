package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.alipay.share.sdk.openapi.ui.Ui;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class APTaobaoGoodsObject implements APMediaMessage.IMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String tag1;
    public String tag2;
    public Ui ui;
    public String webpageUrl;

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 1010;
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
        }
    }

    public APTaobaoGoodsObject() {
    }

    public APTaobaoGoodsObject(String str) {
        this.webpageUrl = str;
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
            return;
        }
        bundle.putString(Constant.EXTRA_WEB_PAGE_OBJECT_URL, this.webpageUrl);
        bundle.putString(Constant.EXTRA_TAOBAO_TAG1, this.tag1);
        bundle.putString(Constant.EXTRA_TAOBAO_TAG2, this.tag2);
        if (this.ui == null) {
            return;
        }
        JSONStringer jSONStringer = new JSONStringer();
        try {
            jSONStringer.object();
            jSONStringer.key("skin").value(this.ui.skin);
            if (this.ui.style != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("midTitleColor", this.ui.style.midTitleColor);
                jSONObject.put("mColor", this.ui.style.mColor);
                jSONObject.put("mWithoutLine", this.ui.style.mWithoutLine);
                jSONObject.put("tip1BgColor", this.ui.style.tip1BgColor);
                jSONObject.put("tip2BgColor", this.ui.style.tip2BgColor);
                jSONStringer.key("style").value(jSONObject);
            }
            jSONStringer.endObject();
            bundle.putString(Constant.EXTRA_UI, jSONStringer.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public boolean checkArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
        }
        String str = this.webpageUrl;
        if (str != null && str.length() != 0 && this.webpageUrl.length() <= 10240) {
            return true;
        }
        Log.e("APSDK.APTaobaoObject", "checkArgs fail, webpageUrl is invalid");
        return false;
    }
}
