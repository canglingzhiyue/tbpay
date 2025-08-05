package com.taobao.android.sns4android.alipay2;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.alipay.auth.mobile.AlipayAuthAPIFactory;
import com.alipay.auth.mobile.api.IAlipayAuthAPI;
import com.alipay.auth.mobile.api.IAlipayAuthMonitor;
import com.alipay.auth.mobile.exception.AlipayAuthIllegalArgumentException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Properties;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a b;

    /* renamed from: a  reason: collision with root package name */
    private IAlipayAuthAPI f15248a;

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d05ca292", new Object[0]);
        }
        if (b == null) {
            b = new a();
        }
        return b;
    }

    private a() {
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            this.f15248a = AlipayAuthAPIFactory.createAlipayAuthApi(DataProviderFactory.getApplicationContext(), new IAlipayAuthMonitor() { // from class: com.taobao.android.sns4android.alipay2.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.auth.mobile.api.IAlipayAuthMonitor
                public void monitorAliayAuth(String str, Properties properties) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9ce41b1", new Object[]{this, str, properties});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        UserTrackAdapter.sendUT(str, properties);
                    }
                }
            });
        } catch (AlipayAuthIllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public IAlipayAuthAPI b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayAuthAPI) ipChange.ipc$dispatch("eb2b5bc9", new Object[]{this});
        }
        if (this.f15248a == null) {
            c();
        }
        return this.f15248a;
    }
}
