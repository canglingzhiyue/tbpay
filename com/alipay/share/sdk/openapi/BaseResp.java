package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import com.alipay.share.sdk.Constant;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BaseResp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errCode;
    public String errStr;
    public String extraData;
    public String transaction;

    /* loaded from: classes3.dex */
    public interface ErrCode {
        public static final int ERR_AUTH_DENIED = -4;
        public static final int ERR_COMM = -1;
        public static final int ERR_OK = 0;
        public static final int ERR_SENT_FAILED = -3;
        public static final int ERR_UNSUPPORT = -5;
        public static final int ERR_USER_CANCEL = -2;
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4016170", new Object[]{this, bundle});
            return;
        }
        bundle.putInt(Constant.EXTRA_COMMAND_TYPE, getType());
        bundle.putInt(Constant.EXTRA_BASEREQ_ERROR_CODE, this.errCode);
        bundle.putString(Constant.EXTRA_BASEREQ_ERROR_STRING, this.errStr);
        bundle.putString(Constant.EXTRA_BASEREQ_EXTRA_DATA, this.extraData);
        bundle.putString(Constant.EXTRA_BASEREQ_TRANSACTION, this.transaction);
    }

    public void fromBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
            return;
        }
        this.errCode = bundle.getInt(Constant.EXTRA_BASEREQ_ERROR_CODE);
        this.errStr = bundle.getString(Constant.EXTRA_BASEREQ_ERROR_STRING);
        this.extraData = bundle.getString(Constant.EXTRA_BASEREQ_EXTRA_DATA);
        this.transaction = bundle.getString(Constant.EXTRA_BASEREQ_TRANSACTION);
    }
}
