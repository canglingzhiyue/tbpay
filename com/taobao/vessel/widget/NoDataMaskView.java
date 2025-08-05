package com.taobao.vessel.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import tb.kge;

/* loaded from: classes9.dex */
public class NoDataMaskView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CustomProgressBar mProgressBar;
    private TextView mTextViewErrorTips;

    static {
        kge.a(-1630313023);
    }

    public static /* synthetic */ Object ipc$super(NoDataMaskView noDataMaskView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public NoDataMaskView(Context context) {
        this(context, null);
    }

    public NoDataMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoDataMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void loadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9c7b2", new Object[]{this});
            return;
        }
        View inflate = View.inflate(getContext(), R.layout.mask_view_no_data, this);
        if (inflate == null) {
            return;
        }
        this.mProgressBar = (CustomProgressBar) inflate.findViewById(R.id.mask_view_no_data_progressbar);
        this.mTextViewErrorTips = (TextView) inflate.findViewById(R.id.mask_view_no_data_error_tips);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            loadView();
        }
    }

    public void startLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9591a01", new Object[]{this});
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        CustomProgressBar customProgressBar = this.mProgressBar;
        if (customProgressBar != null) {
            customProgressBar.startLoadingAnimaton();
        }
        setErrorTextVisible(false, null);
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        setProgressBarVisible(false);
        setErrorTextVisible(true, "");
        setVisibility(8);
    }

    public void setProgressBarVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eea94ff", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.mProgressBar.startLoadingAnimaton();
        } else {
            this.mProgressBar.stopLoadingAnimation();
        }
        this.mProgressBar.isInitShow(z);
    }

    public void setErrorTextVisible(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13128f8", new Object[]{this, new Boolean(z), str});
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        if (z) {
            if (TextUtils.isEmpty(str)) {
                str = getResources().getString(R.string.error_network_retry);
            }
            this.mTextViewErrorTips.setText(str);
            this.mTextViewErrorTips.setVisibility(0);
            return;
        }
        this.mTextViewErrorTips.setVisibility(8);
    }

    public boolean isRetry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a275529", new Object[]{this})).booleanValue() : this.mTextViewErrorTips.getVisibility() == 0;
    }
}
