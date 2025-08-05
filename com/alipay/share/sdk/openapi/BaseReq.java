package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import com.alipay.share.sdk.Constant;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BaseReq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String transaction;

    public abstract boolean a();

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4016170", new Object[]{this, bundle});
            return;
        }
        bundle.putInt(Constant.EXTRA_COMMAND_TYPE, getType());
        bundle.putString(Constant.EXTRA_BASEREQ_TRANSACTION, this.transaction);
    }

    public void fromBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
        } else {
            this.transaction = bundle.getString(Constant.EXTRA_BASEREQ_TRANSACTION);
        }
    }
}
