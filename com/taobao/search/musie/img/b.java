package com.taobao.search.musie.img;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import com.taobao.search.common.util.r;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends UIImageDrawable implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float b = r.ao();

    static {
        kge.a(-1249438250);
        kge.a(1982418204);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 92838749) {
            if (hashCode != 93762270) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Integer(super.d());
        }
        return new Integer(super.c());
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.b = 1.0f;
        }
    }

    @Override // com.taobao.search.musie.img.c
    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : super.c();
    }

    @Override // com.taobao.search.musie.img.c
    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : super.d();
    }

    @Override // com.taobao.android.weex_uikit.widget.img.UIImageDrawable, com.taobao.android.weex_framework.adapter.d.a
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : (int) (super.c() * this.b);
    }

    @Override // com.taobao.android.weex_uikit.widget.img.UIImageDrawable, com.taobao.android.weex_framework.adapter.d.a
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : (int) (super.d() * this.b);
    }
}
