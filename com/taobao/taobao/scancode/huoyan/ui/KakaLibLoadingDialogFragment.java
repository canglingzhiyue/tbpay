package com.taobao.taobao.scancode.huoyan.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes8.dex */
public class KakaLibLoadingDialogFragment extends KaDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-281048958);
    }

    public static KakaLibLoadingDialogFragment newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibLoadingDialogFragment) ipChange.ipc$dispatch("ae777fcb", new Object[0]);
        }
        KakaLibLoadingDialogFragment kakaLibLoadingDialogFragment = new KakaLibLoadingDialogFragment();
        kakaLibLoadingDialogFragment.setArguments(new Bundle());
        return kakaLibLoadingDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.kakalib_loading_progress, viewGroup, false);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.loadingImageView);
        tUrlImageView.setSkipAutoSize(true);
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01i7c9kO27C8CVPSGi0_!!6000000007760-54-tps-748-808.apng");
        return inflate;
    }
}
