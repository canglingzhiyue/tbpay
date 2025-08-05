package com.taobao.zcache.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.PackUpdateFinishedCallback;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes9.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23646a;
    public final UpdateMatchType b;
    private ArrayList<PackUpdateFinishedCallback> c = new ArrayList<>();

    static {
        kge.a(1488097369);
    }

    public i(String str) {
        if (str.startsWith("*")) {
            this.b = UpdateMatchType.Suffix;
            this.f23646a = str.substring(1);
        } else if (str.endsWith("*")) {
            this.b = UpdateMatchType.Prefix;
            this.f23646a = str.substring(0, str.length() - 1);
        } else {
            this.b = UpdateMatchType.Full;
            this.f23646a = str;
        }
    }

    public void a(PackUpdateFinishedCallback packUpdateFinishedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05d0b0a", new Object[]{this, packUpdateFinishedCallback});
            return;
        }
        synchronized (this) {
            if (!this.c.contains(packUpdateFinishedCallback)) {
                ArrayList<PackUpdateFinishedCallback> arrayList = new ArrayList<>(this.c);
                arrayList.add(packUpdateFinishedCallback);
                this.c = arrayList;
            }
        }
    }

    public void a(String str) {
        ArrayList<PackUpdateFinishedCallback> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            arrayList = this.c;
        }
        Iterator<PackUpdateFinishedCallback> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().finish(str, null);
        }
    }
}
