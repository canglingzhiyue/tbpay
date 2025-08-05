package com.taobao.tao.alipay.cashdesk;

import android.content.Intent;
import com.alipay.android.msp.constants.MspGlobalDefine;
import tb.riy;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f19834a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    public b(Intent intent) {
        try {
            this.f19834a = intent.getStringExtra("resultStatus");
            this.b = intent.getStringExtra("memo");
            this.c = intent.getStringExtra("result");
            this.d = intent.getStringExtra(MspGlobalDefine.OPEN_TIME);
            this.h = intent.getStringExtra("renderTime");
            this.g = intent.getStringExtra(MspGlobalDefine.EXTENDINFO);
            this.e = "{\"result\":\"" + this.c + "\",\"memo\":\"" + this.b + "\",\"extendIndo\":\"" + this.g + "\",\"ResultStatus\":\"" + this.f19834a + "\"" + riy.BLOCK_END_STR;
        } catch (Exception e) {
            b.class.getSimpleName();
            String str = "Result parse error!=" + e.getMessage();
        }
    }
}
