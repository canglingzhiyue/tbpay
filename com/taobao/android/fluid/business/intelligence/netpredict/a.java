package com.taobao.android.fluid.business.intelligence.netpredict;

import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, Integer> f12402a;
    private LruCache<String, NetFactor> b;
    private int c;
    private LruCache<Integer, List<Long>> d;
    private LruCache<Integer, List<String>> e;
    private LruCache<Integer, Long> f;

    /* renamed from: com.taobao.android.fluid.business.intelligence.netpredict.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0487a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f12403a;

        static {
            kge.a(1923983244);
            f12403a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b6ad4ed2", new Object[0]) : f12403a;
        }
    }

    static {
        kge.a(1215598777);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b6ad4ed2", new Object[0]) : C0487a.a();
    }

    private a() {
        this.f12402a = new LruCache<>(10);
        this.b = new LruCache<>(10);
        this.d = new LruCache<>(3);
        this.e = new LruCache<>(3);
        this.f = new LruCache<>(3);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c = 0;
        }
    }

    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else if (j <= 0) {
        } else {
            List<Long> list = this.d.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(Long.valueOf(j));
            this.d.put(Integer.valueOf(i), list);
        }
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i - 4; i2 < i; i2++) {
            List<Long> list = this.d.get(Integer.valueOf(i2));
            if (list != null && list.size() > 0) {
                arrayList.add(list);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return JSON.toJSONString(arrayList);
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        List<String> list = this.e.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(str);
        this.e.put(Integer.valueOf(i), list);
    }

    private String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i - 4; i2 < i; i2++) {
            List<String> list = this.e.get(Integer.valueOf(i2));
            if (list != null && list.size() > 0) {
                arrayList.add(list);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return JSON.toJSONString(arrayList);
    }

    public void b(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f791ca", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            this.f.put(Integer.valueOf(i), Long.valueOf(j));
        }
    }

    private String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i - 4; i2 < i; i2++) {
            Long l = this.f.get(Integer.valueOf(i2));
            if (l != null) {
                arrayList.add(l);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return JSON.toJSONString(arrayList);
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            this.f12402a.put(str, Integer.valueOf(i));
        }
    }

    public String a(String str) {
        NetFactor remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (remove = this.b.remove(str)) == null) {
            return null;
        }
        return JSON.toJSONString(remove);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public void a(com.taobao.android.fluid.core.FluidContext r10, java.util.List<com.taobao.android.fluid.framework.data.datamodel.a> r11, int r12) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.intelligence.netpredict.a.a(com.taobao.android.fluid.core.FluidContext, java.util.List, int):void");
    }

    private void a(FluidContext fluidContext, NetFactor netFactor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34c5a35", new Object[]{this, fluidContext, netFactor});
            return;
        }
        IPreCacheService iPreCacheService = (IPreCacheService) fluidContext.getService(IPreCacheService.class);
        if (iPreCacheService == null || !iPreCacheService.enablePreCache()) {
            return;
        }
        spz.c("PreCache-Predicter", " -----doPredict----- ");
        if (iPreCacheService.isWeakNetWork(netFactor)) {
            iPreCacheService.pickCacheData();
        } else {
            spz.c("PreCache-Predicter", " -----doPredict--:-noNeed-- ");
        }
    }
}
