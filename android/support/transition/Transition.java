package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<ah> mEndValuesList;
    private c mEpicenterCallback;
    private ArrayMap<String, String> mNameOverrides;
    af mPropagation;
    private ArrayList<ah> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final PathMotion STRAIGHT_PATH_MOTION = new PathMotion() { // from class: android.support.transition.Transition.1
        @Override // android.support.transition.PathMotion
        public Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static ThreadLocal<ArrayMap<Animator, a>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class> mTargetTypeChildExcludes = null;
    private ai mStartValues = new ai();
    private ai mEndValues = new ai();
    TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    private ViewGroup mSceneRoot = null;
    boolean mCanRemoveViews = false;
    private ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<d> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MatchOrder {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        View f1261a;
        String b;
        ah c;
        bd d;
        Transition e;

        a(View view, String str, Transition transition, bd bdVar, ah ahVar) {
            this.f1261a = view;
            this.b = str;
            this.c = ahVar;
            this.d = bdVar;
            this.e = transition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {
        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t) {
            if (arrayList != null) {
                arrayList.remove(t);
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                return null;
            }
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract Rect a(Transition transition);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(Transition transition);

        void b(Transition transition);

        void c(Transition transition);

        void d(Transition transition);

        void e(Transition transition);
    }

    public Transition() {
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = TypedArrayUtils.getNamedInt(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        String namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            setMatchOrder(parseMatchOrder(namedString));
        }
        obtainStyledAttributes.recycle();
    }

    private void addUnmatched(ArrayMap<View, ah> arrayMap, ArrayMap<View, ah> arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            ah valueAt = arrayMap.valueAt(i);
            if (isValidTarget(valueAt.b)) {
                this.mStartValuesList.add(valueAt);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            ah valueAt2 = arrayMap2.valueAt(i2);
            if (isValidTarget(valueAt2.b)) {
                this.mEndValuesList.add(valueAt2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(ai aiVar, View view, ah ahVar) {
        aiVar.f1278a.put(view, ahVar);
        int id = view.getId();
        if (id >= 0) {
            if (aiVar.b.indexOfKey(id) >= 0) {
                aiVar.b.put(id, null);
            } else {
                aiVar.b.put(id, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (aiVar.d.containsKey(transitionName)) {
                aiVar.d.put(transitionName, null);
            } else {
                aiVar.d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            if (aiVar.c.indexOfKey(itemIdAtPosition) < 0) {
                ViewCompat.setHasTransientState(view, true);
                aiVar.c.put(itemIdAtPosition, view);
                return;
            }
            View view2 = aiVar.c.get(itemIdAtPosition);
            if (view2 == null) {
                return;
            }
            ViewCompat.setHasTransientState(view2, false);
            aiVar.c.put(itemIdAtPosition, null);
        }
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.mTargetExcludes;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class> arrayList3 = this.mTargetTypeExcludes;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ah ahVar = new ah();
            ahVar.b = view;
            if (z) {
                captureStartValues(ahVar);
            } else {
                captureEndValues(ahVar);
            }
            ahVar.c.add(this);
            capturePropagationValues(ahVar);
            addViewValues(z ? this.mStartValues : this.mEndValues, view, ahVar);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
        if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
        if (arrayList5 != null && arrayList5.contains(view)) {
            return;
        }
        ArrayList<Class> arrayList6 = this.mTargetTypeChildExcludes;
        if (arrayList6 != null) {
            int size2 = arrayList6.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                    return;
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            captureHierarchy(viewGroup.getChildAt(i3), z);
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        return i > 0 ? z ? b.a(arrayList, Integer.valueOf(i)) : b.b(arrayList, Integer.valueOf(i)) : arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        return t != null ? z ? b.a(arrayList, t) : b.b(arrayList, t) : arrayList;
    }

    private ArrayList<Class> excludeType(ArrayList<Class> arrayList, Class cls, boolean z) {
        return cls != null ? z ? b.a(arrayList, cls) : b.b(arrayList, cls) : arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? b.a(arrayList, view) : b.b(arrayList, view) : arrayList;
    }

    private static ArrayMap<Animator, a> getRunningAnimators() {
        ArrayMap<Animator, a> arrayMap = sRunningAnimators.get();
        if (arrayMap == null) {
            ArrayMap<Animator, a> arrayMap2 = new ArrayMap<>();
            sRunningAnimators.set(arrayMap2);
            return arrayMap2;
        }
        return arrayMap;
    }

    private static boolean isValidMatch(int i) {
        return i > 0 && i <= 4;
    }

    private static boolean isValueChanged(ah ahVar, ah ahVar2, String str) {
        Object obj = ahVar.f1277a.get(str);
        Object obj2 = ahVar2.f1277a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    private void matchIds(ArrayMap<View, ah> arrayMap, ArrayMap<View, ah> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                ah ahVar = arrayMap.get(valueAt);
                ah ahVar2 = arrayMap2.get(view);
                if (ahVar != null && ahVar2 != null) {
                    this.mStartValuesList.add(ahVar);
                    this.mEndValuesList.add(ahVar2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchInstances(ArrayMap<View, ah> arrayMap, ArrayMap<View, ah> arrayMap2) {
        ah remove;
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View keyAt = arrayMap.keyAt(size);
            if (keyAt != null && isValidTarget(keyAt) && (remove = arrayMap2.remove(keyAt)) != null && remove.b != null && isValidTarget(remove.b)) {
                this.mStartValuesList.add(arrayMap.removeAt(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(ArrayMap<View, ah> arrayMap, ArrayMap<View, ah> arrayMap2, LongSparseArray<View> longSparseArray, LongSparseArray<View> longSparseArray2) {
        View view;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = longSparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = longSparseArray2.get(longSparseArray.keyAt(i))) != null && isValidTarget(view)) {
                ah ahVar = arrayMap.get(valueAt);
                ah ahVar2 = arrayMap2.get(view);
                if (ahVar != null && ahVar2 != null) {
                    this.mStartValuesList.add(ahVar);
                    this.mEndValuesList.add(ahVar2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchNames(ArrayMap<View, ah> arrayMap, ArrayMap<View, ah> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
        View view;
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            View valueAt = arrayMap3.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i))) != null && isValidTarget(view)) {
                ah ahVar = arrayMap.get(valueAt);
                ah ahVar2 = arrayMap2.get(view);
                if (ahVar != null && ahVar2 != null) {
                    this.mStartValuesList.add(ahVar);
                    this.mEndValuesList.add(ahVar2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(ai aiVar, ai aiVar2) {
        ArrayMap<View, ah> arrayMap = new ArrayMap<>(aiVar.f1278a);
        ArrayMap<View, ah> arrayMap2 = new ArrayMap<>(aiVar2.f1278a);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i >= iArr.length) {
                addUnmatched(arrayMap, arrayMap2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                matchInstances(arrayMap, arrayMap2);
            } else if (i2 == 2) {
                matchNames(arrayMap, arrayMap2, aiVar.d, aiVar2.d);
            } else if (i2 == 3) {
                matchIds(arrayMap, arrayMap2, aiVar.b, aiVar2.b);
            } else if (i2 == 4) {
                matchItemIds(arrayMap, arrayMap2, aiVar.c, aiVar2.c);
            }
            i++;
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (!trim.isEmpty()) {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            } else {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, final ArrayMap<Animator, a> arrayMap) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.Transition.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    arrayMap.remove(animator2);
                    Transition.this.mCurrentAnimators.remove(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    Transition.this.mCurrentAnimators.add(animator2);
                }
            });
            animate(animator);
        }
    }

    public Transition addListener(d dVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(dVar);
        return this;
    }

    public Transition addTarget(int i) {
        if (i > 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    public Transition addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public Transition addTarget(Class cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public Transition addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    protected void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.Transition.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                Transition.this.end();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<d> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((d) arrayList2.get(i)).a(this);
        }
    }

    public abstract void captureEndValues(ah ahVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void capturePropagationValues(ah ahVar) {
        String[] a2;
        if (this.mPropagation == null || ahVar.f1277a.isEmpty() || (a2 = this.mPropagation.a()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a2.length) {
                z = true;
                break;
            } else if (!ahVar.f1277a.containsKey(a2[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.mPropagation.a(ahVar);
    }

    public abstract void captureStartValues(ah ahVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        ArrayMap<String, String> arrayMap;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (findViewById != null) {
                    ah ahVar = new ah();
                    ahVar.b = findViewById;
                    if (z) {
                        captureStartValues(ahVar);
                    } else {
                        captureEndValues(ahVar);
                    }
                    ahVar.c.add(this);
                    capturePropagationValues(ahVar);
                    addViewValues(z ? this.mStartValues : this.mEndValues, findViewById, ahVar);
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                ah ahVar2 = new ah();
                ahVar2.b = view;
                if (z) {
                    captureStartValues(ahVar2);
                } else {
                    captureEndValues(ahVar2);
                }
                ahVar2.c.add(this);
                capturePropagationValues(ahVar2);
                addViewValues(z ? this.mStartValues : this.mEndValues, view, ahVar2);
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (z || (arrayMap = this.mNameOverrides) == null) {
            return;
        }
        int size = arrayMap.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.mStartValues.d.remove(this.mNameOverrides.keyAt(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.d.put(this.mNameOverrides.valueAt(i4), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearValues(boolean z) {
        ai aiVar;
        if (z) {
            this.mStartValues.f1278a.clear();
            this.mStartValues.b.clear();
            aiVar = this.mStartValues;
        } else {
            this.mEndValues.f1278a.clear();
            this.mEndValues.b.clear();
            aiVar = this.mEndValues;
        }
        aiVar.c.clear();
    }

    /* renamed from: clone */
    public Transition m18clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new ai();
            transition.mEndValues = new ai();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createAnimators(ViewGroup viewGroup, ai aiVar, ai aiVar2, ArrayList<ah> arrayList, ArrayList<ah> arrayList2) {
        Animator createAnimator;
        int i;
        int i2;
        View view;
        Animator animator;
        ah ahVar;
        Animator animator2;
        ah ahVar2;
        ArrayMap<Animator, a> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            ah ahVar3 = arrayList.get(i3);
            ah ahVar4 = arrayList2.get(i3);
            if (ahVar3 != null && !ahVar3.c.contains(this)) {
                ahVar3 = null;
            }
            if (ahVar4 != null && !ahVar4.c.contains(this)) {
                ahVar4 = null;
            }
            if (ahVar3 != null || ahVar4 != null) {
                if ((ahVar3 == null || ahVar4 == null || isTransitionRequired(ahVar3, ahVar4)) && (createAnimator = createAnimator(viewGroup, ahVar3, ahVar4)) != null) {
                    if (ahVar4 != null) {
                        view = ahVar4.b;
                        String[] transitionProperties = getTransitionProperties();
                        if (view == null || transitionProperties == null || transitionProperties.length <= 0) {
                            animator2 = createAnimator;
                            i = size;
                            i2 = i3;
                            ahVar2 = null;
                        } else {
                            ahVar2 = new ah();
                            ahVar2.b = view;
                            animator2 = createAnimator;
                            i = size;
                            ah ahVar5 = aiVar2.f1278a.get(view);
                            if (ahVar5 != null) {
                                int i4 = 0;
                                while (i4 < transitionProperties.length) {
                                    ahVar2.f1277a.put(transitionProperties[i4], ahVar5.f1277a.get(transitionProperties[i4]));
                                    i4++;
                                    i3 = i3;
                                    ahVar5 = ahVar5;
                                }
                            }
                            i2 = i3;
                            int size2 = runningAnimators.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                a aVar = runningAnimators.get(runningAnimators.keyAt(i5));
                                if (aVar.c != null && aVar.f1261a == view && aVar.b.equals(getName()) && aVar.c.equals(ahVar2)) {
                                    ahVar = ahVar2;
                                    animator = null;
                                    break;
                                }
                            }
                        }
                        ahVar = ahVar2;
                        animator = animator2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = ahVar3.b;
                        animator = createAnimator;
                        ahVar = null;
                    }
                    if (animator != null) {
                        af afVar = this.mPropagation;
                        if (afVar != null) {
                            long a2 = afVar.a(viewGroup, this, ahVar3, ahVar4);
                            sparseIntArray.put(this.mAnimators.size(), (int) a2);
                            j = Math.min(a2, j);
                        }
                        runningAnimators.put(animator, new a(view, getName(), this, at.b(viewGroup), ahVar));
                        this.mAnimators.add(animator);
                        j = j;
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (j != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((sparseIntArray.valueAt(i6) - j) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void end() {
        this.mNumInstances--;
        if (this.mNumInstances == 0) {
            ArrayList<d> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).b(this);
                }
            }
            for (int i2 = 0; i2 < this.mStartValues.c.size(); i2++) {
                View valueAt = this.mStartValues.c.valueAt(i2);
                if (valueAt != null) {
                    ViewCompat.setHasTransientState(valueAt, false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.c.size(); i3++) {
                View valueAt2 = this.mEndValues.c.valueAt(i3);
                if (valueAt2 != null) {
                    ViewCompat.setHasTransientState(valueAt2, false);
                }
            }
            this.mEnded = true;
        }
    }

    public Transition excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    public Transition excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public Transition excludeChildren(Class cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    public Transition excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    public Transition excludeTarget(View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    public Transition excludeTarget(Class cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public Transition excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void forceToEnd(ViewGroup viewGroup) {
        ArrayMap<Animator, a> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup != null) {
            bd b2 = at.b(viewGroup);
            for (int i = size - 1; i >= 0; i--) {
                a valueAt = runningAnimators.valueAt(i);
                if (valueAt.f1261a != null && b2 != null && b2.equals(valueAt.d)) {
                    runningAnimators.keyAt(i).end();
                }
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        c cVar = this.mEpicenterCallback;
        if (cVar == null) {
            return null;
        }
        return cVar.a(this);
    }

    public c getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah getMatchedTransitionValues(View view, boolean z) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z);
        }
        ArrayList<ah> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            ah ahVar = arrayList.get(i2);
            if (ahVar == null) {
                return null;
            }
            if (ahVar.b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.mEndValuesList : this.mStartValuesList).get(i);
    }

    public String getName() {
        return this.mName;
    }

    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    public af getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public ah getTransitionValues(View view, boolean z) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).f1278a.get(view);
    }

    public boolean isTransitionRequired(ah ahVar, ah ahVar2) {
        if (ahVar != null && ahVar2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(ahVar, ahVar2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : ahVar.f1277a.keySet()) {
                    if (isValueChanged(ahVar, ahVar2, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isValidTarget(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.mTargetExcludes;
            if (arrayList4 != null && arrayList4.contains(view)) {
                return false;
            }
            ArrayList<Class> arrayList5 = this.mTargetTypeExcludes;
            if (arrayList5 != null) {
                int size = arrayList5.size();
                for (int i = 0; i < size; i++) {
                    if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                        return false;
                    }
                }
            }
            if (this.mTargetNameExcludes != null && ViewCompat.getTransitionName(view) != null && this.mTargetNameExcludes.contains(ViewCompat.getTransitionName(view))) {
                return false;
            }
            if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
                return true;
            }
            ArrayList<String> arrayList6 = this.mTargetNames;
            if (arrayList6 != null && arrayList6.contains(ViewCompat.getTransitionName(view))) {
                return true;
            }
            if (this.mTargetTypes != null) {
                for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                    if (this.mTargetTypes.get(i2).isInstance(view)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public void pause(View view) {
        if (!this.mEnded) {
            ArrayMap<Animator, a> runningAnimators = getRunningAnimators();
            int size = runningAnimators.size();
            bd b2 = at.b(view);
            for (int i = size - 1; i >= 0; i--) {
                a valueAt = runningAnimators.valueAt(i);
                if (valueAt.f1261a != null && b2.equals(valueAt.d)) {
                    android.support.transition.c.a(runningAnimators.keyAt(i));
                }
            }
            ArrayList<d> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((d) arrayList2.get(i2)).c(this);
                }
            }
            this.mPaused = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void playTransition(ViewGroup viewGroup) {
        a aVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        ArrayMap<Animator, a> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        bd b2 = at.b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator keyAt = runningAnimators.keyAt(i);
            if (keyAt != null && (aVar = runningAnimators.get(keyAt)) != null && aVar.f1261a != null && b2.equals(aVar.d)) {
                ah ahVar = aVar.c;
                View view = aVar.f1261a;
                ah transitionValues = getTransitionValues(view, true);
                ah matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (!(transitionValues == null && matchedTransitionValues == null) && aVar.e.isTransitionRequired(ahVar, matchedTransitionValues)) {
                    if (keyAt.isRunning() || keyAt.isStarted()) {
                        keyAt.cancel();
                    } else {
                        runningAnimators.remove(keyAt);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public Transition removeListener(d dVar) {
        ArrayList<d> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public Transition removeTarget(int i) {
        if (i > 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public Transition removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public Transition removeTarget(Class cls) {
        ArrayList<Class> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public Transition removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                ArrayMap<Animator, a> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                bd b2 = at.b(view);
                for (int i = size - 1; i >= 0; i--) {
                    a valueAt = runningAnimators.valueAt(i);
                    if (valueAt.f1261a != null && b2.equals(valueAt.d)) {
                        android.support.transition.c.b(runningAnimators.keyAt(i));
                    }
                }
                ArrayList<d> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((d) arrayList2.get(i2)).d(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void runAnimators() {
        start();
        ArrayMap<Animator, a> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public Transition setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(c cVar) {
        this.mEpicenterCallback = cVar;
    }

    public Transition setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!isValidMatch(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public void setPropagation(af afVar) {
        this.mPropagation = afVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Transition setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    public Transition setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<d> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).e(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ResponseProtocolType.COMMENT;
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.mTargetIds.size() > 0) {
                String str4 = str3;
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        str4 = str4 + ", ";
                    }
                    str4 = str4 + this.mTargetIds.get(i);
                }
                str3 = str4;
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.mTargets.get(i2);
                }
            }
            return str3 + riy.BRACKET_END_STR;
        }
        return str2;
    }
}
