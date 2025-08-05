package com.taobao.android.detail.wrapper.activity;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.ext.windvane.msoa.FloatH5Fragment;
import com.taobao.taobao.R;
import tb.dyx;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f11102a;
    private String b = "mtop.macao.market.activity.applycoupon.querycouponsfordetail";

    public a() {
        emu.a("com.taobao.android.detail.wrapper.activity.FloatDispatcher");
    }

    static {
        kge.a(-1942432566);
        f11102a = a.class.getSimpleName();
    }

    public boolean a(String str, DetailFloatActivity detailFloatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b0cbf64", new Object[]{this, str, detailFloatActivity})).booleanValue();
        }
        if (dyx.f27124a.equals(str)) {
            return b(detailFloatActivity);
        }
        if (!dyx.b.equals(str)) {
            return false;
        }
        return a(detailFloatActivity);
    }

    private boolean a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("831e55bf", new Object[]{this, fragmentActivity})).booleanValue();
        }
        String queryParameter = fragmentActivity.getIntent().getData().getQueryParameter(com.taobao.android.detail.wrapper.ext.uikit.b.e);
        if (TextUtils.isEmpty(queryParameter)) {
            i.a(f11102a, "target Url is empty");
            return false;
        }
        FloatH5Fragment newDialogInstance = FloatH5Fragment.newDialogInstance(fragmentActivity);
        newDialogInstance.init(queryParameter);
        try {
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fl_detail_float_fragment, newDialogInstance, "pageFloat").commitAllowingStateLoss();
            return true;
        } catch (IllegalStateException unused) {
            i.a(f11102a, "add fragment exception");
            return false;
        }
    }

    private boolean b(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c95e35e", new Object[]{this, fragmentActivity})).booleanValue();
        }
        Uri data = fragmentActivity.getIntent().getData();
        String queryParameter = data.getQueryParameter(com.taobao.android.detail.wrapper.ext.uikit.b.f);
        if (TextUtils.isEmpty(queryParameter)) {
            i.a(f11102a, "itemId is null");
            return false;
        }
        String queryParameter2 = data.getQueryParameter(com.taobao.android.detail.wrapper.ext.uikit.b.g);
        if (TextUtils.isEmpty(queryParameter2)) {
            i.a(f11102a, "sellerId is null");
            return false;
        }
        String queryParameter3 = data.getQueryParameter(com.taobao.android.detail.wrapper.ext.uikit.b.h);
        if (TextUtils.isEmpty(queryParameter3)) {
            i.a(f11102a, "sellerType is null");
            return false;
        }
        try {
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fl_detail_float_fragment, CouponInfoFragment.getFragment(this.b, queryParameter2, queryParameter, queryParameter3), "pageFloat").commitAllowingStateLoss();
            return true;
        } catch (IllegalStateException unused) {
            i.a(f11102a, "add fragment exception");
            return false;
        }
    }
}
