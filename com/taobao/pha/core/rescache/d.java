package com.taobao.pha.core.rescache;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.nfh;
import tb.ngd;
import tb.nge;
import tb.ngm;
import tb.ngn;
import tb.ngs;

/* loaded from: classes7.dex */
public class d implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18783a;

    /* loaded from: classes7.dex */
    public static class a extends ngm {

        /* renamed from: a  reason: collision with root package name */
        public String f18784a;

        static {
            kge.a(69291042);
        }

        public a(String str, String str2, InputStream inputStream) {
            super(str, str2, inputStream);
        }
    }

    static {
        kge.a(532073879);
        kge.a(-96877230);
    }

    @Override // com.taobao.pha.core.rescache.c
    public /* synthetic */ nge a(ngd ngdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nge) ipChange.ipc$dispatch("b9283c6d", new Object[]{this, ngdVar}) : b(ngdVar);
    }

    public d(boolean z) {
        this.f18783a = z;
    }

    public a b(ngd ngdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5365660c", new Object[]{this, ngdVar});
        }
        Uri a2 = ngdVar.a();
        if (a2 == null) {
            return null;
        }
        String a3 = a(a2.toString(), ngdVar.c());
        if (StringUtils.isEmpty(a3)) {
            return null;
        }
        a aVar = new a(f.a(a2), null, new ByteArrayInputStream(a3.getBytes()));
        HashMap hashMap = new HashMap();
        hashMap.put(c.HEADER_ACAO, "*");
        aVar.a(hashMap);
        aVar.f18784a = a3;
        return aVar;
    }

    private String a(String str, Map<String, String> map) {
        byte[] c;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        nfh a2 = ngs.a(str, "GET", map);
        if (a2 == null || a2.d() == null || a2.a() != 200 || (c = a2.c()) == null) {
            return null;
        }
        if (this.f18783a) {
            Iterator<Map.Entry<String, List<String>>> it = a2.d().entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    list = null;
                    break;
                }
                Map.Entry<String, List<String>> next = it.next();
                if (next != null && HttpConstant.Content_MD52.equalsIgnoreCase(next.getKey())) {
                    list = next.getValue();
                    break;
                }
            }
            if (list == null || list.isEmpty()) {
                return null;
            }
            String str2 = list.get(0);
            if (StringUtils.isEmpty(str2) || !StringUtils.equals(str2, ngn.a(c))) {
                return null;
            }
            return new String(c);
        }
        return new String(c);
    }
}
