package com.taobao.android.preload.core.task;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.preload.f;
import com.taobao.android.preload.g;
import com.taobao.android.preload.j;
import com.taobao.android.preload.k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ick;
import tb.icl;
import tb.jqm;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Deque<PreloadTaskEntity.a> f14680a = new ArrayDeque();
    private final ick b = new ick();

    public synchronized void a(PreloadTaskEntity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adfeafc", new Object[]{this, aVar});
            return;
        }
        if (this.f14680a.contains(aVar)) {
            this.f14680a.remove(aVar);
        }
        this.f14680a.push(aVar);
    }

    public synchronized PreloadTaskEntity a(int i, int i2, icl iclVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadTaskEntity) ipChange.ipc$dispatch("8ca43ee1", new Object[]{this, new Integer(i), new Integer(i2), iclVar});
        } else if (this.f14680a.isEmpty()) {
            return null;
        } else {
            PreloadTaskEntity preloadTaskEntity = new PreloadTaskEntity();
            ArrayList<PreloadTaskEntity.a> arrayList = new ArrayList<>();
            int i3 = 0;
            while (!this.f14680a.isEmpty() && i3 < i) {
                PreloadTaskEntity.a pop = this.f14680a.pop();
                arrayList.add(pop);
                if (StringUtils.isEmpty(preloadTaskEntity.bizName)) {
                    preloadTaskEntity.bizName = pop.f14676a;
                }
                if (StringUtils.isEmpty(preloadTaskEntity.sourceFrom)) {
                    preloadTaskEntity.sourceFrom = pop.b;
                }
                if (StringUtils.isEmpty(preloadTaskEntity.pageToken)) {
                    preloadTaskEntity.pageToken = pop.g;
                }
                i3++;
            }
            if (jqm.a()) {
                Iterator<PreloadTaskEntity.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    String a2 = com.taobao.android.preload.e.a("PreloadTaskEntityItemManager");
                    f.b(a2, "补偿前build task item:" + it.next().e);
                }
            }
            if (i3 > 0 && i3 < i) {
                f.b(com.taobao.android.preload.e.a("PreloadTaskEntityItemManager"), "build task 需要补偿");
                arrayList.addAll(a(Math.min(i2, i - i3), arrayList.get(0), preloadTaskEntity, iclVar));
            }
            preloadTaskEntity.items = arrayList;
            if (jqm.a()) {
                Iterator<PreloadTaskEntity.a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String a3 = com.taobao.android.preload.e.a("PreloadTaskEntityItemManager");
                    f.b(a3, "补偿后build task item:" + it2.next().e);
                }
            }
            String a4 = com.taobao.android.preload.e.a("PreloadTaskEntityItemManager");
            f.b(a4, "build task item size:" + arrayList.size());
            return preloadTaskEntity;
        }
    }

    private ArrayList<PreloadTaskEntity.a> a(int i, PreloadTaskEntity.a aVar, PreloadTaskEntity preloadTaskEntity, icl iclVar) {
        j a2;
        g a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3a272f98", new Object[]{this, new Integer(i), aVar, preloadTaskEntity, iclVar});
        }
        ArrayList<PreloadTaskEntity.a> arrayList = new ArrayList<>();
        CopyOnWriteArrayList<PreloadTaskEntity.a> a4 = this.b.a(this.b.a(preloadTaskEntity));
        if (jqm.a()) {
            Iterator<PreloadTaskEntity.a> it = a4.iterator();
            while (it.hasNext()) {
                f.b(com.taobao.android.preload.e.a("PreloadTaskEntityItemManager"), "补偿前build task item:" + it.next().e);
            }
        }
        int indexOf = a4.indexOf(aVar);
        f.b(com.taobao.android.preload.e.a("PreloadTaskEntityItemManager"), "build task 需要补偿 的源数据索引：" + indexOf);
        if (indexOf == -1) {
            return arrayList;
        }
        f.b(com.taobao.android.preload.e.a("PreloadTaskEntityItemManager"), "build task 需要补偿:" + i);
        while (i > 0 && indexOf < a4.size() - 1) {
            indexOf++;
            PreloadTaskEntity.a aVar2 = a4.get(indexOf);
            if (aVar2 != null && (a2 = k.a(aVar2.f14676a)) != null && ((a3 = a2.a(aVar2.e)) == null || a3.a())) {
                if (!iclVar.a(aVar)) {
                    arrayList.add(aVar2);
                    i--;
                }
            }
        }
        return arrayList;
    }

    public synchronized void a(String str, com.taobao.android.preload.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e007018", new Object[]{this, str, bVar});
        } else {
            this.b.a(str, bVar);
        }
    }

    public synchronized void b(String str, com.taobao.android.preload.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3b2199", new Object[]{this, str, bVar});
        } else {
            this.b.b(str, bVar);
        }
    }
}
