package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogl;

/* loaded from: classes8.dex */
public class t extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(958774297);
    }

    public static /* synthetic */ Object ipc$super(t tVar, String str, Object... objArr) {
        if (str.hashCode() == -2141646649) {
            super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        SheetViewGroup sheetViewGroup = new SheetViewGroup(context);
        sheetViewGroup.bindComponent(this);
        return sheetViewGroup;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, ogl oglVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, view, oglVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, oglVar, map, z);
        a aVar = (a) this.viewParams;
        if (!oec.i(aVar.f20192a)) {
            ((SheetViewGroup) view).setSideNode(this.node.a(aVar.f20192a, false), ((a) this.viewParams).e, ((a) this.viewParams).f);
        }
        ((SheetViewGroup) view).setBrowserNode(this.node.b(c.class));
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e669bc67", new Object[]{this}) : new a();
    }

    /* loaded from: classes8.dex */
    public class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20192a;
        public String c;
        public float d;
        public String b = "right";
        public int e = 1;
        public int f = 1;

        static {
            kge.a(664237215);
        }

        public a() {
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1048099191:
                    if (str.equals("side-direction")) {
                        c = 1;
                        break;
                    }
                    break;
                case -995678931:
                    if (str.equals("side-min-alpha")) {
                        c = 3;
                        break;
                    }
                    break;
                case -400370815:
                    if (str.equals("side-max-activeNum")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1392756370:
                    if (str.equals("side-max-appearNum")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1502074784:
                    if (str.equals("side-alpha-id")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2085176657:
                    if (str.equals("side-id")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f20192a = oec.a(obj, (String) null);
            } else if (c == 1) {
                this.b = oec.a(obj, "right");
            } else if (c == 2) {
                this.c = oec.a(obj, (String) null);
            } else if (c == 3) {
                this.d = oec.b(obj, 0);
            } else if (c == 4) {
                this.e = oec.a(obj, 1);
            } else if (c != 5) {
            } else {
                this.f = oec.a(obj, 1);
            }
        }
    }
}
