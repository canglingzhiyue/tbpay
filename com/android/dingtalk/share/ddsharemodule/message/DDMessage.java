package com.android.dingtalk.share.ddsharemodule.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import com.android.dingtalk.share.ddsharemodule.plugin.SignatureCheck;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class DDMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DDMessage";

    /* loaded from: classes3.dex */
    public interface CallBack {
        void handleMessage(Intent intent);
    }

    static {
        kge.a(1212026612);
    }

    public static boolean send(Context context, String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3daf3c1", new Object[]{context, str, str2, str3, bundle})).booleanValue();
        }
        String str4 = str + ".permission.MM_MESSAGE";
        Intent intent = new Intent(str2);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String packageName = context.getPackageName();
        intent.putExtra(ShareConstant.EXTRA_MESSAGE_SDK_VERSION, 20160101);
        intent.putExtra(ShareConstant.EXTRA_MESSAGE_APP_PACKAGE_NAME, packageName);
        intent.putExtra(ShareConstant.EXTRA_MESSAGE_CONTENT, str3);
        intent.putExtra(ShareConstant.EXTRA_MESSAGE_APP_SIGNATURE, SignatureCheck.getMD5Signature(context, packageName));
        context.sendBroadcast(intent, str4);
        String str5 = "send dd message, intent=" + intent + ", perm=" + str4;
        return true;
    }

    public static void send(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c47b72d", new Object[]{context, str, str2});
        } else {
            send(context, str, ShareConstant.ACTION_MESSAGE, str2);
        }
    }

    public static void send(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e204fb7", new Object[]{context, str, str2, str3});
        } else {
            send(context, str, str2, str3, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Receiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Map<String, CallBack> mCallbacks;
        private final CallBack mCallback;

        static {
            kge.a(-1527288385);
            mCallbacks = new HashMap();
        }

        public Receiver() {
            this(null);
        }

        public Receiver(CallBack callBack) {
            this.mCallback = callBack;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String str = "receive intent=" + intent;
            CallBack callBack = this.mCallback;
            if (callBack != null) {
                callBack.handleMessage(intent);
                return;
            }
            CallBack callBack2 = mCallbacks.get(intent.getAction());
            if (callBack2 == null) {
                return;
            }
            callBack2.handleMessage(intent);
        }

        public static void registerCallBack(String str, CallBack callBack) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abfac1d3", new Object[]{str, callBack});
            } else {
                mCallbacks.put(str, callBack);
            }
        }

        public static void unregisterCallBack(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a865492", new Object[]{str});
            } else {
                mCallbacks.remove(str);
            }
        }
    }
}
