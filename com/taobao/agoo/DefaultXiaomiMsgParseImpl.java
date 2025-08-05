package com.taobao.agoo;

import android.content.Intent;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import tb.kge;

/* loaded from: classes4.dex */
public class DefaultXiaomiMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-170398728);
        kge.a(765654921);
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fdc22e73", new Object[]{this}) : "xiaomi";
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        try {
            String str = (String) Class.forName("com.xiaomi.mipush.sdk.PushMessageHelper").getField(AuthenticatorMessage.KEY_MESSAGE).get(null);
            if (intent.getSerializableExtra(str) == null) {
                return null;
            }
            Class<?> cls = Class.forName("com.xiaomi.mipush.sdk.MiPushMessage");
            return (String) cls.getMethod("getContent", new Class[0]).invoke(cls.cast(intent.getSerializableExtra(str)), new Object[0]);
        } catch (Throwable th) {
            ALog.e("DefaultXiaomiMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            return null;
        }
    }
}
