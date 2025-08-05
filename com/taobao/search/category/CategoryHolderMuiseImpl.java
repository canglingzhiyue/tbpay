package com.taobao.search.category;

import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.weex.weex.h;
import tb.isr;
import tb.kge;
import tb.quq;

/* loaded from: classes5.dex */
public class CategoryHolderMuiseImpl extends LifecycleAdapterCategoryHolder implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f19021a;
    private quq b;
    private FrameLayout c;

    static {
        kge.a(642950444);
        kge.a(502437767);
    }

    public static /* synthetic */ Object ipc$super(CategoryHolderMuiseImpl categoryHolderMuiseImpl, String str, Object... objArr) {
        if (str.hashCode() == 96532846) {
            super.g();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.category.LifecycleAdapterCategoryHolder
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        p pVar = this.f19021a;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.c.post(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: INVOKE  
              (wrap: android.widget.FrameLayout : 0x0020: IGET  (r0v3 android.widget.FrameLayout A[REMOVE]) = (r3v0 'this' com.taobao.search.category.CategoryHolderMuiseImpl A[IMMUTABLE_TYPE, THIS]) com.taobao.search.category.CategoryHolderMuiseImpl.c android.widget.FrameLayout)
              (wrap: java.lang.Runnable : 0x0024: CONSTRUCTOR  (r1v1 java.lang.Runnable A[REMOVE]) = (r3v0 'this' com.taobao.search.category.CategoryHolderMuiseImpl A[DONT_INLINE, IMMUTABLE_TYPE, THIS]) call: tb.qup.1.<init>(com.taobao.search.category.CategoryHolderMuiseImpl):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.FrameLayout.post(java.lang.Runnable):boolean in method: com.taobao.search.category.CategoryHolderMuiseImpl.g():void, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:371)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:272)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.qup, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:303)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1036)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:837)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:399)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
            	... 23 more
            */
        /*
            this = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.category.CategoryHolderMuiseImpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r2 = "5c0f96e"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            super.g()
            com.taobao.android.weex_framework.p r0 = r3.f19021a
            if (r0 == 0) goto L2a
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L20
            goto L2a
        L20:
            android.widget.FrameLayout r0 = r3.c
            tb.qup$1 r1 = new tb.qup$1
            r1.<init>(r3)
            r0.post(r1)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.category.CategoryHolderMuiseImpl.g():void");
    }

    @Override // com.taobao.search.category.LifecycleAdapterCategoryHolder
    public void onActivityDestroyInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01a1cf0", new Object[]{this});
        } else {
            g();
        }
    }

    @Override // com.taobao.search.category.LifecycleAdapterCategoryHolder
    public void onActivityStartInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762981d8", new Object[]{this});
            return;
        }
        p pVar = this.f19021a;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.f19021a.onActivityStart();
    }

    @Override // com.taobao.search.category.LifecycleAdapterCategoryHolder
    public void onActivityStopInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfed8c14", new Object[]{this});
            return;
        }
        p pVar = this.f19021a;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.f19021a.onActivityStop();
    }

    @Override // com.taobao.search.category.LifecycleAdapterCategoryHolder
    public void onActivityPauseInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ad256c", new Object[]{this});
            return;
        }
        p pVar = this.f19021a;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.f19021a.onActivityPause();
        this.f19021a.onActivityStop();
    }

    @Override // com.taobao.search.category.LifecycleAdapterCategoryHolder
    public void onActivityResumeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1240903f", new Object[]{this});
            return;
        }
        p pVar = this.f19021a;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.f19021a.onActivityStart();
        this.f19021a.onActivityResume();
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (!"switchHomeTabIcon".equals(str) || this.b == null || jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("eventName");
        if (!"showRocket".equals(string)) {
            "showIcon".equals(string);
        }
        return true;
    }
}
