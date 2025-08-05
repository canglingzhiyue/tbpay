package com.android.dingtalk.share.ddsharemodule.message;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import com.android.dingtalk.share.ddsharemodule.plugin.SignatureCheck;
import tb.kge;

/* loaded from: classes3.dex */
public class DDMessageAct {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DDMessageAct";

    static {
        kge.a(-305193730);
    }

    public static boolean sendDDFriend(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("504b5393", new Object[]{context, str, bundle})).booleanValue();
        }
        if (context != null) {
            return send(context, str, bundle, initSendFriendIntent());
        }
        Log.e(TAG, "send fail, invalid arguments");
        return false;
    }

    public static boolean sendDing(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe94173", new Object[]{context, str, bundle})).booleanValue();
        }
        if (context != null) {
            return send(context, str, bundle, initSendDingIntent());
        }
        Log.e(TAG, "send fail, invalid arguments");
        return false;
    }

    private static boolean send(Context context, String str, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6643e892", new Object[]{context, str, bundle, intent})).booleanValue();
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String packageName = context.getPackageName();
        String mD5Signature = SignatureCheck.getMD5Signature(context, packageName);
        intent.putExtra(ShareConstant.EXTRA_MESSAGE_SDK_VERSION, 20160101);
        intent.putExtra(ShareConstant.EXTRA_MESSAGE_APP_PACKAGE_NAME, packageName);
        intent.putExtra(ShareConstant.EXTRA_ACTION_TYPE, ShareConstant.OUT_SHARE_ACTION_TYPE);
        intent.putExtra(ShareConstant.EXTRA_MESSAGE_APP_SIGNATURE, mD5Signature);
        intent.putExtra(ShareConstant.EXTRA_MESSAGE_APP_ID, str);
        try {
            context.startActivity(intent);
            String str2 = "send dd message, intent=" + intent;
            return true;
        } catch (ActivityNotFoundException unused) {
            Log.e(TAG, "send v2 fail, target ActivityNotFound");
            return false;
        } catch (Exception e) {
            Log.e(TAG, "send v2 fail " + e.getMessage());
            return false;
        }
    }

    private static Intent initSendFriendIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("60fbf1ba", new Object[0]) : initIntent(ShareConstant.DD_ENTER_ACTIVITY_SCHEME);
    }

    private static Intent initSendByAuthIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("758865d9", new Object[0]) : initIntent(ShareConstant.DD_SEND_AUTH_ACTIVITY_SCHEME);
    }

    private static Intent initSendDingIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("5a7ca55a", new Object[0]) : initIntent(ShareConstant.DD_DING_ACTIVITY_SCHEME);
    }

    private static Intent initIntent(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("21e76f16", new Object[]{str}) : new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static boolean sendDDAuth(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee97a61d", new Object[]{context, str, bundle})).booleanValue();
        }
        if (context != null) {
            return send(context, str, bundle, initSendByAuthIntent());
        }
        Log.e(TAG, "send fail, invalid arguments");
        return false;
    }
}
