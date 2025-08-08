package com.ut.share.executor;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.FlowOutFacade;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class I18nAppExecutor implements IShareExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String APP_ID = null;
    private static final String FACEBOOK_PACKAGE = "com.facebook.katana";
    private static final String INSTAGRAM_PACKAGE = "com.instagram.android";
    private static final String LINE_PACKAGE = "jp.naver.line.android";
    private static final String MESSENGER_PACKAGE = "com.facebook.orca";
    private static final String TELEGRAM_PACKAGE = "org.telegram.messenger";
    private static final String WEBCHAT_PACKAGE = "com.tencent.mm";
    private static final String WHATSAPP_PACKAGE = "com.whatsapp";
    private static Toast sToast;

    static {
        kge.a(334986316);
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
    public boolean isAppAvailable(Context context, SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("186c2822", new Object[]{this, context, sharePlatform})).booleanValue();
        }
        return true;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a854a", new Object[]{this, context, shareData, shareListener});
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean supportImageShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e67c8f7e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void register(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24689b", new Object[]{this, map});
        } else {
            APP_ID = map.get("appId");
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, SharePlatform sharePlatform, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8b03b", new Object[]{this, context, sharePlatform, shareData, shareListener});
            return;
        }
        if (SharePlatform.Messenger.equals(sharePlatform)) {
            iSMessengerShare(context, shareData);
        } else if (SharePlatform.Telegram.equals(sharePlatform)) {
            iSTelegramShare(context, shareData);
        } else if (SharePlatform.WeChat.equals(sharePlatform)) {
            iSWeChatShare(context, shareData);
        } else if (SharePlatform.WhatsApp.equals(sharePlatform)) {
            iSWhatsAppShare(context, shareData);
        } else if (SharePlatform.Instagram.equals(sharePlatform)) {
            iSInstagramShare(context, shareData);
        } else if (SharePlatform.Facebook.equals(sharePlatform)) {
            iSFacebookShare(context, shareData);
        } else if (SharePlatform.Line.equals(sharePlatform)) {
            iSLineShare(context, shareData);
        }
        if (shareListener == null) {
            return;
        }
        ShareResponse shareResponse = new ShareResponse();
        shareResponse.platform = sharePlatform;
        shareResponse.errorCode = ShareResponse.ErrorCode.ERR_SUCCESS;
        shareResponse.data = shareData;
        shareListener.onResponse(shareResponse);
    }

    private void iSMessengerShare(Context context, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcfd8c0", new Object[]{this, context, shareData});
        } else if (isAppAvailable(context, MESSENGER_PACKAGE)) {
            startActivityByCopyLink(context, MESSENGER_PACKAGE, shareData);
        } else {
            showToast(context, "The app not installed");
        }
    }

    private void iSLineShare(Context context, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ab8b2b", new Object[]{this, context, shareData});
        } else if (isAppAvailable(context, LINE_PACKAGE)) {
            try {
                String str = "";
                if (!StringUtils.isEmpty(shareData.getText())) {
                    str = shareData.getText();
                }
                if (!StringUtils.isEmpty(shareData.getLink())) {
                    if (StringUtils.isEmpty(str)) {
                        str = shareData.getLink();
                    } else {
                        str = str.concat(" ").concat(shareData.getLink());
                    }
                }
                String encode = Uri.encode(str);
                Nav from = Nav.from(context);
                Intent intentForUri = from.intentForUri("line://msg/text/" + encode);
                intentForUri.addFlags(268435456);
                FlowOutFacade.getInstance().startActivity(context, intentForUri);
            } catch (Throwable unused) {
            }
        } else {
            showToast(context, "The app not installed");
        }
    }

    private void iSFacebookShare(Context context, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2535319", new Object[]{this, context, shareData});
        } else if (isAppAvailable(context, FACEBOOK_PACKAGE)) {
            startActivityByCopyLink(context, FACEBOOK_PACKAGE, shareData);
        } else {
            showToast(context, "The app not installed");
        }
    }

    private void iSWhatsAppShare(Context context, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71ed6ed", new Object[]{this, context, shareData});
        } else if (isAppAvailable(context, WHATSAPP_PACKAGE)) {
            startActivityByCopyLink(context, WHATSAPP_PACKAGE, shareData);
        } else {
            showToast(context, "The app not installed");
        }
    }

    private void iSWeChatShare(Context context, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20504c19", new Object[]{this, context, shareData});
        } else if (isAppAvailable(context, "com.tencent.mm")) {
            startActivityByCopyLink(context, "com.tencent.mm", shareData);
        } else {
            showToast(context, "The app not installed");
        }
    }

    private void iSInstagramShare(Context context, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a57441", new Object[]{this, context, shareData});
        } else if (isAppAvailable(context, INSTAGRAM_PACKAGE)) {
            startActivityByCopyLink(context, INSTAGRAM_PACKAGE, shareData);
        } else {
            showToast(context, "The app not installed");
        }
    }

    private void iSTelegramShare(Context context, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b6297e", new Object[]{this, context, shareData});
        } else if (isAppAvailable(context, TELEGRAM_PACKAGE)) {
            startActivityByCopyLink(context, TELEGRAM_PACKAGE, shareData);
        } else {
            showToast(context, "The app not installed");
        }
    }

    private boolean isAppAvailable(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab90e7d", new Object[]{this, context, str})).booleanValue();
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private void startActivityByCopyLink(Context context, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc56d37", new Object[]{this, context, str, shareData});
        } else if (shareData == null) {
        } else {
            try {
                String str2 = "";
                if (!StringUtils.isEmpty(shareData.getText())) {
                    str2 = shareData.getText();
                }
                if (!StringUtils.isEmpty(shareData.getLink())) {
                    if (StringUtils.isEmpty(str2)) {
                        str2 = shareData.getLink();
                    } else {
                        str2 = str2.concat(" ").concat(shareData.getLink());
                    }
                }
                if (Build.VERSION.SDK_INT >= 11) {
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("com.ut.share.copy.data", str2));
                } else {
                    ((android.text.ClipboardManager) context.getSystemService("clipboard")).setText(str2);
                }
                FlowOutFacade.getInstance().startActivity(context, context.getPackageManager().getLaunchIntentForPackage(str));
            } catch (Throwable unused) {
            }
        }
    }

    public void showToast(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{this, context, charSequence});
        } else if (StringUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = sToast;
            if (toast == null) {
                sToast = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            sToast.show();
        }
    }
}
