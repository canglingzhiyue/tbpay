package com.taobao.android.detail.mainpic.holder;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bny;
import tb.etx;
import tb.eus;

/* loaded from: classes4.dex */
public class f extends m implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String e = "lightoffMainpicVideo";

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.mainpic.holder.c
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return true;
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e a(final etx etxVar, final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("594ec67c", new Object[]{etxVar, gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new f(bnyVar, etx.this, gVar);
            }
        };
    }

    public f(bny bnyVar, etx etxVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar, etxVar, gVar);
    }

    @Override // com.taobao.android.detail.mainpic.holder.m, com.alibaba.android.ultron.vfw.viewholder.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.h.mute(false);
        eus.a(this.l, this.k.m());
    }
}
