package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class h implements ViewModelProvider.Factory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-267973750);
        kge.a(1010987197);
    }

    @Override // android.arch.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c77fad85", new Object[]{this, cls});
        }
        if (cls != UltronInstanceViewModel.class) {
            return null;
        }
        return new UltronInstanceViewModel();
    }
}
