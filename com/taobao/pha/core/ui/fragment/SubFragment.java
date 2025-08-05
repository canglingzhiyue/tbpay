package com.taobao.pha.core.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;
import tb.ngr;

/* loaded from: classes7.dex */
public class SubFragment extends PHABaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private ViewGroup mRootView;
    public FrameLayout mSubContainer;

    public static /* synthetic */ Object ipc$super(SubFragment subFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1126882532) {
            if (hashCode != 462397159) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDestroyView();
            return null;
        }
        return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
    }

    static {
        kge.a(-68639083);
        TAG = SubFragment.class.getSimpleName();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        this.mSubContainer = null;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mRootView == null) {
            Context context = getContext();
            if (context == null) {
                ngr.b(TAG, "SubFragment onCreateView failed.");
                return super.onCreateView(layoutInflater, viewGroup, bundle);
            }
            this.mRootView = new FrameLayout(context);
            this.mSubContainer = new FrameLayout(context);
            this.mSubContainer.setId(R.id.pha_sub_container);
            this.mRootView.addView(this.mSubContainer, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.mRootView;
    }
}
