package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.transition.Transition;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TransitionSet extends Transition {
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<Transition> f1262a;
    private boolean b;
    private int c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends ad {

        /* renamed from: a  reason: collision with root package name */
        TransitionSet f1264a;

        a(TransitionSet transitionSet) {
            this.f1264a = transitionSet;
        }

        @Override // android.support.transition.ad, android.support.transition.Transition.d
        public void b(Transition transition) {
            TransitionSet.b(this.f1264a);
            if (this.f1264a.c == 0) {
                this.f1264a.d = false;
                this.f1264a.end();
            }
            transition.removeListener(this);
        }

        @Override // android.support.transition.ad, android.support.transition.Transition.d
        public void e(Transition transition) {
            if (!this.f1264a.d) {
                this.f1264a.start();
                this.f1264a.d = true;
            }
        }
    }

    public TransitionSet() {
        this.f1262a = new ArrayList<>();
        this.b = true;
        this.d = false;
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1262a = new ArrayList<>();
        this.b = true;
        this.d = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.i);
        a(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    private void a() {
        a aVar = new a(this);
        Iterator<Transition> it = this.f1262a.iterator();
        while (it.hasNext()) {
            it.next().addListener(aVar);
        }
        this.c = this.f1262a.size();
    }

    static /* synthetic */ int b(TransitionSet transitionSet) {
        int i = transitionSet.c - 1;
        transitionSet.c = i;
        return i;
    }

    public TransitionSet a(int i) {
        if (i == 0) {
            this.b = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.b = false;
        }
        return this;
    }

    @Override // android.support.transition.Transition
    /* renamed from: a */
    public TransitionSet setDuration(long j) {
        super.setDuration(j);
        if (this.mDuration >= 0) {
            int size = this.f1262a.size();
            for (int i = 0; i < size; i++) {
                this.f1262a.get(i).setDuration(j);
            }
        }
        return this;
    }

    @Override // android.support.transition.Transition
    /* renamed from: a */
    public TransitionSet setInterpolator(TimeInterpolator timeInterpolator) {
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @Override // android.support.transition.Transition
    /* renamed from: a */
    public TransitionSet addListener(Transition.d dVar) {
        return (TransitionSet) super.addListener(dVar);
    }

    public TransitionSet a(Transition transition) {
        this.f1262a.add(transition);
        transition.mParent = this;
        if (this.mDuration >= 0) {
            transition.setDuration(this.mDuration);
        }
        return this;
    }

    @Override // android.support.transition.Transition
    /* renamed from: a */
    public TransitionSet addTarget(View view) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    /* renamed from: a */
    public TransitionSet setSceneRoot(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            this.f1262a.get(i).setSceneRoot(viewGroup);
        }
        return this;
    }

    @Override // android.support.transition.Transition
    /* renamed from: a */
    public TransitionSet addTarget(Class cls) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // android.support.transition.Transition
    /* renamed from: a */
    public TransitionSet addTarget(String str) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // android.support.transition.Transition
    /* renamed from: b */
    public TransitionSet addTarget(int i) {
        for (int i2 = 0; i2 < this.f1262a.size(); i2++) {
            this.f1262a.get(i2).addTarget(i);
        }
        return (TransitionSet) super.addTarget(i);
    }

    @Override // android.support.transition.Transition
    /* renamed from: b */
    public TransitionSet setStartDelay(long j) {
        return (TransitionSet) super.setStartDelay(j);
    }

    @Override // android.support.transition.Transition
    /* renamed from: b */
    public TransitionSet removeListener(Transition.d dVar) {
        return (TransitionSet) super.removeListener(dVar);
    }

    @Override // android.support.transition.Transition
    /* renamed from: b */
    public TransitionSet removeTarget(View view) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // android.support.transition.Transition
    /* renamed from: b */
    public TransitionSet removeTarget(Class cls) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // android.support.transition.Transition
    /* renamed from: b */
    public TransitionSet removeTarget(String str) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }

    @Override // android.support.transition.Transition
    /* renamed from: c */
    public TransitionSet removeTarget(int i) {
        for (int i2 = 0; i2 < this.f1262a.size(); i2++) {
            this.f1262a.get(i2).removeTarget(i);
        }
        return (TransitionSet) super.removeTarget(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    public void cancel() {
        super.cancel();
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            this.f1262a.get(i).cancel();
        }
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(ah ahVar) {
        if (isValidTarget(ahVar.b)) {
            Iterator<Transition> it = this.f1262a.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(ahVar.b)) {
                    next.captureEndValues(ahVar);
                    ahVar.c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public void capturePropagationValues(ah ahVar) {
        super.capturePropagationValues(ahVar);
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            this.f1262a.get(i).capturePropagationValues(ahVar);
        }
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(ah ahVar) {
        if (isValidTarget(ahVar.b)) {
            Iterator<Transition> it = this.f1262a.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(ahVar.b)) {
                    next.captureStartValues(ahVar);
                    ahVar.c.add(next);
                }
            }
        }
    }

    @Override // android.support.transition.Transition
    /* renamed from: clone */
    public Transition mo19clone() {
        TransitionSet transitionSet = (TransitionSet) super.m18clone();
        transitionSet.f1262a = new ArrayList<>();
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            transitionSet.a(this.f1262a.get(i).m18clone());
        }
        return transitionSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    public void createAnimators(ViewGroup viewGroup, ai aiVar, ai aiVar2, ArrayList<ah> arrayList, ArrayList<ah> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f1262a.get(i);
            if (startDelay > 0 && (this.b || i == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, aiVar, aiVar2, arrayList, arrayList2);
        }
    }

    @Override // android.support.transition.Transition
    public Transition excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f1262a.size(); i2++) {
            this.f1262a.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // android.support.transition.Transition
    public Transition excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // android.support.transition.Transition
    public Transition excludeTarget(Class cls, boolean z) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // android.support.transition.Transition
    public Transition excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            this.f1262a.get(i).forceToEnd(viewGroup);
        }
    }

    @Override // android.support.transition.Transition
    public void pause(View view) {
        super.pause(view);
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            this.f1262a.get(i).pause(view);
        }
    }

    @Override // android.support.transition.Transition
    public void resume(View view) {
        super.resume(view);
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            this.f1262a.get(i).resume(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.transition.Transition
    public void runAnimators() {
        if (this.f1262a.isEmpty()) {
            start();
            end();
            return;
        }
        a();
        if (this.b) {
            Iterator<Transition> it = this.f1262a.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        for (int i = 1; i < this.f1262a.size(); i++) {
            final Transition transition = this.f1262a.get(i);
            this.f1262a.get(i - 1).addListener(new ad() { // from class: android.support.transition.TransitionSet.1
                @Override // android.support.transition.ad, android.support.transition.Transition.d
                public void b(Transition transition2) {
                    transition.runAnimators();
                    transition2.removeListener(this);
                }
            });
        }
        Transition transition2 = this.f1262a.get(0);
        if (transition2 == null) {
            return;
        }
        transition2.runAnimators();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            this.f1262a.get(i).setCanRemoveViews(z);
        }
    }

    @Override // android.support.transition.Transition
    public void setEpicenterCallback(Transition.c cVar) {
        super.setEpicenterCallback(cVar);
        int size = this.f1262a.size();
        for (int i = 0; i < size; i++) {
            this.f1262a.get(i).setEpicenterCallback(cVar);
        }
    }

    @Override // android.support.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        for (int i = 0; i < this.f1262a.size(); i++) {
            this.f1262a.get(i).setPathMotion(pathMotion);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.transition.Transition
    public String toString(String str) {
        String transition = super.toString(str);
        for (int i = 0; i < this.f1262a.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(transition);
            sb.append("\n");
            sb.append(this.f1262a.get(i).toString(str + "  "));
            transition = sb.toString();
        }
        return transition;
    }
}
