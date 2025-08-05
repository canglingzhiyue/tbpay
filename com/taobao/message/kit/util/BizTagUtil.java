package com.taobao.message.kit.util;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class BizTagUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public interface BizTag {
        int bizId();

        String bizName();

        String dxSubBizType();
    }

    static {
        kge.a(-2133850846);
    }

    public static BizTag getBizTag(Context context) {
        FragmentManager supportFragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizTag) ipChange.ipc$dispatch("e74ad22c", new Object[]{context});
        }
        if (context instanceof BizTag) {
            return (BizTag) context;
        }
        if (!(context instanceof FragmentActivity) || (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) == null) {
            return null;
        }
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            if (fragment instanceof BizTag) {
                return (BizTag) fragment;
            }
        }
        return null;
    }
}
