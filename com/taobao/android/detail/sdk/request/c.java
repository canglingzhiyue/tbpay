package com.taobao.android.detail.sdk.request;

import android.content.Context;
import android.os.AsyncTask;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public abstract class c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Request b;
    public Response c;
    public WeakReference<com.taobao.android.trade.boost.request.mtop.c<T, Response>> d;
    public AsyncTask<Void, Void, T> e;
    public boolean f;

    static {
        kge.a(-1126294926);
    }

    public abstract T b(String str);

    public c(final Context context, final Request request, com.taobao.android.trade.boost.request.mtop.c<T, Response> cVar) {
        this.b = request;
        this.d = new WeakReference<>(cVar);
        tpc.a("com.taobao.android.detail.sdk.request.HttpRequestClient");
        this.e = new AsyncTask<Void, Void, T>() { // from class: com.taobao.android.detail.sdk.request.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.AsyncTask
            public /* synthetic */ Object doInBackground(Void[] voidArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public T a(Void... voidArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (T) ipChange.ipc$dispatch("5307165e", new Object[]{this, voidArr});
                }
                c.this.c = new DegradableNetwork(context).syncSend(request, null);
                if (c.this.c == null) {
                    return null;
                }
                try {
                    return (T) c.this.b(new String(c.this.c.getBytedata(), "utf-8"));
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(T t) {
                com.taobao.android.trade.boost.request.mtop.c<T, Response> cVar2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b105c779", new Object[]{this, t});
                } else if (c.this.f || (cVar2 = c.this.d.get()) == null) {
                } else {
                    if (c.this.c.getStatusCode() == 200 && t != null) {
                        cVar2.onSuccess(t);
                    } else {
                        cVar2.onFailure(c.this.c);
                    }
                }
            }
        };
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
