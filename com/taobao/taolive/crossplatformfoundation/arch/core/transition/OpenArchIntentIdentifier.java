package com.taobao.taolive.crossplatformfoundation.arch.core.transition;

import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/transition/OpenArchIntentIdentifier;", "", "code", "", "<init>", "(Ljava/lang/String;IS)V", "getCode", "()S", a.ATOM_EXT_Undefined, "LifeCycleIntent_WhenWatchComponentCreate", "LifeCycleIntent_WhenSingleComponentCreate", "LifeCycleIntent_WhenWatchComponentDidAppear", "LifeCycleIntent_WhenSingleComponentDidAppear", "LifeCycleIntent_WhenWatchComponentDidDisappear", "LifeCycleIntent_WhenSingleComponentDidDisappear", "LifeCycleIntent_WhenWatchComponentDestroy", "LifeCycleIntent_WhenSingleComponentDestroy", "LifeCycleIntent_WhenWatchComponentWillAppear", "LifeCycleIntent_WhenSingleComponentWillAppear", "LifeCycleIntent_WhenWatchComponentWillDisappear", "LifeCycleIntent_WhenSingleComponentWillDisappear", "LifeCycleIntent_WhenWatchComponentStartTransition", "LifeCycleIntent_WhenSingleComponentStartTransition", "LifeCycleIntent_WhenWatchComponentSwipeAnimationEnd", "LifeCycleIntent_WhenSingleComponentSwipeAnimationEnd", "LifeCycleIntent_WhenWatchComponentSwipeAnimationStart", "LifeCycleIntent_WhenSingleComponentSwipeAnimationStart", "LifeCycleIntent_WhenWatchComponentBack", "LifeCycleIntent_WhenSingleComponentBack", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchIntentIdentifier extends Enum<OpenArchIntentIdentifier> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OpenArchIntentIdentifier[] $VALUES;
    private final short code;
    public static final OpenArchIntentIdentifier Undefined = new OpenArchIntentIdentifier(a.ATOM_EXT_Undefined, 0, 0);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentCreate = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentCreate", 1, 1);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentCreate = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentCreate", 2, 2);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentDidAppear = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentDidAppear", 3, 3);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentDidAppear = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentDidAppear", 4, 4);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentDidDisappear = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentDidDisappear", 5, 5);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentDidDisappear = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentDidDisappear", 6, 6);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentDestroy = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentDestroy", 7, 7);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentDestroy = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentDestroy", 8, 8);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentWillAppear = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentWillAppear", 9, 9);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentWillAppear = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentWillAppear", 10, 10);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentWillDisappear = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentWillDisappear", 11, 11);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentWillDisappear = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentWillDisappear", 12, 12);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentStartTransition = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentStartTransition", 13, 13);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentStartTransition = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentStartTransition", 14, 14);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentSwipeAnimationEnd = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentSwipeAnimationEnd", 15, 15);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentSwipeAnimationEnd = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentSwipeAnimationEnd", 16, 16);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentSwipeAnimationStart = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentSwipeAnimationStart", 17, 17);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentSwipeAnimationStart = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentSwipeAnimationStart", 18, 18);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenWatchComponentBack = new OpenArchIntentIdentifier("LifeCycleIntent_WhenWatchComponentBack", 19, 19);
    public static final OpenArchIntentIdentifier LifeCycleIntent_WhenSingleComponentBack = new OpenArchIntentIdentifier("LifeCycleIntent_WhenSingleComponentBack", 20, 20);

    private static final /* synthetic */ OpenArchIntentIdentifier[] $values() {
        return new OpenArchIntentIdentifier[]{Undefined, LifeCycleIntent_WhenWatchComponentCreate, LifeCycleIntent_WhenSingleComponentCreate, LifeCycleIntent_WhenWatchComponentDidAppear, LifeCycleIntent_WhenSingleComponentDidAppear, LifeCycleIntent_WhenWatchComponentDidDisappear, LifeCycleIntent_WhenSingleComponentDidDisappear, LifeCycleIntent_WhenWatchComponentDestroy, LifeCycleIntent_WhenSingleComponentDestroy, LifeCycleIntent_WhenWatchComponentWillAppear, LifeCycleIntent_WhenSingleComponentWillAppear, LifeCycleIntent_WhenWatchComponentWillDisappear, LifeCycleIntent_WhenSingleComponentWillDisappear, LifeCycleIntent_WhenWatchComponentStartTransition, LifeCycleIntent_WhenSingleComponentStartTransition, LifeCycleIntent_WhenWatchComponentSwipeAnimationEnd, LifeCycleIntent_WhenSingleComponentSwipeAnimationEnd, LifeCycleIntent_WhenWatchComponentSwipeAnimationStart, LifeCycleIntent_WhenSingleComponentSwipeAnimationStart, LifeCycleIntent_WhenWatchComponentBack, LifeCycleIntent_WhenSingleComponentBack};
    }

    static {
        OpenArchIntentIdentifier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OpenArchIntentIdentifier(String str, int i, short s) {
        this.code = s;
    }

    public static kotlin.enums.a<OpenArchIntentIdentifier> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchIntentIdentifier valueOf(String str) {
        return (OpenArchIntentIdentifier) Enum.valueOf(OpenArchIntentIdentifier.class, str);
    }

    public static OpenArchIntentIdentifier[] values() {
        return (OpenArchIntentIdentifier[]) $VALUES.clone();
    }

    public final short getCode() {
        return this.code;
    }
}
