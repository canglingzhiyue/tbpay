package com.taobao.infoflow.taobao.subservice.biz.loginservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ILoginService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ldf;
import tb.ljs;

/* loaded from: classes7.dex */
public class TbLoginServiceImpl implements ILoginService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LoginServiceImpl";
    private boolean isLoginStateChange;
    private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.infoflow.taobao.subservice.biz.loginservice.TbLoginServiceImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                String action = intent.getAction();
                if (StringUtils.isEmpty(action)) {
                    return;
                }
                int i = AnonymousClass2.f17468a[LoginAction.valueOf(action).ordinal()];
                if (i == 1) {
                    ldf.d(TbLoginServiceImpl.TAG, "登入");
                    TbLoginServiceImpl.access$000(TbLoginServiceImpl.this);
                } else if (i != 2) {
                } else {
                    ldf.d(TbLoginServiceImpl.TAG, "登出");
                    TbLoginServiceImpl.access$000(TbLoginServiceImpl.this);
                }
            }
        }
    };
    private ljs mInfoFlowContext;

    /* renamed from: com.taobao.infoflow.taobao.subservice.biz.loginservice.TbLoginServiceImpl$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17468a = new int[LoginAction.values().length];

        static {
            try {
                f17468a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17468a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17468a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17468a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-1119642840);
        kge.a(-626552074);
    }

    public static /* synthetic */ void access$000(TbLoginServiceImpl tbLoginServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3455482", new Object[]{tbLoginServiceImpl});
        } else {
            tbLoginServiceImpl.processLoginChange();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.mBroadcastReceiver);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.mBroadcastReceiver);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ILoginService
    public boolean loginStatusTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79608d4", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            this.isLoginStateChange = false;
            return false;
        } else if (!this.isLoginStateChange) {
            ldf.b(TAG, "登录状态未变化");
            return false;
        } else {
            this.isLoginStateChange = false;
            return triggerLogin(this.mInfoFlowContext);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ILoginService
    public boolean isLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(Login.getOldUserId());
    }

    private void processLoginChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e6aa11", new Object[]{this});
            return;
        }
        this.isLoginStateChange = true;
        if (!isContainerVisible(this.mInfoFlowContext)) {
            return;
        }
        this.isLoginStateChange = false;
        triggerLogin(this.mInfoFlowContext);
    }

    private boolean isContainerVisible(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1361d2a1", new Object[]{this, ljsVar})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            ldf.d(TAG, "isSelect sceneService == null");
            return true;
        }
        return iMainLifecycleService.isVisible();
    }

    private boolean triggerLogin(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3fb0837", new Object[]{this, ljsVar})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.b(TAG, "dataService == null");
            return false;
        }
        return iContainerDataService.triggerEvent("UserLogin", null);
    }
}
