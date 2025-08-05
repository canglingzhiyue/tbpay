package com.taobao.android.engine.expression.parser;

import java.util.ArrayList;
import tb.ghq;

/* loaded from: classes5.dex */
public class ExpressionParser$1 extends ArrayList<Object> {
    public final /* synthetic */ a this$0;
    public final /* synthetic */ ghq val$left;
    public final /* synthetic */ com.taobao.android.engine.expression.operator.a val$op;
    public final /* synthetic */ ghq val$right;

    public ExpressionParser$1(a aVar, ghq ghqVar, com.taobao.android.engine.expression.operator.a aVar2, ghq ghqVar2) {
        this.this$0 = aVar;
        this.val$left = ghqVar;
        this.val$op = aVar2;
        this.val$right = ghqVar2;
        add(this.val$left);
        add(this.val$op);
        add(this.val$right);
    }
}
