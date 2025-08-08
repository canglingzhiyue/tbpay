package com.taobao.tao.detail.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.dwc;
import tb.ebx;
import tb.ewn;
import tb.ezw;
import tb.fgo;
import tb.kge;

/* loaded from: classes8.dex */
public class DetailActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_Detail";
    public static final String TAG = "DetailActivity";

    /* renamed from: a  reason: collision with root package name */
    public ebx f19906a;

    static {
        kge.a(-292925598);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(DetailActivity detailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return null;
    }

    public DetailActivity() {
        f.a("com.taobao.android.detail", "com.taobao.tao.detail.activity.DetailActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
    }

    public void a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a729a6a", new Object[]{this, context, str, bundle});
        } else if (context == null || StringUtils.isEmpty(str)) {
        } else {
            if (bundle == null) {
                Nav.from(context).toUri(str);
            } else {
                Nav.from(context).withExtras(bundle).toUri(str);
            }
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("myBrowserUrl", str2);
        bundle.putString("ItemIdForceH5", str);
        a(this, str2, bundle);
        overridePendingTransition(R.anim.detail_h5_fade_in, R.anim.detail_h5_fade_out);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(null);
        this.f19906a = new ebx().a(this);
        if (b()) {
            String str = OrangeConfig.getInstance().getConfig("android_detail", fgo.FORCE_USE_H5_RENDER_DOMAIN, "https://main.m.taobao.com/detail/index.html") + "?id=" + this.f19906a.f27180a + "&hybrid=true";
            i.d("forceUseH5RenderTCloud90017", "url=" + str);
            a(this.f19906a.f27180a, str);
            finish();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.f19906a.f27180a);
        ewn.a(hashMap);
        this.f19906a.a(ezw.a(getApplicationContext()));
        Log.e(TAG, "itemId " + this.f19906a.f27180a);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        try {
            super.onResume();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        dwc.b(this);
        dwc.a(this);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        dwc.b(this);
        super.finish();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        dwc.b(this);
        super.onDestroy();
    }
}
