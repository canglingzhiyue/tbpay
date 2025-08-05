package com.unionpay.tsmservice.mi.mini.result.wrapper;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import com.unionpay.tsmservice.mi.mini.ITsmCallback;
import com.unionpay.tsmservice.mi.mini.result.QueryVendorPayStatusResult;

/* loaded from: classes9.dex */
public class QueryVendorPayStatusResultCallbackWrapper extends BaseResultCallbackWrapper {
    public QueryVendorPayStatusResultCallbackWrapper(int i, ITsmCallback iTsmCallback) {
        super(i, iTsmCallback);
    }

    private void getCallbackResultData(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        String string = bundle.getString("result");
        if (!TextUtils.isEmpty(string)) {
            byte[] decode = Base64.decode(string, 0);
            if (decode != null && decode.length != 0) {
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
            }
            if (obtain.dataSize() == 0) {
                bundle.putString("errorCode", "010001");
            } else {
                bundle.putString("errorCode", "10000");
                bundle.putParcelable("result", (QueryVendorPayStatusResult) obtain.readParcelable(QueryVendorPayStatusResult.class.getClassLoader()));
            }
        }
        obtain.recycle();
    }

    @Override // com.unionpay.tsmservice.mi.mini.result.wrapper.BaseResultCallbackWrapper
    protected Bundle convertResult(Bundle bundle) {
        new QueryVendorPayStatusResult().setQueryVendorPayStatusResult(bundle);
        getCallbackResultData(bundle);
        return bundle;
    }
}
