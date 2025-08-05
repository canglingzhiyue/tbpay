package com.taobao.android.engine.context;

import com.taobao.android.engine.context.a;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class BuiltInMethod$3$1 extends ArrayList<Object> {
    public final /* synthetic */ a.AnonymousClass2 this$0;
    public final /* synthetic */ com.taobao.android.engine.expression.a val$valueLeft;
    public final /* synthetic */ com.taobao.android.engine.expression.a val$valueRight;

    public BuiltInMethod$3$1(a.AnonymousClass2 anonymousClass2, com.taobao.android.engine.expression.a aVar, com.taobao.android.engine.expression.a aVar2) {
        this.this$0 = anonymousClass2;
        this.val$valueLeft = aVar;
        this.val$valueRight = aVar2;
        add(this.val$valueLeft.a());
        add(this.val$valueRight.a());
    }
}
