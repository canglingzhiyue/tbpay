package com.taobao.android.remoteso.api.assets;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14771a;
    private final InputStream b;
    private final RSoException c;

    public b(String str, InputStream inputStream, RSoException rSoException) {
        this.f14771a = str;
        this.b = inputStream;
        this.c = rSoException;
    }

    public InputStream a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("13bf636b", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "OpenAssetsResult{name='" + this.f14771a + "', inputStream=" + this.b + ", error=" + this.c + '}';
    }
}
