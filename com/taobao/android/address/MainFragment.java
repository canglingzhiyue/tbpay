package com.taobao.android.address;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class MainFragment extends WeexPageFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeexPopContainer mAttachedActivity;
    public View mRootView;

    public static /* synthetic */ Object ipc$super(MainFragment mainFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1589549411) {
            super.onAttach((Context) objArr[0]);
            return null;
        } else if (hashCode != -1126882532) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
        }
    }

    @Override // com.alibaba.aliweex.bundle.WeexPageFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mAttachedActivity = (WeexPopContainer) getActivity();
        this.mRootView = onCreateView;
        return onCreateView;
    }

    @Override // com.alibaba.aliweex.bundle.WeexPageFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        setProgressBarView(new d());
        super.onAttach(context);
    }
}
