package com.taobao.phenix.cache.memory;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class d implements com.taobao.phenix.cache.c<String, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-820569880);
        kge.a(-1242570964);
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("179501e6", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.phenix.cache.c
    public void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
        }
    }

    @Override // com.taobao.phenix.cache.c
    public boolean a(int i, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6453306b", new Object[]{this, new Integer(i), str, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.phenix.cache.c
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.phenix.cache.c
    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("18cb54c5", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.phenix.cache.c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.phenix.cache.c
    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.phenix.cache.c
    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    @Override // com.taobao.phenix.cache.c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.phenix.cache.memory.b, java.lang.Object] */
    @Override // com.taobao.phenix.cache.c
    public /* synthetic */ b d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9cf2280b", new Object[]{this, str}) : a(str);
    }
}
