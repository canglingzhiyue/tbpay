package com.alibaba.aliweex.adapter.module;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.aliweex.AliWXSDKInstance;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.b;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.kge;

/* loaded from: classes2.dex */
public class WXLocationModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(758057620);
    }

    public static /* synthetic */ Object ipc$super(WXLocationModule wXLocationModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @JSMethod
    public void reload(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282e99ad", new Object[]{this, bool});
            return;
        }
        Context O = this.mWXSDKInstance.O();
        if (O == null) {
            return;
        }
        WeexPageFragment findWeexPageFragment = findWeexPageFragment();
        if (findWeexPageFragment != null) {
            findWeexPageFragment.reload();
        } else if (!(O instanceof a)) {
        } else {
            bool.booleanValue();
        }
    }

    @JSMethod
    public void replace(String str) {
        WeexPageFragment findWeexPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea862e45", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || this.mWXSDKInstance.O() == null || (findWeexPageFragment = findWeexPageFragment()) == null) {
        } else {
            replace(findWeexPageFragment, str);
        }
    }

    public WeexPageFragment findWeexPageFragment() {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("2628ad35", new Object[]{this});
        }
        Context O = this.mWXSDKInstance.O();
        String str = WeexPageFragment.FRAGMENT_TAG;
        if (this.mWXSDKInstance instanceof AliWXSDKInstance) {
            String a2 = ((AliWXSDKInstance) this.mWXSDKInstance).a();
            if (!StringUtils.isEmpty(a2)) {
                str = a2;
            }
        }
        if ((O instanceof FragmentActivity) && (findFragmentByTag = ((FragmentActivity) O).getSupportFragmentManager().findFragmentByTag(str)) != null && (findFragmentByTag instanceof WeexPageFragment)) {
            return (WeexPageFragment) findFragmentByTag;
        }
        return null;
    }

    private void replace(WeexPageFragment weexPageFragment, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ffbcb4", new Object[]{this, weexPageFragment, str});
            return;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter(b.WX_TPL);
        if (!StringUtils.isEmpty(queryParameter)) {
            str2 = queryParameter;
        } else {
            str2 = "true".equals(parse.getQueryParameter("wh_weex")) ? str : "";
        }
        if (StringUtils.isEmpty(str2) || weexPageFragment == null) {
            return;
        }
        weexPageFragment.replace(str, str2);
    }
}
