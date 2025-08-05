package com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;
import tb.kre;

/* loaded from: classes5.dex */
public class AnimationUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final kre f13797a;
    private Animator b;

    static {
        kge.a(-552598101);
    }

    public static /* synthetic */ Animator a(AnimationUtils animationUtils, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("b83ea86a", new Object[]{animationUtils, animator});
        }
        animationUtils.b = animator;
        return animator;
    }

    public AnimationUtils(kre kreVar) {
        this.f13797a = kreVar;
    }

    public Animator a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("5db56a8b", new Object[]{this});
        }
        kre kreVar = this.f13797a;
        if (kreVar != null && kreVar.b == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f13797a.b, "scaleX", 0.5f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f13797a.b, "scaleY", 0.5f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f13797a.b, "translationY", this.f13797a.a(40), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setDuration(300L);
        animatorSet.addListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: INVOKE  
              (r6v2 'animatorSet' android.animation.AnimatorSet)
              (wrap: android.animation.Animator$AnimatorListener : 0x0071: CONSTRUCTOR  (r0v6 android.animation.Animator$AnimatorListener A[REMOVE]) = 
              (r9v0 'this' com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
             call: tb.krd.1.<init>(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.a():android.animation.Animator, file: classes5.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.krd, state: NOT_LOADED
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
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r2 = "5db56a8b"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            android.animation.Animator r0 = (android.animation.Animator) r0
            return r0
        L15:
            tb.kre r0 = r9.f13797a
            if (r0 == 0) goto L1f
            android.view.View r0 = r0.b
            if (r0 != 0) goto L1f
            r0 = 0
            return r0
        L1f:
            tb.kre r0 = r9.f13797a
            android.view.View r0 = r0.b
            r1 = 2
            float[] r4 = new float[r1]
            r4 = {x007e: FILL_ARRAY_DATA  , data: [1056964608, 1065353216} // fill-array
            java.lang.String r5 = "scaleX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r5, r4)
            tb.kre r4 = r9.f13797a
            android.view.View r4 = r4.b
            float[] r5 = new float[r1]
            r5 = {x0086: FILL_ARRAY_DATA  , data: [1056964608, 1065353216} // fill-array
            java.lang.String r6 = "scaleY"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r6, r5)
            tb.kre r5 = r9.f13797a
            android.view.View r5 = r5.b
            float[] r6 = new float[r1]
            tb.kre r7 = r9.f13797a
            r8 = 40
            int r7 = r7.a(r8)
            float r7 = (float) r7
            r6[r2] = r7
            r7 = 0
            r6[r3] = r7
            java.lang.String r7 = "translationY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r7, r6)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r7 = 3
            android.animation.Animator[] r7 = new android.animation.Animator[r7]
            r7[r2] = r0
            r7[r3] = r4
            r7[r1] = r5
            r6.playTogether(r7)
            r0 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r0)
            tb.krd$1 r0 = new tb.krd$1
            r0.<init>(r9)
            r6.addListener(r0)
            r6.start()
            r9.b = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.a():android.animation.Animator");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kre kreVar = this.f13797a;
        if (kreVar != null && kreVar.b == null) {
            this.f13797a.d();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f13797a.b, "scaleX", 1.0f, 0.5f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f13797a.b, "scaleY", 1.0f, 0.5f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f13797a.b, "translationY", 0.0f, this.f13797a.a(40));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setDuration(300L);
        animatorSet.addListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0075: INVOKE  
              (r6v2 'animatorSet' android.animation.AnimatorSet)
              (wrap: android.animation.Animator$AnimatorListener : 0x0072: CONSTRUCTOR  (r0v6 android.animation.Animator$AnimatorListener A[REMOVE]) = 
              (r9v0 'this' com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
             call: tb.krd.2.<init>(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.b():void, file: classes5.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.krd, state: NOT_LOADED
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
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r2 = "57a83e9"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            tb.kre r0 = r9.f13797a
            if (r0 == 0) goto L20
            android.view.View r0 = r0.b
            if (r0 != 0) goto L20
            tb.kre r0 = r9.f13797a
            r0.d()
            return
        L20:
            tb.kre r0 = r9.f13797a
            android.view.View r0 = r0.b
            r1 = 2
            float[] r4 = new float[r1]
            r4 = {x007e: FILL_ARRAY_DATA  , data: [1065353216, 1056964608} // fill-array
            java.lang.String r5 = "scaleX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r5, r4)
            tb.kre r4 = r9.f13797a
            android.view.View r4 = r4.b
            float[] r5 = new float[r1]
            r5 = {x0086: FILL_ARRAY_DATA  , data: [1065353216, 1056964608} // fill-array
            java.lang.String r6 = "scaleY"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r6, r5)
            tb.kre r5 = r9.f13797a
            android.view.View r5 = r5.b
            float[] r6 = new float[r1]
            r7 = 0
            r6[r2] = r7
            tb.kre r7 = r9.f13797a
            r8 = 40
            int r7 = r7.a(r8)
            float r7 = (float) r7
            r6[r3] = r7
            java.lang.String r7 = "translationY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r7, r6)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r7 = 3
            android.animation.Animator[] r7 = new android.animation.Animator[r7]
            r7[r2] = r0
            r7[r3] = r4
            r7[r1] = r5
            r6.playTogether(r7)
            r0 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r0)
            tb.krd$2 r0 = new tb.krd$2
            r0.<init>(r9)
            r6.addListener(r0)
            r6.start()
            r9.b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.b():void");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = i - this.f13797a.d;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(d());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.addListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003d: INVOKE  
              (r4v2 'animatorSet' android.animation.AnimatorSet)
              (wrap: android.animation.Animator$AnimatorListener : 0x003a: CONSTRUCTOR  (r0v4 android.animation.Animator$AnimatorListener A[REMOVE]) = 
              (r3v0 'this' com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
             call: tb.krd.3.<init>(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.a(int):void, file: classes5.dex
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
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:371)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:272)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.krd, state: NOT_LOADED
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
            	... 19 more
            */
        /*
            this = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r4)
            r4 = 1
            r1[r4] = r2
            java.lang.String r4 = "a821939b"
            r0.ipc$dispatch(r4, r1)
            return
        L1a:
            tb.kre r0 = r3.f13797a
            int r0 = r0.d
            int r4 = r4 - r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L24:
            if (r2 >= r4) goto L30
            android.animation.AnimatorSet r1 = r3.d()
            r0.add(r1)
            int r2 = r2 + 1
            goto L24
        L30:
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r4.playSequentially(r0)
            tb.krd$3 r0 = new tb.krd$3
            r0.<init>(r3)
            r4.addListener(r0)
            r4.start()
            r3.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.a(int):void");
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = i - this.f13797a.d;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (a() != null) {
            arrayList.add(a());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(e());
        }
        animatorSet.playSequentially(arrayList);
        animatorSet.addListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004a: INVOKE  
              (r0v3 'animatorSet' android.animation.AnimatorSet)
              (wrap: android.animation.Animator$AnimatorListener : 0x0047: CONSTRUCTOR  (r5v2 android.animation.Animator$AnimatorListener A[REMOVE]) = 
              (r4v0 'this' com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
             call: tb.krd.4.<init>(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.b(int):void, file: classes5.dex
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
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:371)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:272)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.krd, state: NOT_LOADED
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
            	... 19 more
            */
        /*
            this = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r5 = 1
            r1[r5] = r2
            java.lang.String r5 = "a9d66c3a"
            r0.ipc$dispatch(r5, r1)
            return
        L1a:
            tb.kre r0 = r4.f13797a
            int r0 = r0.d
            int r5 = r5 - r0
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.animation.Animator r3 = r4.a()
            if (r3 == 0) goto L36
            android.animation.Animator r3 = r4.a()
            r1.add(r3)
        L36:
            if (r2 >= r5) goto L42
            android.animation.AnimatorSet r3 = r4.e()
            r1.add(r3)
            int r2 = r2 + 1
            goto L36
        L42:
            r0.playSequentially(r1)
            tb.krd$4 r5 = new tb.krd$4
            r5.<init>(r4)
            r0.addListener(r5)
            r0.start()
            r4.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.b(int):void");
    }

    private AnimatorSet d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("2f30372c", new Object[]{this});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0029: INVOKE  
              (r1v2 'ofFloat' android.animation.ValueAnimator)
              (wrap: android.animation.Animator$AnimatorListener : 0x0026: CONSTRUCTOR  (r6v0 android.animation.Animator$AnimatorListener A[REMOVE]) = 
              (r7v0 'this' com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
             call: tb.krd.5.<init>(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.animation.ValueAnimator.addListener(android.animation.Animator$AnimatorListener):void in method: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.d():android.animation.AnimatorSet, file: classes5.dex
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
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:371)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:272)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.krd, state: NOT_LOADED
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
            	... 19 more
            */
        /*
            this = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r7
            java.lang.String r2 = "2f30372c"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            return r0
        L15:
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0048: FILL_ARRAY_DATA  , data: [1065353216, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r4 = 250(0xfa, double:1.235E-321)
            r1.setDuration(r4)
            tb.krd$5 r6 = new tb.krd$5
            r6.<init>(r7)
            r1.addListener(r6)
            float[] r6 = new float[r0]
            r6 = {x0050: FILL_ARRAY_DATA  , data: [1065353216, 1065353216} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r6)
            r6.setDuration(r4)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r3] = r1
            r0[r2] = r6
            r4.playSequentially(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.d():android.animation.AnimatorSet");
    }

    private AnimatorSet e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("9608f6ed", new Object[]{this});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.15f);
        ofFloat.addUpdateListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE  
              (r1v2 'ofFloat' android.animation.ValueAnimator)
              (wrap: android.animation.ValueAnimator$AnimatorUpdateListener : 0x0021: CONSTRUCTOR  (r4v0 android.animation.ValueAnimator$AnimatorUpdateListener A[REMOVE]) = 
              (r8v0 'this' com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
             call: tb.krd.6.<init>(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.animation.ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener):void in method: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.e():android.animation.AnimatorSet, file: classes5.dex
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
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:371)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:272)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: tb.krd, state: NOT_LOADED
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
            	... 19 more
            */
        /*
            this = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            java.lang.String r2 = "9608f6ed"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            return r0
        L15:
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0058: FILL_ARRAY_DATA  , data: [1065353216, 1066611507} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            tb.krd$6 r4 = new tb.krd$6
            r4.<init>(r8)
            r1.addUpdateListener(r4)
            r4 = 250(0xfa, double:1.235E-321)
            r1.setDuration(r4)
            tb.krd$7 r6 = new tb.krd$7
            r6.<init>(r8)
            r1.addListener(r6)
            float[] r6 = new float[r0]
            r6 = {x0060: FILL_ARRAY_DATA  , data: [1066611507, 1065353216} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r6)
            tb.krd$8 r7 = new tb.krd$8
            r7.<init>(r8)
            r6.addUpdateListener(r7)
            r6.setDuration(r4)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r3] = r1
            r0[r2] = r6
            r4.playSequentially(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils.e():android.animation.AnimatorSet");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Animator animator = this.b;
        if (animator == null) {
            return;
        }
        animator.cancel();
        this.b = null;
    }
}
