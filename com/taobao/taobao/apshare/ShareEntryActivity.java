package com.taobao.taobao.apshare;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.share.sdk.openapi.BaseReq;
import com.alipay.share.sdk.openapi.BaseResp;
import com.alipay.share.sdk.openapi.IAPAPIEventHandler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.ShareAppRegister;
import com.ut.share.ShareCallbackHandler;
import com.ut.share.SharePlatform;
import com.ut.share.executor.AlipayExecutor;
import com.ut.share.executor.ExecutorFactory;
import tb.kge;
import tb.nzm;

/* loaded from: classes8.dex */
public class ShareEntryActivity extends Activity implements IAPAPIEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-982720209);
    }

    public static /* synthetic */ Object ipc$super(ShareEntryActivity shareEntryActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1264052993) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onNewIntent((Intent) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.alipay.share.sdk.openapi.IAPAPIEventHandler
    public void onReq(BaseReq baseReq) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a840e943", new Object[]{this, baseReq});
        }
    }

    public ShareEntryActivity() {
        f.a("com.taobao.clipboard_share", "com.taobao.taobao.apshare.ShareEntryActivity");
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setGravity(83);
        linearLayout.setBackgroundResource(17170445);
        setContentView(linearLayout);
        a();
        ShareCallbackHandler.handleAlipayResponse(getIntent(), this);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        a();
        ShareCallbackHandler.handleAlipayResponse(getIntent(), this);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AlipayExecutor alipayExecutor = (AlipayExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.Alipay);
        if (alipayExecutor != null && alipayExecutor.getAlipay() != null && alipayExecutor.getAlipay().getAlipayApi() != null) {
            return;
        }
        nzm shareChannel = ShareBizAdapter.getInstance().getShareChannel();
        ShareAppRegister.registerAlipay(shareChannel.d());
        ShareApi.getInstance().canShare(this, SharePlatform.Alipay);
        ((AlipayExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.Alipay)).getAlipay().init(this, shareChannel.d());
    }

    @Override // com.alipay.share.sdk.openapi.IAPAPIEventHandler
    public void onResp(BaseResp baseResp) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f51762f", new Object[]{this, baseResp});
            return;
        }
        int i = baseResp.errCode;
        if (i == -4) {
            a2 = b.a(R.string.taobao_app_1010_1_18295);
            AppMonitor.Alarm.commitFail("share", "Share", "SHARE_FAILED_ALIPAY", b.a(R.string.taobao_app_1010_1_18295));
        } else if (i == -2) {
            a2 = b.a(R.string.taobao_app_1010_1_18292);
        } else if (i == 0) {
            a2 = b.a(R.string.share_finish_tip);
            AppMonitor.Alarm.commitSuccess("share", "Share");
        } else {
            a2 = b.a(R.string.taobao_app_1010_1_18284);
            AppMonitor.Alarm.commitFail("share", "Share", "SHARE_FAILED_ALIPAY", b.a(R.string.taobao_app_1010_1_18295));
        }
        Toast.makeText(this, a2, 1).show();
        finish();
    }
}
