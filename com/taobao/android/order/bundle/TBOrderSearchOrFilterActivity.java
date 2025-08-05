package com.taobao.android.order.bundle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.helper.g;
import com.taobao.search.common.util.i;
import tb.jqg;
import tb.kge;

/* loaded from: classes6.dex */
public class TBOrderSearchOrFilterActivity extends TBOrderListActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(94722873);
    }

    public static /* synthetic */ Object ipc$super(TBOrderSearchOrFilterActivity tBOrderSearchOrFilterActivity, String str, Object... objArr) {
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
        jqg.b("TBOrderSearchOrFilterActivity", i.b.MEASURE_ONCREATE);
        if (!TextUtils.isEmpty(g.a(getIntent(), "searchKey"))) {
            getIntent().putExtra("isSearch", "true");
        }
        super.a(bundle);
    }
}
