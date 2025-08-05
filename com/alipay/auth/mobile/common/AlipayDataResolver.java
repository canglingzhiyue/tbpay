package com.alipay.auth.mobile.common;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayDataResolver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f5218a;

    public AlipayDataResolver(Context context) {
        this.f5218a = context.getContentResolver();
    }

    public int getAlipayAuthLoginSupportVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93056fe5", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            Cursor query = this.f5218a.query(Uri.parse("content://com.alipay.ali.authlogin/auth_login_sdk_version"), null, null, null, null);
            if (query == null) {
                LoggerUtils.d("AlipayDataResolver", "getAlipayAuthLoginSupportVersion cursor == null");
                return i;
            }
            int intValue = query.moveToFirst() ? Integer.valueOf(query.getString(0)).intValue() : i;
            query.close();
            LoggerUtils.d("AlipayDataResolver", "getAlipayAuthLoginSupportVersion result=" + intValue);
            return intValue;
        } catch (Exception e) {
            LoggerUtils.e("AlipayDataResolver", "getAlipayAuthLoginSupportVersion error", e);
            return i;
        }
    }
}
