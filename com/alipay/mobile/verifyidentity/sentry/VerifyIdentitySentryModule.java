package com.alipay.mobile.verifyidentity.sentry;

import android.content.Context;
import com.alipay.mobile.alertsentry.SentryBuilder;
import com.alipay.mobile.alertsentry.converter.LogConverter;
import com.alipay.mobile.alertsentry.decision.DecisionMaker;
import com.alipay.mobile.alertsentry.identity.UserIDSource;
import com.alipay.mobile.alertsentry.module.SentryModule;
import com.alipay.mobile.alertsentry.upload.LogUploader;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VerifyIdentitySentryModule implements SentryModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UserIDSource f6069a = new UserIDSource() { // from class: com.alipay.mobile.verifyidentity.sentry.VerifyIdentitySentryModule.1
    };
    private DecisionMaker b = new DecisionMaker() { // from class: com.alipay.mobile.verifyidentity.sentry.VerifyIdentitySentryModule.2
    };
    private LogConverter c = new LogConverter() { // from class: com.alipay.mobile.verifyidentity.sentry.VerifyIdentitySentryModule.3
    };
    private LogUploader d = new LogUploader() { // from class: com.alipay.mobile.verifyidentity.sentry.VerifyIdentitySentryModule.4
    };

    @Override // com.alipay.mobile.alertsentry.module.SentryModule
    public void applyOptions(Context context, SentryBuilder sentryBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d603679e", new Object[]{this, context, sentryBuilder});
        }
    }
}
