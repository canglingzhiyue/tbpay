package com.taobao.android.remoteso.api.assets;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class CheckAssetsResult {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_NORMAL = 1;
    public static final int STATUS_REMOTE = 0;
    public static final int STATUS_UNKNOWN = 2;

    /* renamed from: a  reason: collision with root package name */
    private final String f14770a;
    private final int b;

    /* loaded from: classes6.dex */
    @interface AssetsStatus {
    }

    public CheckAssetsResult(String str, int i) {
        this.f14770a = str;
        this.b = i;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b == 0;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CheckAssetsResult{name='" + this.f14770a + "', status=" + this.b + '}';
    }
}
