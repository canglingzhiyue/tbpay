package com.taobao.homepage.pop.view.container.main;

import android.content.Context;
import android.graphics.Color;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import tb.kyu;
import tb.lak;

/* loaded from: classes7.dex */
public class MainHierarchyPopContainer extends BasePopContainer {
    public MainHierarchyPopContainer(Context context, lak lakVar, int i, kyu kyuVar) {
        super(context, lakVar, i, kyuVar);
        this.mPopTrigger = new b(this, lakVar, kyuVar);
        if (c.a()) {
            setBackgroundColor(Color.parseColor("#ccffeedd"));
        }
    }
}
