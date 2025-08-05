package tb;

import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.e;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.mto;

/* loaded from: classes6.dex */
public class iaj extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_TAG_FAIL = "fail";
    public static final String NEXT_TAG_SUCESS = "success";
    private boolean n;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f28875a = new ArrayList();
    private Map<String, Object> b = new HashMap();
    private int l = 0;
    private int m = 0;
    private HashSet<String> o = new HashSet<>();
    private double p = mto.a.GEO_NOT_SUPPORT;

    static {
        kge.a(-1410340632);
    }

    public static /* synthetic */ Object ipc$super(iaj iajVar, String str, Object... objArr) {
        if (str.hashCode() == -286468875) {
            super.a((List) objArr[0], objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-1143857877083333920";
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    @Override // com.alibaba.android.ultron.event.ext.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.alibaba.android.ultron.event.base.e r21) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iaj.d(com.alibaba.android.ultron.event.base.e):void");
    }

    private JSONObject a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5496e366", new Object[]{this, str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.Name.CHECKED, (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        if (str2.length() > 0) {
            jSONObject2.put("doPayIds", (Object) str2);
            jSONObject2.put("unionPayIds", (Object) str3);
        } else {
            jSONObject2.put("doPayIds", (Object) null);
            jSONObject2.put("unionPayIds", (Object) null);
        }
        jSONObject2.put("orderCount", (Object) String.valueOf(this.l));
        jSONObject2.put("itemCount", (Object) String.valueOf(this.m));
        jSONObject2.put("isRelatedPayFinal", (Object) (this.n + ""));
        jSONObject2.put("isInstallmentsFinal", (Object) ((this.o.isEmpty() ^ true) + ""));
        jSONObject2.put("totalFee", (Object) String.valueOf(this.p));
        if (!this.b.isEmpty()) {
            jSONObject2.put("payParams", (Object) new JSONObject(this.b).toString());
        }
        jSONObject.put("batchPayData", (Object) jSONObject2);
        return jSONObject;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(List<IDMComponent> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeecd4f5", new Object[]{this, list, obj});
            return;
        }
        super.a(list, obj);
        if (e.EVENT_LOAD_SUCCESS.equals(obj)) {
            return;
        }
        this.f28875a.clear();
        this.o.clear();
        this.b.clear();
        this.l = 0;
        this.n = false;
        this.m = 0;
        this.p = mto.a.GEO_NOT_SUPPORT;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if ("true".equals(str2)) {
            if (!this.f28875a.contains(str)) {
                this.f28875a.add(str);
            }
        } else if (this.f28875a.contains(str)) {
            this.f28875a.remove(str);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str3 : this.f28875a) {
            stringBuffer.append(str3);
            stringBuffer.append(",");
        }
        if (stringBuffer.toString().endsWith(",")) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }
}
