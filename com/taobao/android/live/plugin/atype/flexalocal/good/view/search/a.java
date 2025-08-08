package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.os.ResultReceiver;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.TaoLiveSearchHistoryView;
import com.taobao.taolive.sdk.utils.y;
import java.util.ArrayList;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.hja;
import tb.hjp;
import tb.hjq;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends hja<hjp> implements TaoLiveSearchHistoryView.a, hjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean h;
    private f i;
    private String j;

    static {
        kge.a(1160146658);
        kge.a(-394021895);
        kge.a(-1748497650);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -650670724) {
            super.a((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    public a(c cVar) {
        super(cVar);
        this.i = new f(cVar.f());
        this.h = hir.S();
        this.j = hir.T();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b, tb.hgv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        f fVar = this.i;
        if (fVar == null) {
            return;
        }
        fVar.c();
        this.i = null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.search.TaoLiveSearchHistoryView.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        f fVar = this.i;
        if (fVar != null) {
            fVar.b();
            this.i.c();
        }
        b.e(this.d.g(), this.d.m());
    }

    @Override // tb.hja
    public void a(ArrayList<com.taobao.taolive.sdk.goodlist.a> arrayList, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f703561c", new Object[]{this, arrayList, new Boolean(z), str});
        } else if (StringUtils.isEmpty(str)) {
            his.b(GoodListSearchView.TAG, "addBottomSearchEntry | searchKey is empty.");
        } else if (y.b(this.d.f())) {
            his.b(GoodListSearchView.TAG, "addBottomSearchEntry | Devices is tablet.");
        } else {
            boolean z2 = this.h;
            if (!z2) {
                his.b(GoodListSearchView.TAG, "addBottomSearchEntry | enableShowGoodsSearchItem is false.");
            } else if (z || arrayList == null || !z2) {
            } else {
                JSONObject a2 = hiq.a(false, str, this.j);
                arrayList.add(new com.taobao.taolive.sdk.goodlist.a("10bottomSearchEntry", 10, a2, 1000001, 0L));
                his.b(GoodListSearchView.TAG, "addBottomSearchEntry is success.");
                b.a(this.d.g(), this.d.m(), a2);
            }
        }
    }

    @Override // tb.hja, tb.hjb
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        super.a(str, str2);
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str.trim())) {
            return;
        }
        e.a(((hjp) this.f13751a).getContentView(), (ResultReceiver) null);
        this.i.a(str);
        ((hjp) this.f13751a).updateHistoryView();
    }

    public f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("b688b215", new Object[]{this}) : this.i;
    }
}
