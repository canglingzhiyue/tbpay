package com.taobao.message.sp.framework.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u0007H\u0007¢\u0006\u0002\u0010\u000eR*\u0010\u0003\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/message/sp/framework/service/SimpleServiceFactory;", "", "()V", "serviceHolder", "", "Lkotlin/Pair;", "", "Ljava/lang/Class;", "Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "obtain", "T", "identifier", "channelType", "serviceClazz", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleServiceFactory INSTANCE;
    private static final Map<Pair<String, Class<?>>, ISimpleDataService> serviceHolder;

    static {
        kge.a(351968937);
        INSTANCE = new SimpleServiceFactory();
        serviceHolder = new LinkedHashMap();
    }

    private SimpleServiceFactory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends com.taobao.message.sp.framework.service.ISimpleDataService> T obtain(java.lang.String r4, java.lang.String r5, java.lang.Class<T> r6) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.sp.framework.service.SimpleServiceFactory.obtain(java.lang.String, java.lang.String, java.lang.Class):com.taobao.message.sp.framework.service.ISimpleDataService");
    }
}
