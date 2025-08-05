package com.taobao.android.opencart.msoa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.hvf;

/* loaded from: classes6.dex */
public class AddBagServiceImpl implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mProxy = new a();
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public static /* synthetic */ a access$000(AddBagServiceImpl addBagServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d4110e2c", new Object[]{addBagServiceImpl}) : addBagServiceImpl.mProxy;
    }

    public void addBag(final String str, final String str2, final Integer num, final String str3, final String str4, final String str5, final Boolean bool, final Map<String, Object> map, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9040c9bd", new Object[]{this, str, str2, num, str3, str4, str5, bool, map, context});
        } else {
            this.mHandler.post(new Runnable() { // from class: com.taobao.android.opencart.msoa.AddBagServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AddBagServiceImpl.access$000(AddBagServiceImpl.this).a(str, str2, num, str3, str4, str5, bool, map, context);
                    } catch (Exception e) {
                        hvf.c("AddBagServiceImpl", e.getMessage());
                    }
                }
            });
        }
    }
}
