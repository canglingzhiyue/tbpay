package com.taobao.tao.tbmainfragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBMainLog;
import tb.kge;
import tb.omh;

/* loaded from: classes8.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FRAGMENT = "useFragment";
    public static final String KEY_FRAGMENT_INTENT = "originActivityIntent";
    public static final String KEY_FRAGMENT_IS_FRAGMENT_MODEL = "isFragmentModel";
    public static final String KEY_FRAGMENT_NAV_START_TIME = "NAV_TO_URL_START_TIME";
    public static final String KEY_FRAGMENT_START_TIME = "NAV_START_FRAGMENT_TIME";
    public static final String KEY_FRAGMENT_URL = "originActivityUrl";
    public static final String KEY_SET_CLASS_LOADER = "TBMainSetClassLoader";

    static {
        kge.a(-1770530016);
    }

    public static boolean a(SupportActivity supportActivity, Intent intent, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6c568fe", new Object[]{supportActivity, intent, str, bundle})).booleanValue();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("originActivityIntent", intent);
        Uri data = intent.getData();
        if (data != null) {
            bundle2.putParcelable(KEY_FRAGMENT_URL, data);
        }
        bundle2.putLong("NAV_TO_URL_START_TIME", intent.getLongExtra("NAV_TO_URL_START_TIME", 0L));
        bundle2.putLong(KEY_FRAGMENT_START_TIME, System.currentTimeMillis());
        bundle2.putBoolean(KEY_FRAGMENT_IS_FRAGMENT_MODEL, true);
        if (bundle != null) {
            bundle2.putBundle(i.KEY_FRAGMENT_ARGS, bundle);
        }
        Fragment fragment = null;
        try {
            fragment = Fragment.instantiate(supportActivity, str, bundle2);
        } catch (Throwable unused) {
            TBMainLog.tlog("FragmentNavDelegate", "fragment instantiate failed , fragment name is " + str);
            omh.a("fragment_nav_error", "fragment_instantiate_error_" + str);
        }
        if (fragment == null) {
            return false;
        }
        Intent intent2 = supportActivity.getIntent();
        if (intent2 != null) {
            TBMainLog.tlog("FragmentNavDelegate", "activity intent setData to " + data);
            intent2.setData(data);
        }
        supportActivity.start((ISupportFragment) fragment);
        TBMainLog.tlog("FragmentNavDelegate", "intercept by fragment processor and nav successed, fragment name is " + str);
        return true;
    }
}
