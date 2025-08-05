package com.alibaba.android.ultron.vfw.web;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import tb.kge;

/* loaded from: classes2.dex */
public class WebMaskView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebMaskView";
    private RelativeLayout mRlErrView;
    private RelativeLayout mRlLoading;
    private TextView mTextViewRefresh;
    private VesselView mVesselView;
    private String mWebUrl;

    static {
        kge.a(497021032);
    }

    public static /* synthetic */ Object ipc$super(WebMaskView webMaskView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ VesselView access$000(WebMaskView webMaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("211d2666", new Object[]{webMaskView}) : webMaskView.mVesselView;
    }

    public static /* synthetic */ String access$100(WebMaskView webMaskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59bfac81", new Object[]{webMaskView}) : webMaskView.mWebUrl;
    }

    public VesselView getVesselView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("f7a8d76c", new Object[]{this}) : this.mVesselView;
    }

    public WebMaskView(VesselView vesselView, String str) {
        super(vesselView.getContext());
        init();
        this.mWebUrl = str;
        this.mVesselView = vesselView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setTag("WebMaskView");
        this.mVesselView.addView(this);
    }

    private void loadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9c7b2", new Object[]{this});
            return;
        }
        View inflate = View.inflate(getContext(), R.layout.ultron_mask_view_state, this);
        if (inflate == null) {
            return;
        }
        this.mRlLoading = (RelativeLayout) inflate.findViewById(R.id.rl_loading);
        this.mRlErrView = (RelativeLayout) inflate.findViewById(R.id.rl_err);
        this.mTextViewRefresh = (TextView) inflate.findViewById(R.id.mask_view_refresh);
        this.mTextViewRefresh.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.vfw.web.WebMaskView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (WebMaskView.access$000(WebMaskView.this) == null) {
                } else {
                    WebMaskView.access$000(WebMaskView.this).loadUrl(WebMaskView.access$100(WebMaskView.this));
                }
            }
        });
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
        RelativeLayout relativeLayout = this.mRlLoading;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        setErrorTextVisible(false);
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        setProgressBarVisible(true);
        setErrorTextVisible(false);
        setVisibility(8);
    }

    public void setProgressBarVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eea94ff", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mRlLoading.setVisibility(0);
        } else {
            this.mRlLoading.setVisibility(8);
        }
    }

    public void setErrorTextVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a850eae", new Object[]{this, new Boolean(z)});
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        if (z) {
            setProgressBarVisible(false);
            this.mRlErrView.setVisibility(0);
            return;
        }
        this.mRlErrView.setVisibility(8);
    }

    public boolean isRetry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a275529", new Object[]{this})).booleanValue() : this.mRlErrView.getVisibility() == 0;
    }
}
