package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.android.app.pay.AuthTask;
import com.alipay.android.app.pay.PayTask;
import com.alipay.android.app.pay.RendTask;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.selftest.SelfTestManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogAgent;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.app.PayTaskCompat;
import com.alipay.sdk.app.RegionUtils;
import com.alipay.sdk.data.DynamicConfig;
import com.alipay.sdk.sys.BizContext;
import com.alipay.sdk.util.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class MiniLaucherActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile long e;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4348a = false;
    private PayTask b = null;
    private AuthTask c = null;
    private RendTask d = null;
    private boolean f = false;

    public static /* synthetic */ Object ipc$super(MiniLaucherActivity miniLaucherActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2136601924:
                return super.getWindow();
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

    public static /* synthetic */ boolean a(MiniLaucherActivity miniLaucherActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6fd5f", new Object[]{miniLaucherActivity, new Boolean(z)})).booleanValue();
        }
        miniLaucherActivity.f4348a = z;
        return z;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.getWindow().requestFeature(1);
        super.onCreate(bundle);
        super.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        super.getWindow().getDecorView().setBackgroundDrawable(new ColorDrawable(0));
        setRequestedOrientation(1);
        SelfTestManager.triggerSelfTestAsync(this);
        try {
            a(getIntent());
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        a(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (!this.f4348a) {
            ResultStatus resultStatus = ResultStatus.CANCELED;
            Intent intent = new Intent("com.alipay.android.app.pay.ACTION_PAY_FAILED");
            intent.putExtra("resultStatus", String.valueOf(resultStatus.getStatus()));
            intent.putExtra("memo", resultStatus.getMemo());
            intent.putExtra("result", "");
            setResult(0, intent);
        }
        PayTask payTask = this.b;
        if (payTask != null) {
            payTask.clear();
            this.b = null;
        }
        AuthTask authTask = this.c;
        if (authTask != null) {
            authTask.clear();
            this.c = null;
        }
        RendTask rendTask = this.d;
        if (rendTask != null) {
            rendTask.clear();
            this.d = null;
        }
        super.finish();
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        try {
            GlobalHelper.getInstance().init(getApplicationContext());
            String stringExtra = intent.getStringExtra(CashdeskConstants.ALIPAY_SIGN_STR);
            String stringExtra2 = intent.getStringExtra("extend_params");
            if (!StringUtils.isEmpty(stringExtra)) {
                this.f = false;
                a(stringExtra, stringExtra2);
                return;
            }
            String stringExtra3 = intent.getStringExtra("auth_info");
            if (!StringUtils.isEmpty(stringExtra3)) {
                this.f = false;
                a(stringExtra3);
                return;
            }
            String stringExtra4 = intent.getStringExtra("bizType");
            String stringExtra5 = intent.getStringExtra("data");
            int intExtra = intent.getIntExtra("sourceId", -1);
            if (StringUtils.isEmpty(stringExtra4)) {
                return;
            }
            this.f = true;
            a(stringExtra4, stringExtra5, intExtra);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            finish();
        }
    }

    private void a(String str, String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        String str3 = "currentRendTime=" + e + " , SystemClock.elapsedRealtime() =" + SystemClock.elapsedRealtime();
        synchronized (MiniLaucherActivity.class) {
            if (SystemClock.elapsedRealtime() - e < 3000) {
                return;
            }
            e = SystemClock.elapsedRealtime();
            this.d = new RendTask(this, new RendTask.OnContainerFinishListener() { // from class: com.alipay.android.app.pay.MiniLaucherActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.app.pay.RendTask.OnContainerFinishListener
                public void onContainerFinish(Context context, String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e4419fc0", new Object[]{this, context, str4, str5});
                        return;
                    }
                    Intent intent = new Intent(MspGlobalDefine.ACTION_REND_FINISH);
                    intent.putExtra("errorCode", str4);
                    intent.putExtra("result", str5);
                    intent.putExtra("sourceId", i);
                    MiniLaucherActivity.this.setResult(-1, intent);
                    MiniLaucherActivity.a(MiniLaucherActivity.this, true);
                    MiniLaucherActivity.this.finish();
                    LocalBroadcastManager.getInstance(MiniLaucherActivity.this.getApplicationContext()).sendBroadcast(intent);
                }
            });
            this.d.rend(str, str2);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (MiniLaucherActivity.class) {
            if (SystemClock.elapsedRealtime() - e < 3000) {
                return;
            }
            e = SystemClock.elapsedRealtime();
            this.c = new AuthTask(this, new AuthTask.OnAuthListener() { // from class: com.alipay.android.app.pay.MiniLaucherActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.app.pay.AuthTask.OnAuthListener
                public void onAuthSuccess(Context context, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e7600e3", new Object[]{this, context, str2, str3, str4});
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("resultStatus", str2);
                    intent.putExtra("memo", str3);
                    intent.putExtra("result", str4);
                    MiniLaucherActivity.this.setResult(-1, intent);
                    MiniLaucherActivity.a(MiniLaucherActivity.this, true);
                    MiniLaucherActivity.this.finish();
                }

                @Override // com.alipay.android.app.pay.AuthTask.OnAuthListener
                public void onAuthFailed(Context context, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("76e32e7b", new Object[]{this, context, str2, str3, str4});
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("resultStatus", str2);
                    intent.putExtra("memo", str3);
                    intent.putExtra("result", str4);
                    MiniLaucherActivity.this.setResult(0, intent);
                    MiniLaucherActivity.a(MiniLaucherActivity.this, true);
                    MiniLaucherActivity.this.finish();
                }
            });
            this.c.auth(str);
        }
    }

    private void a(final String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        synchronized (MiniLaucherActivity.class) {
            if (SystemClock.elapsedRealtime() - e < 3000) {
                return;
            }
            e = SystemClock.elapsedRealtime();
            List<DynamicConfig.LaunchAppSwitchItem> list = RegionUtils.defaultItems;
            try {
                PhoneCashierMspEngine.getMspWallet().initConfigManger(this);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            if (DrmManager.getInstance(this).isGray(DrmKey.GRAY_TO_ALIPAYSDK_231221, false, this) && Utils.isExistAnyExpectedPackage(new BizContext(this, str, "pay"), this, list)) {
                for (String str3 : str.split("&")) {
                    String[] split = str3.split("=");
                    if (split.length == 2 && split[0].equalsIgnoreCase("biz_type") && (split[1].equalsIgnoreCase("\"trade\"") || split[1].equalsIgnoreCase("trade"))) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (z) {
                    Thread thread = new Thread(new Runnable() { // from class: com.alipay.android.app.pay.MiniLaucherActivity.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            String str4;
                            String str5;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                Map<String, String> payV2 = new PayTaskCompat(MiniLaucherActivity.this).payV2(str, true);
                                String str6 = null;
                                if (payV2 != null) {
                                    str4 = null;
                                    str5 = null;
                                    for (String str7 : payV2.keySet()) {
                                        if (StringUtils.equals(str7, "resultStatus")) {
                                            str6 = payV2.get(str7);
                                        } else if (StringUtils.equals(str7, "result")) {
                                            str5 = payV2.get(str7);
                                        } else if (StringUtils.equals(str7, "memo")) {
                                            str4 = payV2.get(str7);
                                        }
                                    }
                                } else {
                                    str4 = null;
                                    str5 = null;
                                }
                                if (!StringUtils.equals(str6, "9000") && !StringUtils.equals(str6, "10000")) {
                                    Intent intent = new Intent("com.alipay.android.app.pay.ACTION_PAY_FAILED");
                                    intent.putExtra("resultStatus", str6);
                                    intent.putExtra("memo", str4);
                                    intent.putExtra("result", str5);
                                    MiniLaucherActivity.this.setResult(0, intent);
                                    MiniLaucherActivity.a(MiniLaucherActivity.this, true);
                                    MiniLaucherActivity.this.finish();
                                    LocalBroadcastManager.getInstance(MiniLaucherActivity.this.getApplicationContext()).sendBroadcast(intent);
                                    return;
                                }
                                Intent intent2 = new Intent("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
                                intent2.putExtra("resultStatus", str6);
                                intent2.putExtra("memo", str4);
                                intent2.putExtra("result", str5);
                                MiniLaucherActivity.this.setResult(-1, intent2);
                                MiniLaucherActivity.a(MiniLaucherActivity.this, true);
                                MiniLaucherActivity.this.finish();
                                LocalBroadcastManager.getInstance(MiniLaucherActivity.this.getApplicationContext()).sendBroadcast(intent2);
                            } catch (Throwable th2) {
                                LogUtil.printExceptionStackTrace(th2);
                            }
                        }
                    });
                    thread.setName("MiniLauncherPayThread");
                    TaskHelper.execute(thread);
                    return;
                }
            }
            LogAgent.onPayStart();
            this.b = new PayTask(this, new PayTask.TaoBaoOnPayListener() { // from class: com.alipay.android.app.pay.MiniLaucherActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.app.pay.PayTask.OnPayListener
                public void onPayFailed(Context context, String str4, String str5, String str6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50907699", new Object[]{this, context, str4, str5, str6});
                    }
                }

                @Override // com.alipay.android.app.pay.PayTask.OnPayListener
                public void onPaySuccess(Context context, String str4, String str5, String str6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a71bc85", new Object[]{this, context, str4, str5, str6});
                    }
                }

                @Override // com.alipay.android.app.pay.PayTask.TaoBaoOnPayListener
                public void onTaoBaoPaySuccess(Context context, String str4, String str5, String str6, String str7, String str8, String str9) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c303f5", new Object[]{this, context, str4, str5, str6, str7, str8, str9});
                        return;
                    }
                    Intent intent = new Intent("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
                    intent.putExtra("resultStatus", str4);
                    intent.putExtra("memo", str5);
                    intent.putExtra("result", str6);
                    intent.putExtra(MspGlobalDefine.EXTENDINFO, str9);
                    if (!StringUtils.isEmpty(str7)) {
                        intent.putExtra(MspGlobalDefine.OPEN_TIME, str7);
                    }
                    if (!StringUtils.isEmpty(str8)) {
                        intent.putExtra("netError", str8);
                    }
                    MiniLaucherActivity.this.setResult(-1, intent);
                    MiniLaucherActivity.a(MiniLaucherActivity.this, true);
                    MiniLaucherActivity.this.finish();
                    LocalBroadcastManager.getInstance(MiniLaucherActivity.this.getApplicationContext()).sendBroadcast(intent);
                }

                @Override // com.alipay.android.app.pay.PayTask.TaoBaoOnPayListener
                public void onTaoBaoPayFailed(Context context, String str4, String str5, String str6, String str7, String str8, String str9) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7a8be25", new Object[]{this, context, str4, str5, str6, str7, str8, str9});
                        return;
                    }
                    Intent intent = new Intent("com.alipay.android.app.pay.ACTION_PAY_FAILED");
                    intent.putExtra("resultStatus", str4);
                    intent.putExtra("memo", str5);
                    intent.putExtra("result", str6);
                    intent.putExtra(MspGlobalDefine.EXTENDINFO, str9);
                    if (!StringUtils.isEmpty(str7)) {
                        intent.putExtra(MspGlobalDefine.OPEN_TIME, str7);
                    }
                    if (!StringUtils.isEmpty(str8)) {
                        intent.putExtra("netError", str8);
                    }
                    MiniLaucherActivity.this.setResult(0, intent);
                    MiniLaucherActivity.a(MiniLaucherActivity.this, true);
                    MiniLaucherActivity.this.finish();
                    LocalBroadcastManager.getInstance(MiniLaucherActivity.this.getApplicationContext()).sendBroadcast(intent);
                }
            });
            this.b.execute(str, str2);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "MiniOnBack", String.valueOf(i));
        }
        return super.onKeyDown(i, keyEvent);
    }
}
