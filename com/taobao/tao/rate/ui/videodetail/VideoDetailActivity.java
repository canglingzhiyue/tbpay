package com.taobao.tao.rate.ui.videodetail;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.litecreator.localization.a;
import com.taobao.android.nav.Nav;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.rate.common.helper.b;
import com.taobao.taobao.R;
import tb.kge;
import tb.tmw;

/* loaded from: classes8.dex */
public class VideoDetailActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1615604660);
    }

    public static /* synthetic */ Object ipc$super(VideoDetailActivity videoDetailActivity, String str, Object... objArr) {
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
        j.b(context);
    }

    public VideoDetailActivity() {
        ApplicationInvoker.getInstance("com.taobao.trade.rate").invoke("com.taobao.tao.rate.RateApplication", TaobaoApplication.sApplication);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        tmw.a(getClass().getName());
        if (getIntent() != null && getIntent().getData() != null && !TextUtils.isEmpty(getIntent().getData().getQueryParameter("rateId"))) {
            Nav from = Nav.from(this);
            from.toUri(b.RATE_DETAIL_V2_PAGE_URL + getIntent().getData().getQueryParameter("rateId"));
        } else {
            com.taobao.tao.rate.kit.engine.b.a(this, a.a(R.string.rate_request_parameters_error));
        }
        finish();
    }
}
