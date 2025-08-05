package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.MaskLayerView;
import tb.kge;
import tb.oec;
import tb.ogl;

/* loaded from: classes8.dex */
public class o extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-401734413);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e
    public boolean needRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f38ff2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ ogl mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public MaskLayerView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaskLayerView) ipChange.ipc$dispatch("801216a8", new Object[]{this, context});
        }
        MaskLayerView maskLayerView = new MaskLayerView(context);
        maskLayerView.bindComponent(this);
        if (this.viewParams instanceof a) {
            maskLayerView.setCheckAlpha(((a) this.viewParams).f20171a);
        }
        return maskLayerView;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e667768c", new Object[]{this}) : new a();
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f20171a = 0.0f;

        static {
            kge.a(1935034079);
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            char c = 65535;
            if (str.hashCode() == -337001383 && str.equals("check-alpha")) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            this.f20171a = oec.b(obj, 0);
        }
    }
}
