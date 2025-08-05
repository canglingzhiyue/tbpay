package com.etao.feimagesearch.capture.dynamic.templates;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class PltTemplatesManager$fetchTemplatesInfoFromCloud$1$1 extends Lambda implements rul<Map<String, a>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PltTemplatesManager$fetchTemplatesInfoFromCloud$1$1 INSTANCE = new PltTemplatesManager$fetchTemplatesInfoFromCloud$1$1();

    public PltTemplatesManager$fetchTemplatesInfoFromCloud$1$1() {
        super(1);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Map<String, a> map) {
        invoke2(map);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, a> templatesMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, templatesMap});
            return;
        }
        q.c(templatesMap, "templatesMap");
        for (Map.Entry<String, a> entry : templatesMap.entrySet()) {
            a value = entry.getValue();
            if (!TextUtils.isEmpty(value.b())) {
                TLogTracker.b("PltTemplateManager", "fetch success", "key:" + value.a() + ", template: " + value.b());
                b.a(b.INSTANCE, value.b(), value.c());
            }
        }
    }
}
