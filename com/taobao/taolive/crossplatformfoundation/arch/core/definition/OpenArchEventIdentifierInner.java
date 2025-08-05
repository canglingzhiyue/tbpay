package com.taobao.taolive.crossplatformfoundation.arch.core.definition;

import com.etao.feimagesearch.pipline.NodeType;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/definition/OpenArchEventIdentifierInner;", "", "code", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/definition/OpenArchEventIdentifier;", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Ljava/lang/String;", NodeType.NODE_INVALID, "Any", "DetailResponseComing", "ComponentListComing", "WhenSingleComponentWillDisappear", "WhenSingleComponentWillAppear", "WhenSingleComponentDidDisappear", "WhenSingleComponentDidAppear", "WhenWatchComponentWillAppear", "WhenWatchComponentDidAppear", "WhenWatchComponentDidDisappear", "WhenWatchComponentWillDisappear", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchEventIdentifierInner extends Enum<OpenArchEventIdentifierInner> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OpenArchEventIdentifierInner[] $VALUES;
    private final String code;
    public static final OpenArchEventIdentifierInner Invalid = new OpenArchEventIdentifierInner(NodeType.NODE_INVALID, 0, NodeType.NODE_INVALID);
    public static final OpenArchEventIdentifierInner Any = new OpenArchEventIdentifierInner("Any", 1, "Any");
    public static final OpenArchEventIdentifierInner DetailResponseComing = new OpenArchEventIdentifierInner("DetailResponseComing", 2, "Detail Response Coming");
    public static final OpenArchEventIdentifierInner ComponentListComing = new OpenArchEventIdentifierInner("ComponentListComing", 3, "Component List Coming");
    public static final OpenArchEventIdentifierInner WhenSingleComponentWillDisappear = new OpenArchEventIdentifierInner("WhenSingleComponentWillDisappear", 4, "WhenSingleComponentWillDisappear");
    public static final OpenArchEventIdentifierInner WhenSingleComponentWillAppear = new OpenArchEventIdentifierInner("WhenSingleComponentWillAppear", 5, "WhenSingleComponentWillAppear");
    public static final OpenArchEventIdentifierInner WhenSingleComponentDidDisappear = new OpenArchEventIdentifierInner("WhenSingleComponentDidDisappear", 6, "WhenSingleComponentDidDisappear");
    public static final OpenArchEventIdentifierInner WhenSingleComponentDidAppear = new OpenArchEventIdentifierInner("WhenSingleComponentDidAppear", 7, "WhenSingleComponentDidAppear");
    public static final OpenArchEventIdentifierInner WhenWatchComponentWillAppear = new OpenArchEventIdentifierInner("WhenWatchComponentWillAppear", 8, "WhenWatchComponentWillAppear");
    public static final OpenArchEventIdentifierInner WhenWatchComponentDidAppear = new OpenArchEventIdentifierInner("WhenWatchComponentDidAppear", 9, "WhenWatchComponentDidAppear");
    public static final OpenArchEventIdentifierInner WhenWatchComponentDidDisappear = new OpenArchEventIdentifierInner("WhenWatchComponentDidDisappear", 10, "WhenWatchComponentDidDisappear");
    public static final OpenArchEventIdentifierInner WhenWatchComponentWillDisappear = new OpenArchEventIdentifierInner("WhenWatchComponentWillDisappear", 11, "WhenWatchComponentWillDisappear");

    private static final /* synthetic */ OpenArchEventIdentifierInner[] $values() {
        return new OpenArchEventIdentifierInner[]{Invalid, Any, DetailResponseComing, ComponentListComing, WhenSingleComponentWillDisappear, WhenSingleComponentWillAppear, WhenSingleComponentDidDisappear, WhenSingleComponentDidAppear, WhenWatchComponentWillAppear, WhenWatchComponentDidAppear, WhenWatchComponentDidDisappear, WhenWatchComponentWillDisappear};
    }

    static {
        OpenArchEventIdentifierInner[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OpenArchEventIdentifierInner(String str, int i, String str2) {
        this.code = str2;
    }

    public static a<OpenArchEventIdentifierInner> getEntries() {
        return $ENTRIES;
    }

    public static OpenArchEventIdentifierInner valueOf(String str) {
        return (OpenArchEventIdentifierInner) Enum.valueOf(OpenArchEventIdentifierInner.class, str);
    }

    public static OpenArchEventIdentifierInner[] values() {
        return (OpenArchEventIdentifierInner[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
