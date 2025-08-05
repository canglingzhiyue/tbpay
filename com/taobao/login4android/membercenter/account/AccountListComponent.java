package com.taobao.login4android.membercenter.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import tb.kge;

/* loaded from: classes7.dex */
public class AccountListComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.AccountListComponent";
    private static OnAccountChangedListener mOnAccountChangedListener;

    static {
        kge.a(-728870794);
    }

    public static void openMultiAccountPage(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b84e74", new Object[]{context});
        } else {
            openMultiAccountPage(context, null);
        }
    }

    public static void openMultiAccountPage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31179e0", new Object[]{context, bundle});
            return;
        }
        Intent intent = new Intent(context, MultiAccountActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
        UserTrackAdapter.sendUT(NewMultiAccountFragment.PAGE_NAME, "Page_AccountManager_ShowView");
    }

    public static void showLogoutPanel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6512ee4", new Object[]{context});
            return;
        }
        UserTrackAdapter.sendUT("LogoutSimple");
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        Intent intent = new Intent(context, LogoutPanelActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("actionType", "logout_panel");
        context.startActivity(intent);
    }

    public static void showAgreement(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38220b4", new Object[]{context});
            return;
        }
        UserTrackAdapter.sendUT("Agreement");
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        Intent intent = new Intent(context, LogoutPanelActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("actionType", "agreement");
        context.startActivity(intent);
    }

    public static void newLogoutPanel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb25e87", new Object[]{context});
        } else {
            showLogoutPanel(context);
        }
    }

    public static void isMultiAccountPageEnable(DataCallback<Boolean> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c575d9", new Object[]{dataCallback});
        } else if (LoginSwitch.isInABTestRegion("enable_multi_account_new", 10000)) {
            if (dataCallback == null) {
                return;
            }
            dataCallback.result(true);
        } else if (dataCallback == null) {
        } else {
            dataCallback.result(false);
        }
    }

    public static boolean isMultiAccountPageEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59209d1b", new Object[0])).booleanValue() : LoginSwitch.isInABTestRegion("enable_multi_account_new", 10000);
    }

    public static void isLogoutPanelEnable(final DataCallback<Boolean> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e89eb56", new Object[]{dataCallback});
            return;
        }
        final int i = LoginSwitch.getSwitch("trigger_logout_panel_new", 1);
        new CoordinatorWrapper().execute(new AsyncTask<Object, Void, SessionList>() { // from class: com.taobao.login4android.membercenter.account.AccountListComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.ali.user.mobile.rpc.login.model.SessionList, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ SessionList doInBackground(Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(SessionList sessionList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, sessionList});
                } else {
                    a(sessionList);
                }
            }

            public SessionList a(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SessionList) ipChange2.ipc$dispatch("8cd065e4", new Object[]{this, objArr}) : SecurityGuardManagerWraper.getSessionListFromFile();
            }

            public void a(SessionList sessionList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fc852dc3", new Object[]{this, sessionList});
                } else if (LoginSwitch.isInABTestRegion("enable_multi_account_new", 10000) && i > 0 && sessionList != null && sessionList.sessionModels != null && i <= sessionList.sessionModels.size()) {
                    dataCallback.result(true);
                } else {
                    dataCallback.result(false);
                }
            }
        }, new Object[0]);
    }

    public static OnAccountChangedListener getOnAccountChangedListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnAccountChangedListener) ipChange.ipc$dispatch("247b1310", new Object[0]) : mOnAccountChangedListener;
    }

    public static void setOnAccountChangedListener(OnAccountChangedListener onAccountChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f4ab54", new Object[]{onAccountChangedListener});
        } else {
            mOnAccountChangedListener = onAccountChangedListener;
        }
    }
}
