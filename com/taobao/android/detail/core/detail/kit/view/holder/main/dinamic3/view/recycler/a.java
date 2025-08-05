package com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.recycler;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9583a = "recyclerContentList";

    static {
        kge.a(-651218304);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -2088531394) {
            return super.getOnLoadMoreView((String) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.recycler.DXContentRecyclerConfig");
    }

    @Override // com.taobao.android.dinamicx.o
    public DXAbsOnLoadMoreView getOnLoadMoreView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXAbsOnLoadMoreView) ipChange.ipc$dispatch("83838a3e", new Object[]{this, str});
        }
        if (TextUtils.equals("recyclerContentList", str)) {
            return new DXContentLoadMoreView(bd.e());
        }
        return super.getOnLoadMoreView(str);
    }
}
