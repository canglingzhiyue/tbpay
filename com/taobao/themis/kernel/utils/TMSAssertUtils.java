package com.taobao.themis.kernel.utils;

import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0087\bø\u0001\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSAssertUtils;", "", "()V", "ENABLE_ASSERT", "", "assertJava", "", "condition", "message", "", "assertKt", "func", "Lkotlin/Function0;", "TMSAssertError", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSAssertUtils {
    public static final boolean ENABLE_ASSERT = false;
    public static final TMSAssertUtils INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSAssertUtils$TMSAssertError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", "", "(Ljava/lang/String;)V", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class TMSAssertError extends Error {
        static {
            kge.a(-574835647);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TMSAssertError(String message) {
            super(message);
            kotlin.jvm.internal.q.d(message, "message");
        }
    }

    static {
        kge.a(843539083);
        INSTANCE = new TMSAssertUtils();
    }

    private TMSAssertUtils() {
    }
}
