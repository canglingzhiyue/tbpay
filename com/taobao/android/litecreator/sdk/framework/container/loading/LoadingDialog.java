package com.taobao.android.litecreator.sdk.framework.container.loading;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.b;
import com.taobao.android.litecreator.util.u;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class LoadingDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LoadingDialog";
    private LottieAnimationView lottieView;
    private ImageView mCloseBtn;
    private FrameLayout mContainer;
    private TextView mMessageView;
    private ProgressBar mPbLoading;
    private b mConfig = b.f13450a;
    private b.InterfaceC0519b mCallback = null;

    static {
        kge.a(-706250951);
    }

    public static /* synthetic */ Object ipc$super(LoadingDialog loadingDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1639966335) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show((FragmentManager) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ b.InterfaceC0519b access$000(LoadingDialog loadingDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.InterfaceC0519b) ipChange.ipc$dispatch("d2cd9fa3", new Object[]{loadingDialog}) : loadingDialog.mCallback;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.CommonProgress);
        setCancelable(this.mConfig.c());
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().getWindow().requestFeature(1);
        getDialog().setCanceledOnTouchOutside(false);
        View inflate = layoutInflater.inflate(R.layout.layout_common_loading_dialog, viewGroup, false);
        this.mContainer = (FrameLayout) inflate.findViewById(R.id.loadingView);
        this.mMessageView = (TextView) inflate.findViewById(R.id.message);
        this.mMessageView.setText(this.mConfig.a());
        this.mCloseBtn = (ImageView) inflate.findViewById(R.id.right_close);
        this.mPbLoading = (ProgressBar) inflate.findViewById(R.id.pb_loading);
        this.lottieView = (LottieAnimationView) inflate.findViewById(R.id.lottie_loading);
        this.mCloseBtn.setVisibility(this.mConfig.d() ? 0 : 8);
        this.mCloseBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.loading.LoadingDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                LoadingDialog.this.dismissAllowingStateLoss();
                if (LoadingDialog.access$000(LoadingDialog.this) == null) {
                    return;
                }
                LoadingDialog.access$000(LoadingDialog.this).a();
            }
        });
        if (this.mConfig.f() != 0) {
            this.mContainer.setBackgroundResource(this.mConfig.f());
        }
        if (this.mConfig.e()) {
            this.mPbLoading.setVisibility(0);
            this.lottieView.setVisibility(8);
        } else {
            this.mPbLoading.setVisibility(8);
            this.lottieView.setVisibility(0);
            try {
                this.lottieView.setAnimation("xgc_lottie_point_loading.json");
                this.lottieView.loop(true);
                this.lottieView.playAnimation();
            } catch (OutOfMemoryError e) {
                u.d(TAG, e.getMessage());
            }
        }
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (getDialog() == null || getContext() == null) {
            return;
        }
        if (getDialog().getWindow() != null) {
            getDialog().getWindow().setLayout(-2, -2);
        }
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = this.mConfig.b();
        window.setAttributes(attributes);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(-16777216);
        }
        getDialog().setCancelable(this.mConfig.c());
        getDialog().setCanceledOnTouchOutside(this.mConfig.c());
    }

    public void setConfig(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4641203", new Object[]{this, bVar});
        } else {
            this.mConfig = bVar;
        }
    }

    public void setCallback(b.InterfaceC0519b interfaceC0519b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62132348", new Object[]{this, interfaceC0519b});
        } else {
            this.mCallback = interfaceC0519b;
        }
    }

    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.mMessageView;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bfe67f", new Object[]{this, fragmentManager, str});
            return;
        }
        try {
            if (isAdded()) {
                return;
            }
            super.show(fragmentManager, str);
        } catch (Exception e) {
            u.d(TAG, e.getMessage());
        }
    }
}
