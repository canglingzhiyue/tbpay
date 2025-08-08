package com.etao.feimagesearch.capture.dynamic.templates;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.templates.b;
import com.taobao.android.searchbaseframe.roman.c;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.com;
import tb.ruw;

/* loaded from: classes3.dex */
public final class PltTemplatesManager$fetchTemplatesInfoFromCloud$1$2 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PltTemplatesManager$fetchTemplatesInfoFromCloud$1$2(b.a aVar) {
        super(2);
        this.this$0 = aVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(Integer num, String str) {
        invoke2(num, str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num, String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795a6ae2", new Object[]{this, num, str});
            return;
        }
        TLogTracker.b("PltTemplateManager", "fetch failure", "errCode:" + num + ", errMsg: " + str);
        for (String str2 : this.this$0.f6574a) {
            if (!StringUtils.isEmpty(str2)) {
                b.a(b.INSTANCE, c.a().a(str2, com.h()), (JSONObject) null);
            }
        }
    }
}
