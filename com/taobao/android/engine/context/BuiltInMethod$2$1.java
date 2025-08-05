package com.taobao.android.engine.context;

import com.taobao.android.engine.context.a;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class BuiltInMethod$2$1 extends ArrayList<Object> {
    public final /* synthetic */ a.AnonymousClass1 this$0;
    public final /* synthetic */ com.taobao.android.engine.expression.a val$valueLeft;
    public final /* synthetic */ com.taobao.android.engine.expression.a val$valueRight;

    public BuiltInMethod$2$1(a.AnonymousClass1 anonymousClass1, com.taobao.android.engine.expression.a aVar, com.taobao.android.engine.expression.a aVar2) {
        this.this$0 = anonymousClass1;
        this.val$valueLeft = aVar;
        this.val$valueRight = aVar2;
        add(this.val$valueLeft.a());
        add(this.val$valueRight.a());
    }
}
