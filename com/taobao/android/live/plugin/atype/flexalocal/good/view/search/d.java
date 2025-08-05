package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import tb.hgv;
import tb.hjb;
import tb.hjr;
import tb.kge;

/* loaded from: classes6.dex */
public class d<T extends hjb> extends com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.a<T> implements hjr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c b = new c(new a());
    private boolean c;

    static {
        kge.a(-1607924416);
        kge.a(-394606700);
    }

    public static /* synthetic */ hgv a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("24997b19", new Object[]{dVar}) : dVar.f13750a;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("826a0f62", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.c = z;
        return z;
    }

    public static /* synthetic */ hgv b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("28ce0f8", new Object[]{dVar}) : dVar.f13750a;
    }

    public static /* synthetic */ hgv c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("e08046d7", new Object[]{dVar}) : dVar.f13750a;
    }

    @Override // tb.hjr
    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acce0c3", new Object[]{this, cVar, str, str2, new Integer(i), new Integer(i2)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c = true;
            this.b.a(cVar, str, str2, i, i2);
        }
    }

    @Override // tb.hjr
    public void b(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd91b44", new Object[]{this, cVar, str, str2, new Integer(i), new Integer(i2)});
        } else if (TextUtils.isEmpty(str) || this.c) {
        } else {
            this.c = true;
            this.b.a(cVar, str, str2, i, i2);
        }
    }

    @Override // tb.hgu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    /* loaded from: classes6.dex */
    public class a implements com.taobao.taolive.sdk.adapter.network.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1584068224);
            kge.a(-797454141);
        }

        private a() {
        }

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            ((hjb) d.a(d.this)).a(((GoodListSearchResponse) netBaseOutDo).mo1437getData(), obj == null ? "" : ((c) obj).f13753a.searchWord);
            d.a(d.this, false);
        }

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            ((hjb) d.b(d.this)).a(obj == null ? "" : ((c) obj).f13753a.searchWord);
            d.a(d.this, false);
        }

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            ((hjb) d.c(d.this)).a(obj == null ? "" : ((c) obj).f13753a.searchWord);
            d.a(d.this, false);
        }
    }
}
