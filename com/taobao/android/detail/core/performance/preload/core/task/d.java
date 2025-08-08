package com.taobao.android.detail.core.performance.preload.core.task;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import com.taobao.android.detail.core.performance.preload.h;
import com.taobao.android.detail.core.performance.preload.k;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.eiv;
import tb.eiw;
import tb.emu;
import tb.jqm;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Deque<PreloadTaskEntity.a> f9792a = new ArrayDeque();
    private final eiv b = new eiv();

    static {
        kge.a(420185965);
    }

    public d() {
        emu.a("com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntityItemManager");
    }

    public synchronized void a(PreloadTaskEntity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83d3c2d", new Object[]{this, aVar});
            return;
        }
        if (this.f9792a.contains(aVar)) {
            this.f9792a.remove(aVar);
        }
        this.f9792a.push(aVar);
    }

    public synchronized PreloadTaskEntity a(int i, int i2, eiw eiwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadTaskEntity) ipChange.ipc$dispatch("7c02fd13", new Object[]{this, new Integer(i), new Integer(i2), eiwVar});
        } else if (this.f9792a.isEmpty()) {
            return null;
        } else {
            PreloadTaskEntity preloadTaskEntity = new PreloadTaskEntity();
            ArrayList<PreloadTaskEntity.a> arrayList = new ArrayList<>();
            int i3 = 0;
            while (!this.f9792a.isEmpty() && i3 < i) {
                PreloadTaskEntity.a pop = this.f9792a.pop();
                arrayList.add(pop);
                if (StringUtils.isEmpty(preloadTaskEntity.bizName)) {
                    preloadTaskEntity.bizName = pop.f9788a;
                }
                if (StringUtils.isEmpty(preloadTaskEntity.sourceFrom)) {
                    preloadTaskEntity.sourceFrom = pop.b;
                }
                if (StringUtils.isEmpty(preloadTaskEntity.pageToken)) {
                    preloadTaskEntity.pageToken = pop.g;
                }
                if (StringUtils.isEmpty(preloadTaskEntity.preloadType)) {
                    preloadTaskEntity.preloadType = pop.h;
                }
                i3++;
            }
            if (jqm.a()) {
                Iterator<PreloadTaskEntity.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    String a2 = l.a("PreloadTaskEntityItemManager");
                    i.c(a2, "补偿前build task item:" + it.next().e);
                }
            }
            if (i3 > 0 && i3 < i) {
                i.c(l.a("PreloadTaskEntityItemManager"), "build task 需要补偿");
                arrayList.addAll(a(Math.min(i2, i - i3), arrayList.get(0), preloadTaskEntity, eiwVar));
            }
            preloadTaskEntity.items = arrayList;
            if (jqm.a()) {
                Iterator<PreloadTaskEntity.a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String a3 = l.a("PreloadTaskEntityItemManager");
                    i.c(a3, "补偿后build task item:" + it2.next().e);
                }
            }
            String a4 = l.a("PreloadTaskEntityItemManager");
            i.c(a4, "build task item size:" + arrayList.size());
            return preloadTaskEntity;
        }
    }

    private ArrayList<PreloadTaskEntity.a> a(int i, PreloadTaskEntity.a aVar, PreloadTaskEntity preloadTaskEntity, eiw eiwVar) {
        h b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("15d9d059", new Object[]{this, new Integer(i), aVar, preloadTaskEntity, eiwVar});
        }
        ArrayList<PreloadTaskEntity.a> arrayList = new ArrayList<>();
        CopyOnWriteArrayList<PreloadTaskEntity.a> c = this.b.c(this.b.a(preloadTaskEntity));
        if (jqm.a()) {
            Iterator<PreloadTaskEntity.a> it = c.iterator();
            while (it.hasNext()) {
                i.c(l.a("PreloadTaskEntityItemManager"), "补偿前build task item:" + it.next().e);
            }
        }
        int indexOf = c.indexOf(aVar);
        i.c(l.a("PreloadTaskEntityItemManager"), "build task 需要补偿 的源数据索引：" + indexOf);
        if (indexOf == -1) {
            return arrayList;
        }
        i.c(l.a("PreloadTaskEntityItemManager"), "build task 需要补偿:" + i);
        while (i > 0 && indexOf < c.size() - 1) {
            indexOf++;
            PreloadTaskEntity.a aVar2 = c.get(indexOf);
            if (aVar2 != null && ((b = k.a().b(aVar2.e)) == null || b.a() || !b.c())) {
                if (!eiwVar.a(aVar)) {
                    arrayList.add(aVar2);
                    i--;
                }
            }
        }
        return arrayList;
    }

    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b.a(str);
        }
    }

    public synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b.b(str);
        }
    }
}
