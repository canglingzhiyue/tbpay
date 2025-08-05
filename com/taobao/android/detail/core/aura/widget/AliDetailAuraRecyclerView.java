package com.taobao.android.detail.core.aura.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.ultronengine.DetailRecyclerView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.eis;
import tb.emu;
import tb.fxw;
import tb.kge;

/* loaded from: classes4.dex */
public class AliDetailAuraRecyclerView extends DetailRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1649454290);
    }

    public static /* synthetic */ Object ipc$super(AliDetailAuraRecyclerView aliDetailAuraRecyclerView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AliDetailAuraRecyclerView(Context context) {
        super(context);
        initVideoControlConfig(context);
        emu.a("com.taobao.android.detail.core.aura.widget.AliDetailAuraRecyclerView");
    }

    public AliDetailAuraRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initVideoControlConfig(context);
        emu.a("com.taobao.android.detail.core.aura.widget.AliDetailAuraRecyclerView");
    }

    public AliDetailAuraRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initVideoControlConfig(context);
        emu.a("com.taobao.android.detail.core.aura.widget.AliDetailAuraRecyclerView");
    }

    private void initVideoControlConfig(Context context) {
        com.taobao.android.dinamicx.videoc.b u;
        Class<? extends DXWidgetNode> videoWidgetNodeClass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133fee2d", new Object[]{this, context});
        } else if (!eis.c || !(context instanceof DetailCoreActivity)) {
        } else {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
            if (detailCoreActivity.d == null || (u = detailCoreActivity.d.d().u()) == null || !u.b() || (videoWidgetNodeClass = getVideoWidgetNodeClass()) == null) {
                return;
            }
            DXVideoControlConfig<fxw> b = DXVideoControlConfig.b();
            b.b(true).a(videoWidgetNodeClass);
            u.a(this, b);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public RecyclerView.Adapter getAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.Adapter) ipChange.ipc$dispatch("9dbb1379", new Object[]{this}) : getRawAdapter();
    }

    private Class<? extends DXWidgetNode> getVideoWidgetNodeClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("1e74d7e1", new Object[]{this});
        }
        try {
            return Class.forName("com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode");
        } catch (Exception e) {
            i.a("DXVideoViewWidgetNode", "getVideoWidgetNodeClass error : ", e);
            return null;
        }
    }
}
