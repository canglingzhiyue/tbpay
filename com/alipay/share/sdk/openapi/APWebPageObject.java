package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class APWebPageObject implements APMediaMessage.IMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6183a = "APSDK.ZFBWebPageObject";
    public String webpageUrl;

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 1001;
    }

    public APWebPageObject() {
    }

    public APWebPageObject(String str) {
        this.webpageUrl = str;
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
        } else {
            bundle.putString(Constant.EXTRA_WEB_PAGE_OBJECT_URL, this.webpageUrl);
        }
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
        } else {
            this.webpageUrl = bundle.getString(Constant.EXTRA_WEB_PAGE_OBJECT_URL);
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
        Log.e(this.f6183a, "checkArgs fail, webpageUrl is invalid");
        return false;
    }
}
