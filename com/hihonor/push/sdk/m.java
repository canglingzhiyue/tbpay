package com.hihonor.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.hihonor.push.framework.aidl.entity.PushTokenResult;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.common.data.DownMsgType;
import com.hihonor.push.sdk.common.data.UpMsgType;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a */
    public final Context f7281a;
    public z b = new z();

    public m(Context context) {
        this.f7281a = context;
    }

    public String a(boolean z) throws Exception {
        this.b.getClass();
        try {
            ag agVar = new ag(UpMsgType.REQUEST_PUSH_TOKEN, null);
            agVar.e = e.a();
            String pushToken = ((PushTokenResult) e.a(x.c.a(agVar))).getPushToken();
            if (z && !StringUtils.isEmpty(pushToken)) {
                Bundle bundle = new Bundle();
                bundle.putString("event_type", DownMsgType.RECEIVE_TOKEN);
                bundle.putString("push_token", pushToken);
                aj ajVar = new aj();
                Context context = this.f7281a;
                try {
                    Intent intent = new Intent();
                    intent.setPackage(context.getPackageName());
                    intent.setAction("com.hihonor.push.action.MESSAGING_EVENT");
                    Context applicationContext = context.getApplicationContext();
                    ajVar.c = applicationContext;
                    ajVar.b = bundle;
                    applicationContext.bindService(intent, ajVar, 1);
                } catch (Exception e) {
                    String str = "bind service failed." + e.getMessage();
                }
            }
            return pushToken;
        } catch (Exception e2) {
            throw e.a(e2);
        }
    }

    public static /* synthetic */ void a(b bVar, int i, String str) {
        if (bVar != null) {
            bVar.onFailure(i, str);
        }
    }

    public static /* synthetic */ void a(b bVar, Object obj) {
        if (bVar != null) {
            bVar.onSuccess(obj);
        }
    }

    public /* synthetic */ void b(Callable callable, b bVar) {
        int errorCode;
        String message;
        try {
            b((b<b>) bVar, (b) callable.call());
        } catch (ApiException e) {
            errorCode = e.getErrorCode();
            message = e.getMessage();
            b(bVar, errorCode, message);
        } catch (Exception unused) {
            HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_INTERNAL_ERROR;
            errorCode = honorPushErrorEnum.getErrorCode();
            message = honorPushErrorEnum.getMessage();
            b(bVar, errorCode, message);
        }
    }

    public static /* synthetic */ String lambda$JbyWCZvqsQHjaU6hp0VxO37UheY(m mVar, boolean z) {
        return mVar.a(z);
    }

    /* renamed from: lambda$WK-W4o0qv0909HHzHyIW1UHmpjE */
    public static /* synthetic */ void m770lambda$WKW4o0qv0909HHzHyIW1UHmpjE(m mVar, Callable callable, b bVar) {
        mVar.b(callable, bVar);
    }

    public void a(b<String> bVar, final boolean z) {
        a(new Callable() { // from class: com.hihonor.push.sdk.-$$Lambda$m$JbyWCZvqsQHjaU6hp0VxO37UheY
            {
                m.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.lambda$JbyWCZvqsQHjaU6hp0VxO37UheY(m.this, z);
            }
        }, bVar);
    }

    public final <T> void a(final Callable<T> callable, final b<T> bVar) {
        Runnable runnable = new Runnable() { // from class: com.hihonor.push.sdk.-$$Lambda$m$WK-W4o0qv0909HHzHyIW1UHmpjE
            @Override // java.lang.Runnable
            public final void run() {
                m.m770lambda$WKW4o0qv0909HHzHyIW1UHmpjE(m.this, callable, bVar);
            }
        };
        aa aaVar = aa.f;
        if (aaVar.d == null) {
            synchronized (aaVar.e) {
                if (aaVar.d == null) {
                    aaVar.d = aaVar.c();
                }
            }
        }
        aaVar.d.execute(runnable);
    }

    public final void b(final b<?> bVar, final int i, final String str) {
        aa.a(new Runnable() { // from class: com.hihonor.push.sdk.-$$Lambda$xIDHlpoYcBxl2tK_FLDjPRc9Tok
            @Override // java.lang.Runnable
            public final void run() {
                m.a(b.this, i, str);
            }
        });
    }

    public final <T> void b(final b<T> bVar, final T t) {
        aa.a(new Runnable() { // from class: com.hihonor.push.sdk.-$$Lambda$rRBIGLUCmVroqu1p2OXSeduJ8AA
            @Override // java.lang.Runnable
            public final void run() {
                m.a(b.this, t);
            }
        });
    }
}
