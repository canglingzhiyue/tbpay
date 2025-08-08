package com.taobao.taobao.weibo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.share.WbShareCallback;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.mtop.wvplugin.a;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.ShareAppRegister;
import com.ut.share.SharePlatform;
import com.ut.share.business.ShareBusiness;
import com.ut.share.data.ShareData;
import com.ut.share.executor.ExecutorFactory;
import com.ut.share.executor.WeiboExecutor;
import com.ut.share.sdk.ShareWeiboController;
import java.util.HashMap;
import tb.kge;
import tb.nzm;

/* loaded from: classes8.dex */
public class WeiboShareActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1570846171);
    }

    public static /* synthetic */ Object ipc$super(WeiboShareActivity weiboShareActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1257714799) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
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

    public WeiboShareActivity() {
        f.a("com.taobao.clipboard_share", "com.taobao.taobao.weibo.WeiboShareActivity");
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
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.weibo.WeiboShareActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    WeiboShareActivity.this.finish();
                }
            }
        });
        setContentView(linearLayout);
        ShareData shareData = (ShareData) getIntent().getParcelableExtra("shareData");
        if (shareData == null) {
            finish();
            return;
        }
        a();
        a(shareData);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        a(intent);
        finish();
    }

    private void a(ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e7ba23", new Object[]{this, shareData});
            return;
        }
        try {
            WeiboExecutor weiboExecutor = (WeiboExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.SinaWeibo);
            ShareWeiboController weibo = weiboExecutor == null ? null : weiboExecutor.getWeibo();
            if (weibo == null) {
                finish();
                return;
            }
            String link = shareData.getLink();
            String imagePath = shareData.getImagePath();
            String text = shareData.getText();
            if (!StringUtils.isEmpty(link)) {
                shareData.setType(ShareData.MessageType.WEBPAGE);
            } else if (!StringUtils.isEmpty(imagePath)) {
                shareData.setType(ShareData.MessageType.IMAGE);
            } else if (!StringUtils.isEmpty(text)) {
                shareData.setType(ShareData.MessageType.TEXT);
            }
            weibo.realShare(this, shareData);
        } catch (RuntimeException unused) {
            Toast.makeText(getApplicationContext(), b.a(R.string.taobao_app_1010_1_18295), 1).show();
            TLog.logi("WeiboShareActivity", "onCreate.Exception call finish");
            finish();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WeiboExecutor weiboExecutor = (WeiboExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.SinaWeibo);
        if (weiboExecutor != null && weiboExecutor.getWeibo() != null) {
            return;
        }
        nzm shareChannel = ShareBizAdapter.getInstance().getShareChannel();
        ShareAppRegister.registerWeibo(shareChannel.b(), shareChannel.c());
        ShareApi.getInstance().canShare(this, SharePlatform.SinaWeibo);
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        WeiboExecutor weiboExecutor = (WeiboExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.SinaWeibo);
        IWBAPI iwbapi = null;
        ShareWeiboController weibo = weiboExecutor == null ? null : weiboExecutor.getWeibo();
        if (weibo != null) {
            iwbapi = weibo.getWeiboShareAPI();
        }
        if (iwbapi == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("platform", "2");
        iwbapi.doResultIntent(intent, new WbShareCallback() { // from class: com.taobao.taobao.weibo.WeiboShareActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.sina.weibo.sdk.share.WbShareCallback
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    return;
                }
                Toast.makeText(WeiboShareActivity.this, b.a(R.string.share_finish_tip), 1).show();
                hashMap.put(a.RESULT_KEY, "success");
                ShareBusiness.getInstance().onShareFinished(hashMap);
            }

            @Override // com.sina.weibo.sdk.share.WbShareCallback
            public void onError(UiError uiError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2b582a4d", new Object[]{this, uiError});
                    return;
                }
                Toast.makeText(WeiboShareActivity.this, b.a(R.string.taobao_app_1010_1_18295), 1).show();
                hashMap.put(a.RESULT_KEY, "fail");
                hashMap.put("errorMessage", uiError == null ? "" : uiError.errorMessage);
                ShareBusiness.getInstance().onShareFinished(hashMap);
            }

            @Override // com.sina.weibo.sdk.share.WbShareCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    return;
                }
                Toast.makeText(WeiboShareActivity.this, b.a(R.string.taobao_app_1010_1_18292), 1).show();
                hashMap.put(a.RESULT_KEY, "cancel");
                ShareBusiness.getInstance().onShareFinished(hashMap);
            }
        });
    }
}
