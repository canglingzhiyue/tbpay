package com.taobao.android.detail.wrapper.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.fragment.FloatFragment;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes5.dex */
public class SizingChartFloatFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_URL = "imageUrl";
    private static String url;

    static {
        kge.a(-139440188);
    }

    public static /* synthetic */ Object ipc$super(SizingChartFloatFragment sizingChartFloatFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1860817453) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public SizingChartFloatFragment() {
        emu.a("com.taobao.android.detail.wrapper.fragment.SizingChartFloatFragment");
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8cd8fe", new Object[]{fragmentActivity, str, str2});
        } else if (fragmentActivity == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            startFragment(fragmentActivity, newInstance(str, str2));
        }
    }

    public static SizingChartFloatFragment newInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SizingChartFloatFragment) ipChange.ipc$dispatch("4bcde15d", new Object[]{str, str2});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        bundle.putString("imageUrl", str2);
        SizingChartFloatFragment sizingChartFloatFragment = new SizingChartFloatFragment();
        sizingChartFloatFragment.setArguments(bundle);
        return sizingChartFloatFragment;
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        url = arguments.getString("imageUrl", "");
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.rlPanel.removeView(this.lvData);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, R.id.tv_title);
        layoutParams.addRule(2, R.id.tv_close);
        DetailImageView detailImageView = new DetailImageView(this.context);
        this.rlPanel.addView(detailImageView, layoutParams);
        this.rlPanel.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.fragment.SizingChartFloatFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                }
            }
        });
        epj.b().a(url, detailImageView);
    }
}
