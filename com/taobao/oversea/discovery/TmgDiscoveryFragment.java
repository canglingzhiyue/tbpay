package com.taobao.oversea.discovery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.ui.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBBaseFragment;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.bhc;
import tb.bhd;
import tb.iqr;
import tb.ndl;

/* loaded from: classes7.dex */
public class TmgDiscoveryFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView errorImg;
    private Fragment featureFragment;
    private LinearLayout pageError;
    private Button refreshBtn = null;
    private View rootView;

    public static /* synthetic */ Object ipc$super(TmgDiscoveryFragment tmgDiscoveryFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Button access$000(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("d419aa46", new Object[]{tmgDiscoveryFragment}) : tmgDiscoveryFragment.refreshBtn;
    }

    public static /* synthetic */ void access$100(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a089fd71", new Object[]{tmgDiscoveryFragment});
        } else {
            tmgDiscoveryFragment.requestInstallFeature();
        }
    }

    public static /* synthetic */ LinearLayout access$200(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("5d7d8de7", new Object[]{tmgDiscoveryFragment}) : tmgDiscoveryFragment.pageError;
    }

    public static /* synthetic */ Fragment access$300(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("8b83911", new Object[]{tmgDiscoveryFragment}) : tmgDiscoveryFragment.featureFragment;
    }

    public static /* synthetic */ Fragment access$302(TmgDiscoveryFragment tmgDiscoveryFragment, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("a9cd1647", new Object[]{tmgDiscoveryFragment, fragment});
        }
        tmgDiscoveryFragment.featureFragment = fragment;
        return fragment;
    }

    public static /* synthetic */ View access$400(TmgDiscoveryFragment tmgDiscoveryFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("89de0390", new Object[]{tmgDiscoveryFragment}) : tmgDiscoveryFragment.rootView;
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.rootView == null) {
            this.rootView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_tmg_discovery, viewGroup, false);
            this.pageError = (LinearLayout) this.rootView.findViewById(R.id.page_error);
            this.errorImg = (TUrlImageView) this.rootView.findViewById(R.id.tips_icon);
            this.refreshBtn = (Button) this.rootView.findViewById(R.id.refresh_btn);
        }
        if (iqr.a()) {
            if (this.featureFragment == null) {
                this.featureFragment = Fragment.instantiate(getActivity(), "com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment", null);
            }
            LinearLayout linearLayout = this.pageError;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (!this.featureFragment.isAdded()) {
                getChildFragmentManager().beginTransaction().add(this.rootView.getId(), this.featureFragment).commit();
            }
        } else {
            requestInstallFeature();
            if (this.pageError == null) {
                TUrlImageView tUrlImageView = this.errorImg;
                if (tUrlImageView != null) {
                    tUrlImageView.setImageUrl(ndl.URL_ERROR_TIPS);
                }
                this.pageError.setVisibility(0);
                this.refreshBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.oversea.discovery.TmgDiscoveryFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        TmgDiscoveryFragment.access$000(TmgDiscoveryFragment.this).setEnabled(false);
                        TmgDiscoveryFragment.access$100(TmgDiscoveryFragment.this);
                    }
                });
            }
        }
        return this.rootView;
    }

    private void requestInstallFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0de0d1", new Object[]{this});
        } else {
            h.a(getActivity()).a(j.a().a(new a(getActivity())).a(true).a(bhd.a(getActivity(), "com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment").a(new bhc.b<Fragment>() { // from class: com.taobao.oversea.discovery.TmgDiscoveryFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("80cf6b4a", new Object[]{this, fragment, bundle});
                        return;
                    }
                    if (TmgDiscoveryFragment.access$200(TmgDiscoveryFragment.this) != null) {
                        TmgDiscoveryFragment.access$200(TmgDiscoveryFragment.this).setVisibility(8);
                    }
                    if (TmgDiscoveryFragment.access$000(TmgDiscoveryFragment.this) != null) {
                        TmgDiscoveryFragment.access$000(TmgDiscoveryFragment.this).setEnabled(true);
                    }
                    TmgDiscoveryFragment.access$302(TmgDiscoveryFragment.this, fragment);
                    TmgDiscoveryFragment tmgDiscoveryFragment = TmgDiscoveryFragment.this;
                    TmgDiscoveryFragment.access$302(tmgDiscoveryFragment, Fragment.instantiate(tmgDiscoveryFragment.getActivity(), "com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment", null));
                    if (TmgDiscoveryFragment.access$300(TmgDiscoveryFragment.this).isAdded()) {
                        return;
                    }
                    TmgDiscoveryFragment.this.getChildFragmentManager().beginTransaction().add(TmgDiscoveryFragment.access$400(TmgDiscoveryFragment.this).getId(), TmgDiscoveryFragment.access$300(TmgDiscoveryFragment.this)).commit();
                }

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                        return;
                    }
                    if (TmgDiscoveryFragment.access$200(TmgDiscoveryFragment.this) != null) {
                        TmgDiscoveryFragment.access$200(TmgDiscoveryFragment.this).setVisibility(0);
                    }
                    if (TmgDiscoveryFragment.access$000(TmgDiscoveryFragment.this) == null) {
                        return;
                    }
                    TmgDiscoveryFragment.access$000(TmgDiscoveryFragment.this).setEnabled(true);
                }
            }).a()).a());
        }
    }
}
