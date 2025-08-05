package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PriorityQueue<f> f13617a = new PriorityQueue<>(20, new Comparator<f>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public /* synthetic */ int compare(f fVar, f fVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, fVar, fVar2})).intValue() : a(fVar, fVar2);
        }

        public int a(f fVar, f fVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4a2b2bb", new Object[]{this, fVar, fVar2})).intValue() : fVar2.getRank() - fVar.getRank();
        }
    });

    static {
        kge.a(1822402937);
    }

    public void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543b6059", new Object[]{this, fVar, new Boolean(z)});
            return;
        }
        if (z) {
            Iterator<f> it = this.f13617a.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next.getType() == fVar.getType()) {
                    next.setMsgCnt(next.getMsgCnt() + 1);
                    return;
                }
            }
        }
        this.f13617a.offer(fVar);
    }

    public f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2df08e9b", new Object[]{this}) : this.f13617a.poll();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        PriorityQueue<f> priorityQueue = this.f13617a;
        if (priorityQueue == null) {
            return;
        }
        priorityQueue.clear();
    }
}
