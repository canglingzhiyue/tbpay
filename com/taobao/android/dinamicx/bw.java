package com.taobao.android.dinamicx;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/dinamicx/DXABGlobalImpl;", "Lcom/taobao/android/dinamicx/IDXABGlobalInterface;", "()V", "abMap", "", "", "", "isFeatureOpened", "context", "Landroid/content/Context;", com.taobao.android.behavix.feature.a.FEATURE_NAME, "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class bw implements bz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Boolean> f11830a = new LinkedHashMap();

    @Override // com.taobao.android.dinamicx.bz
    public boolean a(Context context, String featureName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, featureName})).booleanValue();
        }
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(featureName, "featureName");
        Boolean bool = this.f11830a.get(featureName);
        if (bool == null) {
            bool = Boolean.valueOf(ABGlobal.isFeatureOpened(context, featureName));
            this.f11830a.put(featureName, bool);
        }
        return bool.booleanValue();
    }
}
