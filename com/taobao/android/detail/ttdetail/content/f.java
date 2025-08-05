package com.taobao.android.detail.ttdetail.content;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import tb.kge;

/* loaded from: classes4.dex */
public class f extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f10588a = "recyclerContentList";

    static {
        kge.a(-1415554307);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -2088531394) {
            return super.getOnLoadMoreView((String) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
