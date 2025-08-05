package com.alipay.sdk.app;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.sys.BizContext;
import com.alipay.sdk.util.LogUtils;
import com.alipay.sdk.util.PayHelper;
import com.alipay.sdk.util.ResultUtil;
import com.alipay.sdk.util.Utils;
import com.alipay.sdk.widget.JumpLoading;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AuthTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f6133a;
    private JumpLoading b;

    public static /* synthetic */ void a(AuthTask authTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c9592", new Object[]{authTask});
        } else {
            authTask.a();
        }
    }

    public AuthTask(Activity activity) {
        this.f6133a = activity;
        this.b = new JumpLoading(activity, JumpLoading.LOADING_GO_AUTH);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JumpLoading jumpLoading = this.b;
        if (jumpLoading == null) {
            return;
        }
        jumpLoading.dismiss();
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b2eaf94", new Object[]{this, str, new Boolean(z)});
        }
        BizContext bizContext = new BizContext(this.f6133a, str, "authV2");
        return ResultUtil.format(bizContext, innerAuth(bizContext, str, z));
    }

    public synchronized String auth(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac6df245", new Object[]{this, str, new Boolean(z)});
        }
        return innerAuth(new BizContext(this.f6133a, str, "auth"), str, z);
    }

    public synchronized String innerAuth(BizContext bizContext, String str, boolean z) {
        String notInstalled;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c946cc08", new Object[]{this, bizContext, str, new Boolean(z)});
        }
        if (z && this.b != null) {
            this.b.showProgress();
        }
        String cancel = Result.getCancel();
        RegionUtils.setRegionStr("");
        try {
            Activity activity = this.f6133a;
            String format = bizContext.format(str);
            if (Utils.isExistAnyExpectedPackage(bizContext, this.f6133a, RegionUtils.defaultItems)) {
                notInstalled = new PayHelper(activity, bizContext, new PayHelper.IAlipayBindListener() { // from class: com.alipay.sdk.app.AuthTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.sdk.util.PayHelper.IAlipayBindListener
                    public void onBinded() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("19eccb62", new Object[]{this});
                        }
                    }

                    @Override // com.alipay.sdk.util.PayHelper.IAlipayBindListener
                    public void onStartActivity() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1fcfb979", new Object[]{this});
                        } else {
                            AuthTask.a(AuthTask.this);
                        }
                    }
                }).pay4Client(format);
                if (!TextUtils.equals(notInstalled, "failed") && !TextUtils.equals(notInstalled, PayHelper.SCHEME_FAILED)) {
                    if (TextUtils.isEmpty(notInstalled)) {
                        notInstalled = Result.getCancel();
                    }
                }
                LogUtils.w("mspl", "biz", StatisticRecord.EC_LOG_BIND_CALLED_H5);
                notInstalled = Result.getNotInstalled();
            } else {
                LogUtils.w("mspl", "biz", StatisticRecord.EC_LOG_BIND_CALLED_H5);
                notInstalled = Result.getNotInstalled();
            }
            cancel = notInstalled;
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            LogUtils.i("mspl", "biz", StatisticRecord.EC_PROGRESS_RETURNING, sb.toString());
            LogUtils.i("mspl", "biz", StatisticRecord.EC_PROGRESS_RETURNING_VALUE, ResultUtil.getAttributeVal(cancel, "resultStatus") + "|" + ResultUtil.getAttributeVal(cancel, "memo"));
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SystemClock.elapsedRealtime());
            LogUtils.i("mspl", "biz", StatisticRecord.EC_PROGRESS_RETURNING, sb2.toString());
            LogUtils.i("mspl", "biz", StatisticRecord.EC_PROGRESS_RETURNING_VALUE, ResultUtil.getAttributeVal(cancel, "resultStatus") + "|" + ResultUtil.getAttributeVal(cancel, "memo"));
        }
        a();
        return cancel;
    }
}
