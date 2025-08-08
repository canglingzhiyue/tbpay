package com.taobao.login4android.ui;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class AliUserBindMobileDialog extends TaobaoRegProtocolDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1629750643);
    }

    @Override // com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_bind_mobile_dialog;
    }

    @Override // com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.aliuser_dialog_logo);
        if (imageView == null) {
            return;
        }
        if (!NetworkUtil.isNetworkConnected()) {
            imageView.setVisibility(8);
        } else if (!StringUtils.isEmpty(this.mLogoUrl)) {
            ImageUtil.updateImage(imageView, this.mLogoUrl);
        } else {
            ImageUtil.updateImage(imageView, "https://gw.alicdn.com/imgextra/i4/O1CN012c7Vcs1Xr3OZMZ4la_!!6000000002976-2-tps-885-435.png");
        }
    }
}
