package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.sdk.app.statistic.StatisticManager;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class APayEntranceActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AP_LOCAL_INFO = "ap_local_info";
    public static final String AP_ORDER_INFO = "ap_order_info";
    public static final String AP_SESSION = "ap_session";
    public static final String TARGET_PACKAGENAME = "ap_target_packagename";
    public static final ConcurrentHashMap<String, ResultNotifier> sNotifier = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private String f6132a;
    private String b;
    private BizContext c;

    /* loaded from: classes3.dex */
    public interface ResultNotifier {
        void onResult(String str);
    }

    public static /* synthetic */ Object ipc$super(APayEntranceActivity aPayEntranceActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString(AP_ORDER_INFO);
            String string2 = extras.getString(TARGET_PACKAGENAME);
            this.b = extras.getString(AP_SESSION);
            String string3 = extras.getString(AP_LOCAL_INFO, "{}");
            if (!TextUtils.isEmpty(this.b)) {
                this.c = BizContext.HolderForAct.getWithStringToken(this.b);
                BizContext bizContext = this.c;
                StatisticManager.putAction(bizContext, "biz", "BSAEntryCreate", this.b + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra(CashdeskConstants.ALIPAY_SIGN_STR, string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                StatisticManager.putError(this.c, ErrorType.WARNING, "APStartEx", th);
                finish();
            }
            BizContext bizContext2 = this.c;
            if (bizContext2 == null) {
                return;
            }
            bizContext2.setAPayEnActivityCreated(true);
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        String str = this.b;
        BizContext bizContext = this.c;
        StatisticManager.putAction(bizContext, "biz", "BSAFinish", str + "|" + TextUtils.isEmpty(this.f6132a));
        if (TextUtils.isEmpty(this.f6132a)) {
            this.f6132a = Result.getCancel();
            BizContext bizContext2 = this.c;
            if (bizContext2 != null) {
                bizContext2.setNeedPayFallback(true);
            }
        }
        if (str != null) {
            ResultNotifier remove = sNotifier.remove(str);
            if (remove != null) {
                remove.onResult(this.f6132a);
            } else {
                StatisticManager.putErrorMsg(this.c, ErrorType.WARNING, "refNull", "session=".concat(String.valueOf(str)));
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            StatisticManager.putError(this.c, ErrorType.WARNING, "APStartFinish", th);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        BizContext bizContext = this.c;
        StatisticManager.putAction(bizContext, "biz", "BSAOnAR", this.b + "|" + i + "," + i2);
        if (i != 1000) {
            return;
        }
        if (intent != null) {
            try {
                this.f6132a = intent.getStringExtra("result");
            } catch (Throwable unused) {
            }
        }
        finish();
    }
}
