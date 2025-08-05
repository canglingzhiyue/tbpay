package com.alipay.mobile.security.bio.service.local.automation;

import android.content.Context;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class AutomationService extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract boolean enable();

    public abstract boolean processFrame(Context context, List<Object> list, Object obj, String str);
}
