package com.taobao.search.musie;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jyt;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class MUSPageRouteActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f19202a;

    public static /* synthetic */ Object ipc$super(MUSPageRouteActivity mUSPageRouteActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    static {
        kge.a(1055659418);
        f19202a = noa.KEY_POP_UP;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (com.taobao.search.common.util.r.ck()) {
            Intent intent = new Intent(this, MUSPageActivity.class);
            intent.setData(getIntent().getData());
            startActivity(intent);
            finish();
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
            return;
        }
        if (jyt.INSTANCE.a(data)) {
            data = data.buildUpon().appendQueryParameter("isPreload", "true").build();
        }
        if (!data.getBooleanQueryParameter(f19202a, false)) {
            Intent intent2 = new Intent(this, MUSPageActivity.class);
            intent2.setData(data);
            startActivity(intent2);
        } else {
            Intent intent3 = new Intent(this, MUSPopPageActivity.class);
            intent3.setData(data);
            startActivity(intent3);
            overridePendingTransition(0, 0);
        }
        finish();
    }
}
