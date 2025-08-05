package com.taobao.common.inspector;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import tb.kge;

/* loaded from: classes7.dex */
public class e<T> implements Callable<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16931a;
    private final Class<? extends T> b;
    private final String c;

    static {
        kge.a(-1560569174);
        kge.a(-119797776);
    }

    public e(Context context, Class<? extends T> cls, String str) {
        this.f16931a = context;
        this.b = cls;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        InputStream proxy_open = AssetsDelegate.proxy_open(this.f16931a.getAssets(), this.c);
        try {
            T t = (T) JSON.parseObject(g.a(proxy_open, StandardCharsets.UTF_8), this.b);
            if (proxy_open != null) {
                proxy_open.close();
            }
            return t;
        } catch (Throwable th) {
            if (proxy_open != null) {
                try {
                    proxy_open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
