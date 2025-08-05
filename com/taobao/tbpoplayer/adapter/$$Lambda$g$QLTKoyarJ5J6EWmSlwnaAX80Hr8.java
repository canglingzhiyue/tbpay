package com.taobao.tbpoplayer.adapter;

import android.content.Context;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.norm.IPopLayerViewFactoryAdapter;

/* compiled from: lambda */
/* renamed from: com.taobao.tbpoplayer.adapter.-$$Lambda$g$QLTKoyarJ5J6EWmSlwnaAX80Hr8  reason: invalid class name */
/* loaded from: classes8.dex */
public final /* synthetic */ class $$Lambda$g$QLTKoyarJ5J6EWmSlwnaAX80Hr8 implements IPopLayerViewFactoryAdapter {
    public static final /* synthetic */ $$Lambda$g$QLTKoyarJ5J6EWmSlwnaAX80Hr8 INSTANCE = new $$Lambda$g$QLTKoyarJ5J6EWmSlwnaAX80Hr8();

    private /* synthetic */ $$Lambda$g$QLTKoyarJ5J6EWmSlwnaAX80Hr8() {
    }

    @Override // com.alibaba.poplayer.norm.IPopLayerViewFactoryAdapter
    public final PopLayerBaseView generatePopLayerViewByType(Context context, String str, com.alibaba.poplayer.trigger.d dVar) {
        PopLayerBaseView a2;
        a2 = g.a(context, str, dVar);
        return a2;
    }
}
