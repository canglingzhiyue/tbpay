package com.taobao.mytaobao.basement.weex;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/taobao/android/weex_framework/IMUSRenderListener;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BasementWeexView$renderListenerList$2 extends Lambda implements ruk<List<com.taobao.android.weex_framework.g>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BasementWeexView$renderListenerList$2 INSTANCE = new BasementWeexView$renderListenerList$2();

    public BasementWeexView$renderListenerList$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final List<com.taobao.android.weex_framework.g> mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4c3f8768", new Object[]{this}) : new ArrayList();
    }
}
