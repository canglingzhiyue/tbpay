package com.android.dingtalk.share.ddsharemodule.message;

import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import tb.kge;

/* loaded from: classes3.dex */
public class DDTextMessage extends BaseMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DDTextMessage";
    private static final int TEXT_TITLE_MAX_LENGTH = 10240;
    public String mText;

    static {
        kge.a(117597831);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public int getSupportVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6cc357f9", new Object[]{this})).intValue() : ShareConstant.DINGDING_SDK_SHARE_VERSION_V1;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
        } else if (bundle == null) {
        } else {
            bundle.putString(ShareConstant.EXTRA_TEXT_OBJECT_TEXT, this.mText);
        }
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
        } else if (bundle == null) {
        } else {
            this.mText = bundle.getString(ShareConstant.EXTRA_TEXT_OBJECT_TEXT);
        }
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public boolean checkArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
        }
        String str = this.mText;
        if (str != null && str.length() != 0 && this.mText.length() <= 10240) {
            return true;
        }
        Log.e(TAG, "checkArgs fail, text is invalid");
        return false;
    }
}
