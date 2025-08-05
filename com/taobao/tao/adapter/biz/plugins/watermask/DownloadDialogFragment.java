package com.taobao.tao.adapter.biz.plugins.watermask;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.adapter.biz.plugins.watermask.view.CircleProgressBar;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class DownloadDialogFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View.OnClickListener mOnCancelListener;
    private CircleProgressBar mPB;
    private int mProgress;
    private String mProgressText;
    private TextView mTvProgress;

    static {
        kge.a(653859799);
    }

    public static /* synthetic */ Object ipc$super(DownloadDialogFragment downloadDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 937454072:
                super.dismissAllowingStateLoss();
                return null;
            case 1639966335:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
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
        setCancelable(false);
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bfe67f", new Object[]{this, fragmentManager, str});
            return;
        }
        fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
        super.show(fragmentManager, str);
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismissAllowingStateLoss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e069f8", new Object[]{this});
        } else if (getFragmentManager() == null) {
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().getWindow().requestFeature(1);
        getDialog().setCanceledOnTouchOutside(false);
        View inflate = layoutInflater.inflate(R.layout.layout_video_download_dialog, viewGroup, false);
        bindView(inflate);
        return inflate;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.8f;
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        window.setAttributes(attributes);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        window.setNavigationBarColor(-16777216);
    }

    private void bindView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817b6229", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.btn_cancel);
        this.mTvProgress = (TextView) view.findViewById(R.id.tv_trans_hint);
        this.mPB = (CircleProgressBar) view.findViewById(R.id.pb_transing_progress);
        findViewById.setOnClickListener(this.mOnCancelListener);
        this.mTvProgress.setText(this.mProgressText);
        this.mPB.setProgress(this.mProgress);
    }

    public void updateProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
            return;
        }
        CircleProgressBar circleProgressBar = this.mPB;
        if (circleProgressBar != null) {
            circleProgressBar.setProgress(i);
        } else {
            this.mProgress = i;
        }
    }

    public void updateProgressText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1dbc2b4", new Object[]{this, str});
            return;
        }
        TextView textView = this.mTvProgress;
        if (textView != null) {
            textView.setText(str);
        } else {
            this.mProgressText = str;
        }
    }

    public void setOnCancelListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34501e3", new Object[]{this, onClickListener});
        } else {
            this.mOnCancelListener = onClickListener;
        }
    }
}
