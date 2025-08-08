package com.taobao.share.core.share.interceptor;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.share.core.share.ShareBusinessService;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.nyl;
import tb.nym;
import tb.nyy;
import tb.nzk;

/* loaded from: classes8.dex */
public class LoginInterceptor implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ShareLoginBroadcastReceiver f19623a;

    static {
        kge.a(2089939171);
        kge.a(-1805296056);
    }

    @Override // com.taobao.share.core.share.interceptor.b
    public boolean b(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("846ab17a", new Object[]{this, arrayList, tBShareContent, str})).booleanValue();
        }
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELLOGININTERCEPTORSTART);
        com.taobao.share.globalmodel.e.b().c(str);
        if (nyl.f()) {
            Activity activity = com.taobao.share.copy.a.a().e().get();
            if (!ShareBizAdapter.getInstance().getLogin().b()) {
                ShareBizAdapter.getInstance().getLogin().a(true);
                if (activity != null) {
                    nzk login = ShareBizAdapter.getInstance().getLogin();
                    ShareLoginBroadcastReceiver shareLoginBroadcastReceiver = new ShareLoginBroadcastReceiver(arrayList, tBShareContent, str);
                    this.f19623a = shareLoginBroadcastReceiver;
                    login.a(shareLoginBroadcastReceiver);
                    LocalBroadcastManager.getInstance(activity).sendBroadcast(new Intent("action.share_dialog_close"));
                }
                Toast.makeText(nym.a(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_23577), 0).show();
                nyy.c(b.TAG, "return: to login");
                return true;
            } else if (activity != null && this.f19623a != null) {
                ShareBizAdapter.getInstance().getLogin().b(this.f19623a);
            }
        }
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELLOGININTERCEPTOREND);
        return false;
    }

    /* loaded from: classes8.dex */
    public class ShareLoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ArrayList<String> b;
        private TBShareContent c;
        private String e;
        private boolean d = false;
        private Class f = com.taobao.share.copy.a.a().e().get().getClass();

        static {
            kge.a(-1149661243);
        }

        public static /* synthetic */ Class a(ShareLoginBroadcastReceiver shareLoginBroadcastReceiver) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6c04b09f", new Object[]{shareLoginBroadcastReceiver}) : shareLoginBroadcastReceiver.f;
        }

        public static /* synthetic */ ArrayList b(ShareLoginBroadcastReceiver shareLoginBroadcastReceiver) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("8614590d", new Object[]{shareLoginBroadcastReceiver}) : shareLoginBroadcastReceiver.b;
        }

        public static /* synthetic */ TBShareContent c(ShareLoginBroadcastReceiver shareLoginBroadcastReceiver) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBShareContent) ipChange.ipc$dispatch("e613d1d1", new Object[]{shareLoginBroadcastReceiver}) : shareLoginBroadcastReceiver.c;
        }

        public ShareLoginBroadcastReceiver(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
            this.b = arrayList;
            this.c = tBShareContent;
            this.e = str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            nyy.b("ShareLoginBroadcastReceiver", "session change+ Sid:" + com.taobao.share.globalmodel.e.b().k() + " sid:" + this.e);
            if (!StringUtils.equals(com.taobao.share.globalmodel.e.b().k(), this.e)) {
                ShareBizAdapter.getInstance().getLogin().b(this);
            } else if ((this.d && intent == null) || StringUtils.isEmpty(intent.getAction())) {
            } else {
                try {
                    if (LoginAction.valueOf(intent.getAction()) != LoginAction.NOTIFY_LOGIN_SUCCESS) {
                        return;
                    }
                    this.d = true;
                    new Handler().postDelayed(new Runnable() { // from class: com.taobao.share.core.share.interceptor.LoginInterceptor.ShareLoginBroadcastReceiver.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                if (com.taobao.share.copy.a.a().e() != null && com.taobao.share.copy.a.a().e().get() != null && ShareLoginBroadcastReceiver.a(ShareLoginBroadcastReceiver.this) == com.taobao.share.copy.a.a().e().get().getClass()) {
                                    ShareBusinessService.a(ShareLoginBroadcastReceiver.b(ShareLoginBroadcastReceiver.this), ShareLoginBroadcastReceiver.c(ShareLoginBroadcastReceiver.this));
                                    return;
                                }
                                ShareBizAdapter.getInstance().getLogin().b(ShareLoginBroadcastReceiver.this);
                            } catch (Exception e) {
                                e.printStackTrace();
                                nyy.c(b.TAG, "ShareLoginBroadcastReceiver.doShare err:" + e.getMessage());
                            }
                        }
                    }, 500L);
                } catch (Exception e) {
                    e.printStackTrace();
                    nyy.c(b.TAG, "ShareLoginBroadcastReceiver.doShare err:" + e.getMessage());
                }
            }
        }
    }
}
