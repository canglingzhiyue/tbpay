package com.taobao.umipublish.ayscpublish;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.service.ServiceImpl;
import tb.kge;
import tb.ten;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23232a;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static c f23233a;

        static {
            kge.a(-1611247648);
            f23233a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9c41ed5c", new Object[0]) : f23233a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ServiceImpl("com.taobao.umipublish.ayscpublish.UmiPublishTaskManagerRemote")
    /* loaded from: classes9.dex */
    public interface b {
        void restoreAsyncPublishFromTask();
    }

    static {
        kge.a(440237796);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9c41ed5c", new Object[0]) : a.a();
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!ten.a("guangguang", false)) {
        } else {
            ((b) com.taobao.android.litecreator.service.b.a(b.class, new Object[0])).restoreAsyncPublishFromTask();
        }
    }
}
