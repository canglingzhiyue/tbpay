package com.taobao.android.layoutmanager.adapter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import tb.kge;
import tb.ohg;

/* loaded from: classes5.dex */
public class i implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1817535488);
        kge.a(-1529527041);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.f
    public Object a(String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        String str3 = null;
        if (obj != null) {
            str3 = obj.toString();
        }
        int indexOf = str.indexOf(".");
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        } else {
            str2 = "tnode";
        }
        return ohg.a().a(str2, str, str3);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.f
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : ABGlobal.isFeatureOpened(ab.a(), str);
    }
}
