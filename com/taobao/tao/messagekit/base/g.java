package com.taobao.tao.messagekit.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f20756a = new CopyOnWriteArrayList();

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, String str, String str2, String str3, String str4);

        void b(int i, String str, String str2, String str3, String str4);
    }

    static {
        kge.a(-1234176127);
    }

    public void a(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c27e0c3", new Object[]{this, new Integer(i), str, str2, str3, str4});
            return;
        }
        for (a aVar : this.f20756a) {
            aVar.a(i, str, str2, str3, str4);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7918f391", new Object[]{this, aVar});
        } else {
            this.f20756a.add(aVar);
        }
    }

    public void b(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95293262", new Object[]{this, new Integer(i), str, str2, str3, str4});
            return;
        }
        for (a aVar : this.f20756a) {
            aVar.b(i, str, str2, str3, str4);
        }
    }
}
