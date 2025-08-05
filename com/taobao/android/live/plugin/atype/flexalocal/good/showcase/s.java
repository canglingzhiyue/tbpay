package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.AlgoGoodsCardConfigData;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import tb.hiq;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public class s implements r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Queue<k> f13819a = new LinkedList();
    private final boolean b;
    private k c;
    private AlgoGoodsCardConfigData d;
    private final long e;

    static {
        kge.a(546077520);
        kge.a(-1830032104);
    }

    public s(List<LiveItem> list, List<LiveItem> list2, VideoInfo videoInfo, long j, boolean z) {
        this.b = z;
        this.e = j;
        a(list, list2, videoInfo);
    }

    private void a(List<LiveItem> list, List<LiveItem> list2, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788943", new Object[]{this, list, list2, videoInfo});
        } else if (list != null && !list.isEmpty()) {
            this.f13819a.clear();
            if (list2 == null || list2.isEmpty() || !hiq.n(list2.get(0))) {
                i = 0;
            } else {
                a(list2.get(0), 1);
            }
            for (LiveItem liveItem : list) {
                k kVar = new k(liveItem);
                if (hiq.n(kVar.a())) {
                    i++;
                    a(kVar.a(), i);
                }
                this.f13819a.add(kVar);
            }
            if (videoInfo == null || videoInfo.itemConfigInfo == null) {
                return;
            }
            String string = videoInfo.itemConfigInfo.getString("itemAlgoRecommendCardParam");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                this.d = (AlgoGoodsCardConfigData) JSONObject.parseObject(string, AlgoGoodsCardConfigData.class);
                hiq.c(this.d.notClickTimeMaxLimit);
            } catch (Exception e) {
                his.b("StashItemHolder", e.getMessage());
            }
        }
    }

    private void a(LiveItem liveItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33425ae0", new Object[]{this, liveItem, new Integer(i)});
            return;
        }
        JSONObject jSONObject = liveItem.nativeConfigInfos;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("algoItemIndex", (Object) Integer.valueOf(i));
        liveItem.nativeConfigInfos = jSONObject;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public AlgoGoodsCardConfigData c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlgoGoodsCardConfigData) ipChange.ipc$dispatch("3e6fdbe2", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f13819a.clear();
        a();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public void a(LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33429ab1", new Object[]{this, liveItem, new Boolean(z)});
        } else if (!hiq.h(liveItem)) {
        } else {
            this.c = new k(liveItem);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public void a(LiveItem liveItem) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1232883", new Object[]{this, liveItem});
        } else if (liveItem == null || (kVar = this.c) == null || kVar.f13803a != liveItem.itemId) {
        } else {
            this.c = null;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.r
    public k b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("b77f090b", new Object[]{this});
        }
        if (!this.b) {
            return null;
        }
        k kVar = this.c;
        if (kVar != null) {
            long j = -1;
            if (kVar.c != null && this.c.c.extendVal != null) {
                j = com.taobao.taolive.sdk.utils.l.b(this.c.c.extendVal.timepoint);
            }
            if (j > 0 && hiq.a() - j > this.e * 1000) {
                this.c = null;
            }
        }
        if (this.c == null && this.f13819a.size() > 0) {
            k poll = this.f13819a.poll();
            if (poll == null) {
                return null;
            }
            if (hiq.n(poll.c) && hiq.m(poll.c)) {
                return null;
            }
            if (hiq.h(poll.c)) {
                this.c = poll;
            }
            return poll;
        }
        return this.c;
    }
}
