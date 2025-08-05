package com.taobao.linkmanager.afc.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.f;
import com.taobao.linkmanager.afc.request.TBLinkRequest;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;
import tb.koe;

/* loaded from: classes7.dex */
public class LoginReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static LoginReceiver f17679a;

        static {
            kge.a(-1888448415);
            f17679a = new LoginReceiver();
        }
    }

    static {
        kge.a(1038011311);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LoginAction valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || intent.getAction() == null || (valueOf = LoginAction.valueOf(intent.getAction())) != LoginAction.NOTIFY_LOGIN_SUCCESS) {
        } else {
            a(context, valueOf);
        }
    }

    public void a(final Context context, LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991b4e5c", new Object[]{this, context, loginAction});
            return;
        }
        String userId = Login.getUserId();
        String str = (String) f.a(context).b("afc_login_user", "");
        c.a("linkx", "LoginReceiver === reportLogin: action：" + loginAction + " 本地ID：" + str + " 当前id：" + userId);
        HashMap hashMap = new HashMap();
        hashMap.put("userid", userId);
        b.a("afc_login_report", "", "", hashMap);
        if (TextUtils.equals(str, userId)) {
            return;
        }
        if (!TextUtils.isEmpty(userId)) {
            f.a(context).a("afc_login_user", userId);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("deviceID", AfcUtils.a(context, false));
        hashMap2.put("deviceID2", TFCCommonUtils.b(context));
        hashMap2.put(LoggingSPCache.STORAGE_USERID, Login.getUserId());
        c.a("linkx", "LoginReceiver === reportLogin === 参数Map == " + hashMap2.toString());
        TBLinkRequest.getInstance().sendRequest(TBLinkRequest.LOGIN_REPORT, "1.0", hashMap2, false, new koe() { // from class: com.taobao.linkmanager.afc.remote.LoginReceiver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.koe
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    return;
                }
                c.a("linkx", "LoginReceiver === reportLogin: onSuccess：" + jSONObject);
                LoginBroadcastHelper.unregisterLoginReceiver(context, a.f17679a);
            }

            @Override // tb.koe
            public void a(JSONObject jSONObject, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b6e96a0", new Object[]{this, jSONObject, str2});
                    return;
                }
                c.b("linkx", "LoginReceiver === reportLogin: onError：" + jSONObject);
                LoginBroadcastHelper.unregisterLoginReceiver(context, a.f17679a);
            }
        });
    }
}
