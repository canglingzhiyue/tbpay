package com.taobao.monitor.impl.common;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Deprecated
/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WHAT_ASYNC_LIFECYCLE_CREATE = 130;
    public static final int WHAT_ASYNC_LIFECYCLE_DESTROY = 135;
    public static final int WHAT_ASYNC_LIFECYCLE_PAUSE = 133;
    public static final int WHAT_ASYNC_LIFECYCLE_RESUME = 132;
    public static final int WHAT_ASYNC_LIFECYCLE_START = 131;
    public static final int WHAT_ASYNC_LIFECYCLE_STOP = 134;
    public static final int WHAT_BLOCK_FPS = 121;
    public static final int WHAT_FPS = 120;
    public static final int WHAT_HITCH_RATE = 122;
    private static final f c = new f();
    private static final Queue<Bundle> d = new LinkedList();

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f18155a = new ArrayList();
    private Handler b;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, Message message);

        int[] a();
    }

    /* loaded from: classes.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final List<a> f18156a;

        public b(Looper looper, List<a> list) {
            super(looper);
            this.f18156a = list;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int[] a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            List<a> list = this.f18156a;
            if (list == null || message == null) {
                return;
            }
            for (a aVar : list) {
                for (int i : aVar.a()) {
                    if (i == message.what) {
                        aVar.a(i, message);
                    }
                }
            }
        }
    }

    private f() {
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ee08dcb4", new Object[0]) : c;
    }

    public void a(HandlerThread handlerThread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0992e", new Object[]{this, handlerThread});
        } else {
            this.b = new b(handlerThread.getLooper(), this.f18155a);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474e5f51", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f18155a.add(aVar);
        }
    }

    public void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
        } else {
            this.b.sendMessage(message);
        }
    }

    public Bundle b() {
        Bundle poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("1bd5186d", new Object[]{this});
        }
        synchronized (d) {
            poll = d.poll();
            if (poll == null) {
                poll = new Bundle();
            }
        }
        return poll;
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else if (bundle == null) {
        } else {
            bundle.clear();
            synchronized (d) {
                if (d.size() < 100) {
                    d.add(bundle);
                }
            }
        }
    }
}
