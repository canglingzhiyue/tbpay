package com.taobao.android.detail.wrapper.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import tb.emu;
import tb.feh;
import tb.kge;

/* loaded from: classes5.dex */
public class DetailFloatActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE = "0";
    public static final String ERROR_MSG = "params error!";
    public static final String TAG = "DetailFloatActivity";
    public static final String URI = "http://item.taobao.com/detail/float.htm";

    /* renamed from: a  reason: collision with root package name */
    private String f11099a;
    private String b;

    static {
        kge.a(1262916577);
    }

    public static /* synthetic */ Object ipc$super(DetailFloatActivity detailFloatActivity, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.activity.DetailFloatActivity");
        setTheme(16973840);
        super.onCreate(bundle);
        com.taobao.android.detail.wrapper.ext.uikit.b.c(getIntent());
        this.f11099a = com.taobao.android.detail.wrapper.ext.uikit.b.a(getIntent());
        this.b = com.taobao.android.detail.wrapper.ext.uikit.b.b(getIntent());
        if (!com.taobao.android.detail.wrapper.ext.uikit.b.a(this.f11099a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("type is invalid ");
            sb.append(TextUtils.isEmpty(this.f11099a) ? "null" : this.f11099a);
            a(sb.toString());
        } else if (com.taobao.android.detail.wrapper.ext.uikit.b.a(this, getIntent())) {
            finish();
        } else {
            setContentView(R.layout.x_detail_float_activity);
            com.taobao.tao.purchase.inject.c.a("DetailFloat", feh.class);
            if (new a().a(this.f11099a, this)) {
                return;
            }
            a(null);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            i.a(TAG, str);
        }
        if (!TextUtils.isEmpty(this.b)) {
            com.taobao.android.msoa.c.a().b(this.b, "0", ERROR_MSG, null);
        }
        finish();
    }
}
