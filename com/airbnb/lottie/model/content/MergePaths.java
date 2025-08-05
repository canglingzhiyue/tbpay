package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.agw;
import tb.akh;

/* loaded from: classes2.dex */
public class MergePaths implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1753a;
    private final MergePathsMode b;
    private final boolean c;

    /* loaded from: classes2.dex */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f1753a = str;
        this.b = mergePathsMode;
        this.c = z;
    }

    public String a() {
        return this.f1753a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        if (!lottieDrawable.c()) {
            akh.c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new agw(this);
    }

    public MergePathsMode b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
