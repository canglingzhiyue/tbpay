package com.taobao.infoflow.core.subservice.framework.container.containerservice;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.lkq;
import tb.nuw;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<lkq.a> f17397a;

    static {
        kge.a(2059143442);
    }

    public void a(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b7e169", new Object[]{this, aVar});
            return;
        }
        if (this.f17397a == null) {
            this.f17397a = new CopyOnWriteArrayList();
        }
        this.f17397a.add(aVar);
    }

    public void b(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f934baa", new Object[]{this, aVar});
            return;
        }
        List<lkq.a> list = this.f17397a;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<lkq.a> list = this.f17397a;
        if (list == null) {
            return;
        }
        list.clear();
        this.f17397a = null;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        List<lkq.a> list = this.f17397a;
        if (list == null) {
            return;
        }
        for (lkq.a aVar : list) {
            aVar.a(context);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<lkq.a> list = this.f17397a;
        if (list == null) {
            return;
        }
        for (lkq.a aVar : list) {
            nuw.a("notifyCreateContainerEnd", aVar.getClass().getName());
            aVar.b();
            nuw.b("notifyCreateContainerEnd", aVar.getClass().getName());
        }
    }
}
