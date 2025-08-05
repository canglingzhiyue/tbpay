package com.ut.share.executor;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class CopyExecutor implements IShareExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(766901234);
        kge.a(-933332493);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a500273", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void register(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24689b", new Object[]{this, map});
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean supportImageShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e67c8f7e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context, SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("186c2822", new Object[]{this, context, sharePlatform})).booleanValue() : isAppAvailable(context);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a854a", new Object[]{this, context, shareData, shareListener});
        } else if (shareData == null || (TextUtils.isEmpty(shareData.getText()) && TextUtils.isEmpty(shareData.getLink()))) {
            if (shareListener == null) {
                return;
            }
            ShareResponse shareResponse = new ShareResponse();
            shareResponse.platform = SharePlatform.Copy;
            shareResponse.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
            shareListener.onResponse(shareResponse);
        } else {
            String text = !TextUtils.isEmpty(shareData.getText()) ? shareData.getText() : "";
            if (!TextUtils.isEmpty(shareData.getLink())) {
                if (TextUtils.isEmpty(text)) {
                    text = shareData.getLink();
                } else {
                    text = text.concat(" ").concat(shareData.getLink());
                }
            }
            shareData.setText(text);
            if (shareListener != null) {
                ShareResponse shareResponse2 = new ShareResponse();
                shareResponse2.platform = SharePlatform.Copy;
                shareResponse2.errorCode = ShareResponse.ErrorCode.ERR_START;
                shareResponse2.data = shareData;
                shareListener.onResponse(shareResponse2);
            }
            if (Build.VERSION.SDK_INT >= 11) {
                try {
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("com.ut.share.copy.data", shareData.getText()));
                } catch (Exception e) {
                    e.printStackTrace();
                    ShareResponse shareResponse3 = new ShareResponse();
                    shareResponse3.platform = SharePlatform.Copy;
                    shareResponse3.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
                    shareResponse3.data = shareData;
                    shareListener.onResponse(shareResponse3);
                }
            } else {
                ((android.text.ClipboardManager) context.getSystemService("clipboard")).setText(shareData.getText());
            }
            if (shareListener == null) {
                return;
            }
            ShareResponse shareResponse4 = new ShareResponse();
            shareResponse4.platform = SharePlatform.Copy;
            shareResponse4.errorCode = ShareResponse.ErrorCode.ERR_SUCCESS;
            shareResponse4.data = shareData;
            shareListener.onResponse(shareResponse4);
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, SharePlatform sharePlatform, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8b03b", new Object[]{this, context, sharePlatform, shareData, shareListener});
        } else {
            share(context, shareData, shareListener);
        }
    }
}
