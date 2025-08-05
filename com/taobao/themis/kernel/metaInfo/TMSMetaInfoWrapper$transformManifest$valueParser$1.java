package com.taobao.themis.kernel.metaInfo;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.utils.i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.rul;

/* loaded from: classes9.dex */
public final class TMSMetaInfoWrapper$transformManifest$valueParser$1 extends Lambda implements rul<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ i.a $baseInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSMetaInfoWrapper$transformManifest$valueParser$1(i.a aVar) {
        super(1);
        this.$baseInfo = aVar;
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String mo2421invoke(String valueTemplateExpr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bed32b7", new Object[]{this, valueTemplateExpr});
        }
        q.d(valueTemplateExpr, "valueTemplateExpr");
        int hashCode = valueTemplateExpr.hashCode();
        if (hashCode != -1305662344) {
            if (hashCode != -282952263 || !valueTemplateExpr.equals("${navigationUrl}")) {
                return null;
            }
            return this.$baseInfo.d();
        } else if (!valueTemplateExpr.equals("${appId}")) {
            return null;
        } else {
            return this.$baseInfo.b();
        }
    }
}
