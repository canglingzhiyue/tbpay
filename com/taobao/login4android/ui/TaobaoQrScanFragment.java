package com.taobao.login4android.ui;

import android.text.TextUtils;
import android.view.View;
import com.ali.user.mobile.scan.model.CommonScanResponse;
import com.ali.user.mobile.scan.model.CommonScanResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.scan.QrScanFragment;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoQrScanFragment extends QrScanFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXPIRED = 14042;

    static {
        kge.a(1780020473);
    }

    @Override // com.taobao.login4android.scan.QrScanFragment
    public boolean handleIntercept(CommonScanResponse commonScanResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b13bceb", new Object[]{this, commonScanResponse})).booleanValue();
        }
        if (commonScanResponse == null || commonScanResponse.code != 14042) {
            return false;
        }
        if (this.mHintImageView != null) {
            this.mHintImageView.setImageResource(R.drawable.aliuser_scancode_error);
        }
        if (this.mConfirmButton != null) {
            this.mConfirmButton.setText(R.string.aliuser_scan_try_again);
            this.mConfirmButton.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoQrScanFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (TaobaoQrScanFragment.this.getActivity() == null) {
                    } else {
                        TaobaoQrScanFragment.this.getActivity().finish();
                    }
                }
            });
        }
        if (commonScanResponse.returnValue != 0) {
            String str = ((CommonScanResult) commonScanResponse.returnValue).titleMsg;
            String str2 = ((CommonScanResult) commonScanResponse.returnValue).subTitleMsg;
            this.mConfirmMsg = ((CommonScanResult) commonScanResponse.returnValue).confirmMsg;
            if (!TextUtils.isEmpty(str) && this.mScanTitleTextView != null) {
                this.mScanTitleTextView.setText(str);
            }
            if (!TextUtils.isEmpty(str2) && this.mScanSubTitleView != null) {
                this.mScanSubTitleView.setText(str2);
            }
        } else {
            if (this.mScanTitleTextView != null) {
                this.mScanTitleTextView.setText(R.string.aliuser_scan_invalid_token);
            }
            if (this.mScanSubTitleView != null) {
                this.mScanSubTitleView.setText(R.string.aliuser_scan_invalid_token_hint);
            }
        }
        if (this.mScanSubTitleView != null) {
            this.mScanSubTitleView.setTextColor(this.mAttachedActivity.getResources().getColor(getSubTitleTextColor(true)));
        }
        return true;
    }
}
