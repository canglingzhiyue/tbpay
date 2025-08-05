package com.taobao.android.detail.wrapper.ext.windvane.msoa;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.fragment.FloatFragment;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.taobao.R;
import com.uc.webview.export.WebView;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class FloatH5Fragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mDialogView;
    private String mTargetUrl;
    private WVUCWebView mWebView;
    private View vClose;
    private View vTop;

    static {
        kge.a(-2037305998);
    }

    public static /* synthetic */ Object ipc$super(FloatH5Fragment floatH5Fragment, String str, Object... objArr) {
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

    public FloatH5Fragment() {
        emu.a("com.taobao.android.detail.wrapper.ext.windvane.msoa.FloatH5Fragment");
    }

    public static FloatH5Fragment newDialogInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatH5Fragment) ipChange.ipc$dispatch("b0268a83", new Object[]{context});
        }
        FloatH5Fragment floatH5Fragment = new FloatH5Fragment();
        floatH5Fragment.mDialogView = LayoutInflater.from(context).inflate(R.layout.x_detail_float_h5_fragment, (ViewGroup) null, false);
        return floatH5Fragment;
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View view = this.mDialogView;
        if (view != null) {
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.mDialogView);
            }
            return this.mDialogView;
        }
        return layoutInflater.inflate(R.layout.x_detail_float_h5_fragment, viewGroup, false);
    }

    public void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
        } else {
            this.mTargetUrl = str;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            this.mWebView = (WVUCWebView) view2.findViewById(R.id.float_page_content);
            this.vClose = view2.findViewById(R.id.tv_close);
            this.vTop = view2.findViewById(R.id.tm_detail_background);
        }
        this.mWebView.loadUrl(this.mTargetUrl);
        this.vClose.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.windvane.msoa.FloatH5Fragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    return;
                }
                FragmentActivity activity = FloatH5Fragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                activity.finish();
            }
        });
        this.vTop.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.windvane.msoa.FloatH5Fragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    return;
                }
                FragmentActivity activity = FloatH5Fragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                activity.finish();
            }
        });
        if (!(this.context instanceof DetailActivity)) {
            return;
        }
        ((DetailActivity) this.context).a((WebView) this.mWebView);
    }
}
