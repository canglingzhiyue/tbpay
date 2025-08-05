package com.taobao.android.order.bundle;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class TBFoldedOrderListActivity extends TBOrderListActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(463840596);
    }

    public static /* synthetic */ Object ipc$super(TBFoldedOrderListActivity tBFoldedOrderListActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1265012588) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Bundle) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.android.order.bundle.TBOrderListActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.taobao.android.order.bundle.TBOrderListActivity, com.taobao.android.order.bundle.base.TBOrderBaseActivity, com.taobao.android.order.bundle.base.BaseActivity
    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        super.a(bundle);
        if (getSupportActionBar() == null) {
            return;
        }
        getSupportActionBar().e();
    }

    @Override // com.taobao.android.order.bundle.TBOrderListActivity
    public void c_(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb21606d", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            jSONObject.put("foldDeviceRelatedPage", "true");
        }
    }
}
