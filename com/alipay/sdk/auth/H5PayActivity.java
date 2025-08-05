package com.alipay.sdk.auth;

import android.app.Activity;
import android.os.Bundle;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.alipay.sdk.m.d.a;
import com.alipay.sdk.m.e.e;
import com.alipay.sdk.m.f.b;
import com.alipay.sdk.m.f.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class H5PayActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f6140a;

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(H5PayActivity h5PayActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1021247703:
                return new Boolean(super.requestWindowFeature(((Number) objArr[0]).intValue()));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        b bVar = this.f6140a;
        if (bVar == null) {
            finish();
        } else {
            bVar.b();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        a();
        super.onCreate(bundle);
        try {
            a a2 = com.alipay.sdk.m.d.b.a(getIntent());
            if (a2 == null) {
                finish();
                return;
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                if (!e.a(string)) {
                    finish();
                    return;
                }
                String string2 = extras.getString("cookie", null);
                String string3 = extras.getString("method", null);
                String string4 = extras.getString("title", null);
                String string5 = extras.getString("version", b.c);
                boolean z = extras.getBoolean(MspWebActivity.BACKISEXIT, false);
                try {
                    c cVar = new c(this, a2, string5);
                    setContentView(cVar);
                    cVar.a(string4, string3, z);
                    cVar.a(string, string2);
                    cVar.a(string);
                    this.f6140a = cVar;
                } catch (Throwable unused) {
                    finish();
                }
            } catch (Exception unused2) {
                finish();
            }
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        b bVar = this.f6140a;
        if (bVar == null) {
            return;
        }
        bVar.c();
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
}
