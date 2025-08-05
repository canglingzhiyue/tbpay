package org.android.agoo.mezu;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* loaded from: classes.dex */
public class MeizuPushReceiver extends MzPushMessageReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MeizuPushReceiver";
    private static final String TOKEN = "MZ_TOKEN";
    private AgooFactory agooFactory;

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onSubAliasStatus(Context context, SubAliasStatus subAliasStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ea8a95", new Object[]{this, context, subAliasStatus});
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onSubTagsStatus(Context context, SubTagsStatus subTagsStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa182a3", new Object[]{this, context, subTagsStatus});
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onRegister(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcaadec9", new Object[]{this, context, str});
        } else {
            ALog.i(TAG, "onRegister", PushConstants.KEY_PUSH_ID, str);
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onUnRegister(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e27502e", new Object[]{this, context, new Boolean(z)});
        } else {
            ALog.i(TAG, "onUnRegister", "result", Boolean.valueOf(z));
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onPushStatus(Context context, PushSwitchStatus pushSwitchStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76e1ac1", new Object[]{this, context, pushSwitchStatus});
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "status";
        objArr[1] = pushSwitchStatus == null ? "" : pushSwitchStatus.toString();
        ALog.i(TAG, "onPushStatus", objArr);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onRegisterStatus(Context context, RegisterStatus registerStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d71175", new Object[]{this, context, registerStatus});
        } else if (registerStatus == null || TextUtils.isEmpty(registerStatus.getPushId())) {
            Object[] objArr = new Object[2];
            objArr[0] = "status";
            objArr[1] = registerStatus == null ? "" : registerStatus.toString();
            ALog.e(TAG, "onRegisterStatus", objArr);
        } else {
            ALog.i(TAG, "onRegister", "status", registerStatus.toString());
            reportToken(context, registerStatus.getPushId());
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onUnRegisterStatus(Context context, UnRegisterStatus unRegisterStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b92395", new Object[]{this, context, unRegisterStatus});
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "status";
        objArr[1] = unRegisterStatus == null ? "" : unRegisterStatus.toString();
        ALog.i(TAG, "onUnRegisterStatus", objArr);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onMessage(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0fb98d", new Object[]{this, context, str, str2});
            return;
        }
        ALog.i(TAG, b.c.EVENT_ON_MESSAGE, "msg", str, "platformExtra", str2);
        try {
            ALog.i(TAG, "onPushMsg", "content", str);
            this.agooFactory = new AgooFactory();
            this.agooFactory.init(context, null, null);
            this.agooFactory.msgRecevie(str.getBytes(), "meizu", null);
        } catch (Throwable th) {
            ALog.e(TAG, "onPushMsg", th, new Object[0]);
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onMessage(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853839b6", new Object[]{this, context, intent});
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = CommonCode.Resolution.HAS_RESOLUTION_FROM_APK;
        objArr[1] = intent == null ? "" : intent.toString();
        ALog.i(TAG, b.c.EVENT_ON_MESSAGE, objArr);
        if (intent == null) {
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("content");
            ALog.i(TAG, "onPushMsg", "flyme3.0 content", stringExtra);
            this.agooFactory = new AgooFactory();
            this.agooFactory.init(context, null, null);
            this.agooFactory.msgRecevie(stringExtra.getBytes(), "meizu", null);
        } catch (Throwable th) {
            ALog.e(TAG, "onPushMsg", th, new Object[0]);
        }
    }

    private static void reportToken(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbf10e6", new Object[]{context, str});
        } else if (TextUtils.isEmpty(str) || context == null) {
        } else {
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, TOKEN);
        }
    }
}
