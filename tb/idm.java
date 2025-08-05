package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class idm extends idl<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f28935a = new a();
    private boolean b = false;

    static {
        kge.a(-534934509);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb.idm$a] */
    @Override // tb.idl
    public /* synthetic */ a a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ff610946", new Object[]{this, new Boolean(z)}) : b(z);
    }

    public static Map<Long, fut> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Long.valueOf(fxa.a(bdl.PARSER_TAG)), new bdl());
        hashMap.put(Long.valueOf((long) bda.DX_PARSER_CARTCURRENTFILTERITEM), new bda());
        hashMap.put(Long.valueOf((long) bcy.DX_PARSER_ARRAY_SUB), new bcy());
        hashMap.put(6742876832553239298L, new bcx());
        hashMap.put(Long.valueOf((long) bdg.DX_PARSER_CARTPRICESPLIT), new bdg());
        hashMap.put(Long.valueOf((long) bdk.DX_PARSER_ISSHOWCALCULATEBTN), new bdk());
        hashMap.put(Long.valueOf((long) bdj.DX_PARSER_ISCUSTOMBUNDLE), new bdj());
        hashMap.put(Long.valueOf((long) bdd.DX_PARSER_CARTISPOPLAYERFILTERING), new bdd());
        hashMap.put(Long.valueOf((long) bdf.DX_PARSER_CARTMODE), new bdf());
        hashMap.put(Long.valueOf((long) bcz.DX_PARSER_CARTCHECKKEEPBUBBLESHOW), new bcz());
        hashMap.put(Long.valueOf((long) bdi.DX_PARSER_CARTSWIPEITEMS), new bdi());
        hashMap.put(Long.valueOf((long) bde.DX_PARSER_CARTMAPUTILS), new bde());
        hashMap.put(Long.valueOf((long) bdc.DX_PARSER_CARTGROUPCONTEXT), new bdc());
        hashMap.put(Long.valueOf((long) bdb.DX_PARSER_CARTFILTERCHECKOPTIMIZE), new bdb());
        hashMap.put(Long.valueOf((long) bdh.DX_PARSER_CARTSHOWSUBMITCHECK), new bdh());
        return hashMap;
    }

    @Override // tb.idl
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f28935a.a("gradient", new bmj());
        this.f28935a.a("theme", new bml());
        this.f28935a.a("platform", new bmk());
        for (Map.Entry<Long, fut> entry : b().entrySet()) {
            this.f28935a.a(entry.getKey().longValue(), entry.getValue());
        }
        this.f28935a.a(fxa.a(bms.PARSER_TAG), new bms());
        this.f28935a.a(fxa.a(bmr.PARSER_TAG), new bmr());
        this.f28935a.a(fxa.a("theme"), new bmt());
        this.b = true;
    }

    public a b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b58ec70c", new Object[]{this, new Boolean(z)});
        }
        if (hoo.d()) {
            bed.a("hitDXDataParserPreload", this.b ? "命中" : "未命中", this.b, 0.001f);
        }
        if (this.b) {
            return this.f28935a;
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<Long, fut> f28936a = new HashMap();
        public final Map<String, fnl> b = new HashMap();

        static {
            kge.a(1859481250);
        }

        public void a(long j, fut futVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("926eae27", new Object[]{this, new Long(j), futVar});
            } else {
                this.f28936a.put(Long.valueOf(j), futVar);
            }
        }

        public void a(String str, fnl fnlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28cde57e", new Object[]{this, str, fnlVar});
            } else {
                this.b.put(str, fnlVar);
            }
        }
    }
}
