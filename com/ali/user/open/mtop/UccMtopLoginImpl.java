package com.ali.user.open.mtop;

import mtopsdk.common.util.StringUtils;
import com.ali.user.open.callback.LoginCallback;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.session.Session;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.login.c;
import com.taobao.tao.remotebusiness.login.e;
import com.taobao.tao.remotebusiness.login.i;

/* loaded from: classes.dex */
public class UccMtopLoginImpl implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String TAG = "ucc.taobaoMtopImpl";
    private String site;

    @Override // com.taobao.tao.remotebusiness.login.c
    public boolean isLogining() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fde62e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void access$000(UccMtopLoginImpl uccMtopLoginImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0a6d61", new Object[]{uccMtopLoginImpl, str});
        } else {
            uccMtopLoginImpl.sendUT(str);
        }
    }

    public UccMtopLoginImpl(String str) {
        this.site = str;
    }

    @Override // com.taobao.tao.remotebusiness.login.c
    public void login(final i iVar, boolean z) {
        sendUT("LOGIN_ENTER");
        if (!z) {
            if (iVar != null) {
                sendUT("LOGIN_FAIL_NOT_SHOWUI");
                iVar.b();
                return;
            }
            sendUT("LOGIN_FAIL_NULL_LISTENER");
            return;
        }
        try {
            Class.forName("com.ali.user.open.ucc.util.MtopRemoteLogin").getMethod("login", String.class, Class.forName("com.ali.user.open.callback.LoginCallback")).invoke(null, this.site, new LoginCallback() { // from class: com.ali.user.open.mtop.UccMtopLoginImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.callback.LoginCallback
                public void onSuccess(Session session) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c5c8819", new Object[]{this, session});
                    } else if (iVar == null) {
                    } else {
                        UccMtopLoginImpl.access$000(UccMtopLoginImpl.this, "LOGIN_SUCCESS");
                        SDKLogger.e(UccMtopLoginImpl.TAG, "UCC_LOGIN_SUCCESS");
                        iVar.a();
                    }
                }

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    String str2 = UccMtopLoginImpl.TAG;
                    SDKLogger.e(str2, "UCC_LOGIN_FAIL code=" + i);
                    if (iVar == null) {
                        UccMtopLoginImpl.access$000(UccMtopLoginImpl.this, "LOGIN_FAIL_NULL_LISTENER");
                    } else if (i == 10003) {
                        UccMtopLoginImpl.access$000(UccMtopLoginImpl.this, "LOGIN_CANCEL");
                        iVar.c();
                    } else {
                        UccMtopLoginImpl.access$000(UccMtopLoginImpl.this, "LOGIN_FAIL");
                        iVar.b();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            sendUT("LOGIN_FAIL_EXCEPTION");
            if (iVar == null) {
                return;
            }
            iVar.b();
        }
    }

    @Override // com.taobao.tao.remotebusiness.login.c
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue() : isSessionValid(getSite());
    }

    public String getSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8630f5c", new Object[]{this}) : this.site;
    }

    public boolean isSessionValid(String str) {
        Session session;
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        SDKLogger.e(TAG, "func isSessionValid");
        try {
            session = (Session) Class.forName("com.ali.user.open.ucc.util.MtopRemoteLogin").getMethod("getSession", String.class).invoke(null, str);
        } catch (Throwable th) {
            th.printStackTrace();
            session = null;
        }
        if (session == null || StringUtils.isEmpty(session.sid)) {
            SDKLogger.e(TAG, "isSessionValid()  session is null");
            return false;
        } else if (session.loginTime == 0 || session.expireIn == 0) {
            SDKLogger.e(TAG, "isSessionValid()  loginTime is 0 or expireIn is 0");
            return false;
        } else {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("isSessionValid()  ");
            sb.append(System.currentTimeMillis() / 1000 < session.expireIn);
            SDKLogger.e(str2, sb.toString());
            return System.currentTimeMillis() / 1000 < session.expireIn;
        }
    }

    @Override // com.taobao.tao.remotebusiness.login.c
    public e getLoginContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("45c557e", new Object[]{this});
        }
        e eVar = new e();
        try {
            Session session = ((SessionService) AliMemberSDK.getService(SessionService.class)).getSession(getSite());
            if (session != null) {
                eVar.c = session.nick;
                eVar.b = session.hid;
                eVar.f21035a = session.sid;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eVar;
    }

    private void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{this, str});
            return;
        }
        try {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_UccTaobaoMtopImpl", str, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
