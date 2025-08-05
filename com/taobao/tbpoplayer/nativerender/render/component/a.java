package com.taobao.tbpoplayer.nativerender.render.component;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.BlockModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.l;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends c<BlockModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<c> e;

    static {
        kge.a(-363651766);
        kge.a(717479522);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -650670720:
                return new Boolean(super.a((String) objArr[0], (String) objArr[1]));
            case -152376096:
                super.bh_();
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 1714797822:
                super.a((String) objArr[0], (JSONObject) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void lambda$CxMQ0GJpI9GS4J2YiWsLXNUpUNQ(a aVar, View view) {
        aVar.b(view);
    }

    public static /* synthetic */ boolean lambda$N_91wDXpAMHrQg5ysak1AaU2osY(a aVar, View view) {
        return aVar.a(view);
    }

    /* renamed from: lambda$fcYuh-5oLHt2ivPUuJtPcGuQQLc */
    public static /* synthetic */ void m1458lambda$fcYuh5oLHt2ivPUuJtPcGuQQLc(a aVar) {
        aVar.h();
    }

    public a(com.taobao.tbpoplayer.nativerender.e eVar, BlockModel blockModel, boolean z) {
        super(eVar, blockModel, z);
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public StyleModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("815a627d", new Object[]{this});
        }
        if (this.b == 0) {
            return null;
        }
        return ((BlockModel) this.b).style;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0127  */
    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View a(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.render.component.a.a(android.content.Context):android.view.View");
    }

    public static /* synthetic */ int a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f32d05b", new Object[]{jSONObject, jSONObject2})).intValue();
        }
        try {
            return jSONObject.getJSONObject("style").getIntValue(com.taobao.android.weex_framework.util.a.ATOM_EXT_zIndex) - jSONObject2.getJSONObject("style").getIntValue(com.taobao.android.weex_framework.util.a.ATOM_EXT_zIndex);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public /* synthetic */ void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.f22246a.e().a(this.f22246a, "click", ((BlockModel) this.b).animation, this.c, this.b, new l.b() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$a$fcYuh-5oLHt2ivPUuJtPcGuQQLc
                @Override // com.taobao.tbpoplayer.nativerender.l.b
                public final void onAnimationEnd() {
                    a.m1458lambda$fcYuh5oLHt2ivPUuJtPcGuQQLc(a.this);
                }
            });
        }
    }

    public /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.f22246a.a(this.b, "click", ((BlockModel) this.b).action, ((BlockModel) this.b).actions);
        }
    }

    public /* synthetic */ boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        this.f22246a.a(this.b, "longClick", ((BlockModel) this.b).action, ((BlockModel) this.b).actions);
        return true;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (c cVar : this.e) {
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (c cVar : this.e) {
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        for (c cVar : this.e) {
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        for (c cVar : this.e) {
            if (cVar != null) {
                cVar.e();
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        for (c cVar : this.e) {
            if (cVar != null) {
                cVar.f();
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void bh_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        super.bh_();
        for (c cVar : this.e) {
            if (cVar != null) {
                cVar.bh_();
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void a(final e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad932ea8", new Object[]{this, bVar});
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        final int size = this.e.size();
        this.f22246a.e().a(this.f22246a, "close", ((BlockModel) this.b).animation, this.c, this.b, new l.b() { // from class: com.taobao.tbpoplayer.nativerender.render.component.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.tbpoplayer.nativerender.l.b
            public void onAnimationEnd() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c281bbd", new Object[]{this});
                    return;
                }
                com.alibaba.poplayer.utils.c.a("Block.onPreClose.onAnimationEnd.id=" + ((BlockModel) a.this.b).id, new Object[0]);
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() != size + 1) {
                    return;
                }
                com.alibaba.poplayer.utils.c.a("Block.onPreClose.onAnimationEnd.全部执行结束.id=" + ((BlockModel) a.this.b).id, new Object[0]);
                e.b bVar2 = bVar;
                if (bVar2 == null) {
                    return;
                }
                bVar2.onPreCloseDone(false);
            }
        });
        for (final c cVar : this.e) {
            if (cVar != null) {
                cVar.a(new e.b() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$a$Oshn9dE9g8kPpHC98dJVhmjSTAE
                    @Override // com.taobao.tbpoplayer.nativerender.e.b
                    public final void onPreCloseDone(boolean z) {
                        a.this.a(cVar, atomicInteger, size, bVar, z);
                    }
                });
            }
        }
    }

    public /* synthetic */ void a(c cVar, AtomicInteger atomicInteger, int i, e.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a02391e", new Object[]{this, cVar, atomicInteger, new Integer(i), bVar, new Boolean(z)});
            return;
        }
        com.alibaba.poplayer.utils.c.a("Block.onPreClose.onAnimationEnd.子元素执行结束.id=" + ((BlockModel) this.b).id + ".childComponent=" + cVar.n().id, new Object[0]);
        atomicInteger.getAndIncrement();
        if (atomicInteger.get() != i + 1) {
            return;
        }
        com.alibaba.poplayer.utils.c.a("Block.onPreClose.onAnimationEnd.全部执行结束.id=" + ((BlockModel) this.b).id + ".childComponent=" + cVar.n().id, new Object[0]);
        if (bVar == null) {
            return;
        }
        bVar.onPreCloseDone(false);
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        super.a(str, jSONObject);
        for (c cVar : this.e) {
            if (cVar != null) {
                cVar.a(str, jSONObject);
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        boolean a2 = super.a(str, str2);
        if (!a2) {
            for (c cVar : this.e) {
                if (cVar != null && cVar.a(str, str2)) {
                    return true;
                }
            }
        }
        return a2;
    }
}
