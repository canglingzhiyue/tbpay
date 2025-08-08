package com.taobao.android.taopai.charge.data;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.izk;
import tb.kge;

/* loaded from: classes6.dex */
public class TpChargeBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String billId;
    private String bizLine;
    private String bizScene;
    private Map<String, String> detailMap;
    private final Map<String, String> extendMap;
    private String funId;
    private List<String> materialIdList;

    static {
        kge.a(1003090160);
        kge.a(1028243835);
    }

    public TpChargeBean() {
        this.extendMap = new HashMap();
    }

    public List<String> getMaterialIdList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("79f8a1ca", new Object[]{this}) : this.materialIdList;
    }

    public String getFunId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3a308835", new Object[]{this}) : this.funId;
    }

    public String getBizScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e69425aa", new Object[]{this}) : this.bizScene;
    }

    public String getBizLine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26095428", new Object[]{this}) : this.bizLine;
    }

    public String getBillId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba747f81", new Object[]{this}) : this.billId;
    }

    public Map<String, String> getDetailMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("719cdbd1", new Object[]{this}) : this.detailMap;
    }

    public Map<String, String> getExtendMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("fcdf7ca8", new Object[]{this}) : this.extendMap;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (this.materialIdList != null) {
            sb.append("materialIdList = ");
            Iterator<String> it = this.materialIdList.iterator();
            while (it.hasNext()) {
                sb.append(it.next() + "; ");
            }
        }
        if (this.materialIdList != null) {
            sb.append("materialIdList = ");
            Iterator<String> it2 = this.materialIdList.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next() + "; ");
            }
        }
        if (this.detailMap != null) {
            sb.append("detailMap = ");
            for (String str : this.detailMap.keySet()) {
                sb.append(str + " = " + this.detailMap.get(str) + ";");
            }
        }
        if (this.extendMap != null) {
            sb.append("extendMap = ");
            for (String str2 : this.extendMap.keySet()) {
                sb.append(str2 + " = " + this.extendMap.get(str2) + ";");
            }
        }
        return "billId='" + this.billId + "', funId='" + this.funId + "', bizLine='" + this.bizLine + "', bizScene='" + this.bizScene + '\'' + sb.toString() + '}';
    }

    private TpChargeBean(a aVar) {
        this.extendMap = new HashMap();
        this.billId = izk.a();
        this.funId = a.a(aVar);
        this.bizLine = a.b(aVar);
        this.bizScene = a.c(aVar);
        this.detailMap = a.d(aVar);
        this.materialIdList = a.e(aVar);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f15319a;
        private Map<String, String> b = new HashMap();
        private List<String> c = new ArrayList();
        private String d = izk.c();
        private String e = izk.b();

        static {
            kge.a(-1750542393);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("400e3cd6", new Object[]{aVar}) : aVar.f15319a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("82256a35", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c43c9794", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ Map d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("65f35ac2", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ List e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("72de9479", new Object[]{aVar}) : aVar.c;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f71ab906", new Object[]{this, str});
            }
            this.f15319a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3931e665", new Object[]{this, str});
            }
            this.b.put("contentType", str);
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7b4913c4", new Object[]{this, str});
            }
            this.b.put("compositeAmount", str);
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bd604123", new Object[]{this, str});
            }
            this.b.put("toolCount", str);
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ff776e82", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("418e9be1", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("83a5c940", new Object[]{this, str});
            }
            this.c.add(str);
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1b0d4ffb", new Object[]{this, map});
            }
            this.b = map;
            return this;
        }

        public a a(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("38fc463f", new Object[]{this, list});
            }
            if (list == null) {
                throw new IllegalArgumentException("params is null");
            }
            this.c.addAll(list);
            return this;
        }

        public TpChargeBean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TpChargeBean) ipChange.ipc$dispatch("6f30f02d", new Object[]{this});
            }
            if (StringUtils.isEmpty(this.f15319a)) {
                throw new IllegalArgumentException("funId is null");
            }
            return new TpChargeBean(this);
        }
    }
}
