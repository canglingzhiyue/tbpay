package com.taobao.live.home.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.business.BaseListRequest;

/* loaded from: classes7.dex */
public abstract class BaseLiveRecyclerFragment extends UTAnalyzeFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity mActivity;
    private View mChild;
    public ViewGroup mContainer;
    private boolean mIsCreated = false;
    private boolean mIsVisibleToUser = false;
    public com.taobao.live.home.business.a mListBusiness;

    public static /* synthetic */ Object ipc$super(BaseLiveRecyclerFragment baseLiveRecyclerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract int getLayoutId();

    public abstract void lazyInitView(View view);

    public abstract void lazyLoadData();

    public abstract com.taobao.live.home.business.a onBusinessCreate(Bundle bundle, BaseListRequest baseListRequest);

    public abstract BaseListRequest onRequestCreate(Bundle bundle);

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        this.mActivity = (Activity) context;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mContainer == null) {
            this.mContainer = new FrameLayout(layoutInflater.getContext());
            this.mContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.mIsCreated = true;
        }
        return this.mContainer;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        lazyLoad();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        this.mContainer = null;
        this.mChild = null;
        this.mActivity = null;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mIsCreated = false;
        this.mIsVisibleToUser = false;
        com.taobao.live.home.business.a aVar = this.mListBusiness;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment, android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        this.mIsVisibleToUser = z;
        lazyLoad();
    }

    public void lazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbaa01", new Object[]{this});
        } else if (!this.mIsVisibleToUser || !this.mIsCreated) {
        } else {
            if (this.mContainer != null && this.mChild == null && getLayoutId() != -1) {
                this.mChild = LayoutInflater.from(getContext()).inflate(getLayoutId(), this.mContainer, false);
                this.mContainer.addView(this.mChild, new ViewGroup.LayoutParams(-1, -1));
                lazyInitView(this.mContainer);
            }
            if (this.mListBusiness == null) {
                this.mListBusiness = onBusinessCreate(getArguments(), onRequestCreate(getArguments()));
            }
            lazyLoadData();
        }
    }

    public View findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        ViewGroup viewGroup = this.mContainer;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.findViewById(i);
    }
}
