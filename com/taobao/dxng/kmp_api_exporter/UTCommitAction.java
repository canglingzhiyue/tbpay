package com.taobao.dxng.kmp_api_exporter;

import com.taobao.orange.model.NameSpaceDO;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/dxng/kmp_api_exporter/UTCommitAction;", "", "<init>", "(Ljava/lang/String;I)V", "CLICK", "COMPONENTEXPOSURE", "PAGEEXPOSURE", NameSpaceDO.TYPE_CUSTOM, "kmp_api_exporter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UTCommitAction extends Enum<UTCommitAction> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UTCommitAction[] $VALUES;
    public static final UTCommitAction CLICK = new UTCommitAction("CLICK", 0);
    public static final UTCommitAction COMPONENTEXPOSURE = new UTCommitAction("COMPONENTEXPOSURE", 1);
    public static final UTCommitAction PAGEEXPOSURE = new UTCommitAction("PAGEEXPOSURE", 2);
    public static final UTCommitAction CUSTOM = new UTCommitAction(NameSpaceDO.TYPE_CUSTOM, 3);

    private static final /* synthetic */ UTCommitAction[] $values() {
        return new UTCommitAction[]{CLICK, COMPONENTEXPOSURE, PAGEEXPOSURE, CUSTOM};
    }

    static {
        UTCommitAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UTCommitAction(String str, int i) {
    }

    public static a<UTCommitAction> getEntries() {
        return $ENTRIES;
    }

    public static UTCommitAction valueOf(String str) {
        return (UTCommitAction) Enum.valueOf(UTCommitAction.class, str);
    }

    public static UTCommitAction[] values() {
        return (UTCommitAction[]) $VALUES.clone();
    }
}
